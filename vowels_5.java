import java.util.Scanner;
public class vowels_5{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String[] words=new String[5];
        for(int i=0;i<5;i++)
        {
            words[i]=s.nextLine();
        }
        for(String word:words){
            int vowelcount=countvowels(word);
            System.out.println(word+" contains "+vowelcount+" vowels");
        }
        s.close();
    }
    public static int countvowels(String word) // Corrected the class name
    {
        int count=0;
        String vowels="aeiouAEIOU";
        for(int i=0;i<word.length();i++)
        {
            if(vowels.indexOf(word.charAt(i))!=-1) // Corrected the method name
            {
                count++;
            }
        }
        return count;
    }
}
