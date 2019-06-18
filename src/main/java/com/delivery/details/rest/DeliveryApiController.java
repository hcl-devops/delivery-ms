package com.delivery.details.rest;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.details.model.ApiResponseMessage;
import com.delivery.details.model.DeliveryAvailabilityResponse;
import com.delivery.details.service.DeliveryService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DeliveryApiController {

	@Autowired
	private DeliveryService deliveryServiceImpl;

	@GetMapping(value = "/deliveryavailability/{zipCode}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ApiResponseMessage getItemAvailability(@RequestParam(value = "itemIds") List<String> itemIds,
			@PathVariable("zipCode") String zipCode) throws ParseException {

		List<DeliveryAvailabilityResponse> response = deliveryServiceImpl.getDeliveryAvailabilityOptions(itemIds,
				zipCode);

		if (response != null) {
			return new ApiResponseMessage(ApiResponseMessage.OK, "SUCCESS", response);
		} else {
			return new ApiResponseMessage(ApiResponseMessage.NO_RECORD_FOUND, "No Record Found", response);
		}
	}

}
