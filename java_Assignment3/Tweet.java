package java_Assignment3;

import java.util.Set;

public class Tweet implements Comparable<Tweet> {

    private int twid;
    private String subject;
    private String date;
    private int views;
    private Set<String> hashtags;

    public Tweet(int twid, String subject, String date, int views, Set<String> hashtags) {
        super();
        this.twid = twid;
        this.subject = subject;
        this.date = date;
        this.views = views;
        this.hashtags = hashtags;
    }

    public int getTwid() {
        return twid;
    }
    public void setTwid(int twid) {
        this.twid = twid;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public int getNofviews() {
        return views;
    }
    public void setNofviews(int nofviews) {
        this.views = nofviews;
    }
    public Set<String> getHashtags() {
        return hashtags;
    }
    public void setHashtags(Set<String> hashtags) {
        this.hashtags = hashtags;
    }
    @Override
    public String toString() {
        return "Tweet [twid=" + twid + ", subject=" + subject + ", date=" + date + ", NumberOfViews=" + views
                + ", hashtags=" + hashtags + "]";
    }

    public int compareTo(Tweet t) {
        return this.views - t.getNofviews();
    }
}
