import java.util.Scanner;
class employees_5{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int[][] emp=new int[8][7];
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<7;j++)
            {
                emp[i][j]=in.nextInt();
            }
        }

        int[] totalHours = new int[8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                totalHours[i] += emp[i][j];
            }
        }
         
        for(int i=0;i<7;i++) // Changed from 8 to 7
        {
            for(int j=0;j<7-i;j++) // Changed from 8 to 7
            {
                if(totalHours[j] < totalHours[j+1])
                {
                    int temp = totalHours[j];
                    totalHours[j] = totalHours[j+1];
                    totalHours[j+1] = temp;
                }
            }
        }
         for (int i = 0; i < 8; i++) {
            System.out.println( totalHours[i] + " hours");
        }
            in.close();
    }
}
