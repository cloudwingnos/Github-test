package learn;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Properties;

public class SystemLearning {

	public static void main (String[] args) {
		Properties properties = System.getProperties();
		Enumeration propertyNames = properties.propertyNames();
		while (propertyNames.hasMoreElements()) {
			String key = (String)propertyNames.nextElement();
			String value = System.getProperty(key);
			System.out.println(key+"---->"+value);
		}
		
		long startTime = System.currentTimeMillis();
		int sum = 0;
		for(int i=0;i<100000000;i++) {
			sum+=1;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("程序运行时长为："+(endTime-startTime)+"毫秒");
		
		int[] fromArray = {1,2,3,4,5,6,7,8,9};
		int[] toArray = {11,22,33,44,55,66,77,88,99};
		System.arraycopy(fromArray, 3, toArray, 3, 3);
		System.out.println(Arrays.toString(toArray));
	}
}
