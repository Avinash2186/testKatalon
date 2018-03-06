import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.testng.Assert as Assert



WebUI.navigateToUrl('https://iaops--iaperf.cs65.my.salesforce.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Salesforce_Login/Page_Login  Salesforce/input_username'), 'businessadmin@sfia.com.iaperf1  ')

WebUI.setText(findTestObject('Salesforce_Login/Page_Login  Salesforce/input_pw'), 'Sfiatest11')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Salesforce_Login/Page_Login  Salesforce/input_Login'))

WebUI.waitForElementVisible(findTestObject('Salesforce_Login/HomePage/Page_Agencies  Salesforce/Leads_Tab'), 20)

Assert.assertTrue(WebUI.getUrl().contains('iaperf.lightning.force.com/lightning/page/home'))

WebUI.takeScreenshot()
