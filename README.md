
# Gestión de Usuarios


Compilar con

mvn clean install

Ejecutar 

mvn spring-boot:run

Swagger.
http://localhost:8080/swagger-ui/index.html#/

Endpoints
POST

localhost:8080/auth/register

Permite registrar el usuario y devuelve el token JWT específico.

ej.
{
        
        "name": "user",
        "email": "user@yahoo.cl",
        "password": "User#222",
        "isActive": false,
        "phones": [
            {                
                "number": "1111111",
                "citycode": "222",
                "countrycode": "349"
            },
            {                
                "number": "666666",
                "citycode": "444",
                "countrycode": "347"
            }
        ]
    }


POST
localhost:8080/auth/login?name=user&password=User#222

Autentica el usuario registrado y devuelve un nuevo token.


GET
localhost:8080/user/all

Devuelve todos los usuarios creados.
(Se necesita autenticar con el token previamente creado)

