package br.net.gvt.efika.auth.dao;

import br.net.gvt.efika.auth.model.entity.Usuario;
import javax.persistence.NoResultException;

public class AutenticacaoDAOImpl extends AbstractHibernateDAO implements AutenticacaoDAO {

    @Override
    public Usuario consultar(String login) throws Exception {
        try {
            return (Usuario) getEm().createQuery("FROM Usuario u WHERE u.login =:param1")
                    .setParameter("param1", login)
                    .getSingleResult();
        } catch (NoResultException e) {
            throw new Exception("Usuário inexistente!");
        } catch (Exception ex) {
            throw new Exception("Falha ao consultar informações!");
        } finally {
            this.close();
        }
    }

    @Override
    public Usuario update(String login, String pass) throws Exception {
        try {
            Usuario u = (Usuario) getEm().createQuery("FROM Usuario u WHERE u.login =:param1").setParameter("param1", login).getSingleResult();
            u.setSenha(pass);
            this.persist(u);
            return u;
        } catch (Exception e) {
            throw new Exception("Falha ao atualizar usuário!");
        } finally {
            this.close();
        }
    }

    @Override
    public Usuario create(String login, Integer nivel) throws Exception {

        Usuario u = new Usuario();
        try {
            u = (Usuario) getEm().createQuery("FROM Usuario u WHERE u.login =:param1")
                    .setParameter("param1", login)
                    .getSingleResult();
            if (u.getNivel().compareTo(nivel) == 0) {
                u.setSenha("vivo15");
            } else {
                u.setNivel(nivel);
            }
        } catch (NoResultException e) {
            u.setLogin(login);
            u.setSenha("vivo15");
            u.setNivel(nivel);
        }

        try {
            this.persist(u);
            if (u.getSenha().contains("vivo15")) {
                u.setSenha(null);
            }
            return u;
        } finally {
            this.close();
        }

    }

}
