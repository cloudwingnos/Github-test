package learn;

import java.util.Random;

public class MathandRandomLearning {

	public static void main (String[] args) {
		
//		Math.abs/ceil/floor/round/max/min/random
		
		Random r = new Random();
		for(int x=0;x<9;x++) {
			System.out.println(r.nextInt(100));
		}
	}
}
