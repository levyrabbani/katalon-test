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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.ruparupa.com/ms/payday')

WebUI.click(findTestObject('Object Repository/Page_Payday Surprise  Ruparupa/div_Rumah Tangga'))

WebUI.scrollToPosition(0, 7650)

WebUI.waitForElementPresent(findTestObject('Page_Jual Peralatan Rumah Tangga - Harga Te_ee196f/img'), 0)

WebUI.click(findTestObject('Object Repository/Page_Jual Peralatan Rumah Tangga - Harga Te_ee196f/img'))

WebUI.scrollToPosition(0, 50)

WebUI.click(findTestObject('Object Repository/Page_Promo Beli 1 Gratis 1  Ruparupa/img'))

WebUI.scrollToPosition(0, 900)

WebUI.click(findTestObject('Page_New Arrivals - Jual Produk Rumah Tangg_cc03b0/img_Ide dan Inspirasi_image-secondary'))

WebUI.click(findTestObject('Object Repository/Page_Jual Informa Bally Meja Setrika Dengan_bd141b/p_Klik disini untuk melihat simulasi Cicila_cd75fc'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jual Informa Bally Meja Setrika Dengan_bd141b/p_Klik disini untuk melihat simulasi Cicila_cd75fc'), 
    'Klik disini untuk melihat simulasi Cicilan 0% dan Cicilan tanpa Kartu!')

WebUI.click(findTestObject('Object Repository/Page_Jual Informa Bally Meja Setrika Dengan_bd141b/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_Jual Informa Bally Meja Setrika Dengan_bd141b/button_Tambah ke keranjang'))

WebUI.click(findTestObject('Object Repository/Page_Jual Informa Bally Meja Setrika Dengan_bd141b/button_Lanjut Ke Keranjang'))

WebUI.click(findTestObject('Object Repository/Page_Ruparupa  No.1 Home, Living  Furniture_5df54e/span_Sekarang kamu dapat menambahkan catata_36baf1'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Ruparupa  No.1 Home, Living  Furniture_5df54e/span_Sekarang kamu dapat menambahkan catata_36baf1'), 
    'Sekarang kamu dapat menambahkan catatan untuk produk pesananmu')

WebUI.click(findTestObject('Object Repository/Page_Ruparupa  No.1 Home, Living  Furniture_5df54e/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_Ruparupa  No.1 Home, Living  Furniture_5df54e/button_Lanjutkan ke Pembayaran'))

WebUI.setText(findTestObject('Object Repository/Page_Ruparupa.com Payment/input_Daftar_email'), 'test@test')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Ruparupa.com Payment/input_Alamat email atau nomor telepon tidak_577a7d'), 
    'P9ET2sDE0SE=')

WebUI.click(findTestObject('Page_Ruparupa.com Payment/button_Masuk'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Ruparupa.com Payment/div_Alamat email atau nomor telepon tidak valid'), 
    'Alamat email atau nomor telepon tidak valid')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Ruparupa.com Payment/div_Kata sandi minimal 5 karakter'), 
    'Kata sandi minimal 5 karakter')

WebUI.closeBrowser()

