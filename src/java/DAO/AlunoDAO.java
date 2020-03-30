/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import model.Aluno;

/**
 *
 * @author user
 */
public class AlunoDAO {
    static Connection c;

    public static boolean insereAluno(Aluno aluno) throws ParseException {
        c = ConnectionFactory.getConnection();

        String sql = "INSERT INTO aluno(nome,email,endereco,cep,telefone,atividade,sexo,dataNasc) "
                + "VALUES (?,?,?,?,?,?,?,?);";

        //converte String em Date
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String dataStr = aluno.getDataNasc();
        java.sql.Date data = new java.sql.Date(format.parse(dataStr).getTime());

        try {
            PreparedStatement ppstt = c.prepareStatement(sql);
            ppstt.setString(1, aluno.getNome());
            ppstt.setString(2, aluno.getEmail());
            ppstt.setString(3, aluno.getEndereco());
            ppstt.setString(4, aluno.getCep());
            ppstt.setString(5, aluno.getTelefone());
            ppstt.setString(6, aluno.getAtividade());
            ppstt.setString(7, aluno.getSexo());
            ppstt.setDate(8, data);
            ppstt.execute();
            ppstt.close();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }

    /*
    public static List<Aluno> getAluno(){
        List<Usuario> usuarios = new ArrayList<Usuario>();
        String sql = "SELECT * FROM usuario;";
        c = ConnectionFactory.getConnection();
        try{
            PreparedStatement ppstt = c.prepareStatement(sql);
            ResultSet rs = ppstt.executeQuery();
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("idusuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSenha(rs.getString("senha"));
                usuarios.add(usuario);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return usuarios;
    }
    
    public Usuario getUsuario(String login, String senha){
        String sql = "SELECT * FROM usuario WHERE login = ? AND senha = ?";
        c = ConnectionFactory.getConnection();
        try{
            PreparedStatement ppstt = c.prepareStatement(sql);
            ppstt.setString(1,login);
            ppstt.setString(2,senha);
            ResultSet rs = ppstt.executeQuery();
            if(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("idusuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSenha(rs.getString("senha"));
                return usuario;
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return null;
    }
     */
 /*
    public static void apagaUsuario(int idusuario){
        c = ConnectionFactory.getConnection();
        String sql = "DELETE FROM usuario WHERE idusuario = "+idusuario+"; ";
        try{
            PreparedStatement ppstt = c.prepareStatement(sql);
            ppstt.executeQuery();
            ppstt.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
            fecharConexao();
        }
    }
     */
    private static void fecharConexao() {
        try {
            c.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
