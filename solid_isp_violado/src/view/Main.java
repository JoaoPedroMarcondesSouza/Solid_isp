package view;

import model.*;

public class Main {

    public static void main(String[] args) {
        String content = "Conteúdo para operação de I/O";

        // Teste com diferentes dispositivos:
        // IODevice device = new Fax();
        // IODevice device = new StandardPrinter();
        // IODevice device = new MultiFunctionalPrinter();
        IODevice device = new MultiFunctionalPrinter();


        // Executa apenas as operações suportadas (forma compatível com Java 11)
        if (device instanceof PrintCapable) {
            ((PrintCapable) device).printDocument(content);
        }

        if (device instanceof FaxCapable) {
            ((FaxCapable) device).faxDocument(content);
        }

        if (device instanceof ScanCapable) {
            ((ScanCapable) device).scanDocument(content);
        }

        if (device instanceof XeroxCapable) {
            ((XeroxCapable) device).xeroxDocument(content);
        }
    }
}

