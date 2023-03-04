package dev.felipesantana.hotelmanager.hotel.controller;

import dev.felipesantana.hotelmanager.hotel.model.Hotel;
import dev.felipesantana.hotelmanager.hotel.repository.HotelRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    private final HotelRepository hotelRepository;

    public HotelController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @PostMapping
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public Hotel create(@RequestBody Hotel hotel) {
        return this.hotelRepository.save(hotel);
    }
}
