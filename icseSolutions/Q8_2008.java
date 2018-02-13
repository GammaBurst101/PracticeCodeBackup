package icseSolutions;
class Q8_2008
{
    void computeVol(int side)
    {
        int area = side*side*side;
        System.out.println ("Area of cube: "+area);
    }
    void computeVol(double r)
    {
        double area = (double)4/3*22/7*r*r*r;
        System.out.println ("Area of sphere: "+area);
    }
    void computeVol(int l, int b, int h)
    {
        int area = l*b*h;
        System.out.println ("Area of cuboid: "+area);
    }
}