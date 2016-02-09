package com.grs24.mt.unistream;

import java.text.DecimalFormat;

/**
 *
 * @author lilia
 */
public class BaseDataFormatter
{
	public static final DecimalFormat costFormat = new DecimalFormat("0.00");
	public static final DecimalFormat weightFormat = new DecimalFormat("0.000");
	
	public static final boolean SHOW_ZERO = true;
	public static final boolean HIDE_ZERO = false;

	public static String formatFloat(Float number)
	{
		return formatFloat(number, SHOW_ZERO);
	}
	
	public static String formatFloatNoZero(Float number)
	{
		return formatFloat(number, HIDE_ZERO);
	}
	
	public static String formatFloat(Float number, boolean showZeros)
	{
		if(number == null)
			return "";

		return formatFloat(number.floatValue(), costFormat, showZeros);
	}
	
	public static String formatFloat(Float number, DecimalFormat format, boolean showZeros)
	{
		if(number == null)
			return "";

		return formatFloat(number.floatValue(), format, showZeros);
	}

	public static String formatFloat(float number, DecimalFormat format, boolean showZeros)
	{
		if(format == null)
			format = costFormat;

		String str = format.format(number);
		str = str.replace(',', '.');
		
		if(!showZeros)
			str = removeZeroFromEnd(str);
		
		return str;
	}
	
	private static String removeZeroFromEnd(String str)
	{
		if(str == null)
			return "";
		
		char[] characters = str.toCharArray();
		int index = characters.length;
		for(int c = index - 1; c > 0; c--)
		{
			if(characters[c] == '.')
				index--;
			
			if(characters[c] != '0')
				break;
			
			index --;
		}
		
		if(index == characters.length)
			return str;
		
		return str.substring(0, index);
	}
}
