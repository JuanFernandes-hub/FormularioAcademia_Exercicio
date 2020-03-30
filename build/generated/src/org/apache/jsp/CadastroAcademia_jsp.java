package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CadastroAcademia_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Cadastro de Usuário Academia</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <!--<link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\n");
      out.write("              integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <!-- Mascaras JqueryMask -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"jquery.mask.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\"#telefone\").mask('(00) 00000-0000');\n");
      out.write("\n");
      out.write("                $(\"#cep\").mask('00.000-000');\n");
      out.write("\n");
      out.write("                $(\"#dataNasc\").mask('99/99/9999');\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Valicação com javascript -->\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("            function validaForm(frmTeste) {\n");
      out.write("                if (frmTeste.nome.value == \"\" || frmTeste.nome.value == null || frmTeste.nome.value.length < 3) {\n");
      out.write("                    alert(\"Digite seu nome\");\n");
      out.write("                    frmTeste.nome.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (frmTeste.email.value.indexOf('@') == -1 || frmTeste.email.value.indexOf('.') == -1 || frmTeste.email.value == null || frmTeste.email.value == \"\") {\n");
      out.write("                    alert(\"Digite seu email corretamente\");\n");
      out.write("                    frmTeste.email.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (frmTeste.dataNasc.value == null || frmTeste.dataNasc.value == \"\" || frmTeste.dataNasc.value.length != 10) {\n");
      out.write("                    alert(\"Digite sua data de nascimento completa\");\n");
      out.write("                    frmTeste.dataNasc.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("               \n");
      out.write("                if (frmTeste.endereco.value == \"\" || frmTeste.endereco.value == null) {\n");
      out.write("                    alert(\"Digite seu endereço\");\n");
      out.write("                    frmTeste.endereco.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (frmTeste.cep.value == null || frmTeste.cep.value == \"\" || frmTeste.cep.value.length < 10) {\n");
      out.write("                    alert(\"Digite seu cep completo\");\n");
      out.write("                    frmTeste.cep.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                //Radio\n");
      out.write("                var escolhaSexo = -1; //valor padrao para sexo, nada foi escolhido\n");
      out.write("                //for(i = frmTeste.sexo.length (2 sexos) -1 (=1)\n");
      out.write("                for (i = frmTeste.nSexo.length - 1; i > -1; i--) {\n");
      out.write("                    //verifica a posição 0 e 1\n");
      out.write("                    if (frmTeste.nSexo[i].checked) {\n");
      out.write("                        escolhaSexo = i;\n");
      out.write("                        //se 0, entao masculino\n");
      out.write("                        //se 1, entao feminino\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                }\n");
      out.write("                if (escolhaSexo == -1) {\n");
      out.write("                    alert(\"Escolha um sexo\")\n");
      out.write("                    frmTeste.nSexo[0].focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (frmTeste.telefone.value.length != 15 || frmTeste.telefone.value == \"\" || frmTeste.telefone.value == null) {\n");
      out.write("                    alert(\"Digite seu telefone\");\n");
      out.write("                    frmTeste.telefone.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("                //Combo\n");
      out.write("\n");
      out.write("\n");
      out.write("                if (frmTeste.nAtividade.value == \"\" || frmTeste.nAtividade.value == null) {\n");
      out.write("                    alert(\"Escolha uma atividade\");\n");
      out.write("                    frmTeste.telefone.focus();\n");
      out.write("                    return false;\n");
      out.write("\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Formulário será construtido dentro do container -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div>\n");
      out.write("                <h1>Academia</h1>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-8\">\n");
      out.write("                    <div class=\"col p-3 mb-2 bg-dark text-white no-gutters\">Cadastre-se</div>\n");
      out.write("                    <!--<h1 class=\"p-3 mb-2 bg-dark text-white \">Cadastre-se</h1>-->\n");
      out.write("\n");
      out.write("                    <form name=\"frmTeste\" method=\"post\" action=\"cadastrarAluno\" onsubmit=\"return validaForm(this);\">\n");
      out.write("\n");
      out.write("                        <!-- -class from-group -->\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <label for=\"nome\">Nome</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"nNome\" id=\"nome\" required>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <label for=\"email\">E-mail</label>\n");
      out.write("                                <input type=\"email\" class=\"form-control\" name=\"nEmail\" id=\"email\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"dataNasc\">Data de Nascimento</label>\n");
      out.write("                            <input type=\"String\" class=\"form-control\" name=\"nDataNasc\" id=\"dataNasc\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"endereco\">Endereço</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"nEndereco\" id=\"endereco\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"cep\">CEP</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"nCep\" id=\"cep\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"telefone\">Telefone</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"nTelefone\" id=\"telefone\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("                        <!-- combo -->\n");
      out.write("                        \n");
      out.write("                        <div>\n");
      out.write("                            <select name=\"nAtividade\">\n");
      out.write("\n");
      out.write("                                <option value=\"musculacao\" name=\"nAtividade\"> Musculação</option>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <option value=\"pilates\" name=\"nAtividade\"> Pilates</option>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <option value=\"crossfit\" name=\"nAtividade\"> Crossfit</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("                        <!-- RADIO - selecionar somente uma opção -->\n");
      out.write("                        <div class=\"radio\">\n");
      out.write("                            <label>\n");
      out.write("                                <input type=\"radio\" name=\"nSexo\" value=\"M\"> Masculino\n");
      out.write("                            </label>\n");
      out.write("\n");
      out.write("                            <label>\n");
      out.write("                                <input type=\"radio\" name=\"nSexo\" value=\"F\"> Feminino\n");
      out.write("                            </label>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-success\">Cadastrar</button>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Optional JavaScript -->\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"\n");
      out.write("                integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"\n");
      out.write("                integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
