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

WebUI.navigateToUrl('https://test-admin.droobihealth.net/#/')

WebUI.click(findTestObject('Object Repository/Add health Professional dfrom admin portal/Page_Droobi Admin Portal/span_Health Professionals'))

WebUI.click(findTestObject('Object Repository/Add health Professional dfrom admin portal/Page_Droobi Admin Portal/button_Add Health Professional (1) (1)'))

WebUI.click(findTestObject('Object Repository/Add health Professional dfrom admin portal/Page_Droobi Admin Portal/div_Select Health Professional'))

WebUI.click(findTestObject('Object Repository/Add health Professional dfrom admin portal/Page_Droobi Admin Portal/li_Educator'))

WebUI.setText(findTestObject('Object Repository/Add health Professional dfrom admin portal/Page_Droobi Admin Portal/input_Name_name'), 
    'Test Educator')

WebUI.click(findTestObject('Object Repository/Add health Professional dfrom admin portal/Page_Droobi Admin Portal/span_Both'))

Random rnd = new Random()

ran_no = (1 + rnd.nextInt(1000))

WebUI.setText(findTestObject('Object Repository/Add health Professional dfrom admin portal/Page_Droobi Admin Portal/input_Email Address_email (1)'), 
    ('moiz.naqi+' + ran_no) + '@venturedive.com')

WebUI.click(findTestObject('Object Repository/Add health Professional dfrom admin portal/Page_Droobi Admin Portal/div_Capacity_ant-input-number'))

WebUI.setText(findTestObject('Object Repository/Add health Professional dfrom admin portal/Page_Droobi Admin Portal/input_Capacity_capacity'), 
    '10')

WebUI.click(findTestObject('Object Repository/Add health Professional dfrom admin portal/Page_Droobi Admin Portal/button_Send Invitation'))

WebUI.delay(5)

WebUI.closeBrowser()

