									JAVA
			=================----------------========================
			
	Every programming language is have own system and symetric to use a program and it is 
devlop a software. 
	->It is a stanard
	->It is the collection of rulls and reguletion
	->The rulles and regulation of object oriented standrad are known as oops concept

	Object oriented	-> 	colletion of rulles    ->	rules and regulation of object 
standard are known as oops concept.

Object oriented programming concept
--------------------------------------------
	1. class
	2. object
	3. inheritance
	4. polymerphism
	5. encapsulation
	6. abstraction
	7. infermation hideing
	8. agrigation
	9. typing
	10. conception
	11. concorence

->If a language supported object oriented standrad may be fully or partially i.e known as object oriented
->In a programming language supports all the concept of object oriented standard is known as pure object oriented programming language and if a language support part of the object oriented concept is known as partially object oriented language.

History of java
------------------------
->The previous name of the java is ohk.
->It is introduced by jems goslin.
->java is the product of sunmicrosesation.
->Today java is produced by oracle corporation.
->OCJP - oracle certified java programmer.

Feature of java
------------------------
->platform independent.
->open source.
->Archetecher nutral.
->object oriented.
->simple to devlop an application.
->Robost programming.
->Multi threded.
->Distributed.
->Support exception handling.
->Garbage collection.

1.Platform independent
------------------------------
->If an application is able to exicute in any envionment(windows, linux) is known as platform independent application.
->If a language support to devlop a platform independent application then it is known as plat from independent language.
->c or c++ is purely platform depedent where as java support platform independent application.
->process to compile and exicute a java program.
step-1:-Devlop a java program (first.java)
//first.java
step-2:-compile time javac is a devlopement tool of JDK(java devlopment kit) which is responsible to compile java program in any envornment.
			
			javac first.java

->javac compiler generate class file successfully compiled the java file.
->The class file is the collection of byte code.
->Byte code is known as magic code in java and this code can be exicute by JVM(java vertual mechine)
step-3:-exicute the java program java is a jdk tool which is responsible to exicute the class file with the help of jvm.

	java class_name
	------------------
	java Test

how to know the version of the compiler:- javac -version
how to change the version of java compiler. It is possible to to set the path of java compiler  by two different ways .
	1.for a temporary period.
	2.permanently set the path.

how to set the path for a temporary period:-
----------------------------------------------
	setpath=;C:\Program Files\Java\jdk-9.0.1\bin;

how to set the path permantly period:-
----------------------------------------------
my computer -> properties -> advance system setting -> environmental variables ->new 
			variable name -> path
			variablevalue -> (;C:\Program Files\Java\jdk1.8.0_102\bin;)	
->java decompiler is used to convert class file to source file.

2.open source
----------------
The source code of java devlopement or java library is not boundeed to sunmicrosastion oracle corporation 
->it is availalable for any user which is known as java is open source 
-> the source code of entire java devlopement is avilable in the following location
			c:\programfile\java\jdk 1.8.0_102\src

3.Archetecher nutral
-------------------------------
->Memory allocation and deallocation technique is same for all environment like windows or linux which is support the concept of archetecher nutral
->In case of c or c++ the size of integer are depends on processor it may be 16 or 32 bit but in case of java the size of an integer is fixed for all archetecher.

4.Object oriented
----------------------------
->As object oriented support some common rules which helps to devlop an application by using a predefine archetecher it makes simple to devlop a softwere.

5.Simple to devlop application
-----------------------------------
->java support huge no. class and interface so it is easy for a program to devlop and application by using predefine methode

6.Robust
-------------------
->In simple word robust means strong
->memory allocation and deallocation is not the job of java programmer.
->Garbage collecter collect the unused  memory which is known as automatic memory management.
->java support exception handling to avoid abnormal termination.
java internally use the concept of pointer but a java programmer we can not use pointer so java is sicure.
->The combination of automatic memory management exception handling and sicurity java is robust.

7.Multi threaded
----------------------
->java language by default multi threaded.
->main is the default thread in java

8.Distributor
-----------------------
By using java we can devlop a distributor application with the help of java .Net & java rmi(remote methode invocation)

9.Support exception handling
-------------------------------------------
->In java exception handling is a thchnique throw which we can avoid the abnormal control flow.
->It is possible by try  .....catch.

10.Garabge collector
----------------------------------
->Java not support garbage value like c or c++
->Jvm is responsible to allocate memory and garbage collector is responsible to collect the garbage value.
->java doesnot support the destroctor like c++.

access specifier
---------------------------------
public -> no restriction.
protected -> out side the package inheritance.
default -> access the same package.
privatge -> only access in the same file.

Rules of identifier
------------------------------
->digit is allowed but should not be at start.
->space is not allowed.
->keyword is not allowed.
->symbole is not allowed except _,$;

javap
---------------
->javap is a jdk tools which is used to display the prototype of non private members present in a class file.

public static void main(String[] args)
-----------------------------------------------
->The prototype of main methode is predefine but the logic of the main function is given by the user so it is user define.
->The existance of main methode never check BY compiler at the time of compilation but exicution of alwayse start from the main methode only.

why main methode should be public in java
-------------------------------------------------
-> jvm is responsible to call te main methode in java.
	Jvm :- java vertual mechine
->It is a system softwere which is inbuilt with the operating system
->The entire jvm is devlop is C program as it is devlop in C it is platform depended
->Jvm for the windows o.s is  different from the Jvm for the linux o.s .

Note:- As jvm call main methode for operating system which is present in a different package so main methode should be public.
Note :- class file is platform independent.
->byte code is platform independent.
->java is platform independent.
->jvm is platform depedent. 

Jvm is able to exicute the class file which may be generated in amy platform like windows,linux so, jvm makes java platform independent.

why main is static
-------------------------
The access specifier decide wheather the member is accessable or not . Accessable where as static and non static decide how to access a member.
The following are the calling procedure support by java pprogramming
	1.by directly
	2.by class name
	3.by object name

->As java call main from os which present in a different package so main methode should be public.

Syntax to create an Object in java
------------------------------------------
class_name object_name = new class_name()
->static member (static variable and methode) can be call by class name, object_name, or directly, directly possible with in same class.
->non static member (variable and function only call by object_name)

As Jvm is responsible to call main methode only by class name, accourding to Syntax of java of a member is called by class name  it should be static so main methode should be static in java.
->As main methode never returns any value to jvm the return type of main methode should be void type only.

Command line argument
---------------------------------
The argument is accepted by main methode it is known as command line argument.
->Main methode is only accepted in array of as an argument.
->By default length of command line argument in C or C++ is "i"
->In java the length of the command line is '0'
->length is a predefine variable which alwayse return the size of array in java.
->traverse beound the range of array is a runtime error i.e

		ArrayIndexOutOfBoundException

