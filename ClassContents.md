# API REST

## Métodos comuns:
- **GET:** Buscar uma informação
- **PUT:** Alterar uma informação
- **POST:** Inserir uma informação
- **DELETE:** Remover uma informação
- **PATCH:** Alteraração PONTUAL de uma informação

## Os tipos de parâmetros:
- **Body:** Corpo da requisição, utilizado para criar ou alterar recursos
    ```json
    {
        "name": "Naruto",
        "idade": 25
    }
    ```
- **Query Params:** Parâmetros nomeados enviados na rota após "?" (Filtros, paginação)
    - Exemplo: `http://localhost:3333/users?name=Naruto&idade=25`
- **Route Params:** Identificar um recurso na alteração ou remoção
    - Exemplo: `http://localhost:3333/users/1`