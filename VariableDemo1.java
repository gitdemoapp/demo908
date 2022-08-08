class VariableDemo1 
{
	static int  a=100;//non static

	public static void main(String[] args) 
	{
		System.out.println(VariableDemo1.a);//using classname

		System.out.println(a);//direct

		VariableDemo1  obj1=new VariableDemo1();//object creation

		System.out.println(obj1.a);//by using object reference
	}
}
