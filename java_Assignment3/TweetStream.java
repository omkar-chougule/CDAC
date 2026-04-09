package java_Assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TweetStream {

    public static List<Tweet> initializeData() {
        List<Tweet> tweeter = new ArrayList<Tweet>();

        tweeter.add(new Tweet(782, "Technology", "2026-01-15", 85000, Set.of("#ai", "#future", "#innovation")));
        tweeter.add(new Tweet(214, "Finance", "2026-02-20", 32000, Set.of("#crypto", "#bitcoin", "#market")));
        tweeter.add(new Tweet(901, "Finance", "2025-11-12", 12500, Set.of("#stocks", "#investing", "#growth", "#market")));
        tweeter.add(new Tweet(633, "Technology", "2025-08-30", 56000, Set.of("#quantum", "#coding", "#dev")));
        tweeter.add(new Tweet(527, "Entertainment", "2025-07-14", 15400, Set.of("#oscars", "#cinema", "#mustwatch")));
        tweeter.add(new Tweet(844, "Entertainment", "2025-04-02", 9200, Set.of("#concert", "#music", "#live")));
        return tweeter;

    }

    public static void main(String[] args) {
        List<Tweet> tweeter = initializeData();
        Stream <Tweet> stream = tweeter.stream();


//		Ques 1 List all the tweets posted on the current month
        System.out.println();
        System.out.println("-------------- Tweets posted on the current month --------------");
        List<Tweet> searchdate = stream.filter((tweet)-> tweet.getDate().contains("-04-")).collect(Collectors.toList());
        System.out.println(searchdate);

//		Ques 2 List all the tweets for a particular hashtag
        System.out.println();
        System.out.println("-------------- Tweets for a Particluar Hashtag --------------");
        stream = tweeter.stream();
        List<Tweet> searchhashtag = stream.filter((tweet)->tweet.getHashtags().contains("#market"))
                .collect(Collectors.toList());
        System.out.println(searchhashtag);

//		Ques 3 Count all the tweets by the Subject
        System.out.println();
        System.out.println("-------------- No. of Tweets as per the subject category --------------");
        stream = tweeter.stream();
        Map<String,List<Tweet>> groupbysub = stream.collect(Collectors.groupingBy(Tweet::getSubject));
        groupbysub.forEach((k,v)->System.out.println(k+" : "+ v.size()));

//		Ques 4 List the tweets that got more than 10 k
        System.out.println();
        System.out.println("-------------- No. of Tweets Views crossing 10k --------------");
        stream = tweeter.stream();
        Predicate<Tweet> nviws = (tweet) -> tweet.getNofviews() > 10000;
        stream.filter(nviws).forEach(System.out::println);

//		Ques 5 Print the top 5 trending tweets
        System.out.println();
        System.out.println("-------------- Top 5 trending tweets in tweeter --------------");
        stream = tweeter.stream();
        List<Tweet> sortedlst = stream.sorted().limit(5).collect(Collectors.toList());
        System.out.println(sortedlst);
    }
}
