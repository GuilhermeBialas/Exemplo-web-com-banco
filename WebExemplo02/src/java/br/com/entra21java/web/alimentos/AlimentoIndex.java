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
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Guilherme Bialas
 */
@WebServlet(urlPatterns = "/alimentos")
public class AlimentoIndex extends HttpServlet {
    //Index é o principal

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<AlimentoBean> alimentos = new AlimentoDAO.obterTodos();
        PrintWriter out = resp.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Alimentos - Lista</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("");
        out.println("<h3>Lista de Alimentos</h3>");
        out.println("<a href='/WebExemplo02/alimentos/cadastro' class='botao-cadstro'>NovoAçimento</>");
        out.println("<table>");
        out.println("<thead>");
        out.println("<tr>");
        out.println("<th>Código</th>");
        out.println("<th>Nome</th>");
        out.println("<th>Quantidade</th>");
        out.println("<th>Preço</th>");
        out.println("<th>Ação</th>");
        out.println("</tr>");
        out.println("</thead>");
        out.println("<tbody>");
      
        for(AlimentoBean alimento: alimentos){
        out.println("<tr>");
        out.println("<td>"+ alimento.getId()+"</td>");
        out.println("<td>"+ alimento.getNome()+"</td>");
        out.println("<td>"+ alimento.getQuantidade() +"</td>");
        out.println("<td>"+ alimento.getPreco()+"</td>");
        out.println("<td>");
        out.println("<a href'/WebExemplo02/alimentos/editar?id="+alimento.getId()+"'class='botao-editar'>Editar</a>");
        out.println("<a href'/WebExemplo02/alimentos/excluir?id="+alimento.getId()+"'class='botao-excluir'>Excluir</a>");
        
        
        
        out.println("</td>");
        out.println("</tr>");
        
        }
        out.println("</tbody>");
        out.println("<tfoot>");
        out.println("<tr>");
        out.println("<td>Código</td>");
        out.println("<td>Nome</td>");
        out.println("<td>Quantidade</td>");
        out.println("<td>Preço</td>");
        out.println("<td>Ação</td>");
        out.println("</tr>");
        out.println("</tfoot>");
        out.println("</table>");
        out.println("");
        out.println("</body>");
        out.println("</html>");
    }

}
