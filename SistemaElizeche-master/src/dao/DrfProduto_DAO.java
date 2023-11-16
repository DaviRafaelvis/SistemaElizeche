/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.DrfFornecedor;
import bean.DrfProduto;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author rafae
 */
public class DrfProduto_DAO extends DAO_Abstract{ 

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
        Criteria criteria = session.createCriteria(DrfProduto.class);
        criteria.add(Restrictions.eq("drfIdProduto", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
       session.beginTransaction();
        Criteria criteria = session.createCriteria(DrfProduto.class);
         List lista = criteria.list();
        session.getTransaction().commit();
        return lista;

}
    public List listValor(Double valor){
        
         session.beginTransaction();
    Criteria crit = session.createCriteria(DrfProduto.class);
crit.add(Restrictions.gt("drfValorUnitario",new Double(valor)));
List lista = crit.list();
  session.getTransaction().commit();
return lista;
    
    }
    public List listColecao(String colecao){
        
         session.beginTransaction();
    Criteria crit = session.createCriteria(DrfProduto.class);
crit.add(Restrictions.like("drfColecao", "%"+colecao+"%"));
List lista = crit.list();
  session.getTransaction().commit();
return lista;
    
    }
      public List listValorColecao(Double valor, String colecao){
        
         session.beginTransaction();
    Criteria crit = session.createCriteria(DrfProduto.class);
crit.add(Restrictions.gt("drfValorUnitario",new Double(valor)));
crit.add(Restrictions.like("drfColecao", colecao));
List lista = crit.list();
  session.getTransaction().commit();
return lista;
    
    }
}