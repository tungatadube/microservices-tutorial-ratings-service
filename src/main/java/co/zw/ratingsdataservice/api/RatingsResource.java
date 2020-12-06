package co.zw.ratingsdataservice.api;

import co.zw.ratingsdataservice.model.Rating;
import co.zw.ratingsdataservice.model.RatingDto;
import co.zw.ratingsdataservice.service.MovieRatingService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ratings")
@NoArgsConstructor
public class RatingsResource {

    private MovieRatingService movieRatingService;

    @Autowired
    public RatingsResource(MovieRatingService movieRatingService) {
        this.movieRatingService = movieRatingService;
    }

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable String id){
        Optional<Rating> optionalRating = movieRatingService.findById(id);
        return optionalRating.orElseGet(Rating::new);
    }
    @RequestMapping()
    public List<Rating> findAll(){
        return movieRatingService.findAll();
    }
}
