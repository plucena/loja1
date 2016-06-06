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

**Produto**

* List all Produto
GET http://loja.mybluemix.net/api/produto

* List a Produto
GET http://loja.mybluemix.net/api/produto/{$sku}

==========

**Receita**

* List a Receita
GET http://loja.mybluemix.net/api/receita

* List a Produto
GET http://loja.mybluemix.net/api/receita/{$sku}

* Create a Receita
POST  http://loja.mybluemix.net/api/receita/create

Content-Type: application/json

       {
        "nome": "Bermuda Surfista",
        "tipo": "Academia",
        "descricao": "Bermuda Fitness",
        "precounitario": 100,
        "receita": [
                {
                     "quantidade": 100,
                     "unidade": "kg",
                     "materiaPrima": 229376
                },
                {
                     "quantidade": 50,
                     "unidade": "kg",
                     "materiaPrima": 327680
                }
               ]
        }
 


* Update a Receita
POST  http://loja.mybluemix.net/api/receita/update

Content-Type: application/json

        {
        "sku": 201,
        "nome": "Bermuda Surfista",
        "tipo": "Academia",
        "descricao": "Bermuda Fitness",
        "precounitario": 100,
        "receita": [
                {
                 "id": 1,
                 "quantidade": 100,
                 "unidade": "kg",
                "materiaPrima": 229376
                },
                {
                "id": 2,
                "quantidade": 50,
                "unidade": "kg",
                "materiaPrima": 327680
                }
                ]
        }

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
         "nome": "Tecido de Bolinha Amarelinho",
        "tipo": "Tecido Especial",
        "descricao": "Ana Maria likes",
        }

* Update MateriaPrima

POST http://loja.mybluemix.net/api/materiaprima/update

Content-Type: application/json
    
        {
        "sku": 1,
        "nome": "Tecido de Bolinha Amarelinho",
        "tipo": "Tecido Especial",
        "descricao": "Ana Maria likes",
        }

==========


**Lote**

* List all Lote   GET http://loja.mybluemix.net/api/lote

* List a Lote GET http://loja.mybluemix.net/api/lote/{$sku}


* Create lote

POST http://loja.mybluemix.net/api/lote/create

Content-Type: application/json

    {  
       "preco":999.0,
       "materiaPrima":{  
          "sku":5,
          "nome":"Tecido Lilaz",
          "tipo":"Tecidos Baratinhos",
          "descricao":"O tecido da moda"
       },
       "fornecedor":{  
          "cnpj":"12345678000123",
          "nome":"China Tecidos",
          "email":"china@china.com",
          "telefone":"+77 22 23 24",
          "prazoEntregaDias":1000,
          "endereco_Pais":null,
          "endereco_Estado":"AP",
          "endereco_Cidade":"FabricLand",
          "endereco_Logradouro":"Rua Sete de Setembro, 341",
          "endereco_CEP":"22222333",
          "ativo":true
       },
       "status":"CANCELADO",
       "quantidade":999.0,
       "unidade":"Kg"
    }



* Update lote

POST http://loja.mybluemix.net/api/lote/update/{$sku}

Content-Type: application/json

    {  
       "sku":5,
       "preco":999.0,
       "materiaPrima":{  
          "sku":5,
          "nome":"Tecido Lilaz",
          "tipo":"Tecidos Baratinhos",
          "descricao":"O tecido da moda"
       },
       "fornecedor":{  
          "cnpj":"12345678000123",
          "nome":"China Tecidos",
          "email":"china@china.com",
          "telefone":"+77 22 23 24",
          "prazoEntregaDias":1000,
          "endereco_Pais":null,
          "endereco_Estado":"AP",
          "endereco_Cidade":"FabricLand",
          "endereco_Logradouro":"Rua Sete de Setembro, 341",
          "endereco_CEP":"22222333",
          "ativo":true
       },
       "status":"CANCELADO",
       "quantidade":999.0,
       "unidade":"Kg"
    } 


==========


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
