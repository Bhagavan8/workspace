package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderdemo {
	public static void main(String[] args) {
		File file = new File("MyStory.txt");
		FileReader filereader=null;
			if(file.canRead()){
				try{
					filereader =new FileReader(file);
					char[] data = new char[50];
					filereader.read(data);
				System.out.println(data);
				}
				catch(FileNotFoundException e){
					e.printStackTrace();
				}catch(IOException e){
					e.printStackTrace();
				}finally{
					try{
						filereader.close();
					}
				catch(IOException e){
					e.printStackTrace();
				}
				}
	}

	}
}
