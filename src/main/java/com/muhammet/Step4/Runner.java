package com.muhammet.Step4;


public class Runner {
    public static void main(String[] args) {
        FactoryBuilder factoryBuilder = FactoryBuilder.getInstance();
        Provider provider = factoryBuilder.getProvider();
        Printer printer = factoryBuilder.getPrinter();
        printer.setProvider(provider);
        printer.print();
    }
}