->'+' is a symbol which is used to do string concatinate.
->string is a predefine class present in java.lang package.
->java.lang package is the default package in java.

System.out.println();
--------------------------
System:- predefine class present in java.lang package
out:- predefine static object of printstrim class and present in System class.
println:- non-static methode of PrintStream class which is responsible to .
write data into stdout device i.e Console/command prompt	

Mapping System.out.Println()
=============================
class Myclass
{
	void ShowMessage()
	{
		System.out.println("Java is Simple");
	}
}
class Demo
{
	static Myclass mc=new Myclass();
}
class Test
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		d.mc.ShowMessage();
		Demo.mc.ShowMessage();
	}
}

public class PrintStream
{
	public void pirntln()
	{

	}
}

public class System
{
	static PrintStream out=new PrintStream();
}
class Test
{
	System.out.println();
}


Data types and wrapper class
============================

-> Java language support the concept of premitive data types like C and C++.
-> If a language support the concept of premitive data types that language cannot be purely object oriented programming language.
-> To make java language purely object oriented it support the concept of wrapper Class.

wrapper Class
=============
-> For each data type java provide a predefined class . Technically is known as wrapper Classs in java.
-> wrapper class is used to convert any data type into object in java. The premitive data types are not object then do not belongs to any class.
-> All wrapper class is present in java.lang package.

Datatype			wrapper class 				size				default value
------------------------------------------------------------------------------------
Byte 					Byte 					8 bits 					0

Char 				 Character 					16 bits 				/u0

Short 					Short 					16 bits 				0

int 				  Integer 					32 bits 				0

long 				  Long 						 64 bits 				0l/i 

float 				  Float 					32 bits 				0.0f

double 				  Double 					64 bits 				0.0

boolean 			  Boolean 					 1 bits 				false

->As java support the concept of Archetecher nutral.
->The size of premitive data type is fixed for all environment.
->wrapper is also used type conversion final
->As all the wrapper class are final class it can not be instantiated.
				
				javap lang.Datatype_name
 
->available in java like c or c++ by default  data type is alwayse signed in nature
->java does not cycle like c or c++
->so beyond the range(min value and max value) is not allowed
->MAX_VALUE and MIN_VALUE are two constant which is used to display the range of data type and present in each and Every wrapper class
->SIZE the predefine constant present in each wrapper class which return the size of data type in a bit format

System.out.println(Byte.parseByte("10")+20);
					
->parseByte is a static methode present in byte wrapper class
->which is used to convert a string to byte type

	System.out.println(Byte.toString(x)+10);

->toString is a predefine static methode present in each wrapper class which convert a data type to string format
CharAt
-------------
methode is used to get the Character of a specific index 

toBinaryString()
----------------------
This methode convert an integer to Binary and return value in a string format

toOctalString()
---------------------
This methode convert a integer to octal and return value in a string format

toHexString()
-----------------
It is used to convert a integer to Hexadecimal and return value in a string format

Boolean
----------------
In java boolean means true or false
->true and false are not keyword in java it is the boolean leteral.
->java does not supported boolean casting that means boolean can not be strpred any other data type and vice versa.


Character
-------------------
->The size of Character is 2byte in java
->C or C++ support ASCII standard for Character data type
->Character data type in java support unicode.
->unicode is the combination of ASCII is extended ASCII , local language Character
->65536 no. of Character support by java programming

Note:- In the above program the wrapper class is lower because it will create new object in a huge number of times.
CurrentTimeMillis()
----------------------------
->It is a predefine static methode present in system class which alwayse return the system time in a milisecond format.

JAVA operater
---------------------
InstaceOf
-------------
->This operator is used to check the object existance.
->Child class object is also the object of parent class but the object of parent class can not access the resource of child In otherwords the object of parent is not the object of child.
->Java support 44 no. of operators i.e
1.Unary -> +, -, ++, --, ~, '
2.Binary -> 
		+, -, *, /, % (Arithmatic)
		& ,|, ^ (Bitwise)
		&& ,|| (Logical)
		>, <, >=, <=, !=, == (relational)
		>>, <<, >>> (shift)
		+=, -=, /=, *=, %=, >>=, <<=, >>>=, &=, |=, ^=, = (assignment)
3.Ternary -> ?:
4.Special -> ., [], (), InstaceOf, Typecasting, ','

-> >>> - unsigned right shift.
->"." operators can be used to access, package, class, object, function, constant, variable

					+ve 								-ve 
			---------------------				---------------------
	>> 		left field with 0 					last field with 1
	<< 		right field with 0					last field with 0

	>>>				* 							left field with 0

-> Class is a combination of 4 types of member in java i.e 
						->Data member
						->member of function
						->block
						->Constructor

1.Data member/variable in java
---------------------------------
->As static member allocates memory at the time of class loading so it is known as class level variable.
->Refer back side of the Note.

Block 
---------------
Java support two types of block 
	1.static block 
	2.non static block

Static block
-----------------
If the block declare with static keyword known as static block.
->The static block alwayse exicute before Main methode call by JVM.
->The existance of methde alwayse change before exicute the static block (1.8 jdk)
->Static block is alwayse exicute for a single time only.

Non static block
-----------------------
The block declared without any static keyword is known as non static block
->This block alwayse exicute before Constructor by user.
->final variable can be intialised in static block for a single time only
->The non static final variable can hold different  value for a different object.

Methodes in JAVA
----------------------
Java support 6 types of methode i.e 
		1.static methode
		2.non-static methode
		3.final methode
		4.abstract methode
		5.native methode
		6.synchronized methode

VA-List (variable argument list)
---------------
If the function argument is VA-List this function able to accept any no. of argument of similar type.
VA list
---------------
If the function argument is VA-List this function able to accept any no. argument of similar type.

Final methode
--------------------
->final  is a keyword in java which can be used in 3 different places i.e
				1.final variable 
				2.final methode
				3.final class
->The methode declared with final keyword is known as final methode
->The methode is final it can not override in java
->If the signeture of super class methode is totaly same as the signeture of sub class methode it is Technically known as methode override.

Native methode
------------------------
->The methode is declared with native keyword i.e known as native methode in java
->This methode is used to communicate java language with any other environment like C or C++.

Stage to devlop native application in linux environment
------------------------------------------------------------
open editor :- gedit Test.java
step-1 :- Devlop a java application

vi Test.java
----------------
class Test
{
	native void fact();

