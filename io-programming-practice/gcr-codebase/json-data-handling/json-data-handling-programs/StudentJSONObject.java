package json_file_handling.json;

import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJSONObject {

	public static void main(String[] args) {
		JSONObject student = new JSONObject();  // create JSON object
		student.put("name", "Madhav");  // put values
		student.put("age", 22);
		JSONArray subjects = new JSONArray();  // create JSON array 
		subjects.put("Mathematics");  // add elements in array
		subjects.put("Chemistry");
		subjects.put("Physics");
		
		student.put("subjects",subjects);
		System.out.println(student.toString(2));  // print output

	}

}
