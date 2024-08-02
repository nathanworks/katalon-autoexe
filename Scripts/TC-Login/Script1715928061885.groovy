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

def incorrect = GlobalVariable.global_incorrect
def email = ""
def pass = ""

WebUI.verifyElementPresent(findTestObject('Object Repository/Sign_Up/btn_SignupOrLogin'), 10)
WebUI.click(findTestObject('Object Repository/Sign_Up/btn_SignupOrLogin'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/field_email'), 10)
WebUI.click(findTestObject('Object Repository/Login/field_email'))

if(incorrect == 0)
{
	email = GlobalVariable.global_xemail
	pass = GlobalVariable.global_xpassword
}
else
{
	email = GlobalVariable.global_email
	pass = GlobalVariable.global_password
}

WebUI.setText(findTestObject('Object Repository/Login/field_email'), email)

WebUI.click(findTestObject('Object Repository/Login/field_password'))

WebUI.setText(findTestObject('Object Repository/Sign_Up/input_Login to your account_password'), pass)

WebUI.click(findTestObject('Object Repository/Sign_Up/button_Login'))

if(incorrect == 0)
	
{
	WebUI.verifyElementPresent(findTestObject('Object Repository/Login/emsg_failed_login'), 10)
}

