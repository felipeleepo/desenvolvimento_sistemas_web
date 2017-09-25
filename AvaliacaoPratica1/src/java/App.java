import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author felipe
 */
@WebServlet(urlPatterns = {"/App"})
public class App extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int v1 = Integer.parseInt(request.getParameter("valor1"));
        int v2 = Integer.parseInt(request.getParameter("valor2"));
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>AV1 - SUBTRAÇÃO</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>SOMA</h1>");
            out.println("<p>"+v1+" + "+v2+" = "+(v1+v2)+"</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int v3 = Integer.parseInt(request.getParameter("valor3"));
        int v4 = Integer.parseInt(request.getParameter("valor4"));
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>AV1 - SOMA</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>SUBTRAÇÃO</h1>");
            out.println("<p>"+v3+" - "+v4+" = "+(v3-v4)+"</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
