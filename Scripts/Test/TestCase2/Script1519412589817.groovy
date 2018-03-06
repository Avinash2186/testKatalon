import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.example.WebUICustomKeywords as WebUICustomKeywords
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testcase.Variable as Variable
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.testng.Assert as Assert
import org.openqa.selenium.By as By

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.com')

WebUI.waitForPageLoad(60)
WebUI.maximizeWindow()

//WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.maximizeWindow()
println('page loaded  ' + textVariable)

//WebUI.setText(findTestObject('Salesforce_Login/Page_Login  Salesforce/input_username'), 'nsur1@sfia.com.iaperf1')
WebUI.takeScreenshot()

WebDriver driver = DriverFactory.getWebDriver()

WebUI.comment('Taking our List of Elements')

/*List<WebElement> listOfElements = driver.findElements(By.xpath('//a'))

println('listOfElements===>' + listOfElements)

println('listOfElements size===>' + listOfElements.size())*/

String text = CustomKeywords.'com.helper.helperMethods.getText'(By.xpath('//a'), 2)

println 'text====>'+text

/*for (int i = 0; i < listOfElements.size; i++) {
    println('listOfElements 5th element===>' + listOfElements.get(i).getText())
}*/

WebUI.comment('Clicking on Gmail Link')

CustomKeywords.'com.example.WebUICustomKeywords.isElementPresent'(findTestObject('Google/Gmail_Link'), 30)


driver.findElement(By.linkText(text)).click()
WebUI.delay(5)
String url = WebUI.getUrl()
Assert.assertTrue(url.contains("gmail34535345"))

