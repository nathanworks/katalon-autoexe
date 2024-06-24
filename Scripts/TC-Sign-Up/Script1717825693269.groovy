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

//WebUI.click(findTestObject('Object Repository/Sign_Up/a_Signup  Login'))
//
//WebUI.setText(findTestObject('Object Repository/Sign_Up/input_New User Signup_name'), 'jonathan hermawan')
//
//WebUI.setText(findTestObject('Object Repository/Sign_Up/input_New User Signup_email'), 'jo')
//
//WebUI.click(findTestObject('Object Repository/Sign_Up/input_New User Signup_name'))
//
//WebUI.setText(findTestObject('Object Repository/Sign_Up/input_New User Signup_email'), 'jo@gmail.com')
//
//WebUI.click(findTestObject('Object Repository/Sign_Up/button_Signup'))
//
//WebUI.setText(findTestObject('Object Repository/Sign_Up/input_New User Signup_email'), 'jo9999@gmail.com')
//
//WebUI.click(findTestObject('Object Repository/Sign_Up/button_Signup'))
//
//WebUI.click(findTestObject('Object Repository/Sign_Up/div_Enter Account InformationTitleMr.Mrs.Na_528aaf'))
//
//WebUI.click(findTestObject('Object Repository/Sign_Up/div_Mr_uniform-id_gender1'))
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Sign_Up/input__password'), '5xx1bkCcAlw=')
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Sign_Up/select_Day123456789101112131415161718192021_40ab5b'),
//    'Day', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Sign_Up/select_Day123456789101112131415161718192021_40ab5b'),
//    '20', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Sign_Up/select_MonthJanuaryFebruaryMarchAprilMayJun_aa9ebb'),
//    '2', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Sign_Up/select_Year20212020201920182017201620152014_f874ed'),
//    '2009', true)
//
//WebUI.setText(findTestObject('Object Repository/Sign_Up/input__first_name'), 'jo')
//
//WebUI.click(findTestObject('Object Repository/Sign_Up/div_Enter Account InformationTitleMr.Mrs.Na_528aaf_1'))
//
//WebUI.setText(findTestObject('Object Repository/Sign_Up/input__last_name'), 'ok')
//
//WebUI.setText(findTestObject('Object Repository/Sign_Up/input_Company_company'), 'u')
//
//WebUI.setText(findTestObject('Object Repository/Sign_Up/input_(Street address, P.O. Box, Company na_957d3e'), 'okok')
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Sign_Up/select_IndiaUnited StatesCanadaAustraliaIsr_09757b'),
//    'India', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Sign_Up/select_IndiaUnited StatesCanadaAustraliaIsr_09757b'),
//    'Canada', true)
//
//WebUI.setText(findTestObject('Object Repository/Sign_Up/input__state'), 'u')
//
//WebUI.setText(findTestObject('Object Repository/Sign_Up/input__city'), 'ok')
//
//WebUI.setText(findTestObject('Object Repository/Sign_Up/input__zipcode'), '88')
//
//WebUI.setText(findTestObject('Object Repository/Sign_Up/input__mobile_number'), '897')
//
//WebUI.click(findTestObject('Object Repository/Sign_Up/button_Create Account'))