package ocean_fleet;

import java.util.ArrayList;
import java.util.List;

public class VesselUtil {
    private List<Vessel> vesselList=new ArrayList<Vessel>();
    
    // Getter method
    public List<Vessel> getVesselList(){
    	return vesselList;
    }
    
    //Setter method
    public void setVesselList(List<Vessel> vesselList) {
    	this.vesselList = vesselList;
    }
    
    public void addVesselPerformance(Vessel vessel) { // add new vessel
    	vesselList.add(vessel);
    }
    
    public Vessel getVesselById(String vesselId) {  // search by vessel id
    	for(Vessel vessel : vesselList) {
    		if(vessel.getVesselId().equals(vesselId)) {
    			return vessel;
    		}
    	}
    	return null;
    	
    }
    
    List<Vessel> highAverageSpeed = new ArrayList<>() ;
    
    public List<Vessel> getHighPerformanceVessels(){ // find vessels have max average speed
    	double maxAverageSpeed=0;
    	for(Vessel vessel : vesselList) {
    		if(vessel.getAverageSpeed()>maxAverageSpeed) {
    			maxAverageSpeed=vessel.getAverageSpeed();
    		}
    	}
    	
    	for(Vessel vessel : vesselList) {
    		if(vessel.getAverageSpeed()==maxAverageSpeed) {
    			highAverageSpeed.add(vessel);
    		}
    	}
    	
    	return highAverageSpeed;
    }
}
