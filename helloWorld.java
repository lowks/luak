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
        System.out.println(raw_string.toUpperCase().toLowerCase());
        System.out.println(raw_string.replace("lowks","lukecibai"));
        if ( long_string instanceof String ) {
            System.out.println("Luke is a cibai !");
        }

        Integer a_number = 10;
	if ( a_number instanceof Integer ) {
		System.out.println("I am an integer");
	}

	if (Integer.valueOf(a_number) instanceof Integer) { 
	        System.out.println("Hello Sian Lerk"); 
	}

	System.out.println(Integer.valueOf("1"));

	System.out.println(new StringBuilder().append("lowks ").append("hates ").append("java").toString());
	print_string();
	print_name("lowks");
	String string_c = "     I    have got many spaces      ";
	System.out.println(string_c.trim()); 
    }

    public static void print_string() {
        System.out.println("Print me!");
    }

    public static void print_name(String name) {
        System.out.println("Helloworld " + name);
    }
}
