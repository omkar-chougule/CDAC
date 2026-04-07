package SL2;

import java.util.Comparator;

public class TitleComparator implements Comparator<Songs> {
    @Override
    public int compare(Songs o1, Songs o2) {
        return o1.getSong_name().compareTo(o2.getSong_name());
    }
}
