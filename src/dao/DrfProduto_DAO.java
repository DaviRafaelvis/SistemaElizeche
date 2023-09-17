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
      session.beginTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
      session.flush();
      session.clear();
      session.update(object);
      session.beginTransaction().commit();
    }

    @Override
    public void delete(Object object) {
         session.beginTransaction();
          session.flush();
      session.clear();
      session.delete(object);
      session.beginTransaction().commit();
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
}
