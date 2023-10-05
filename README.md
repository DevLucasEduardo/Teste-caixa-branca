# Teste-caixa-branca

## Descrição 

A seguir serão feitos um grafo de fluxo, cálculo de complexidade ciclomática e as sequências possíveis para o código. 
O autor optou por separar diferentes grafos para cada método da classe por questões de organização e entendimento.

## Primeiro método enumerado por caminhos (conectarBD)
```
    public Connection conectarBD() {
    1   Connection conn = null;
    2   try {
          3 Class.forName("com.mysql.jdbc.Driver").newInstance();
          3 String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
          3 conn = DriverManager.getConnection(url);
        } 4 catch (Exception e) {} 5
       6 return conn;}

```

## Grafo de fluxo de controle 

![image](https://github.com/DevLucasEduardo/Teste-caixa-branca/assets/102432468/b9a10a7e-3f0a-4eaf-bc35-ffa01d23ca3b)


## Complexidade ciclomática

## Sequências possíveis



## Segundo método enumerado por caminhos (
```
    public boolean verificarUsuario(String login, String senha) {
     1  String sql = "";
     1  Connection conn = conectarBD();
        // INSTRUÇÃO SQL
     1  sql += "select nome from usuarios ";
     1  sql += "where login = " + "'" + login + "'";
     1  sql += " and senha = " + "'" + senha + "';";
     2  try {
         3  Statement st = conn.createStatement();
         3  ResultSet rs = st.executeQuery(sql);
         4  if (rs.next()) {
             5  result = true;
             5  nome = rs.getString("nome");}  
        } 6 catch (Exception e) { } 7
     8  return result; }
```

## Grafo de fluxo de controle 

![image](https://github.com/DevLucasEduardo/Teste-caixa-branca/assets/102432468/9520ceff-a7fe-4a46-85b0-470a8938e70d)


## Complexidade ciclomática

## Sequências possíveis


    




