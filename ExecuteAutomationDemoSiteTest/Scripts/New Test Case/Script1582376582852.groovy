import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://executeautomation.com/demosite/Login.html')

WebUI.setText(findTestObject('Object Repository/Page_Execute Automation/input_Login_UserName'), 
	findTestData('New Test Data For TestCase').getValue(
        "UserName", 1))

WebUI.setText(findTestObject('Object Repository/Page_Execute Automation/input_Login_Password'), 
	findTestData('New Test Data For TestCase').getValue(
		"Password", 1))

WebUI.click(findTestObject('Object Repository/Page_Execute Automation/input_Login_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Execute Automation/select_SelectMrMs'), '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Execute Automation/input_Initial_Initial'), 
	findTestData('New Test Data For TestCase').getValue(
		"Initial", 1))

WebUI.setText(findTestObject('Object Repository/Page_Execute Automation/input__FirstName'), 
	findTestData('New Test Data For TestCase').getValue(
		"FirstName", 1))

WebUI.setText(findTestObject('Object Repository/Page_Execute Automation/input_Middle Name_MiddleName'), 
	findTestData('New Test Data For TestCase').getValue(
		"LastName", 1))

WebUI.click(findTestObject('Object Repository/Page_Execute Automation/td_English Hindi'))

WebUI.click(findTestObject('Object Repository/Page_Execute Automation/input_EnglishHindi_Hindi'))

WebUI.click(findTestObject('Object Repository/Page_Execute Automation/input_EnglishHindi_Save'))

WebUI.click(findTestObject('Object Repository/Page_Execute Automation/a_HtmlPopup'))

WebUI.switchToWindowIndex(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Popup Window/select_SelectMrMs'), '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Popup Window/input_Initial_Initial'), 
		findTestData('New Test Data For TestCase').getValue(
		"Initial", 2))

WebUI.setText(findTestObject('Object Repository/Page_Popup Window/input__FirstName'), 
		findTestData('New Test Data For TestCase').getValue(
		"FirstName", 2))

WebUI.setText(findTestObject('Object Repository/Page_Popup Window/input_Middle Name_MiddleName'), 'Supriyono')

WebUI.setText(findTestObject('Object Repository/Page_Popup Window/input__LastName'), 
		findTestData('New Test Data For TestCase').getValue(
		"LastName", 2))

WebUI.click(findTestObject('Object Repository/Page_Popup Window/span_Gender     Male Female'))

WebUI.click(findTestObject('Object Repository/Page_Popup Window/input_GenderMaleFemale_Female'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Popup Window/select_SelectIndiaUSASingaporeUK'), '3', true)

WebUI.click(findTestObject('Object Repository/Page_Popup Window/input_Country_Save'))

// To Switch to an Original Window
WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/Page_Execute Automation/input_Click for Generating JavaScript Alert_8072d0'))

