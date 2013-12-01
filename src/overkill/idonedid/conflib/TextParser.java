// * * * * * * * * * * * * * * * * * * * * * * \\
// Author: Overkill                            \\
// License: Apache v2                          \\
// Date of Creation: November 30, 2013         \\
// * * * * * * * * * * * * * * * * * * * * * * \\

package overkill.idonedid.conflib;

public class TextParser
{
	private static String conf;
	private static String[] lines;
	public static void select(String newconf)
	{
		conf = newconf;
	}
	
	public static String getStr(String key)
	{
		lines = conf.split("\n");
		String line;
		String[] thing1 = new String[20];
		String[] thing2 = new String[20];
		String[] thing3 = new String[20];
		for(int y = 0; y < lines.length; y++)
		{
			line = lines[y];
			thing1 = line.split("\n");
			for(int i = 0; i < thing1.length; i++)
			{
				thing2 = thing1[i].split(":");
				if(thing2[0].equalsIgnoreCase("S"))
				{
					thing3 = thing2[1].split("=");
					if(thing3[0].equalsIgnoreCase(key))
					{
						return thing3[1];
					}
				}
			}
		}
		return "ConfigParser.error.NoSuchVar";
	}
	
	public static boolean getBool(String key)
	{
		lines = conf.split("\n");
		String line;
		String[] thing1 = new String[20];
		String[] thing2 = new String[20];
		String[] thing3 = new String[20];
		for(int y = 0; y < lines.length; y++)
		{
			line = lines[y];
			thing1 = line.split("\n");
			for(int i = 0; i < thing1.length; i++)
			{
				thing2 = thing1[i].split(":");
				if(thing2[0].equalsIgnoreCase("B"))
				{
					thing3 = thing2[1].split("=");
					if(thing3[0].equalsIgnoreCase(key))
					{
						if(thing3[1].equalsIgnoreCase("true"))
						{
							return true;
						}
						else
						{
							return false;
						}
					}
				}
			}
		}
		return false;
	}
	
	public static int getInt(String key)
	{
		lines = conf.split("\n");
		String line;
		String[] thing1 = new String[20];
		String[] thing2 = new String[20];
		String[] thing3 = new String[20];
		for(int y = 0; y < lines.length; y++)
		{
			line = lines[y];
			thing1 = line.split("\n");
			for(int i = 0; i < thing1.length; i++)
			{
				thing2 = thing1[i].split(":");
				if(thing2[0].equalsIgnoreCase("I"))
				{
					thing3 = thing2[1].split("=");
					if(thing3[0].equalsIgnoreCase(key))
					{
						return Integer.parseInt(thing3[1]);
					}
				}
			}
		}
		return 0;
	}
	
	public static double getDouble(String key)
	{
		lines = conf.split("\n");
		String line;
		String[] thing1 = new String[20];
		String[] thing2 = new String[20];
		String[] thing3 = new String[20];
		for(int y = 0; y < lines.length; y++)
		{
			line = lines[y];
			thing1 = line.split("\n");
			for(int i = 0; i < thing1.length; i++)
			{
				thing2 = thing1[i].split(":");
				if(thing2[0].equalsIgnoreCase("D"))
				{
					thing3 = thing2[1].split("=");
					if(thing3[0].equalsIgnoreCase(key))
					{
						return Double.parseDouble(thing3[1]);
					}
				}
			}
		}
		return 0.0;
	}
	
	public static float getFloat(String key)
	{
		lines = conf.split("\n");
		String line;
		String[] thing1 = new String[20];
		String[] thing2 = new String[20];
		String[] thing3 = new String[20];
		for(int y = 0; y < lines.length; y++)
		{
			line = lines[y];
			thing1 = line.split("\n");
			for(int i = 0; i < thing1.length; i++)
			{
				thing2 = thing1[i].split(":");
				if(thing2[0].equalsIgnoreCase("F"))
				{
					thing3 = thing2[1].split("=");
					if(thing3[0].equalsIgnoreCase(key))
					{
						return Float.parseFloat(thing3[1]);
					}
				}
			}
		}
		return 0.0f;
	}
}
