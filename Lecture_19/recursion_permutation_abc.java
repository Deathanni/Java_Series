public class recursion_permutation_abc {
    public static void permutation(String str, String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar=str.charAt(i);
            String newString=str.substring(0, i)+str.substring(i+1);
            permutation(newString,permutation+currentChar);
        }
    }
    public static void main(String[] args) {
        permutation("abc", "");
    }
}
