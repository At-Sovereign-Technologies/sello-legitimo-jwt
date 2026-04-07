# Entorno

## Requisitos
- Docker Desktop o Docker Engine
- VS Code
- Extensión Dev Containers

## Variables sugeridas
```env
SPRING_PROFILES_ACTIVE=dev
JWT_SECRET=change_me
JWT_EXPIRATION_SECONDS=3600
```

## Validación
```bash
./mvnw -q -DskipTests dependency:go-offline
./mvnw test
```
