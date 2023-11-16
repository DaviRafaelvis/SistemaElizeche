/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.DrfCompra;
import bean.DrfCompraProduto;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author rafae
 */
public class DrfCompras_DAO extends DAO_Abstract{

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
        Criteria criteria = session.createCriteria(DrfCompra.class);
        criteria.add(Restrictions.eq("drfIdcompra", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
       session.beginTransaction();
        Criteria criteria = session.createCriteria(DrfCompra.class);
         List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
}
    public List listData(Date data){
        
         session.beginTransaction();
    Criteria crit = session.createCriteria(DrfCompra.class);
crit.add(Restrictions.eq("drfData", data));
List lista = crit.list();
  session.getTransaction().commit();
return lista;
    
    }
    public List listValor(double valor){
        
         session.beginTransaction();
    Criteria crit = session.createCriteria(DrfCompra.class);
crit.add(Restrictions.gt("drfValorTotalCompra",new Double(valor)));
List lista = crit.list();
  session.getTransaction().commit();
return lista;
    
    }
      public List listDataValor(Date data, double valor){
        
         session.beginTransaction();
    Criteria crit = session.createCriteria(DrfCompra.class);
    crit.add(Restrictions.ge("drfFormaPagamento", data));
crit.add(Restrictions.gt("drfValorTotalCompra", new Double(valor)));
List lista = crit.list();
  session.getTransaction().commit();
return lista;
    
    }
}
