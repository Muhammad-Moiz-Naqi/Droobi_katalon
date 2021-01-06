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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

def rand = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(3)

WebUI.setText(findTestObject('Object Repository/Page_Droobi Hospital Portal/input_Add Health professional_ant-input'), GlobalVariable.G_getname)

WebUI.click(findTestObject('Object Repository/Page_Droobi Hospital Portal/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Droobi Hospital Portal/td_Abdul Ghanikhursheedhumairagh1gmail.com'))

def G_edit_name = WebUI.setText(findTestObject('Object Repository/Page_Droobi Hospital Portal/input_Name_name'), GlobalVariable.G_getname + 
    rand)

WebUI.verifyNotEqual(GlobalVariable.G_getname, GlobalVariable.G_edit_name)

WebUI.scrollToElement(findTestObject('Page_Droobi Hospital Portal/a_Dashboard'), 0)

WebUI.click(findTestObject('Page_Droobi Hospital Portal/a_Dashboard'))

