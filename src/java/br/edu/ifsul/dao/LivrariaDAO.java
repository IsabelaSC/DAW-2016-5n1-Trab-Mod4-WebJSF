package br.edu.ifsul.dao;

import br.edu.ifsul.modelo.Livraria;
import java.io.Serializable;

/**
 *
 * @author Isabela
 */
public class LivrariaDAO<T> extends DAOGenerico<Livraria> implements Serializable {

   public LivrariaDAO(){
       super();
       super.setClassePersistente(Livraria.class);
   }
}
