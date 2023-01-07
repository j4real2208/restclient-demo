package com.example.restclient.json;

public class Result {
    private Geometry geometry;
    private String formattedAddress;

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public String getFormattedAddress() {
        return formattedAddress;
    }

    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

    @Override
    public String toString() {
        return "Result{" +
                "geometry=" + geometry +
                ", formattedAddress='" + formattedAddress + '\'' +
                '}';
    }
}
