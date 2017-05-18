package com.game.habitCreator.beans;

import java.time.LocalDate;
import java.time.LocalTime;
/**
 * 
 * @author bittu
 *
 */
public class Habit {
	private int SerialNumber;
	private String name;
	private int daysOfChallenge;
	private int daysCompleted;
	private int duration;
	private String remarks;
	private LocalDate startDate;
	private LocalDate endDate;
	private String sequence;
	private LocalTime time;
	/**
	 * @return the serialNumber
	 */
	public int getSerialNumber() {
		return SerialNumber;
	}
	/**
	 * @param serialNumber the serialNumber to set
	 */
	public void setSerialNumber(int serialNumber) {
		SerialNumber = serialNumber;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the daysOfChallenge
	 */
	public int getDaysOfChallenge() {
		return daysOfChallenge;
	}
	/**
	 * @param daysOfChallenge the daysOfChallenge to set
	 */
	public void setDaysOfChallenge(int daysOfChallenge) {
		this.daysOfChallenge = daysOfChallenge;
	}
	/**
	 * @return the daysCompleted
	 */
	public int getDaysCompleted() {
		return daysCompleted;
	}
	/**
	 * @param daysCompleted the daysCompleted to set
	 */
	public void setDaysCompleted(int daysCompleted) {
		this.daysCompleted = daysCompleted;
	}
	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	/**
	 * @return the startDate
	 */
	public LocalDate getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the endDate
	 */
	public LocalDate getEndDate() {
		return endDate;
	}
	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	/**
	 * @return the sequence
	 */
	public String getSequence() {
		return sequence;
	}
	/**
	 * @param sequence the sequence to set
	 */
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	
}
