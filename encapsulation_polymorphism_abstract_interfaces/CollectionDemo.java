import java.util.*;  // Import all collection classes

public class CollectionDemo {
    public static void main(String[] args) {
        // Create a LinkedList of Strings (generic)
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        String s1 = "Java";
        String s2 = "Python";
        list.add(s1);
        list.add(s2);
        list.add("C++");

        // 🔹 Iterating using for-each loop
        System.out.println("Using for-each loop:");
        for (String lang : list) {
            System.out.println(lang);
        }

        // 🔹 Iterating using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 🔹 Iterating using forEach + lambda (Java 8+)
        System.out.println("\nUsing forEach and lambda:");
        list.forEach(lang -> System.out.println(lang));
    }
}
