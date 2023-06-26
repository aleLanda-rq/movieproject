package com.alelandaprojects.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    //in the <> we have to let it know what type of data and ID we are dealing with
}
//talks to the database and gets the data back