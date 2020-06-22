package com.pages.Irctc;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.Irctc.Autoconstants;
import com.generics.Irctc.BasePage;
import com.generics.Irctc.ExcelLibrary;



public class POMRegistrationPage extends BasePage implements Autoconstants{


	@FindBy(xpath="//button[.='Ok']")
	private WebElement alertOkButton;
	
	@FindBy(id="userName")
	private WebElement userNameTextField;
	
	@FindBy(id="usrPwd")
	private WebElement passwordTextField;
	
	@FindBy(id="cnfUsrPwd")
	private WebElement confirmPswdTextField;
	
	@FindBy(xpath="//label[.='Select Security Question']")
	private WebElement securityQuestionDDList;
	
	@FindBy(xpath="//input[@placeholder='Security Answer']")
	private WebElement securityAnswerTextfield;
	
	@FindBy(xpath="//label[.='Select Preferred Language']")
	private WebElement preferredLanguageDDList;
	
	@FindBy(id="firstName")
	private WebElement firstNameTextField;
	
	@FindBy(id="middleName")
	private WebElement middleTextField;
	
	@FindBy(id="lastname")
	private WebElement lastNameTextField;
	
	@FindBy(xpath="//input[@ value='M'])[1]")
	private WebElement maleRadioButton;
	
	@FindBy(id="F")
	private WebElement femaleRadioButton;
	
	@FindBy(id="T")
	private WebElement transgenderRadioButton;
	
	@FindBy(xpath="//span[@ class='ng-tns-c11-6 ui-calendar']")
	private WebElement dateOfBirthCalenderPoPUp;
	
	@FindBy(xpath="//a[.='7']")
	private WebElement dobDatePick;
	
	@FindBy(xpath="//label[.='Select Occupation']")
	private WebElement selectOccupationDDList;
	
	@FindBy(xpath="(//input[@ value='M'])[2]")
	private WebElement marriedRadioButton;
	
	@FindBy(xpath="//input[@ value='U']")
	private WebElement unmarriedRadioButton;
	
	@FindBy(xpath="//select[@formcontrolname='resCountry']")
	private WebElement selectCountryDDList;
	
	@FindBy(id="email")
	private WebElement emailTextField;
	
	@FindBy(id="mobile")
	private WebElement iSDMobileTextField;
	
	@FindBy(xpath="//select[@formcontrolname='nationality']")
	private WebElement selectNationalityDDList;
	
	@FindBy(xpath="//textarea[@placeholder='Flat/Door/Block No.']")
	private WebElement flatDoorBlockNoTextField;
	
	@FindBy(xpath="//textarea[@placeholder='Street/Lane (Optional)']")
	private WebElement streetLaneOptionalTextField;
	
	@FindBy(xpath="//textarea[@placeholder='Area/Locality (Optional)']")
	private WebElement areaLocalityOptionalTextField;
	
	@FindBy(xpath="//input[@placeholder='Pin code']")
	private WebElement pinCodeTextField;
	
	@FindBy(xpath="//input[@placeholder='State']")
	private WebElement stateTextField;
	
	@FindBy(xpath="//select[.='Select city']")
	private WebElement selectCityTownDDList;
	
	@FindBy(xpath="//select[.='Select a Post Office']")
	private WebElement selectPostOfficeDDList;
	
	@FindBy(xpath="//input[@placeholder='Phone ']")
	private WebElement phoneTextField;
	
	@FindBy(xpath="(//input[@value='Y'])[2]")
	private WebElement copyResidenscetoOfficeYesRadioButton;
	
	@FindBy(xpath="//input[@value='N']")
	private WebElement copyResidensceToOfficeNoRadioButton;
	
	@FindBy(xpath="//div[@class='recaptcha-checkbox-border']")
	private WebElement recaptchaCheckBox;
	
	@FindBy(xpath="//input[@class='ng-touched ng-dirty ng-valid']")
	private WebElement termsConditionsCheckBox;
	
	@FindBy(xpath="//b[.='Back']")
	private WebElement backButton;
	
	@FindBy(xpath="//b[.='REGISTER']")
	private WebElement registerButton;
	
	public POMRegistrationPage(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
	public void userRegistration() throws IOException, InterruptedException
	{
		alertOkButton.click();
		userNameTextField.sendKeys(ExcelLibrary.getcellValue(excel_path, sheet_name, 1, 0));
		passwordTextField.sendKeys(ExcelLibrary.getcellValue(excel_path, sheet_name, 1, 1));
		confirmPswdTextField.sendKeys(ExcelLibrary.getcellValue(excel_path, sheet_name, 1, 2));
		//selectByVisibleText(securityQuestionDDList, "What is your pet name?");
		securityAnswerTextfield.sendKeys(ExcelLibrary.getcellValue(excel_path, sheet_name, 1, 3));
		//selectByVisibleText(preferredLanguageDDList, "English");
		firstNameTextField.sendKeys(ExcelLibrary.getcellValue(excel_path, sheet_name, 1, 4));
		middleTextField.sendKeys(ExcelLibrary.getcellValue(excel_path, sheet_name, 1, 5));
		lastNameTextField.sendKeys(ExcelLibrary.getcellValue(excel_path, sheet_name, 1, 6));
		femaleRadioButton.click();
		dateOfBirthCalenderPoPUp.click();
		dobDatePick.click();
		//selectByVisibleText(selectOccupationDDList,"PROFFESSIONAL");
		marriedRadioButton.click();
		selectByVisibleText(selectCountryDDList, "India");
		emailTextField.sendKeys(ExcelLibrary.getcellValue(excel_path, sheet_name, 1, 7));
		iSDMobileTextField.sendKeys(ExcelLibrary.getcellValue(excel_path, sheet_name, 1, 8));
		selectByVisibleText(selectNationalityDDList, "India");
		flatDoorBlockNoTextField.sendKeys(ExcelLibrary.getcellValue(excel_path, sheet_name, 1, 9));
		streetLaneOptionalTextField.sendKeys(ExcelLibrary.getcellValue(excel_path, sheet_name, 1, 10));
		areaLocalityOptionalTextField.sendKeys(ExcelLibrary.getcellValue(excel_path, sheet_name, 1, 11));
		pinCodeTextField.sendKeys(ExcelLibrary.getcellValue(excel_path, sheet_name, 1, 12));
		stateTextField.sendKeys(ExcelLibrary.getcellValue(excel_path, sheet_name, 1, 13));
		selectByVisibleText(selectCityTownDDList, "Bangalore"); //?
		//selectByVisibleText(selectPostOfficeDDList, "");//?
		phoneTextField.sendKeys(ExcelLibrary.getcellValue(excel_path, sheet_name, 1, 14));
		copyResidenscetoOfficeYesRadioButton.click();
		//recaptchaCheckBox.click();
		Thread.sleep(1000);
		//termsConditionsCheckBox.click();
		backButton.click();
		//registerButton.click();
		

	}
}

