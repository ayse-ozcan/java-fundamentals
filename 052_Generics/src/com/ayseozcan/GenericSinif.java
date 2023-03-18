package com.ayseozcan;

public class GenericSinif <U> {

	public U obj;
	
	GenericSinif(U object) {
		this.obj = object;
		
	}

	public U getObj() {
		return obj;
	}

	public void setObj(U obj) {
		this.obj = obj;
	}
	
	
	
	
	
}
