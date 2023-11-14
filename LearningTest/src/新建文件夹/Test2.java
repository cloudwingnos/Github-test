package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("testdata/common_configure");
		Map<String,String> CheckFlagMap = new HashMap<String,String>();
		if(file.exists()) {
			try {
				InputStream stream = new FileInputStream(file);
				
				try {
					BufferedReader din = new BufferedReader(new InputStreamReader(stream, "GBK"));
					din.lines().forEach(str -> {
						if(str.contains("checkFlag")) {
							String[] strArray = str.split("\\s+");
//							for (int i = 1; i < strArray.length; i++) {
								CheckFlagMap.put(String.valueOf(strArray[0]),String.valueOf(strArray[1]));
//							}
						}						
					});
					
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				stream.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		CheckFlagMap.forEach((k,v)->{
			System.out.println(k+" : " +v);
		});

	}

}
