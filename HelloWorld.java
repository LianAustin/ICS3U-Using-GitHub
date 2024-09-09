public class HelloWorld {

    /**
     * This is the main method that prints out "Hello, World!" to the console.
     * @param args
     *           the command line arguments
     * @return void
     *          no return value
     * @see System.out.println
     *         prints out the message to the console
     * @see StringBuilder
     *        used to build the message
     * @see StringBuilder.append
     *       used to append the characters to the message
     * @see StringBuilder.toString
     *      used to convert the message to a string
     */
    public static void main(String[] args) {
        String h = "H";
        String e = "e";
        String l = "l";
        String o = "o";
        String w = "W";
        String r = "r";
        String d = "d";
        String space = " ";
        String comma = ",";
        String exclamation = "!";

        String hello = h + e + l + l + o;
        String world = w + o + r + l + d;

        StringBuilder message = new StringBuilder();
        message.append(hello.charAt(0)).append(hello.charAt(1)).append(hello.charAt(2));
        message.append(hello.charAt(3)).append(hello.charAt(4)).append(space);
        message.append(world.charAt(0)).append(world.charAt(1)).append(world.charAt(2));
        message.append(world.charAt(3)).append(world.charAt(4)).append(exclamation);

        System.out.println(message.toString());
    }
}