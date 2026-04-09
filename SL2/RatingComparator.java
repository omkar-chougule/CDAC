package SL2;

import java.util.Comparator;

public class RatingComparator implements Comparator<Songs> {
    @Override
    public int compare(Songs o1, Songs o2) {
        return Integer.compare(o1.getRating(), o2.getRating());
    }
}
