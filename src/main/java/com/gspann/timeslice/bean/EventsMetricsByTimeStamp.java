package com.gspann.timeslice.bean;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.gspann.timeslice.util.PropertiesUtil;

@Entity
@Table(name="events_by_timestamp")
public class EventsMetricsByTimeStamp {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int eventId;
	private long dateId;
	private Date dateTimeStamp;
	private long eventMetrics;
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public long getDateId() {
		return dateId;
	}
	public void setDateId(long dateId) {
		this.dateId = dateId;
	}
	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getDateTimeStamp() {
		return dateTimeStamp;
	}
	public void setDateTimeStamp(Date dateTimeStamp) {
		this.dateTimeStamp = dateTimeStamp;
	}
	public long getEventMetrics() {
		return eventMetrics;
	}
	public void setEventMetrics(long eventMetrics) {
		this.eventMetrics = eventMetrics;
	}
	
	

}
