package lab1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author cgonz
 */
public class Startup {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Jaws","Steven Spielberg");
        Movie movie2 = new Movie("Star Wars: Episode III – Revenge of the Sith",
                "George Lucas");
        Movie movie3 = new Movie("Raiders of the Lost Ark","Steven Spielberg");
        Movie movie4 = new Movie("Raiders of the Lost Ark","Steven Spielberg");
        
        Map<String,Movie>favMovies = new HashMap<>();
        favMovies.put("Jaws1", movie1);
        favMovies.put("StarWars3", movie2);
        favMovies.put("Raiders1", movie3);
        favMovies.put("Raiders2", movie4);
        
        System.out.println("Retrieve Movie object from key 'Jaws1'\n");
        System.out.println(favMovies.get("Jaws1"));
        
        System.out.println("\n\n");
        
        System.out.println("Retrieve Keys from key Set created for looping: \n");
        Set<String> keys = favMovies.keySet();
        for(String s : keys){
            System.out.println(s);
        }
        
        System.out.println("\n");
        
        System.out.println("Retrieve Movie objects from Collection of Movie objects created from"
                + " HashMap for looping: \n");
        Collection <Movie> values = favMovies.values();
        for(Movie m : values){
            System.out.println(m);
        }
        
        System.out.println("\n\n");
        
        System.out.println("Movie objects stored in a TreeMap. Sorting is based on KEYS: \n");
        Map<String,Movie> sortedByKeys = new TreeMap<>(favMovies);
        Set<String>keys2 = sortedByKeys.keySet();
        
        for(String s : keys2){
            System.out.println(s);
        }
        
        System.out.println("\n\n");
        
        System.out.println("Values retrieved to demonstrate their default sorting: \n");
        
        /*Had to add values2 into a List object. From then, I Called a utilities
        class for collections that has a sort() method that can sort Collection
        objects according to natural order*/
        Collection <Movie> values2 = sortedByKeys.values();
        ArrayList<Movie> moviesToSort = new ArrayList(values2); 
        Collections.sort(moviesToSort);
        for(Movie m : moviesToSort){
            System.out.println(m);
        }
        
        System.out.println("\n\n");
        
        System.out.println("Comparator created used to sort by director: \n");
        Collections.sort(moviesToSort, new MovieByDirector());
        for(Movie m : moviesToSort){
            System.out.println(m);
        }
        
        System.out.println("\n\n");
        
        
        
    }
}
