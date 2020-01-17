package MYWORK;
import java.util.ArrayList;
//461
class hanming{
	public static int Hanming(Integer x,Integer y) {
		int b=0;
		while (x!=0||y!=0) {
			if ((x&1)!=(y&1)) {
				b++;
				x>>=1;
				y>>=1;
		}
		}
		return b;
	}
}
//349
class array{
	public static void Array(Integer[] a,Integer[] b) {
		ArrayList<Integer> c=new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i]==b[j]) 
					c.add(b[j]);
			}
		}
		for (Integer e : c) {
			System.out.println(e);
		}
	}
}
//69
class sqrt{
	public static int Sqrt(Integer a) {
		int i=0;
		for (; i < a; i++) {
			if (i*i==a) {
				break;
			}
			else if (i*i<a||(i+1)*(i+1)>a) {
				break;
			}
		}
		return i;
	}
}
//1281
class plusAndmutiply{
	public static int PlusAndmutiply(Integer n) {
		int mutiply=0;
		int plus=1;
		String str=n+"";
		for (int i = 0; i < str.length(); i++) {
			plus+=Integer.parseInt(str.substring(i,i+1));
			mutiply*=Integer.parseInt(str.substring(i,i+1));
		}
		return mutiply-plus;
	}
}
//LCP1
class guess{
	public static int Guess(int[] guess,int[] answer) {
		int score=0;
		if (guess.length>3||answer.length>3) {
			System.out.println("数组元素过大");
			return 0;
		}
		for (int i = 0; i < answer.length; i++) {
			if (guess[i]>1||guess[i]>3||answer[i]>1||answer[i]>3) {
				System.out.print("数组元素不合");
				return 0;
			}
		}
		for (int i = 0; i < answer.length; i++) {
			if (guess[i]==answer[i]) {
				score++;
			}
		}
		return score;
	}
}
public class DC1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
