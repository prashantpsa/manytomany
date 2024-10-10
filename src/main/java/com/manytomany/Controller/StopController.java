package com.manytomany.Controller;

import com.manytomany.Entity.StopEntity;
import com.manytomany.Repository.StopEntityRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/Stop")
public class StopController {
    private StopEntityRepository stopEntityRepository;

    public StopController(StopEntityRepository stopEntityRepository) {
        this.stopEntityRepository = stopEntityRepository;
    }

    @PostMapping
    public ResponseEntity<StopEntity> savetoStop(@RequestBody StopEntity stopEntity ){
        return new ResponseEntity<>(stopEntityRepository.save(stopEntity), HttpStatus.CREATED);

    }
}
