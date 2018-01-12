/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.log;

import dao.AbstractMongoDAO;
import model.entity.Log;

/**
 *
 * @author G0042204
 */
public class LogDAOImpl extends AbstractMongoDAO<Log> implements LogDAO {

    public LogDAOImpl() {
        super("10.40.197.137", "auth", Log.class);
    }

}
