package testng.day3;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class TestNGTestCases {
	@Test
	public void Createlead(){
		System.out.println("Create");
	}
	@Test
	public void Editlead(){
		System.out.println("Edit");
		throw new NoSuchElementException();
	}
	@Test
	public void Deletelead(){
		System.out.println("Delete");
	}
}
