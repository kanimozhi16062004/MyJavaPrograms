public class AsciiToChar {
    public static void main(String[] args) {
        int[] ascii = {65, 66, 67, 68, 69};
        for (int i=0;i<ascii.length;i++) {
            char ch =(char)ascii[i];
            System.out.print(ch + " ");
        }
    }
}
