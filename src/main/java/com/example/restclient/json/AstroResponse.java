package com.example.restclient.json;

import java.util.List;

public record AstroResponse(
        int number,
        String message,
        List<Assignment> people
) {

}
