package json_file_handling.json;
import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONStructureValidation {

	    public static void main(String[] args) throws Exception {

	    	File file = new File(System.getProperty("user.dir"),"/json-data-file/user.json");

	        ObjectMapper mapper = new ObjectMapper();
	        JsonNode rootNode = mapper.readTree(file);

	        if (rootNode.has("name") && rootNode.has("email")) {
	            System.out.println("JSON structure is valid");
	        } else {
	            System.out.println("JSON structure is invalid");
	        }
	    }
	}

