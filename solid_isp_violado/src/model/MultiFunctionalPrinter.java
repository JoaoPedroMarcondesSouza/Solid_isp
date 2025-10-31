package model;

public class MultiFunctionalPrinter implements IODevice, FaxCapable, PrintCapable, ScanCapable, XeroxCapable {

    @Override
    public void faxDocument(String content) {
        System.out.println("MP: Enviando documento por fax:\n" + content);
    }

    @Override
    public void printDocument(String content) {
        System.out.println("MP: Imprimindo documento:\n" + content);
    }

    @Override
    public void scanDocument(String content) {
        System.out.println("MP: Digitalizando documento:\n" + content);
    }

    @Override
    public void xeroxDocument(String content) {
        System.out.println("MP: Tirando xerox do documento:\n" + content);
    }
}
