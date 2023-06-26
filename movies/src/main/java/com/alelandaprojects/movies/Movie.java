package com.alelandaprojects.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection="movies")//lets the framework know this document represents each document in the movie collection
//inside the bracket a defined the name of the collection
@Data//takes care of getter setters and string methods
@AllArgsConstructor //creates constructors by taking all private fields as arguments
@NoArgsConstructor//another constructor that takes no parameters what so ever
public class Movie {
    @Id //lets the framework know this property should be treated as the unique identifier for each movie.

    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;

    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference/*will cause the database to store only the Ids of the review
    and the views will be in a seperate collection.It is called manual relation relationship
    */
    private List<Review> reviewIds; /*embedded relationship so all the reviews related to the movie
   will be added to the list of reviews. Great for 1 to many relationship*/





}
