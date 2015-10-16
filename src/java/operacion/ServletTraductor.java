
package operacion;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import model.Traductor;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author minutti
 */
@WebServlet(name = "ServletTraductor", urlPatterns = {"/ServletTraductor"})
public class ServletTraductor extends HttpServlet {

    
    @Override
            protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
           
            Traductor o = new Traductor();
            
            String res = o.Traducir(request.getParameter("palabra"),request.getParameter("idioma"));
            
            request.setAttribute("resultado", res);
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("/resultado.jsp");
            dispatcher.forward(request, response);
            
        
        }

  
}
