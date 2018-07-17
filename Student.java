/*
   Programmer: Demo Student
   Date: Nov 17, 2016
   This is a student class it extends person
   the student has a student number
*/

public class Student extends Person{

   private int studentNumber; //The student number
   
   /*
      Default Constructor 
   */
   public Student() {
   
      //call the Person class Default Constructor
      super();
      
      //Initial the Student Number to nothing
      studentNumber = 0;
   
   }

   /*
      String, Int Constructor
      
   */
   public Student(String newName, int newStudentNumber){
   
      //pass the new Name to the Person Class Constructor
      super(newName);
      
      //set the student number to new Student Number
      studentNumber = newStudentNumber;
   }
   
   /* 
      This method refreshes the name and the number
   */
   public void reset(String newName, int newStudentNumber){
   
      //This is an inherited method from Person
      //So we have to class the mutator method
      //Because name is private to Person
      setName(newName);
      
      //I can set it because it's my variable
      studentNumber = newStudentNumber;
   
   }
   
   /*
      accessor method - get method
      
      get the student number
  */
  public int getStudentNumber(){
  
      return studentNumber;
  }

   /* mutator method - set method
   
      reset the student number
   */
   
   public void setStudentNumber(int newStudentNumber) {
   
      studentNumber = newStudentNumber;
   
   }
   
   /*
      Display method
      
      Display student name and student number
   */
   public void writeOutput(){
   
      System.out.println("Name: " + getName());
      System.out.println("Student Number: " + studentNumber);
   } 
  
   /* 
      Check to see if two students have the same name
      and check to see if the same number
      
      Check to see if two students are equal
  */
  public boolean equals(Student otherStudent){
      if (this == otherStudent) //is this the same
  
      return this.hasSameName(otherStudent) &&
            (this.studentNumber == otherStudent.studentNumber);
  }
   
}