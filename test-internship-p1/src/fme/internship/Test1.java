/*______________________________________________________________________________________________________
 * 
 * Write a Java program that reads arguments from the command line 
 * and checks whether all numeric positive non-zero values appear in ascending order.
 * _____________________________________________________________________________________________________
 * 
 * 
 * Example:
 * 
 *______________________________________________________________________________________________________
 *
 *  Input:
 *      java Test1 1 0 -2 3 5 -7 -9 7 8 
 *  Output:
 *      YES
 *______________________________________________________________________________________________________
 *      
 *______________________________________________________________________________________________________
 *  
 *  Input:
 *      java Test1 1 0 -2 3 5 -7 -9 4 7 8 
 *  Output:
 *      NO
 *______________________________________________________________________________________________________
 *
 *______________________________________________________________________________________________________ 
 */

package fme.internship;

/**
 * 
 * @author <full name>
 * @email <email address>
 * 
 */
public class Test1 {

    public static void main(String[] args) {


        int max = 0; // memoram maximul in timp ce parcurgem lista
        boolean check = true;  // verificam daca toate sunt in ordine crescatoare

        for(int i = 0; i<args.length; i++) {
           if(Integer.parseInt(args[i]) > 0 && Integer.parseInt(args[i]) < max){
               check = false; // daca gasim un element mai mic ca maximul care se afla dupa inseamna ca nu sunt in ordine
           }
           else if(Integer.parseInt(args[i]) > 0 && Integer.parseInt(args[i]) > max){
               max = Integer.parseInt(args[i]); // setam maximul
           }
        }

        // afisam rezultatul
        if(check){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        System.out.println("FME Internship - Test1");
    }

}