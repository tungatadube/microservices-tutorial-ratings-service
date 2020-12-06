package co.zw.ratingsdataservice.service;

import co.zw.ratingsdataservice.model.Rating;
import co.zw.ratingsdataservice.repository.MovieRatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MovieRatingServiceImpl implements MovieRatingService {

    private MovieRatingRepository ratingRepository;

    @Autowired
    public MovieRatingServiceImpl(MovieRatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    @Override
    public Optional<Rating> findById(String id) {
        return ratingRepository.findById(id);
    }

    @Override
    public Rating save(String id) {
        return ratingRepository.save(id);
    }

    @Override
    public List<Rating> findAll() {
        return ratingRepository.findAll();
    }
}
