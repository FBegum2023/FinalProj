package luma.usa.stepDefinition;
import org.testng.Assert;
import io.cucumber.java.en.*;
import luma.usa.basepage.SuperClass;
import luma.usa.elementPage.PageFactoryElements;
import luma.usa.genericFunctions.CommonMethods;
import luma.usa.genericFunctions.WaitHelper;


public class FunctionalStepDefinition extends SuperClass{
		PageFactoryElements pf;
	    
		@Given("user able to login the application")
		public void user_able_to_login_the_application() throws InterruptedException{
		
	    pf = new PageFactoryElements();//initializing Class obj from PF
		pf.applicationLogIn();
		CommonMethods.captureScreenshot("LoginPage");
		}
		
		//Mouse Hoover
		@When("user able to select Jackets from Men module")
		 public void user_able_to_select_jackets_from_men_module() throws InterruptedException{
			
		    log.info(">>>>user able to select Men module<<<< ");
			WaitHelper.seleniumWait(pf.getMenModule());
			CommonMethods.HoverOver(pf.getMenModule());
			
		    log.info(">>>>user able to select Tops from Men module<<<< ");
			WaitHelper.seleniumWait(pf.getSelectTops());
			CommonMethods.HoverOver(pf.getSelectTops());
			
			log.info(">>>>user able to click Jackets from   from Tops module<<<< ");
			WaitHelper.seleniumWait(pf.getSelectJackets());
			CommonMethods.actionClick(pf.getSelectJackets());
		}

		@When("user able to select a Jacket product's size, color, quantity")
		public void user_able_to_select_a_jacket_product_s_size_color_quantity() throws InterruptedException {
		
		log.info(">>>>user able to select a Jacket <<<< ");
		CommonMethods.actionClick(pf.getSelectJupitarJacket());
		//calling wait method
		WaitHelper.seleniumWait(pf.getSelectSize());		
		CommonMethods.actionClick(pf.getSelectSize());
		CommonMethods.captureScreenshot("Size not selected");
		
		log.info(">>>>user able to select a Color <<<< ");
		WaitHelper.seleniumWait(pf.getSelectColor());
		CommonMethods.actionClick(pf.getSelectColor());
		
		log.info(">>>>user able to enter quantity <<<< ");
		WaitHelper.seleniumWait(pf.getSelectQty());
		pf.getSelectQty().clear();
		pf.getSelectQty().sendKeys(prop.getProperty("SelectQty"));
		
		
		}

		@When("user able to click add to cart button")
		public void user_able_to_click_add_to_cart_button() throws InterruptedException {
		
		log.info(">>>>user able to click add to cart button <<<< ");
		WaitHelper.seleniumWait(pf.getClickAddToCart());
		CommonMethods.actionClick(pf.getClickAddToCart());
		   
		}

		@When("user able to click on the shopping cart pop-up")
		public void user_able_to_click_on_the_shopping_cart_pop_up() throws InterruptedException {
		log.info(">>>>user able to click on the shopping cart pop-up<<<< ");
		WaitHelper.seleniumWait(pf.getSelectShoppingCartLink());
		CommonMethods.actionClick(pf.getSelectShoppingCartLink());
		}

		@When("user able to click on the proceed to checkout")
		public void user_able_to_click_on_the_proceed_to_checkout() throws InterruptedException {
			log.info(">>>>user able to click on the proceed to checkout Button<<<< ");
			WaitHelper.seleniumWait(pf.getSelectProceedToCheckout());
			CommonMethods.actionClick(pf.getSelectProceedToCheckout());
		}
		
		@When("user able to add shipping information")
		public void user_able_to_add_shipping_information() throws InterruptedException {
			log.info(">>>>user able to add shipping information <<<< ");
			pf.AddNewShippingDetails();
			
			
		}
		
		@When("user able to select shipping method radio button and click on next button")
		public void user_able_to_select_shipping_method_radio_button_and_click_on_next_button() throws InterruptedException {
			
			log.info(">>>>user able to select shipping method radio button and click on next button <<<< ");		
			//CommonMethods.getPageRefresh();
			WaitHelper.seleniumWait(pf.getSelectShippingMethodBtn());
			CommonMethods.actionClick(pf.getSelectShippingMethodBtn());
			
			log.info(">>>>user able to click on next button <<<< ");	
			WaitHelper.seleniumWait(pf.getSelectSelectNextBtn());
			CommonMethods.actionClick(pf.getSelectSelectNextBtn());
			
//			log.info(">>>>user able to Select Billing And Shipping address same ChkBox <<<< ");
//			WaitHelper.seleniumWait(pf.getSelectBillingAndShippingChkBox());
//			pf.getSelectBillingAndShippingChkBox().clear();
//			CommonMethods.actionClick(pf.getSelectBillingAndShippingChkBox());
			
		}

		@When("user able to click on the place order button")
		public void user_able_to_click_on_the_place_order_button() throws InterruptedException {
			log.info(">>>>user able to click on the place order button <<<< ");
			WaitHelper.seleniumWait(pf.getSelectPlaceOrderBtn());
			CommonMethods.jsClick(pf.getSelectPlaceOrderBtn());
		}
		
		@Then("user able to verify the confirmation message {string}")
		public void user_able_to_verify_the_confirmation_message(String ExpectedResult) throws InterruptedException {
			log.info(">>>>user able to verify the confirmation message<<<< ");
			Assert.assertEquals(ExpectedResult, pf.getVerifyOrderConfirmation().getText());
		System.out.println("The Order confirmation: "+pf.getVerifyOrderConfirmation().getText());
		}

}

