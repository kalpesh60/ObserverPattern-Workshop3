public class Main {
    public static void main(String[] args) {

        CentralAajTak centralAajTak = new CentralAajTak();
        MumbaiAajTak mumbaiAajTak = new MumbaiAajTak();
        DelhiAajTak delhiAajTak = new DelhiAajTak();
        BizAajTak bizAajTak = new BizAajTak();

        News delhiNews = new News();
        delhiNews.setNews("Delhi has heavy rainfall yesterday");
        delhiNews.setNewsType(NewsType.DELHI_NEWS);

        News mumbaiNews = new News();
        mumbaiNews.setNews("Mumbai has heavy rainfall yesterday");
        mumbaiNews.setNewsType(NewsType.MUMBAI_NEWS);

        News bizNews = new News();
        bizNews.setNews("business");
        bizNews.setNewsType(NewsType.BIZ_NEWS);

        centralAajTak.register(mumbaiAajTak);
        centralAajTak.register(delhiAajTak);
        centralAajTak.register(bizAajTak);

        centralAajTak.update(delhiNews);
        centralAajTak.update(mumbaiNews);
        centralAajTak.update(bizNews);
    }
}
