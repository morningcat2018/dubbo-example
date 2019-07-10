package morning.cat.dubbo;


public class Test {

    org.apache.curator.RetryPolicy retryPolicy;
    org.apache.zookeeper.ZooKeeper zooKeeper;

    org.apache.curator.framework.recipes.cache.TreeCacheListener treeCacheListener;

    org.springframework.remoting.httpinvoker.HttpInvokerRequestExecutor httpInvokerRequestExecutor;

    org.eclipse.jetty.util.log.Logger logger;

    org.eclipse.jetty.servlet.ServletHandler handler;
}
