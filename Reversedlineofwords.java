import java.util.Scanner;
class Reversedlineofwords{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.println("Enter the text:");  
        String input = sc.nextLine();  
        StringBuilder b = new StringBuilder();
        String[] a = input.split(" "); 
        for (int i = a.length - 1; i >= 0; i--) {
            b.append(a[i]);
            if (i != 0) {
                b.append(" ");  
            }
        }
        System.out.println("Reversed text: " + b.toString());  
    }
}
