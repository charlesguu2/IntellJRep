package Class22;

public class WebDriverTester {
    public static void main(String[] args) {
       /* Safari safari = new Safari();
        safari.startBrowser();
        safari.test();
        safari.closeBrowser();

        Chrome chrome = new Chrome();
        chrome.startBrowser();
        chrome.test();
        chrome.closeBrowser();

        FireFox firefox = new FireFox();
        firefox.startBrowser();
        firefox.test();
        firefox.closeBrowser();

        */

        /*Chrome chrome = new Chrome();
        FireFox firefox = new FireFox();
        Safari safari = new Safari();

         */

         /* Creating objects of all Child classes and storing them into an array of
         type WebDriver we can do this because upcasting allows us too
          */

        WebDriver[] browsers={new Chrome(), new FireFox(), new Safari()};
        for(WebDriver browser : browsers){
            browser.startBrowser();
            browser.test();
            browser.closeBrowser();
        }

        for (int i = 0; i < browsers.length; i++) {
            browsers[i].startBrowser();
            browsers[i].test();
            browsers[i].closeBrowser();


        }
    }
}