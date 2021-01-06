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

def rand = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(3)

WebUI.click(findTestObject('Object Repository/Page_Droobi Hospital Portal/button_Add Health professional'))

WebUI.scrollToElement(findTestObject('Page_Droobi Hospital Portal/h1_New Health Professional'), 3)

WebUI.click(findTestObject('Object Repository/Page_Droobi Hospital Portal/div_Select Health Professional'))

WebUI.click(findTestObject('Object Repository/Page_Droobi Hospital Portal/li_Doctor'))

WebUI.setText(findTestObject('Object Repository/Page_Droobi Hospital Portal/input_Name_name'), GlobalVariable.G_healthcoach + 
    rand)

def G_getname = WebUI.getText(findTestObject('Page_Droobi Hospital Portal/input_Name_name'))

WebUI.click(findTestObject('Object Repository/Page_Droobi Hospital Portal/input_Arabic_ant-radio-input'))

WebUI.setText(findTestObject('Object Repository/Page_Droobi Hospital Portal/input_Email Address_email'), (GlobalVariable.G_healthcoach + 
    rand) + '@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Droobi Hospital Portal/input_Capacity_capacity'), '100')

WebUI.click(findTestObject('Object Repository/Page_Droobi Hospital Portal/button_Send Invitation'))

WebUI.click(findTestObject('Object Repository/Page_Droobi Hospital Portal/button_Done'))

WebUI.setText(findTestObject('Object Repository/Page_Droobi Hospital Portal/input_Add Health professional_ant-input'), GlobalVariable.G_getname)

WebUI.scrollToElement(findTestObject('Page_Droobi Hospital Portal/button_Search'), 0)

WebUI.sendKeys(findTestObject('Page_Droobi Hospital Portal/button_Search'), Keys.chord(Keys.ENTER))

WebUI.verifyTextPresent(GlobalVariable.G_getname, true)

WebUI.delay(2)

