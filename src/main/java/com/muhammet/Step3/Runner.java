package com.muhammet.Step3;

public class Runner {
    public static void main(String[] args) {
        Provider provider;
        Printer printer;

        provider = new MessageProviderTR();
        printer = new DefaultPrinter();

        printer.setProvider(provider);
        printer.print();
    }
}
