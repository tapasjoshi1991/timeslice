package com.gspann.timeslice.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 
 * @author Tapas Ranjan Joshi
 *
 */
@Entity
@Table(name="events_date")
public class EventDate {
	
	@Id
	private long dateId;
	private Date date;
	private int weekOfYear;
	private int weekOfMonth;
	private long monthId;
	private String monthName;
	private int year;
	
	public long getDateId() {
		System.out.println("Just for testing");
		return dateId;
	}
	public void setDateId(long dateId) {
		this.dateId = dateId;
	}
	@JsonSerialize(using=JsonDataSerializerForEventsDates.class)
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getWeekOfYear() {
		return weekOfYear;
	}
	public void setWeekOfYear(int weekOfYear) {
		this.weekOfYear = weekOfYear;
	}
	public int getWeekOfMonth() {
		return weekOfMonth;
	}
	public void setWeekOfMonth(int weekOfMonth) {
		this.weekOfMonth = weekOfMonth;
	}
	public long getMonthId() {
		return monthId;
	}
	public void setMonthId(long monthId) {
		this.monthId = monthId;
	}
	public String getMonthName() {
		return monthName;
	}
	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	

}
