**该项目是我在学习 spring-cloud时的练习项目**

# 项目目录
- eurekaserver  服务注册中心(EurekaServer)
- eurekaclient01    服务提供者(EurekaClient)
- eurekaclient02    服务提供者(EurekaClient)，项目内容与eurekaclient01一致，唯一不同是配置文件中的 `server.port`，主要是为了方便启动模拟服务提供者多实例的情况。
- serviceribbon 服务消费者(rest+ribbon)
- servicefeign  使用feign(基于ribbon, eureka)的服务消费者
- servicezuul   路由服务
- configserver  spring-cloud配置中心(使用git仓库存储配置信息-自带版本控制能力，.yml配置文件不允许使用`\t`)
- configclient  spring-cloud读取配置中心DEMO(可集成到其他spring-cloud服务)