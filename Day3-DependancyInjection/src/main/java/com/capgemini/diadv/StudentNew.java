package com.capgemini.diadv;
//Dependency in terms of object
public class StudentNew 
{
   MathCheat math;
   
   //DI using setters method
   public void cheating()
   {
	   math.mathCheat();
   }

   public void setMath(MathCheat math) {
	this.math = math;
}
   
}
