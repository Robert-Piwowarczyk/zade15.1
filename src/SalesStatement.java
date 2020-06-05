import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

class SalesStatement {
    public static void main(String[] args) {
        try {
            List<ProductPrice> productPrices = SalesUtil.readProductPrice("objects.csv");
            Sum sum = CalculatorPrice.calculateStats(productPrices);
            System.out.println("Suma podatku VAT ze sprzedaży: " + CalculatorPrice.sumVatPrice(productPrices) + "zł");
            System.out.println("Sprzedaż Brutto: " + CalculatorPrice.sumBruttoPrice(productPrices) + "zł");
            System.out.println("Sprzedaż Netto: " + CalculatorPrice.sumNettoPrice(productPrices) + "zł");
            SalesUtil.exportData(sum, "sumNBV.csv");
        } catch (FileNotFoundException e) {
            System.out.println("Nie odnaleziono pliku");
        } catch (IOException e) {
            System.out.println("Nie udało się wyeksportować danych");
        }
    }
}