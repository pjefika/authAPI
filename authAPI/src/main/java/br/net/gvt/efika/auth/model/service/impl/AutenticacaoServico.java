package br.net.gvt.efika.auth.model.service.impl;

import br.net.gvt.efika.auth.dao.FactoryDAO;
import br.net.gvt.efika.auth.model.entity.Usuario;
import javax.persistence.NoResultException;

public class AutenticacaoServico implements AuthInterface {

    public AutenticacaoServico() {
    }

    @Override
    public Boolean verificarCredencial(String login, String senha) throws Exception {

        try {
            Usuario usr = FactoryDAO.createAutenticacaoDAO().consultar(login);
            System.out.println("login: " + login);
            System.out.println("senha: " + senha);

            System.out.println("login banco: " + usr.getLogin());
            System.out.println("senha banco: " + usr.getSenha());
            return usr.getSenha().equals(senha);
        } catch (NoResultException e) {
            throw new Exception("Usuário ou Senha incorretos!");
        }
    }

    @Override
    public Usuario consultar(String login) throws Exception {
        try {
            return FactoryDAO.createAutenticacaoDAO().consultar(login);
        } catch (NoResultException e) {
            throw new Exception("Usuário inexistente!");
        }
    }

}
