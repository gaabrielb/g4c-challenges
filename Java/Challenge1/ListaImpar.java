package Java.Challenge1;

class ListImpar {
    public static void main(String[] args) {
        int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        // Method 1
        for (int i = 1; i <= numeros.length; i+=2) {
            System.out.println(i);
        }

        // Method 2
        for (int i = 0; i < numeros.length; i++) {
            if(i%2 != 0) System.out.println(i);
        }
    }
}