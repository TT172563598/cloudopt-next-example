package net.cloudopt.next.example.validator;

import net.cloudopt.next.example.model.TodoJavaModel;
import net.cloudopt.next.web.Resource;
import net.cloudopt.next.web.Validator;

import java.util.HashMap;

/**
 * ===================
 * User ：TT
 * Date ：2018/2/28
 * Time ：23:05
 * ===================
 */
public class TextJavaValidator implements Validator {

    private TodoJavaModel m = new TodoJavaModel();
    @Override
    public boolean validate(Resource resource) {

        String  text = resource.getParam("text");
        return text.equals("");
    }

    @Override
    public void error(Resource resource) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("error", "100000");
        map.put("errorMessage", "Text is error!");
        resource.renderJson(map);
    }
}
