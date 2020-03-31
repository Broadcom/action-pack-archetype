package ${package};

import com.broadcom.apdk.api.BaseAction;
import com.broadcom.apdk.api.annotations.Action;
import com.broadcom.apdk.api.annotations.ActionInputParam;
import com.broadcom.apdk.api.annotations.ActionOutputParam;

@Action(
	name = "HELLO", 
	title = "My first action",
	path = "BROADCOM"
)
public class CustomAction extends BaseAction {
	
	@ActionInputParam
	String yourname;

	@ActionOutputParam
	String greeting;
		
	@Override
	public void run() {
		greeting = "Hallo " + yourname;
		LOGGER.info("Assigned \"" + greeting + "\" to output parameter \"greeting\".");
	}

}
