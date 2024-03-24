import java.util.Scanner;
public class bubblesort_5{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int[] numbers=new int[10];
        for(int i=0;i<10;i++){
            numbers[i]=s.nextInt();
        }
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9-i;j++)
            {
                if(numbers[j]>numbers[j+1])
                {
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted list: ");
        for(int i=0;i<10;i++)
        {
            System.out.print(numbers[i]+" ");
        }
    }
}