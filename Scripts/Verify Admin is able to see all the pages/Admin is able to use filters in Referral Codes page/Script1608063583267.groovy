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

WebUI.click(findTestObject('Object Repository/Admin is able to see al pages/Refferal codes/span_Referral Codes (1)'))

WebUI.click(findTestObject('Object Repository/Admin is able to see al pages/Refferal codes/i_Hospital_anticon anticon-filter ant-dropd_e856d6'))

WebUI.click(findTestObject('Object Repository/Admin is able to see al pages/Refferal codes/span_LifeCare Hospital'))

WebUI.click(findTestObject('Object Repository/Admin is able to see al pages/Refferal codes/span_Emadi Hospital_ant-radio-inner'))

WebUI.click(findTestObject('Object Repository/Admin is able to see al pages/Refferal codes/a_OK'))

WebUI.click(findTestObject('Object Repository/Admin is able to see al pages/Refferal codes/i_Hospital_anticon anticon-filter ant-dropd_e856d6'))

WebUI.click(findTestObject('Object Repository/Admin is able to see al pages/Refferal codes/a_Reset'))

WebUI.click(findTestObject('Object Repository/Admin is able to see al pages/Refferal codes/span_Status'))

WebUI.click(findTestObject('Object Repository/Admin is able to see al pages/Refferal codes/i_Hospital_anticon anticon-filter ant-dropd_e856d6'))

WebUI.click(findTestObject('Object Repository/Admin is able to see al pages/Refferal codes/span_Reset_ant-radio'))

WebUI.click(findTestObject('Object Repository/Admin is able to see al pages/Refferal codes/a_OK'))

WebUI.click(findTestObject('Object Repository/Admin is able to see al pages/Refferal codes/i_Hospital_anticon anticon-filter ant-dropd_e856d6'))

WebUI.click(findTestObject('Object Repository/Admin is able to see al pages/Refferal codes/input_Available_ant-radio-input'))

WebUI.click(findTestObject('Object Repository/Admin is able to see al pages/Refferal codes/a_OK'))

WebUI.click(findTestObject('Object Repository/Admin is able to see al pages/Refferal codes/i_Hospital_anticon anticon-filter ant-dropd_e856d6'))

WebUI.click(findTestObject('Object Repository/Admin is able to see al pages/Refferal codes/a_Reset'))

