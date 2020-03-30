/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelet;

import DAO.AlunoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Aluno;

/**
 *
 * @author Janela
 */
public class cadastrarAluno extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        try (PrintWriter out = response.getWriter()) {
            Aluno aluno = new Aluno();
            String nome = (String) request.getParameter("nNome");
            String email = (String) request.getParameter("nEmail");
            String endereco = (String) request.getParameter("nEndereco");
            String cep = (String) request.getParameter("nCep");
            String telefone = (String) request.getParameter("nTelefone");
            String atividade = (String) request.getParameter("nAtividade");
            String sexo = (String) request.getParameter("nSexo");
            String dataNasc = (String) request.getParameter("nDataNasc");
            aluno.setNome(nome);
            aluno.setEmail(email);
            aluno.setEndereco(endereco);
            aluno.setCep(cep);
            aluno.setTelefone(telefone);
            aluno.setAtividade(atividade);
            aluno.setSexo(sexo);
            aluno.setDataNasc(dataNasc);

            AlunoDAO.insereAluno(aluno);
            RequestDispatcher rd = request.getRequestDispatcher("Salvo.html");
            rd.forward(request, response);

        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
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
        processRequest(request, response);
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

