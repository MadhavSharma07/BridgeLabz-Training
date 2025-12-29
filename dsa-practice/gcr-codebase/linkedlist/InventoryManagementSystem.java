package gcr-codebase.linkedlist;

class Item{// Item node class
	String itemName;
	String itemId;
	int quantity;
	int price;
	Item next;
	Item(String itemName,String itemId,int quantity,int price){
		this.itemName = itemName;
		this.itemId = itemId;
		this.quantity = quantity;
		this.price = price;
		this.next = null;
	}
}


public class InventoryManagementSystem {// main class

	Item head;
	Item tail;
	static int size;
	InventoryManagementSystem(){//constructor to initialise head and tail  null for a empty linked list
		this.head = null;
		this.tail = null;
	}
	
	
	public void addAtBeginning(String itemName,String itemId,int quantity,int price) { //method to add at beginning
		Item newNode = new Item(itemName,itemId,quantity,price);
		if(head == null) {
			head = tail = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
		size++;
	}
	
	
	public void addAtEnd(String itemName,String itemId,int quantity,int price) {//method to add item at end
		Item newNode = new Item(itemName,itemId,quantity,price);
		if(tail == null) {
			head = tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}
	
	
	public void addAtkPosition(String itemName,String itemId,int quantity,int price,int k) {//method to add at specific position k 
		Item newNode = new Item(itemName,itemId,quantity,price);
		if(k == 1) {
			addAtBeginning(itemName,itemId,quantity,price);
		}
		else if(k == size) {
			addAtEnd(itemName,itemId,quantity,price);
		}
		else {
			Item temp = head;
			while(k-- > 2) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
			size++;
		}
		
	}
	
	
	public void deleteByItemId(String itemId) {//method to delete or remove a item based on item Id
		Item curr = head;
		Item prev = null;
		if(head.itemId == itemId) {
			head = head.next;
		}
		else {
		while(curr.itemId != itemId){
			prev = curr;
			curr = curr.next;
		}
		prev.next = curr.next;
		}
		size--; 
	}
		
	
	public void updateGrade(int quantity , String itemId) {//method to modify quantity by item Id
		Item temp = head;
		while(temp.itemId != itemId) {
			temp = temp.next;
		}
		temp.quantity = quantity;
	}
		
	
		public void searchByItemId(String itemId , String itemName) {  //method to search an item by item Id or item name
			Item temp = head;
			int check = 0;
			while(temp!=null) {
				if(temp.itemId == itemId || temp.itemName == itemName ) {
					check = 1;
					System.out.println("Item Details :");
					System.out.println("//////////////////////////");
					System.out.println("Item Name :"+temp.itemName);
					System.out.println("Item Id :"+temp.itemId);
					System.out.println("Quantity :"+temp.quantity);
					System.out.println("Price :"+temp.price);
					System.out.println("//////////////////////////");
					break;
				}
				else {
					temp = temp.next;
				}
			}
			if(check != 1) {
				System.out.println("Item record with item Id  : "+itemId +" or item Name :"+itemName +" doesn't exist" );
			}
		}
		
		
		public long totalValue() {//method to return total value of inventory after calculation
			long sum = 0;
			Item temp = head;
			while(temp!=null) {
				int pro = 1;
				pro = temp.quantity*temp.price;
				sum += pro;	
			}
			return sum;
		}
		
		
		public void sortByPrice() {//method to sort inventory based on price in descending order
			Item temp = head;
			while(temp.next!=null) {
				if(temp.price > temp.next.price) {
					Item a = temp;
					temp = temp.next;
					temp.next = a;
				}
			}
		}
	
		
		public void displayAll() {//method to display all items in inventory
			Item temp = head;
			while(temp!=null) {
				System.out.println("----Item Record----");
				System.out.println("Item Id :"+temp.itemId);
				System.out.println("Item Name :"+temp.itemName);
				System.out.println("Item Price :"+temp.price);
				System.out.println("Item Quanity Availabe :"+temp.quantity);
				System.out.println("/////////////////////////");	
				temp = temp.next;
			}
		}
		
	public static void main(String[] args) {// main method
		InventoryManagementSystem item = new InventoryManagementSystem();
		item.addAtBeginning("TV", "01", 10, 60);
		item.addAtEnd("Sofa", "02", 20, 250);
		item.addAtkPosition("Butter", "03", 15, 20, 2);
		item.searchByItemId("02", "Sofa");
		item.deleteByItemId("02");
		item.searchByItemId("02", "Sofa");
		item.displayAll();
		long val = item.totalValue();
		System.out.println("Total value of Inventory is :"+val);
		item.sortByPrice();
		item.displayAll();

	}
	
}
