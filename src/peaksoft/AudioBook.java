package peaksoft;

public class AudioBook extends  Book{

    private String duration;

    public AudioBook(String name, String avtor, int price, String genre, String duration) {
        super(name, avtor, price, genre);
        this.duration = duration;
    }

    public void listen (){
        System.out.println(" Глаза не устают от бумаги или экрана. "+"Удобно");

    }@Override
    public String toString(){
        return "Название книги: "+getName()+"\nАвтор: "+getAvtor()+"\nЦена: "+getPrice()+" сом \nЖанр: "+getGenre()+"\nВремя звучания:" +duration+"\nB чем плюс? -";
    }


    }

