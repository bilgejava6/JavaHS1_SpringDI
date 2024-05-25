package com.muhammet.Step6_SpringFramework;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

    public static void main(String[] args) {



        /**
         * Spring Application Context i uygulama için gerekli olan tüm nesnelerin
         * referanslarını tutulduğu yerdir.
         * Spring bir sınıftan nesne yarattığında buna Bean adını verir.
         */
        BeanFactory factory = new ClassPathXmlApplicationContext("spring.xml");
        Printer printer = factory.getBean("printerBean", Printer.class);
        printer.print();
    }
}
