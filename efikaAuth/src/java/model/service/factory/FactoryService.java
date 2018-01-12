/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service.factory;

import model.service.CredencialService;
import model.service.CredencialServiceImpl;

/**
 *
 * @author G0042204
 */
public class FactoryService {

    public static CredencialService newCredencialService() {
        return new CredencialServiceImpl();
    }

}
