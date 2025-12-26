package oops-practice.gcr-codebase.java-inheritance;

class Order{            // parent class Order
	int orderId;
	String orderDate;
	Order(int orderId, String orderDate){
		this.orderId= orderId;
		this.orderDate= orderDate;
	}
	public void printOrderStatus(){
		System.out.println("Order status: ");
		System.out.println("orderId: "+orderId);
		System.out.println("orderDate: "+orderDate);
		System.out.println();
	}
	
}
class ShippedOrder extends Order{         //child class ShippedOrder  extends  parent Order
	int trackingNumber;
	ShippedOrder(int orderId, String orderDate,int trackingNumber){
		super(orderId, orderDate);
		this.trackingNumber=trackingNumber;
	}
	public void printOrderStatus(){
		System.out.println("ShippedOrder status: ");
		System.out.println("orderId: "+orderId);
		System.out.println("orderDate: "+orderDate);
		System.out.println("trackingNumber: "+trackingNumber);
		System.out.println();
		
	}
}
class DeliveredOrder extends ShippedOrder{    // child class Deliveredorder extends ShippedOrpder
	String deliveryDate;
	DeliveredOrder(int orderId, String orderDate,int trackingNumber,String deliveryDate){
		super(orderId, orderDate,trackingNumber);
		this.deliveryDate=deliveryDate;
	}
	public void printOrderStatus(){
		System.out.println("DeliveredOrder status: ");
		System.out.println("orderId: "+orderId);
		System.out.println("orderDate: "+orderDate);
		System.out.println("trackingNumber: "+trackingNumber);
		System.out.println("deliveryDate: "+deliveryDate);
		System.out.println();
		
		
	}
}


public class OnlineRetail {  // Main class


	public static void main(String[] args) {
		Order[] order = new Order[3];
		order[0]=new Order(123,"26/12/2025");
		order[1]=new ShippedOrder(123,"26/12/2025",234);
		order[2]=new DeliveredOrder(123,"26/12/2025",234,"01/01/2026");
		
		for(Order or:order) {
			or.printOrderStatus();
		}
		
		

	}

}
