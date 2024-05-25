package com.muhammet.Step4;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class FactoryBuilder implements Factory{
    private Printer printer;
    private Provider provider;
    private static FactoryBuilder instance;

    static {
        instance = new FactoryBuilder();
    }

    private FactoryBuilder(){}

    public static FactoryBuilder getInstance(){
        return instance;
    }

    private Properties properties;

    {
        properties = new Properties();
        try {
            properties.load(new FileInputStream("/Users/muhammetalikaya/BILGEADAM_DATAS/BOOST_JAVA_HS_1/Spring/SpringDI/src/main/resources/application.properties"));
            String providerClassName = properties.getProperty("provider");
            String printerClassName = properties.getProperty("printer");
            provider = (Provider) Class.forName(providerClassName).getDeclaredConstructor().newInstance();
            printer = (Printer) Class.forName(printerClassName).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public Provider getProvider() {
        return provider;
    }

    @Override
    public Printer getPrinter() {
        return printer;
    }
}
