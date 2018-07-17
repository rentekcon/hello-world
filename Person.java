/*
  Programmer Name: Demo Student
  
  This is the person class. It describes people
*/

public class Person 
{
   private String name; //The name of the person
   
   /*
      Default Constructor
   */
   public Person(){
      name = "No name yet"; //setting the name to nothing
   
   }
   
   /*
      Constructor
      param: String input
      Set the name to the input value
  */
  public Person(String initialName){
      name = initialName;
  
  }
  
  /*
   Mutator Method - set method
   
   Changes name to the new name
 */
 public void setName(String name){
 
  this.name = name;
 }
   
 /* 
   accessor method - get method
   
   To get the name of the person
 */
 public String getName(){
      return name;
 
 }
 
 /* Display Method
 
 Output the name to the console.
 */
 public void writeOutput() {
   System.out.println("Name: " + name);
 
 }
 
 /* 
   check for equality of names method
 */
 public boolean hasSameName(Person otherPerson){
 
   return this.name.equalsIgnoreCase(otherPerson.name);
 }

}