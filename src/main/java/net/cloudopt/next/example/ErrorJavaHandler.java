package net.cloudopt.next.example;

import net.cloudopt.next.web.handler.Handler;
import java.util.*;
/**
 * ===================
 * User ：TT
 * Date ：2018/2/28
 * Time ：22:53
 * ===================
 */
public class ErrorJavaHandler extends Handler {
    @Override
    public void handle() {
        if (Math.abs(getErrorStatusCode()) == 404) {
            Object json = restult("404", "[cloudopt example] resource not found");
            renderJson(json);
        }

        if (Math.abs(getErrorStatusCode()) == 500) {
            Object json = restult("500", "[cloudopt example] internal error");
            renderJson(json);
        }
    }

    public HashMap<String, String> restult(String error, String errorMessage) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("error", error);
        map.put("errorMessage", errorMessage);
        return map;
    }

    public int getErrorStatusCode(){
        this.getResponse().setStatusCode(this.getResponse().getStatusCode());
        this.getResponse().setStatusCode(this.getContext().statusCode());
        return this.getContext().statusCode();
    }


}
