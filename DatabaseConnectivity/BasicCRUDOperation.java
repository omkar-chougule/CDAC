package DatabaseConnectivity;

import java.sql.*;

public class BasicCRUDOperation {
    public static void selectData(Connection con, String query){
        try{
            Statement st = con.createStatement();
            ResultSet res = st.executeQuery(query);
            while(res.next()){
                System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getInt(3) + " "
                        + res.getString(4) + " " + res.getString(5));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }


    }

    public static void insertData(Connection con, String query, User user){
        try{
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1,user.getUid());
            pst.setString(2,user.getUname());
            pst.setInt(3,user.getAge());
            pst.setString(4,user.getGeneder());
            pst.setString(5,user.getNationality());
            int count = pst.executeUpdate();
            System.out.println(count+"rows affected");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void UpdateData(Connection con, String query, User user){
        try{
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1,user.getAge());
            pst.setString(2,user.getUname());

            int count = pst.executeUpdate();
            System.out.println(count+"rows affected");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void deleteData(Connection con, String query,User user){
        try{
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1,user.getUid());
            int count = pst.executeUpdate();
            System.out.println(count+"rows affected");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/javadb";
        String qselect = "SELECT * FROM USER";
        String qinsert = "INSERT INTO USER VALUES (?,?,?,?,?)";
        String uquery = "UPDATE USER SET age = ? WHERE name=? ";
        String dquery = "DELETE FROM user WHERE id=?";
        User user1 = new User (5,"Elizabeth",21,"female","Canada");
        User user2 = new User();
        user2.setUname("Elizabeth");
        user2.setAge(33);


        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                con = DriverManager.getConnection(url, "root", "root123");
                selectData(con, qselect);
                System.out.println("-----------------");
                UpdateData(con, uquery, user2);
                selectData(con, qselect);
                System.out.println("-----------------------");
                deleteData(con, dquery, user1);
                selectData(con, qselect);
                //String query = "INSERT INTO user VALUES (?,?,?,?,?)";
            }
            catch (SQLException e){
                e.printStackTrace();
            }
            finally {
                try{
                    con.close();
                }
                catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
