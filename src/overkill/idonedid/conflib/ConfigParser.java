// * * * * * * * * * * * * * * * * * * * * * * \\
// Author: Overkill                            \\
// License: BSD                                \\
// Date of Creation: November 30, 2013         \\
// * * * * * * * * * * * * * * * * * * * * * * \\

package overkill.idonedid.conflib;

import java.io.*;

public class ConfigParser
{
	private static String conf;
	public static void select(String config)
	{
		File a = new File(config);
		if(a.exists())
		{
			conf = config;
		}
		else
		{
			conf = "config.cfg";
		}
	}

	public static String getStr(String key) throws Exception
	{
		if (conf == null)
		{
			conf = "config.cfg";
		}
		File f = new File(conf);
		if(!f.exists())
		{
			return "";
		}
		BufferedReader b = new BufferedReader(new FileReader(conf));
		String line, line2;
		while((line = b.readLine()) != null)
		{
			if(line.startsWith("S:" + key + "="))
			{
				line2 = line.replaceFirst("S:" + key + "=", "");
				return line2;
			}
		}
		b.close();
		return "";
	}

	public static void addStr(String key, String value) throws Exception
	{
		if (conf == null)
		{
			conf = "config.cfg";
		}
		File f = new File(conf);
		if(!f.exists())
		{
			f.createNewFile();
			BufferedWriter fe = new BufferedWriter(new FileWriter(conf));
			fe.write("S:" + key + "=" + value + "\n");
			fe.close();
		}
		else
		{
			BufferedWriter fe = new BufferedWriter(new FileWriter(conf, true));
			fe.write("S:" + key + "=" + value + "\n");
			fe.close();
		}
	}

	public static boolean getBool(String key) throws Exception
	{
		if (conf == null)
		{
			conf = "config.cfg";
		}
		File f = new File(conf);
		if(!f.exists())
		{
			return false;
		}
		BufferedReader b = new BufferedReader(new FileReader(conf));
		String line, line2;
		while((line = b.readLine()) != null)
		{
			if(line.startsWith("B:" + key + "="))
			{
				line2 = line.replaceFirst("B:" + key + "=", "");
				if(line2.equalsIgnoreCase("true"))
				{
					b.close();
					return true;
				}
				else
				{
					b.close();
					return false;
				}
			}
		}
		b.close();
		return false;
	}

	public static void addBool(String key, boolean value) throws Exception
	{
		if (conf == null)
		{
			conf = "config.cfg";
		}
		File f = new File(conf);
		if(!f.exists())
		{
			f.createNewFile();
			BufferedWriter fe = new BufferedWriter(new FileWriter(conf));
			fe.write("B:" + key + "=" + value + "\n");
			fe.close();
		}
		else
		{
			BufferedWriter fe = new BufferedWriter(new FileWriter(conf, true));
			fe.write("B:" + key + "=" + value + "\n");
			fe.close();
		}
	}

	public static int getInt(String key) throws Exception
	{
		if (conf == null)
		{
			conf = "config.cfg";
		}
		File f = new File(conf);
		if(!f.exists())
		{
			return 0;
		}
		BufferedReader b = new BufferedReader(new FileReader(conf));
		String line, line2;
		while((line = b.readLine()) != null)
		{
			if(line.startsWith("I:" + key + "="))
			{
				line2 = line.replaceFirst("I:" + key + "=", "");
				return Integer.parseInt(line2);
			}
		}
		b.close();
		return 0;
	}

	public static void addInt(String key, int value) throws Exception
	{
		if (conf == null)
		{
			conf = "config.cfg";
		}
		File f = new File(conf);
		if(!f.exists())
		{
			f.createNewFile();
			BufferedWriter fe = new BufferedWriter(new FileWriter(conf));
			fe.write("I:" + key + "=" + value + "\n");
			fe.close();
		}
		else
		{
			BufferedWriter fe = new BufferedWriter(new FileWriter(conf, true));
			fe.write("I:" + key + "=" + value + "\n");
			fe.close();
		}
	}

	public static double getDouble(String key) throws Exception
	{
		if (conf == null)
		{
			conf = "config.cfg";
		}
		File f = new File(conf);
		if(!f.exists())
		{
			return 0.0;
		}
		BufferedReader b = new BufferedReader(new FileReader(conf));
		String line, line2;
		while((line = b.readLine()) != null)
		{
			if(line.startsWith("D:" + key + "="))
			{
				line2 = line.replaceFirst("D:" + key + "=", "");
				return Double.parseDouble(line2);
			}
		}
		b.close();
		return 0.0;
	}

	public static void addDouble(String key, double value) throws Exception
	{
		if (conf == null)
		{
			conf = "config.cfg";
		}
		File f = new File(conf);
		if(!f.exists())
		{
			f.createNewFile();
			BufferedWriter fe = new BufferedWriter(new FileWriter(conf));
			fe.write("D:" + key + "=" + value + "\n");
			fe.close();
		}
		else
		{
			BufferedWriter fe = new BufferedWriter(new FileWriter(conf, true));
			fe.write("D:" + key + "=" + value + "\n");
			fe.close();
		}
	}

	public static float getFloat(String key) throws Exception
	{
		if (conf == null)
		{
			conf = "config.cfg";
		}
		File f = new File(conf);
		if(!f.exists())
		{
			return 0.0f;
		}
		BufferedReader b = new BufferedReader(new FileReader(conf));
		String line, line2;
		while((line = b.readLine()) != null)
		{
			if(line.startsWith("F:" + key + "="))
			{
				line2 = line.replaceFirst("F:" + key + "=", "");
				return Float.parseFloat(line2);
			}
		}
		b.close();
		return 0.0f;
	}

	public static void addInt(String key, float value) throws Exception
	{
		if (conf == null)
		{
			conf = "config.cfg";
		}
		File f = new File(conf);
		if(!f.exists())
		{
			f.createNewFile();
			BufferedWriter fe = new BufferedWriter(new FileWriter(conf));
			fe.write("F:" + key + "=" + value + "\n");
			fe.close();
		}
		else
		{
			BufferedWriter fe = new BufferedWriter(new FileWriter(conf, true));
			fe.write("F:" + key + "=" + value + "\n");
			fe.close();
		}
	}

}
