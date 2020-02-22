package WOG.AppiumFramework;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.compress.utils.Lists;
import org.apache.commons.lang3.ArrayUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestData {
	
	@DataProvider(name = "InputData")
	public Object[][] getDataforEditField()
	{
		Object[][] obj = new Object[][]
		{
			{"hello"}, {"@#$%"}
		};
		
		return obj;
	}
	
	@DataProvider(name ="LoginWithCompanyEmailOnly")
	public Object[][] getCompanyEmailOnly()
	{
		Object[][]obj = new Object[][]
		{
		{"marymary@gmail.com"}			
		
		};
		
		return obj;
	}
	
	@DataProvider(name ="LoginWithPasswordOnly")
	public Object[][] getPasswordOnly()
	{
		Object[][]obj = new Object[][]
		{
		{"adminadmin123"}			
		
		};
		
		return obj;
	}
	
	
	@DataProvider(name ="LoginValidCompanyEmailInvalidPassword")
	public Object[][] getValidCompanyEmailInvalidPassword()
	{
		Object[][]obj = new Object[][]
		{
		{"marymary@gmail.com", "Loremipsum123456789"}			
		
		};
		
		return obj;
	}
	
	@DataProvider(name ="LoginInvalidData")
	public Object[][] getInvalidDataForLogin()
	{
		Object[][]obj = new Object[][]
		{
		{"wog.stanleyfuji@gmail.com", "Wog123456789"}			
		
		};
		
		return obj;
	}
	
	@DataProvider(name ="LoginValidData")
	public Object[][] getValidDataForLogin()
	{
		Object[][]obj = new Object[][]
		{
		{"marymary@gmail.com", "adminadmin123"}			
		
		};
		
		return obj;
	
	}
	
	@DataProvider(name="PostStatusWithValidData")
	public Object[][] getValidDataForPostStatus()
	{
		Object[][]obj = new Object[][]
		{
			{"Hello World!"}
		};
		
		return obj;
	}
	
	@DataProvider (name = "MergedPostStatusWithValidData")
	public Object[][] getMergedPostStatusWithValidData()
	{
		List<Object[]> result = Lists.newArrayList();
		  result.addAll(Arrays.asList(getValidDataForLogin()));
		  result.addAll(Arrays.asList(getValidDataForPostStatus()));
		  return result.toArray(new Object[result.size()][]);
		
	}
	


        
}
