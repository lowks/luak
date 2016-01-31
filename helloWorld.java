class HelloWorldApp {
    public static void main(String[] args) {
        int [] numbers = {10, 20, 30, 40};
        for(int x: numbers) {
            System.out.println( x );
        }
        String name = "Low Kian Seong";
        String output = String.format("Hello World %s !", name);
        System.out.println(output); // Display the string.
        String raw_string = "hello,world,lowks";
        String [] arr = raw_string.split("\\,");
        for (String s: arr) {
            System.out.println(s);
        }
        System.out.println(raw_string.toUpperCase());
        String long_string = "xxxxxxxxxxxxxxxxxxxx";
        int length = long_string.length();
        System.out.println("The length of the long string is: " + length);
        String reverse = new StringBuilder(name).reverse().toString();
        System.out.println(reverse);
    }
}
