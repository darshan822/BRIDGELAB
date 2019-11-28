package com.program.addressbook;

import java.util.Comparator;

public class LastnamebasedComparator implements Comparator<AddressModel> {
    @Override
	public int compare(AddressModel arg0, AddressModel arg1) {
    	
    		return arg0.getLname().compareTo(arg1.getLname());  
    	
		
	}

}
