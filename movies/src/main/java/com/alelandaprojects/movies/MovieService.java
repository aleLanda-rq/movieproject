package com.alelandaprojects.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class MovieService {

    @Autowired//will let the framework know to instantiate the class below
    private MovieRepository movieRepository; //service class
    //uses repository class and talks to the database to get a list of movies and returns the API layer

    public List<Movie> allMovies(){
        return movieRepository.findAll();//findAll method is described inside the mongo repository class


    }

    public Optional<Movie> singleMovie(ObjectId id){
        /*Optional<Movie> is us letting Java know that
        it may return null
        */
        return movieRepository.findById(id);
    }

}

/*handles business logic*/
