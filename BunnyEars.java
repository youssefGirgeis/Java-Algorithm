public class BunnyEars{
    public static void main(String[] args) {
        System.out.println(calculateEars(4));
    
    }

    public static int calculateEars(int bunny){

        int result = 0;

        if (bunny >= 1){
            
            result =  2 + calculateEars(bunny - 1);
            //System.out.println(bunny);
            //System.out.println(result);
            return result;
        }
        else{
            return 0;
        }
    }

}