/*
     String class constructors:
	 --------------------------

	 1. String   s1=new String();

	 class  String{
	 
	      String(){
		  
		  }

		  String(String  literal){
		  
		  }

		  String(StringBuffer  sb){
		  
		  }


		  String(char[]  array){
		  
		  }

		  String(byte[]  array){
		  
		  }
	 }


    2. String   s1=new String("java");

	3. String  s1=new  String(StringBuffer  sb);

	4. String  s1=new String(char[]  ch);

	5. String  s1=new String(byte[]  b);
*/
class  StringConsDemo1
{
	public static void main(String[] args) 
	{

		/*

		//String   s1=new String();//to create an empty string object

		//String   s1=new String("java");//to create an string object with given string literal

		StringBuffer sb1=new StringBuffer("java");

		System.out.println(sb1);//java

		//sb1.append("program");

		System.out.println(sb1);//javaprogram

		String s1=new String(sb1);

		System.out.println(s1);//java

		s1.concat("program");

		System.out.println(s1);//javaprogram

		

         char[]  array1={'a','b','c','d'};

		 String  s1=new String(array1);

		 System.out.println(s1);//abcd

		 */

		 byte[]  b={101,102,103,104};//

		 String  s1=new String(b);

		  System.out.println(s1);


	}
}
