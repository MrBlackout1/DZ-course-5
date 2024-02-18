// Складності до ітераційного методу:
// Часова: O(n)
// Просторова: O(1)
public class Iterative {
    static class fibonac{
        int[] cache = new int[100];

        public void fibo(int n)
        {
            cache[0] = 0;
            cache[1] = 1;

            for (int i = 1; i <= n; i++) {
                cache[i%2] = cache[0] + cache[1];
            }
            System.out.println(cache[n%2]);
        }

        public static void main(String[] args){
            fibonac fibon = new fibonac();
            fibon.fibo(6);
        }
    }
}