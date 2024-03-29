/*
 * = 13 Nov 2019 =
1. Consider all permutations of the numbers 1 to n. A good permutation is one where for any number i at position p in the permutation, i+1 is never at position p+1. For a given n, count the number of good permutations.

TIPS:
ORIGINAL: a(n+1) = na(n) + (n−1)a(n−1)
a(n) = n * a(n-1) + (n-1) * a(n-2) << Wrong

f(n) = (n-1)*f(n-1) + (n-2)*f(n-2)
The number of "good permutation"
n   number of good permutation
2   1
3   3
4   11
5   53
6   309
7   2119
8   16687
9   148329
 */
package Assignment;
/**
 *
 * @author User
 */
public class AS1 {
    
    public static int re(int n){
        
        if(n == 0 || n == 1 || n == 2)
            return 1;
        else
            return (n-1) * re(n-1) + (n-2) * re(n-2);
    }
    
    public static void main(String[] args) {
        
        for(int i = 1; i < 10; i++){
            System.out.println(i + " : " + re(i));       
        }   
    }
}
