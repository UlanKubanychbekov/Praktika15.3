package peaksoft;

public class Main {

    public static void main(String[] args) {


        OnlineBook onlineBook = new OnlineBook("Успех в тебе","David Hokins", 3000,"Психология",240);
        System.out.print(onlineBook);
        onlineBook.read();


        AudioBook audioBook = new AudioBook("Охота на овец", "Haruki Murakami", 2500, "Роман","11:29:00");
        System.out.print(audioBook);
        audioBook.listen();


    }
}
