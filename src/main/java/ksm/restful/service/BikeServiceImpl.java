package ksm.restful.service;

import java.util.ArrayList;
import java.util.List;

import ksm.restful.model.Bike;

public class BikeServiceImpl implements BikeService {

	public List<Bike> getAllBikes() {
		 List<Bike> list = new ArrayList<Bike>();
		 list.add(new Bike(1,"red"));
		 list.add(new Bike(2,"Blue"));
		 list.add(new Bike(3,"Yellow"));
		return list;
	}

}
