import java.math.BigDecimal;
import java.util.List;


class CalculatorPrice {


    static Sum calculateStats(List<ProductPrice> productPrices) {
        BigDecimal nettoSum = sumNettoPrice(productPrices);
        BigDecimal vatSum = sumVatPrice(productPrices);
        BigDecimal bruttoSum = sumBruttoPrice(productPrices);
        return new Sum(vatSum, bruttoSum, nettoSum);
    }

    static BigDecimal sumVatPrice(List<ProductPrice> productPrices) {
        BigDecimal sum = BigDecimal.ZERO;
        for (ProductPrice productPrice : productPrices) {
            sum = sum.add(productPrice.getVat1());
        }
        return sum;
    }

    static BigDecimal sumBruttoPrice(List<ProductPrice> productPrices) {
        BigDecimal sum = BigDecimal.ZERO;
        for (ProductPrice productPrice : productPrices) {
            sum = sum.add(productPrice.getBruttoPrice());
        }
        return sum;
    }

    static BigDecimal sumNettoPrice(List<ProductPrice> productPrices) {
        BigDecimal sum = BigDecimal.ZERO;
        for (ProductPrice productPrice : productPrices) {
            sum = sum.add(productPrice.getNettoPrice());
        }
        return sum;
    }
}