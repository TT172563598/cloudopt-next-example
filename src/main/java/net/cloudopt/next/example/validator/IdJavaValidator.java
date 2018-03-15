package net.cloudopt.next.example.validator;

import net.cloudopt.next.example.model.TodoJavaModel;
import net.cloudopt.next.web.Resource;
import net.cloudopt.next.web.Validator;

import java.util.HashMap;

/**
 * ===================
 * User ：TT
 * Date ：2018/2/28
 * Time ：22:58
 * ===================
 */
public class IdJavaValidator implements Validator {

    private TodoJavaModel m = new TodoJavaModel();

    @Override
    public boolean validate(Resource resource) {
        String id = resource.getParam("id");

        return !id.equals("") && m.getTodoListById(Integer.parseInt(id))!=null;
    }

    @Override
    public void error(Resource resource) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("error", "100000");
        map.put("errorMessage", "Id is error!");
        resource.renderJson(map);
    }
}
