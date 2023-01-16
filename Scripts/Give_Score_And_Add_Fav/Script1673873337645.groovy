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

WebUI.navigateToUrl('http://localhost:3000/home')

WebUI.click(findTestObject('Object Repository/Give_Score_And_Add_Fav/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Give_Score_And_Add_Fav/input'), 'Admin')

WebUI.setText(findTestObject('Object Repository/Give_Score_And_Add_Fav/input_1'), '123456')

WebUI.click(findTestObject('Object Repository/Give_Score_And_Add_Fav/button_submit'))
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/Give_Score_And_Add_Fav/input_Log out_search-field'), 'Naruto')
WebUI.delay(2)
WebUI.sendKeys(findTestObject('Object Repository/Give_Score_And_Add_Fav/input_Log out_search-field'), Keys.chord(Keys.ENTER))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Give_Score_And_Add_Fav/img'))
WebUI.delay(2)
WebUI.selectOptionByValue(findTestObject('Object Repository/Give_Score_And_Add_Fav/select_Score012345678910'), '10', true)
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Give_Score_And_Add_Fav/button_Add to Favorite'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Give_Score_And_Add_Fav/a_Home'))
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/Give_Score_And_Add_Fav/input_Log out_search-field'), 'Kuroko')
WebUI.delay(2)
WebUI.sendKeys(findTestObject('Object Repository/Give_Score_And_Add_Fav/input_Log out_search-field'), Keys.chord(Keys.ENTER))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Give_Score_And_Add_Fav/img_1'))
WebUI.delay(2)
WebUI.selectOptionByValue(findTestObject('Object Repository/Give_Score_And_Add_Fav/select_Score012345678910'), '8', true)
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Give_Score_And_Add_Fav/button_Add to Favorite'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Give_Score_And_Add_Fav/a_Home'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Give_Score_And_Add_Fav/button_Switch search type'))
WebUI.delay(2)
WebUI.setText(findTestObject('Give_Score_And_Add_Fav/input_Log out_search-field'), 'One piece')
WebUI.delay(2)
WebUI.sendKeys(findTestObject('Object Repository/Give_Score_And_Add_Fav/input_Log out_search-field'), Keys.chord(Keys.ENTER))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Give_Score_And_Add_Fav/img_1_2'))
WebUI.delay(2)
WebUI.selectOptionByValue(findTestObject('Object Repository/Give_Score_And_Add_Fav/select_Score012345678910'), '9', true)
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Give_Score_And_Add_Fav/button_Add to Favorite'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Give_Score_And_Add_Fav/a_Home'))
WebUI.delay(5)
WebUI.closeBrowser()

