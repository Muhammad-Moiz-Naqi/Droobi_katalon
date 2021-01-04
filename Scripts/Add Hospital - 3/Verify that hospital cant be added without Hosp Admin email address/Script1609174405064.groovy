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

WebUI.click(findTestObject('Object Repository/Add Hospital/Page_Droobi Admin Portal/button_Add Hospital'))

WebUI.verifyElementClickable(findTestObject('Add Hospital (admin) Validation/button_Add Hospital  Invite Admin(s)'))

WebUI.setText(findTestObject('Object Repository/Page_Droobi Admin Portal/input_Hospital Name_name'), 'Test Hospital')

WebUI.click(findTestObject('Object Repository/Add Hospital/Page_Droobi Admin Portal/button_Add Hospital  Invite Admin(s)'))

WebUI.verifyElementText(findTestObject('Add Hospital (admin) Validation/div_Oops. You cant add a Hospital without a Primary Admin email address'), 
    'Oops. You can’t add a Hospital without a Primary Admin email address')

WebUI.verifyElementNotClickable(findTestObject('Add Hospital (admin) Validation/button_Add Hospital  Invite Admin(s)'))

WebUI.delay(5)

WebUI.closeBrowser()

