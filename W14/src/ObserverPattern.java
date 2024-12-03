import java.util.ArrayList;
import java.util.List;

// Subject Interface
interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyObservers();
}

// Concrete Subject
class NewsAgency implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String news;

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }

    public String getNews() {
        return news;
    }

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }
}

// Observer Interface
interface Observer {
    void update();
}

// Concrete Observer
class NewsChannel implements Observer {
    private String news;

    @Override
    public void update() {
        System.out.println("Breaking News: " + news);
    }

    public void setNews(String news) {
        this.news = news;
    }
}

// Main
public class ObserverPattern{
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        NewsChannel channel1 = new NewsChannel();

        agency.attach(channel1);
        agency.setNews("The Observer Pattern Implemented!");
    }
}


