/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.auth.model.service.factory;

import br.net.gvt.efika.auth.model.service.impl.AutenticacaoServico;
import br.net.gvt.efika.auth.model.service.impl.AuthInterface;
import br.net.gvt.efika.auth.model.service.impl.CredencialService;
import br.net.gvt.efika.auth.model.service.impl.CredencialServiceImpl;

/**
 *
 * @author G0042204
 */
public class FactoryService {

    public static CredencialService newCredencialService() {
        return new CredencialServiceImpl();
    }

    public static AuthInterface createAutenticacaoServico() {
        return new AutenticacaoServico();
    }

}
