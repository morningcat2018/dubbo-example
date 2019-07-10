package morning.cat.dubbo;

import morning.cat.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConsumerApplication {

    /**
     * 设置 JVM 参数:
     * <p>
     * -Ddubbo.application.qos.port=33333
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();
        UserService userService = (UserService) context.getBean("userService"); // 获取远程服务代理
        System.out.println(userService.get()); // 显示调用结果

    }
}
