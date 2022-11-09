public class Books {
    String title;
    String author;
}
class BooksTestDrive {
    public static void main(String[] args) {

        Books[] myBooks = new Books[3];

        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        int x = 0;
        myBooks[0].title = "fruit Java";
        myBooks[1].title = "Java Getsbi";
        myBooks[2].title = " collection of recipes of Java";

        myBooks[0].author= " Bob";
        myBooks[1].author = " Siu";
        myBooks[2].author = " Yan";

        while(x<3) {
            System.out.print (myBooks[x].title);
            System.out.print(", author");
            System.out.println(myBooks[x].author);
            x = x+1;

        }
    }
}
