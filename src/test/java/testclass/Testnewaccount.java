package testclass;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.Basetest;
import pom.Newfbaccount;

public class Testnewaccount extends Basetest
{
	@Test
	public void miku() throws IOException, InterruptedException
	{
		Newfbaccount create=new Newfbaccount(driver);
		create.createfb();
		create.birthday();
		create.gender();
		//create.gender();
		//create.signup();
		
		
	}
	

}
