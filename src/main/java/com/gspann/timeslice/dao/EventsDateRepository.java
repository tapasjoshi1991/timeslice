package com.gspann.timeslice.dao;

import org.springframework.data.repository.CrudRepository;

import com.gspann.timeslice.bean.EventDate;

public interface EventsDateRepository extends CrudRepository<EventDate, Long> {

}
