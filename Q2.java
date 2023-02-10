package javaa;

public class Q2 {

	public static void main(String[] args) {
		String[] str1 = {"Hello ",null};
		String[] str2 = {"I ","am ","Simran"};
		String[] str3 = {"From ","SBU"};
		
		concat(str1);
		concat(str2);
		concat(str3);
	}
	
	static void concat(String[] str) {
		String val = " " ;
		for(int i=0;i<str.length;i++) {
			if(str[i]!=null)
				val=val.concat(str[i]);
		}
		System.out.println(val);
	}

}
