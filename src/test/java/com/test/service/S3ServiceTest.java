package com.test.service;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 75e4f9f48d6378c8de8aeb4d2fd73c8f2c971a98
>>>>>>> 48c1e85330fd002d5ac7e6f3e44b97f66e0a81ab
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.app.service.S3Service;

public class S3ServiceTest
{
	@Before
	public void beforeTest()
	{
		System.out.println("STARTING NEW TEST");
	}
	
	@After
	public void afterTest()
	{
		System.out.println("TEST RUN COMPLETE");
	}
	
	@Test
	public void getImageTest()
	{
		try
		{
			System.out.println(S3Service.getImage("inigo.jpeg").toString());
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("IOException Occurred");
		}
	}
	
	@Test
	public void submitImageTest()
	{
		try
		{
			System.out.println(S3Service.submitImage(new FileInputStream(new File("src/test/resources/testPost.jpeg"))));
		}
		catch (IOException e)
		{
			e.printStackTrace();
			fail("IOException occurred");
		}
	}
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
public class S3ServiceTest
{

>>>>>>> 85dcb03c4f19e58456beff3fe97b8f5f9d901c9d
>>>>>>> 75e4f9f48d6378c8de8aeb4d2fd73c8f2c971a98
>>>>>>> 48c1e85330fd002d5ac7e6f3e44b97f66e0a81ab
}
