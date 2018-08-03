/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.entra21java.web.alimentos;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Guilherme Bialas
 */
@WebServlet(urlPatterns = "/alimentos/cadastro")
public class AlimentoCadastro extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Alimentos - Cadastro</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<form action='/alimentos/store' method='post'>");
        out.println("<div>");
        out.println("<label for='campo-nome'>Name</label>");
        out.println("<input type='text' id='campo-nome' name='nome'>");
        out.println("</div>");
        out.println("<div>");
        out.println("<label for='campo-quantidade'>Quantidade</label>");
        out.println("<input type='text' id='campo-quantidade' name='quantidade'>");
        out.println("</div>");
        out.println("<div>");
        out.println("<label for='campo-preco'>Preço</label>");
        out.println("<input type='text' id='campo-preco' name='preco'>");
        out.println("</div>");
        out.println("<div>");
        out.println("<label for='campo-descricao'>Descrição</label>");
        out.println("<textarea id='campo-descricao' name='descricao'>");
        out.println("</textarea>");
        out.println("</div>");
        out.println("<input type='submit' value='Cadastrar'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");

    }

}
