/*
   StringBuffer class constructor:
   --------------------------------
1.
   StringBuffer sb1=new StringBuffer();

2.  StringBuffer sb2=new StringBuffer("java");

   String s1=new String("java");//immutable

3. StringBuffer sb1=new StringBuffer(s1);//sb1--->mutable


4. StringBuffer sb1=new StringBuffer(int initialCapacity);//16



*/

class StringBufferConsDemo2
{
	public static void main(String[] args){

 /*
	    StringBuffer sb1=new StringBuffer();

		System.out.println("capacity :: "+sb1.capacity());

		System.out.println("size :: "+sb1.length());

		sb1.append("1234567890abcdefg");

		System.out.println("capacity :: "+sb1.capacity());

		System.out.println("size :: "+sb1.length());


		StringBuffer sb1=new StringBuffer("java");//4+16=20

		System.out.println("capacity :: "+sb1.capacity());

		System.out.println("size :: "+sb1.length());

		

		String s1=new String("java");

		StringBuffer sb1=new StringBuffer(s1);

		sb1.append("atbytecode");

		System.out.println("sb1:: "+sb1);

		*/

		StringBuffer sb1=new StringBuffer(1000);

		System.out.println(sb1.capacity());

	}
}