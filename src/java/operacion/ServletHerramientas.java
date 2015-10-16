
package operacion;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ValidarUser;


@WebServlet(name = "ServletHerramientas", urlPatterns = {"/ServletHerramientas"})
public class ServletHerramientas extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            ValidarUser u = new ValidarUser();
            
            String res = u.validar(request.getParameter("usuario"),request.getParameter("password"));
            
            
            
            if(res.equals("true"))
            {
                HttpSession s = request.getSession();
                s.setAttribute("validacion", res);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/herramientas.jsp");
                dispatcher.forward(request, response);
                
                
            }
            else
            {
                HttpSession s = request.getSession();
                s.setAttribute("validacion", res);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
                dispatcher.forward(request, response);
            }
            
            }
               
    
    
    }

    

   
    

