# Teste-caixa-branca

## Descrição 1

A seguir serão feitos um grafo de fluxo, cálculo de complexidade ciclomática e as sequências possíveis para o código. 
O autor optou por separar diferentes grafos para cada método da classe por questões de organização e entendimento.

## Primeiro método enumerado por caminhos
```
    public Connection conectarBD() {
    1   Connection conn = null;
    2   try {
          3 Class.forName("com.mysql.jdbc.Driver").newInstance();
          3 String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
          3 conn = DriverManager.getConnection(url);
    4   } 5 catch (Exception e) {} 6
       7 return conn;}

```

## Grafo de fluxo de controle 

![image](https://github.com/DevLucasEduardo/Teste-caixa-branca/assets/102432468/aee69711-1571-48e6-8616-6c0316fdcee3)




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



