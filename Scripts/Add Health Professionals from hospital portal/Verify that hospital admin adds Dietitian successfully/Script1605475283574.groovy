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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test-hospital.droobihealth.net/#/')

WebUI.setText(findTestObject('Object Repository/Page_Droobi Hospital Portal/input_Hospital_username'), 'droobi.hospital01@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Droobi Hospital Portal/form_Continue'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Droobi Hospital Portal/input_Hospital_password'), '/5S6MFFLcE4ZOg6V2jhgMg==')

WebUI.click(findTestObject('Object Repository/Page_Droobi Hospital Portal/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Droobi Hospital Portal/li_Health Professionals'))

WebUI.click(findTestObject('Object Repository/Page_Droobi Hospital Portal/button_Add Health professional'))

WebUI.click(findTestObject('Object Repository/Page_Droobi Hospital Portal/div_Select Health Professional'))

WebUI.click(findTestObject('Object Repository/Page_Droobi Hospital Portal/li_Dietitian'))

WebUI.click(findTestObject('Object Repository/Page_Droobi Hospital Portal/span_English'))

WebUI.setText(findTestObject('Object Repository/Page_Droobi Hospital Portal/input_Name_name'), 'Test Dietitian')

int ran_no

ran_no = (Math.random() * 500)

WebUI.setText(findTestObject('Object Repository/Page_Droobi Hospital Portal/input_Email Address_email'), ('moiz.naqi+' + 
    ran_no) + '@venturedive.com')

WebUI.setText(findTestObject('Object Repository/Page_Droobi Hospital Portal/input_Capacity_capacity'), '4')

WebUI.click(findTestObject('Object Repository/Page_Droobi Hospital Portal/button_Send Invitation'))

WebUI.closeBrowser()

