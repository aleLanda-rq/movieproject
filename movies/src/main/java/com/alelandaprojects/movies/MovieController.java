package com.alelandaprojects.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")//instead of mapping to local host. We are mapping it to w/e is in the parameter
public class MovieController  {
    @Autowired
    private MovieService movieService;//service class delegating the task of fetching movie from database
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
//        return new ResponseEntity<String>("All movies!", HttpStatus.OK);
        //HttpStatus.OK = 200
    }

    @GetMapping("/{id}")
    //in <> you put what you are returning
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable ObjectId id){
        /*@PathVariable ObjectId id) what this does is let the program know that
        * whatever we are getting through our path variable ("/{id}") we want to convert that
        * to an ObjectId called id */
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(id),HttpStatus.OK);

    }




}

/*this page concerns itself with the task of getting a request from the user
 and returning a response.That's it. */