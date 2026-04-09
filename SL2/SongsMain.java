package SL2;

import Day5.NameComparator;
import Day5.SalaryComparator;

import java.util.*;

public class SongsMain {
    public static List<Songs> initializeData()
    {
        List<Songs> songs = new ArrayList<Songs>();
        songs.add(new Songs(445, "Jhingat", 5, Set.of("Ajay Atul", "Vaishali Samant"),"2020" ));
        songs.add(new Songs(446, "Am I Dreaming", 6, Set.of("Metro Boomin","Rosie"),"2024" ));
        songs.add(new Songs(447, "Sahiba", 3, Set.of("Aditya Rikhari"),"2025" ));
        songs.add(new Songs(447, "Sage", 4, Set.of("Ritviz"),"2020" ));


        return songs;
    }

    public static void addSongs(List<Songs> songs, Songs song){
        boolean exists = false;
        for (Songs s : songs){
            if(s.getSerialno() == song.getSerialno()){
                exists = true;
                break;
            }
        }
        if(!exists)
            songs.add(song);

    }

    public static void removeSong(List <Songs> songs, Songs song){

        Iterator<Songs> it= songs.iterator();
        while(it.hasNext()){
            Songs s =it.next();
            if(s.getSerialno() == song.getSerialno()){
                it.remove();
                break;
            }
        }
    }

    public static void updateSong(List <Songs> songs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Serial Number to update: ");
        int srno = sc.nextInt();
        System.out.println("Enter Updated Rating : ");
        int rating = sc.nextInt();

        boolean exists = false;
        for (Songs s : songs){
            if(s.getSerialno() == srno){
                s.setRating(rating);
                exists = true;
                break;
            }

        }
        if(!exists)
            System.out.println("Song not Found!!");

    }

    public static void SearchSongsByTitle(List<Songs> songs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the tilte to Search : ");
        String title = sc.nextLine();
        boolean exists = false;
        for (Songs s : songs){
            if(s.getSong_name().equals(title)){
                System.out.println("Song "+title+" was found in the list!!");
                exists = true;
                break;
            }
        }
        if(!exists)
            System.out.println("Song "+title+" not found!!");

    }
    public static List<Songs> filterByCurrentYear(List<Songs> songs){
        List<Songs> filtered = new ArrayList<>();
        for(Songs s: songs){
            if(s.getRelease_year().equals("2020")){
                filtered.add(s);
            }
        }
        return filtered;
    }

    public static List<Songs> filterByArtist(List<Songs> songs){
        List<Songs> filtered = new ArrayList<>();
        for(Songs s: songs){
            if(s.getArtist().equals(Set.of("Metro Boomin","Rosie"))){
                filtered.add(s);
            }
        }
        return filtered;
    }

    public static void printTitleAndYear(List<Songs> songs){
        for(Songs e: songs){
            System.out.println("Song "+e.getSong_name() + " was released in the year --> "+ e.getRelease_year()+"!!");
        }
    }

    public static void printList(List<Songs> songs){
        for(Songs e: songs){
            System.out.println(e);
        }
    }
    public static void main(String [] args){
        List<Songs> songlst=initializeData();
        printList(songlst);

        System.out.println("----------------------Adding song--------------------");
        addSongs(songlst,new Songs(448, "Sunflower", 5, Set.of("Post Malone","Swaa Lee"),"2020" ));
        printList(songlst);

        System.out.println("----------------------Update Songs--------------------");
        updateSong(songlst);
        printList(songlst);

        System.out.println("----------------------Remove Songs--------------------");
        removeSong(songlst,new Songs(445, "Jhingat", 5, Set.of("Ajay Atul", "Vaishali Samant"),"2020" ));
        printList(songlst);

        System.out.println("-----------Sort by Title------------------");
        Collections.sort(songlst,new TitleComparator());
        printList(songlst);
//        int index = Collections.binarySearch(songlst, new Songs(0, "Apsara Aali", 0,null, null), new TitleComparator());
//        System.out.println("Found at : " + index);

        System.out.println("-----------Search Song by Title------------------");
        SearchSongsByTitle(songlst);

        System.out.println("-----------List Songs Released in Current Year------------------");
        List<Songs> res = filterByCurrentYear(songlst);
        printList(res);

        System.out.println("----------------List Songs Released by Specific Artist----------------");
        System.out.println("Songs Composed by 'Metro Boomin' and 'Rosie' are: ");
        List<Songs> art = filterByArtist(songlst);
        printList(art);

        System.out.println("---------------------Listing Song Title and its Year of Release-------------------------------- ");
        printTitleAndYear(songlst);

        System.out.println("----------------Song with Highest Ratings--------------------------------------------");

        Songs maxRating = Collections.max(songlst, new RatingComparator());
        System.out.println("Song  with Maximum rating is : "+maxRating);

        System.out.println("----------------Song with Lowest Ratings--------------------------------------------");

        Songs minRating = Collections.min(songlst, new RatingComparator());
        System.out.println("Song  with Minimum rating is : "+minRating);

    }

}
