import java.awt.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;

public class Savedata {
    Connection con=null;

    public boolean check(String uname, String fullname, String email, String password, InputStream img)
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/yolx_schema", "root", "Y@24giri");
            PreparedStatement pr=con.prepareStatement("INSERT INTO userdata VALUES (?,?,?,?,?)");
            System.out.println(uname);
            pr.setString(1,uname);
            pr.setString(2,fullname);
            pr.setString(3,email);
            pr.setString(4,password);
            if(img==null)
            {pr.setBlob(5, (InputStream) null);}
            else{
            pr.setBlob(5,img);}
            pr.executeUpdate();
            pr.close();
            con.close();
            System.out.println("its done");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        return false;
    }
}
