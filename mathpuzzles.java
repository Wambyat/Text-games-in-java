import java.io.*;
public class mathpuzzles
{
    void main()throws Exception
    {
        LOADING z=new LOADING();
        z.loading();
        disp_mathpuzz u=new disp_mathpuzz();
        u.show();
        Thread.sleep(2000);
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("\u000c");
        System.out.println("What is 19 times 500 into 0 plus 1?");
        int ans=Integer.parseInt(br.readLine());
        if(ans==1){
            System.out.println("\u000c");
            System.out.println("\n\n\n\n\n\n\t\t\t\tCORRECT!");
            Thread.sleep(3000);
            System.out.println("\u000c");
        }
        
        else{System.out.println("\u000c");
            System.out.println("\n\n\n\n\n\n\t\t\t\tWRONG...................");
            Thread.sleep(3000);
            System.out.println("\u000c");
        }
        System.out.println("250 + ??= 160");
        ans=Integer.parseInt(br.readLine());
        if(ans==-90){
            System.out.println("\u000c");
            System.out.println("\n\n\n\n\n\n\t\t\t\tCORRECT!");
            Thread.sleep(3000);
            System.out.println("\u000c");
        }
        else{System.out.println("\u000c");
            System.out.println("\n\n\n\n\n\n\t\t\t\tWRONG...................");
            Thread.sleep(3000);
            System.out.println("\u000c");
        }
        System.out.println("What mathematical symbol can be placed between 5 and 9 to make\n a number less than 9 but more than 5?(Type the symobol itself)");
        String c=br.readLine();
        String b=".";
        boolean d=b.equals(c);
        if(d==true){
            System.out.println("\u000c");
            System.out.println("\n\n\n\n\n\n\t\t\t\tCORRECT!");
            Thread.sleep(3000);
            System.out.println("\u000c");
        }
        else{System.out.println("\u000c");
            System.out.println("\n\n\n\n\n\n\t\t\t\tWRONG...................");
            Thread.sleep(3000);
            System.out.println("\u000c");
        }
        System.out.println("\u000c");
    }
}
        