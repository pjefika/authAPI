/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import controller.request.VerificarCredencialRequest;

/**
 *
 * @author G0042204
 */
public interface CredencialService {

    public Boolean verificar(VerificarCredencialRequest cred) throws Exception;

}
