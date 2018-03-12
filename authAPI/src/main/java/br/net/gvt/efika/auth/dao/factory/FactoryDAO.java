/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.auth.dao.factory;

import br.net.gvt.efika.auth.dao.NtlmDAO;
import br.net.gvt.efika.auth.dao.NtlmDAOSanImpl;
import br.net.gvt.efika.auth.dao.log.LogDAOImpl;
import br.net.gvt.efika.auth.dao.log.LogDAO;

/**
 *
 * @author G0042204
 */
public class FactoryDAO {

    public static LogDAO newLogDAO() {
        return new LogDAOImpl();
    }

    public static NtlmDAO createNtlmDAO() {
        return new NtlmDAOSanImpl();
    }

}
