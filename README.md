# Teste-caixa-branca

## Descrição

A seguir serão descritos os erros encontrados na classe User, a qual tem como responsabilidade
autenticar usuários em um banco de dados MySQL. 

```java
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
public Connection conectarBD() {
Connection conn = null;
try {
Class.forName("com.mysql.jdbc.Driver").newInstance();
String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
conn = DriverManager.getConnection(url);
} catch (Exception e) { }
return conn;
}



