package model;

public class StandardPrinter implements IODevice, PrintCapable {

    @Override
    public void printDocument(String content) {
        System.out.println("SP: Imprimindo documento:\n" + content);
    }
}
