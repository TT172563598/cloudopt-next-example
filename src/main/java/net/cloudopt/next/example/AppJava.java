package net.cloudopt.next.example;

import net.cloudopt.next.example.model.TodoJavaModel;
import net.cloudopt.next.jooq.JooqPlugin;
import net.cloudopt.next.redis.Cache;
import net.cloudopt.next.redis.Redis;
import net.cloudopt.next.redis.RedisPlugin;
import net.cloudopt.next.web.CloudoptServer;

/**
 * ===================
 * User ：TT
 * Date ：2018/2/28
 * Time ：22:51
 * ===================
 */
public class AppJava {
    public static void  main(String[] args){
        CloudoptServer.addPlugin(new JooqPlugin());
        CloudoptServer.run();
        RedisPlugin rp = new RedisPlugin();
        rp.start();

    }
}
