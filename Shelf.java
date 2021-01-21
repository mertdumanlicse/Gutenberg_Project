package Guthenberg;

import java.util.ArrayList;

public class Shelf {

    private final String name;
    public ArrayList<Book> BookList = new ArrayList<>();

    Shelf(String u) {
        name = u;
    }

    String getName() {
        return name;
    }

    Book getBooks(int a) {
        return BookList.get(a);
    }

    int getSize() {
        return BookList.size();
    }
}
