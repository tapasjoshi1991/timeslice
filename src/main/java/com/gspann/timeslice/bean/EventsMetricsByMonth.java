package com.gspann.timeslice.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.gspann.timeslice.util.PropertiesUtil;

@Entity
@Table(name="events_by_months")
public class EventsMetricsByMonth {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int eventId;
	private long monthId;
	private long eventMetrics;
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public long getMonthId() {
		return monthId;
	}
	public void setMonthId(long monthId) {
		this.monthId = monthId;
	}
	public long getEventMetrics() {
		return eventMetrics;
	}
	public void setEventMetrics(long eventMetrics) {
		this.eventMetrics = eventMetrics;
	}
	
	

}
