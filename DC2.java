package MYWORK;
import java.util.HashMap;
//34
class find{
	public static int[] Find(int[] nums,Integer target) {
		int[] n= {-1,1};
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]==target) {
				n[0]=i;
				break;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]==target) {
				n[1]=i;
				break;
			}
		}
		return n;
	}
}
//20
class brackets{
	public static boolean Brackets(String a) {
		int b=0;
		if (a.length()==0) {
			return true;
		}
		if ((a.length()%2)!=0) {
			return false;
		}
		char[] n=new char[a.length()];
		for (int i = 0; i < a.length(); i++) {
			switch (a.charAt(i)) {
			case '(':
			case '[':
			case '{':
				n[b++]=a.charAt(i);
				continue;
			case ')':
				if (n[--b]!='('||b==0) {
					return false;
				}
				continue;
			case ']':
				if (n[--b]!='['||b==0) {
					return false;
				}
				continue;
			case '}':
				if (n[--b]!='{'||b==0) {
					return false;
				}
				continue;
			}
		}
		return b==0;
	}
}
//13
class roma{
	public static int Roma(String roma) {
		HashMap<String, Integer> b=new HashMap<String, Integer>();
		b.put("I", 1);
		b.put("V", 5);
		b.put("X", 10);
		b.put("L", 50);
		b.put("C", 100);
		b.put("D", 500);
		b.put("M", 1000);
		Integer c=0;
		for (int i = 0; i <roma.length(); i++) {
			String left=roma.substring(i);
			String right=roma.substring(i+1);
			c+=b.get(left)<b.get(right)?(0-b.get(left)):(b.get(left));
		}
		return c;
	}
}
//496
class bigger{
	public static int[] Bigger(int[]num1,int[]num2) {
		int[] c=new int[num1.length];
		boolean a=false;
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for (int i = 0; i < num2.length; i++) {
			for (int j = 0; j < num2.length; j++) {
				if (num2[i]<num2[j]) {
					a=true;
					map.put(num2[i], num2[j]);
					break;
				}
			}
			if (a==false) {
				map.put(num2[i], num2[i]);
			}
		}
		for (int i = 0; i < num1.length; i++) {
			if (map.get(num1[i])==num1[i]) {
				c[i]=-1;
			}
			else {
				c[i]=map.get(num1[i]);
			}
		}
		return c;
	}
}
//136
class once{
	public static int Once(int[] nums) {
		int a = 0;
		for (int i : nums) {
			a^=i;
		}
		return a;
	}
}
//½»»»Êı×Ö
class exchangeNumber{
	public static void Exchange(Integer a,Integer b) {
		a=b^a^a;
		b=a^b^b;
		System.out.println(a+" "+b);
	}
}
//912
class sort{
	public static int[] Sort(int[] nums) {
		
		return null;
	}
}
public class DC2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
