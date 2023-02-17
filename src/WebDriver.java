public interface WebDriver {

    void open();
    void close();
    String getTitle();
}
 interface RemoteWebDriverInterface extends WebDriver {
    void navigate();
}
interface TakesScreenShot extends RemoteWebDriverInterface {
    void getScreenshot();


}
class ChromeDriver implements RemoteWebDriverInterface{
    @Override
    public void navigate() {

    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }
}
class FirefoxDriver implements RemoteWebDriverInterface{
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {

    }
}
class SafariDriver implements RemoteWebDriverInterface{
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {

    }
}
