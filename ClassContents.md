# API REST

## M�todos comuns:
- **GET:** Buscar uma informa��o
- **PUT:** Alterar uma informa��o
- **POST:** Inserir uma informa��o
- **DELETE:** Remover uma informa��o
- **PATCH:** Alterara��o PONTUAL de uma informa��o

## Os tipos de par�metros:
- **Body:** Corpo da requisi��o, utilizado para criar ou alterar recursos
    ```json
    {
        "name": "Naruto",
        "idade": 25
    }
    ```
- **Query Params:** Par�metros nomeados enviados na rota ap�s "?" (Filtros, pagina��o)
    - Exemplo: `http://localhost:3333/users?name=Naruto&idade=25`
- **Route Params:** Identificar um recurso na altera��o ou remo��o
    - Exemplo: `http://localhost:3333/users/1`