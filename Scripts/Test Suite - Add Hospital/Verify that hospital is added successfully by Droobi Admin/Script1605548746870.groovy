import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

WebUI.callTestCase(findTestCase('Login - 1/Login with valid creds - C1'), [('user_name') : 'droobi.admen@gmail.com', ('password') : '/5S6MFFLcE4ZOg6V2jhgMg=='], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Add multiple admins/Page_Droobi Admin Portal/button_Add Hospital'))

WebUI.setText(findTestObject('Object Repository/Page_Droobi Admin Portal/input_Hospital Name_name'), Hospital_Name)

WebUI.setText(findTestObject('Object Repository/Page_Droobi Admin Portal/textarea_ABC road , 123 Stree'), 'ABC road , 123 Street')

WebUI.click(findTestObject('Object Repository/Page_Droobi Admin Portal/span_Droobi Diabetes educators'))

WebUI.click(findTestObject('Object Repository/Page_Droobi Admin Portal/span_Droobi Doctor'))

WebUI.click(findTestObject('Object Repository/Page_Droobi Admin Portal/input_Droobi Doctor_ant-checkbox-input'))

WebUI.click(findTestObject('Object Repository/Page_Droobi Admin Portal/span_Droobi Dietitians'))

WebUI.setText(findTestObject('Object Repository/Page_Droobi Admin Portal/input_Primary Hospital Admin_ant-input'), 'Test Admin 1')

int ran_no

ran_no = (Math.random() * 500)

WebUI.setText(findTestObject('Object Repository/Page_Droobi Admin Portal/input_Email Address_email0'), ('moiz.naqi+' + ran_no) + 
    '@venturedive.com')

WebUI.click(findTestObject('Object Repository/Page_Droobi Admin Portal/button_Add Hospital  Invite Admin(s)'))

WebUI.closeBrowser()

