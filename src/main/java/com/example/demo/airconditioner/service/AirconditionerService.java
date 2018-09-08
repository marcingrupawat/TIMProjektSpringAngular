package com.example.demo.airconditioner.service;
import com.example.demo.model.StatusobiektowEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("obiektyService")
public class AirconditionerService  {



    private static SessionFactory factory = null;
    private List<StatusobiektowEntity> custList;



    public List<StatusobiektowEntity> fromClause(){
        setUpSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();

            String hql = "FROM StatusobiektowEntity";
            Query<StatusobiektowEntity> query = session.createQuery(hql, StatusobiektowEntity.class);
            custList = query.list();

            custList.forEach(System.out::println);

            tx.commit();
        }catch(Exception e){
            if(null != tx){
                tx.rollback();
            }
        }finally{
            session.close();
        }

        shutdown();
        return custList;
    }

    public static void setUpSessionFactory() {
        // create sessionFactory
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static void shutdown(){
        factory.close();
    }
    /*public List<StatusObiektow> tabObj()
    {

        Query query = entityManager.createNativeQuery("select a.idstatusu  From StatusObiektow a  where a.status='Włączony'" , Obiekty.class);


        return  query.getResultList();


    }
*/





}



