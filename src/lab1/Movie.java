package lab1;

import common.*;
import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 * For practice, add the required equals, hashCode and toString methods. Then
 * add a Comparable interface for the "natural" default sort order. Remember,
 * consider what makes these objects unique? Also consider that only one field
 * can be used for sorting. What will you do?
 *
 */
public class Movie implements Comparable<Movie> {

    private String title;
    private String director;

    public Movie(String title, String director) {
        this.director = director;
        this.title = title;
    }

    public final String getTitle() {
        return title;
    }

    public final void setTitle(String title) {
        this.title = title;
    }

    public final String getDirector() {
        return director;
    }

    public final void setDirector(String director) {
        this.director = director;
    }

    @Override
    public final int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.title);
        hash = 13 * hash + Objects.hashCode(this.director);
        return hash;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movie other = (Movie) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.director, other.director)) {
            return false;
        }
        return true;
    }

    @Override
    public final String toString() {
        return title + ", directed by: " + director;
    }

    @Override
    public final int compareTo(Movie other) {
        return new CompareToBuilder()
                .append(this.title, other.title)
                .append(this.director, other.director)
                .toComparison();
    }

}
