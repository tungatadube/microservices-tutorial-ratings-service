package co.zw.ratingsdataservice.repository;


import co.zw.ratingsdataservice.model.Rating;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface MovieRatingRepository extends CrudRepository<Rating, String> {
    Optional<Rating> findById(String Id);
    Rating save(String Id);
    List<Rating> findAll();
}
