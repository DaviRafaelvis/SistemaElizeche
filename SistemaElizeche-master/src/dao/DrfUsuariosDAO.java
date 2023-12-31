/*s
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.DrfProduto;
import bean.DrfUsuarios;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
crit.add(Restrictions.ilike("drfNome", nome, MatchMode.ANYWHERE));
List lista = crit.list();
  session.getTransaction().commit();
return lista;
    
    }
    public List listNivel(int nivel){
        
         session.beginTransaction();
    Criteria crit = session.createCriteria(DrfUsuarios.class);
crit.add(Restrictions.eq("drfNivel", nivel));
List lista = crit.list();
  session.getTransaction().commit();
return lista;
    
    }
      public List listNomeNivel(String nome, int nivel){
        
         session.beginTransaction();
    Criteria crit = session.createCriteria(DrfUsuarios.class);
    crit.add(Restrictions.ilike("drfNome", nome, MatchMode.ANYWHERE));
crit.add(Restrictions.eq("drfNivel", nivel));
List lista = crit.list();
  session.getTransaction().commit();
return lista;
    
    }
      
        public DrfUsuarios login(String usuarios, String senha){
    session.beginTransaction();
    Criteria criteria = session.createCriteria(DrfUsuarios.class);
    criteria.add(Restrictions.eq("drfNome", usuarios));
    criteria.add(Restrictions.eq("drfSenha", senha));
    DrfUsuarios usuarioAprovado = (DrfUsuarios) criteria.uniqueResult();
    session.getTransaction().commit();
        return usuarioAprovado;
    }
}