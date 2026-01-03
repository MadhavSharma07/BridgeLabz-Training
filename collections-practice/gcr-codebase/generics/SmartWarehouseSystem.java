import java.util.*;

public class SmartWarehouseSystem {  // main class
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Phone"));
        electronicsStorage.addItem(new Electronics("TV"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Oil"));
        groceriesStorage.addItem(new Groceries("Pulses"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Sofa"));
        furnitureStorage.addItem(new Furniture("Bed"));

      
        System.out.println("Electronics: ");
        WarehouseUtil.displayAllItems(electronicsStorage.getItems());  // print electronics items
 
        System.out.println("\nGroceries: ");
        WarehouseUtil.displayAllItems(groceriesStorage.getItems());  // print groceries items

        System.out.println("\nFurniture: ");
        WarehouseUtil.displayAllItems(furnitureStorage.getItems()); // print furniture items
    }
}

abstract class WarehouseItem {   // abstarct class WarehouseItem
	private String itemName;   // item Name
	
	public WarehouseItem(String itemName){   // constructor
		this.itemName = itemName;
		
		
	}
	public String getName() {  // getter method to get item name    
		return itemName;
	}
	public abstract void displayInfo() ; // abstract method
	

}

class Electronics extends WarehouseItem {  // class Electronics extends abstract class WarehouseItem
    public Electronics(String itemName) {
        super(itemName);
    }

    public void displayInfo() {
        System.out.println("Electronics Item: " + getName());
    }
}

class Groceries extends WarehouseItem {  //class Groceries extends abstract class WarehouseItem
    public Groceries(String itemName) {
        super(itemName);
    }

    public void displayInfo() {
        System.out.println("Grocery Item: " + getName());
    }
}

class Furniture extends WarehouseItem {  //class Furniture extends abstract class WarehouseItem
    public Furniture(String itemName) {
        super(itemName);
    }

    public void displayInfo() {
        System.out.println("Furniture Item: " + getName());
    }
}

class Storage<T extends WarehouseItem>{   // generic class Storage
	private List<T> items = new ArrayList<>();
	public void addItem(T item) {  // items store in list
		items.add(item);
	}
	public List<T> getItems(){
		return items;
	}
	
}

class WarehouseUtil{    // utility class to print items
	public static void displayAllItems(List<? extends WarehouseItem> items) {  // generic method and  use upper bound to read only
		for(WarehouseItem item : items) {
			item.displayInfo();
		}
	}
}
