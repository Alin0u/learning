public class Test9 {
    public static void main(String[] args) {
        Test9.getOddNumbers();
    }

    public static void getOddNumbers() {
        for (int i = 0; i < 100; i++) {
            int odd = i;
            if (odd % 2 != 0) {
                System.out.println(odd);
            }
        }
    }
}
