package FactoryDesign;

public class FactoryDesignApplication {
    public static void main(String[] args) {
        FileGeneratorFactory factory = new FileGeneratorFactory();
        FileGenerator fileGenerator = factory.createFileGenerator("XLSX");
        fileGenerator.generateFile();
    }
}
