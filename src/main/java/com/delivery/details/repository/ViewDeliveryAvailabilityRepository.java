package com.delivery.details.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.delivery.details.entities.ViewDeliveryAvailability;

/**
 * Spring Data JPA repository for the ProjectMetricsActiveSprint entity.
 */
@Repository
public interface ViewDeliveryAvailabilityRepository extends JpaRepository<ViewDeliveryAvailability, String> {

	List<ViewDeliveryAvailability> findByVehicleTypeInAndLscCodeIn(Set<String> vehiceTypeList, Set<String> lscCodeList);

}
