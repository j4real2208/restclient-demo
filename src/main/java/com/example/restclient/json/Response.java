package com.example.restclient.json;

import java.util.List;

public class Response {
    private String status;
    private List<Result> results;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
    public Location getLocation() {
        return results.get(0).getGeometry().getLocation();
    }

    public String getFormattedAddress() {
        return results.get(0).getFormattedAddress();
    }
    @Override
    public String toString() {
        return "Response{" +
                "status='" + status + '\'' +
                ", results=" + results +
                '}';
    }
}
