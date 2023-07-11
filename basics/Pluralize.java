public class Main {
    public static String pluralize(String word, int number) {
        if (number == 0 || number > 1) {
            return word + "s";
        }
        return word;
    }

    public static void main(String[] args) {
        // System.out.println(pluralize("cat", 0));    
        // System.out.println(pluralize("dog", 1));    
        // System.out.println(pluralize("horse", 3)); 
        
           int dogCount = 1;
System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

int catCount = 2;
System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

int turtleCount = 0;
System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

      }

   


}

