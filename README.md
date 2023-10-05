# Teste-caixa-branca

## Descrição

A seguir serão descritos os erros encontrados na classe User, a qual tem como responsabilidade
autenticar usuários em um banco de dados MySQL. 

package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
    <mark>1</mark> public Connection conectarBD() {
        <mark>1</mark> Connection conn = null;
        <mark>1</mark> try {
            <mark>1</mark> Class.forName("com.mysql.jdbc.Driver").newInstance();
            <mark>1</mark> String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            <mark>1</mark> conn = DriverManager.getConnection(url);
        } <mark>1</mark> catch (Exception e) {6 }
        <mark>1</mark> return conn;}
    public String nome = "";
    public boolean result = false;
    public boolean verificarUsuario(String login, String senha) {
        String sql = "";
        Connection conn = conectarBD();
        // INSTRUÇÃO SQL
        sql += "select nome from usuarios ";
        sql += "where login = " + "'" + login + "'";
        sql += " and senha = " + "'" + senha + "';";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                result = true;
                nome = rs.getString("nome");}
        } catch (Exception e) { }
        return result; }
} //fim da class



