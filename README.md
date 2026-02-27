# 🍃 API REST com Spring Boot e MongoDB

API REST integrada com banco de dados NoSQL MongoDB. Projeto com foco nas diferenças práticas entre bancos relacionais e não relacionais, modelagem de documentos e operações CRUD.

## 📌 Sobre o Projeto

Aplicação backend desenvolvida para explorar a integração do Spring Boot com MongoDB, abordando conceitos como modelagem de documentos, referências vs embeddings e consultas com Spring Data.

## ✨ Funcionalidades

- CRUD completo com MongoDB
- Modelagem de documentos com `@Document`
- Relacionamentos por referência e por embedding
- Consultas customizadas com `@Query` e MongoRepository
- DTOs para transferência de dados
- Tratamento de exceções

## 🛠️ Tecnologias

| Tecnologia | Versão |
|---|---|
| Java | 17+ |
| Spring Boot | 3.x |
| Spring Data MongoDB | - |
| MongoDB | - |
| Maven | - |

## 🏗️ Arquitetura

```
src/main/java/
└── com/endriw/workshopmongo/
    ├── config/           # Seed de dados
    ├── domain/           # Documentos MongoDB
    ├── dto/              # Data Transfer Objects
    ├── repository/       # Interfaces MongoRepository
    ├── services/         # Regras de negócio
    │   └── exception/    # Exceções customizadas
    └── resources/        # Controllers REST
        └── exception/    # Handler global
```

## 📡 Endpoints

```
GET    /users              → Lista usuários
GET    /users/{id}         → Busca por ID
POST   /users              → Cria usuário
PUT    /users/{id}         → Atualiza usuário
DELETE /users/{id}         → Remove usuário
GET    /users/{id}/posts   → Posts do usuário

GET    /posts/{id}         → Busca post
GET    /posts/titlesearch  → Busca por título
GET    /posts/fullsearch   → Busca por texto e data
```

## ▶️ Como Executar

**Pré-requisitos:** MongoDB rodando localmente na porta 27017

```bash
# Clone o repositório
git clone https://github.com/EndriwEngSoft/workshop-springboot4-mongodb.git

# Entre na pasta
cd workshop-springboot4-mongodb

# Execute
./mvnw spring-boot:run
```

Acesse: `http://localhost:8080`

> Ou use MongoDB Atlas (cloud) atualizando a string de conexão no `application.properties`.

## 🧠 Conceitos Aplicados

- Diferenças entre modelo relacional e orientado a documentos
- Embedding vs referência em documentos MongoDB
- Spring Data MongoDB com `MongoRepository`
- Consultas com `@Query` e critérios de busca por data e texto
- Padrão DTO para exposição controlada dos dados

## 👨‍💻 Autor

**Endriw Colvara Bento**  
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=flat&logo=linkedin&logoColor=white)](https://linkedin.com/in/endriw-bento)
[![Portfólio](https://img.shields.io/badge/Portf%C3%B3lio-000?style=flat&logo=vercel&logoColor=white)](https://portfolio-endriw.vercel.app)
