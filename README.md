**该项目是我在学习 spring-cloud时的练习项目**

# 项目目录
- eurekaserver  服务注册中心(EurekaServer)
- eurekaclient01    服务提供者(EurekaClient)
- eurekaclient02    服务提供者(EurekaClient)，项目内容与eurekaclient01一致，唯一不同是配置文件中的 `server.port`，主要是为了方便启动模拟服务提供者多实例的情况。
- serviceribbon 服务消费者(rest+ribbon)