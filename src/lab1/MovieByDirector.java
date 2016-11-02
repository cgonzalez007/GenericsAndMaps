package lab1;

import java.util.Comparator;

/**
 *
 * @author cgonz
 */
public class MovieByDirector implements Comparator<Movie>{

    @Override
    public final int compare(Movie m1, Movie m2) {
        return m1.getDirector().compareTo(m2.getDirector());
    }
    
}
