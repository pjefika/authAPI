/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.factory;

import dao.NtlmDAO;
import dao.NtlmDAOSanImpl;
import dao.http.HttpDAO;
import dao.http.HttpDAOImpl;
import dao.log.LogDAOImpl;
import dao.log.LogDAO;

/**
 *
 * @author G0042204
 */
public class FactoryDAO {

    public static LogDAO newLogDAO() {
        return new LogDAOImpl();
    }

    public static HttpDAO createHttpDAO() {
        return new HttpDAOImpl();
    }

    public static NtlmDAO createNtlmDAO() {
        return new NtlmDAOSanImpl();
    }

}
