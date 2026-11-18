
package com.flight.reservation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
public class FlightController {

    @GetMapping
    public List<String> getAllFlights() {
        return List.of();
    }

    @GetMapping("/search")
    public List<String> searchFlights(
            @RequestParam String source,
            @RequestParam String destination) {
        return List.of();
    }
}
