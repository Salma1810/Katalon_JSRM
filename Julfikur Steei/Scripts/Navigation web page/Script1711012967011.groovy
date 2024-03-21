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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://159.65.10.213:3036/')

WebUI.verifyElementPresent(findTestObject('Header Verification/Page_Julfikar Steel/h4_01409998211'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Header Verification/Page_Julfikar Steel/h4_0900 AM - 0600 PM'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Header Verification/Page_Julfikar Steel/h4_B-342, Enaetnagar, Godnail, Siddhirganj'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Header Verification/Page_Julfikar Steel/span_Call'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Header Verification/Page_Julfikar Steel/span_Narayanganj-1432, Bangladesh'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Header Verification/Page_Julfikar Steel/span_Sat - Thurs'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Header Verification/Page_Julfikar Steel/img'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Header Verification/Page_Julfikar Steel/i_Call_la la-clock-o'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Header Verification/Page_Julfikar Steel/i_Call_la la-phone'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Header Verification/Page_Julfikar Steel/i_Sat - Thurs_la la-map'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

