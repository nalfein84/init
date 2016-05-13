package test;

import static org.junit.Assert.*;
import main.Calc;

import org.junit.Test;

public class CalcTest {
	@Test
	public void givenIReturn1() {
		Calc cR = new Calc();
		assertTrue(cR.getNumeral("I")==1);
	}
	@Test
	public void givenVReturn5() {
		Calc cR = new Calc();
		assertTrue(cR.getNumeral("V")==5);
	}
	@Test
	public void givenXReturn10() {
		Calc cR = new Calc();
		assertTrue(cR.getNumeral("X")==10);
	}
	@Test
	public void givenLReturn50() {
		Calc cR = new Calc();
		assertTrue(cR.getNumeral("L")==50);
	}
	@Test
	public void givenCReturn100() {
		Calc cR = new Calc();
		assertTrue(cR.getNumeral("C")==100);
	}
	@Test
	public void givenDReturn500() {
		Calc cR = new Calc();
		assertTrue(cR.getNumeral("D")==500);
	}	
	@Test
	public void givenMReturn1000() {
		Calc cR = new Calc();
		assertTrue(cR.getNumeral("M")==1000);
	}

	@Test
	public void given1ReturnI(){
		Calc cR = new Calc();
		assertTrue(cR.getRoman(1) == "I");
	}
	@Test
	public void given5ReturnV(){
		Calc cR = new Calc();
		assertTrue(cR.getRoman(5) == "V");
	}
	@Test
	public void given10ReturnX(){
		Calc cR = new Calc();
		assertTrue(cR.getRoman(10) == "X");
	}
	@Test
	public void given50ReturnL(){
		Calc cR = new Calc();
		assertTrue(cR.getRoman(50) == "L");
	}
	@Test
	public void given100ReturnC(){
		Calc cR = new Calc();
		assertTrue(cR.getRoman(100) == "C");
	}
	@Test
	public void given500ReturnD(){
		Calc cR = new Calc();
		assertTrue(cR.getRoman(500) == "D");
	}
}
