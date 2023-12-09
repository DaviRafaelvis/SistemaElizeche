/*s
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.DrfCompra;
import bean.DrfFornecedor;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author rafae
 */
public class DrfFornecedor_DAO extends DAO_Abstract{

   @Override
    public void insert(Object object) {
       session.beginTransaction();
      session.save(object);
      session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
      session.flush();
      session.clear();
      session.update(object);
      session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
         session.beginTransaction();
          session.flush();
      session.clear();
      session.delete(object);
      session.getTransaction().commit();
    }
    

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(DrfFornecedor.class);
        criteria.add(Restrictions.eq("drfIdfornecedor", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
       session.beginTransaction();
        Criteria criteria = session.createCriteria(DrfFornecedor.class);
         List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
}
    public List listEstado(int estado){
        
         session.beginTransaction();
    Criteria crit = session.createCriteria(DrfFornecedor.class);
crit.add(Restrictions.eq("drfEstado", estado));
List lista = crit.list();
  session.getTransaction().commit();
return lista;
    
    }
    public List listCnpj(String cnpj){
        
         session.beginTransaction();
    Criteria crit = session.createCriteria(DrfFornecedor.class);
crit.add(Restrictions.like("drfCnpj", cnpj, MatchMode.ANYWHERE));
List lista = crit.list();
  session.getTransaction().commit();
return lista;
    
    }
      public List listEstadoCnpj(int estado, String cnpj){
        
         session.beginTransaction();
    Criteria crit = session.createCriteria(DrfFornecedor.class);
    crit.add(Restrictions.eq("drfEstado", estado));
crit.add(Restrictions.like("drfCnpj", cnpj, MatchMode.ANYWHERE));
List lista = crit.list();
  session.getTransaction().commit();
return lista;
    
    }
}
