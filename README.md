## 微服务架构实战01 服务提供者
用于提供查询单一用户和所有用户的服务，运行于8000端口。
### 数据源
使用h2数据库，配置文件如下。
```
spring:
  jpa:
    generate-ddl: false
    show-sql: true
    hibernate:
      ddl-auto: none
  datasource:                     
    platform: h2                 
    schema: classpath:schema.sql            
    data: classpath:data.sql     
```
### 微服务配置项

```
spring:
  application:
    name: microservice-provider-user

eureka:
  client:
    serviceUrl:
      defaultZone: http://eureka1:8761/eureka/ ,http://eureka2:8762/eureka/
  instance:
    prefer-ip-address: true
```

