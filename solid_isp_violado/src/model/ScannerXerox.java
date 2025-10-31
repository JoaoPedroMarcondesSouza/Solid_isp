package model;

public class ScannerXerox implements IODevice, ScanCapable, XeroxCapable {

    @Override
    public void scanDocument(String content) {
        System.out.println("SX: Digitalizando documento:\n" + content);
    }

    @Override
    public void xeroxDocument(String content) {
        System.out.println("SX: Fazendo xerox do documento:\n" + content);
    }
}
