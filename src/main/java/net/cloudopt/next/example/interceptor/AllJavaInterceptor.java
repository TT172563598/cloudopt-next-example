package net.cloudopt.next.example.interceptor;


import net.cloudopt.next.web.Interceptor;
import net.cloudopt.next.web.Resource;

/**
 * ===================
 * User ：TT
 * Date ：2018/2/28
 * Time ：22:32
 * ===================
 */
public class AllJavaInterceptor implements Interceptor {
    @Override
    public boolean intercept(Resource resource) {
        System.out.println("Through the intercept!");
        return true;
    }

    @Override
    public Resource response(Resource resource) {
        return resource;
    }
}
