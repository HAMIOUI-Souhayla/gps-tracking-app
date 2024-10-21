package com.example.GPS.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class GpsCoordinatesId implements Serializable {

    private LocalDateTime date;
    private Integer idDevice;

    public GpsCoordinatesId() {}

    public GpsCoordinatesId(LocalDateTime date, Integer idDevice) {
        this.date = date;
        this.idDevice = idDevice;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Integer getIdDevice() {
        return idDevice;
    }

    public void setIdDevice(Integer idDevice) {
        this.idDevice = idDevice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GpsCoordinatesId that = (GpsCoordinatesId) o;
        return idDevice == that.idDevice && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, idDevice);
    }
}
