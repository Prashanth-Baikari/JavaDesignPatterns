package FactoryDesign;

public class PDFFileGenerator implements FileGenerator{
    @Override
    public void generateFile() {
        System.out.println("PDF File successfully generated ");
    }
}
