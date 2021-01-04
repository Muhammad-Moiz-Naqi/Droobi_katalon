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

WebUI.click(findTestObject('Object Repository/Admin is able to see al pages/Refferal codes/li_Users (Patients)'))

def Url_fetched = WebUI.getUrl()

WebUI.verifyMatch(Url_fetched, 'https://uat-admin.droobihealth.net/#/users', false)

WebUI.verifyElementText(findTestObject('Validation - Admin s able to see Users(Patients)/span_Users'), 'Users', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Validation - Admin s able to see Users(Patients)/span_Health Professionals'), 'Health Professionals', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Validation - Admin s able to see Users(Patients)/span_Registered With'), 'Registered With', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Validation - Admin s able to see Users(Patients)/span_Condition'), 'Condition', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Validation - Admin is able to see Health Professional/span_Status'), 'Status', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.closeBrowser()

