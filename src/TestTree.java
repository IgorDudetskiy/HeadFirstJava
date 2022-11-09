import java.awt.print.Book;
import java.util.*;

public class TestTree {
    public static void main(String[] args) {

        new TestTree().go();
    }
     class Book1Compare implements Comparator<Book1>{
        public int compare(Book1 one, Book1 two) {
            return (one.title.compareTo(two.title));
        }
    }
    public void go(){
        Book1 b1 = new Book1("How arrange cats");
        Book1 b2 = new Book1("Build renew your body");
        Book1 b3 = new Book1("Finding Nemo");
        Book1Compare bCompare = new Book1Compare();
        TreeSet<Book1> tree = new TreeSet<Book1>(bCompare);
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }
}

class Book1{
    String title;
    public Book1(String t){
        title = t;
    }
    public String toString(){
        return title;
    }

}