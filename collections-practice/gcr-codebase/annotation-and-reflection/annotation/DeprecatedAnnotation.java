package annotations;

public class DeprecatedAnnotation {

	public static void main(String[] args) {
		LegacyAPI api= new LegacyAPI();   // LegacyAPI object
		api.oldFeature();   // gives warning
		api.newFeature();

	}

}

class LegacyAPI{  // class LegacyAPI
	
	@Deprecated
	void oldFeature() {   // deprecated method - old feature
		System.out.println("Old feature method");
	}
	
	void newFeature() {  // new feature method
		System.out.println("New feature method");   
	}
}
