package general

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class checkOutFlow {
	@Keyword
	def login(TestObject usernameField, TestObject passwordField, TestObject loginButton, String username, String password) {
		WebUI.waitForElementVisible(usernameField, 10)
		WebUI.click(usernameField)
		WebUI.setText(usernameField, username)

		WebUI.waitForElementVisible(passwordField, 10)
		WebUI.click(passwordField)
		WebUI.setText(passwordField, password)

		WebUI.waitForElementVisible(loginButton, 10)
		WebUI.click(loginButton)
	}
	
	@Keyword
	def addProductToCart(TestObject productButton) {
		WebUI.waitForElementVisible(productButton, 5)
		WebUI.scrollToElement(productButton, 5)
		WebUI.click(productButton)
	}
	
	@Keyword
	def addProductToCart2(TestObject productButton2) {
		WebUI.waitForElementVisible(productButton2, 5)
		WebUI.scrollToElement(productButton2, 5)
		WebUI.click(productButton2)
	}
	
	@Keyword
	def removeViaProduct(TestObject removeButton) {
		WebUI.waitForElementVisible(removeButton, 5)
		WebUI.scrollToElement(removeButton, 5)
		WebUI.click(removeButton)
	}
	
	@Keyword
	def openCart(TestObject cartIcon) {
		WebUI.waitForElementVisible(cartIcon, 5)
		WebUI.scrollToElement(cartIcon, 5)
		WebUI.click(cartIcon)
	}
	
	@Keyword
	def removeViaCart(TestObject removeButton2) {
		WebUI.waitForElementVisible(removeButton2, 5)
		WebUI.scrollToElement(removeButton2, 5)
		WebUI.click(removeButton2)
	}
	
	@Keyword
	def clickCheckout(TestObject btnCheckout) {
		WebUI.waitForElementVisible(btnCheckout, 5)
		WebUI.scrollToElement(btnCheckout, 5)
		WebUI.click(btnCheckout)
	}
	
	@Keyword
	def informationUser(TestObject firstnameField, TestObject lastnameField, TestObject postalcodeField, TestObject continueButton, 
		String firstname, String lastname, String postalcode) {
		WebUI.waitForElementVisible(firstnameField, 10)
		WebUI.click(firstnameField)
		WebUI.setText(firstnameField, firstname)

		WebUI.waitForElementVisible(lastnameField, 10)
		WebUI.click(lastnameField)
		WebUI.setText(lastnameField, lastname)
		
		WebUI.waitForElementVisible(postalcodeField, 10)
		WebUI.click(postalcodeField)
		WebUI.setText(postalcodeField, postalcode)

		WebUI.waitForElementVisible(continueButton, 10)
		WebUI.click(continueButton)
	}
	
	@Keyword
	def clickFinish(TestObject btnFinish) {
		WebUI.waitForElementVisible(btnFinish, 5)
		WebUI.scrollToElement(btnFinish, 5)
		WebUI.click(btnFinish)
	}
	
	@Keyword
	def clickCancelOverview(TestObject btnCancel) {
		WebUI.waitForElementVisible(btnCancel, 5)
		WebUI.scrollToElement(btnCancel, 5)
		WebUI.click(btnCancel)
	}
	
}
