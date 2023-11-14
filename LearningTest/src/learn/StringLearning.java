package learn;

import java.util.Arrays;

public class StringLearning {

	public static void main (String[] args) throws Exception{
	
    	String str1 = new String();
    	String str2 = new String("abcdef");
	    char[] char1 = new char[] {'g','h','e'};
    	String str3 = new String(char1);
    	
	    System.out.println("a"+str1+"b");
	    System.out.println(str2);
	    System.out.println(str3);
	    
	    String str4 = str2+str3;
	   // String str4 = new String("abcdefghe");
	    String str5 =  str4.substring(2, 8);
	    
	    System.out.println(str4);
	    System.out.println(str5);
	    System.out.println("字符串的长度为："+str5.length());
	    System.out.println("字符e第一次出现的位置为："+str4.indexOf('e'));
	    System.out.println("字符e最后一次出现的位置为："+str4.lastIndexOf('e'));
	    
	    System.out.print("将字符串转为字符数组后依次输出并以，相隔结果为：");
	    char[] char2 = str5.toCharArray();
	    for(int i=0;i<char2.length;i++) {
	    	if(i!=char2.length-1) {
	    		System.out.print(char2[i]+",");
	    	}
	    	else {
	    		System.out.print(char2[i]+"\n");
	    	}
	    }
	    System.out.println("将字符串转换为大写后的结果为："+str5.toUpperCase());
	    
	    System.out.println("将字符串内容替换后的结果为："+str5.replace("ef","EF"));
	    System.out.println(str5);
	    
	    String[] str6 = str4.split("e");
	    System.out.println("从EF将字符串隔开的结果为："+Arrays.toString(str6));
	    
	    System.out.println(str6[0]);
    }
}