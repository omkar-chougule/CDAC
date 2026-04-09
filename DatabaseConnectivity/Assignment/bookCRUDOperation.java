package DatabaseConnectivity.Assignment;

import java.sql.*;


public class bookCRUDOperation {
    public static void selectData(Connection con, String query){
        try{
            Statement st = con.createStatement();
            ResultSet res = st.executeQuery(query);
            while(res.next()){
                System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3) + " " + res.getInt(4));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void insertData(Connection con, String query, Book book){
        try{
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1,book.getId());
            preparedStatement.setString(2,book.getTitle());
            preparedStatement.setString(3, book.getAuthor());
            preparedStatement.setInt(4, book.getPrice());
            int count = preparedStatement.executeUpdate();
            System.out.println(count + " Row Affected ");
        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }

    public static void updateData(Connection con, String query, Book book){
        try{
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1, book.getPrice());
            preparedStatement.setString(2, book.getTitle());

            int count = preparedStatement.executeUpdate();
            System.out.println(count + " Row Affected ");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void deleteData(Connection con, String query, Book book){
        try{
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1, book.getId());

            int count = preparedStatement.executeUpdate();
            System.out.println(count+"rows affected");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void main(String [] args){
        String url = "jdbc:mysql://localhost:3306/javadb";
        String qselect = "SELECT * FROM Book";
        String qinsert = "INSERT INTO Book VALUES (?,?,?,?,?)";
        String uquery = "UPDATE Book SET price = ? WHERE title=? ";
        String dquery = "DELETE FROM Book WHERE id = ? ";
        Book book1 = new Book(1, "The Famouse Five", "Enid Blyton", 500);
        Book book2 = new Book();

        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                con = DriverManager.getConnection(url, "root", "root123");
                selectData(con, qselect);
                System.out.println("-----------------");
                updateData(con, uquery, book2);
                selectData(con, qselect);
                System.out.println("-----------------------");
                deleteData(con, dquery, book1);
                selectData(con, qselect);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
