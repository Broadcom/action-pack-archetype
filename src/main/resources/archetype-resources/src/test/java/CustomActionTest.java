package ${package};

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomActionTest {
	
	@Test
	public void CustomAction() {
		CustomAction action = new CustomAction();
		action.yourname = "Michael"; 
		action.run();
		Assertions.assertEquals("Hallo Michael", action.greeting);
	} 

}
