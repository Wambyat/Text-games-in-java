import java.io.*;
public class rockpap
{
   void main()throws Exception
   {
       LOADING z=new LOADING();
        z.loading();
       BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
       System.out.println("This is a basic Rock,Paper,Scissors game!\n Type one of the above symbols!");
       for(;;)
       {
         String s=br.readLine();
         s=s.toUpperCase();
         String s1="ROCK",s2="PAPER",s3="SCISSORS";
         if((s.equals(s1))==false&&(s.equals(s2))==false&&(s.equals(s3))==false)
         {
             System.out.println("type only rock OR paper OR scissors(it is not case sensitive)");
             continue;}
         if((s.equals(s1))==true){
           double win=(Math.random()*(3-1))+1;
           if(win<2)System.out.println("YOU WON! The Computer Picked Scissor!");
           else System.out.println("NO! You lost.......... The Computer Picked Paper!");
         }
         if((s.equals(s2))==true){
           double win=(Math.random()*(3-1))+1;
           if(win<2)System.out.println("YOU WON! The Computer Picked Rock!");
           else System.out.println("NO! You lost.......... The Computer Picked Scissors!");
         }
         if((s.equals(s3))==true){
           double win=(Math.random()*(3-1))+1;
           if(win<2)System.out.println("YOU WON! The Computer Picked Paper!");
           else System.out.println("NO! You lost.......... The Computer Picked Rock!");
         }
         Thread.sleep(20000);
         System.out.println("\u000c");
         break;
        }
    }
}
       