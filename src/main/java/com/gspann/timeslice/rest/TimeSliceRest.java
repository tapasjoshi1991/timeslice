package com.gspann.timeslice.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gspann.timeslice.bean.Events;
import com.gspann.timeslice.bean.EventsMetricsByMonth;
import com.gspann.timeslice.bean.EventsMetricsByTimeStamp;
import com.gspann.timeslice.service.TimeSliceService;

@RestController
public class TimeSliceRest {
	

	@Autowired
	private TimeSliceService timesliceService;
	
	/**
	 * 
	 * @return ResponseEntity<Iterable<Employee>>
	 */
	@RequestMapping(value = "/events", method = RequestMethod.GET)
	public ResponseEntity<List<Events>> firstPage() {
		return ResponseEntity.ok(timesliceService.getAllEvents());
	}
	
	@RequestMapping(value = "/eventsByMonths/{eventId}", method = RequestMethod.GET)
	public ResponseEntity<List<EventsMetricsByMonth>> getEventsMetricsByMonthByEventId(@PathVariable("eventId") int eventId){
		return ResponseEntity.ok(timesliceService.getEventMetricsByMonthByEventId(eventId));
	}
	
	@RequestMapping(value = "/eventsByTimestamp/{eventId}", method = RequestMethod.GET)
	public ResponseEntity<List<EventsMetricsByTimeStamp>> getEventsMetricsByTimestampByEventId(@PathVariable("eventId") int eventId){
		return ResponseEntity.ok(timesliceService.getEventMetricsByTimestampById(eventId));
	}
	

}
