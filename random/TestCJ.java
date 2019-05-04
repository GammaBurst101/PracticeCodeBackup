package random;
class TestCJ {
    public static void main (String args[]) {
        CJ2019 obj = new CJ2019();
        
        int runs = Integer.parseInt(args[0]);
        
        int i = 1;
        int timeTaken = 0;
        while (i <= runs){
            int random = (int)(Math.random() * 100000000);
            if (obj.findPosOfFour(random) != -1) {
                long begin = System.currentTimeMillis();
                String answer = obj.findNums(random);
                long end = System.currentTimeMillis();
                timeTaken += end - begin;
                System.out.println ("N = "+random+";\t Nums = "+answer+";\t Time Taken = "+(end-begin)+"ms");
                
                i++;
            }
        }
        System.out.println ("Total time spent: "+timeTaken);
    }
}