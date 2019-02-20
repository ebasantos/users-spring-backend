- o projeto esta feito em cima das dependencias do Maven, logo, pode ser necessaria a intala��o do mesmo, disponivel em:
https://maven.apache.org/
	
- ser� necessaria a configura��o do arquivo application.propierties
nas seguintes linhas a baixo:


 1� spring.datasource.url=jdbc:postgresql://localhost:5432/users_db
 2� spring.datasource.username=postgres
 3� spring.datasource.password=admin

--------------------- TECNOLOGIAS-------------------------------
Esta aplica��o foi desenvolvida Spring Boot framwork, banco de 
dados Postgres e Angular 7.

--------------------- CONFIGURA��ES-------------------------------

No datasource.url, deve se passado o servidor ao qual o postgres ira startar, que por padr�o � o 5432, ap�s a barra '/' ,
encontra-se o nome do banco de dados, para criar o bando deve-se abrir o gerenciador do postgres (por padr�o ser� o pgadmin),
dentro do gerenciador, deve-se criar o banco de dados com o seguinte comando:  CREATE DATABASE users_db,
n�o ser� necessario comandos para criar as tabela, pois a aplica��o esta vinculada ao Hibernete, que ja cuida deste quesito.

2� deve ser passado o user do postgres ao qual a aplica��o se conectar�.

3� deve ser passada a senha do user referido anteriormente 


--------------------- END-POINTS-------------------------------

 a aplica��o cont�m os seguintes end-points.

//localhost:8080/api/users

 - este end-point cont�m todos os metodos rest para a cria��o do usuario,
   para vincular perfil com usu�rio, basta passar o id do perfil no metodo POST,
   este id est� dentro do metodo 'Create', nomeado como 'IdProf'.

//localhost:8080/api/profile

 - este end-point cont�m todos os metodos rest para a cria��o do prefil de usu�rio,
   lembrando que para o cadastro de usu�rio, deve-se cadastrar antes o perfil.

//localhost:8080/api/machine

 - este end-point cont�m todos os metodos rest para a cria��o do dos equipamentos do usu�rio.

//localhost:8080/api/usersmachines

 - este end-point cont�m todos os metodos rest para a cria��o da tabela que vincula equipamentos
   e usu�rio, ser� necess�rio somente passar os campos 'idU', sendo o Id do usu�rio e 'udM',
   sendo o id do equipamento, este m�todo foi baseado no diagrama proposto.



