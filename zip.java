// java.util.zip package provides two different class to do so
// 1. DeflaterOutputStream -  read data from a compress file
// 2.InflaterInputStream - write data in a compress format

import java.io.*;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
public class Test
{
	public static void main(String[] args) 
	{
		FileInputStream fis = new FileInputStream("a.txt");

		DeflaterOutputStream dos = new DeflaterOutputStream("b.txt");

		int ch;

		write((ch=fis.read())!=1);
		{
			dos.write((byte)ch);
		}
		System.out.println("compress  ..............");
		dos.Close();
		fis.Close();
		InflaterInputStream fis = new InflaterInputStream(new FileInputStream(b.txt));
		FlieOutputStream fos = new FlieOutputStream("c.txt");
		while(ch = fis.read()!= -1)
		{
			fos.write(ch);
		}
		System.out.println("De-compressed ..........");
		fos.Close();
		fis.Close();
	}
}