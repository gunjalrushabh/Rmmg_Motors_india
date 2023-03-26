package com.app.pojos;

public class testerforLombok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User obj=new User();
		obj.getCreateTime();
		obj.equals(obj);
		obj.hashCode();
		Vehicle vobj = new Vehicle();
		Appointment aobj=new Appointment();
		aobj.setPrice(1000.00);
		
		User uobj=new User();
		System.out.println( uobj.getName());
		System.out.println( (uobj.toString()));
		uobj.setName("rushabh");
		System.out.println( uobj.getName());
	
		Vehicle v =new Vehicle();
		
	}

}
