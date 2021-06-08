import java.util.ArrayList;

public class CentralAajTak {
    ArrayList<IObserver> dataList = new ArrayList<>();

    public void register(IObserver instance) {
        dataList.add(instance);
    }

    public void update(News news) {
        dataList.stream()
                .filter(object -> object.getNewsType().equals(news.getNewsType()))
                .forEach(object -> object.onUpdate(news));
    }
}
