# Soft Sales

API do Projeto Soft Sales - Gestão de vendas

## Requisitos

- [ ] CRUD de Produtos
- [ ] CRUD de Vendas
- [ ] CRUD de Clientes
- [ ] CRUD de Usuários
- [ ] Autenticação
- [ ] Dashboard

## Documentação da API

### Endpoints

- [Listar Produtos](#listar-produtos)
- [Cadastrar Produto](#cadastrar-produto)
- [Detalhar Produto](#detalhar-produto)
- [Apagar Produto](#apagar-produto)
- [Atualizar Produto](#atualizar-produto)

### Listar Produtos

`GET` /produto

Retorna um array com os produtos do usuário autenticado.

### Exemplo de Resposta

```js
[
    {
        "id": 1,
        "nome": "Mouse Logitech G Pro X",
        "valor": 700.00
    }
]
```

#### Códigos de Status

|código|descrição
|------|---------
|200| Lista de produtos retornado com sucesso
|401| Não autenticado. Se autentique em /login
---

### Cadastrar Produto

`POST` /produto

Cadastre um produto com os dados enviados no corpo da requisição.

#### Corpo da Requisição

|campo|tipo|obrigatório|descrição
|-----|----|:-----------:|---------
|nome|string|✅| Um nome suficiente para descrição
|valor|double|✅| O valor do produto
---

#### Exemplo de Requisição
```js
// Post /produto
{
    "nome": "Mouse Logitech G Pro X"
}
```

#### Exemplo de Resposta
```js
{
        "id": 1,
        "nome": "Mouse Logitech G Pro X",
        "valor": 700.00
}
```

#### Código de Status

|código|descrição
|------|---------
|201| Produtos cadastrado com sucesso
|400| Validação falhou. Verifique o corpo da requisição
|401| Não autenticado. Se autentique em /login
|403| Não autorizado. O usuário não possui permissão
---

### Detalhar Produto

`GET` /produto/`{id}`

Retorna os detalhes da categoria com o `id` informado no path.

#### Exemplo de Resposta
```js
// GET /produto/1
{
        "id": 1,
        "nome": "Mouse Logitech G Pro X",
        "valor": 700.00
}
```

#### Códigos de Status

|código|descrição
|------|---------
|200| Produto retornado com sucesso
|401| Não autenticado. Se autentique em /login
|403| Não autorizado. O usuário não possui permissão
|404| Não existe produto com o `id` informado
---

### Apagar Produto

`DELETE` /produto/`{id}`

Apaga o produto com o `id` informado no path

#### Código de Status

|código|descrição
|------|---------
|204| Produto deletado com sucesso
|401| Não autenticado. Se autentique em /login
|403| Não autorizado. O usuário não possui permissão
|404| Não existe produto com o `id` informado
---

### Atualizar Produto
`PUT` /produto/`{id}`

Altere os dados cadastrados do produto.

#### Corpo da Requisição

|campo|tipo|obrigatório|descrição
|-----|----|:-----------:|---------
|nome|string|✅| Um novo nome suficiente para descrição
|valor|double|✅| Um novo valor do produto
---

#### Exemplo de Requisição
```js
// PUT /produto/1
{
    "nome": "Teclado Razer Huntsman Tournament Edition",
    "valor": 1000.00
}
```

#### Exemplo de Resposta
```js
{
        "id": 1,
        "nome": "Teclado Razer Huntsman Tournament Edition",
        "valor": 1000.00
}
```

#### Código de Status

|código|descrição
|------|---------
|200| Produto atualizado com sucesso
|400| Validação falhou. Verifique o corpo da requisição
|401| Não autenticado. Se autentique em /login
|403| Não autorizado. O usuário não possui permissão
|404| Não existe produto com o `id` informado
---

