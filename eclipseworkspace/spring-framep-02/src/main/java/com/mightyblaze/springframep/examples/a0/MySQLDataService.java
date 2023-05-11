package com.mightyblaze.springframep.examples.a0;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class MySQLDataService implements DataService{
	@Override
	public int[] retrieveData() {
		return new int [] {1,2,3,4,5};
	}
}
