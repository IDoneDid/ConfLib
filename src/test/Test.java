// * * * * * * * * * * * * * * * * * * * * * * \\
// Author: Overkill                            \\
// License: Apache v2                          \\
// Date of Creation: November 30, 2013         \\
// * * * * * * * * * * * * * * * * * * * * * * \\

package test;

import overkill.idonedid.conflib.*;

public class Test
{
	public static void main(String[] args) throws Exception
	{
		long start, end;
		System.out.println("[ConfLib] Starting Configuration File Parsing...");
		System.out.println("------------------------------------------------");
		start = System.currentTimeMillis();
		ConfigParser.select("example.cfg");
		System.out.println("[ConfigParser] Test Boolean Value: " + ConfigParser.getBool("Test"));
		System.out.println("[ConfigParser] Test Integer Value: " + ConfigParser.getInt("Test"));
		System.out.println("[ConfigParser] Test String Value: " + ConfigParser.getStr("Test"));
		System.out.println("[ConfigParser] Test Double Value: " + ConfigParser.getDouble("Test"));
		System.out.println("[ConfigParser] Test Float Value: " + ConfigParser.getFloat("Test"));
		end = System.currentTimeMillis();
		System.out.println("[ConfLib] Took " + (end - start) + " ms");
		System.out.println("------------------------------------------------");
		System.out.println("");
		System.out.println("[ConfLib] Starting Text Parsing...");
		System.out.println("------------------------------------------------");
		String test =
		"B:Test=true\n"+
		"I:Test=42\n"+
		"S:Test=A String\n"+
		"D:Test=0.25\n"+
		"F:Test=0.25f";
		start = System.currentTimeMillis();
		TextParser.select(test);
		System.out.println("[TextParser] Test Boolean Value: " + TextParser.getBool("Test"));
		System.out.println("[TextParser] Test Integer Value: " + TextParser.getInt("Test"));
		System.out.println("[TextParser] Test String Value: " + TextParser.getStr("Test"));
		System.out.println("[TextParser] Test Double Value: " + TextParser.getDouble("Test"));
		System.out.println("[TextParser] Test Float Value: " + TextParser.getFloat("Test"));
		end = System.currentTimeMillis();
		System.out.println("[ConfLib] Took " + (end - start) + " ms");
		System.out.println("------------------------------------------------");
		System.out.println("");
		System.out.println("Testing complete.  If you experienced any issues, please report them to \"stingerbarb@gmail.com\"");
	}
}
