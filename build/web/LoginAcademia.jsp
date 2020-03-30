<%-- 
    Document   : LoginAcademia
    Created on : 22/03/2020, 19:01:55
    Author     : juann
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- COPIA -->
<html>
    <head>
        <title>Cadastro de Usuário Academia</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!--<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <form name="frmLogin" method="post" action="teste" onsubmit="#">

                <div class="col-6 mt-3">
                    <div class="row"style="background-color: black; padding-left: 20px">
                        <h1 style=" color: white;">Login</h1>
                    </div>
                    <small><i>ei, o user é <b>juan</b> e senha <b>123, </b>shiuuu! você não ouviu nada...</i></small>

                    <div class="row">
                        <div class="col">
                            <label for="idUsuario">Usuario</label>
                            <input type="text" class="form-control" name="nUsuario" id="idUsuario" required>
                        </div>

                        <div class="col">
                            <label for="idSenha">Senha</label>
                            <input type="password" class="form-control" name="nSenha" id="idSenha" required>
                        </div>
                    </div>
                    
                    <button type="submit" class="btn btn-success mt-3">Cadastrar</button>
                </div>
                

            </form>
        </div>

        <!-- Optional JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
                integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
                integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
    </body>
</html>
