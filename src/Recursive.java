public class Recursive {
    static class fibonac{

        public static int fibo(int n) {
            if (n == 1 || n == 0) {
                return n;
            }
            return fibo(n-1) + fibo(n-2);
        }

        public static void main(String[] args){
            fibonac fibon = new fibonac();
            System.out.println(fibon.fibo(6));
        }
    }
}
