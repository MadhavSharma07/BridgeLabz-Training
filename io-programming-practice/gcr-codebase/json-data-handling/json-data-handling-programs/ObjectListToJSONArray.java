package json_file_handling.json;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;
public class ObjectListToJSONArray {
	    public static void main(String[] args) throws Exception {

	        List<Vechile> cars = new ArrayList<>();
	        cars.add(new Vechile("Toyota", "Camry", 2023));
	        cars.add(new Vechile("Honda", "City", 2022));
	        cars.add(new Vechile("BMW", "X5", 2024));

	        ObjectMapper mapper = new ObjectMapper();

	        String jsonArray = mapper.writeValueAsString(cars);

	        System.out.println(jsonArray);
	        System.out.println();
	    }
}

class Vechile {

    private String brand;
    private String model;
    private int year;

    //  constructor
    public Vechile(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

 
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
}




