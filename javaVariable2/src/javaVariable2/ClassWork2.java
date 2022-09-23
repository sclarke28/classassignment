package javaVariable2;

public class ClassWork2 {

	public static void main(String[] args) {
	 
		String str = "1994";
	 int inum = 19;
	 int inum2 = 94;
	 
	 int sum = inum+inum2;
	 System.out.println("Result is: "+sum); 
	 
	 String s = "Shannell";
		System.out.println(s.toUpperCase());//SHANNELL)
		System.out.println(s.toLowerCase()); //shannell
		System.out.println(s);//Shannell(no change in oiginal)
	
		int myAge = 28 , hisAge = 35;
		
		System.out.println("myAge+ hisAge= " + (myAge + hisAge));
		System.out.println("myAge - hisAge = "+(myAge- hisAge));
		System.out.println("myAge * hisAge =" + (myAge * hisAge));
		System.out.println("myAge / hisAge = " + (myAge / hisAge));
		System.out.println("myAge % hisAge = "+ (myAge % hisAge));
		
		String s2= "Shannell";
		System.out.println(s2.startsWith("Sha"));//true
		System.out.println(s2.endsWith("ell"));//true

		String s3= "Shannell";
		System.out.println(s3.length());//8
	
		String s4= "Shannell";
		System.out.println(s4.charAt(0));//S
		System.out.println(s4.charAt(5));//n
		
	
	
	}

}
