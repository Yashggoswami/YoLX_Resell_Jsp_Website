import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.*;

@WebServlet("/Login")
public class Login extends HttpServlet {
    Connection con=null;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email=request.getParameter("email");
        String pass=request.getParameter("pass");
        Savedata ob=new Savedata();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/yolx_schema", "root", "Y@24giri");
            PreparedStatement pr=con.prepareStatement("SELECT * FROM userdata WHERE email=? and password=?");
            System.out.println("sdklcl");

            pr.setString(1,email);
            pr.setString(2,pass);

            ResultSet rs=pr.executeQuery();
            HttpSession session=request.getSession();
            if(rs.next())
            {
                String uname=rs.getString("uname");
                session.setAttribute("uname",uname);
                session.setAttribute("image",rs.getString("profile_img"));
                Blob blob=rs.getBlob("profile_img");
                session.setAttribute("blob",blob);
                session.setAttribute("message","Welcome "+uname);
                response.sendRedirect("home.jsp");
            }
            else{
                String message="Invalid Email or password";
                System.out.println("hrl");
                session.setAttribute("message",message);
                response.sendRedirect("login.jsp");

            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }


}
