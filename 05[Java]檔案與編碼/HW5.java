import java.io.*;
import java.net.URLDecoder;
import java.util.ArrayList;

public class HW5 {

	public static void main(String[] args){
        
        try {
           	String readPath = "D:\\00951460\\Desktop\\�s�H���V\\01[�Ĥ@�g]java html�m���D�P�Ҳ�\\1. Java�m���D\\�@�~�� - �ɮ׻P�s�X\\encode_text.txt";
        	String writePath = "D:\\00951460\\Desktop\\�s�H���V\\01[�Ĥ@�g]java html�m���D�P�Ҳ�\\1. Java�m���D\\�@�~�� - �ɮ׻P�s�X\\decode_text.txt";       	
        	BufferedReader bfr = new BufferedReader(new FileReader(readPath));                    
        	BufferedWriter bfw = new BufferedWriter(new FileWriter(writePath));
        	
        	String str;
        	ArrayList<String> arrList = new ArrayList<String>();
        	
        	while ((str = bfr.readLine()) != null) {
        		String dc = URLDecoder.decode(str, "UTF-8");
            	arrList.add(dc);
            	System.out.println(dc);          	
        	}
   	
        	for(int i = 0; i<arrList.size(); i++){
        		bfw.write(arrList.get(i)+"\t\n");
        	}
        	
          	bfw.close(); 
          	bfr.close();
        	
        } catch (IOException e) {
            e.printStackTrace();
        } 
           
	}
}
