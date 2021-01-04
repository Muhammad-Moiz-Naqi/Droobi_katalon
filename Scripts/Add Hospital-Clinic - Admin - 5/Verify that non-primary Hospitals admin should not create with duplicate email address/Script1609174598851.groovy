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
import org.apache.commons.lang.RandomStringUtils as RandStr
import java.util.Random as Random

WebUI.callTestCase(findTestCase('Login - 1/Login with valid creds - C1'), [('user_name') : GlobalVariable.Username, ('password') : GlobalVariable.Password
        , ('url') : GlobalVariable.URL], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Droobi Admin Portal/Page_Droobi Admin Portal/button_Add Hospital'))

WebUI.setText(findTestObject('Object Repository/Page_Droobi Admin Portal/Page_Droobi Admin Portal/input_Hospital Name_name'), 
    'Test Hospital 2')

WebUI.click(findTestObject('Object Repository/Page_Droobi Admin Portal/Page_Droobi Admin Portal/span_Droobi Diabetes educators'))

WebUI.click(findTestObject('Object Repository/Page_Droobi Admin Portal/Page_Droobi Admin Portal/span_Droobi Doctor'))

WebUI.click(findTestObject('Object Repository/Page_Droobi Admin Portal/Page_Droobi Admin Portal/label_Droobi Dietitians'))

WebUI.click(findTestObject('Object Repository/Page_Droobi Admin Portal/Page_Droobi Admin Portal/label_Droobi Health Coach'))

WebUI.setText(findTestObject('Object Repository/Page_Droobi Admin Portal/Page_Droobi Admin Portal/input_Primary Hospital Admin_ant-input'), 
    'Test Admin 1')

Random rnd = new Random()

randomNumber = (1 + rnd.nextInt(5))

def email = ('moiz.naqi+' + randomNumber) + '@venturedive.com'

WebUI.setText(findTestObject('Object Repository/Page_Droobi Hospital Portal/Page_Droobi Admin Portal/input_Email Address_email0'), 
    email)

WebUI.click(findTestObject('Object Repository/Page_Droobi Hospital Portal/Page_Droobi Admin Portal/button_ Add Another Admin'))

WebUI.setText(findTestObject('Object Repository/Page_Droobi Hospital Portal/Page_Droobi Admin Portal/input_Hospital Admin_ant-input'), 
    'Non Primary Admin')

WebUI.setText(findTestObject('Object Repository/Page_Droobi Hospital Portal/Page_Droobi Admin Portal/input_Email Address_email1'), 
    email)

WebUI.click(findTestObject('Object Repository/Page_Droobi Hospital Portal/Page_Droobi Admin Portal/button_Add Hospital  Invite Admin(s)'))

WebUI.verifyEqual(findTestObject('Error Validation/Page_Droobi Admin Portal/Page_Droobi Admin Portal/span_Sorry, there is already a Hospital Admin with that email address'), 
    'Sorry, there is already a Hospital Admin with that email.')

WebUI.acceptAlert()

WebUI.delay(5)

WebUI.closeBrowser()

