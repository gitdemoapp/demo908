/*
   Collection:-
   -----------

   Collections:-

   --------------

   oops  and interface:
   ---------------------
    class 
	Object

	Inheritance
	Polymorphism
	    Overriding
		Overloading
	Constructor

	Interface:
	----------
	    declartion and implementations
		extends vs implements
		interface variable==>public static final
		interface methods===>public abstract 

==========================================================================

class:-


class  ClassName{
     
	 //data

	 datatype   variablename;

	 //methods

	 accessmodifier  returntype  methodName(Parameters){
	      
		   method body
	 
	 }

}


Object:
-------

ClassName  obj1=new ClassName();

ClassName  obj2=new ClassName();
=================================================

Inheritance:
------------

reusabilty

extends


class  A{

   properties
   methods

}

class  B extends A{


}


A  a=new A();

B  b=new B();

A  c=new B();

B  d=new A();  not possible


==============================================

Polymorphism:-   one name many form  | one name different bahaviour 

compiletime | early binding | static poly==>Compiler based on reference

 Overloading

 class  Test{
 
      void  add(E){
	  
	  }

	  void  add(int  , E){
	  
	  }
 }
runtime  |   late binding  | dynamic poly===>JVM based on object
	    Overriding

class Parent{

   boolean add(E){
   
   
   }
}

class Child extends Parent{

	boolean add(E){
	
	}

}


interface Parent{

   boolean add(E){
   
   
   }
}

interface  Child  extends Parent{

	boolean add(E){
	
	}

}


================================

interface Parent{

   boolean add(E);
}

class Child implements Parent{

	boolean add(E){
	
	}

}

============================================================================








*/