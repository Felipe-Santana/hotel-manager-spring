package dev.felipesantana.hotelmanager.hotel.repository;

import dev.felipesantana.hotelmanager.hotel.model.Hotel;
import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends CrudRepository<Hotel, ObjectId> {
}
