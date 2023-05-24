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

WebUI.delay(5)

Mobile.tap(findTestObject('Object Repository/Products/android.widget.Button - Burger'), 0)

Mobile.tap(findTestObject('Object Repository/Products/android.widget.TextView - produk'), 0)

Mobile.tap(findTestObject('Object Repository/Products/android.widget.Button - baru'), 0)

Mobile.setText(findTestObject('Object Repository/Products/android.widget.EditText - nama'), 'Laptop', 0)

Mobile.setText(findTestObject('Object Repository/Products/android.widget.EditText - Deskripsi'), 'Deskripsi', 0)

Mobile.setText(findTestObject('Products/android.widget.EditText - hargaBeli'), '1500', 0)

Mobile.setText(findTestObject('Products/android.widget.EditText - hargaJual'), '2000', 0)

Mobile.setText(findTestObject('Products/android.widget.EditText - stok'), '10', 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'helper.swipe.swipeVerticalDown'()

Mobile.tap(findTestObject('Products/android.widget.EditText - Kategori'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Products/android.widget.TextView - Technology'), 0)

Mobile.tap(findTestObject('Object Repository/Products/android.widget.Button - Simpan'), 0)

