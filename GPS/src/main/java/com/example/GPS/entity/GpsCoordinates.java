package com.example.GPS.entity;
import jakarta.persistence.*;


import java.time.LocalDateTime;

@Entity
@IdClass(GpsCoordinatesId.class)
@Table(name = "arch_1004901")
public class GpsCoordinates {

    @Id
    @Column(name = "date")
    private LocalDateTime date;

    @Id
    @Column(name = "id_device")
    private Integer idDevice;

    private Integer speed;
    private Integer fuel;
    private String temp;
    private Integer x;
    private Integer y;
    private Integer z;
    private Boolean ignition;
    private Integer rpm;
    private Double fuelRate;
    private Double tfu;
    private Double odo;
    private Integer satInView;
    private Integer signal;
    private Integer heading;
    private Boolean charger;
    private Double latitude;
    private Double longitude;
    private Boolean state;
    private Integer tramId;
    private Boolean validity;
    private Integer tempEngine;
    private Float accumOdo;
    private Integer do1;
    private Integer do2;
    private Integer do3;
    private Integer do4;
    private Integer di1;
    private Integer di2;
    private Integer di3;
    private Integer di4;
    private Integer an1;
    private Integer an2;
    private Integer an3;
    private Integer an4;

    public LocalDateTime getDate() {
        return date;
    }

    public Integer getIdDevice() {
        return idDevice;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Integer getFuel() {
        return fuel;
    }

    public String getTemp() {
        return temp;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Integer getZ() {
        return z;
    }

    public Boolean isIgnition() {
        return ignition;
    }

    public Integer getRpm() {
        return rpm;
    }

    public Double getFuelRate() {
        return fuelRate;
    }

    public Double getTfu() {
        return tfu;
    }

    public Double getOdo() {
        return odo;
    }

    public Integer getSatInView() {
        return satInView;
    }

    public Integer getSignal() {
        return signal;
    }

    public Integer getHeading() {
        return heading;
    }

    public Boolean isCharger() {
        return charger;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Boolean isState() {
        return state;
    }

    public Integer getTramId() {
        return tramId;
    }

    public Boolean isValidity() {
        return validity;
    }

    public Integer getTempEngine() {
        return tempEngine;
    }

    public Float getAccumOdo() {
        return accumOdo;
    }

    public Integer getDo1() {
        return do1;
    }

    public Integer getDo2() {
        return do2;
    }

    public Integer getDo3() {
        return do3;
    }

    public Integer getDo4() {
        return do4;
    }

    public Integer getDi1() {
        return di1;
    }

    public Integer getDi2() {
        return di2;
    }

    public Integer getDi3() {
        return di3;
    }

    public Integer getDi4() {
        return di4;
    }

    public Integer getAn1() {
        return an1;
    }

    public Integer getAn2() {
        return an2;
    }

    public Integer getAn3() {
        return an3;
    }

    public Integer getAn4() {
        return an4;
    }

}
