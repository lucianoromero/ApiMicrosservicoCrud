# ApiMicrosservicoCrud
<h4> Workshop Mão na Massa | Microsserviço (CRUD) em Spring Boot e MySQL utilizando o Docker. </h4>

* Criação de um Microsserviço (CRUD) em Spring Boot (Java), Spring Data JPA e MySQL;
* Utilização do Padrão Package by Layer: controller, dto, model, repository e service;
* Criacão da imagem do container utilizando Docker (Dockerfile) do Microsserviço;
* Envio da imagem do container para o Docker Hub;
* GitHub actions (CI/CD)
******
<h4> Dependência necessárias para Rodar, buildar e/ou testar o projeto: </h4>
Docker instalado na maquina.

******
<h4> Rodar/Build via docker: </h4> 

```
docker pull lucianoromero/spring-boot-ms
docker-compose up -d (Rodar comando na pasta onde o projeto foi clonado, possui o arquivo docker-compose.yml)

```
******
<h4> Documentação Swagger : </h4>

```
http://localhost:8080/swagger-ui.html#/

```
