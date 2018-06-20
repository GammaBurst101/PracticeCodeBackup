package random;
import java.util.Scanner;
// This is to run the QuadraticEqSolver
class QuadraticSolverLauncher {
    public static void main (String args[]){
        Scanner scan = new Scanner (System.in);
        
        //Creating a QuadraticEquationSolver object
        QuadraticEqSolver equationSolver = new QuadraticEqSolver();
        
        System.out.println ("Welcome to The Quadratic Equation Solver Application");
        System.out.println ("----------------------------------------------------");
        System.out.println ("A quadratic eq is of the form: ax^2 + bx +c = 0");
        System.out.println ("Please enter the value of a, b and c below");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println ("-----------------------------------------------------");
        
        //Setting all the values
        equationSolver.setA(a);
        equationSolver.setB(b);
        equationSolver.setC(c);
        
        //Finding the discriminant
        double dis = equationSolver.discriminantFinder(a, b, c);
        if (dis < 0)
            System.out.println ("The roots are imaginary. Sorry, this application is not designed to solve them yet");
        else if (dis == 0){
            String valueOfX = equationSolver.solveForX(b, dis, a, true);
            System.out.println ("Value of x for the quadratic equation "+a+"x^2 + "+b+"x + "+c+" = 0, is: "+valueOfX);
        }else{
            String bothRoots = equationSolver.solveForX(b, dis, a, false);
            System.out.println ("Values of x for the quadractic equation "+a+"x^2 + "+b+"x + "+c+" = 0, is: "+bothRoots);
        }
            
            
        
    }
}