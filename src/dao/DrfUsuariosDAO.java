/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.DrfProduto;
import bean.DrfUsuarios;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u10154925179
 */
public class DrfUsuariosDAO extends DAO_Abstract{

   @Override
    public void insert(Object object) {
       session.beginTransaction();
      session.save(object);
      session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.getTransaction();
      session.flush();
      session.clear();
      session.update(object);
      session.beginTransaction().commit();
    }

    @Override
    public void delete(Object object) {
         session.getTransaction();
          session.flush();
      session.clear();
      session.delete(object);
      session.beginTransaction().commit();
    }
    

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(DrfUsuarios.class);
        criteria.add(Restrictions.eq("drfIdUsuarios", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
       session.beginTransaction();
        Criteria criteria = session.createCriteria(DrfUsuarios.class);
         List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
}
    public List listNome(String nome){
        
         session.beginTransaction();
    Criteria crit = session.createCriteria(DrfUsuarios.class);
crit.add(Restrictions.like("drfNome", "%"+nome+"%"));
List lista = crit.list();
  session.getTransaction().commit();
return lista;
    
    }
    public List listCpf(String cpf){
        
         session.beginTransaction();
    Criteria crit = session.createCriteria(DrfUsuarios.class);
crit.add(Restrictions.like("drfCpf", "%"+cpf+"%"));
List lista = crit.list();
  session.getTransaction().commit();
return lista;
    
    }
      public List listNomeCpf(String cpf, String nome){
        
         session.beginTransaction();
    Criteria crit = session.createCriteria(DrfUsuarios.class);
    crit.add(Restrictions.like("drfNome", "%"+nome+"%"));
crit.add(Restrictions.like("drfCpf", "%"+cpf+"%"));
List lista = crit.list();
  session.getTransaction().commit();
return lista;
    
    }
}