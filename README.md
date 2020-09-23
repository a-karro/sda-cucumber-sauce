### First Steps In Selenium + Cucumber + Java

Loosely based on https://www.hindsightsoftware.com/blog/cucumber-jvm-intellij

#### Setup
1. clone the repository with `git clone git@github.com/a-karro/sda-cucumber-sauce`
2. Make sure you have Chrome web browser installed on your computer
3. Check the version of your Chrome browser
4. Download the chromedriver executable from https://chromedriver.chromium.org/home. Choose the version that matches the major version of your Chrome browser, e.g., if your browser version starts with 86., you should download chromedriver v 86.
5. Unzip the download. You should see `chromedriver.exe` on Windows or `chromedriver` on macOS
6. On mac:
    * start Terminal
    * change the directory to the one where you unzipped your chromedriver
    * exec this command: `xattr -d com.apple.quarantine chromedriver`. It may ask for your admin password.
    * More info: https://stackoverflow.com/questions/60362018/macos-catalinav-10-15-3-error-chromedriver-cannot-be-opened-because-the-de
7. Open the cloned project in the IntelliJ Idea
8. Open the file: `src/test/java/stepdefs/BaseSteps.java`
9. Edit the line with `System.setProperty`, specify the location of your chromedriver instead of `c:\\temp....`
10. right click on `src/test/resoures/login.feature` and run it.


#### Useful Links

In no particular order: <br>
https://stackoverflow.com/questions/20138761/how-to-select-a-dropdown-value-in-selenium-webdriver-using-java
https://www.guru99.com/accessing-forms-in-webdriver.html
https://www.toolsqa.com/cucumber/data-tables-in-cucumber/
https://stackoverflow.com/questions/16664433/how-to-resize-current-browser-window-in-selenium-webdriver-with-java
https://www.w3schools.com/xml/xpath_intro.asp
https://www.guru99.com/find-element-selenium.html

Chrome Plugins: <br>
https://chrome.google.com/webstore/detail/xpath-helper/hgimnogjllphhhkhlmebbmlgjoejdpjl
https://chrome.google.com/webstore/detail/xpath-finder/ihnknokegkbpmofmafnkoadfjkhlogph

       _______  ___     ___________________________  ____
      / __/ _ \/ _ |   /_  __/ __/ __/_  __/ __/ _ \/ __/
     _\ \/ // / __ |    / / / _/_\ \  / / / _// , _/\ \  
    /___/____/_/ |_|   /_/ /___/___/ /_/ /___/_/|_/___/  
                                                     
                                                     