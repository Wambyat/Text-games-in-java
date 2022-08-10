import java.io.*;
public class main
{
    void main()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please make this window FULLSCREEN");
        Thread.sleep(2000);
        System.out.println("\u000c");
        Quiz a=new Quiz();
        sudoku b=new sudoku();
        wrap_port c=new wrap_port();
        rockpap d=new rockpap();
        mathpuzzles e=new mathpuzzles();
        credits f=new credits();
        instructions g=new instructions();
        LOADING z=new LOADING();
        z.loading();
        int POINTS=0;
         System.out.println("W        W     E E E     L            C       O        M       M    E E E  ");   
         System.out.println("W        W     E         L         C        O   O      M M   M M    E      ");
         System.out.println("W   W    W     E E E     L        C        O     O     M   M   M    E E E  ");
         System.out.println(" W W  W W      E         L         C        O   O      M       M    E      ");
         System.out.println("  WW  WW       E E E     L L L L      C       O        M       M    E E E  ");
         System.out.println("  \n");
         System.out.println("  \n");
         System.out.println(" T T T T T     O               T T T T T    R R      I I I I I  X       X ");              
         System.out.println("     T       O   O                 T        R    R       I        X   X   ");    
         System.out.println("     T      O     O                T        R R          I          X     ");       
         System.out.println("     T       O   O                 T        R   R        I        X   X   ");                     
         System.out.println("     T         O                   T        R     R  I I I I I  X       X ");                      
         Thread.sleep(2000);
         System.out.println("\u000c");
         
         for(;;)
         {
             if(POINTS>=50)
             {System.out.println("\u000c");
                System.out.println("  \n");
                System.out.println("YOU DID IT !!!!!!!!!!!!!!!!\n CONGRATULATIONS!!!!!!");
                Thread.sleep(3000);
                System.out.println("WHY ARE YOU STILL HERE THE GAME IS OVER!-____________-");
             }
            
            System.out.println("  \n");
            System.out.print("YOUR POINTS = "+POINTS);
            System.out.println("  \n");
            System.out.println("\t\t\t\t\t Would you like to play a game or see the instructions or maybe the credits!!!:)");
            System.out.println("\t\t\t\t\t\t\t q = QUIZ!");
            System.out.println("\t\t\t\t\t\t\t m = MATH PUZZLES!");
            System.out.println("\t\t\t\t\t\t\t w = WRAPS 'n PORTALS!");
            System.out.println("\t\t\t\t\t\t\t s = SUDOKU!");
            System.out.println("\t\t\t\t\t\t\t r = ROCK PAPER SCISSORS!");
            System.out.println("\t\t\t\t\t\t\t i = INSTRUCTIONS");
            System.out.println("\t\t\t\t\t\t\t c = PROGRAM CREDITS! :)");
            System.out.println("\t\t\t\t\t\t\t bye = Quit the game :(");
            System.out.println("\t\t\t\t\t Type the corresponding letter to use the options");
            String s=br.readLine();
            
           if(s.equalsIgnoreCase("q")==false&&s.equalsIgnoreCase("m")==false&&s.equalsIgnoreCase("w")==false&&s.equalsIgnoreCase("w")==false&&s.equalsIgnoreCase("s")==false&&s.equalsIgnoreCase("r")==false&&s.equalsIgnoreCase("i")==false&&s.equalsIgnoreCase("c")==false&&s.equalsIgnoreCase("bye")==false){
               System.out.println("Please type only the CORRESONDING letter and not something else");
               Thread.sleep(3000);
               System.out.println("\u000c");
               continue;
            }
           if(s.equalsIgnoreCase("q")==true){
             a.quiz(); POINTS+=10;
            }
           if(s.equalsIgnoreCase("m")==true){
            e.main(); POINTS+=10;
           }
           if(s.equalsIgnoreCase("w")==true){
               c.main(); POINTS+=10;
            }
            if(s.equalsIgnoreCase("s")==true){
                b.main(); POINTS+=10;System.out.println("\u000c");
            }
            if(s.equalsIgnoreCase("r")==true){
                d.main(); POINTS+=5;
            }
            if(s.equalsIgnoreCase("i")==true){
                g.main();
            }
            if(s.equalsIgnoreCase("c")==true){
                f.main();
            }
            if(s.equalsIgnoreCase("bye")==true){
                System.out.println("\u000c");
                System.out.println("Close the window by clicking on the 'X' on the top right hand corner.\nBYE!!!!!!!");
                break;
            }
        }
    }
}
                    