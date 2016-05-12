This is a Java REST Webservice example using JPA MySQL persitence

Persistence occurs on a Cloud based mysql Docker instance defined on resources/META-INF/persistence.xml

This project is associated to Continuos Integration Server: https://hub.jazz.net/pipeline/plucena/ECMApp

Commits to API are automatically published to - http://loja.mybluemix.net/api/

ScrumBoard is https://hub.jazz.net/ccm38/web/projects/plucena%20%7C%20ECMApp#action=com.ibm.team.dashboard.viewDashboard

Communication channel is: https://estoqueapp.slack.com



Local Install 
========


* Maven

Ubuntu: sudo apt-get install maven

Mac OS X: brew install maven 

* Tomcat 7

Ubuntu: sudo apt-get install tomcat7

Mac Os X: download and install tomcat 7 or latter https://tomcat.apache.org/download-70.cgi


Configure Tomcat-Maven Integration
=================

Follow these instrunctions: http://www.mkyong.com/maven/how-to-deploy-maven-based-war-file-to-tomcat/

Run 
====
mvn tomcat7:deploy 

mvn tomcat7:undeploy 

mvn tomcat7:redeploy 


API
==========

**MateriaPrima**

* List all MateriaPrima
GET http://loja.mybluemix.net/api/materiaprima

* List a MateriaPrima
GET http://loja.mybluemix.net/api/materiaprima/{$sku}

* Create MateriaPrima

POST http://loja.mybluemix.net/api/materiaprima/create
    
Content-Type: application/json
    
        {
        "nome": "Tecido Florido Verao 2016",
        "tipo": "Tecido",
        "descricao": "Cool stuff guys",
        "unidade": "metro",
        "valorUnidade": 10,
        "dataEntrada": "2016-10-15",
        "dataSaida": "2016-10-29"
        }

**Fornecedor**

* List all Fornecedor
GET http://loja.mybluemix.net/api/fornecedor

* List a Fornecedor
GET http://loja.mybluemix.net/api/fornecedor/{$id}

* Create/Update Fornecedor

POST http://loja.mybluemix.net/api/fornecedor/create
POST http://loja.mybluemix.net/api/fornecedor/update


Content-Type: application/json

        {
        "cnpj": "010203",
        "nome": "china tecidos reciclaveis",
        "email": "?@?.com",
        "telefone": "000099932",
        "prazoEntregaDias": 100,
        "endereco_Pais": "China",
        "endereco_Estado": "-",
        "endereco_Cidade": "Beijing",
        "endereco_Logradouro": "???????? 42",
        "endereco_CEP": "08378472",
        "ativo": true
        }
