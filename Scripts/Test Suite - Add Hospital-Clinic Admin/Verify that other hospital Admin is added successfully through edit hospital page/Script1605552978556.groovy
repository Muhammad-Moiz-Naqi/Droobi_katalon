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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Add multiple admins/Page_Droobi Admin Portal/Page_Droobi Admin Portal/div_Add HospitalHospitals (1337)Add Hospita_3c7950'))

WebUI.click(findTestObject('Object Repository/Add multiple admins/Page_Droobi Admin Portal/Page_Droobi Admin Portal/a_Edit'))

WebUI.click(findTestObject('Object Repository/Add multiple admins/Page_Droobi Admin Portal/Page_Droobi Admin Portal/button_ Add Another Admin'))

WebUI.setText(findTestObject('Object Repository/Add multiple admins/Page_Droobi Admin Portal/Page_Droobi Admin Portal/input_Hospital Admin_name0'), 
    'New Admin 2')

WebUI.click(findTestObject('Object Repository/Add multiple admins/Page_Droobi Admin Portal/Page_Droobi Admin Portal/div_Email Address_ant-form-item-control'))

WebUI.click(findTestObject('Object Repository/Add multiple admins/Page_Droobi Admin Portal/Page_Droobi Admin Portal/div_Email Address'))

int ran_no

ran_no = (Math.random() * 500)

WebUI.setText(findTestObject('Add multiple admins/Page_Droobi Admin Portal/Admin email 0'), ('moiz.naqi+' + ran_no) + '@venturedive.com')

WebUI.click(findTestObject('Object Repository/Add multiple admins/Page_Droobi Admin Portal/Page_Droobi Admin Portal/button_Send Invitation'))

WebUI.closeBrowser()

