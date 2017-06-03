import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

public class ScenarioGenerator {
	@SuppressWarnings("unchecked")
	Set<List<String>> result = Sets.cartesianProduct(
            ImmutableSet.of("Zero", "Low", "Medium", "High"),
            ImmutableSet.of("Zero", "Low", "Medium", "High"),
            ImmutableSet.of("Zero", "Low", "Medium", "High"),
            ImmutableSet.of("Zero", "Low", "Medium", "High")
    );
	
	@SuppressWarnings("rawtypes")
	List getResult(List result){
		System.out.println(result.size());
		return result;
	};
	
	void loopThroughList(){
		for (List<String> s : result) {
			
		    String first = s.get(0);
		    String second = s.get(1);
		    String third = s.get(2);
		    String fourth = s.get(3);
		    
		    //Refers to straight on
		    switch (first) {
	        case "Zero":
	        	//Do something
	        	break;
	        case "Low":
	        	//Do something
	        	break;
	        case "Medium":
	        	//Do something
	        	break;
	        case "High":
	        	//Do something
	        	break;
		    }
		    
		  //Refers to right turn
		    switch (second) {
	        case "Zero":
	        	//Do something
	        	break;
	        case "Low":
	        	//Do something
	        	break;
	        case "Medium":
	        	//Do something
	        	break;
	        case "High":
	        	//Do something
	        	break;
		    }
		    
		  //Refers to left turn
		    switch (third) {
	        case "Zero":
	        	//Do something
	        	break;
	        case "Low":
	        	//Do something
	        	break;
	        case "Medium":
	        	//Do something
	        	break;
	        case "High":
	        	//Do something
	        	break;
		    }
		    
		  //Refers to pedestrians
		    switch (fourth) {
	        case "Zero":
	        	//Do something
	        	break;
	        case "Low":
	        	//Do something
	        	break;
	        case "Medium":
	        	//Do something
	        	break;
	        case "High":
	        	//Do something
	        	break;
		    }
		    
		    System.out.println("1st "+ first + ", " + "2nd "+ second + ", " + "3rd " + third + ", " + "4th " + fourth);
		}
	}
		
	void pause10s(){
		 try {
				TimeUnit.SECONDS.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	 
}
