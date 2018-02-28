package com.gspann.timeslice.dao;

import org.springframework.data.repository.CrudRepository;

import com.gspann.timeslice.bean.Events;

public interface EventsRepository extends CrudRepository<Events, Integer> {

}
