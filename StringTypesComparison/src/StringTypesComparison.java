
public class StringTypesComparison {
	
	public static int myFactorial(int number){
		if(number==1){
			return 1;
		}else{
			return(number*myFactorial(number-1));
		}
	}
	
	public static void main(String[] args){
		String s1=new String("Hello");
		String s2=s1;
		StringBuffer s3=new StringBuffer("Halo");
		System.out.println(s1+":"+s2+":"+s3);
		s1="halo";
		s1.concat("3");
		s3.append("3");
		System.out.println(s1+":"+s2+":"+s3);
		char[] tempArray=new char[s1.length()];
		char[] Array=new char[s1.length()];
		for(int i=0; i<s1.length(); i++){
			tempArray[i]=s1.charAt(i);
		}
		for(int k=0; k<s1.length();k++){
			Array[k]=tempArray[s1.length()-k-1];
		}

		String reverses1=new String(Array);
		System.out.println(reverses1);
		System.out.println(s3);
		s3.reverse();
		System.out.println(s3);
		int a=5;
		int b=8;
		int c= a%b;
		if(c==0){
			System.out.println("a is divisible by b");
		}else{
			System.out.println("a is not divisible by b");
		}
		System.out.println(StringTypesComparison.myFactorial(a));
	}
}
