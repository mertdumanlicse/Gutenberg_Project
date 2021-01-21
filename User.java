package Guthenberg;

import static Guthenberg.Guthenberg.AramaSonuçları;
import static Guthenberg.Guthenberg.AramaSonuçları_numbers;
import static Guthenberg.Guthenberg.bks;
import static Guthenberg.Guthenberg.book10_;
import static Guthenberg.Guthenberg.book1_;
import static Guthenberg.Guthenberg.book2_;
import static Guthenberg.Guthenberg.book3_;
import static Guthenberg.Guthenberg.book4_;
import static Guthenberg.Guthenberg.book5_;
import static Guthenberg.Guthenberg.book6_;
import static Guthenberg.Guthenberg.book7_;
import static Guthenberg.Guthenberg.book8_;
import static Guthenberg.Guthenberg.book9_;
import static Guthenberg.Guthenberg.bookwindow;
import static Guthenberg.Guthenberg.i;
import static Guthenberg.Guthenberg.lines;
import static Guthenberg.Guthenberg.pages;
import static Guthenberg.Guthenberg.read_book_area;
import static Guthenberg.Guthenberg.rem;
import static Guthenberg.Guthenberg.search_area;
import static Guthenberg.Guthenberg.search_button;
import static Guthenberg.Guthenberg.select_field;
import static Guthenberg.Guthenberg.shelf;
import static Guthenberg.Guthenberg.users;
import static Guthenberg.HomePage.book1;
import static Guthenberg.HomePage.book2;
import static Guthenberg.HomePage.book3;
import static Guthenberg.HomePage.book4;
import static Guthenberg.HomePage.book5;
import static Guthenberg.HomePage.book6;
import static Guthenberg.HomePage.book7;
import static Guthenberg.HomePage.book8;
import static Guthenberg.HomePage.book9;
import static Guthenberg.HomePage.book10;
import static Guthenberg.HomePage.jTextArea1;
import static Guthenberg.HomePage.jTextField1;
import static Guthenberg.HomePage.search_field;
import static Guthenberg.HomePage.select_box;
import static Guthenberg.windowread.read_form;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

public class User {

    public final String name;
    public final String surname;
    public final String username;
    public final String Password;

    public final String fsec_ans;
    public final String sdsec_sans;
    public final String thsec_sans;

    User(String username, String Password, String fsec_ans, String sdsec_sans, String thsec_sans, String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.Password = Password;
        this.fsec_ans = fsec_ans;
        this.sdsec_sans = sdsec_sans;
        this.thsec_sans = thsec_sans;

        pages.add(new HomePage());
        bookwindow.add(new windowread());
        while (i < pages.size()) {

            pages.get(i).setVisible(true);
            pages.get(i).setResizable(false);
            pages.get(i).setName(username);

            bookwindow.get(i).setResizable(false);
            bookwindow.get(i).setName(username);

            read_form.setName(username);
            read_book_area.add(read_form);

            shelf.add(new Shelf(username));

            search_field.setName(username);
            search_button.add(search_field);

            jTextArea1.setName(username);
            search_area.add(jTextArea1);

            select_box.setName(username);
            select_field.add(select_box);

            book1.setName(username);
            book1_.add(book1);

            book2.setName(username);
            book2_.add(book2);

            book3.setName(username);
            book3_.add(book3);

            book4.setName(username);
            book4_.add(book4);

            book5.setName(username);
            book5_.add(book5);

            book6.setName(username);
            book6_.add(book6);

            book7.setName(username);
            book7_.add(book7);

            book8.setName(username);
            book8_.add(book8);

            book9.setName(username);
            book9_.add(book9);

            book10.setName(username);
            book10_.add(book10);
            i++;
        }
        jTextField1.setText("Welcome " + name.toUpperCase());
    }

    String getusername() {
        return username;
    }

