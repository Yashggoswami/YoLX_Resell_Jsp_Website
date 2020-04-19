import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;

@WebServlet("/ImageS")
public class ImageS extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        Blob blob= (Blob) session.getAttribute("blob");
        byte byteArray[]= new byte[0];
        try {
            byteArray = blob.getBytes(1,(int)blob.length());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ServletOutputStream os=response.getOutputStream();
        os.write(byteArray);
    }


}
