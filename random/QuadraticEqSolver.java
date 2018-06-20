package random;
//This class will try to solve a quadratic equation
//As the input, user will provide the coefficients of the terms and the constant term
class QuadraticEqSolver {
    private int a, b, c;
    private double xValue1, xValue2, discriminant;
    
    //Setters
    public void setA(int a) {
        if (a != 0)
            this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public void setC(int c) {
        this.c = c;
    }
    
    //I don't think that there is a need of getters
    
    public double discriminantFinder (int a, int b, int c){
        discriminant = b*b - 4*a*c;
        return discriminant;
    }
    
    //Last method to totally solve the equation
    public String solveForX (int b, double discriminant, int a, boolean hasOneRoot){
        //We will be needing one value at least
        xValue1 = (Math.sqrt (discriminant) - b) / (2*a);
        
        if (hasOneRoot == true){//If we only have one root (discriminant == 0) then only return that
            return Double.toString(xValue1);
        }else {
            xValue2 = ((-1)*(b + Math.sqrt (discriminant))) / (2*a);
        }
        
        return xValue1+" or "+xValue2;
    }
}