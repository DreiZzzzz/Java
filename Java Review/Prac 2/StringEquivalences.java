class StringEquivalances {
    public static void main(String[] args) {
        String  s1 = "Hello",
        s2 = "Hello",
        s3 = s1,
        s4 = new String("Hello"),
        s5 = new String("Hello");

        System.out.println("Usage of ==");
        System.out.println("s1 == s2 -> " + String.valueOf(s1 == s2)); // true
        System.out.println("s2 == s3 -> " + String.valueOf(s2 == s3)); // true
        System.out.println("s1 == s4 -> " + String.valueOf(s1 == s4)); // false
        System.out.println("s4 == s5 -> " + String.valueOf(s4 == s5)); // false 
        
        System.out.println("Usage of equals()");
        System.out.println("s1 == s2 -> " + s1.equals(s2)); // true
        System.out.println("s2 == s3 -> " + s2.equals(s3)); // true
        System.out.println("s1 == s4 -> " + s1.equals(s4)); // true
        System.out.println("s4 == s5 -> " + s4.equals(s5)); //true
    }
}