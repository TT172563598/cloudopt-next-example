package net.cloudopt.next.example.controller;

import net.cloudopt.next.example.interceptor.AllJavaInterceptor;
import net.cloudopt.next.example.model.TodoJavaModel;
import net.cloudopt.next.example.orm.tables.pojos.Todo;
import net.cloudopt.next.example.validator.IdJavaValidator;
import net.cloudopt.next.example.validator.TextJavaValidator;
import net.cloudopt.next.redis.Cache;
import net.cloudopt.next.redis.Redis;
import net.cloudopt.next.web.Resource;
import net.cloudopt.next.web.route.*;

import java.util.HashMap;
import java.util.List;

/**
 * ===================
 * User ：TT
 * Date ：2018/2/28
 * Time ：22:19
 * ===================
 */
@API(value = "/api/v1/todo",interceptor ={AllJavaInterceptor.class})
public class TodoJavaController extends Resource {

    private TodoJavaModel m = new TodoJavaModel();
    //redisKey
    private String redisKey = "TodoList";

    @GET
    public void get() {
        List<Todo> todoList;
        Cache redis = Redis.use();
        Boolean isRedis = redis.getJedis().exists(redisKey);
        if(isRedis){
            todoList = redis.get(redisKey);
            System.out.println("redis存在，查询redis数据库");
        }else{
            todoList = m.getTodoList();
            System.out.println("redis不存在，查询数据库数据");
        }

        redis.set(redisKey,todoList);
        renderJson(m.getTodoList());
    }

    @POST(valid = {TextJavaValidator.class})
    public void post() {
        //清除特定的redis
        Cache redis = Redis.use();
        redis.getJedis().del(redisKey);

        m.addTodoList(getParam("text"));
        renderJson(result("success"));
    }


    @PUT(value = "/:id", valid = {IdJavaValidator.class})
    public void put() {
        //清除特定的redis
        Cache redis = Redis.use();
        redis.getJedis().del(redisKey);

        m.updateTodoList(Integer.parseInt(getParam("id")));
        renderJson(result("success"));
    }

    @DELETE(value = "/:id", valid = {IdJavaValidator.class})
    public void delete() {
        //清除特定的redis
        Cache redis = Redis.use();
        redis.getJedis().del(redisKey);

        m.deleteTodoList(Integer.parseInt(getParam("id")));
        renderJson(result("success"));
    }

    public HashMap<String, String> result(String s) {
        HashMap<String, String> map =  new HashMap<String, String>();
        map.put("result", s);
        return map;
    }
}
