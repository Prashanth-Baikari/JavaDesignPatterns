package FactoryDesign;

public class FileGeneratorService {
    public static void main(String[] args) {
        FileGeneratorFactory fileGeneratorFactory = new FileGeneratorFactory();
        FileGenerator fileGenerator = fileGeneratorFactory.createFileGenerator("CSV");
        fileGenerator.generateFile();
    }
}
