package Junit;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;

public class Responsecod {
	String link="https://www.facebook.com";
	
	@Test
	public void test() throws Exception
	{
	URI ob=new URI(link);
	HttpURLConnection c=(HttpURLConnection) ob.toURL().openConnection();
	System.out.println(c.getResponseCode());
	
	
	

		
	}

	
	}

