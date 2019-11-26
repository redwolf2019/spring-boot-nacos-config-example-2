### 步骤
- 建立SpringBoot工程，并引入NACOS Config Client
```xml
      <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
            <version>0.9.0.RELEASE</version>
        </dependency>
```

- 将`application.properties`替换为`bootstrap.properties`

- 写入基本配置信息到`bootstrap.properties`
```properties
spring.cloud.nacos.config.enabled=true
spring.cloud.nacos.config.server-addr=${NACOS_CONFIG_ADDR:127.0.0.1:8848}
spring.cloud.nacos.config.prefix=example
spring.cloud.nacos.config.group=DEFAULT_GROUP
spring.cloud.nacos.config.file-extension=properties
spring.profiles.active=base
spring.application.name=nacos-config-example-2
example=hello world
```

- 在NACOS上建立配置文件：`example-base.properties`
    - 在 Nacos Spring Cloud 中，dataId 的完整格式: `${prefix}-${spring.profile.active}.${file-extension}`

- 启动SpringBoot





### 引用
- https://nacos.io/zh-cn/docs/quick-start-spring-cloud.html
- https://cloud.spring.io/spring-cloud-commons/multi/multi__spring_cloud_context_application_context_services.html