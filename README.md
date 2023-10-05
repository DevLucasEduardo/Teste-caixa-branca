# Teste-caixa-branca

## Descrição

A seguir serão descritos os erros encontrados na classe User, a qual tem como responsabilidade
autenticar usuários em um banco de dados MySQL. 

# Teste-caixa-branca

## Descrição

package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
```
public class User {
    public Connection conectarBD() {
    1   Connection conn = null;
    2   try {
          3 Class.forName("com.mysql.jdbc.Driver").newInstance();
          3 String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
          3 conn = DriverManager.getConnection(url);
    4   } 5 catch (Exception e) {} 6
       7 return conn;}
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
```
asdasd



