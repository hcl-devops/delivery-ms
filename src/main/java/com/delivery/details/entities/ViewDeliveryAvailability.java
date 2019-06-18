package com.delivery.details.entities;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author semwaln
 * 
 *         Entity class for Item_Data TABLE.
 *
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "VIEW_DELIVERY_AVAILABILITY")
public class ViewDeliveryAvailability implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ITEM_ID")
	private String itemId;

	@Column(name = "VEHICLE_TYPE")
	private String vehicleType;

	@Column(name = "UNIT_PRICE")
	private double unitPrice;

	@Column(name = "UNIT_PRICE_UOM")
	private String unitPriceUom;

	@Column(name = "LSC_CODE")
	private String lscCode;

	@Column(name = "COUNTRY")
	private String country;

	@Column(name = "TIME_SLOT")
	private String timeSlot;

	@Column(name = "CAPACITY")
	private int capacity;

	@Column(name = "FROM_NODE")
	private String fromNode;

	@Column(name = "TO_NODE")
	private String toNode;

	@Column(name = "ORDER_DATE")
	private Date orderDate;

	@Column(name = "START_DATE")
	private Date startDate;

	@Column(name = "RELEASE_TIME")
	private String releaseTime;

	@Column(name = "PROCESSING_TIME")
	private String processingTime;

	@Column(name = "FROM_TIME")
	private Time fromTime;

	@Column(name = "TO_TIME")
	private Time toTime;

	@Column(name = "PROCESS_DAYS")
	private double processDays;

	@Column(name = "CDC_READY_TIME")
	private String cdcReadyTime;

	@Column(name = "CDC_DAY_NUMBER")
	private int cdcDayNumber;

	@Column(name = "CDC_SHIP_DAY_SCHEDULE")
	private String cdcShipDaySchedule;

	@Column(name = "LSC_TRANSFER_TIME")
	private int lscTransferTime;

	@Column(name = "LSC_READY_TIME")
	private String lscReadyTime;

	@Column(name = "LSC_SHIP_DAY_SCHEDULE")
	private String lscShipDaySchedule;

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

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
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