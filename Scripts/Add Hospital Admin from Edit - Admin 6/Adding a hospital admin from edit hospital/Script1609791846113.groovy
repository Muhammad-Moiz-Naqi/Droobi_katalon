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

WebUI.setText(findTestObject('Object Repository/Add Hospital Admin/input_Hospitals_ant-input'), 'Test ')

WebUI.sendKeys(findTestObject('Object Repository/Add Hospital Admin/input_Hospitals_ant-input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Add Hospital Admin/a_Edit'))

WebUI.click(findTestObject('Object Repository/Add Hospital Admin/button_ Add Another Admin'))

WebUI.setText(findTestObject('Object Repository/Add Hospital Admin/input_Hospital Admin_name0'), 'Ali')

int ran_no

ran_no = (Math.random() * 500)

WebUI.setText(findTestObject('Object Repository/Add Hospital Admin/input_Email Address_email0'), ran_no)

WebUI.click(findTestObject('Object Repository/Add Hospital Admin/button_Send Invitation'))

WebUI.click(findTestObject('Object Repository/Add Hospital Admin/button_Done'))

