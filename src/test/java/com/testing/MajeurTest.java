package com.testing;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class MajeurTest {
	@Test
	public void testing()
	{
		Majeur mj=new Majeur();
		Assert.assertEquals("mineur",mj.isMajeur(15));
		
		
		
	}
	
}
