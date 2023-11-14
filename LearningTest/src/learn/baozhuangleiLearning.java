package learn;
// 未搞懂
public final class baozhuangleiLearning {

	@SuppressWarnings("removal")
	public static void main (String args[]) {
		
		int a = 33;
		Integer in = new Integer(a);
		System.out.println(in.toString());
		
		int sum = in.intValue()+a;
		System.out.println(sum);
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		for (int i=0;i<y;i++) {
			StringBuffer sb = new StringBuffer();
			for (int j=0; j<x;j++) {
				sb.append("*");
			}
			System.out.println(sb.toString());
		}
	}
}
