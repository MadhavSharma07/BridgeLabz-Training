package stream_api;
import java.util.*;
import java.util.stream.Collectors;


public class InsuranceClaimAnalysis {
	public static void main(String[] args) {
	     List<Claim> claims = Arrays.asList(
	                new Claim("Health", 50000),
	                new Claim("Vehicle", 20000),
	                new Claim("Health", 70000),
	                new Claim("Life", 100000),
	                new Claim("Vehicle", 30000)
	        );

	        // Average claim amount per claim type
	        Map<String, Double> avgClaimByType =
	                claims.stream()
	                        .collect(Collectors.groupingBy(
	                                Claim::getClaimType,
	                                Collectors.averagingDouble(Claim::getAmount)
	                        ));

	        System.out.println(avgClaimByType);
	    }
	}


class Claim {
    private String claimType;
    private double amount;

    Claim(String claimType, double amount) {
        this.claimType = claimType;
        this.amount = amount;
    }

    public String getClaimType() {
        return claimType;
    }

    public double getAmount() {
        return amount;
    }
}

