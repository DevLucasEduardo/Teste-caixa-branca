package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * A classe User é responsável por estabelecer a conexão com o banco de dados e autenticar usuários.
 */
public class User {

    /**
     * O método conectarBD cria a conexão com o banco de dados.
     *
     * @return Instância do objeto do tipo Connection caso a conexão seja criada com sucesso,
     * caso contrário retorna um valor nulo.
     */
    public Connection conectarBD() {
        Connection conn = null;
        // Tentativa de conexão com o banco de dados
        try {
            // Classe do driver MySQL
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            // Cria-se a conexão com o banco através da URL com o nome do usuário e sua senha.
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        }
        // Caso a tentativa de errado o método não trata a exceção
        catch (Exception e) { }
        return conn;
    }

    /**
        Atributo nome do tipo string será usado na veríficação do usuário.
     **/
    public String nome = "";

    /**
     * Atributo result será usado para verificar se a conexão foi bem sucedida.
     */
    public boolean result = false;

    /**
     * O método verificarUsuário verifica se o usuário consta no banco de dados.
     *
     * @param login O nome de usuário.
     * @param senha A senha do usuário.
     * @return true caso o usuário seja encontrado no banco de dados, caso contrário retorna false.
     */
    public boolean verificarUsuario(String login, String senha) {
        // Variável que receberá as instruções MySQL
        String sql = "";
        // Conexão com o banco através do método conectarBD()
        Connection conn = conectarBD();

        // Variável carrega uma string com as instruções SQL que serão usadas para autenticar o usuário.
        sql += "select nome from usuarios ";
        sql += "where login = " + "'" + login + "'";
        sql += " and senha = " + "'" + senha + "';";

        // Será feita a tentativa de realizar a consulta SQL.
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            // Caso exista uma linha com o usuário abaixo do ResultSet rs, o método next() retornará true.
            if (rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }
        }
        // Caso a tentativa de errado o método não trata a exceção
        catch (Exception e) { }
        return result;
    }
}