	public static void main(String[] args) 
	{
		Test t1= new Test();
		t1.fact();
	}
	static
	{
		System.loadLibrary("lit");
	}
}
Note:- In the above program fact() is native methode if the methode is declared as native it indicates to java compiler, This methode is design in a different environment(like C or C++) but calling from java.
-> Native methode also indicates that methode existance should not be check at the time of compilation.
->loadLibrary() :- loadLibrary is a predefine static methode present in system class which is responsible to load a library in to jvm.
step-2 :- compile the java program
		command:- javac Test.java

step-3 :- create a header file from Test.class file
		command:- javah Test
javah is a jdk tool whch is crreate a Test.h file.

step-4 :- Open the header file and copy the function prototype related to fact methode.

vi Test.h
-----------
JNIEXPORT VOID JNICALL JAVA_TEST_fact (JNIENV*, jobject);

copy this two line in the Test.h file
step-5 :- Design a c-program with in the copy function prototype

vi Demo.c
----------------------
#include"Test.h"
#include"jni.h" //java native interface
JNIEXPORT VOID JNICALL JAVA_TEST_fact (JNIENV*, jobject);
{
	int num, i, f=1;
	printf("Enter in to c environment..........\n\n");
	printf("Enter the number.............\n\n");
	scanf("%d",&num);
	for (i=1; i<=num; i++) 
	{
		f=f*i;
	}
	printf("fact is : %d\n\n",f);
	printf("Exit from c environment ........& Enter in to java again .....\n\n");
}

step-6:- compile the c-program 
		command:- gcc -c -fpIc Demo.c 
The above command create the Demo.o file

step-7:- create a library
		command:- gcc -I /usr/lib/jvm/java -1.7.0/ -shared -wl, -soname, liblit.so -o liblit.so Demo.o

step-8:- set the path of library export LD_LIBRARY_PATH = /home/litindia/lit/export LD_LIBRARY_PATH="PWD"

step-9:- exicute the java program which automatically exicute the c-application.

java Test
------------
enter in to c environment........
enter the number ............
5
fact is: 120
Exit from c environment ........& Enter in to java again .....

Abstract methode
-------------------
->If methode declare with abstract keyword is known as abstract methode.
->If the methode is abstract it can not have a body a block
->Methode with out in body should be declare as abstract.
->If any methode of a class is abstract then corresponding class should be declare as abstract class.
->abstract class may or maynot contain abstract methode.
->If the class is abstract if can not be instantiated.
->abstract keyword is used to declare a prototype in java.
->The prototype generaly decide the name of methode the methode argument return type which will be design in future.

How to create the object of abstract class
------------------------------------------------
->We can create the object of abstract class by two different ways
			1.By inheritance
			2.Anonymous class

1.By inheritance
---------------------
->The complete class should satshfied two rules in java.
1.It should not contain any abstract methode
2.All the abstract methode of super abstract class as to design with in sub class

2.Anonymous class(no name)
------------------------
The class without any name is known as Anonymous class.
->The name of the class given by the compiler implictly is known as Anonymous class.

->when we are giveing  body to an object then java compiler will implictly create a class file Technically known as Anonymous class.
Note:- In the above program java compiler will create 3 class file 
		1.Test.class
		2.Test$1.class
		3.Test$2.class
->Generaly Anonymous class alwayse final
->The following is the content of Test$1.class file
->In the above program to is the object Test$1.class 
Example to create the object of abstract class with the help of Anonymous class

Note:- The following is the content of Test.class file.

Constructor
-----------------
Constructor is very similar to methode. The job of Constructor is to intialise the object.
->The following are the difference between methode and Constructor
->Methode name may or maynot same as the class name.
->where as the name of the Constructor alwayse same as the class name.
->Methode should have return type in java it may or maynot return value.
->Constructor never return any value so it has no return type.
->Methode can be declared as static final abstract where as these three keyword not allowed in Constructor.
->Methode can be call by class name, object name, or directly where as Constructor can be call by new this and super keyword.
->java support methode overrideing where as Constructor can not overrideing in java.

Types of Constructor
-------------------------------
Java support two types of Constructor i.e 
1.The Constructor without any argument and implictly given by compiler known as default Constructor.
->The access specifier of default Constructor is same as the class access specifier
->The Constructor which is design by user explicitly known as parameterised Constructor.
->If there is no Constructor defined by user explicitly then java compiler is provide a default Constructor.
->If user already  design any Constructor then compiler will not provide same default Constructor.
->Each and every class in java most contain a Constructor.

Note:- In the above program javac compiler is not provide any Constructor as we already design and we have note design such type of Constructor which is accept no argument. So calling new Test();
			 

Object and Reference
----------------------------
->Object is the physical existance of the class.
->Technically object is the collection of sequence set of bytes from RAM memory
->Static and level member are not part of java object.
->Object alwayse allocates memory for entire class not for a single member.
->The default value of Reference is null.

Copy Constructor
----------------------
If the Constructor is responsible to copy the content of one object to another is known as Copy Constructor.

Private Constructor
-----------------------------
If the Constructor declared with private keyword is called private Constructor.
->If the Constructor is private we can not create object from outside the class.

Factory methode
------------------
If the return type of methode is class name is known as Factory methode.

Singleton class
-------------------------
If the class able to intiate only for a single time known as singleton class.


Input From keyboard
=================================================================================
The following are the technique by which we can take input from keyboard
1.By using command line argument
2.By using Scanner class
3.By using BuffeReader class
4.By using console class
5.By using Data input stream class

2.By using Scanner class
----------------------------
class Test
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc=new java.util.Scanner(System.in)
		System.out.println("Enter the name");
		String name=sc.nextLine();
		System.out.println("Enter the roll");
		int roll=sc.nextInt();
		System.out.println("Enter your cgpa");
		Double cgpa=sc.nextDouble();
		System.out.println("enter your fees");
		long fees=sc.nextLong();
		System.out.println("--------------------------");
		System.out.println("name"+name);
		System.out.println("roll"+roll);
		System.out.println("cgpa"+cgpa);
		System.out.println("fees"+fees);
	}
}

		javap java.util.Scanner
		javap java.lang.System
	--------------------------------------

3.using BuffeReader class
---------------------------------
class Test
{
	public static void main(String[] args) Throws java.io.IoException
	{
		java.io.InputStreamReader isr=new java.io.InputStreamReader(System.in);
		java.io.BuffeReader br=new java.io.BuffeReader(isr);
		System.out.println("Enter name");
		String name=br.readLine();
		System.out.println("enter roll");
		int roll=Integer.parseInt(br.readLine());
		System.out.println("------------------------------");
		System.out.println("name"+name);
		System.out.println("roll"+roll);
	}
}

