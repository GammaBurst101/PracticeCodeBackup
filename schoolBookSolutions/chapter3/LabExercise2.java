package schoolBookSolutions.chapter3;
class LabExercise2
{
    public static void main (String args[])
    {
        int l = 5, b = 6;
        int ar= l * b;
        System.out.println ("Area of the rectangle= "+ar);
        l += 2; 
        b += 4;
        ar = l*b;
        System.out.println ("New area of the rectangle= "+ar);
    }
}