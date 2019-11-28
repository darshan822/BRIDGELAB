package com.program.addressbook;

import java.util.Comparator;

public class ZipbasedComparator implements Comparator<AddressModel> {

	@Override
	public int compare(AddressModel arg0, AddressModel arg1) {
    	
		if(arg0.getAddress().getZip()==arg1.getAddress().getZip())  
			return 0;  
			else if(arg0.getAddress().getZip()>arg0.getAddress().getZip())
			return -1;  
			else  
			return +1;   
    	
		
	}

}