4.Take input from keyboard using console class
----------------------------------------------------
class Test
{
	public static void main(String[] args) 
	{
		java.io.Console c=System.Consoles();
		System.out.println("enter the name");
		String name=c.readLine();
		System.out.println("Enter the roll");
		int roll=Integer.parseInt(c.readLine());
	}
}

class Test
{
	public static void main(String[] args) 
	{
		java.io.Console c=System.Console();
		System.out.println("Enter the user name");
		String user_name=c.readLine();
		System.out.println("Enter the password");
		char ps[]=c.readPassword();
		String password=new String(ps);
		System.out.println("Enter the password is"+password);

		//validation
		int digit =0, upper=0;
		for (int i=0; i<password.length(); i++) 
		{
			if(Character.isDigit(password.CharAt(i)))
				digit++;
			if(Character.isUpperCase(password.CharAt(i)))
				upper++
		}
		if(password.length(i<0))
		System.out.println("password length should be at least 1 digit");
	else
		if(digit == 0)
		System.out.println("password length should be at least 1 digit");
	else
		if(Upper==0)
		System.out.println("password length should be at least 1 digit Upper case letter");
	else
		System.out.println("valid password");
	}

}

5.How to input from DataInputString class
--------------------------------------------
class Test
{
	public static void main(String[] args) 
	{
		java.io.DataInputString dis=new java.io.DataInputString(System.in);
		System.out.println("Enter your choice");
		char ch=(char)dis.read();
		if(ch=="Y" || ch="y")
			System.out.println("Success");
		if(ch=="W" || ch=="A")
			System.out.println("not required");
		else
			System.out.println("Enter a valid choice ...........");
	}
}

Control Structure
================================
->% Types of control structure present in java
	1.Sequential
	2.Conditional
		if
		if .. else
		nested If
		Multiple If
	3.Loop
		for 
		while 
		do .. while
		for .. each
	4.Selection
		Switch
		case
	5.Jump
		break
		continue
		return

1.Sequential
-------------------------
->If no control statement used in a java program then the control flow is Sequential.
->In case of Sequential control structure each and every statement will exicute for a single time only.

2.Conditional
-------------------
It is the replacement of Conditional or Ternary operators
->Nested if() is better than Multiple if() doue to check less no. of condition.

3.Loop
---------------
			------->     <------------
for(intialisation; condition; operatation)
	-------------  ----------
	single time       body  <----------
	only				-------->
{

}

->This loop is suitable for limit known
->This is a entri control loop
Ex:- array traverse

	while
	---------
		->entry control loop
		->program control loop
		->No. of time loop will exicute decides by the program
		->Linklist program ->Dynamic

	do .. while
	---------------
		->Exit control loop
		->Atleast one loop
		->Suitable as closeing statement
					  -------------------
					  return statement
		->finally block
		->menu driven

	for .. each
	-------------------
		->Array collection program
		->VA list
		->only support forward direction traversal
		->Intialisation 	|
		  Condition 			|->job for compiler
		  Operation 		|
		->only required to specify source and destination
		->source can be array, collection class,collection interface, va list
		->destination can be premitive data type class

for(data type; class name, variable, Reference, array, collection, va list)
{
	(logic)
}

class Test
{
	public static void main(String[] args) 
	{
		int x[]={11,22,33,44,55};
		System.out.println("traverse by for loop");
		for(int i=0; i<x.length; i++)
			System.out.println(x[i]);
		System.out.println("traversal by foreach loop");
		int sum=0;
		for (int a:x) 
		{
			sum+=a;
			System.out.println(a);
		}
		System.out.println("After add each element of array sum is"+sum);
	}
}

Selection control structure
---------------------------------
It is based on switch case

Rules of switch case
-----------------------------
->It is suitable for menu driven program
->It is the replacement of multiple If
->Switch without case is no error and case with out switch is not allowed.
->The case label only can be a constant
->float and double is not allowed for switch expresation and case lebel
->duplicate case is not allowed

Job 
--------
goto is the control statement which is not allowed

->In java jump control structure support 3 statement
	1.break
	2.continue
	3.return
->break only can be placed with in loop and switch

class Test
{
	public static void main(String[] args) 
	{
		for (int i=0; i<=3; I++) 
		{
			System.out.println("Hello");
			if(i==3)
				break;
			System.out.println(i);
		}
		for (int i=1; i<=3; i++) 
		{
			System.out.println("Hello");
			if(i<==3)
				continue;
			System.out.println(i++);
		}
	}
}
->continue jump the control to the operation part of the table
->continue only can be used with in loop
->break only can be used switch or loop
->break jump the control to the outside of the current loop or current switch
->The return statement is compolusory if the return type of function is not allowed in void type
->more then one return statement was not allowed in java with in a single

class Test
{
	public static void main(String[] args) 
	{
		java.io.Console c=System.Console();
		c.printf("Hello");
		String c="n";
		c.printf("\n %s",s);
		int x=90;
		c.printf("\n %d",x);
	}
}

Inheritance
------------------------------------
The members of class file will can be access from a different class file by two different ways.
	1.with the help of agrigation
	2.with the help of inheritance

Agrigation 
-------------------------
->Access the resource of another class file without createing any relation is the concept of agrigation in java.
->Agrigation support has a relation 
->Access the resource of class after establish the relation it is the concept of inheritance
->Inheritance is a object oriented concept which is used to create a relation between class file
->Relation means one class file is parent class/base/super/master class another class file is sub class.
->We can access of members of another class file like own resource in case of inheritance
->The private member of super class can not be access with in sub class.
->The protected member of super class is the private member of sub class.

Draw back of Agrigation
------------------------------
->It is required to create the object of each individual class explicitly
->It is required remember all the member of corresponding to that object.
->Java support two keyword to reletion between two class file

			parent/super class

				Class 					super inheritance
			--------------------------------------------------
drive/child -> extends 	--------->       implementation
	class

sub class  -> not possible  --------->   extends

->cyclic  inheritance is not allowed
class E extends E 
{
						//error
}

interface A
{

}
interface B extends A   //Interface to interface
{

}
class C implementation B   //Interface to class
{

}
class D extends C    //class to class
{

}

->calling a Constructor within same Constructor is known as Constructor recursion which is not allowed in java

class Test
{
	Test()
	{
		new Test();
	}
	public static void main(String[] args) 
	{
		new Test();
	}
}

object creatation
---------------------------
new Test(),  -> Factory methode
new instine(), -> object cloneing
->The rcursive invocation is not allowed in java

Types of Inheritance
------------------------------------
Inheritance can be achived in java by 5 different ways
		1.single
		2.Multilevel
		3.heirarchical
		4.multiple
		5.hybrid

