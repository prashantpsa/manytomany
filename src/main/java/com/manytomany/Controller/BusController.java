package com.manytomany.Controller;

import com.manytomany.Entity.BusEntity;
import com.manytomany.Repository.BusEntityRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/busContol")
public class BusController {
    private BusEntityRepository busEntityRepository;

    public BusController(BusEntityRepository busEntityRepository) {
        this.busEntityRepository = busEntityRepository;
    }

    @PostMapping
    public ResponseEntity<BusEntity> addtodb(@RequestBody  BusEntity busEntity){
        BusEntity bus=  busEntityRepository.save(busEntity);
        return new ResponseEntity<>(bus, HttpStatus.CREATED);

    }
}
