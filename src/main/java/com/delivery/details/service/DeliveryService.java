package com.delivery.details.service;

import java.text.ParseException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.delivery.details.model.DeliveryAvailabilityResponse;



/**
 * 
 * @author semwaln
 * 
 *         <pre>
 *  Interface providing business logic implementation for Item details
 *         </pre>
 *
 */
@Service
public interface DeliveryService {

	List<DeliveryAvailabilityResponse> getDeliveryAvailabilityOptions(List<String> itemIds, String zipCode) throws ParseException;

}