1.Single Inheritance
--------------------------------
class Test
{
	public static void main(String[] args) 
	{
		Test t1=new Test();
		Object ob1=new Object();
		System.out.println(t1 inheritanceof Test);
		System.out.println(ob1 inheritanceof Test);
		System.out.println(t1 inheritanceof Object);
		System.out.println(ob1 inheritanceof Object);
	}
}

->Only two class file design with the reletion is known as single inheritance.

2.Multilevel Inheritance
------------------------------
->Object is predefine class present in java.lang package or default package.
->This class is the super class of each and every class in java directly or indirectly.
->Object class contain 11 no. of methode.
->class is a predefine class present in java.lang package.
->This is the class which is capable to store all the information about all the class file.
->when a class file behaves like parent as well as sub class then it is known as Multilevel inheritance.
->Object creatation in java alwayse top to down approach.
->Before exicute the Constructor of child class java compiler alwayse call the Constructor of parent class.
->In other words before create the object of any class java compiler alwayse create the object object class.
->If the parent class contain only 1 Constructor which is private.
->Then we can not implelement inheritance with out class.
->If the super class contains only single Constructor which is parameterised then it is not possible to create the object of child class.

3.Multiple
---------------------
->If more than one class file behaves like parent class that is that situation is multiple.
->In java class does not support multiple inheritance because it may create methode ambiguty.
->more than one class can not be extended in java.

Interface
-------------------
->Interface is very similar to abstract class and similar ly is both can not be instanciated.
interface Demo
{

}
abstract class Test
{

}
class MyClass
{
	public static void main(String[] args) 
	{
		Test t1=new Test(); 	//both can not instantiable
		Demo d1=new Demo();
	}
}

->The following are the different between abstract class and interface
->Any type of variable can be declare with in abstract class where as variable with in interface by default public static and final.
->Any type of methode can be design with in abstract class where as object is not required for interface so Constructor design is not allowed
->Constructor can be design with in abstract class where as object is not required for interface so Constructor design is not allowed.
->Abstract class support 0 to 100% abstraction where as from object point of view interface support 100% abtstraction.

/*java support abstraction in 3 different level 
	1.100% abstraction by interface 
	2.0 - 100% abstraction by abstract class
	3.0% abstraction by complite class.
*/
	
->we can design static methode with in interface(1.8 jdk onwars)
->As we already known sub class object is also object of super class but in case of interface we can not call static methode of interface by sub class object.

4.Heirarchical inheritance
-------------------------------------
->If more than one class file inherited from a single base class i.e known as heirarchical inheritance.
		javap java.lang.class
		---------------------
->How to get all the methode field constant.
class Test
{

}
class Demo
{

}
class MyClass
{
	public static void main(String[] args) 
	{
		Test t1=new Test();
		Demo d1=new Demo();
		MyClass mc=new Myclass();
		System.out.println(t1);
		System.out.println(t1.getClass());
		System.out.println(t1.getClass().getName());
		System.out.println(t1.getClass().getName()+IntegertoHexString(t1.Hashcode()));
		System.out.println(t1.Hashcode());
	}
}

getClass() :- This methode present in object which return the object of java.lang.class class.
getName() :- Present in class, Return the class name in a string format
Hashcode():- Methode of object class Integer format.

Object <-- super class of each class <-- store information about each class.

Hybrid Inheritance
-------------------------
The combination of more than one type of inheritance is hybrid.
		javap java.lang.object

Object cloneing
------------------
->The technique to create clone or copy of an object is known as Object cloneing. The object to be cloned corresponding class should be sub class of clone lebel interface.
->clone label is marker interface in a java
->The interface with out any members interface.
->The marker interface indicates to jvm that object is created for a very Special porpose.

Polymerphism
---------------------------------------------------------------------------------------
->It is an object oriented concept which is used to create a different form of a single resource.
->The polymerphism can be achived by two different ways in java.
		1.with the help of overloading that is known as compile time polymerphism.
		2.with the help of overrideing that is run time polymerphism.
->Java support overloading by two different ways i.e 
		1.with in same class
		2.More than one methode
		3.Name should be same
		4.Argument should be different

->When more than one methode design with in single class with the same name but argument is different, i.e known as methode overloading.
->main methode can be overloaded in java
		javap java.lang.PrintStream

final methode, static methode, abstract methode can be overloaded in java.

Constructor overloading
-----------------------------------
->when more than one Constructor design within a single class with different argument i.e known as Constructor overloading.

Working with this keyword
------------------------------
->It is a keyword which was alwayse refers to the current class object.
->The following are the use of this keyword in java
->To call a Constructor from a another Constructor with in a single class with out allocates new memory we can use this keyword.
->The different between new and this is new is responsible to call the Constructor and create a new object where as this is responsible call the Constructor without allocates new memory.

use-1:- call to this this must be first statement in Constructor.
use-2:- when the local and instace variable name is same this keyword isi used to difference between them.
use-3:- This keyword can be passed with in argument as on Constructor.
use-4:- This keyword is used to current object Hashcode.
use-5:- This keyword canbe passed as on argument with in methode.
use-6:- This keyword can be used the return value.

Methode overrideing
-------------------------------------
->The signeture of parent class methode and sub class methode is totaly same then it is known as methode overrideing or redesigning.
->for overrideing inheritance is compolusory.
->The following are the restriction in case of methode overrideing.
->The methode is final it can not override.
->static methode can override and static keyword only.
->The access specifier of sub class methode should be same or less protected compaire to super class methode.
->If the return type is the class name then sub class methode return type is same or its sub class compire to the parent class.
->Generaly the toString methode of object class is responsible to return the Hashcode.
->If user not satishfied with the logic of object class to string then user can override accourding to requirement.

Down casting
--------------------------
->for down casting it is required to do class casting.
->for class casting it is required handle class cast exception.

Working with super keyword
-------------------------------------
->Super is a keyword in java which can be used to solve three different problem.
->super alwayse refers to parent class object
->Super can only place with in non-static methode, non-static block or Constructor.
->when the local variable and instance variable name is same then this keyword is used to create difference between them.
->If the child class, super class variable is same then super is used difference between them.
->In case of methode overrideing super is used to create a difference between child class and super class methode.
->Super class is used to call parent class Constructor from the sub class.
->super class statement should be very first statement with in Constructor.
->As super is responsible to create the object of parent class and according to rule of inheritance the object of super class should be created before sub class so super should first statement.

#why this keyword should be first statement with in Constructor?
->To avoid memory wastage for the parent class This should be first statement.
->With in Constructor by default super is the first statement and this is only one statement and this is only one statement which can be replace to super.

