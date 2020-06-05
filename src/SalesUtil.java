import java.util.List;
import java.util.Scanner;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.io.*;


class SalesUtil {

    static List<ProductPrice> readProductPrice(String objects)
            throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(objects));
        List<ProductPrice> productPrices = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] split = line.split(";");
            ProductPrice nextProductPrice =
                    new ProductPrice(new BigDecimal(split[1]), split[0],
                            new BigDecimal(split[2]));
            productPrices.add(nextProductPrice);
        }
        return productPrices;
    }

    static void exportData(Sum stats, String sumNBV) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(sumNBV));

        writer.write("Netto;" + stats.getNettoSum());
        writer.newLine();
        writer.write("Brutto;" + stats.getBruttoSum());
        writer.newLine();
        writer.write("Vat;" + stats.getVatSum());
        writer.close();
    }
}