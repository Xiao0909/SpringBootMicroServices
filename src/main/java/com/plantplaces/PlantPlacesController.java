package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 * Handle the /start endpoints
 * @return
 */

@Controller
public class PlantPlacesController {
	
	
	@RequestMapping("/start")
	public String Start(){
		
		return "start";
	}
	
	/**
	 * 
	 * Handle the /start endpoints
	 * @return
	 */
	
	@RequestMapping("/")
	public String index(){
		
		return "start";
	}
}