Package 
=======================================================================================
->It is a collection of class file and sub package in otherwords package is the collection of classes, error, exception, enums, interface, & sub-ppackage.
* why learn package? :-It is used to solve to different problem
	1.avoid duplicate class name/class name ambiguty.
	2.searching class file will be faster

Directory of predefine package
--------------------------------------
->The location of rt.jar is C:\Program Files\Java\jre1.8.0_102\lib\rt.jar 
->This jar file contains all the main package in java
->sub package :-lang, util, sql, io

Types of package
----------------------
java support two types of package
	1.predefine package
	2.user-define package

1.predefine package
-----------------------------
The package which are already inbuilt with the standrad jdk is known as predefine package like all the package under rt.jar file.
Ex:- lang, util, sql ...........

2.user-define package
-------------------------------
The package which are create by the programmer according to requirement known as user-define package.

		| compile :- javac -d c:/ Test.java |
		-------------------------------------

How to create user define package 
--------------------------------------
package lit.core.java
class Test
{
	public static void main(String[] args) 
	{
		System.out.println("Hello welcome to package ...............");
	}
}

compile :- javac -d d:/ Test.java

->The above command is create Test.class with in lit.core.java package available
->To exicute the .class file present with in package we have to present in that location where main package available.
->The above program lit is the main package and it will create with in d:\ drive

Exicution :- 
D:/java program > java lit.core.java.Test
Error :- could not find or load main class lit.core.java.Test
D:\college>c:
c:\users\lit>java lit.core.java.Test 
Error :-could not find load or main class lit.core.java.Test
c:\user\lit>
c:\>java lit.core.java.Test
Hello welcome to package ............
c:\>

-d :-<Directory> specify where to place generated class file.
c:/ :-specify where to place main package 

->The memebers of a .class file which is present in a package can be accessed by two different ways.
	1.By fully qualified name
	2.By import statement

1.By fully qualified name
----------------------------------------------------
->Specifying the full path of package with the class name in each and every time is known as fully qualified name.
Demo.java
------------
package p1.p2.p3;
public class Demo
{
	public int x=10;
	public static int y=90;
}

Test.java
-----------------
packagep1;
import p1.p2.p3.Demo;
class Test
{
	public static void main(String[] args) 
	{
		//p1.p2.p3.Demo d=new p1.p2.p3.Demo();
		//System.out.println(d.x);
		//System.out.println(p1.p2.p3.Demo.y);

		Demo d=new Demo();		//by import statement
		System.out.println(d.x);
		System.out.println(Demo.y);		//by import staement
	}
}

compile :-javac -d . Demo.java
		javac -d . Test.java
Tree:- tree/f 
exicution :- java p1.Test

import java.io.BuffeReader; 	//single class importing i.e we can access buferredered with out using java.io
import java.io.*; 	//import all the .class file of io package only without using java.io 
import static java.lang.System.out; :- 	//Now out can be called directly without using system.
import static java.lang.System.*; 	//now all static member of system class can be called directly with out using systegm

import java.util.*
import java.sql.*
class Test
{
	public static void main(String[] args) 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		out.println("hi hi");
		//out.println(new Date()); 	//refreence to date ambigous
		out.println(new java.util.Date()); 	//here fully qualified name is compulsory
	}
}

Access specifier in java
--------------------------------
	with in 		with in 		with in 		outside 		outside
	The same 		same 			same 			package 		package
	base 			but 			but 			but 			but
	class 			sub-class 		inside-class 	sub-class 		inside-class
------------------------------------------------------------------------------------
file:-sbc 			ssc 			sic 			osc 			oic 
name
-----------------------------------------------------------------------------------
pkg :-j2se			j2se 			j2se 			j2ee			j2me
name 
--------------------------------------------------------------------------------------
public:- true		true 			true 			true 			true
protected:-true 	true 			true 			true 			false
default:- true 		true 			true 			false 			false
private:- true		false 			false 			false 			false

->To exicute a class file which is present in a package from any location it is required to set the class path.
->we can set the class path by two different ways 
		1.for a temporary period
		2.for paramanetly
1.for a temporary period :- set classpath=;E:/;
2.for paramanetly :- mycomputer -> properties -> advane System setting -> environment variable -> new -> v.name=class path;
					   value=;E:/;

->Array is a collection of similar type of data stores in a Sequential  data and is used to create a list;

Types of Array
-----------------
Two types of array i.e 
	1.Single dimentional array
	2.multi dimentional array

1.Single dimentional array
----------------------------------
->Array construction possible for 3 different ways
step-1 Array declaration
---------------------------
	->Int x[];
	->String y[];
	->Student []s; 
->int a[10]; 	//wrong declaration
->The declaration of array indecates only  indicates what is the name of array which types of element it can store.
->At the time of declaration we can not specify the size of an array.

step-2 memory allocation
------------------------------
->In java alwayse allocates memory with the help of new keyword
->size is compolusory  at the time of memory allocation
->  x=new Int[size];
	s=new Student[size];
	y=new string[]; 	//pot allowed

step-3 Array Intialisation
-----------------------------
->If array is already intialise size is not allowed
	x=new int[2] {11,22}; 	//wrong syntax
	x=new int[] {11,22};
	x[0]=sc.nextInt[];
	x[i] = 22;

->Array is a predefine class present in java.util package
->This class is not responsible to create a new array  but it is used to do array manupulation like searching and sorting.

Api(Application programming interface)
--------------------------------------------------------------
This is used to provides the details above classes and its member.
->Api does not display any private member.
->There are three types of api available in java.
	1.standrad api given by sun or oracle corporation.
	2.user defined Api that is created by javadoc tools
	3.Third party api like print api.

How to create user define api?
------------------------------------
Test.java
-----------
package lit;
/**
	This class is used to do testing api.
*/
public class Test
{
	/**
		This field is declared the portno. of oracle server.
	*/
	int portno. = 1521;
	/**
		This methode i used to establish the connection with oracle DB.
	*/
	public void getConnection()
	{

	}
	/**
		This constructor is used to intialise port no. with the instance of object. 
	*/
	Test(int portno)
	{

	}
}

command :- javadoc Test.java //it will create index.html

Array
============================
->Dimentional array is the collection of 1 Dimentional array.

Jagged array :- If the column size of each row in a multidiamentional array is different for it distinct then it is Jagged array in java.
->The benefit of jagged array is to avoid the memory wastage.

3D Array
-----------
->3D is the collection of 2 Dimentional array and 2D is the collection of 1D so internally multidiamentional array is the collection of single dimentional array.

