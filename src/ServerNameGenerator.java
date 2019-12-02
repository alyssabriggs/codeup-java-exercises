public class ServerNameGenerator {

    public static String[] adjectives = {
                "giant",
                "tiny",
                "thin",
                "wide",
                "ugly",
                "beautiful",
                "calm",
                "basic",
                "chaotic",
                "unique"
        };

       public static String[] nouns = {
                "couch",
                "book",
                "house",
                "car",
                "phone",
                "laptop",
                "tv",
                "desk",
                "bed",
                "oven"
        };


       public static String randomElement(String[] array){
           int i = (int)Math.random() * (array.length -1) + 1;
           return array[i];
       }

       public static void main(String[] args){
           System.out.println("Here is your server name: \n" + randomElement(adjectives) + "-" + randomElement(nouns));
       }
}
