/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import java.util.Calendar;
import java.util.Date;
import model.enuns.ActionEnum;
import org.mongodb.morphia.annotations.Entity;

/**
 *
 * @author G0042204
 */
@Entity("log")
public class Log extends AbstractMongoEntity {

    private Object request;

    private Object response;

    private ActionEnum action;

    private Date date;

    public Log() {
        this.date = Calendar.getInstance().getTime();
    }

    public Object getRequest() {
        return request;
    }

    public void setRequest(Object request) {
        this.request = request;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

}
