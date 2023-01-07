package com.example.restclient.entities;

import java.util.Objects;

public class Site {
    private Integer id;
    private String address;
    private double latitude;
    private double longitude;

    public Site() {}

    public Site(String address, double latitude, double longitude) {
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Site{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Site site = (Site) o;
        return Double.compare(site.latitude, latitude) == 0 && Double.compare(site.longitude, longitude) == 0 && id.equals(site.id) && address.equals(site.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, latitude, longitude);
    }
}
