public class WebPage implements Clasament {
    private String URL;
    private static double users; // number of users

    public void getRanking(){
        if(users > 10000)
            System.out.println("Compania este in top 3");
    }

    public WebPage(String URL) {
        this.URL = URL;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
