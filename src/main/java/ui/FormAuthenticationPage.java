package ui;

import org.openqa.selenium.By;

public class FormAuthenticationPage {

    public static By username= By.id("username");
    public static By logged= By.id("flash");
    public static By errorLogin= By.id("flash-messages");
    public static By logoutBtn= By.xpath("//i[@class='icon-2x icon-signout']");
    public static By textSecure= By.xpath("//div[@class='example']/h2");
    public static By password= By.id("password");
    public static By login= By.xpath("//button[@class='radius']");

}
