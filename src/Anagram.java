import java.util.Arrays;

public class Anagram {
    public static boolean is_anagram(String s1,String s2){
        if(s1.length()!=s2.length())return false;
        else{
            int count=0;
            char[] a1= s1.toCharArray();
            char[] a2=s2.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            int i=0;
            while(i<=a1.length){
                if(a1[i]==a2[i])count++;
            }
            if(count==s1.length()) return true;
            }return true;}




    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        System.out.println(is_anagram(s1,s2));
    }
}
