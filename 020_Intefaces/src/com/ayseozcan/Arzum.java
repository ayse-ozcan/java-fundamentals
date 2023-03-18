package com.ayseozcan;

public class Arzum implements ITarihSaatGoster, INemOlcer, ITermometre{

	@Override
	public int sicakligiOlc() {
		// TODO Auto-generated method stub
		return 22;
	}

	@Override
	public double nemOlc() {
		// TODO Auto-generated method stub
		return 30.5;
	}

	@Override
	public String tarihGoster() {
		// TODO Auto-generated method stub
		return "17 Kasim 2022";
	}

	@Override
	public String saatGoster() {
		// TODO Auto-generated method stub
		return "12:45";
	}
	
	

}
