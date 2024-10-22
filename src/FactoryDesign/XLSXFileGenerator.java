package FactoryDesign;

public class XLSXFileGenerator implements  FileGenerator{
    @Override
    public void generateFile() {
        System.out.println("XLSX File successfully generated ");
    }
}
