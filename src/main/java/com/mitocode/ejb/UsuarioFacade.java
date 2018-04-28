/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitocode.ejb;

import com.mitocode.model.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author daniel
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> implements UsuarioFacadeLocal {

    @PersistenceContext(unitName = "primePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    /*@Override
    public Usuario iniciarSesion(Usuario inUsuario){
        Usuario usuario = null;
        try{
            String consulta = "SELECT u FROM USUARIO u WHERE u.usuario =?1 and u.clave = ?2";
            Query query = em.createQuery(consulta);
            query.setParameter(1, inUsuario.getUsuario());
            query.setParameter(2, inUsuario.getClave());
            List<Usuario> lista  = query.getResultList();
            if(!lista.isEmpty()){
                usuario =  lista.get(0);
            }
        }
        catch(Exception e){
            throw e;
        }
        
        return usuario;
    }*/

    public UsuarioFacade() {
        super(Usuario.class);
    }
    
}
