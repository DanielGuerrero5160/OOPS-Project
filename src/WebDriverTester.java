public class WebDriverTester {

    public static void main(String[] args) {
            RemoteWebDriverInterface[] rwdArr={new ChromeDriver(),new SafariDriver(),new FirefoxDriver()};
            for (RemoteWebDriverInterface x:rwdArr){
                x.open();
                x.close();
                x.navigate();
                System.out.println(x.getTitle());
                x.getScreenshot();
                System.out.println("****Next Object****");
            }


        }


    }

