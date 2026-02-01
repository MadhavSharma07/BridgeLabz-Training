import java.util.*;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Goods Transport details:");
		String string = sc.next(); // taking a input as String

		Utility utility = new Utility(); // making a object of Utility Class

		GoodsTransport goodstransport = utility.parseDetails(string);

		String ObjectType = utility.findObjectType(goodstransport);

		if (goodstransport == null) {
			System.out.println("Please provide a valid record");
			return;
		}

		if (ObjectType.equalsIgnoreCase("BrickTransport")) {

			BrickTransport brick = (BrickTransport) goodstransport; // DownCasting

			System.out.println("Transporter id: " + brick.transportId);
			System.out.println("Date of transport : " + brick.transportDate);
			System.out.println("Rating of the transport : " + brick.transportRating);
			System.out.println("Quantity of bricks : " + brick.getbrickQuantity());
			System.out.println("Brick Price: " + brick.getbrickPrice());
			System.out.println("Vehicle for transport : " + brick.vehicleSelection());
			System.out.println("Total charge: " + brick.calculateTotalCharge());
		}

		if (ObjectType.equalsIgnoreCase("TimberTransport")) {

			TimberTransport timber = (TimberTransport) goodstransport; // DownCasting

			System.out.println("Transporter ID: " + timber.transportId);
			System.out.println("Date of Transport : " + timber.transportDate);
			System.out.println("Rating of  transport : " + timber.transportRating);
			System.out.println("Type of the Timber : " + timber.gettimberType());
			System.out.println("Timber price per kilo: " + timber.gettimberPrice());
			System.out.println("Vehicle for Transport : " + timber.vehicleSelection());
			System.out.println("Total Charge:" + timber.calculateTotalCharge());
		}

	}
}
