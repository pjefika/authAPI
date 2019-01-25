/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.auth.dao;

import br.net.gvt.efika.auth.model.entity.Usuario;

/**
 *
 * @author G0042204
 */
public interface AutenticacaoDAO {

    public Usuario consultar(String login) throws Exception;

    public Usuario update(String login, String pass) throws Exception;

}
