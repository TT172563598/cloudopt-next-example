package net.cloudopt.next.example.model;

import net.cloudopt.next.example.orm.tables.daos.TodoDao;
import net.cloudopt.next.example.orm.tables.pojos.Todo;
import net.cloudopt.next.jooq.Jooqer;

import java.sql.Timestamp;
import java.util.List;

/**
 * ===================
 * User ：TT
 * Date ：2018/2/28
 * Time ：22:38
 * ===================
 */
public class TodoJavaModel {


    private TodoDao dao = new TodoDao(Jooqer.getConfiguration());

    public List<Todo> getTodoList() {

        return dao.findAll();
    }

    public Todo getTodoListById(int id){
        return dao.findById(id);
    }

    public void addTodoList(String text) {
        Todo todo = new Todo();
        todo.setState(0);
        todo.setText(text);
        todo.setTime(new Timestamp(System.currentTimeMillis()));
        dao.insert(todo);
    }

    public void updateTodoList(int id) {
        Todo todo = dao.findById(id);
        if(todo.getState() == 0){
            todo.setState(1);
        }else{
            todo.setState(0);
        }
        dao.update(todo);
    }

    public void deleteTodoList(int id) {
        dao.deleteById(id);
    }
}
