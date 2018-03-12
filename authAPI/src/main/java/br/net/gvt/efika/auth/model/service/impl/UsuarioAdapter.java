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
public class UsuarioAdapter {

    public static UsuarioDTO adapter(Usuario u) {
        return new UsuarioDTO(u.getLogin(), u.getNivel());
    }

}
