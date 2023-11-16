/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.DrfFornecedor;
import bean.DrfFuncionario;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author rafae
 */
public class DrfFuncionario_DAO extends DAO_Abstract{

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
        Criteria criteria = session.createCriteria(DrfFuncionario.class);
        criteria.add(Restrictions.eq("drfIdFuncionario", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
       session.beginTransaction();
        Criteria criteria = session.createCriteria(DrfFuncionario.class);
         List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
}
      public List listData(Date data){
        
         session.beginTransaction();
    Criteria crit = session.createCriteria(DrfFuncionario.class);
crit.add(Restrictions.eq("drfDataNascimento", data));
List lista = crit.list();
  session.getTransaction().commit();
return lista;
    
    }
    public List listCpf(String cpf){
        
         session.beginTransaction();
    Criteria crit = session.createCriteria(DrfFuncionario.class);
crit.add(Restrictions.like("drfCpf", "%"+cpf+"%"));
List lista = crit.list();
  session.getTransaction().commit();
return lista;
    
    }
      public List listCpfData(String cpf, Date data){
        
         session.beginTransaction();
    Criteria crit = session.createCriteria(DrfFuncionario.class);
    crit.add(Restrictions.like("drfCpf", "%"+cpf+"%"));
    crit.add(Restrictions.eq("drfDataNascimento", data));

List lista = crit.list();
  session.getTransaction().commit();
return lista;
    
    }
}
