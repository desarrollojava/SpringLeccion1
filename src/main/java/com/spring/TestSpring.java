/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring;

import javafx.application.Application;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author admin
 */
public class TestSpring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pathAplicationContext = "classpath:/com/configuracion/applicationContext.xml";

        //ubicar el archivo applicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext(pathAplicationContext);
        //definir la fabrica de spring (instanciar)
        BeanFactory factory = context;
        //solicitamos un bean
        //BeanSpring miBean=(BeanSpring) factory.getBean("nameSpring");
        //System.out.println("Mensaje:-->"+miBean.getMensaje());

//        Persona persona = (Persona) context.getBean("beanSpringConst");
//        System.out.println("Id:-->" + persona.getId() + "Nombre: " + persona.getNombre() + "Fecha nacimiento: " + persona.getFechaNacimiento());
        //test de objetos anidados
//        Profesor profesor = (Profesor) context.getBean("idProfesor");
//        System.out.println("Profesor:-->" + profesor.getNombre() + "Academia: " + profesor.getAcademia().getNombre() + "Ciudad: " + profesor.getAcademia().getCiudad().getNombre());

        SLCiudad sLCiudad = (SLCiudad) context.getBean("idCiudad");

        for (SLAcademia obj : sLCiudad.getListaAcademia()) {
            System.out.println(obj.getNombre());

        }
//        System.out.println("Profesor:-->" + profesor.getNombre() + "Academia: " + profesor.getAcademia().getNombre() + "Ciudad: " + profesor.getAcademia().getCiudad().getNombre());

    }

}
