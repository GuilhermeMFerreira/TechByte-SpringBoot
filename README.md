# TechByte-SpringBoot

## Sobre o projeto

Este projeto tem como objetivo realizar a refatoração de uma aplicação desenvolvida inicialmente em Java puro para uma API Developing utilizando o framework Spring Boot.

A proposta é migrar a estrutura da aplicação para uma arquitetura baseada em camadas, permitindo a disponibilização dos dados por meio de endpoints HTTP e a integração com um banco de dados relacional.

O desenvolvimento faz parte de uma atividade acadêmica que busca aplicar os conceitos de desenvolvimento de APIs REST com Java e Spring Boot.

## Tecnologias utilizadas

- **Java** – Linguagem de programação.
- **Spring Boot** – Framework para desenvolvimento da API REST.
- **Spring Web** – Criação e disponibilização dos endpoints HTTP.
- **Spring Data JPA** – Persistência e comunicação com o banco de dados.
- **MySQL** – Sistema de gerenciamento de banco de dados.
- **Maven** – Gerenciamento de dependências e construção do projeto.
- **IntelliJ IDEA** – Ambiente de desenvolvimento.

## 1. Criação do projeto com Spring Initializr

O primeiro passo foi criar a estrutura inicial da aplicação utilizando o Spring Initializr.

A ferramenta permite configurar as características do projeto e selecionar as dependências necessárias para o desenvolvimento.

Acesse: https://start.spring.io/

### Configurações utilizadas

- Project: Maven
- Language: Java
- Packaging: Jar
- Java: [VERSÃO UTILIZADA]
- Spring Boot: [VERSÃO UTILIZADA]

### Dependências

- Spring Web
- Spring Data JPA
- MySQL Driver

Após selecionar as configurações e dependências, foi realizado o download do projeto, que posteriormente foi extraído e aberto no IntelliJ IDEA.

<img width="1524" height="719" alt="image" src="https://github.com/user-attachments/assets/cb639acb-62ff-4a79-81d5-4363564b5e52" />


## 2. Organização do projeto

Após a criação do projeto, foi realizada a organização das classes seguindo uma arquitetura em camadas.

A separação das responsabilidades facilita a manutenção, a organização e a evolução da aplicação.

### Estrutura utilizada

```text
src
└── main
    ├── java
    │   └── [PACOTE PRINCIPAL]
    │       ├── controllers
    |           └──protuto_ti_controller
    │       ├── TechbyteApplication
    │       └── entity
    │           └──produto_it
    |
    └── resources
        └── application.properties
```


## 3. Configuração do banco de dados

Para permitir a persistência das informações, foi realizada a configuração da conexão entre o Spring Boot e o banco de dados MySQL.

No arquivo `application.properties`, foram definidas as propriedades necessárias para estabelecer a conexão.

Exemplo de configuração:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/NOME_DO_BANCO
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

> As credenciais devem ser substituídas pelas configurações do ambiente local.

### Criação da tabela

A entidade foi mapeada utilizando as anotações do Jakarta Persistence (JPA), permitindo que o Hibernate realize o mapeamento entre a classe Java e a tabela correspondente no banco de dados.

Com a configuração `spring.jpa.hibernate.ddl-auto=update`, a estrutura da tabela pode ser criada automaticamente durante a inicialização da aplicação, caso ainda não exista.


## 4. Desenvolvimento da API REST

Com a estrutura do projeto e a conexão com o banco de dados configuradas, foram desenvolvidos os endpoints responsáveis por disponibilizar os dados da aplicação.

A API utiliza o protocolo HTTP e, conforme solicitado na atividade, foram implementadas somente operações do método GET.

### Método GET

O método GET é utilizado para consultar e recuperar informações, sem realizar alterações nos dados armazenados.

Os endpoints desenvolvidos permitem consultar os registros cadastrados no banco de dados.

### Endpoints

| Método | Rota | Descrição |
|---|---|---|
| GET | `/api/produtos` | Retorna a lista de produtos cadastrados. |
| GET | `/api/produtos/{id}` | Retorna um produto específico pelo seu identificador. |

> Ajustar as rotas acima de acordo com os endpoints efetivamente implementados no projeto.

## 5. Execução da aplicação

Para executar a API localmente, é necessário:

1. Ter o Java instalado e configurado.
2. Ter o MySQL em execução.
3. Configurar corretamente as credenciais do banco de dados.
4. Abrir o projeto no IntelliJ IDEA.
5. Executar a classe principal da aplicação, anotada com `@SpringBootApplication`.

Após a inicialização, a API estará disponível localmente, normalmente no endereço:

```text
http://localhost:8080
```

## 6. Teste da API

Após iniciar a aplicação, foram realizados testes para verificar o funcionamento dos endpoints disponibilizados.

Os testes foram feitos diretamente pelo navegador, acessando as rotas HTTP da API.

### Teste — Consulta de todos os produtos

**Requisição:**

```http
GET http://localhost:8080/Produto
```

**Resultado esperado:**

Retorno de uma lista contendo os produtos cadastrados no banco de dados, representados no formato JSON.

<img width="574" height="251" alt="image" src="https://github.com/user-attachments/assets/031a00bd-3485-4714-9c31-3ba5ddf5d458" />

## Autor

**Guilherme de Moraes Ferreira**
