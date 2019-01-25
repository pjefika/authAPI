/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.auth.model.service.impl;

import br.net.gvt.efika.auth.model.entity.Usuario;

/**
 *
 * @author G0042204
 */
public interface AuthInterface {

    public Boolean verificarCredencial(String login, String senha) throws Exception;

    public Usuario consultar(String login) throws Exception;
    
    public Boolean atualizarCredencial(String login, String senha) throws Exception;
}
