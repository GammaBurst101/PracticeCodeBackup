package random;
import java .util.*;
class Tictactoe
{
    static String a="",b="",c="",d="",e="",f="",g="",h="",i="";
    static int count=1;
    static Tictactoe ob=new Tictactoe();

    public static void main(String args[])
    {   Scanner sc=new Scanner(System.in);
        System.out.println("enter the alphabet you want to replace ");
        System.out.println("-----------------------------------------");
        System.out.println("enter the name of first player who had the first chance");
        String play1=sc.nextLine();
        System.out.println("enter the name of second player");
        String play2=sc.nextLine();
        ob.structure();
        System.out.println();
        for(int x=0;x<9;x++)
        {  

            if(count%2!=0)
            {
                System.out.println(play1+"'s chance symbol assigned is : O");
            }else{
                System.out.println(play2+"'s chance symbol assigned is : X");
            }
            String en=sc.nextLine();
            System.out.println();
            count=count+1;
            ob.condition(en);
            ob.structure();
            System.out.println();
        }
    }

    public static void structure()
    {
        System.out.println("\f");//This will clear the screen
        for(int x=1;x<=3;x++)
        {
            System.out.print(" ");
            for(int y=1;y<=3;y++)
            {
                if(x==1&&y==1)
                {
                    if(a==""){
                        System.out.print(" a ");
                    }else{
                        System.out.print(" "+a+" ");
                    }
                }

                if(x==1&&y==2)
                {
                    if(b==""){
                        System.out.print(" b ");
                    }else{
                        System.out.print(" "+b+" ");
                    }
                }

                if(x==1&&y==3)
                {
                    if(c==""){
                        System.out.print(" c ");
                    }else{
                        System.out.print(" "+c+" ");
                    }
                    break;
                }

                if(x==2&&y==1)
                {
                    if(d==""){
                        System.out.print(" d ");
                    }else{
                        System.out.print(" "+d+" ");
                    }
                }

                if(x==2&&y==2)
                {
                    if(e==""){
                        System.out.print(" e ");
                    }else{
                        System.out.print(" "+e+" ");
                    }
                }

                if(x==2&&y==3)
                {
                    if(f==""){
                        System.out.print(" f ");
                    }else{
                        System.out.print(" "+f+" ");
                    }
                    break;
                }

                if(x==3&&y==1)
                {
                    if(g==""){
                        System.out.print(" g ");
                    }else{
                        System.out.print(" "+g+" ");
                    }
                }

                if(x==3&&y==2)
                {
                    if(h==""){
                        System.out.print(" h ");
                    }else{
                        System.out.print(" "+h+" ");
                    }
                }

                if(x==3&&y==3)
                {
                    if(i==""){
                        System.out.print(" i ");
                    }else{
                        System.out.print(" "+i+" ");
                    }

                    break;
                }
                System.out.print(" |");
            }
            if(x==3)
            {

                break;
            }
            System.out.println();
            System.out.println(" ------------- ");
        }

    }

    public static void condition(String en)
    {

        if(count%2!=0)
        {
            if(en.equalsIgnoreCase("a"))
            {
                a="X";
            }
            if(en.equalsIgnoreCase("b"))
            {
                b="X";
            }
            if(en.equalsIgnoreCase("c"))
            {
                c="X";
            }
            if(en.equalsIgnoreCase("d"))
            {
                d="X";
            }
            if(en.equalsIgnoreCase("e"))
            {
                e="X";
            }
            if(en.equalsIgnoreCase("f"))
            {
                f="X";
            }
            if(en.equalsIgnoreCase("g"))
            {
                g="X";
            }
            if(en.equalsIgnoreCase("h"))
            {
                h="X";
            }
            if(en.equalsIgnoreCase("i"))
            {
                i="X";
            }

        }
        if(count%2==0)
        {
            if(en.equalsIgnoreCase("a"))
            {
                a="O";
            }
            if(en.equalsIgnoreCase("b"))
            {
                b="O";
            }
            if(en.equalsIgnoreCase("c"))
            {
                c="O";
            }
            if(en.equalsIgnoreCase("d"))
            {
                d="O";
            }
            if(en.equalsIgnoreCase("e"))
            {
                e="O";
            }
            if(en.equalsIgnoreCase("f"))
            {
                f="O";
            }
            if(en.equalsIgnoreCase("g"))
            {
                g="O";
            }
            if(en.equalsIgnoreCase("h"))
            {
                h="O";
            }
            if(en.equalsIgnoreCase("i"))
            {
                i="O";
            }
        }

    }
}