    void displayOwnShelf() throws FileNotFoundException, IOException {
        int b;
        for (b = 0; b < pages.size(); b++) {
            if (username.equals(book1_.get(b).getName())) {
                break;
            }
        }

        String line = "";
        File file = new File(username + ".txt");
        if (!file.exists()) {

            file.createNewFile();
        }

        FileReader fileReader = new FileReader(file);
        BufferedReader oku = new BufferedReader(fileReader);

        String[] linesplit;
        while ((line = oku.readLine()) != null) {

            linesplit = line.split("---");
            if (linesplit.length > 1) {
                if (book1_.get(b).getText().isEmpty()) {
                    book1_.get(b).setText(linesplit[1]);
                    AddBook(linesplit[1], username);
                } else if (book2_.get(b).getText().isEmpty()) {
                    book2_.get(b).setText(linesplit[1]);
                    AddBook(linesplit[1], username);
                } else if (book3_.get(b).getText().isEmpty()) {
                    book3_.get(b).setText(linesplit[1]);
                    AddBook(linesplit[1], username);
                } else if (book4_.get(b).getText().isEmpty()) {
                    book4_.get(b).setText(linesplit[1]);
                    AddBook(linesplit[1], username);
                } else if (book5_.get(b).getText().isEmpty()) {
                    book5_.get(b).setText(linesplit[1]);
                    AddBook(linesplit[1], username);
                } else if (book6_.get(b).getText().isEmpty()) {
                    book6_.get(b).setText(linesplit[1]);
                    AddBook(linesplit[1], username);
                } else if (book7_.get(b).getText().isEmpty()) {
                    book7_.get(b).setText(linesplit[1]);
                    AddBook(linesplit[1], username);
                } else if (book8_.get(b).getText().isEmpty()) {
                    book8_.get(b).setText(linesplit[1]);
                    AddBook(linesplit[1], username);
                } else if (book9_.get(b).getText().isEmpty()) {
                    book9_.get(b).setText(linesplit[1]);
                    AddBook(linesplit[1], username);
                } else if (book10_.get(b).getText().isEmpty()) {
                    book10_.get(b).setText(linesplit[1]);
                    AddBook(linesplit[1], username);
                }
            }
        }

    }

