package Assignment2;
import java.util.Scanner;

public class Store {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number books u want to add: ");
        int n = sc.nextInt();
        Book [] books = new Book[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter TITLE: ");
            String title = sc.next();
            System.out.println("Enter Author: ");
            String author = sc.next();
            System.out.println("Enter Price: ");
            double price = sc.nextDouble();
            books[i]=new Book(title,author,price);
            //System.out.println(books[i].toString());
        }
        System.out.println("----------Books Catalog-------------");
        for(Book bk : books) {
            System.out.println(bk.toString());
        }
        System.out.println("\n\n");
        System.out.println("Enter Book id to get discounted price: ");
        int id=sc.nextInt();

        System.out.println("the discounted price of the book is :"+books[id-1].calDiscount(10));

    }
}
