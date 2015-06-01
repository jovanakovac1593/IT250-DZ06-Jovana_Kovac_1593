/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.it250.dz06.jovana_kovac_1593.pages;
import com.mycompany.it250.dz06.jovana_kovac_1593.entities.Soba;
import java.util.ArrayList;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;




/**
 *
 * @author student
 */
public class DodavanjeSobe {

 @Property
 private ArrayList<Soba> sobe;
 
 @Property
 private Soba soba;
 
 @Inject
 private Session session;
 
 void onActivate(){
     if (sobe == null) {
         sobe = new ArrayList<Soba>();
     }
     sobe = (ArrayList<Soba>) session.createCriteria(Soba.class).list();
 }
 
 @CommitAfter
 Object onSuccess(){
     session.persist(soba);
     return this;
 }
}
