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

WebUI.callTestCase(findTestCase('Login - 1/Login with valid creds - C1'), [('user_name') : 'droobi.admen@gmail.com', ('password') : '/5S6MFFLcE4ZOg6V2jhgMg=='], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Admin is able to see al pages/Health Professional Page/Page_Droobi Admin Portal/span_Hospitals'))

def Url_fetched = WebUI.getUrl()

WebUI.verifyMatch(Url_fetched, 'https://uat-admin.droobihealth.net/#/hospitals', false)

WebUI.verifyElementText(findTestObject('Validation - Admin is able to see Hospital page/h1_Hospitals'), 'Hospitals', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Validation - Admin is able to see Hospital page/span_Hospitals'), 'Hospitals', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Validation - Admin is able to see Hospital page/span_Doctors'), 'Doctors', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Validation - Admin is able to see Hospital page/span_Educators'), 'Educators', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Validation - Admin is able to see Hospital page/span_Dietitians'), 'Dietitians', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Validation - Admin is able to see Hospital page/span_Users'), 'Users', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Validation - Admin is able to see Hospital page/span_Action'), 'Action', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.closeBrowser()

