/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;

import br.com.agrow.dao.CadastroDAO;
import br.com.agrow.entidades.Cadastro;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ricar
 */
@WebServlet(name = "CadastroSave", urlPatterns = {"/cadastro/CadastroSave"})
public class CadastroSave extends HttpServlet {
private static final long serialVersionUID = 1L;
    public CadastroSave() {
        super();
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException{
        doPost(request, response);
    }
@Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException{
        String cliente = request.getParameter("cliente");
        String solicitante = request.getParameter("solicitante");
        String descricao = request.getParameter("descricao");
        String data_limite = request.getParameter("data_limite");
        String responsavel = request.getParameter("responsavel");
        response.setContentType("text/html");
    try (PrintWriter out = response.getWriter()) {
        out.println("Bem Vindo<h3>"+cliente+" " +solicitante+"</h3>");
    }
        
    }
    }
