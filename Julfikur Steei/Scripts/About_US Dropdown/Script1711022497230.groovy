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

//WebUI.openBrowser('http://159.65.10.213:3036/')
for (int i = 0; i <= 3; i++) 
	{
		
	WebUI.openBrowser('http://159.65.10.213:3036/')
	
	
	if (i==0) {
		WebUI.mouseOver(findTestObject('DropDown Submenu/Page_Julfikar Steel/a_About Us'))
		WebUI.delay(3)
		WebUI.click(findTestObject('DropDown Submenu/Page_Julfikar Steel/a_Key Management'))
		//WebUI.delay(3)
		//WebUI.closeBrowser()
	}
	
	else if(i==1) {
		
		WebUI.mouseOver(findTestObject('DropDown Submenu/Page_Julfikar Steel/a_About Us'))
		WebUI.click(findTestObject('DropDown Submenu/Page_Julfikar Steel/a_Board Of Directors'))
		//WebUI.closeBrowser()
	}
	
	else if (i==2) {
		
		WebUI.mouseOver(findTestObject('DropDown Submenu/Page_Julfikar Steel/a_About Us'))
		WebUI.click(findTestObject('DropDown Submenu/Page_Julfikar Steel/a_Corporate Information'))
		//WebUI.closeBrowser()
	}
	
	
	else if(i==3) {
		WebUI.mouseOver(findTestObject('DropDown Submenu/Page_Julfikar Steel/a_About Us'))
		WebUI.click(findTestObject('DropDown Submenu/Page_Julfikar Steel/a_Mission ,Vision  Values'))
		WebUI.closeBrowser()
		
	}
	
	
	
	
	
	
	}






