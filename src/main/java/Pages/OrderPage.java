package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    private WebDriver webDriver;

    private final By nameField = By.xpath(".//input[@placeholder='* Имя']");
    private final By surnameField = By.xpath(".//input[@placeholder='* Фамилия']");
    private final By placeField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private final By metroField = By.xpath(".//input[@placeholder ='* Станция метро']");
    private final By chooseMetroField = By.xpath(".//button[@value='1']//div[text()='Бульвар Рокоссовского']");
    private final By phoneField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private final By nextButton = By.xpath(".//div[@class='Order_NextButton__1_rCA']//button[text()='Далее']");
    private final By dateField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    private final By currentDate = By.xpath(".//div[@aria-label='Choose четверг, 30-е мая 2024 г.']");
    private final By rentTerm = By.xpath(".//div[@class='Dropdown-placeholder']");
    private final By term = By.xpath(".//div[@class='Dropdown-menu']/div[text()='сутки']");
    private final By color = By.xpath(".//input[@type='checkbox']");
    private final By orderButton = By.xpath(".//div[@class='Order_Buttons__1xGrp']//button[text()='Заказать']");
    private final By yesButton = By.xpath(".//button[text()='Да']");
    private final By orderDode =By.xpath(".//div[@class='Order_ModalHeader__3FDaJ']");

    public By getName(){return nameField;}
    public By getSurname(){return surnameField;}
    public By getPlace(){return placeField;}
    public By getMetro(){return metroField;}
    public By getChooseMetro(){return chooseMetroField;}
    public By getPhone(){return phoneField;}
    public By getNextButton(){return nextButton;}
    public By getDateField(){return dateField;}
    public By getCurrentDate(){return currentDate;}
    public By getRentTerm(){return rentTerm;}
    public By getTerm(){return term;}
    public By getColor(){return color;}
    public By getOrderButton(){return orderButton;}
    public  By getYesButton(){return yesButton;}
    public By getOrderDode(){return orderDode;}

}
