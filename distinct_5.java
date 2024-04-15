import java.util.Scanner;
public class distinct_5{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int[] num=new int[10];
        int count=0;
        for(int i=0;i<10;i++)
        {
            int number=s.nextInt();
            boolean isNew=true;
            for(int j=0;j<count;j++)
            {
                if(num[j]==number)
                {
                    isNew=false;
                    break;
                }
            }
            if(isNew)
            {
                num[count]=number;
                count++;
            }
        }
        System.out.println("Distinct numbers count is: "+count);
        for(int i=0;i<count;i++)
        {
            System.out.print(num[i]+" ");
        }
        s.close();
    }
}