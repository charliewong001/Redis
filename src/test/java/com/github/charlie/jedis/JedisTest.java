package com.github.charlie.jedis;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

public class JedisTest {

    @Test
    public void test() {
        Set<HostAndPort> hosts = new HashSet<HostAndPort>();
        hosts.add(new HostAndPort("192.168.158.128", 7001));
        hosts.add(new HostAndPort("192.168.158.128", 7002));
        hosts.add(new HostAndPort("192.168.158.128", 7003));
        JedisCluster jc = new JedisCluster(hosts);
        String value = jc.get("k");
        System.out.println(value);
    }

}
