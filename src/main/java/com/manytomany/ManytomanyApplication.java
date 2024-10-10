package com.manytomany;

import com.manytomany.Entity.StopEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

@SpringBootApplication
public class ManytomanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManytomanyApplication.class, args);
	}

	public static interface StopEntityRepository extends JpaRepository<StopEntity, Long> {
	}
}
