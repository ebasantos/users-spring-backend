--------------------- TECNOLOGIAS-------------------------------
Esta aplicação foi desenvolvida Spring Boot framwork, gerenciado
 pelo Maven , combanco de dados Postgres e Angular 7.

--------------------- CONFIGURAÇÕES-------------------------------

No datasource.url, deve se passado o servidor ao qual o postgres ira startar, que por padrão é o 5432, após a barra '/' ,
encontra-se o nome do banco de dados, para criar o bando deve-se abrir o gerenciador do postgres (por padrão será o pgadmin),
dentro do gerenciador, deve-se criar o banco de dados com o seguinte comando:  CREATE DATABASE users_db,
não será necessario comandos para criar as tabela, pois a aplicação esta vinculada ao Hibernete, que ja cuida deste quesito.

2° deve ser passado o user do postgres ao qual a aplicação se conectará.

3° deve ser passada a senha do user referido anteriormente.

- o projeto esta feito em cima das dependencias do Maven, logo, pode ser necessaria a intalação do mesmo, disponivel em:
https://maven.apache.org/
	
- será necessaria a configuração do arquivo application.propierties
nas seguintes linhas a baixo:


 1° spring.datasource.url=jdbc:postgresql://localhost:5432/users_db
 2° spring.datasource.username=postgres
 3° spring.datasource.password=admin



--------------------- END-POINTS-------------------------------

 a aplicação contém os seguintes end-points.

//localhost:8080/api/users

 - este end-point contém todos os metodos rest para a criação do usuario,
   para vincular perfil com usuário, basta passar o id do perfil no metodo POST,
   este id está dentro do metodo 'Create', nomeado como 'IdProf'.

//localhost:8080/api/profile

 - este end-point contém todos os metodos rest para a criação do prefil de usuário,
   lembrando que para o cadastro de usuário, deve-se cadastrar antes o perfil.

//localhost:8080/api/machine

 - este end-point contém todos os metodos rest para a criação do dos equipamentos do usuário.

//localhost:8080/api/usersmachines

 - este end-point contém todos os metodos rest para a criação da tabela que vincula equipamentos
   e usuário, será necessário somente passar os campos 'idU', sendo o Id do usuário e 'udM',
   sendo o id do equipamento, este método foi baseado no diagrama proposto.


------------ Erik Santos-------------------------------------------

