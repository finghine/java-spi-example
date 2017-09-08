
# Java Service Provider Interface 示例工程

包含四个子工程

* FrameworkF: 框架工程，内含main入口，对服务进行调用，依赖于下面三个工程
* ApiX: 服务接口工程，定义服务的接口
* PluginY: 服务提供商Y，实现了ApiX中的服务
* PluginZ：服务提供商Z，实现了ApiX中的服务

