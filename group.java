import java.util.*;
/**
 * Write a description of class Group here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Group
{
    // instance variables - replace the example below with your own
    private String name;
    private int age;
    private Scanner input;
    public Group()
    {
        name = "unknown";
        age = 0;
        name();
        method();
    }

   
    public void method()
    {
        System.out.println("Your name is " + name + " and " + age + " years olds. ");
    }
    
    public void name(){
        System.out.println("What is your name");
        name = input.nextLine();
        
        System.out.println("what is your age");
        age = input.nextInt();
        
    }

    public void setName(String newName){
        
       name = newName;
       
        
    }

public void setAge(int newAge){
    age = newAge;
}

public String getAge (){
    return age;
}

public String getName(){
    return name;
}
    

    
