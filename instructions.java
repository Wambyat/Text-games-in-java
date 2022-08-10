import java.io.*;
public class instructions
{
    void main()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("THIS IS INSTRUCTION FOR WARPS 'n PORTALS (the rest are self explanotory");
        System.out.println("1.To roll you can type anything or absolutly nothing there is no difference");
        System.out.println("2.Warps can send you a random number of steps forward or backward though the latter is very rare");
        System.out.println("3.Portals send you in a FIXED number of steps forward or backward");
        System.out.println("4.The goal is to reach 50");
        System.out.println("5. it is based slightly on snakes and ladders");
        System.out.println("type anything to return");
        String s=br.readLine();
    }
}
    