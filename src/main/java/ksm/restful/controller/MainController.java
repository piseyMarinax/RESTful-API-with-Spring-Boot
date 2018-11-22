package ksm.restful.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import ksm.restful.model.Bike;
import ksm.restful.service.BikeService;

@RestController
@JacksonXmlRootElement

public class MainController {
	
	@Autowired
	private BikeService bikeService;
	
	@RequestMapping(value = "/bikes", produces = MediaType.APPLICATION_XML_VALUE)
	public List<Bike> getAllBikes(){
		return bikeService.getAllBikes();
	}

}
