import factory.*;

public class Main {
    public static void main(String args[]){
        String classname = "listfactory.ListFactory";
        Factory factory = Factory.getFactory(classname);

        Link baidu = factory.createLink("baidu", "www.baidu.com");
        Link google = factory.createLink("google", "www.google.com");

        Link zhihu = factory.createLink("zhihu", "www.zhihu.com");
        Link douban = factory.createLink("douban", "www.douban.com");

        Tray traysearch = factory.createTray("Search");
        traysearch.add(baidu);
        traysearch.add(google);

        Tray traysocial = factory.createTray("Social");
        traysocial.add(zhihu);
        traysocial.add(douban);

        Page page = factory.createPage("LinkPage", "frank");
        page.add(traysearch);
        page.add(traysocial);

        page.output();
    }
}
