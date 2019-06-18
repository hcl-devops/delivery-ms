package com.delivery.details.service;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delivery.details.entities.ViewDeliveryAvailability;
import com.delivery.details.entities.ViewItemAvailability;
import com.delivery.details.model.DeliveryAvailabilityResponse;
import com.delivery.details.repository.ViewDeliveryAvailabilityRepository;
import com.delivery.details.repository.ViewItemAvailabilityRepository;

@Service
public class DeliveryServiceImpl implements DeliveryService {

	@Autowired
	private ViewItemAvailabilityRepository itemAvailabilityRepo;

	@Autowired
	private ViewDeliveryAvailabilityRepository deliveryAvailRepo;

	DateFormat formatter1 = new SimpleDateFormat("MMMM-dd-yyyy");
	DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	@Override
	public List<DeliveryAvailabilityResponse> getDeliveryAvailabilityOptions(List<String> itemIds, String zipCode)
			throws ParseException {

		List<DeliveryAvailabilityResponse> deliveryResponseList = new ArrayList<>();
		for (String s : itemIds) {
			if (s.equalsIgnoreCase("Step Ladder") && zipCode.equals("16243")) {

				Date d1 = new Date();
				DeliveryAvailabilityResponse res = new DeliveryAvailabilityResponse();
				Calendar cal = Calendar.getInstance();
				cal.setTime(d1);
				cal.add(Calendar.DATE, +7);
				d1 = cal.getTime();
				if (null != d1)
					res.setLscReadyTime(formatter1.format(d1));
				Date d2 = (Date) formatter1.parse(res.getLscReadyTime());
				Calendar c = Calendar.getInstance();
				c.setTime(d2);
				c.add(Calendar.DATE, -2);
				d2 = c.getTime();
				res.setItemId(s);
				res.setHomeDeliveryReadyTime(formatter1.format(d2));
				res.setUnitPrice(9.99);
				res.setVehicleType("TRUCK");
				deliveryResponseList.add(res);
				return deliveryResponseList;

			} else if (s.equalsIgnoreCase("Step Ladder") && !zipCode.equals("16243")) {
				return null;

			} else if (s.equalsIgnoreCase("Loft-Bed") && zipCode.equals("16243")) {

				Date d1 = new Date();
				DeliveryAvailabilityResponse res = new DeliveryAvailabilityResponse();
				Calendar cal = Calendar.getInstance();
				cal.setTime(d1);
				cal.add(Calendar.DATE, +7);
				d1 = cal.getTime();
				if (null != d1)
					res.setLscReadyTime(formatter1.format(d1));
				Date d2 = (Date) formatter1.parse(res.getLscReadyTime());
				Calendar c = Calendar.getInstance();
				c.setTime(d2);
				c.add(Calendar.DATE, -2);
				d2 = c.getTime();
				res.setItemId(s);
				res.setHomeDeliveryReadyTime(formatter1.format(d2));
				res.setUnitPrice(9.99);
				res.setVehicleType("TRUCK");
				deliveryResponseList.add(res);
				return deliveryResponseList;

			} else if (s.equalsIgnoreCase("Loft-Bed") && !zipCode.equals("16243")) {
				return null;

			}
		}
		List<ViewItemAvailability> itemAvailabilityRes = itemAvailabilityRepo
				.findByItemIdInAndToZipGreaterThanEqualAndFromZipLessThanEqual(itemIds, zipCode, zipCode);
		Set<String> lscCodeList = new HashSet<>();
		Set<String> vehiceTypeList = new HashSet<>();

		if (null != itemAvailabilityRes && !itemAvailabilityRes.isEmpty()) {
			for (ViewItemAvailability item : itemAvailabilityRes) {
				lscCodeList.add(item.getRegionName());
				vehiceTypeList.add(item.getExtnTransportMethodType());
			}
		} else {
			return null;
		}

		List<ViewDeliveryAvailability> deliveryDbRes = deliveryAvailRepo.findByVehicleTypeInAndLscCodeIn(vehiceTypeList,
				lscCodeList);

		if (null != deliveryDbRes && !deliveryDbRes.isEmpty()) {

			for (ViewDeliveryAvailability delivery : deliveryDbRes) {
				Date cdcReadyDate = new Date();
				Date lscReadyDate = new Date();
				List<String> lscScheduleDaysList = new ArrayList<>(
						Arrays.asList(delivery.getLscShipDaySchedule().split(",")));

				DeliveryAvailabilityResponse del = new DeliveryAvailabilityResponse();
				del.setCapacity(delivery.getCapacity());
				del.setCdcDayNumber(delivery.getCdcDayNumber());
				if (null != delivery.getCdcReadyTime())
					cdcReadyDate = (Date) formatter.parse(delivery.getCdcReadyTime());
				del.setCdcReadyTime(formatter1.format(cdcReadyDate));
				del.setCdcShipDaySchedule(delivery.getCdcShipDaySchedule());
				del.setCountry(delivery.getCountry());
				del.setFromNode(delivery.getFromNode());
				del.setToNode(delivery.getToNode());
				del.setFromTime(delivery.getFromTime());
				del.setItemId(delivery.getItemId());
				del.setLscCode(delivery.getLscCode());
				// del.setLscReadyTime(delivery.getLscReadyTime());
				del.setLscShipDaySchedule(delivery.getLscShipDaySchedule());
				del.setLscTransferTime(delivery.getLscTransferTime());
				if (null != delivery.getOrderDate())
					del.setOrderDate(formatter1.format(delivery.getOrderDate()));
				del.setProcessDays(delivery.getProcessDays());
				del.setProcessingTime(delivery.getProcessingTime());
				del.setReleaseTime(delivery.getReleaseTime());
				if (null != delivery.getStartDate())
					del.setStartDate(formatter1.format(delivery.getStartDate()));
				del.setTimeSlot(delivery.getTimeSlot());
				del.setToTime(delivery.getToTime());
				del.setUnitPrice(delivery.getUnitPrice());
				del.setUnitPriceUom(delivery.getUnitPriceUom());
				del.setVehicleType(delivery.getVehicleType());
				String strDateFormat = "yyyy-MM-dd hh:mm:ss";
				SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
				Date d = sdf.parse(delivery.getLscReadyTime());

				Date d1 = addTimeInLsc(d, delivery.getFromTime(), delivery.getToTime(), lscScheduleDaysList);
				// String lscDate = sdf.format(d1);
				Calendar cal = Calendar.getInstance();
				cal.setTime(d1);
				cal.add(Calendar.DATE, -2);
				Date dateBefore2Days = cal.getTime();
				if (null != d1)
					del.setLscReadyTime(formatter1.format(d1));
				del.setHomeDeliveryReadyTime(formatter1.format(dateBefore2Days));

				deliveryResponseList.add(del);

			}

		} else {
			return null;
		}
		return deliveryResponseList;
	}

	private Date addTimeInLsc(Date d, Time fromTime, Time toTime, List<String> lscScheduleDaysList)
			throws ParseException {

		int processingTimeInDate = 4;
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.HOUR, processingTimeInDate);
		int todaysDay = c.get(Calendar.DAY_OF_WEEK);
		DateFormat formatters = new SimpleDateFormat("HH:mm:ss");

		String date = formatters.format(c.getTime());
		Date timeCal = formatters.parse(date);

		if (!(fromTime.getHours() < timeCal.getHours() && toTime.getHours() > timeCal.getHours())) {

			c.add(Calendar.DATE, 1);
			c.set(Calendar.HOUR_OF_DAY, 8);
			d = c.getTime();
			todaysDay = c.get(Calendar.DAY_OF_WEEK);

		} else {
			d = c.getTime();
		}

		int i = todaysDay;
		int y = 1;
		for (i++; i <= 8; i++) {

			if (i > 7) {
				i = 1;
			}
			String tempTodaysDay = String.valueOf(i);
			if (!lscScheduleDaysList.contains(tempTodaysDay)) {
				y++;

			} else {
				c.add(Calendar.DATE, y);
				break;
			}

		}
		d = c.getTime();
		return d;
	}

}
