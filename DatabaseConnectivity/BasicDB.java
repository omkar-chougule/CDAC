package DatabaseConnectivity;
import java.sql.Connection;
import java.sql.*;

public class BasicDB {
    public static void main(String [] args){
        String url = "jdbc:mysql://localhost:3306/javadb";
        String query = "SELECT * FROM USER";
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            try{
                con = DriverManager.getConnection(url, "root", "root123");
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
            finally {
                try {
                    con.close();
                }
                catch (SQLException e){
                    System.out.println(e);
                }
            }

        }
        catch (ClassNotFoundException e ){
            e.printStackTrace();
        }


    }
}
