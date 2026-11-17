package soa.tourist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import soa.tourist.entity.Tourist;

public interface TouristRepository extends JpaRepository<Tourist, Long> {
}
