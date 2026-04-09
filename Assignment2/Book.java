package Assignment2;

public class Book {
    private String title;
    private String author;
    private double price;
    private int unique_id;
    private static int  count=0;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getUnique_id() {
        return unique_id;
    }

    public Book(){
        this(null,null,0.0);
    }
    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
        this.unique_id=++count;
    }

//    public String toString(){
//        return "Book{title: "+
//                title+", Author: "+
//                "Price: "+price+
//                "}";
//    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", unique_id=" + unique_id +
                '}';
    }

    public double calDiscount(double dperc){
        return price*(1-dperc*0.01);
    }
}
