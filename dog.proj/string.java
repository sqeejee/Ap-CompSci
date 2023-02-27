public class string {
    public static void main(String [] args) {

        //object was instantiated with a string literal
        String hello = "hello world";
        String hello2 = new String("BALLS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        hello2 = "goodnight moon!";

        System.out.println(hello2);

        //concat -> 1+2 -> 12

        //immutable.concat("see? I told you!");

        String phrase = new String("Change bla vla penis");

        String mutation1, mutation2, mutation3, mutation4;

        System.out.println("Orginal string: \"" + phrase + "\"");

        mutation1 = phrase.concat(". except my nuts lmaooooooooooooooooooooo");

        mutation2 = mutation1.toUpperCase();

        mutation3 =mutation2.replace("E","X");

        
        //System.out.println(mutatio3);


        mutation4 = mutation3.substring(3,30);

        


    }
}