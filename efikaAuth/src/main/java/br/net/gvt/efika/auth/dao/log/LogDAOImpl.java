/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.auth.dao.log;

import br.net.gvt.efika.mongo.dao.AbstractMongoDAO;
import br.net.gvt.efika.mongo.dao.MongoEndpointEnum;
import br.net.gvt.efika.auth.model.entity.Log;

/**
 *
 * @author G0042204
 */
public class LogDAOImpl extends AbstractMongoDAO<Log> implements LogDAO {

    public LogDAOImpl() {
        super(MongoEndpointEnum.MONGO.getIp(), "auth", Log.class);
    }

}
