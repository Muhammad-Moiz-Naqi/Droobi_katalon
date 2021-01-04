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

WebUI.callTestCase(findTestCase('Login - 1/Login with valid creds - C1'), [('user_name') : 'droobi.admen@gmail.com', ('password') : '/5S6MFFLcE4ZOg6V2jhgMg=='], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Add health Professional dfrom admin portal/li_Health Professionals'))

WebUI.click(findTestObject('Object Repository/Add health Professional dfrom admin portal/button_Add Health Professional'))

WebUI.click(findTestObject('Object Repository/Add health Professional dfrom admin portal/button_Send Invitation'))

WebUI.verifyElementText(findTestObject('Add Health Professional (admin) Validation/div_Oops. You cant add a Health Professional without selecting the Type'), 
    'Oops. You can’t add a Health Professional without selecting the Type.')

WebUI.verifyElementText(findTestObject('Add Health Professional (admin) Validation/div_Please enter the name of the Health Professional'), 
    'Please enter the name of the Health Professional')

WebUI.verifyElementText(findTestObject('Add Health Professional (admin) Validation/div_Language is required'), 'Language is required')

WebUI.verifyElementText(findTestObject('Add Health Professional (admin) Validation/div_Oops. You cant add a Health Professional without an Email Address'), 
    'Oops. You can’t add a Health Professional without an Email Address.')

WebUI.verifyElementText(findTestObject('Add Health Professional (admin) Validation/div_Oops. You cant add a Health Professional without specifying their Capacity'), 
    'Oops. You can’t add a Health Professional without specifying their Capacity.')

WebUI.delay(5)

WebUI.closeBrowser()

