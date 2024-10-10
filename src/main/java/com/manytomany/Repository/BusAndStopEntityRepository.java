package com.manytomany.Repository;

import com.manytomany.Entity.BusAndStopEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusAndStopEntityRepository extends JpaRepository<BusAndStopEntity, Long> {
}