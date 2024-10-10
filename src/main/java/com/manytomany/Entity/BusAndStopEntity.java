package com.manytomany.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "bus_and_stop_entity")
public class BusAndStopEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "bus_entity_id")
    private BusEntity busEntity;

    @ManyToOne
    @JoinColumn(name = "stop_entity_id")
    private StopEntity stopEntity;

    @Column(name = "order_id")
    private Integer orderId;

}