package net.cloudopt.next.example.controller;

import net.cloudopt.next.web.Resource;
import net.cloudopt.next.web.render.View;
import net.cloudopt.next.web.route.API;
import net.cloudopt.next.web.route.GET;

/**
 * ===================
 * User ：TT
 * Date ：2018/2/28
 * Time ：22:16
 * ===================
 */
@API(value = "/")
public class IndexJavaController extends Resource {

    @GET
    public void get(){
        View v = new View();
        v.setView("index");
        renderHtml(v);
    }
}