    void ReadBook(int a) {

        do {

            String line = "";
            File file = new File(username + ".txt");
            FileReader fileReader = null;
            try {
                fileReader = new FileReader(file);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader oku = new BufferedReader(fileReader);

            String[] linesplit = null;
            try {
                while ((line = oku.readLine()) != null) {
                    String[] p = line.split("---");//BURAYI DEĞİŞTİRDİM
                    if (p[0].equals(String.valueOf(a))) {
                        linesplit = line.split("---");
                        break;
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (linesplit == (null)) {
                break;
            }

            File file2 = new File("Books\\" + linesplit[2] + ".txt");
            if (!file2.exists()) {
                try {
                    file2.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            InputStream inputStream = null;
            int b = 0;
            try {
                String address = "http://www.gutenberg.org/files/" + linesplit[2] + "/" + linesplit[2] + "-0.txt";
                URL openUrl = new URL(address);
                URLConnection httpUrlConnection = openUrl.openConnection();
                inputStream = httpUrlConnection.getInputStream();
            } catch (IOException e) {
                b = 1;
            }
            if (b == 1) {
                try {
                    String address = "http://www.gutenberg.org/files/" + linesplit[2] + "/" + linesplit[2] + "-8.txt";
                    URL openUrl = new URL(address);
                    URLConnection httpUrlConnection = openUrl.openConnection();
                    inputStream = httpUrlConnection.getInputStream();

                } catch (IOException e) {
                    b = 2;
                }
            }
            if (b == 2) {
                try {
                    String address = "http://www.gutenberg.org/files/" + linesplit[2] + "/" + linesplit[2] + ".txt";
                    URL openUrl = new URL(address);
                    URLConnection httpUrlConnection = openUrl.openConnection();
                    inputStream = httpUrlConnection.getInputStream();

                } catch (IOException e) {
                    b = 3;
                }
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line2 = "";
            lines.clear();
            try {
                while ((line2 = bufferedReader.readLine()) != null) {
                    lines.add(line2);
                }
            } catch (IOException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(file2, false);
            } catch (IOException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }

            BufferedWriter bWriter = new BufferedWriter(fileWriter);

            int a1 = 0;
            int s;
            for (s = 0; s < bookwindow.size(); s++) {
                if (bookwindow.get(s).getName().equals(username)) {
                    break;
                }
            }
            bookwindow.get(s).setTitle(String.valueOf(a));
            bookwindow.get(s).setVisible(true);
            while (a1 < lines.size()) {
                //bWriter.write(lines.get(a1) + "\n");
                
                read_book_area.get(s).append(lines.get(a1) + "\n");
                a1++;
            }
            read_form.setCaretPosition(Integer.parseInt(linesplit[3]));
        } while (false);
    }

    public static void AddBook(String k, String name) {
        int a;
        for (a = 0; a < shelf.size(); a++) {
            if (shelf.get(a).getName().equals(name)) {
                break;
            }
        }
        bks = 0;
        for (int b = 0; b < shelf.get(a).getSize(); b++) {
            if (shelf.get(a).getBooks(b).getName().equals(k)) {
                bks = 1;
            }

        }
        if (bks == 0) {
            shelf.get(a).BookList.add(new Book(k));
        } else {
            jTextArea1.setText("");
            jTextArea1.append("Can not add same book again.");
        }

    }

    void removeBook(JTextField a, int g) {
        rem.clear();
        int b;
        for (b = 0; b < pages.size(); b++) {
            if (username.equals(pages.get(b).getName())) {
                break;
            }
        }
        do {
            if (a.getText().isEmpty()) {
                break;
            }
            File file = new File(username + ".txt");
            String line = "";
            FileReader fileReader = null;
            try {
                fileReader = new FileReader(file);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader oku = new BufferedReader(fileReader);

            String[] linesplit;
            try {
                while ((line = oku.readLine()) != null) {
                    linesplit = line.split("---");
                    rem.add(line);
                }
            } catch (IOException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                rem.remove(g);
            } catch (Exception e) {
                break;
            }

            int v = 0;
            while (v < rem.size()) {
                String[] sp = rem.get(v).split("---", 2);
                sp[0] = String.valueOf(v + 1);

                rem.set(v, sp[0] + "---" + sp[1]);
                v++;
            }
            String liste = "";
            for (int j = 0; j < rem.size(); j++) {
                liste = liste + rem.get(j) + "\n";
            }

            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(file, false);
            } catch (IOException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
            try ( BufferedWriter bWriter = new BufferedWriter(fileWriter)) {
                bWriter.write(liste);
            } catch (IOException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }

            JTextField f1 = book1_.get(b);
            JTextField f2 = book2_.get(b);
            JTextField f3 = book3_.get(b);
            JTextField f4 = book4_.get(b);
            JTextField f5 = book5_.get(b);
            JTextField f6 = book6_.get(b);
            JTextField f7 = book7_.get(b);
            JTextField f8 = book8_.get(b);
            JTextField f9 = book9_.get(b);
            JTextField f10 = book10_.get(b);

            if (f1 == a) {
                f1.setText(f2.getText());
                f2.setText(f3.getText());
                f3.setText(f4.getText());
                f4.setText(f5.getText());
                f5.setText(f6.getText());
                f6.setText(f7.getText());
                f7.setText(f8.getText());
                f8.setText(f9.getText());
                f9.setText(f10.getText());
                f10.setText("");
            } else if (f2 == a) {
                f2.setText(f3.getText());
                f3.setText(f4.getText());
                f4.setText(f5.getText());
                f5.setText(f6.getText());
                f6.setText(f7.getText());
                f7.setText(f8.getText());
                f8.setText(f9.getText());
                f9.setText(f10.getText());
                f10.setText("");
            } else if (f3 == a) {
                f3.setText(f4.getText());
                f4.setText(f5.getText());
                f5.setText(f6.getText());
                f6.setText(f7.getText());
                f7.setText(f8.getText());
                f8.setText(f9.getText());
                f9.setText(f10.getText());
                f10.setText("");
            } else if (f4 == a) {
                f4.setText(f5.getText());
                f5.setText(f6.getText());
                f6.setText(f7.getText());
                f7.setText(f8.getText());
                f8.setText(f9.getText());
                f9.setText(f10.getText());
                f10.setText("");
            } else if (f5 == a) {
                f5.setText(f6.getText());
                f6.setText(f7.getText());
                f7.setText(f8.getText());
                f8.setText(f9.getText());
                f9.setText(f10.getText());
                f10.setText("");
            } else if (f6 == a) {
                f6.setText(f7.getText());
                f7.setText(f8.getText());
                f8.setText(f9.getText());
                f9.setText(f10.getText());
                f10.setText("");
            } else if (f7 == a) {
                f7.setText(f8.getText());
                f8.setText(f9.getText());
                f9.setText(f10.getText());
                f10.setText("");
            } else if (f8 == a) {
                f8.setText(f9.getText());
                f9.setText(f10.getText());
                f10.setText("");
            } else if (f9 == a) {
                f9.setText(f10.getText());
                f10.setText("");
            } else if (f10 == a) {
                f10.setText("");
            }
        } while (false);

    }

    public static void searchBook(String name, String field) throws IOException {
        int j;
        for (j = 0; j < pages.size(); j++) {
            if (name.equals(pages.get(j).getName())) {
                break;
            }
        }
        String K = field;

        AramaSonuçları.clear();
        AramaSonuçları_numbers.clear();

        int a = 0;
        String[] arama = null;
        if (K.contains(" ")) {
            arama = K.split(" ");
            a = arama.length;
        }

        String list = "https://www.gutenberg.org/ebooks/search/?query=";

        for (int i = 0; i < a; i++) {
            list = list + arama[i];
            if (i != a - 1) {
                list = list + "+";
            }
        }

        if (a == 0) {
            list = list + K;
        }

        list = list + "&submit_search=Go%21";

        StringBuilder htmlText = new StringBuilder();

        try {
            URL openUrl = new URL(list);
            URLConnection connection = openUrl.openConnection();

            // şimdi buradan gelen verileri bir inputStream nesnesine alacağız
            InputStream is = connection.getInputStream();

            InputStreamReader isReader = new InputStreamReader(is, "UTF-8"); // bazı karakterlerin düzgün çıkması için UTF-8 seçtik
            int gelenData = 0;
            do {
                gelenData = isReader.read();

                if (gelenData != -1) { // -1 olunda okumanın sonuna yani dosyanın sonuna geldiğimizi ifade ediyor.
                    
                    htmlText.append((char) gelenData);
                }

            } while (gelenData != -1);

        } catch (MalformedURLException e) {
        } catch (IOException e) {
        }

        // böylece web sayfasının kaynak kodlarını çekmiş olduk .
        // Projemizi biraz daha ileri götürelim ve regularExpression kullanarak
        // Kaynak kodları içinde istediğimiz etiketler arasındaki verileri alalım
        String regexPattern = "(<span class=\"title\">)(.*?)(</span>)";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(htmlText);

        String regexPattern2 = "(<a class=\"link\" href=\"/ebooks/)(.*?)(\" accesskey=)";
        Pattern pattern2 = Pattern.compile(regexPattern2);
        Matcher matcher2 = pattern2.matcher(htmlText);

        while (matcher.find()) {
            if ("No records found.".equals(matcher.group(2))) {
                search_area.get(j).setText("");
                search_area.get(j).append("No records found.\n");
                break;
            }
            if (matcher.group(2).contains("Did you mean: ")) {
                break;
            }

            if ("Bookshelves".equals(matcher.group(2))) {
                continue;
            }

            if ("Authors".equals(matcher.group(2))) {
                continue;
            }
            if ("Subjects".equals(matcher.group(2))) {
                continue;
            }
            if ("Sort Alphabetically".equals(matcher.group(2))) {
                continue;
            }
            if ("Sort by Release Date".equals(matcher.group(2))) {
                continue;
            }
            AramaSonuçları.add(matcher.group(2));//kitapların isimleri

        }
        while (matcher2.find()) {
            AramaSonuçları_numbers.add(matcher2.group(2));//kitapların id leri geliyor
        }
        for (int n = 0; n < AramaSonuçları_numbers.size() - AramaSonuçları.size(); n++) {// 0-- 4
            AramaSonuçları_numbers.set(n, null);
        }
        for (int n = 0; n < AramaSonuçları_numbers.size(); n++) {
            AramaSonuçları_numbers.remove(null);
        }
        search_area.get(j).setText("");
        for (int c = 0; c < pages.size(); c++) {
            if (users.get(j).username.equals(pages.get(c).getName())) {
                if (AramaSonuçları_numbers.isEmpty() || AramaSonuçları.isEmpty()) {
                    search_area.get(j).append("Not found.");
                    break;
                }

                for (int say = 0; say < AramaSonuçları_numbers.size(); say++) {
                    search_area.get(j).append("Numbers: " + AramaSonuçları_numbers.get(say) + "↓↓↓\nNames: " + AramaSonuçları.get(say) + "\n");
                    search_button.get(j).setText("");
                }
            }
        }

    }
}
