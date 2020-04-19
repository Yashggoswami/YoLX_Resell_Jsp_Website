import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.imageio.stream.FileImageInputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@MultipartConfig(maxFileSize = 169999999)
@WebServlet("/Signup")
public class Signup extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname=request.getParameter("username");
        String fullname=request.getParameter("fullname");
        String email=request.getParameter("email");
        String password=request.getParameter("password");


        Part filepart=request.getPart("image");
        InputStream img=null;
        if(filepart!=null){
         img=filepart.getInputStream();}
        System.out.println(filepart.getName());
        Savedata ob=new Savedata();
        boolean b=ob.check(uname,fullname,email,password,img);
        HttpSession session=request.getSession();
        if(b==true)
        {

            session.setAttribute("uname",uname);
            session.setAttribute("image",img);
            session.setAttribute("message","hey "+fullname+"!\nYour account has been created successfully");
            response.sendRedirect("login.jsp");
        }
        else{
            String msg="Something Went Wrong";
            session.setAttribute("message",msg);
            response.sendRedirect("login.jsp");
        }

    }
}
