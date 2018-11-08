/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LSTI204_C6
 */
@WebServlet(urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
             out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletFregon</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form action=\"\" method=\"get\">");
            
            out.println("<p>Nombre: <input type=\"text\" name=\"nombre\" size=\"40\" /></p>");                            
            out.println("<p>Apellidos: <input type=\"text\" name=\"apellidos\" size=\"40\" placeholder=\"Escriba sus dos apellidos\" /></p");
            out.println("</br>");
            
            out.println("<label for=\"email\">Direccion de Correo Electronico:</label>");
            out.println("<input type=\"email\" placeholder=\"ejemplo@hola.com\" name=\"email\" id=\"email\">");
            out.println("</br>");
            
            out.println("<label for=\"pass\">Password:</label>");
            out.println("<input type=\"password\" name=\"contraseña\" id=\"pass\">");
            out.println("</br>");
            
            out.println("<p>Año de nacimiento: <input type=\"number\" name=\"nacido\" min=\"1940\" max=\"2018\" /></p>");
            out.println("<p>Mes: <input type=\"number\" name=\"mess\" min=\"01\" max=\"12\"/></p>");
            out.println("<p>Dia: <input type=\"number\" name=\"diaa\" min=\"01\" max=\"31\"/></p>");
            out.println("</br>");
            out.println("</br>");
            out.println("</br>");
            out.println("<button type=\"reset\">Borrar todo</button>");
            out.println("<input type=\"submit\" name=\"submit\" value=\"enviar\"/>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
                try (PrintWriter out = response.getWriter()) {
                    String nombre = request.getParameter("nombre");
                    String apellidos = request.getParameter("apellidos");
                    String email = request.getParameter("email");
                    String contraseña = request.getParameter("contraseña");
                    String nacido = request.getParameter("nacido");
                    String mess = request.getParameter("mess");
                    String diaa= request.getParameter("diaa");
                    out.println(nombre);
                    out.println(apellidos);
                    out.println(email);
                    out.println(contraseña);
                    out.println(nacido);
                    out.println(mess);
                    out.println(diaa);
                    
                    
                }
        //doGet(request, response);
    }
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
