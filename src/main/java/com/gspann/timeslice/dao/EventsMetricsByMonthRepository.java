package com.gspann.timeslice.dao;

import org.springframework.data.repository.CrudRepository;

import com.gspann.timeslice.bean.EventsMetricsByMonth;

public interface EventsMetricsByMonthRepository extends CrudRepository<EventsMetricsByMonth, Integer> {

}
