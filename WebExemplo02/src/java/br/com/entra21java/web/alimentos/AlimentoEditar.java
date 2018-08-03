/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.entra21java.web.alimentos;

import br.com.entra21java.bean.AlimentoBean;
import br.com.entra21java.dao.AlimentoDAO;
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
@WebServlet(urlPatterns = "/alimentos/editar")
public class AlimentoEditar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        
        int id= Integer.parseInt(req.getPatrameter("id"));
        AlimentoBean alimento = new AlimentoDAO().obterPeloId(id);
        PrintWriter out = resp.getWriter();
         out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Alimentos - Editar</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<form action='/alimentos/update' method='post'>");
        out.println("<input type='hidden' name='id' value='1'>");
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
        out.println("<input type='submit' value='Alterar'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

}
