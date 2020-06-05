import java.math.BigDecimal;

class Sum {
    private BigDecimal nettoSum;
    private BigDecimal bruttoSum;
    private BigDecimal vatSum;

    public Sum(BigDecimal nettoSum, BigDecimal bruttoSum, BigDecimal vatSum) {
        this.nettoSum = nettoSum;
        this.bruttoSum = bruttoSum;
        this.vatSum = vatSum;
    }

    public BigDecimal getNettoSum() {
        return nettoSum;
    }

    public void setNettoSum(BigDecimal nettoSum) {
        this.nettoSum = nettoSum;
    }

    public BigDecimal getBruttoSum() {
        return bruttoSum;
    }

    public void setBruttoSum(BigDecimal bruttoSum) {
        this.bruttoSum = bruttoSum;
    }

    public BigDecimal getVatSum() {
        return vatSum;
    }

    public void setVatSum(BigDecimal vatSum) {
        this.vatSum = vatSum;
    }
}