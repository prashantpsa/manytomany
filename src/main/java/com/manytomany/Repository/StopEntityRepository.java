package com.manytomany.Repository;

import com.manytomany.Entity.StopEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StopEntityRepository extends JpaRepository<StopEntity, Long> {
}