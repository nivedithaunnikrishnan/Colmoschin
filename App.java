public class App {
    public static void main(String[] args) throws Exception {
        int a = 0, b = 1; 
        for (int i = 0; i < 5; i++) { 
            System.out.print(a + " "); 
            int next = a + b; 
            a = b; b = next;  
    }
}
}