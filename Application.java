import java.util.*;
import java.io.*;
/**
 * This class will hopefully run the Group Project
 * 
 * @author George Butcher
 * @version (1)
 */
public class Application
{
    private Scanner scan;
    private Group group;

    public Application()
    {
        System.out.println("**THIS IS A CONSTUCTOR FOR APPLICATION**");
        scan=new Scanner(System.in);
    }

    public void runMenu()
    {
        String response;
        String name;
        int age;

        do{
            printMenu();
            response=scan.nextLine();
            if(response.equalsIgnoreCase("Student")) {
                System.out.print("Enter name of student: ");
                name=scan.nextLine();                
                System.out.print("Ener age of student: ");
                age=scan.nextInt(); scan.nextLine();
                Group g=new Group();
                g.setName(name);
                g.setAge(age);
                g.toString2();

            }
                                
            else if (response.equalsIgnoreCase("Quit")) {
                System.out.println("*****Quitting*****"); break;
            }

            else {
                System.out.println("*****Enter the information again*****");
                printMenu();
            }
        } while (! ( (response.equalsIgnoreCase("Q"))));
    }

    private void printMenu() {
        System.out.println("These are the options:");
        System.out.println("Student - Create a student");             
        System.out.println("Quit - Quit the menu");
    }
}

        
