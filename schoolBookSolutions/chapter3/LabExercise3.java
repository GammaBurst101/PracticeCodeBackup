package schoolBookSolutions.chapter3;
class LabExercise3{
    public static void main (String args[]){
        int num = 16;
        String out = (num % 2 == 0)?"even":"odd";
        System.out.println ("The number "+num+" is "+out);
    }
}