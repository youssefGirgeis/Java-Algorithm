/*

Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
*/

public class CountX {
    public static void main(String[] args) {
        System.out.println(countX("xxhixx"));
        System.out.println(countX("xhixhix"));
        System.out.println(countX("hi"));
    }

    public static int countX(String str){

        if(str.length() == 0){return 0;}

        if (str.length() == 1){
            if (str.charAt(str.length()-1)== 'x') return 1;
            return 0;

        }else{
            if (str.charAt(str.length()-1)== 'x'){
                return 1 + countX(str.substring(0, str.length()-1));
            }
            return countX(str.substring(0, str.length()-1));
        }




    }
    
}