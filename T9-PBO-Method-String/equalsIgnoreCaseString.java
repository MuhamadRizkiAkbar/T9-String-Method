public class equalsIgnoreCaseString {
    
    public static void main(String[] args) {
        String string1 = "how";
        String string2 = "how";
        String string3 = "How";
        System.out.println("Hasilnya : " +string1.equalsIgnoreCase(string2));
        System.out.println("Hasilnya : " +string1.equalsIgnoreCase(string3));
    }
}