String, StringBuffer & Builder in java
------------------------------------------------
->String is a predefine final class present in default package.
->As string in final class it can not be inherited.
->String is purely Immutable in nature that means contains of a string can not be change once in assign.
->String is not a Character array like C or C++ in java.
->To CharArray() is a predefine class which is responsible to convert string to Character array.
->To convert Character array to string we have to pass the name within the constructor of String class.
->To create a manupulate a string java provide some predefine constructor and methode.

Note:- String can be constructed by two different ways
		1.By literal
		2.By new

->If string created with the help of string leteral it alwayse allocates memory from String pool.
->String pool is a special memory which can not store in duplicate string
-> == symbole does not check the content of the string but alwayse check the hash code.
->The following are the predefine methode which alwayse checks the contents.
		i. - equals()
		ii - equalsIgnoreCase()
		iii - compaireTo()
		iv - CompaireToIgnoreCase()

String Buffer 
-----------------------
Like string and string buffer String builder is a predefine final class present in default package.
->The only difference between StringBuffer and StringBuilder is StringBuffer can not use multi threading where as StringBuilder class is thread safe so it can be used in multi threading.
->StringBuilder is synchronized where as  String and StringBuilder both are not synchronized

Collection framework
=============================
->collection is a group of similar type of object.
->collection is a set of classes and interfaces which are generaly is used to implement data structure.
->collection itself a predefine interface present in java.util package.
->collections is a predefine class present in java.util package
->All the operation which are generaly perform on a data such as searching, sorting insertation, deletation and manupulation can be perform by java framework.
->collection is simply a single unit  of object.
* following are the interface which directly sub-class of collection and used to implelements data structure.
		1.list
		2.set
		3.queue

* Map is an interface which is not the sub-class of collection but can implements data structure in a way specific.

FrameWork 
--------------
->It provide a readymade archetecher
->provide predefine  classes and interfaces
->faster devlopement 
->It optional for a devloper.
->less coding.
  

ArrayList
----------------
It is a predefine class i.e present in java.util package
-> ArrayList class is just like a Dynamic array which is responsible to store similar type of object only

following are the similarites between ArrayList and Linklist
->like Linklist ArrayList list is Dynamic size can be expanded as well as string
->like Linklist ArrayList is also follows insertation of data
->like Linklist ArrayList is also not synchronized 
->like Linklist ArrayList can hold duplicate element.
->The similarites between ArrayList and array is both are Sequential.
->for searching and sorting ArrayList is faster for insertation and delition Linklist faster than ArrayList.
->As ArrayList required more number of shifting operation is there than ArrayList is slower.
->The difference between array and ArrayList is array is static, ArrayList is Dynamic.
->The similarites is both are Sequential

Stack 
---------------
->the evolution of stack is lifo basis
->The operation of stack alwayse from top of the stack
->duplicate element can store using stack data structure
->The index of stack alwayse starts with 1.

Queue and Dequeue
---------------------------
->The evolution of queue is fifo basis (first in first out)
->The default nature of queue and Dequeue is 
		* insert at last
		* delete at first
But the difference between queue and Dequeue is queue support single  end operation where as de dequeue support double and insert and delete operation
->queue and dequeue both are not synchronized and can hold duplicate object

Note:-
--------
peek() and element() both return first element of q and dq 
->But difference is peek() returns null if q is empty where as element() terminate the program by throwing no such element exception some rule applicable for poll() and remove() 
->poll() and remove() both delete first element of queue and dequeue.

Hash Set and Tree set
----------------------------------
->Both present in java.util package.
->Both evaluate in the basis of values not on basis of index
->Both can not store duplicate object 
->Difference is hash set store in a random order where as tree set store data in a ascending order.

Hash map and Tree map
------------------------------
->Both are the sub class of map interfaces
-> both evaluate on the basis of keys.
->duplicate keys will be replaced 
->The difference between this is hash map store keys in a random order where as tree map store keys in an ascending order.

Vector and hash table
--------------------------------
->Both are synchronized. So it cn be used in multithreading the list is prepaid by Vector and hash table are set of thread safe list.
-> Vector support both index wise and value wise evaluation
->Hash table only support keywise evaluation hash table is similar to hash map i.e can not store duplicate keys in a random order.
->Vector is similar to array list and hash set but the difference is ArrayList and hash set is not synchronized where as Vector is synchronized.

-> Enumaration is a predefine interfaces present in java.util package.
->This interfaces is used to traverse the collection like Vector.

Exception handling
-----------------------------
It is a situation in which program terminate abnormally.
->In java exception is devided in 2 catagories i.e 
	1. If exception occors at the time of compilation i.e known as checked exception
	2. If exception generated at the time of run i.e known as checked exception.

Tree structure of the exception
-----------------------------------
	Throw able
	    Error
	       Assertion Error
	       Nosuchmethode Error
	       unsupportedversion Error
	       ------------------------
	       ------------------------
	       ------------
   Exception
   		IoException
   		filenotfound exception
   		Eofo exception
   	Runtime exception
   		InputMaximization exception
   		Numberformat exception
   		nullpointer exception
   		Indexoutofbound exception
   			ArrayIndexOutOfBoundException
   			StringIndexOutOfBoundException
   		Arithmatic Exception
   		NoSuchElement Exception
   		-----------------------
   		-----------------------
   		------------
   Interrupted Exception
   UnknownHost Exception
   ClassNotFound Exception
   ----------------------
   ----------------------
   -----------

Java support 5 keyword to work with the Exception
--------------------------------------------------------
1. Try 
2. catch
3. Throw
4. Throws
5. finally

1.Try
---------------
Try is keyword which is used to declare a block is known as try block
->Try is not a independent block
->It depends on catch or finally
->Try block should be followed by catch or finally block or both

ex:-
Try 		Try 		Try 		Try 		finally 	Catch 		Try
{			{ 			{			{			{			{			{

}			}			}			}			}			}			}
Catch 		finally 	Catch 		finally     (not allow) (not allow) (not allow)
{			{			{			{

}			}			}			}
						finally 	Catch
(allow)     (allow)		{ 			{
    
						} 			}
						(allow)     (not allow)

->Generaly try block contain exception generate codes
->catch is a keyword which is used to declare a block known as catch block in java.
->The exception of catch block is optional but exception of try block is compolusory
->The catch block was execute satishfy two condition i.e
	1.The code present with in try block should generate the exception
	2.The corresponding exception handler should be handled in Catch.

Syntax of try with Catch
-------------------------------
Try
{
	//Exception generate code
}
Catch(Throwable object)
{
	//Exception handeled code
}

-> more than one catch block only allowed single try  but only one catch block is exicute in a single time
->As exception is the super class of each and every exception in java it can able to handle any type of exception in java
->Exception is comeing means the object is comeing 

