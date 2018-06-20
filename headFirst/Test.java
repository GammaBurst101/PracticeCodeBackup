//This class is for my testing of some concepts and tricks of Head First Java
package headFirst;
class Test {
    public static void main (String args[]){
        //Trying to see if I can use a loop after assignment operator
        String[] myList = new String[2];
        myList[0] = "Prasoon";
        myList[1] = "Vibhas";
        
        String toFind = "Vibhas";
        boolean isIn = for (String element: myList) if (toFind.equals(element)) true;
    }
}