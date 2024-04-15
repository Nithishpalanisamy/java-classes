import java.io.File;
import java.io.IOException;
class createFile{
    public static void main(String[] args)
    {
        File n = new File("nith.html");
        try{
        if(n.createNewFile())
        {
            System.out.println("File created: "+n.getName());
        }
        else{
            System.out.println("File Already Exist");
        }
    }catch(IOException e)
    {
        System.out.println("Error occured");
        e.printStackTrace();
    }
    }
}