getMessage() :- this methode responsible to display why exception occors.

This :- this keyword is generate the exception.
The statement after throw statement become unreachable because the throw statement not properly handle.
->This statement become unreachable in throw statement not placed within try block or not handled properly.
->unreachable statement is not allowed in java.

custome exception / user-define exception
---------------------------------------------
Each and every predefine exception is a predefine class
->To create a user-define exception the corresponding class should be sub class of any type of exception in java.

Throws keyword
---------------------
This keyword is used to pass the exception from called to caller is known as exception propagation.

finally keyword
--------------------------
->This is similar to catch block
->finally only can be placed after try block
->The difference between catch and finally block
* catch block is responsible to handle the exception but finally block is responsible to handle unreachable statement
* more than one catch block is allowed for a single try where as only one finally block is allow.
* The exception of Catch block is optional where finally compolusory exicute.

-> Exit is a predefine static methode of system class which is responsible to terminate the current process without checking the next statement.

Rules of exception in case of methode overrideing 
--------------------------------------------------
->If the methode within super class already throws the exception than sub class may or maynot throws but if methode within super-class does not throw any exceptionthen sub class can not throws.
->The methode within sub class only can throws those exception or it's sub class which already throws by the methode of super class.


							File handling in Java
							======================
File is a container which store data permanently 
->Data can be store by two different ways of programming
	1.for a temporary period of a RAM memory
	2.permanently with in hard disk

->Data store in variable, Array, Linklist, Stack, .....etc. is temporary because all allocates memory from RAM.
->To store data permanently programming language support two different ways
	1. with the help of file
	2. with in database

->File is a predefine class present in java.io package this class is responsible to create and manupulate the file
->The file can not do any read and write operation

Constructor of File class
-----------------------------
->file(string file_name) :- By default location is the current location(pwd)
--------------------------
->file(string path, string file_name) :- To create/locate file other than current folder
--------------------------------------
->boolean createNewFile() :- This methode is responsible to create a new file return a 
-----------------------------
boolean value if successfully create  then true otherwise false
->boolean mkdir() :- It is responsible to create a new folder
-------------------

->successfully create return true otherwise false
->boolean exit() :- It is alwayse check file existance
-----------------
->boolean canRead() :- wheather readable or not readable the methode will check
--------------------
->void setReadOnly() :- This methode makes a file readonly mode 
---------------------
->long lastModified() :- it is returns the last modified time in the form milisecond from 
----------------------
epoch time
->boolean canWrite() :- wheather the file is writeable or not writeable is check
---------------------
->boolean isHidden() :- It checks wheather the file is hidden or not 
---------------------
->boolean renameTo(file Object) :- This methode rename a file
--------------------------------
->IsFile() :- This methode check given path contains a file or not
------------
->String getAbsolute() :- This methode return full path of file
-------------------------
->String getName() :- return name of the file
--------------------
->boolean isDirectory() :- It check the given path contains a folder or not
------------------------
->boolean mkdir() :- This methode create a nested folder
------------------
void setWriteable(true) :- This methode change the permission of a file
------------------------

Graphics/GUI Application using Java
-----------------------------------------
The following are the predefine package generaly used to create UI using java
	1. awt
	2. swing
	3. applet
	4. javafx

1. awt(abstract windows toolkit)
------------------------------------------
It support stand alone application the created by awt is platform depended because awt shaire the resource of os, so UI w,u be different in different environment
2. Swing
------------
It also support stand alone/desktop application the UI created by swing is complitely platform independent because all the GUI component of swing are purely devloped in java
So UI is same for all environment

UI component
------------------
Java.awt
------------
	Graphics 
	font 
	color 
	layout manager
		flot layout
		grid layout
	component
		container
			frame 
			panel 
			window
			dialog
		button
		label
		checkbox
		checkBoxGroup
		Menu 
		MenuBar
		MenuItem
		RadioMenuItem
		Canvas
		Text component
			Textarea
			Textfield
		choice
		scrollBar
		scrollPanel

java.awt.event :-
-------------------
ActionEvent
ActionListener
ItemEvent
ItemListener
AdjustmentEvent
AdjustmentListener
TextEvent
TextListener
MouseList
MouseListener
MouseMotionListener

Frame :-
------------
->Frame is a container which is known as heavy weight container
->Heavy weight means can be visible to the end user directly
->To create a frame Java support 2 types of technique 
	1. By agrigation
	2. By Inheritance

					BorderLayout
					==============
By default frame support BorderLayout. BorderLayout divided the container into 5 different part to do so java provides 5 components.
	1. EAST 
	2. WEST
	3. NORTH
	4. SOUTH
	5. CENTER(By default)
->SetLayout is a predefine methode which is used to change the layout of a container i.e frame by default support BorderLayout then can use SetLayout(new flowLayout())

Event Handling with awt/swing components
------------------------------------------
->awt and swing component genearate events happening with component 
->all the events are predefine classes and event handle by listener and all the listener predefined interface present in java.awt event package
->event : click on button , key press, keyrelease, select item, check the checkbox,----------- ------- - - - - -  -- etc
->for each and every events java provides one or more listener

	ActionEvent		-	 ActionListener
	ItemEvent		-	 ItemListener
	MouseEvent		-	 MouseListener

->Event can be handle by 3 ways
	1. with in same class
	2. with in a different class
	3. By Anonymous class

Steps to handle the events
------------------------------
1. Implements the listener
2. Override the abstract methode
3. Register the event
4. Put the event handle code

ActionEvent & ActionListener
------------------------------
Button, menu, .....etc are the component which can generates
->ActionEvent and ActionEvent can be handled by ActionListener with the help of ActionPerformance()

ItemEvent & ItemListener
-------------------------------
This event genearly generate by comboBox, CheckBox, RadioButto, .....etc component and handle by ItemListener with the help of itemStateChanged()

MouseEvent & MouseListener
----------------------------
This event can genearte by any component and handle by any component and handle by MouseListener and MouseMotionListener

Adapter Class
----------------
As all the listener are predefine interface it is compolusory to override all the abstract methode which is may or maynot required in java program
->To avid that Draw back java introduced the concept of Adapter class available for that listener which contains more than one abstract methode
	
		MouseAdapter 		- 		MouseListener
		MouseMotionAdapter	-		MouseMotionListener
		KeyAdapter			-		KeyListener
		WindowAdapter		-		WindowListener

						Applet 
						====== 
Applet is a predefine class present in java applet package
			
			java.applet.Applet

->Applet is a very similar to frame but the differnce is frame support standalone application but applet app can be execute in web-browser
->Applet application does not contain any main methode




