package json_file_handling.json;
import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
public class MergeTwoJSONFiles {
		
		    public static void main(String[] args) throws Exception {

		        ObjectMapper mapper = new ObjectMapper();

		        File file1 = new File(System.getProperty("user.dir"),"/json-data-file/json1.json");
		        File file2 = new File(System.getProperty("user.dir"),"/json-data-file/json2.json");

		        JsonNode node1 = mapper.readTree(file1);
		        JsonNode node2 = mapper.readTree(file2);

		        ObjectNode merged = mapper.createObjectNode();

		        // merge json1
		        merged.setAll((ObjectNode) node1);
		        // merge json2
		        merged.setAll((ObjectNode) node2);

		        System.out.println(merged.toPrettyString());
		    }
		}

