# JWT Service

Servicio encargado de:
- Generar tokens JWT

## Requisitos
- Java 17+
- Maven

## Variables de entorno
JWT_SECRET=supersecreto_supersecreto_supersecreto_123

## Ejecutar
mvn clean install
mvn spring-boot:run

## Endpoints

POST /api/v1/jwt/generate
{
  "cedula": "123456"
}
