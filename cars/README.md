# Cars API

## Pemissa

API Spring para carros. Foi desenvolvido um CRUD completo.

- Rota POST **"/api/cars"** para realizar a inserção de um novo carro.
- Rota GET **"/api/cars"** para realizar a busca de todos os carros cadastrados.
- Rota PUT **"/api/cars/{id}"** para atualizar os dados de um carro cadastrado.
- Rota DELETE **"/api/cars/{id}"** para deletar um carro cadastrado.

$~$

Utlizando conceitos de DTOs, models, controladores, serviços e repositórios.

```json
Para as rotas POST e PUT

    body:

    {
        "carModel": "Fiat UNO 1.3",
        "manufacturer": "Fiat",
        "manufactureDate": "10/02/2006",
        "price": 13.000,
        "modelYear": 2006
    }
```
