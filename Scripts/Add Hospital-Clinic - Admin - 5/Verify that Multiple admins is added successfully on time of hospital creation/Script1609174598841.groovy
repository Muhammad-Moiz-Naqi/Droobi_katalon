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

WebUI.callTestCase(findTestCase('Login - 1/Login with valid creds - C1'), [('user_name') : GlobalVariable.Username, ('password') : GlobalVariable.Password
        , ('url') : GlobalVariable.URL], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Add multiple admins/Page_Droobi Admin Portal/button_Add Hospital'))

WebUI.click(findTestObject('Object Repository/Add multiple admins/Page_Droobi Admin Portal/div_Hospital Name_ant-form-item-control'))

WebUI.setText(findTestObject('Object Repository/Add multiple admins/Page_Droobi Admin Portal/input_Hospital Name_name'), 
    'Test Hospital 1')

WebUI.setText(findTestObject('Object Repository/Add multiple admins/Page_Droobi Admin Portal/textarea_ABC Street, 123 roa'), 
    'ABC Street, 123 road')

WebUI.click(findTestObject('Object Repository/Add multiple admins/Page_Droobi Admin Portal/span_Droobi Diabetes educators'))

WebUI.click(findTestObject('Object Repository/Add multiple admins/Page_Droobi Admin Portal/span_Droobi Doctor'))

WebUI.click(findTestObject('Object Repository/Add multiple admins/Page_Droobi Admin Portal/input_Droobi Diabetes educators_ant-checkbox-input'))

WebUI.click(findTestObject('Object Repository/Add multiple admins/Page_Droobi Admin Portal/input_Droobi Diabetes educators_ant-checkbox-input'))

WebUI.setText(findTestObject('Object Repository/Add multiple admins/Page_Droobi Admin Portal/input_Primary Hospital Admin_ant-input'), 
    'Test Admin 1')

Random rnd = new Random()

ran_no = (1 + rnd.nextInt(100))

def email = ('moiznaqi+' + ran_no) + '@venturedive.com'

WebUI.setText(findTestObject('Add multiple admins/Page_Droobi Admin Portal/Admin email 0'), email)

WebUI.click(findTestObject('Object Repository/Add multiple admins/Page_Droobi Admin Portal/button_ Add Another Admin'))

WebUI.setText(findTestObject('Object Repository/Add multiple admins/Page_Droobi Admin Portal/input_Primary Hospital Admin_ant-input'), 
    'Test Admin 2')

WebUI.setText(findTestObject('Add multiple admins/Page_Droobi Admin Portal/Admin email 1'), email)

WebUI.click(findTestObject('Object Repository/Add multiple admins/Page_Droobi Admin Portal/button_Add Hospital  Invite Admin(s)'))

WebUI.closeBrowser()

