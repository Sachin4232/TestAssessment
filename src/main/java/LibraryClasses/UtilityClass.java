package LibraryClasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass 
{
	public static String PFData(String Key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\sai\\eclipse-workspace\\SachinHKharje_TechTest_Tendable\\PropertyFiles\\PropertyFileData.properties");
		Properties p=new Properties();
		p.load(file);
		String Value = p.getProperty(Key);
		return Value;
	}
}