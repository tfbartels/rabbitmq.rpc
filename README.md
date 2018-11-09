# Rabbit MQ RPC
Implementação do Remote procedure call (RPC) do Rabbit MQ


### Execução

1. Utilize o comando abaixo para executar o server
```
spring-boot:run -Dspring.profiles.active=rpc,server
```

2. Utilize o comando abaixo para executar o client
```
spring-boot:run -Dspring.profiles.active=rpc,client
```

Obs.: Rode o server antes do client
