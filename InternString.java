class InternString 
{
	public static void main(String[] args) 
	{
		/*

		Case-1::
		String s1=new String("java");

		String  s2=s1.intern();

		System.out.println(s2);

		String s3="java";

		System.out.println(s2==s3);

		System.out.println(s2==s1);

		*/

		String  s1=new String("java");
		String  s2=s1.concat("program");

		String  s3=s2.intern();

		 System.out.println(s3);

		 String  s4="javaprogram";

		 System.out.println(s3==s4);//true


	}
}
