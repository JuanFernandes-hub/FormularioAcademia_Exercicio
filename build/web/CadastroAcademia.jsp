<%-- 
    Document   : CadastroAcademia
    Created on : 22/03/2020, 14:51:19
    Author     : juann
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Cadastro de Usuário Academia</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!--<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <!-- Mascaras JqueryMask -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
        <script type="text/javascript" src="jquery.mask.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                $("#telefone").mask('(00) 00000-0000');

                $("#cep").mask('00.000-000');

                $("#dataNasc").mask('99/99/9999');
            });
        </script>


        <!-- Valicação com javascript -->
        <script type="text/javascript">

            function validaForm(frmTeste) {
                if (frmTeste.nome.value == "" || frmTeste.nome.value == null || frmTeste.nome.value.length < 3) {
                    alert("Digite seu nome");
                    frmTeste.nome.focus();
                    return false;
                }

                if (frmTeste.email.value.indexOf('@') == -1 || frmTeste.email.value.indexOf('.') == -1 || frmTeste.email.value == null || frmTeste.email.value == "") {
                    alert("Digite seu email corretamente");
                    frmTeste.email.focus();
                    return false;
                }

                if (frmTeste.dataNasc.value == null || frmTeste.dataNasc.value == "" || frmTeste.dataNasc.value.length != 10) {
                    alert("Digite sua data de nascimento completa");
                    frmTeste.dataNasc.focus();
                    return false;
                }
               
                if (frmTeste.endereco.value == "" || frmTeste.endereco.value == null) {
                    alert("Digite seu endereço");
                    frmTeste.endereco.focus();
                    return false;
                }

                if (frmTeste.cep.value == null || frmTeste.cep.value == "" || frmTeste.cep.value.length < 10) {
                    alert("Digite seu cep completo");
                    frmTeste.cep.focus();
                    return false;
                }

                //Radio
                var escolhaSexo = -1; //valor padrao para sexo, nada foi escolhido
                //for(i = frmTeste.sexo.length (2 sexos) -1 (=1)
                for (i = frmTeste.nSexo.length - 1; i > -1; i--) {
                    //verifica a posição 0 e 1
                    if (frmTeste.nSexo[i].checked) {
                        escolhaSexo = i;
                        //se 0, entao masculino
                        //se 1, entao feminino
                    }

                }
                if (escolhaSexo == -1) {
                    alert("Escolha um sexo")
                    frmTeste.nSexo[0].focus();
                    return false;
                }

                if (frmTeste.telefone.value.length != 15 || frmTeste.telefone.value == "" || frmTeste.telefone.value == null) {
                    alert("Digite seu telefone");
                    frmTeste.telefone.focus();
                    return false;
                }


                //Combo


                if (frmTeste.nAtividade.value == "" || frmTeste.nAtividade.value == null) {
                    alert("Escolha uma atividade");
                    frmTeste.telefone.focus();
                    return false;

                }

            }
        </script>
    </head>
    <body>
        <!-- Formulário será construtido dentro do container -->
        <div class="container">
            <div>
                <h1>Academia</h1>
            </div>

            <div class="row">
                <div class="col-sm-8">
                    <div class="col p-3 mb-2 bg-dark text-white no-gutters">Cadastre-se</div>
                    <!--<h1 class="p-3 mb-2 bg-dark text-white ">Cadastre-se</h1>-->

                    <form name="frmTeste" method="post" action="cadastrarAluno" onsubmit="return validaForm(this);">

                        <!-- -class from-group -->
                        <div class="row">
                            <div class="col">
                                <label for="nome">Nome</label>
                                <input type="text" class="form-control" name="nNome" id="nome" required>
                            </div>

                            <div class="col">
                                <label for="email">E-mail</label>
                                <input type="email" class="form-control" name="nEmail" id="email" required>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="dataNasc">Data de Nascimento</label>
                            <input type="String" class="form-control" name="nDataNasc" id="dataNasc" required>
                        </div>

                        <div class="form-group">
                            <label for="endereco">Endereço</label>
                            <input type="text" class="form-control" name="nEndereco" id="endereco" required>
                        </div>
                        
                        <div class="form-group">
                            <label for="cep">CEP</label>
                            <input type="text" class="form-control" name="nCep" id="cep" required>
                        </div>
                        
                        <div class="form-group">
                            <label for="telefone">Telefone</label>
                            <input type="text" class="form-control" name="nTelefone" id="telefone" required>
                        </div>
                        

                        <!-- combo -->
                        
                        <div>
                            <select name="nAtividade">

                                <option value="musculacao" name="nAtividade"> Musculação</option>



                                <option value="pilates" name="nAtividade"> Pilates</option>



                                <option value="crossfit" name="nAtividade"> Crossfit</option>
                            </select>
                        </div>
                        

                        <!-- RADIO - selecionar somente uma opção -->
                        <div class="radio">
                            <label>
                                <input type="radio" name="nSexo" value="M"> Masculino
                            </label>

                            <label>
                                <input type="radio" name="nSexo" value="F"> Feminino
                            </label>

                        </div>
                        <br>
                        <button type="submit" class="btn btn-success">Cadastrar</button>

                    </form>
                </div>

            </div>
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
