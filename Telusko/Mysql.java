import java.sql.*;
public class Mysql {
    public static void main(String[] args) {
        
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/school?useSSl=false";
        String username = "root";
        String pass = "knr443";

        try {
            
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,username,pass);

            Statement st = con.createStatement();
            st.executeUpdate("create table faculty(int id, name varchar(20), subject varchar(20))");

            con.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
    
}