This is a Java REST Webservice example using JPA MySQL persitence

Persistence occurs on a Cloud based mysql Docker instance defined on resources/META-INF/persistence.xml

This project is associated to Continuos Integration Server: https://hub.jazz.net/pipeline/plucena/ECMApp

Commits to API are automatically published to - http://loja.mybluemix.net/api/

Commits to UI are automatically published to - http://loja.mybluemix.net/app/

ScrumBoard is zenhub.io

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

* Create a Produto
POST http://loja.mybluemix.net/api/produto/create

Content-Type: application/json

     {  
      "lotes":[  
      {  
         "sku":3276800,
         "preco":60,
         "materiaPrima":{  
            "sku":655360,
            "nome":"BotÃ£o Paris Colorido",
            "tipo":"BotÃ£o",
            "descricao":"BotÃ£o padrÃ£o Paris nas cores azul, vermelha, amarela e verde"
         },
         "fornecedor":{  
            "cnpj":"23122345000107",
            "nome":"SantaconstÃ¢ncia Tecelagem",
            "email":"staconstancia@gmail.com",
            "telefone":"11 2982-7900",
            "prazoEntregaDias":70,
            "endereco_Pais":null,
            "endereco_Estado":"SP",
            "endereco_Cidade":"SÃ£o Paulo",
            "endereco_Logradouro":"Rua Soldado Amarilho GonÃ§alves de Queiroz, 77 - Parque Novo Mundo",
            "endereco_CEP":"02147901",
            "ativo":true
         },
         "status":"ENCOMENDADO",
         "quantidade":500,
         "unidade":"Un"
      }
      ],
      "status":"EM_PRODUCAO",
      "preco":2500,
      "quantidadeProduzida": 0,
      "receita":{  
            "sku":200,
            "nome":"Bermuda Legal",
            "tipo":"Academia",
            "descricao":"Bermuda Fitness",
            "receita":[  
            {  
                  "id":163840,
                  "quantidade":100,
                  "unidade":"Un",
                  "materiaPrima":{  
                  "sku":229376,
                   "nome":"Malha branca elastano",
                  "tipo":"Elastano",
                  "descricao":"Malha importada com elastano na cor branca"
                  }
            }
            ]
      }
      }

* Update a Produto
POST http://loja.mybluemix.net/api/produto/update

Content-Type: application/json

     {  
     "sku": x,
      "lotes":[  
      {  
         "sku":3276800,
         "preco":60,
         "materiaPrima":{  
            "sku":655360,
            "nome":"BotÃ£o Paris Colorido",
            "tipo":"BotÃ£o",
            "descricao":"BotÃ£o padrÃ£o Paris nas cores azul, vermelha, amarela e verde"
         },
         "fornecedor":{  
            "cnpj":"23122345000107",
            "nome":"SantaconstÃ¢ncia Tecelagem",
            "email":"staconstancia@gmail.com",
            "telefone":"11 2982-7900",
            "prazoEntregaDias":70,
            "endereco_Pais":null,
            "endereco_Estado":"SP",
            "endereco_Cidade":"SÃ£o Paulo",
            "endereco_Logradouro":"Rua Soldado Amarilho GonÃ§alves de Queiroz, 77 - Parque Novo Mundo",
            "endereco_CEP":"02147901",
            "ativo":true
         },
         "status":"ENCOMENDADO",
         "quantidade":500,
         "unidade":"Un"
      }
      ],
      "status":"EM_PRODUCAO",
      "preco":2500,
      "quantidadeProduzida": 0,
      "receita":{  
            "sku":200,
            "nome":"Bermuda Legal",
            "tipo":"Academia",
            "descricao":"Bermuda Fitness",
            "receita":[  
            {  
                  "id":163840,
                  "quantidade":100,
                  "unidade":"Un",
                  "materiaPrima":{  
                  "sku":229376,
                   "nome":"Malha branca elastano",
                  "tipo":"Elastano",
                  "descricao":"Malha importada com elastano na cor branca"
                  }
            }
            ]
      }
      }


==========

**Receita**

* List a Receita
GET http://loja.mybluemix.net/api/receita

* List a Produto
GET http://loja.mybluemix.net/api/receita/{$sku}

* Create a Receita
POST  http://loja.mybluemix.net/api/receita/create

* Lotes disponiveis Receita
GET  http://loja.mybluemix.net/api/receita/lotes/327680

Content-Type: application/json

     {
      "nome": "Calça Musculação",
      "tipo": "Academia",
      "descricao": "Coolest thing ever",
      "receita": [
      {
      "id": 131072,
      "quantidade": 100,
      "unidade": "Kg",
      "materiaPrima": {
      "sku": 229376,
      "nome": "Malha branca elastano",
      "tipo": "Elastano",
      "descricao": "Malha importada com elastano na cor branca"   
      }
      },
      {
      "id": 131073,
      "quantidade": 50,
      "unidade": "Kg",
      "materiaPrima": {
      "sku": 327680,
      "nome": "Tecido branco de seda",
      "tipo": "Seda",
      "descricao": "Tecido nacional de seda na cor branca"
      }
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
