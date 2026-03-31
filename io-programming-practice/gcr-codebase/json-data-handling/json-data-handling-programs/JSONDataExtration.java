package json_file_handling.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONDataExtration {

	public static void main(String[] args) throws IOException {
		File file = new File(System.getProperty("user.dir"),"/json-data-file/user.json");
		
		ObjectMapper mapper = new ObjectMapper();
		JsonNode node = mapper.readTree(file);
		
		String name = node.get("name").asText();
		String email = node.get("email").asText();
		
		System.out.println("name : "+name);
		System.out.println("email :"+email);
		

	}

}
