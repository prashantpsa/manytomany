package com.manytomany.Controller;

import com.manytomany.Entity.BusAndStopEntity;
import com.manytomany.Entity.BusEntity;
import com.manytomany.Entity.StopEntity;
import com.manytomany.Exception.ResourceNotFoundException;
import com.manytomany.Repository.BusAndStopEntityRepository;
import com.manytomany.Repository.BusEntityRepository;
import com.manytomany.Repository.StopEntityRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/route")
public class RouteController {
    private BusEntityRepository busEntityRepository;
    private StopEntityRepository stopEntityRepository;
    private BusAndStopEntityRepository busAndStopEntityRepository;


    public RouteController(BusEntityRepository busEntityRepository, StopEntityRepository stopEntityRepository, BusAndStopEntityRepository busAndStopEntityRepository) {
        this.busEntityRepository = busEntityRepository;
        this.stopEntityRepository = stopEntityRepository;
        this.busAndStopEntityRepository = busAndStopEntityRepository;
    }
    @PostMapping
    public ResponseEntity<BusAndStopEntity> savetoDb(
            @RequestParam long busId,
            @RequestParam long stopId,
            @RequestParam Integer orederId
    ){
        BusEntity busEntity = busEntityRepository.findById(busId).orElseThrow(()->new ResourceNotFoundException("enter correct id"));
        StopEntity stopEntity = stopEntityRepository.findById(stopId).orElseThrow(()->new ResourceNotFoundException("enter correct id"));
        BusAndStopEntity busAndStopEntity=new BusAndStopEntity();
        busAndStopEntity.setBusEntity(busEntity);
        busAndStopEntity.setStopEntity(stopEntity);
        busAndStopEntity.setOrderId(orederId);
return new ResponseEntity<>(busAndStopEntityRepository.save(busAndStopEntity), HttpStatus.CREATED);
    }
}
