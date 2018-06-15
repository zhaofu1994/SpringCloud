package com.zf.myrule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @描述: 自定义负载均衡算法[*(特殊规则) 自定义的负载均衡算法不能与启动类放在同包/子包下]
 * @author: zf
 * @创建: 2018/6/13-12:33;
 * @版本: V1.0
 **/
public class RandomRule_ZY extends AbstractLoadBalancerRule {

    private static Logger log = LoggerFactory.getLogger(RandomRule_ZY.class);

    private Integer total = 0;
    private Integer currentIndex = 0;
    private Integer loadBalancerNum = 5;

    public Server choose(ILoadBalancer lb, Object key) {
        log.error("choose---------------------key:" + key);
        if (lb == null) {
            return null;
        }
        Server server = null;
        while (server == null) {
            if (Thread.interrupted()) {
                return null;
            }
            List<Server> upList = lb.getReachableServers();
            List<Server> allList = lb.getAllServers();
            int serverCount = allList.size();
            if (serverCount == 0) {
                return null;
            }
            /** int index = chooseRandomInt(serverCount);
             server = upList.get(index); 随机算法*/
            //每台服务器轮询次数
            if (total < loadBalancerNum) {
                server = upList.get(currentIndex);
                total++;
            } else {
                total = 0;
                currentIndex++;
                if (currentIndex >= upList.size()) {
                    currentIndex = 0;
                }
            }
            if (server == null) {
                Thread.yield();
                continue;
            }
            if (server.isAlive()) {
                return (server);
            }
            server = null;
            Thread.yield();
        }
        return server;
    }

    /**
     * protected int chooseRandomInt(int serverCount) {
     * return ThreadLocalRandom.current().nextInt(serverCount);
     * }
     */

    @Override
    public Server choose(Object key) {
        return choose(getLoadBalancer(), key);
    }

    @Override
    public void initWithNiwsConfig(IClientConfig clientConfig) {
        // TODO Auto-generated method stub

    }

}
