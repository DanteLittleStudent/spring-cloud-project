package com.springcloud.common.robbin.rule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 测试一下自定义轮询规则
 * @author cuimin
 * create in 2022-05-18
 */
public class TestRule extends AbstractLoadBalancerRule {

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {
        //TODO
    }

    @Override
    public Server choose(Object key) {
        return null;
    }
}
