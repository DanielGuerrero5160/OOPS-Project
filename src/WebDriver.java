public interface WebDriver {

    void open();
    void close();
    String getTitle();
}
 interface RemoteWebDriverInterface extends WebDriver,TakesScreenShot {
    void navigate();
}
interface TakesScreenShot{
    void getScreenshot();


}
class ChromeDriver implements RemoteWebDriverInterface{
    @Override
    public void navigate() {
        System.out.println("Chrome is navigating");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Chrome is getting screenshot");
    }

    @Override
    public void open() {
        System.out.println("Chrome is opening");
    }

    @Override
    public void close() {
        System.out.println("Chrome is closing");
    }

    @Override
    public String getTitle() {

        return "Getting title";
    }
}
class FirefoxDriver implements RemoteWebDriverInterface{
    @Override
    public void open() {
        System.out.println("Firefox is opening");
    }

    @Override
    public void close() {
        System.out.println("Firefox is closing");
    }

    @Override
    public String getTitle() {

        return "Firefox is getting title";
    }

    @Override
    public void navigate() {
        System.out.println("Firefox is navigating");
    }

    @Override
    public void getScreenshot() {
        System.out.println("FirefoxDriver getting screenshot");
    }
}
class SafariDriver implements RemoteWebDriverInterface{
    @Override
    public void open() {
        System.out.println("Safari is opening");
    }

    @Override
    public void close() {
        System.out.println("Safari is closing");
    }

    @Override
    public String getTitle() {

        return "Safari is getting title";
    }

    @Override
    public void navigate() {
        System.out.println("Safari is navigating");
    }

    @Override
    public void getScreenshot() {

    }
}
