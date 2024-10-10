package com.manytomany.Repository;

import com.manytomany.Entity.BusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusEntityRepository extends JpaRepository<BusEntity, Long> {
}