public class WebDriverTester {

    public static void main(String[] args) {
        ChromeDriver cd=new ChromeDriver();
        cd.close();
        cd.getTitle();
        cd.navigate();
        cd.open();

        FirefoxDriver fd=new FirefoxDriver();
        fd.close();
        fd.open();
        fd.getTitle();
        fd.navigate();
        SafariDriver sd=new SafariDriver();
        sd.close();
        sd.open();
        sd.getTitle();
        sd.navigate();


    }
}
