public class Stock {
    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;

    public Stock(){
        this.symbol = "ORCL";
        this.name = "Oracle Corporation";
    }

    public Stock (String symbol, String name, double previousClosingPrice, double currentPrice){
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public double getChangePercent(){
        return ((this.currentPrice - this.previousClosingPrice) / this.currentPrice) * 100;
    }
}
