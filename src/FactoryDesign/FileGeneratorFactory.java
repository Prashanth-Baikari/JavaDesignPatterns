package FactoryDesign;

public class FileGeneratorFactory {

   public FileGenerator createFileGenerator(String fileType){
        return switch (fileType) {
            case "CSV" -> new CSVFileGenerator();
            case "XLSX" -> new XLSXFileGenerator();
            case "PDF" -> new PDFFileGenerator();
            default -> throw new IllegalArgumentException("Invalid File Type " + fileType);
        };
    }
}
