class StringDemo1 
{
	public static void main(String[] args) 
	{
	
		final String s="java";

		String  s2=s+"program";//SCP==>compile time

		String  s3="javaprogram";//SCP



		System.out.println("s2 ::"+s2);
		System.out.println("s3 ::"+s3);

		System.out.println("s2==s3 ::"+(s2==s3));
	}
}
