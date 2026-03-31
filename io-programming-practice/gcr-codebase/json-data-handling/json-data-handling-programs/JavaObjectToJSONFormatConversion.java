package json_file_handling.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaObjectToJSONFormatConversion {

	public static void main(String[] args) throws JsonProcessingException {
		Car car = new Car("G-Wagon","Mercedes");
		
		ObjectMapper mapper = new ObjectMapper();
		String json =mapper.writeValueAsString(car);
		System.out.println(json);

	}

}

class Car{  // class Car
	public String name;  // make public bcz jackson need public or private +public getter
	public String brand;
	
	Car(String name, String brand){
		this.name=name;
		this.brand=brand;
	}
	
}
