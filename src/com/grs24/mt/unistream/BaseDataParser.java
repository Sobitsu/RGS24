package com.grs24.mt.unistream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author lilia
 */
public class BaseDataParser 
{
	public static Long parseLong(String str)
	{
		if(str == null)
			return null;
		
		try
		{
			return Long.valueOf(str);
		}
		catch(Exception e)
		{
			return null;
		}
	}
	
	public static Integer parseInteger(String str)
	{
		if(str == null)
			return null;
		
		try
		{
			return Integer.valueOf(str);
		}
		catch(Exception e)
		{
			return null;
		}
	}
	
	public static Float parseFloat(String str)
	{
		if(str == null)
			return null;
		
		try
		{
			return Float.valueOf(str);
		}
		catch(Exception e)
		{
			try
			{
				str = str.replace(",", ".");
				return Float.parseFloat(str);
			}
			catch(Exception ex)
			{
				return null;
			}
		}
	}
	
	public static boolean isFloatNumber(String str)
	{
		return parseFloat(str) != null;
	}
	
	public static boolean isInteger(String str)
	{
		if(str == null)
			return false;
		try
		{
			Integer number = Integer.valueOf(str);
			return number != null;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public static Boolean parseBoolean(String str)
	{
		return Boolean.parseBoolean(str);
	}
	
	public static Long[] parseLongArray(String str)
	{
		if(str == null)
			return new Long[0];
		if(str.isEmpty())
			return new Long[0];
		
		String[] parts = str.split(",");
		if(parts == null)
			return new Long[0];
		if(parts.length <= 0)
			return new Long[0];
		
		ArrayList<Long> out = new ArrayList<Long>(parts.length);
		for(String part : parts)
		{
			Long number = BaseDataParser.parseLong(part.trim());
			if(number != null)
				out.add(number);
		}
		
		return out.toArray(new Long[0]);
	}
	
	public static Set<Long> parseLongArrayToSet(String str)
	{
		Set<Long> out = new HashSet<Long>();
		if(str == null)
			return out;
		if(str.isEmpty())
			return out;
		
		String[] parts = str.split(",");
		if(parts == null)
			return out;
		if(parts.length <= 0)
			return out;
		
		for(String part : parts)
		{
			Long number = BaseDataParser.parseLong(part.trim());
			if(number != null)
				out.add(number);
		}
		
		return out;
	}
}
