package com.gspann.timeslice.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gspann.timeslice.bean.EventsMetricsByMonth;
import com.gspann.timeslice.bean.EventsMetricsByTimeStamp;

@Repository
public class EventsMetricsByMonthDAOImpl implements EventsMetricsByMonthDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(readOnly=true)
	public List<EventsMetricsByMonth> getEventsMetricsByMonthByEventId(int eventId) {
		// TODO Auto-generated method stub
		
		Query query = entityManager.createQuery("select e from EventsMetricsByMonth e where e.eventId=:id");
		query.setParameter("id", eventId);
		List<EventsMetricsByMonth> list = query.getResultList();
		return list;
	}

	@Override
	@Transactional(readOnly=true)
	public List<EventsMetricsByTimeStamp> getEventsMetricsByTimestampById(int eventId) {
		Query query = entityManager.createQuery("select e from EventsMetricsByTimeStamp e where e.eventId=:id");
		query.setParameter("id", eventId);
		List<EventsMetricsByTimeStamp> list = query.getResultList();
		return list;
	}

}
