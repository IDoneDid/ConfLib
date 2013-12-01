// * * * * * * * * * * * * * * * * * * * * * * \\
// Author: Overkill                            \\
// License: Apache v2                          \\
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
			f.createNewFile();
			BufferedWriter fe = new BufferedWriter(new FileWriter(conf));
			fe.write("S:" + key + "=Default");
			fe.close();
		}
		BufferedReader b = new BufferedReader(new FileReader(conf));
		String line;
		String[] thing1 = new String[20];
		String[] thing2 = new String[20];
		String[] thing3 = new String[20];
		while((line = b.readLine()) != null)
		{
			thing1 = line.split("\n");
			for(int i = 0; i < thing1.length; i++)
			{
				thing2 = thing1[i].split(":");
				if(thing2[0].equalsIgnoreCase("S"))
				{
					thing3 = thing2[1].split("=");
					for(int c = 0; c < thing3.length; c++)
					{
						if(thing3[c].equalsIgnoreCase(key))
						{
							b.close();
							return thing3[1];
						}
					}
				}
			}
		}
		b.close();
		return "ConfLib.error.NoSuchVar";
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
			f.createNewFile();
			BufferedWriter fe = new BufferedWriter(new FileWriter(conf));
			fe.write("B:" + key + "=false");
			fe.close();
		}
		BufferedReader b = new BufferedReader(new FileReader(conf));
		String line;
		while((line = b.readLine()) != null)
		{
			String[] thing1;
			String[] thing2;
			thing1 = line.split("\n");
			for(int i = 0; i < thing1.length; i++)
			{
				thing2 = thing1[i].split(":");
				if(thing2[0].equalsIgnoreCase("B"))
				{
					String[] thing3 = thing2[1].split("=");
					if(thing3[0].equalsIgnoreCase(key))
					{
						b.close();
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
		b.close();
		return false;
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
			f.createNewFile();
			BufferedWriter fe = new BufferedWriter(new FileWriter(conf));
			fe.write("I:" + key + "=0");
			fe.close();
		}
		BufferedReader b = new BufferedReader(new FileReader(conf));
		String line;
		while((line = b.readLine()) != null)
		{
			String[] thing1;
			String[] thing2;
			thing1 = line.split("\n");
			for(int i = 0; i < thing1.length; i++)
			{
				thing2 = thing1[i].split(":");
				if(thing2[0].equalsIgnoreCase("I"))
				{
					String[] thing3 = thing2[1].split("=");
					if(thing3[0].equalsIgnoreCase(key))
					{
						b.close();
						return Integer.parseInt(thing3[1]);
					}
				}
			}
		}
		b.close();
		return 0;
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
			f.createNewFile();
			BufferedWriter fe = new BufferedWriter(new FileWriter(conf));
			fe.write("D:" + key + "=0.0");
			fe.close();
		}
		BufferedReader b = new BufferedReader(new FileReader(conf));
		String line;
		while((line = b.readLine()) != null)
		{
			String[] thing1;
			String[] thing2;
			thing1 = line.split("\n");
			for(int i = 0; i < thing1.length; i++)
			{
				thing2 = thing1[i].split(":");
				if(thing2[0].equalsIgnoreCase("D"))
				{
					String[] thing3 = thing2[1].split("=");
					if(thing3[0].equalsIgnoreCase(key))
					{
						b.close();
						return Double.parseDouble(thing3[1]);
					}
				}
			}
		}
		b.close();
		return 0;
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
			f.createNewFile();
			BufferedWriter fe = new BufferedWriter(new FileWriter(conf));
			fe.write("F:" + key + "=0f");
			fe.close();
		}
		BufferedReader b = new BufferedReader(new FileReader(conf));
		String line;
		while((line = b.readLine()) != null)
		{
			String[] thing1;
			String[] thing2;
			thing1 = line.split("\n");
			for(int i = 0; i < thing1.length; i++)
			{
				thing2 = thing1[i].split(":");
				if(thing2[0].equalsIgnoreCase("F"))
				{
					String[] thing3 = thing2[1].split("=");
					if(thing3[0].equalsIgnoreCase(key))
					{
						b.close();
						return Float.parseFloat(thing3[1]);
					}
				}
			}
		}
		b.close();
		return 0;
	}
	
	@Deprecated
	public static String get(String toget) throws Exception
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
			fe.write(toget + ":Default");
			fe.close();
		}
		BufferedReader b = new BufferedReader(new FileReader(conf));
		String line;
		while((line = b.readLine()) != null)
		{
			String[] thing1;
			String[] thing2;
			thing1 = line.split("\n");
			for(int i = 0; i < thing1.length; i++)
			{
				thing2 = thing1[i].split(":");
				if(thing2[0].equalsIgnoreCase(toget))
				{
					b.close();
					return thing2[1];
				}
			}
		}
		b.close();
		return "ConfigParser.error.NoSuchVar";
	}
}
