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

WebUI.click(findTestObject('Object Repository/Admin is able to see al pages/Refferal codes/li_Referral Codes'))

WebUI.click(findTestObject('Object Repository/Admin is able to see al pages/Refferal codes/button_Create New codes'))

WebUI.click(findTestObject('Object Repository/Admin is able to see al pages/Refferal codes/div_Create new invitation codes_ant-form-it_cb61c6'))

WebUI.setText(findTestObject('Object Repository/Admin is able to see al pages/Refferal codes/input_Create new invitation codes_createInv_7b79d0'), 
    '5')

WebUI.click(findTestObject('Object Repository/Admin is able to see al pages/Refferal codes/div_Select Hospital'))

WebUI.click(findTestObject('Object Repository/Admin is able to see al pages/Refferal codes/li_Test Hospital'))

WebUI.click(findTestObject('Object Repository/Admin is able to see al pages/Refferal codes/input_Test Hospital_ant-calendar-picker-inp_688151'))

WebUI.click(findTestObject('Object Repository/Admin is able to see al pages/Refferal codes/div_19'))

WebUI.click(findTestObject('Object Repository/Admin is able to see al pages/Refferal codes/span_sentinelStart_ant-modal-close-x'))

WebUI.closeBrowser()

