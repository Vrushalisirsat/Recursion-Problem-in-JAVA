//Q. print a string in reverse.
// Time Complexity = O(n)


public class ReverseString {
    public static void printReverseString(String str,int idx) {
        if(idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        printReverseString(str,idx-1);
    }

    public static void main(String args[]) {
        String str = "ABCDEFGH";
        printReverseString(str,str.length()-1);

    }
    
}
