package com.delivery.details.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.delivery.details.entities.ViewItemAvailability;

/**
 * Spring Data JPA repository for the ViewItemAvailability entity.
 */
@Repository
public interface ViewItemAvailabilityRepository extends JpaRepository<ViewItemAvailability, String> {

	List<ViewItemAvailability> findByItemIdInAndToZipGreaterThanEqualAndFromZipLessThanEqual(List<String> itemIds, String zipCode1, String zipCode2);

}
