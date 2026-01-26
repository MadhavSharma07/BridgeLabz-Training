package json_file_handling.json;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
public class JSONParsing {
	    public static void main(String[] args) throws Exception {
	    	File file = new File(System.getProperty("user.dir"),"/json-data-file/person.json");
	        ObjectMapper mapper = new ObjectMapper();

	        // Read JSON array from file
	        JsonNode rootNode = mapper.readTree(file);

	        System.out.println("Users with age > 25:");

	        // Loop through JSON array
	        for (JsonNode node : rootNode) {
	            int age = node.path("age").asInt();

	            if (age > 25) {
	                String name = node.path("name").asText();
	                System.out.println("Name: " + name + ", Age: " + age);
	            }
	        }
	    }
	}

