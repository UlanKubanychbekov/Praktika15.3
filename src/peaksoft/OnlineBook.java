package peaksoft;

public class OnlineBook extends Book{
    int  page;


    public OnlineBook(String name, String avtor, int price, String genre, int page) {
        super(name, avtor, price, genre);
        this.page = page;
    }
    public void read(){
        System.out.println("Электронную книгу можно читать в разных форматах и с разных устройств, заходишь в образ");
    }

    @Override
    public String toString() {
        return "Название книги: "+getName()+"\nАвтор: "+getAvtor()+"\nЦена: "+getPrice()+" сом \nЖанр: "+getGenre()+"\nКоличество страниц: "+page+"\n"+"В чем плюс: ";
    }
}
