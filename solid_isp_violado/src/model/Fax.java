package model;

public class Fax implements IODevice, FaxCapable {

    @Override
    public void faxDocument(String content) {
        System.out.println("FX: Enviando documento via fax:\n" + content);
    }
}
