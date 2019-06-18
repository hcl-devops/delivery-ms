package com.delivery.details.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author semwaln
 * 
 *         Entity class for VIEW_ITEM_AVAILABILITY TABLE.
 *
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "VIEW_ITEM_AVAILABILITY")
public class ViewItemAvailability implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "SHORT_DESCRIPTION")
	private String shortDescription;

	@Id
	@Column(name = "ITEM_ID")
	private String itemId;

	@Column(name = "UOM")
	private String uom;

	@Column(name = "UNIT_PRICE")
	private double unitPrice;

	@Column(name = "UNIT_PRICE_UOM")
	private String unitPriceUom;

	@Column(name = "EXTN_TRANSPORT_METHOD_TYPE")
	private String extnTransportMethodType;

	@Column(name = "ORGANIZATION_CODE")
	private String organizationCode;

	@Column(name = "UNIT_SALE_PRICE")
	private double unitSalePrice;

	@Column(name = "SHIPNODE_KEY")
	private String shipnodeKey;

	@Column(name = "QTY_AVAILABLE")
	private double qtyAvailable;

	@Column(name = "MIN_DAYS")
	private int minDays;

	@Column(name = "MAX_DAYS")
	private int maxDays;

	@Column(name = "FROM_ZIP")
	private String fromZip;

	@Column(name = "TO_ZIP")
	private String toZip;

	@Column(name = "RESOURCE_POOL_DESC")
	private String resourcePoolDesc;

	@Column(name = "TIME_SLOT")
	private String timeSlot;

	@Column(name = "DELIVERY_TYPE_KEY")
	private String deliveryTypeKey;

	@Column(name = "REGION_NAME")
	private String regionName;

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getExtnTransportMethodType() {
		return extnTransportMethodType;
	}

	public void setExtnTransportMethodType(String extnTransportMethodType) {
		this.extnTransportMethodType = extnTransportMethodType;
	}

	public String getOrganizationCode() {
		return organizationCode;
	}

	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

	public double getUnitSalePrice() {
		return unitSalePrice;
	}

	public void setUnitSalePrice(double unitSalePrice) {
		this.unitSalePrice = unitSalePrice;
	}

	public String getShipnodeKey() {
		return shipnodeKey;
	}

	public void setShipnodeKey(String shipnodeKey) {
		this.shipnodeKey = shipnodeKey;
	}

	public double getQtyAvailable() {
		return qtyAvailable;
	}

	public void setQtyAvailable(double qtyAvailable) {
		this.qtyAvailable = qtyAvailable;
	}

	public int getMinDays() {
		return minDays;
	}

	public void setMinDays(int minDays) {
		this.minDays = minDays;
	}

	public int getMaxDays() {
		return maxDays;
	}

	public void setMaxDays(int maxDays) {
		this.maxDays = maxDays;
	}

	public String getFromZip() {
		return fromZip;
	}

	public void setFromZip(String fromZip) {
		this.fromZip = fromZip;
	}

	public String getToZip() {
		return toZip;
	}

	public void setToZip(String toZip) {
		this.toZip = toZip;
	}

	public String getResourcePoolDesc() {
		return resourcePoolDesc;
	}

	public void setResourcePoolDesc(String resourcePoolDesc) {
		this.resourcePoolDesc = resourcePoolDesc;
	}

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public String getUnitPriceUom() {
		return unitPriceUom;
	}

	public void setUnitPriceUom(String unitPriceUom) {
		this.unitPriceUom = unitPriceUom;
	}

	public String getDeliveryTypeKey() {
		return deliveryTypeKey;
	}

	public void setDeliveryTypeKey(String deliveryTypeKey) {
		this.deliveryTypeKey = deliveryTypeKey;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

}