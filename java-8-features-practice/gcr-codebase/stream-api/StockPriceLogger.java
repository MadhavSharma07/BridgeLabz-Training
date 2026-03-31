package stream_api;
import java.util.*;
import java.util.stream.Collectors;

public class StockPriceLogger {
	    public static void main(String[] args) {

	        // Simulated live stock price feed
	        List<Double> stockPrices = Arrays.asList(
	                2450.50, 2460.75, 2445.20, 2475.00, 2480.30
	        );

	        System.out.println("Live Stock Price Updates:");

	        // forEach to log prices
	        stockPrices.forEach(price ->
	                System.out.println("Current Price: " + price)
	        );
	    }
	}

