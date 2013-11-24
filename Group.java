import java.util.*;
/**
 * Class Group's coding.
 * 
 * @author (Xander) 
 * @version (1.3)
 */
public class Group
{
    // instance variables - For creating name and age of the subject.
    private String name;
    private int age;
    private Scanner input;
    public Group()
    {
        name = "unknown";
        age = 0;
        
        
    }
    public Group(String startName, int startAge)
    {
        name = startName;
        age = startAge;
        
        
    }

   
   
    
    
    

    public void setName(String newName)
    {
       name = newName;
    }

    public void setAge(int newAge)
    {
    age = newAge;
    }

    public int getAge ()
    {
    return age;
    }

    public String getName()
    {
    return name;
    }
    
    public void toString2()
    {
    System.out.println("Your name is " + name + " and " + age + " years old."); 
    }
}
