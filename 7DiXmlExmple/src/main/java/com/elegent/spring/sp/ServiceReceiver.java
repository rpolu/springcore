package com.elegent.spring.sp;

public class ServiceReceiver {
	private ServiceProvider sp;

	public void setSp(ServiceProvider sp) {
		this.sp = sp;
	}

	public void getService() {
		System.out.println(" I need service");
		sp.provideService();
	}

}
