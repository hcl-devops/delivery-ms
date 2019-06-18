package com.delivery.details.model;

import java.io.Serializable;
import java.sql.Time;

/**
 * ItemAvailabilityResponse
 */

public class DeliveryAvailabilityResponse implements Serializable, CalculationResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String itemId;

	private String vehicleType;
	private double unitPrice;
	private String unitPriceUom;
	private String lscCode;
	private String country;
	private String timeSlot;
	private int capacity;
	private String fromNode;
	private String toNode;
	private String orderDate;
	private String startDate;
	private String releaseTime;
	private String processingTime;
	private Time fromTime;
	private Time toTime;
	private double processDays;
	private String cdcReadyTime;
	private int cdcDayNumber;
	private String cdcShipDaySchedule;
	private int lscTransferTime;
	private String lscReadyTime;
	private String lscShipDaySchedule;
	private String homeDeliveryReadyTime;

	public String getHomeDeliveryReadyTime() {
		return homeDeliveryReadyTime;
	}

	public void setHomeDeliveryReadyTime(String homeDeliveryReadyTime) {
		this.homeDeliveryReadyTime = homeDeliveryReadyTime;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getUnitPriceUom() {
		return unitPriceUom;
	}

	public void setUnitPriceUom(String unitPriceUom) {
		this.unitPriceUom = unitPriceUom;
	}

	public String getLscCode() {
		return lscCode;
	}

	public void setLscCode(String lscCode) {
		this.lscCode = lscCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getFromNode() {
		return fromNode;
	}

	public void setFromNode(String fromNode) {
		this.fromNode = fromNode;
	}

	public String getToNode() {
		return toNode;
	}

	public void setToNode(String toNode) {
		this.toNode = toNode;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getReleaseTime() {
		return releaseTime;
	}

	public void setReleaseTime(String releaseTime) {
		this.releaseTime = releaseTime;
	}

	public String getProcessingTime() {
		return processingTime;
	}

	public void setProcessingTime(String processingTime) {
		this.processingTime = processingTime;
	}

	public Time getFromTime() {
		return fromTime;
	}

	public void setFromTime(Time fromTime) {
		this.fromTime = fromTime;
	}

	public Time getToTime() {
		return toTime;
	}

	public void setToTime(Time toTime) {
		this.toTime = toTime;
	}

	public double getProcessDays() {
		return processDays;
	}

	public void setProcessDays(double processDays) {
		this.processDays = processDays;
	}

	public String getCdcReadyTime() {
		return cdcReadyTime;
	}

	public void setCdcReadyTime(String cdcReadyTime) {
		this.cdcReadyTime = cdcReadyTime;
	}

	public int getCdcDayNumber() {
		return cdcDayNumber;
	}

	public void setCdcDayNumber(int cdcDayNumber) {
		this.cdcDayNumber = cdcDayNumber;
	}

	public String getCdcShipDaySchedule() {
		return cdcShipDaySchedule;
	}

	public void setCdcShipDaySchedule(String cdcShipDaySchedule) {
		this.cdcShipDaySchedule = cdcShipDaySchedule;
	}

	public int getLscTransferTime() {
		return lscTransferTime;
	}

	public void setLscTransferTime(int lscTransferTime) {
		this.lscTransferTime = lscTransferTime;
	}

	public String getLscReadyTime() {
		return lscReadyTime;
	}

	public void setLscReadyTime(String lscReadyTime) {
		this.lscReadyTime = lscReadyTime;
	}

	public String getLscShipDaySchedule() {
		return lscShipDaySchedule;
	}

	public void setLscShipDaySchedule(String lscShipDaySchedule) {
		this.lscShipDaySchedule = lscShipDaySchedule;
	}

}
