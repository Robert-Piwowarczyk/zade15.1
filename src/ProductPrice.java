import java.math.MathContext;
import java.math.BigDecimal;


class ProductPrice {
    private BigDecimal vat;
    private String name;
    private BigDecimal nettoPrice;

    public ProductPrice(BigDecimal vat, String name, BigDecimal nettoPrice) {
        this.vat = vat;
        this.name = name;
        this.nettoPrice = nettoPrice;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getNettoPrice() {
        return nettoPrice;
    }

    public void setNettoPrice(BigDecimal nettoPrice) {
        this.nettoPrice = nettoPrice;
    }

    BigDecimal getVat1() {
        return nettoPrice.multiply(vat.divide(new BigDecimal(100), MathContext.DECIMAL64));
    }

    BigDecimal getBruttoPrice() {
        return nettoPrice.add(getVat1());
    }
}