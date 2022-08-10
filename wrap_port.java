import java.io.*;
public class wrap_port
{
    void main()throws Exception
   {
       LOADING z=new LOADING();
        z.loading();
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
       String s=" ";
        int a=50;
        int c=0;
        Double b=1.0;
        disp_warp ui=new disp_warp();
        ui.disp();
        Thread.sleep(1000);
        System.out.println("\u000c");
            for(int i=0;i<a;a--)
        {
            if(b==a){
                System.out.print(" you|");continue;
            }
            if(c!=10){

            if(a>=10)System.out.print(" "+a+" |");
            else System.out.print("  "+a+" |");

        }
        else{
            System.out.println();
            System.out.print("__________________________________________________");
            System.out.println();
            System.out.print(" "+a+" |");
            c=0;
        }
        c++;
       }
        a=50;
        c=0;
        System.out.println("\nTIME TO PLAY");
        Double roll=0.0,u=0.0;
        for(;;)
        {
            
            System.out.println("\nType anything to roll the dice");
            s=br.readLine(); 
            
            roll=0.0;
            u=0.0;
              roll=(Math.random()*6-2)+2;
              u=Math.ceil(roll);
              System.out.println("you got "+u);
              Thread.sleep(1500);
              System.out.println("\u000c");
            if(b+u==10||b+u==8||b+u==26||b+u==34||b+u==18||b+u==23||b+u==5||b+u==31||b+u==40||b+u==41){
                System.out.println("You landed on a warp!!");
                roll=(Math.random()*10-(-10)-10);
              u=Math.ceil(roll); } 
            if(b+u==13){System.out.println("You landed on a portal!!");
                System.out.println("you teleported to 26 :)");
                b=26.0;
                Thread.sleep(2000);
                System.out.println("\u000c");
            }
            if(b+u==26){System.out.println("You landed on a portal!!");
                System.out.println("you teleported to 13 :(");
                b=13.0;
                Thread.sleep(2000);
                System.out.println("\u000c");
            }
            if(b+u==45){System.out.println("You landed on a portal!!");
                System.out.println("you teleported to 36 :(");
                b=36.0;
                Thread.sleep(2000);
                System.out.println("\u000c");
            }
            if(b+u==36){System.out.println("You landed on a portal!!");
                System.out.println("you teleported to 45 :)");
                b=45.0;
                Thread.sleep(2000);
                System.out.println("\u000c");
            }
            if(b+u==2){System.out.println("You landed on a portal!!");
                System.out.println("you teleported to 33 :)");
                b=33.0;
                Thread.sleep(2000);
                System.out.println("\u000c");
            }
            if(b+u==33){System.out.println("You landed on a portal!!");
                System.out.println("you teleported to 2 :(");
                b=2.0;
                Thread.sleep(2000);
                System.out.println("\u000c");
            }
            if(b+u==21){System.out.println("You landed on a portal!!");
                System.out.println("you teleported to 31 :)");
                b=31.0;
                Thread.sleep(2000);
                System.out.println("\u000c");
            }
            if(b+u==31){System.out.println("You landed on a portal!!");
                System.out.println("you teleported to 21 :(");
                b=21.0;
                Thread.sleep(2000);
                System.out.println("\u000c");
            }
            if(b>=50){
               System.out.println("YOU DID IT");
               
               break;
            } 
            b+=u;
            for(int i=0;i<a;a--)
             {
                
             if(b==a){
                   if(b%10!=0){
                       c++;
                   System.out.print(" you|");continue;
                }
                   else{
               System.out.println();
               System.out.print("__________________________________________________");
               System.out.println();
               System.out.print(" you|");
               c=0;
              }
              continue;
             }                     
              if(c!=10){

               if(a>=10)System.out.print(" "+a+" |");
               else System.out.print("  "+a+" |");

               }
             else{
              System.out.println();
              System.out.print("__________________________________________________");
              System.out.println();
              System.out.print(" "+a+" |");
              c=0;
             }  
             c++;
           }
           a=50;
           c=0;   
           
       }
       System.out.println("\u000c");
   }
}
