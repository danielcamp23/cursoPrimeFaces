package com.mitocode.ejb;

import com.mitocode.model.Usuario;
import java.util.List;
import javax.ejb.Local;

@Local
public interface UsuarioFacadeLocal {

    void create(Usuario usuario);

    void edit(Usuario usuario);

    void remove(Usuario usuario);

    Usuario find(Object id);

    List<Usuario> findAll();

    List<Usuario> findRange(int[] range);
    
    //Usuario iniciarSesion(Usuario usuario);

    int count();
    
}
