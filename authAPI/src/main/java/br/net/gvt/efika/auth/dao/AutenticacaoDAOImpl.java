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

}
