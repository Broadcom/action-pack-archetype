package ${package};

import com.broadcom.apdk.api.BaseActionPack;
import com.broadcom.apdk.api.annotations.ActionPack;

@ActionPack(
	name = "PCK.CUSTOM_SIMPLE", 
	title = "My first Java action pack",
	category = "Custom Actions",
	company = "Broadcom",
	homepage = "http://www.broadcom.com"	
)
public class CustomActionPack extends BaseActionPack {

}
