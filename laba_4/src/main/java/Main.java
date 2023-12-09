import com.java.CSV.CSVParser;

public class Main {
    public static void main(String[] args) {
        CSVParser parser = new CSVParser();
        parser.read("D:\\универ\\лабы_3_курс\\Java\\laba_4\\src\\foreign_names.csv");
        parser.print();
    }
}