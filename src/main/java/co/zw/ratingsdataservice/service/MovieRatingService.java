package co.zw.ratingsdataservice.service;


import co.zw.ratingsdataservice.model.Rating;

import java.util.List;
import java.util.Optional;

public interface MovieRatingService {
    Optional<Rating> findById(String movieId);
     Rating save(String Id);
    List<Rating> findAll();
}
