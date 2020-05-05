package com.bicycleRentals.legendaryRatingService.resources;

import com.bicycleRentals.legendaryRatingService.models.BicycleRating;
import com.bicycleRentals.legendaryRatingService.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class BicycleRatingsResource {

    @RequestMapping("/{bicycleId}")
    public BicycleRating getBicycleRating(@PathVariable("bicycleId") String bicycleId){
        return new BicycleRating(bicycleId, 4);
    }

    @RequestMapping("users/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) {
        List<BicycleRating> ratings = Arrays.asList(
                new BicycleRating("7272", 4),
                new BicycleRating("8080", 5)
                );
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }
}
