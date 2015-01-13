// * * * * * * * * * * * * * * * * * * * * * * \\
// Author: Overkill                            \\
// License: BSD                                \\
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
		String line, line2;
		for(int i = 0; i < lines.length; i++)
		{
			line = lines[i];
			if(line.contains("S:" + key + "="))
			{
				line2 = line.replace("S:" + key + "=", "");
				return line2;
			}
		}
		return "None";
	}

	public static void addStr(String key, String value)
	{
		conf += ("S:" + key + "=" + value + "\n");
	}

	public static boolean getBool(String key)
	{
		lines = conf.split("\n");
		String line, line2;
		for(int i = 0; i < lines.length; i++)
		{
			line = lines[i];
			if(line.contains("B:" + key + "="))
			{
				line2 = line.replace("B:" + key + "=", "");
				if(line2.equalsIgnoreCase("true"))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
		}
		return false;
	}

	public static void addBool(String key, boolean value)
	{
		conf += ("B:" + key + "=" + value + "\n");
	}

	public static int getInt(String key)
	{
		lines = conf.split("\n");
		String line, line2;
		for(int i = 0; i < lines.length; i++)
		{
			line = lines[i];
			if(line.contains("I:" + key + "="))
			{
				line2 = line.replace("I:" + key + "=", "");
				return Integer.parseInt(line2);
			}
		}
		return 0;
	}

	public static void addInt(String key, int value)
	{
		conf += ("I:" + key + "=" + value + "\n");
	}

	public static double getDouble(String key)
	{
		lines = conf.split("\n");
		String line, line2;
		for(int i = 0; i < lines.length; i++)
		{
			line = lines[i];
			if(line.contains("D:" + key + "="))
			{
				line2 = line.replace("D:" + key + "=", "");
				return Double.parseDouble(line2);
			}
		}
		return 0.0;
	}

	public static void addDouble(String key, double value)
	{
		conf += ("D:" + key + "=" + value + "\n");
	}

	public static float getFloat(String key)
	{
		lines = conf.split("\n");
		String line, line2;
		for(int i = 0; i < lines.length; i++)
		{
			line = lines[i];
			if(line.contains("F:" + key + "="))
			{
				line2 = line.replace("F:" + key + "=", "");
				return Float.parseFloat(line2);
			}
		}
		return 0.0f;
	}

	public static void addFloat(String key, float value)
	{
		conf += ("F:" + key + "=" + value + "\n");
	}

}
