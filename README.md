## Dubbo 3.0.0 Demo

### 前言
- 基于3.0.0版本使用triple协议、ZK注册中心
- provider 即 hello-service模块
- consumer 即 hello-admin模块

### 问题描述
provider端register-mode默认为all，服务启动后consumer
端如果没有设置migration为FORCE_APPLICATION，则可以正常访问；
如果设置为FORCE_APPLICATION则将无法访问。

- 观察provider端日志可以看到有一行warn日志：
> 2021-11-19 12:19:10 WARN [org.apache.dubbo.registry.client.metadata.ServiceInstanceMetadataUtils]  [DUBBO] Refreshing of service instance started, but instance hasn't been registered yet., dubbo version: 3.0.0, current host: 172.16.128.132

