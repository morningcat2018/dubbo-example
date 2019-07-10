package morning.cat.dubbo;

import morning.cat.UserService;
import morning.cat.UserServiceImpl;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;

import java.io.IOException;
import java.util.Arrays;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/7/10 10:38 AM
 */
public class ApiProviderApplication {

    public static void main(String[] args) {

        // 服务实现
        UserService userService = new UserServiceImpl();

        // 当前应用配置
        ApplicationConfig application = new ApplicationConfig();
        application.setName("dubbo-demo-api-provider");

        // 连接注册中心配置
        RegistryConfig registry = new RegistryConfig();
        registry.setAddress("zookeeper://127.0.0.1:2181");
        //registry.setUsername("aaa");
        //registry.setPassword("bbb");

        // 服务提供者协议配置
        ProtocolConfig protocol = new ProtocolConfig();
        protocol.setName("dubbo");
        protocol.setPort(12345);
        protocol.setThreads(200);

//        ProtocolConfig protocolHttp = new ProtocolConfig();
//        protocolHttp.setName("http");
//        protocol.setPort(10883);
//        protocol.setThreads(20);
//        protocol.setContextpath("/dubbo");

        // 注意：ServiceConfig为重对象，内部封装了与注册中心的连接，以及开启服务端口
        // 服务提供者暴露服务配置
        ServiceConfig<UserService> service = new ServiceConfig<UserService>(); // 此实例很重，封装了与注册中心的连接，请自行缓存，否则可能造成内存和连接泄漏
        service.setApplication(application);
        service.setRegistry(registry); // 多个注册中心可以用setRegistries

        // 多个协议可以用setProtocols()
        // service.setProtocol(protocol);
        service.setProtocols(Arrays.asList(protocol));
        service.setInterface(UserService.class);
        service.setRef(userService);
        service.setVersion("1.0.0");

        // 暴露及注册服务
        service.export();
        System.out.println("启动成功");

        // 阻塞线程
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
