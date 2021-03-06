/*
 * This file is generated by jOOQ.
*/
package net.cloudopt.next.example.orm.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import net.cloudopt.next.example.orm.tables.Todo;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TodoRecord extends UpdatableRecordImpl<TodoRecord> implements Record4<Integer, String, Integer, Timestamp> {

    private static final long serialVersionUID = 2034194035;

    /**
     * Setter for <code>cloudopt_example.todo.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>cloudopt_example.todo.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>cloudopt_example.todo.text</code>.
     */
    public void setText(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>cloudopt_example.todo.text</code>.
     */
    public String getText() {
        return (String) get(1);
    }

    /**
     * Setter for <code>cloudopt_example.todo.state</code>.
     */
    public void setState(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>cloudopt_example.todo.state</code>.
     */
    public Integer getState() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>cloudopt_example.todo.time</code>.
     */
    public void setTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>cloudopt_example.todo.time</code>.
     */
    public Timestamp getTime() {
        return (Timestamp) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Integer, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Integer, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Todo.TODO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Todo.TODO.TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Todo.TODO.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Todo.TODO.TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TodoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TodoRecord value2(String value) {
        setText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TodoRecord value3(Integer value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TodoRecord value4(Timestamp value) {
        setTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TodoRecord values(Integer value1, String value2, Integer value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TodoRecord
     */
    public TodoRecord() {
        super(Todo.TODO);
    }

    /**
     * Create a detached, initialised TodoRecord
     */
    public TodoRecord(Integer id, String text, Integer state, Timestamp time) {
        super(Todo.TODO);

        set(0, id);
        set(1, text);
        set(2, state);
        set(3, time);
    }
}
