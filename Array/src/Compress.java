import java.io.*;
import  java.util.zip.DeflaterOutputStream;
public class Compress 
{
	public void main() throws Exception 
	{
		FileInputStream fis=new FileInputStream("a.txt");
		DeflaterOutputStream dos=new DeflaterOutputStream(new FileOutputStream("b.txt"));
		
		int ch;
		while((ch=fis.read())!=-1)
		{
			dos.write((byte)ch);
		}
		System.out.println("Compress Done...");
		
		dos.close();
		fis.close();

	}
}
