package FactoryDesign;

public class CSVFileGenerator implements FileGenerator{
    @Override
    public void generateFile() {
        System.out.println("CSV File successfully generated ");
    }
}
