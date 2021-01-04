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

WebUI.navigateToUrl('https://test-admin.droobihealth.net/#/')

WebUI.setText(findTestObject('Validation on email and password fields - C490/input_Admin_username'), 'droobi.admen@')

WebUI.verifyNotEqual(findTestObject('Validation on email and password fields - C490/input_Admin_username'), GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Validation on email and password fields - C490/input_concat(That doesn, , t look like an e_b4ea4e'), 
    'kl9oNcYHWic=')

WebUI.verifyNotEqual(findTestObject('Validation on email and password fields - C490/input_concat(That doesn, , t look like an e_b4ea4e'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('Validation on email and password fields - C490/button_Continue'))

WebUI.setText(findTestObject('Validation on email and password fields - C490/input_Admin_username'), 'droobi.admen@gmail.com')

WebUI.verifyNotEqual(findTestObject('Validation on email and password fields - C490/input_Admin_username'), GlobalVariable.Username)

WebUI.click(findTestObject('Validation on email and password fields - C490/form_Continue'))

WebUI.click(findTestObject('Validation on email and password fields - C490/button_Continue'))

WebUI.delay(5)

