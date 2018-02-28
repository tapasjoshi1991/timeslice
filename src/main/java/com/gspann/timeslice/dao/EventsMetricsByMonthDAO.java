package com.gspann.timeslice.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gspann.timeslice.bean.EventsMetricsByMonth;
import com.gspann.timeslice.bean.EventsMetricsByTimeStamp;

@Repository
public interface EventsMetricsByMonthDAO {
	
	public List<EventsMetricsByMonth> getEventsMetricsByMonthByEventId(int eventId);
	public List<EventsMetricsByTimeStamp> getEventsMetricsByTimestampById(int eventId);

}
