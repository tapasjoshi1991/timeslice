package com.gspann.timeslice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gspann.timeslice.bean.Events;
import com.gspann.timeslice.bean.EventsMetricsByMonth;
import com.gspann.timeslice.bean.EventsMetricsByTimeStamp;
import com.gspann.timeslice.dao.EventsMetricsByMonthDAO;
import com.gspann.timeslice.dao.EventsRepository;

@Service
public class TimeSliceService {
	
	@Autowired
	private EventsRepository eventsRepository;
	
	@Autowired
	private EventsMetricsByMonthDAO eventsDao;
	
	public List<Events> getAllEvents(){
		return (List<Events>) eventsRepository.findAll();
	}
	
	public List<EventsMetricsByMonth> getEventMetricsByMonthByEventId(int eventId){
		return eventsDao.getEventsMetricsByMonthByEventId(eventId);
	}
	
	public List<EventsMetricsByTimeStamp> getEventMetricsByTimestampById(int eventId){
		return eventsDao.getEventsMetricsByTimestampById(eventId);
	}

}
