package br.edu.ifsul.dao;

import br.edu.ifsul.modelo.Catalogo;
import java.io.Serializable;

/**
 * @author Isabela
 */
public class CatalogoDAO<T> extends DAOGenerico<Catalogo> implements Serializable {

    public CatalogoDAO(){
        super();
        super.setClassePersistente(Catalogo.class);
    }    
}
