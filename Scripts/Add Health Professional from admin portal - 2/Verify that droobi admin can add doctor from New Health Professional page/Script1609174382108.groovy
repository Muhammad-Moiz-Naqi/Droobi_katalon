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

WebUI.click(findTestObject('Object Repository/Add health Professional dfrom admin portal/Page_Droobi Admin Portal/span_Health Professionals (2)'))

WebUI.click(findTestObject('Object Repository/Add health Professional dfrom admin portal/Page_Droobi Admin Portal/button_Add Health Professional (4)'))

WebUI.click(findTestObject('Object Repository/Add health Professional dfrom admin portal/Page_Droobi Admin Portal/div_Select Health Professional (4)'))

WebUI.click(findTestObject('Object Repository/Add health Professional dfrom admin portal/Page_Droobi Admin Portal/li_Doctor (1)'))

WebUI.setText(findTestObject('Object Repository/Add health Professional dfrom admin portal/Page_Droobi Admin Portal/input_Name_name (4)'), 
    'Test Doctor')

WebUI.click(findTestObject('Object Repository/Add health Professional dfrom admin portal/Page_Droobi Admin Portal/input_Preferred Language_ant-radio-input'))

int ran_no

ran_no = (Math.random() * 500)

WebUI.setText(findTestObject('Object Repository/Page_Droobi Hospital Portal/input_Email Address_email'), ('moiznaqi+' + 
    ran_no) + '@venturedive.com')

WebUI.setText(findTestObject('Object Repository/Add health Professional dfrom admin portal/Page_Droobi Admin Portal/input_Capacity_capacity (4)'), 
    '1')

WebUI.click(findTestObject('Object Repository/Add health Professional dfrom admin portal/Page_Droobi Admin Portal/button_Send Invitation (4)'))

WebUI.closeBrowser()

