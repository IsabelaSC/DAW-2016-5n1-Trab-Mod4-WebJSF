package br.edu.ifsul.dao;

import br.edu.ifsul.modelo.Livro;
import java.io.Serializable;

/**
 *
 * @author Isabela
 */
public class LivroDAO<T> extends DAOGenerico<Livro> implements Serializable {

   public LivroDAO(){
       super();
       super.setClassePersistente(Livro.class);
   }
}
