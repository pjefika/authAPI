/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.auth.model.service.impl;

import br.net.gvt.efika.auth.rest.request.VerificarCredencialRequest;
import br.net.gvt.efika.auth.dao.factory.FactoryDAO;
import br.net.gvt.efika.auth.model.entity.Log;
import br.net.gvt.efika.auth.model.enuns.ActionEnum;

public class CredencialServiceImpl implements CredencialService {

    @Override
    public Boolean verificar(VerificarCredencialRequest cred) throws Exception {
        Boolean verificar = null;
        Log l = new Log();
        l.setAction(ActionEnum.LOGIN);
        l.setRequest(cred);

        try {
            verificar = FactoryDAO.createNtlmDAO().verificarCredenciais(cred);
            l.setResponse(verificar);
            FactoryDAO.newLogDAO().save(l);
            return verificar;
        } catch (Exception e) {
            l.setResponse(e.getMessage());
            FactoryDAO.newLogDAO().save(l);
            throw new Exception("Falha ao lurar TI.");
        }
    }

}
