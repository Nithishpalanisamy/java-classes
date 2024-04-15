import java.util.Scanner;
public class TolowerToupper_5{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String input=s.nextLine();
        int uppercase=0;
        int lowercase=0;
        for(char c:input.toCharArray()){ // Removed the parameter 1
            if(Character.isUpperCase(c)){ // Corrected the method name
                uppercase++;
            }
            else if(Character.isLowerCase(c)){ // Corrected the method name
                lowercase++;
            }
        }
        System.out.println("Total of uppercase letters "+uppercase);
        System.out.println("Total of lowercase letters "+lowercase);
        s.close();
    }
}
