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

WebUI.navigateToUrl('https://test-hospital.droobihealth.net/#/')

WebUI.setText(findTestObject('Object Repository/Page_Droobi Hospital Portal/input_Hospital_username (3)'), 'droobi.hospital01@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Droobi Hospital Portal/input_Hospital_password (3)'), '/5S6MFFLcE4ZOg6V2jhgMg==')

WebUI.click(findTestObject('Object Repository/Page_Droobi Hospital Portal/button_Continue (3)'))

WebUI.click(findTestObject('Object Repository/Page_Droobi Hospital Portal/span_Health Professionals'))

WebUI.click(findTestObject('Object Repository/Page_Droobi Hospital Portal/button_Add Health professional'))

WebUI.click(findTestObject('Object Repository/Page_Droobi Hospital Portal/span_Select Health Professional_ant-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Droobi Hospital Portal/li_Doctor'))

WebUI.setText(findTestObject('Object Repository/Page_Droobi Hospital Portal/input_Name_name'), professional)

WebUI.click(findTestObject('Object Repository/Page_Droobi Hospital Portal/input_Preferred Language_ant-radio-input'))

WebUI.setText(findTestObject('Object Repository/Page_Droobi Hospital Portal/input_Email Address_email'), email)

WebUI.setText(findTestObject('Object Repository/Page_Droobi Hospital Portal/input_Phone Number_phone'), '03214235656')

WebUI.setText(findTestObject('Object Repository/Page_Droobi Hospital Portal/input_Capacity_capacity'), '5')

WebUI.click(findTestObject('Object Repository/Page_Droobi Hospital Portal/button_Send Invitation'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Droobi Hospital Portal/input_Phone Number_phone'))

WebUI.setText(findTestObject('Object Repository/Page_Droobi Hospital Portal/input_Phone Number_phone'), '')

WebUI.click(findTestObject('Object Repository/Page_Droobi Hospital Portal/button_Send Invitation'))

WebUI.closeBrowser()

