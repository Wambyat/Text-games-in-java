import java.io.*;
public class sudoku
{
    void main() throws Exception
    {
        int a[][]={{4,6,1,8,3,9,5,2,7},{3,8,9,2,7,5,1,4,6},{5,2,7,6,4,1,9,8,3},{2,5,8,1,6,7,3,9,4},{6,7,3,9,8,4,2,5,1},{9,1,4,5,2,3,6,7,8},{7,4,5,3,9,6,8,1,2},{8,9,6,4,1,2,7,3,5},{1,3,2,7,5,8,4,6,9}};
        int b[][]={{0,6,1,8,0,0,0,0,7},{0,8,9,2,0,5,0,4,0},{0,0,0,0,4,0,9,0,3},{2,0,0,1,6,0,3,0,0},{6,7,0,0,0,0,0,5,1},{0,0,4,0,2,3,0,0,8},{7,0,5,0,9,0,0,0,0},{0,9,0,4,0,2,7,3,0},{1,0,0,0,0,8,4,6,0}};
        int c=0,d=0,e=1,f=0,g=0,col=0,row=0,val;
        LOADING z=new LOADING();
        z.loading();
        display_sudo u=new display_sudo();
        u.show();
        for(;e<=9;c++)
        {
                if(b[c][d]==0){System.out.print("_ ");f++;}
                else {System.out.print(b[c][d]+" ");f++;}
                if(f==3){System.out.print("|");f=0;}
                if(c==8){c=-1;d++;e++;System.out.println();g++;}
                if (g==3){System.out.println("---------------------");g=0;}
         
        }
        e=1;c=0;d=0;
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        for(;;)
        {
            System.out.println("enter value of the column");
            col=(Integer.parseInt(br.readLine()))-1;
            System.out.println("enter value of the row");
            row=(Integer.parseInt(br.readLine()))-1;
            System.out.println("enter the value");
            val=Integer.parseInt(br.readLine());
            if(col>9||row>9){
                System.out.println("please type correct values");
                Thread.sleep(3000);
                System.out.println("\u000c");
            }
            if(col<=9&&row<=9){
            if(val==a[col][row]){System.out.println("\u000c");
                System.out.println("\t\t\tCorrect!!");
                Thread.sleep(1000);
                System.out.println("\u000c");
                b[col][row]=val;
                for(;e<=9;c++)
                 {
              if (b==a){System.out.println("YOU DID IT !!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                  break;}
              else{
                if(b[c][d]==0){System.out.print("_ ");f++;}
                else {System.out.print(b[c][d]+" ");f++;}
                if(f==3){System.out.print("|");f=0;}
                if(c==8){c=-1;d++;e++;System.out.println();g++;}
                if (g==3){System.out.println("---------------------");g=0;}
               }
            }
            e=1;c=0;d=0;
            } 
           else {System.out.println("WRONG!");
            Thread.sleep(3000);
            System.out.println("\u000c");
            for(;e<=9;c++)
                 {
                if(b[c][d]==0){System.out.print("_ ");f++;}
                else {System.out.print(b[c][d]+" ");f++;}
                if(f==3){System.out.print("|");f=0;}
                if(c==8){c=-1;d++;e++;System.out.println();g++;}
                if (g==3){System.out.println("---------------------");g=0;}
               }
            }
            e=1;c=0;d=0;
           }
           else{System.out.println("\u000c");
               System.out.println("type meaningful values");
               Thread.sleep(2000);
               System.out.println("\u000c");
              for(;e<=9;c++)
                 {
             
                if(b[c][d]==0){System.out.print("_ ");f++;}
                else {System.out.print(b[c][d]+" ");f++;}
                if(f==3){System.out.print("|");f=0;}
                if(c==8){c=-1;d++;e++;System.out.println();g++;}
                if (g==3){System.out.println("---------------------");g=0;}
              
            }
        }}
        
     }
}
                
