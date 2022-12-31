package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTextFile {

	public static void main(String[] args) throws IOException {
		
		//Create a New TextFile
		File f = new File("C:\\Testing\\temp.txt");
		f.createNewFile();
		
		//Write into the text file- have to create object first
		FileWriter w = new FileWriter(f);
		BufferedWriter out = new BufferedWriter(w);
		
		out.write("Welcome to my new Text File");
		out.newLine();
		out.write("First, Create a new object name file and give path of the text file");
		out.newLine();
		out.write("Then, on the next line write the code to create new text file");
		out.newLine();
		out.write("We have to create a object to write into text file using filewriter");
		out.newLine();
		out.write("w and f are variables, w for obj filewriter will give path to  write into new text file f");
		out.newLine();
		out.write("Using Buffered Writer object we can write into the text file");
		out.newLine();
		out.write("Now, we can write into the new text file");
		out.newLine();
		out.write("We need to add out.flush command to reflect the text into the file");
		out.flush();
		out.newLine();
		out.write("Now,We're going to read from our text file, we have to follow same steps but need to make some changes");
		out.flush();
		
		
		FileReader r = new FileReader(f);
		BufferedReader rd = new BufferedReader(r);
		
		String s;
		int i = 0;
		while((s=rd.readLine())!=null) {
			System.out.println(s);
			i++;
	}
		
		
	}

}
