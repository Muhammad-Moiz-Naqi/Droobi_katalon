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

WebUI.navigateToUrl('https://uat-hospital.droobihealth.net/#/')

WebUI.setText(findTestObject('Object Repository/Page_Droobi Hospital Portal/input_Hospital_username (14)'), 'droobi.hospital01@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Droobi Hospital Portal/input_Hospital_password (14)'), '/5S6MFFLcE4ZOg6V2jhgMg==')

WebUI.click(findTestObject('Page_Droobi Hospital Portal/button_Continue'))

WebUI.click(findTestObject('Page_Droobi Hospital Portal/span_Health Professionals'))

WebUI.setText(findTestObject('Object Repository/Page_Droobi Hospital Portal/input_Add Health professional_ant-input (3)'), 
    professional)

WebUI.click(findTestObject('Page_Droobi Hospital Portal/button_Search'))

WebUI.verifyTextPresent(professional, true)

WebUI.delay(2)

