import java.io.*;
public class Quiz
{
     void quiz()throws Exception 
     {
         LOADING z=new LOADING();
        z.loading();
         int points=0;
         display_quiz u=new display_quiz();
         u.disp();
         System.out.println("\u000c");
         System.out.println("\n\n\n\n\n\n\n\t\t\t\tTIME FOR THE FIRST QUESTION!!!!!!!!!!!!!!!        ");
         Thread.sleep(2000);
         System.out.println("\u000c");
         BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
         System.out.println("Ques-1");
         System.out.println("\n\n\n\n\t\t\tWho won 2017's tour de france?(first name ONLY)");
         System.out.print("\t\t\tYour Answer=");
         String s=br.readLine(),s1="CHRIS",s2=s.trim(),s3=s2.toUpperCase();
         boolean b=s3.equals(s1);
            if(b==true){System.out.println("\t\t\tcorrect");points+=5;}
            else {System.out.println("\t\t\twrong");points-=2;}
            Thread.sleep(2000);
            System.out.println("\u000c");
         System.out.println("Ques-2");
         System.out.println("\n\n\n\n\t\t\tWho won 2017's Nobel Prize for Literature?(first name ONLY)");
         System.out.print("\t\t\tYour Answer=");
         s=br.readLine();s1="KAZUO";s2=s.trim();s3=s2.toUpperCase();
         b=s3.equals(s1);
            if(b==true){System.out.println("\t\t\tcorrect");points+=5;}
            else {System.out.println("\t\t\twrong");points-=2;}
            Thread.sleep(2000);
            System.out.println("\u000c");
            System.out.println("Ques-3");
         System.out.println("\n\n\n\n\t\t\tname 1 of the 3 scients who won the Nobel Prize for physiology or medicine(first name ONLY)");
         System.out.print("\t\t\tYour Answer=");
        s=br.readLine();s1="JEFFREY";s2=s.trim();s3=s2.toUpperCase();String s4="MICHAEL";
         b=s3.equals(s1);boolean c=s3.equals(s4);
            if(b==true||c==true){System.out.println("\t\t\tcorrect");points+=5;}
            else {System.out.println("\t\t\twrong");points-=2;}
            Thread.sleep(2000);
            System.out.println("\u000c");
            System.out.println("Ques-4");
         System.out.println("\n\n\n\n\t\t\tWhich bollywood film was selected for the 2018 Oscars?");
         System.out.print("\t\t\tYour Answer=");
          s=br.readLine();s1="NEWTON";s2=s.trim();s3=s2.toUpperCase();
          b=s3.equals(s1);
            if(b==true){System.out.println("\t\t\tcorrect");points+=5;}
            else {System.out.println("\t\t\twrong");points-=2;}
            Thread.sleep(2000);
            System.out.println("\u000c");
            System.out.println("Ques-5");
         System.out.println("\n\n\n\n\t\t\tWho is the Vice-President of India?(first name)");
         System.out.print("\t\t\tYour Answer=");
         s=br.readLine();s1="VENKAIAH";s2=s.trim();s3=s2.toUpperCase();
        b=s3.equals(s1);
            if(b==true){System.out.println("\t\t\tcorrect");points+=5;}
            else {System.out.println("\t\t\twrong");points-=2;}
            System.out.print("points gained is ");
            System.out.println(points);
            System.out.println("\u000c");
        }
    }
            