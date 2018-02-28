package com.gspann.timeslice.dao;

import org.springframework.data.repository.CrudRepository;

import com.gspann.timeslice.bean.EventsMetricsByTimeStamp;

public interface EventsMetricsByTimestampRepository extends CrudRepository<EventsMetricsByTimeStamp, Integer> {

}
