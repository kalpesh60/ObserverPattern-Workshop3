public interface IObserver {
    void onUpdate(News news);

    public NewsType getNewsType();
}
