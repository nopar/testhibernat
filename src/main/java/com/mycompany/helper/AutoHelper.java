/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.helper;

import com.mycompany.test1.Auta;
import com.mycompany.test1.NewHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author nox
 */
public class AutoHelper {

    Session session = null;

    public AutoHelper() {
        session = NewHibernateUtil.getSessionFactory().getCurrentSession();
    }

    public List<Auta> getAutaByZnacka(String znacka) {
        List<Auta> list = null;
        try {
            org.hibernate.Transaction tx = session.getTransaction();
            Query q = session.createQuery("from Auta as auto where auto.znacka ='" + znacka + "'");
            list = (List<Auta>) q.list();
            //System.out.println(q.getNamedParameters());
            //System.out.println("new line "+list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
