package com.muhammet.Step5;

public class MyFramework {
    private Provider provider;
    private Printer printer;
    private MyFramework(){}
    public static final MyFramework INSTANCE;
    static {
        INSTANCE = new MyFramework();
    }

    public Printer getPrinter(String classNameOne, String classNameTwo){
        Object one=null;
        Object two=null;
        try{
            one = Class.forName(classNameOne).getDeclaredConstructor().newInstance();
            two = Class.forName(classNameTwo).getDeclaredConstructor().newInstance();
        }catch (Exception exception){

        }
        if(one instanceof Printer){
            printer = (Printer) one;
            provider = (Provider) two;
        }else {
            printer = (Printer) two;
            provider = (Provider) one;
        }
        printer.setProvider(provider);
        return  printer;
    }
}
