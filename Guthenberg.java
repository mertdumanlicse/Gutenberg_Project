package Guthenberg;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Guthenberg {

    static ArrayList<String> AramaSonuçları = new ArrayList<>();
    static ArrayList<String> AramaSonuçları_numbers = new ArrayList<>();
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<HomePage> pages = new ArrayList<>();
    static ArrayList<JTextField> search_button = new ArrayList<>();
    static ArrayList<JTextArea> search_area = new ArrayList<>();
    static ArrayList<JTextArea> read_book_area = new ArrayList<>();
    static ArrayList<JTextField> select_field = new ArrayList<>();
    static ArrayList<JTextField> book1_ = new ArrayList<>();
    static ArrayList<JTextField> book2_ = new ArrayList<>();
    static ArrayList<JTextField> book3_ = new ArrayList<>();
    static ArrayList<JTextField> book4_ = new ArrayList<>();
    static ArrayList<JTextField> book5_ = new ArrayList<>();
    static ArrayList<JTextField> book6_ = new ArrayList<>();
    static ArrayList<JTextField> book7_ = new ArrayList<>();
    static ArrayList<JTextField> book8_ = new ArrayList<>();
    static ArrayList<JTextField> book9_ = new ArrayList<>();
    static ArrayList<JTextField> book10_ = new ArrayList<>();
    static ArrayList<String> lines = new ArrayList<>();
    static ArrayList<String> rem = new ArrayList<>();
    static ArrayList<windowread> bookwindow = new ArrayList<>();
    static ArrayList<Shelf> shelf = new ArrayList<>();
    static int bks;

    static int i = 0;

    public static void main(String[] args) throws IOException, URISyntaxException {
        File file0 = new File("UserDatabase.txt");
        if (!file0.exists()) {
            file0.createNewFile();
        }
        new Form().setVisible(true);
    }
}
