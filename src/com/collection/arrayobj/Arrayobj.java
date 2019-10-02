package com.collection.arrayobj;


class Student
{
  int id,mark;
  String name;
 Student(int id,String name, int mark)
 {
	 this.id=id;
	 this.name=name;
	 this.mark=mark;
	// System.out.println("Student Id="+id+" "+"Name="+name+" "+"Marks="+mark);
	 
 }
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ",mark="+mark+"]";
}

}
class Teacher
  	
{
   int tid;
   String name;
   Teacher(int tid,String name)
   { 
	   this.tid=tid;
	   this.name=name;
//	System.out.println("Teacher Id ="+tid+" "+"Tname= "+tname); 
   }
@Override
public String toString() {
	return "Teacher [tid=" + tid + ", tname=" + name + "]";
}

}



public class Arrayobj {

	public static void main(String[] args) {
	     //Student s1[]=new Student[2];
	     Student s1= new Student(1,"Ashwini",99);
	     Student s2=new Student(2,"Arti",56);
	     
         //Teacher t1[]=new Teacher[2];
         Teacher t1=new Teacher(7, "Rekha");
         Teacher t2=new Teacher(5, "Teja");
         Object[] obj1={s1,s2,t1,t2};
         
         for(Object obj12:obj1)
         {  if(obj12.getClass().getName()=="com.collection.arrayobj.Student")
        	//if(obj12 instanceof Student)//using instance of method
        	 System.out.println(obj12); 
         }
	
	}

}
