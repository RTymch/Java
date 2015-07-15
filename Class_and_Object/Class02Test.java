package Class_and_Object;

public class Class02Test {

	public static void main(String[] args) {
		
		Class02 stock = new Class02();
		stock.name = "Oracle Corporation";
		stock.symbol = "ORCL";
		stock.previousClosingPrice = 34.5;
		stock.currentPrice = 34.35;
		
		System.out.println(stock.name + " " + stock.symbol + " " + stock.getChangePercent() + "%");
		
	}
}
