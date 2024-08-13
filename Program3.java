//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
    class program3 {
        public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);
            
            // Create my variables
            int length = 0;
            int width = 0;
            int area = 0;
            int perimeter = 0;
            
            //Ask for user input:
            System.out.println("Please enter the length");
            
            //Get input
            length = myObj.nextInt();
            
            //Ask for user input:
            System.out.println("Please enter the width");
            
            //Get input
            width = myObj.nextInt();
            
            //Calculate
            
            //Output
            System.out.println("Length is: " + length);
            System.out.println("Width is: " + width);
            System.out.println("Area is: " + length * width);
            System.out.print("Perimeter is: " + 2 * (length + width));
        
        }
    }



//Paste console output below:
/*

Please enter the length
143
Please enter the width
82
Length is: 143
Width is: 82
Area is: 11726
Perimeter is: 450

*/
