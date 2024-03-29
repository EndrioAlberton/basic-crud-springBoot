u# Workshop Spring Boot 2 com JPA/Hibernate

## Objetivos

- Criado projeto Spring Boot Java
- Modelo de domínio implementado
- Camadas lógicas estruturadas: resource, service, repository
- Banco de dados de teste (H2) configurado
- Banco de dados populado
- CRUD - Create, Retrieve, Update, Delete implementados
- Tratamento de exceções realizado

## Checklist e Dependências

### Spring Initializr

- Maven
- Java 17
- Packing JAR
- Dependências: Spring Web

### Banco de Dados H2, perfil de teste e JPA

- Dependências JPA & H2
- Configuração de propriedades de aplicação
- Propriedades para ambiente de teste

### Repositório JPA, Injeção de Dependência, Seed de Banco de Dados

- UserRepository estendendo JPARepository<User, Long>
- Classe de configuração para o perfil "test"
- Inicialização de objetos em memória
- Persistência de objetos

## Camada de Serviço, Registro de Componentes

- Checklist para nova entidade básica
- Ordenação, Instant, ISO 8601
- Objetos e Enumeradores

### Associação Muitos-para-Muitos com JoinTable

- Checklist para relacionamento muitos-para-muitos com atributos extras
- Associação Produto-OrderItem um-para-muitos

### Recursos criados

- Métodos de subtotal e total
- Inserção de Usuário
- Exclusão e Atualização de Usuário
- Manipulação de Exceções

## Modelo conceitual
![Modelo Conceitual](https://raw.githubusercontent.com/EndrioAlberton/assets/main/basic-crud-springboot/domain%20model%20-%20basic%20crud%20spring%20boot.png)

## Testes

Todos os testes foram realizados com sucesso para inserção, exclusão e atualização de usuários.

# Como executar o projeto

## Executar projeto
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone ttps://github.com/EndrioAlberton/basic-crud-springBoot

# entrar na pasta do projeto
cd basic-crud-springBoot

# executar o projeto
./mvnw spring-boot:run
```

---
