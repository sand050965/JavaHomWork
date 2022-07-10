import java.io.*;
import java.net.URLDecoder;
import java.util.ArrayList;

public class HW5 {

	public static void main(String[] args){
        
        try {
           	String readPath = "D:\\00951460\\Desktop\\新人培訓\\01[第一週]java html練習題與模組\\1. Java練習題\\作業五 - 檔案與編碼\\encode_text.txt";
        	String writePath = "D:\\00951460\\Desktop\\新人培訓\\01[第一週]java html練習題與模組\\1. Java練習題\\作業五 - 檔案與編碼\\decode_text.txt";       	
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
