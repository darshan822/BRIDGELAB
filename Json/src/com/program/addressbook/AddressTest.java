package com.program.addressbook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class AddressTest {
	public static void main(String[] args) {
		ArrayList<AddressModel> al=new ArrayList<AddressModel>();  
		al.add(AddressModel.getModel("darshan", "zzzz",AddressModel.Address.getAddress("banglore", "karnataka",1234)));
	    al.add(AddressModel.getModel("krishna", "nnnn",AddressModel.Address.getAddress("honnavar", "karnataka",2000)));
	    System.out.println("sorting address book by zipcode");
	    Collections.sort(al,new ZipbasedComparator());
	    for(AddressModel st: al){  
	    	System.out.println(st.getLname());
	    	System.out.println(st.getAddress().getCity()+" "+st.getAddress().getState()+" "+st.getAddress().getZip());  
	    	} 
	    System.out.println("sorting address book by lastname");
	    Collections.sort(al,new LastnamebasedComparator());
	    for(AddressModel st: al){  
	    	System.out.println(st.getLname());
	    	System.out.println(st.getAddress().getCity()+" "+st.getAddress().getState()+" "+st.getAddress().getZip());  
	    	}  
	    Iterator itr = al.iterator();

        // remove all even numbers
        while (itr.hasNext()) {
            Object obj= itr.next();
           
            
        }
	}
	

}
