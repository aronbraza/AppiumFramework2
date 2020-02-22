package HiMollyAppPageObjects;

import java.awt.Event;
import java.time.Duration;
import java.util.ArrayList;

import java.util.List;

import org.apache.commons.collections.bag.TreeBag;
import org.apache.commons.math3.random.ISAACRandom;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;

import WOG.AppiumFramework.base;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class HomePage extends base {

	public HomePage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public WebDriverWait wait = new WebDriverWait(driver, 20);

	// Status
	@AndroidFindBy(id = "com.wog.himolly:id/lnr_status")
	public WebElement Status_Icon;

	@AndroidFindBy(id = "com.wog.himolly:id/action_send")
	public WebElement Send_Icon;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_content")
	public WebElement WhatAreYouWorkinOn_Textbox;
	
	//@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.wog.himolly:id/txt_content']")
	//public WebElement WhatAreYouWorkinOn_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/input_textbox")
	public List<WebElement> TagPersonOrGroup_Hashtag_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/img_photo")
	public WebElement Image_Photo;

	@AndroidFindBy(uiAutomator = "text(\"Add a hashtag\")")
	public WebElement Hashtag_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_hashtag")
	public WebElement Hashtag_Text;

	@AndroidFindBy(id = "com.wog.himolly:id/btn_tag_person")
	public WebElement TagPersonOrGroup_Icon;

	@AndroidFindBy(id = "com.wog.himolly:id/btn_add_hashtag")
	public WebElement Hashtag_Icon;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.wog.himolly:id/btn_add_image']")
	public WebElement Camera_Icon;

	@AndroidFindBy(id = "com.wog.himolly:id/check_view")
	public List<WebElement> CheckView_Photo;

	@AndroidFindBy(id = "com.wog.himolly:id/photo_thumbnail")
	public WebElement Photo_Thumbnail;

	@AndroidFindBy(id = "com.wog.himolly:id/button_apply")
	public WebElement Apply_Button;

	@AndroidFindBy(id = "com.wog.himolly:id/button_preview")
	public WebElement Preview_Button;

	@AndroidFindBy(id = "com.wog.himolly:id/button_preview")
	public WebElement Back_Button;

	@AndroidFindBy(id = "com.wog.himolly:id/btn_remove")
	public List<WebElement> RemoveImage_Icon;

	@AndroidFindBy(id = "com.wog.himolly:id/img_thumbnail")
	public WebElement Attached_Image;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_content")
	public WebElement Text_ContentPost;

	// Poll
	@AndroidFindBy(id = "com.wog.himolly:id/lnr_poll")
	public WebElement Poll_Icon;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_content")
	public WebElement WhatsThisPollAbout_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_label")
	public List<WebElement> Option_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/img_add")
	public WebElement AddOption_Button;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_label")
	public List<WebElement> PollChoices;

	// Event
	@AndroidFindBy(id = "com.wog.himolly:id/lnr_event")
	public WebElement Event_Icon;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_content")
	public WebElement SaySomething_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_content")
	public WebElement UploadEventBanner_Button;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_name")
	public WebElement EventName_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_detail")
	public WebElement AboutTheEvent_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/cb_holiday")
	public WebElement MarkThisAsHoliday_Checkbox;

	@AndroidFindBy(id = "com.wog.himolly:id/switch_annual")
	public WebElement AnnualEvent_ToggleButton;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_place")
	public WebElement AddAPlace_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_start")
	public WebElement StartDate_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_end")
	public WebElement EndDate_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_title")
	public WebElement EventName_Text;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_description")
	public WebElement AboutTheEvent_Text;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_time")
	public WebElement DateTime_Text;

	// Category
	@AndroidFindBy(id = "com.wog.himolly:id/lnr_category")
	public WebElement SelectCategory;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ADD NEW CATEGORY']")
	public WebElement AddNewCategory_Button;

	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Select Category\"));")
	public WebElement ScrollInto_SelectCategory;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Edit']")
	public WebElement Edit_Category;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Delete']")
	public WebElement Delete_Category;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.wog.himolly:id/txt_name']")
	public List<WebElement> Category_Name;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_name")
	public WebElement Color;

	@AndroidFindBy(id = "com.wog.himolly:id/dlg_txt_input")
	public WebElement CategoryName_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_picker")
	public WebElement SelectPicker_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_positive")
	public WebElement SaveCategory_Button;

	@AndroidFindBy(id = "Cancel")
	public WebElement CancelCategory_Button;

	// Announcement
	@AndroidFindBy(uiAutomator = "text(\"Announcement\")")
	public WebElement Announcement_Icon;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_title")
	public WebElement ThisAnnouncementisAbout_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_detail")
	public WebElement TypeYourAnnouncementDetails_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_title")
	public WebElement ThisAnnouncementisAbout_Text;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_detail")
	public WebElement TypeYourAnnouncementDetails_Text;

	// Search Molly
	@AndroidFindBy(accessibility = "Navigate up")
	public WebElement Search_Icon;

	@AndroidFindBy(id = "com.wog.himolly:id/search_src_text")
	public WebElement SearchMolly_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_title")
	public List<WebElement> ColleagueOrGroupName_Text;

	@AndroidFindBy(id = "com.wog.himolly:id/img_photo")
	public WebElement ColleagueOrGroup_Picture;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_name")
	public WebElement ColleagueOrGroup_Name;

	// Search Colleagues

	@AndroidFindBy(id = "com.wog.himolly:id/action_more")
	public WebElement Navigation_Icon;

	// Compose a Message page

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Compose a Message']")
	public WebElement ComposeMessagePage;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_message")
	public WebElement Message_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/btn_option")
	public WebElement MoreIcon;

	@AndroidFindBy(id = "com.wog.himolly:id/lnr_edit")
	public WebElement EditPost_Icon;

	@AndroidFindBy(id = "com.wog.himolly:id/lnr_delete")
	public WebElement DeletePost_Icon;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_header")
	public WebElement Header_Text;

	@AndroidFindBy(id = "com.wog.himolly:id/lnr_like")
	public List<WebElement> Like_Icon;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_like")
	public WebElement Like_Text;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='You liked this.']")
	public List<WebElement> YouLikedThisFooter_Text;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_footer")
	public WebElement Footer_Text;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_footer")
	public List<WebElement> ListFooter_Text;

	@AndroidFindBy(id = "com.wog.himolly:id/lnr_response")
	public List<WebElement> Respond_Icon;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.wog.himolly:id/btn_option']")
	public List<WebElement> Comment_MoreIcon;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.wog.himolly:id/txt_comment']")
	public WebElement Comment_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/btn_send")
	public WebElement Send_Button;

	@AndroidFindBy(id = "com.wog.himolly:id/btn_back")
	public WebElement Back_Icon;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_content")
	public WebElement Comment_Text;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Reply']")
	public WebElement Reply_Icon;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_content")
	public List<WebElement> CommentContent_Text;

	@AndroidFindBy(id = "com.wog.himolly:id/lnr_edit")
	public WebElement Edit_Comment;

	@AndroidFindBy(id = "com.wog.himolly:id/lnr_delete")
	public WebElement Delete_Comment;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_positive")
	public WebElement Proceed_Button;

	@AndroidFindBy(xpath = "//android.widget.Toast[1]")
	public WebElement ToastMessage;

	@AndroidFindBy(id = "com.wog.himolly:id/btn_option")
	public List<WebElement> MoreIcon_List;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Profile']")
	public WebElement Profile_Icon;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Home']")
	public WebElement Home_Icon;
	
	@AndroidFindBy(id = "com.wog.himolly:id/txt_name")
	public WebElement Name_Text;

	@AndroidFindBy(id = "com.wog.himolly:id/post_linear_layout")
	public List<WebElement> Post_List;
	
	@AndroidFindBy(className = "android.widget.ImageView")
	public WebElement ImageView;
	
	@AndroidFindBy(id = "com.wog.himolly:id/touch_outside")
	public WebElement TouchOutside;
	
	@AndroidFindBy(id = "com.wog.himolly:id/txt_hashtag")
	public WebElement TextHashtag;
	
	@AndroidFindBy(id = "com.wog.himolly:id/txt_name")
	public List<WebElement> TagName;
	

	public void scroll() {

		Dimension dimension = driver.manage().window().getSize();
		int start = (int) dimension.width / 2;
		Double scrollHeightStart = dimension.getHeight() * 0.70;
		int scrollStart = scrollHeightStart.intValue();
		Double scrollHeightEnd = dimension.getHeight() * 0.30;
		int scrollEnd = scrollHeightEnd.intValue();

		TouchAction action = new TouchAction((PerformsTouchActions) driver);
		action.press(new PointOption().withCoordinates(start, scrollStart))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
				.moveTo(new PointOption().withCoordinates(start, scrollEnd)).release().perform();

	}

	// Test Case ID: Home_0001
	// Test Scenario: Verify if the user can post status with valid data.
	public void PostStatusWithValidData(String WhatAreYouWorkingOn, String TagAPersonOrGroup, String TagAPersonOrGroup2,
			String Hashtag) throws InterruptedException {
		Status_Icon.click();
		Hashtag_Icon.click();
		WhatAreYouWorkinOn_Textbox.sendKeys(WhatAreYouWorkingOn);
		Send_Icon.click();
		Assert.assertTrue(Text_ContentPost.getText().toString().contains(WhatAreYouWorkingOn.toString()));
		System.out.println(Text_ContentPost.getText());
		System.out.println(WhatAreYouWorkingOn.toString());
		
		
		

	}

	// Test Case ID: Home_0002
	// Test Scenario: Verify if the user can post image only.
	public void PostImageOnly() {
		Status_Icon.click();
		Camera_Icon.click();
		Photo_Thumbnail.click();
		CheckView_Photo.get(0).click();
		Apply_Button.click();
		Send_Icon.click();
		Assert.assertTrue(ImageView.isDisplayed());

	}

	// Test Case ID: Home_0003
	// Test Scenario: Verify if the user can post multiple images.
	public void PostMultipleImages() {
		Status_Icon.click();
		Camera_Icon.click();
		CheckView_Photo.get(0).click();
		CheckView_Photo.get(1).click();
		Apply_Button.click();
		Send_Icon.click();
		Assert.assertTrue(ImageView.isDisplayed());
	}

	// Test Case ID: Home_0004
	// Test Scenario: Verify if the user can delete attached image on Post Status
	// page.
	public void RemoveAttachedImage() throws InterruptedException {

		try {
			Status_Icon.click();
			Camera_Icon.click();
			Photo_Thumbnail.click();
			CheckView_Photo.get(0).click();
			Apply_Button.click();
			RemoveImage_Icon.get(0).click();
			Assert.assertTrue(!Attached_Image.isDisplayed());
		} catch (NoSuchElementException ex) {
			System.out.println("No image attached.");
		}

	}

	// Test Case ID: Home_0005
	// Test Scenario: Verify if the user can delete multiple images on Post Status
	// page.
	public void RemoveMultipleAttachedImages() throws InterruptedException {
		try {
			Status_Icon.click();
			Camera_Icon.click();
			CheckView_Photo.get(0).click();
			CheckView_Photo.get(1).click();
			Apply_Button.click();
			RemoveImage_Icon.get(0).click();
			RemoveImage_Icon.get(0).click();
			Assert.assertTrue(!Attached_Image.isDisplayed());
		} catch (NoSuchElementException e) {
			System.out.println("No image attached.");
		}

	}

	// Test Case ID: Home_0006
	// Test Scenario: Verify if the user can post status with tag person or group.
	public void PostStatusWithValidDataWithTagPersonOrGroup(String WhatAreYouWorkingOn, String TagAPersonOrGroup,
			String TagAPersonOrGroup2, String Hashtag) throws InterruptedException {
		Status_Icon.click();
		Hashtag_Icon.click();
		WhatAreYouWorkinOn_Textbox.sendKeys(WhatAreYouWorkingOn);
		TagPersonOrGroup_Hashtag_Textbox.get(0).sendKeys(TagAPersonOrGroup);
		Image_Photo.click();
		Send_Icon.click();
		Assert.assertTrue(Text_ContentPost.getText().contains(WhatAreYouWorkingOn.toString())&& Header_Text.getText().contains(TagAPersonOrGroup.toString()));
		System.out.println(Text_ContentPost.getText());
		System.out.println(Header_Text.getText());
		
	}

	// Test Case ID: Home_0007
	// Test Scenario: Verify if the user can post status with multiple tag person or
	// group.

	
	  public void PostStatusWithMultipleTagPersonOrGroup(String
	  WhatAreYouWorkingOn, String TagAPersonOrGroup, String TagAPersonOrGroup2,
	  String Hashtag) throws InterruptedException {
	  
	  Status_Icon.click(); Hashtag_Icon.click();
	  WhatAreYouWorkinOn_Textbox.sendKeys(WhatAreYouWorkingOn);
	  TagPersonOrGroup_Hashtag_Textbox.get(0).sendKeys(TagAPersonOrGroup); Image_Photo.click();
	  TagPersonOrGroup_Hashtag_Textbox.get(0).sendKeys(TagAPersonOrGroup2); Image_Photo.click();
	  Send_Icon.click(); 
	  Header_Text.click();
	  List<String> getTagName = new ArrayList<String>();
	  for (WebElement item : TagName) {
			getTagName.add(item.getText().toString());
		}
	  
	  TouchOutside.click();
	  Assert.assertTrue(Text_ContentPost.getText().contains(WhatAreYouWorkingOn) && getTagName.toString().contains(TagAPersonOrGroup +", "+TagAPersonOrGroup2));
	  
	 }
	  
	  
	 

	// Test Case ID: Home_0008
	// Test Scenario: Verify if the user can post status with tag person or group
	// and hashtag.
	public void PostStatusWithTagPersonOrGroupAndHashtag(String WhatAreYouWorkingOn, String TagAPersonOrGroup,
			String TagAPersonOrGroup2, String Hashtag) throws InterruptedException {
		Status_Icon.click();
		Hashtag_Icon.click();
		WhatAreYouWorkinOn_Textbox.sendKeys(WhatAreYouWorkingOn);
		TagPersonOrGroup_Hashtag_Textbox.get(0).sendKeys(TagAPersonOrGroup);
		Image_Photo.click();
		TagPersonOrGroup_Hashtag_Textbox.get(1).sendKeys(Hashtag);
		TagPersonOrGroup_Hashtag_Textbox.get(1).click();
		Send_Icon.click();
		
	}

	// Test Case ID: Home_00012
	// Test Scenario: Verify if the user can post poll with valid data.
	public void PostPollWithValidData(String WhatsThisPollABout, String Option1, String Option2) {
		Poll_Icon.click();
		WhatsThisPollAbout_Textbox.sendKeys(WhatsThisPollABout);
		Option_Textbox.get(0).sendKeys(Option1);
		Option_Textbox.get(1).sendKeys(Option2);
		Send_Icon.click();
		List<String> getChoices = new ArrayList<String>();
		for (WebElement item : PollChoices) {
			getChoices.add(item.getText().toString());
		}
		System.out.println(getChoices.toString());
		Assert.assertTrue(Text_ContentPost.getText().contains(WhatsThisPollABout.toString())
				&& getChoices.toString().contains(Option1.toString() + ", " + Option2.toString()));
		System.out.println(getChoices.toString());
		System.out.println(Option1 + ", " + Option2);
	}

	// Test Case ID: Home_00013
	// Test Scenario: Verify if the user can post poll with more than two option.
	public void PostPollWithMoreThanTwoOption(String WhatsThisPollABout, String Option1, String Option2, String Option3,
			String Option4) {
		Poll_Icon.click();
		WhatAreYouWorkinOn_Textbox.sendKeys(WhatsThisPollABout);
		AddOption_Button.click();
		AddOption_Button.click();
		Option_Textbox.get(0).sendKeys(Option1);
		Option_Textbox.get(1).sendKeys(Option2);
		Option_Textbox.get(2).sendKeys(Option3);
		Option_Textbox.get(3).sendKeys(Option4);
		Send_Icon.click();
		List<String> getChoices = new ArrayList<String>();
		for (WebElement item : PollChoices) {
			getChoices.add(item.getText().toString());
		}

		
		Assert.assertTrue(Text_ContentPost.getText().contains(WhatsThisPollABout.toString())
				&& getChoices.toString().contains(Option1.toString() + ", " + Option2.toString() + ", "
						+ Option3.toString() + ", " + Option4.toString()));
		System.out.println(getChoices.toString());
		System.out.println(Option1 + ", " + Option2 + ", " + Option3 + ", " + Option4);

	}

	// Test Case ID: Home_0014
	// Test Scenario: Verify if the user can add new category on event.
	public void AddNewCategory(String CategoryName, String SelectColor) {
		Event_Icon.click();
		ScrollInto_SelectCategory.click();
		AddNewCategory_Button.click();
		CategoryName_Textbox.sendKeys(CategoryName);
		SelectPicker_Textbox.sendKeys(SelectColor);
		SaveCategory_Button.click();
		List<String> getCategoryName = new ArrayList<String>();
		for (WebElement item : Category_Name) {
			getCategoryName.add(item.getText().toString());
		}
		
		Assert.assertTrue(getCategoryName.toString().contains(CategoryName.toString()));
		System.out.println(getCategoryName.toString());
		System.out.println(CategoryName.toString());

	}

	// Test Case ID: Home_0015
	// Test Scenario: Verify if the user can edit category on event.
	public void EditCategory(String CategoryName, String SelectColor) {
		Event_Icon.click();
		ScrollInto_SelectCategory.click();
		MoreIcon.click();
		Edit_Category.click();
		CategoryName_Textbox.clear();
		SelectPicker_Textbox.clear();
		CategoryName_Textbox.sendKeys(CategoryName);
		SelectPicker_Textbox.sendKeys(SelectColor);
		SaveCategory_Button.click();
		List<String> getCategoryName = new ArrayList<String>();
		for (WebElement item : Category_Name) {
			getCategoryName.add(item.getText().toString());
		}
		Assert.assertTrue(getCategoryName.toString().contains(CategoryName.toString()));
		System.out.println(getCategoryName.toString());
		System.out.println(CategoryName.toString());

	}

	// Test Case ID: Home_0017
	// Test Scenario: Verify if the user can delete category on event.

	public void DeleteCategory() {
		Event_Icon.click();
		ScrollInto_SelectCategory.click();
		String DeleteCategoryName = Category_Name.get(0).getText();
		MoreIcon.click();
		Delete_Category.click();
		Proceed_Button.click();
		List<String> getCategoryName = new ArrayList<String>();
		for (WebElement item : Category_Name) {
			getCategoryName.add(item.getText().toString());
		}
		Assert.assertTrue(!getCategoryName.toString().contains(DeleteCategoryName));

	}

	// Test Case ID: Home_0017
	// Test Scenario: Verify if the user can post Event with valid data on the
	// fields.
	public void PostEventWithValidData() {
		Event_Icon.click();
		SaySomething_Textbox.sendKeys("Test");
		EventName_Textbox.sendKeys("Test Event");
		AboutTheEvent_Textbox.sendKeys("Lorem ipsum");
		AddAPlace_Textbox.sendKeys("Malolos, Bulacan");
		StartDate_Textbox.sendKeys("September 07, 2019 8:30 AM");
		EndDate_Textbox.sendKeys("September 07, 2019 5:00 PM");
	}

	// Test Case ID: Home_0018
	// Test Scenario: Verify if the user can post Event as Holiday with valid data.

	public void PostEventAsHoliday(String SaySomething, String EventName, String AboutEvent, String Place,
			String StartDate, String EndDate) {
		Event_Icon.click();
		MarkThisAsHoliday_Checkbox.click();
		SaySomething_Textbox.sendKeys(SaySomething);
		EventName_Textbox.sendKeys(EventName);
		AboutTheEvent_Textbox.sendKeys(AboutEvent);
		StartDate_Textbox.sendKeys(StartDate);
		EndDate_Textbox.sendKeys(EndDate);
		SelectCategory.click();
		Category_Name.get(0).click();
		Send_Icon.click();
		Assert.assertTrue(Text_ContentPost.getText().contains(SaySomething.toString())
						&& EventName_Text.getText().contains(EventName.toString())
						&& AboutTheEvent_Text.getText().contains(AboutEvent.toString())
						&& DateTime_Text.getText().contains(StartDate.toString() + " " + EndDate.toString()));
	}

	// Test Case ID: Home_0019
	// Test Scenario: Verify if the user can post Annual Event with valid data.

	public void PostAnnualEvent(String SaySomething, String EventName, String AboutEvent, String Place,
			String StartDate, String EndDate) {

		Event_Icon.click();
		MarkThisAsHoliday_Checkbox.click();
		AnnualEvent_ToggleButton.click();
		SaySomething_Textbox.sendKeys(SaySomething);
		EventName_Textbox.sendKeys(EventName);
		AboutTheEvent_Textbox.sendKeys(AboutEvent);
		StartDate_Textbox.sendKeys(StartDate);
		EndDate_Textbox.sendKeys(EndDate);
		SelectCategory.click();
		Category_Name.get(1).click();
		Send_Icon.click();
		Assert.assertTrue( Text_ContentPost.getText().contains(SaySomething.toString())
						&& EventName_Text.getText().contains(EventName.toString())
						&& AboutTheEvent_Text.getText().contains(AboutEvent.toString())
						&& DateTime_Text.getText().contains(StartDate.toString() + " " + EndDate.toString()));
		System.out.println(Text_ContentPost.getText().toString());
		System.out.println(EventName_Text.getText().toString());
		System.out.println(AboutTheEvent_Text.getText().toString());
		System.out.println(DateTime_Text.getText().toString());

	}

	// Test Case ID: Home_0020
	// Test Scenario: Verify if the user can post announcement with valid data.
	public void PostAnnouncementWithValidData(String ThisAnnouncementisAbout, String TypeYourAnnouncementDetails) {
		Status_Icon.click();
		Announcement_Icon.click();
		ThisAnnouncementisAbout_Textbox.sendKeys(ThisAnnouncementisAbout);
		TypeYourAnnouncementDetails_Textbox.sendKeys(TypeYourAnnouncementDetails);
		Send_Icon.click();
		Assert.assertTrue(ThisAnnouncementisAbout_Text.getText().contains(ThisAnnouncementisAbout.toString())
				&& TypeYourAnnouncementDetails_Text.getText().contains(TypeYourAnnouncementDetails.toString()));
	}

	// Test Case ID: Home_0021
	// Test Scenario: Verify if the user can edit his/her status post on home page.

	public void EditStatusPost(String WhatAreYouWorkingOn, String TagAPersonOrGroup, String TagAPersonOrGroup2,
			String Hashtag) {
		
		Profile_Icon.click();
		String Name = Name_Text.getText();
		Home_Icon.click();
		do {
			if (!Header_Text.getText().contains(Name + " posted a Status")) {
				scroll();
			}
		}

		while (!Header_Text.getText().contains(Name + " posted a Status"));
		{
			if (Header_Text.getText().contains(Name + " posted a Status")) {
				MoreIcon.click();
				EditPost_Icon.click();
				WhatAreYouWorkinOn_Textbox.clear();
				WhatAreYouWorkinOn_Textbox.sendKeys(WhatAreYouWorkingOn);
				Send_Icon.click();
				Assert.assertTrue(Text_ContentPost.getText().contains(WhatAreYouWorkingOn));
			}

		}

	}

	// Test Case ID: Home_0022
	// Test Scenario: Verify if the user can edit his/her poll post on home page.

	public void EditPollPost(String WhatsThisPollAbout, String Option1, String Option2, String Option3, String Option4)
			throws InterruptedException {
		
		Profile_Icon.click();
		String Name = Name_Text.getText();
		Home_Icon.click();

		do {
			if (!Header_Text.getText().contains(Name+" posted a Poll")) {
				scroll();
			}

		}

		while (!Header_Text.getText().contains(Name+" posted a Poll"));

		{
			if (Header_Text.getText().contains(Name+" posted a Poll")) {
				MoreIcon.click();
				EditPost_Icon.click();
				WhatsThisPollAbout_Textbox.clear();
				WhatsThisPollAbout_Textbox.sendKeys(WhatsThisPollAbout);
				Option_Textbox.get(0).sendKeys(Option1);
				Option_Textbox.get(1).sendKeys(Option2);
				Option_Textbox.get(2).sendKeys(Option3);
				Option_Textbox.get(3).sendKeys(Option4);
				Send_Icon.click();
				List<String> getPollChoices = new ArrayList<String>();
				for(WebElement item : PollChoices)
				{
					getPollChoices.add(item.getText().toString());
				}
				Assert.assertTrue(Text_ContentPost.getText().contains(WhatsThisPollAbout) && getPollChoices.toString().contains(Option1 +", "+Option2+", "+Option3+", "+Option4));
				System.out.println(getPollChoices.toString());
				System.out.println(Option1 +", "+Option2+", "+Option3+" ,"+Option4);
			}

		}

	}

	// Test Case ID: Home_0023
	// Test Scenario: Verify if the user can edit his/her event post on home page.

	public void EditEventPost(String SaySomething, String EventName, String AboutTheEvent, String StartDate,
			String EndDate) {
		
		Profile_Icon.click();
		String Name = Name_Text.getText();
		Home_Icon.click();
		do {
			if (!Header_Text.getText().contains(Name+" posted an Event"))
				scroll();
		}

		while (!Header_Text.getText().contains(Name+" posted an Event"));

		{
			if (Header_Text.getText().contains(Name+" posted an Event")) {
				MoreIcon.click();
				EditPost_Icon.click();
				SaySomething_Textbox.clear();
				SaySomething_Textbox.sendKeys();
				Send_Icon.click();
				Assert.assertTrue(Text_ContentPost.getText().contains(SaySomething.toString())
						&& EventName_Text.getText().contains(EventName.toString())
						&& AboutTheEvent_Text.getText().contains(AboutTheEvent.toString())
						&& DateTime_Text.getText().contains(StartDate.toString() + " " + EndDate.toString()));
			}

		}
	}

	// Test Case ID: Home_0024
	// Test Scenario: Verify if the user can search colleague or group.
	public void SearchColleagueOrGroup(String SearchMolly) {
		Search_Icon.click();
		SearchMolly_Textbox.sendKeys(SearchMolly);
		List<String> getRes = new ArrayList<String>();
		for (WebElement item : ColleagueOrGroupName_Text) {
			getRes.add(item.getText().toString());
		}
		Assert.assertTrue(getRes.toString().contains(SearchMolly.toString()));

	}

	// Test Case ID: Home_0025
	// Test Scenario: Verify if the user can view profile of colleague or group thru
	// search.

	public void ViewProfile(String SearchMolly) {
		Search_Icon.click();
		SearchMolly_Textbox.sendKeys(SearchMolly);
		ColleagueOrGroup_Picture.click();
		Assert.assertEquals(ColleagueOrGroup_Name.getText(), SearchMolly);

	}

	// Test Case ID: Home_0027
	// Test Scenario: Verify if the user can search colleague on Search Colleagues.
	public void SearchColleague(String ColleagueName) {
		Navigation_Icon.click();
		SearchMolly_Textbox.sendKeys(ColleagueName);
		Assert.assertEquals(ColleagueOrGroup_Name.getText(), ColleagueName);
	}

	// Test Case ID: Home_0028
	// Test Scenario: Verify if the user can search colleague name and go to Compose
	// a Message page.
	public void SearchAndComposeAMessageToColleague(String ColleagueName) {
		Navigation_Icon.click();
		SearchMolly_Textbox.sendKeys(ColleagueName);
		ColleagueOrGroup_Name.click();
		Assert.assertTrue(ComposeMessagePage.isDisplayed() && ColleagueOrGroup_Name.getText().contains(ColleagueName)
				&& Message_Textbox.isDisplayed());

	}

	// Test Case ID: Home_0029
	// Test Scenario: Verify if the user can Like specific post on home page.
	public void LikePost() throws InterruptedException {

		do {
			Thread.sleep(2000);
			scroll();

		}

		while (ListFooter_Text.size() > 0 && ListFooter_Text.get(0).getText().contains("You liked this."));
		{
			int SizeOfLikeIcon = Like_Icon.size();
			;
			int SizeOfFooter = ListFooter_Text.size();
			int getSizeOfFooter = 0;

			for (int i = 0; i < SizeOfLikeIcon; i++) {
				if (ListFooter_Text.size() == 0) {
					Like_Icon.get(i).click();
					System.out.println(i);
				} else if (ListFooter_Text.size() >= 0
						&& !ListFooter_Text.get(0).getText().contains("You liked this.")) {
					Like_Icon.get(i).click();
					System.out.println(i);
				}

			}

			for (int i = 0; i < SizeOfFooter; i++) {
				getSizeOfFooter = i;
			}

			Assert.assertTrue(ListFooter_Text.get(getSizeOfFooter).getText().contains("You liked this."));

		}
	}

	// Test Case ID: Home_0030
	// Test Scenario: Verify if the user can Comment to specific post on home page.
	public void CommentToPost(String Comment) {
		do {
			scroll();
			if (Respond_Icon.size() > 0) {
				Respond_Icon.get(0).click();
				Comment_Textbox.sendKeys(Comment);
			}
		} while (Respond_Icon.size() == 0);
	}

	// Test Case ID: Home_0031
	// Test Scenario: Verify if the user can reply to a comment on the post.
	public void ReplyToComment(String Comment) throws InterruptedException {
		do {
			Thread.sleep(2000);
			scroll();
			if (ListFooter_Text.size() >= 1 && Footer_Text.getText().contains("Response") && Respond_Icon.size() >= 1) {
				Respond_Icon.get(0).click();
				Reply_Icon.click();
				Comment_Textbox.sendKeys(Comment);
				Send_Button.click();
				List<String> getCommentText = new ArrayList<String>();
				for (WebElement item : CommentContent_Text) {
					getCommentText.add(item.getText().toString());
				}
				Assert.assertTrue(getCommentText.toString().contains(Comment));

			}
		} while (ListFooter_Text.size() == 0 && !Footer_Text.getText().contains("Response") && Respond_Icon.size() == 0
				|| Comment_MoreIcon.size() == 0);
	}

	// Test Case ID: Home_0032
	// Test Scenario: Verify if the user can edit his/her Comment.
	public void EditComment(String Comment) throws InterruptedException {
		do {
			Thread.sleep(2000);
			scroll();
			if (ListFooter_Text.size() >= 1 && Footer_Text.getText().contains("Response") && Respond_Icon.size() >= 1) {
				Respond_Icon.get(0).click();

				if (Comment_MoreIcon.size() == 0) {
					Back_Icon.click();
				} else if (Comment_MoreIcon.size() > 0) {
					Comment_MoreIcon.get(0).click();
					Edit_Comment.click();
					Comment_Textbox.clear();
					Comment_Textbox.sendKeys(Comment);
					Send_Button.click();
					List<String> getComment = new ArrayList<String>();
					for (WebElement item : CommentContent_Text) {
						getComment.add(item.getText().toString());
					}
					Assert.assertTrue(getComment.toString().contains(Comment));
					System.out.println(getComment.toString());

				}

			}
		} while (ListFooter_Text.size() == 0 || !Footer_Text.getText().contains("Response") && Respond_Icon.size() == 0
				|| Comment_MoreIcon.size() == 0);

	}

	// Test Case ID: Home_0033
	// Test Scenario: Verify if the user can delete his/her Comment.
	public void DeleteComment() throws InterruptedException {
		do {

			scroll();
			if (ListFooter_Text.size() >= 1 && Footer_Text.getText().contains("Response") && Respond_Icon.size() >= 1) {

				Respond_Icon.get(0).click();

				if (Comment_MoreIcon.size() == 0) {
					Back_Icon.click();
				} else if (Comment_MoreIcon.size() > 0) {
					int FormerSizeOfComment = CommentContent_Text.size();
					Comment_MoreIcon.get(0).click();
					Delete_Comment.click();
					Proceed_Button.click();
					int TotalSizeOfComment = CommentContent_Text.size();
					int TotalSizeOfCommentAfterDelete = FormerSizeOfComment - 1;

					List<String> get = new ArrayList<String>();
					for (WebElement item : CommentContent_Text) {
						get.add(item.getText().toString());
					}
					System.out.println("Size: " + TotalSizeOfComment);
					System.out.println("Size after delete: " + TotalSizeOfCommentAfterDelete);
					System.out.println(get.toString());
					Assert.assertTrue(TotalSizeOfComment == TotalSizeOfCommentAfterDelete);
					break;
				}

			}
		} while (ListFooter_Text.size() == 0 || !Footer_Text.getText().contains("Response") && Respond_Icon.size() == 0
				|| Comment_MoreIcon.size() == 0);

	}

	// Test Case ID: Home_0034
	// Test Scenario: Verify if the user can delete his/her Post.
	public void DeletePost() throws InterruptedException {
		do {
			Thread.sleep(2000);
			scroll();
		} while (MoreIcon_List.size() == 0);
		{
			if (MoreIcon_List.size() > 0) {
				MoreIcon_List.get(0).click();
				DeletePost_Icon.click();
				Proceed_Button.click();
				String toastMessage = ToastMessage.getText();
				String expectedMessage = "Your post was successfully deleted.";
				Assert.assertTrue(toastMessage.equals(expectedMessage));
			}
		}

	}

	// Test Case ID: Home_0041
	// Test Scenario: Verify if the user can edit Announcement with valid data.
	public void EditAnnouncement(String ThisAnnouncementisAbout, String TypeYourAnnouncementDetails)
			throws InterruptedException {
		Profile_Icon.click();
		String Name = Name_Text.getText();
		Home_Icon.click();
		
		do 
		{
			if (!Header_Text.getText().contains(Name+" posted an Announcement")) {
				scroll();
			}

		} 
		while (!Header_Text.getText().contains(Name+" posted an Announcement"));
		{
			if (Header_Text.getText().contains(Name+" posted an Announcement")) {
				MoreIcon.click();
				EditPost_Icon.click();
				ThisAnnouncementisAbout_Textbox.clear();
				TypeYourAnnouncementDetails_Textbox.clear();
				ThisAnnouncementisAbout_Textbox.sendKeys(ThisAnnouncementisAbout);
				TypeYourAnnouncementDetails_Textbox.sendKeys(TypeYourAnnouncementDetails);
				Send_Icon.click();

				Assert.assertTrue(ThisAnnouncementisAbout_Text.getText().contains(ThisAnnouncementisAbout.toString())
						&& TypeYourAnnouncementDetails_Text.getText().contains(TypeYourAnnouncementDetails.toString()));
			}
		}
	}

	//// ----------------- Negative Testing -------------------////

	// Test Case ID: Home_0044
	// Test Scenario: Verify if the user can post Status without data on the fields.
	public void PostStatusWithoutData(String WhatAreYouWorkingOn, String TagAPersonOrGroup) {
		Status_Icon.click();
		WhatAreYouWorkinOn_Textbox.sendKeys(WhatAreYouWorkingOn);
		TagPersonOrGroup_Hashtag_Textbox.get(0).sendKeys(TagAPersonOrGroup);
		Send_Icon.click();
		String toastMessage = ToastMessage.getText();
		String expectedMessage = "Fill out status or attach an image.";
		Assert.assertEquals(toastMessage, expectedMessage);

	}

	// Test Case ID: Home_0045
	// Test Scenario: Verify if the user can post Status without data on the required fields.
	public void PostStatusWithoutDataOnRequiredField(String WhatAreYouWorkingOn, String TagAPersonOrGroup) {
		Status_Icon.click();
		WhatAreYouWorkinOn_Textbox.sendKeys(WhatAreYouWorkingOn);
		TagPersonOrGroup_Hashtag_Textbox.get(0).sendKeys(TagAPersonOrGroup);
		Image_Photo.click();
		Send_Icon.click();
		String toastMessage = ToastMessage.getText();
		String expectedMessage = "Fill out status or attach an image.";
		Assert.assertEquals(toastMessage, expectedMessage);
	}

	// Test Case ID: Home_0046
	// Test Scenario: Verify if the user can post Poll without data on the fields.
	public void PostPollWithoutData(String WhatsThisPollABout, String Option1, String Option2) {
		Poll_Icon.click();
		WhatsThisPollAbout_Textbox.sendKeys(WhatsThisPollABout);
		Option_Textbox.get(0).sendKeys(Option1);
		Option_Textbox.get(1).sendKeys(Option2);
		Send_Icon.click();
		String toastMessage = ToastMessage.getText();
		String expectedMessage = "All fields are required.";
		Assert.assertEquals(toastMessage, expectedMessage);

	}

	// Test Case ID: Home_0047
	// Test Scenario: Verify if the user can post Poll without data on Add an option field.
	public void PostPollWithoutDataOnAddAnOption(String WhatsThisPollABout, String Option1, String Option2) {
		Poll_Icon.click();
		WhatsThisPollAbout_Textbox.sendKeys(WhatsThisPollABout);
		Option_Textbox.get(0).sendKeys(Option1);
		Option_Textbox.get(1).sendKeys(Option2);
		Send_Icon.click();
		String toastMessage = ToastMessage.getText();
		String expectedMessage = "All fields are required.";
		Assert.assertEquals(toastMessage, expectedMessage);
	}

	// Test Case ID: Home_0048
	// Test Scenario: Verify if the user can post Poll without data on What's this poll about? field.
	public void PostPollWithoutDataOnWhatsThisPollAbout(String WhatsThisPollABout, String Option1, String Option2) {
		Poll_Icon.click();
		WhatsThisPollAbout_Textbox.sendKeys(WhatsThisPollABout);
		Option_Textbox.get(0).sendKeys(Option1);
		Option_Textbox.get(1).sendKeys(Option2);
		Send_Icon.click();
		String toastMessage = ToastMessage.getText();
		String expectedMessage = "All fields are required.";
		Assert.assertEquals(toastMessage, expectedMessage);
	}

	// Test Case ID: Home_0049
	// Test Scenario: Verify if the user can post Poll with one option only.
	public void PostPollWithOneOptionOnly(String WhatsThisPollABout, String Option1, String Option2) {
		Poll_Icon.click();
		WhatsThisPollAbout_Textbox.sendKeys(WhatsThisPollABout);
		Option_Textbox.get(0).sendKeys(Option1);
		Option_Textbox.get(1).sendKeys(Option2);
		Send_Icon.click();
		String toastMessage = ToastMessage.getText();
		String expectedMessage = "All fields are required.";
		Assert.assertEquals(toastMessage, expectedMessage);
	}

	// Test Case ID: Home_0050
	// Test Scenario: Verify if the user can post Poll with same data on the option fields.
	public void PostPollWithSameDataOnAddAnOption(String WhatsThisPollABout, String Option1, String Option2) {
		Poll_Icon.click();
		WhatsThisPollAbout_Textbox.sendKeys(WhatsThisPollABout);
		Option_Textbox.get(0).sendKeys(Option1);
		Option_Textbox.get(1).sendKeys(Option2);
		Send_Icon.click();
		String toastMessage = ToastMessage.getText();
		String expectedMessage = "Choices cannot be repeated. Please input a new one.";
		Assert.assertEquals(toastMessage, expectedMessage);
	}

	// Test Case ID: Home_0051
	// Test Scenario: Verify if the user can post Event without data on the fields.
	public void PostEventWithoutData(String SaySomething, String EventName, String AbouTheEvent, String Place,
			String StartDate, String EndDate) {
		Event_Icon.click();
		SaySomething_Textbox.sendKeys(SaySomething);
		EventName_Textbox.sendKeys(EventName);
		AboutTheEvent_Textbox.sendKeys(AbouTheEvent);
		StartDate_Textbox.sendKeys(StartDate);
		EndDate_Textbox.sendKeys(EndDate);
		Send_Icon.click();
		String toastMessage = ToastMessage.getText();
		String expectedMessage = "Event name, event description, location, start date and category are required fields.";
		Assert.assertEquals(toastMessage, expectedMessage);
	}

	// Test Case ID: Home_0056
	// Test Scenario: Verify if the user can Add New Category without data on the fields.
	public void AddNewCategoryWithoutData(String CategoryName, String Color) {
		Event_Icon.click();
		ScrollInto_SelectCategory.click();
		AddNewCategory_Button.click();
		CategoryName_Textbox.sendKeys(CategoryName);
		SelectPicker_Textbox.sendKeys(Color);
		SaveCategory_Button.click();
		String toastMessage = ToastMessage.getText();
		String expectedMessage = "All fields are required.";
		Assert.assertEquals(toastMessage, expectedMessage);

	}

	// Test Case ID: Home_0057
	// Test Scenario: Verify if the user can Add New Category without data on
	// Category Name field.
	public void AddNewCategoryWithoutDataOnCategoryName(String CategoryName, String Color) {
		Event_Icon.click();
		ScrollInto_SelectCategory.click();
		AddNewCategory_Button.click();
		CategoryName_Textbox.sendKeys(CategoryName);
		SelectPicker_Textbox.sendKeys(Color);
		SaveCategory_Button.click();
		String toastMessage = ToastMessage.getText();
		String expectedMessage = "All fields are required.";
		Assert.assertEquals(toastMessage, expectedMessage);

	}

	// Test Case ID: Home_0058
	// Test Scenario: Verify if the user can Add New Category without data on Select Color field.
	public void AddNewCategoryWithoutSelectColor(String CategoryName, String Color) {
		Event_Icon.click();
		ScrollInto_SelectCategory.click();
		AddNewCategory_Button.click();
		CategoryName_Textbox.sendKeys(CategoryName);
		SelectPicker_Textbox.sendKeys(Color);
		SaveCategory_Button.click();
		String toastMessage = ToastMessage.getText();
		String expectedMessage = "All fields are required.";
		Assert.assertEquals(toastMessage, expectedMessage);

	}
	
	// Test Case ID: Home_0059
	// Test Scenario: Verify if the user can Edit Category without data on the fields.
		public void EditCategoryWithoutData(String CategoryName, String Color) 
		{
			Event_Icon.click();
			ScrollInto_SelectCategory.click();
			MoreIcon.click();
			Edit_Category.click();
			CategoryName_Textbox.clear();
			SelectPicker_Textbox.clear();
			CategoryName_Textbox.sendKeys(CategoryName);
			SelectPicker_Textbox.sendKeys(Color);
			SaveCategory_Button.click();
			String toastMessage = ToastMessage.getText();
			String expectedMessage = "All fields are required.";
			Assert.assertEquals(toastMessage, expectedMessage);

		}
		
	// Test Case ID: Home_0060
	// Test Scenario: Verify if the user can Edit Category without data on Category Name field..
		public void EditCategoryWithoutDataOnCategoryName(String CategoryName, String Color) 
		{
				Event_Icon.click();
				ScrollInto_SelectCategory.click();
				MoreIcon.click();
				Edit_Category.click();
				CategoryName_Textbox.clear();
				SelectPicker_Textbox.clear();
				CategoryName_Textbox.sendKeys(CategoryName);
				SelectPicker_Textbox.sendKeys(Color);
				SaveCategory_Button.click();
				String toastMessage = ToastMessage.getText();
				String expectedMessage = "All fields are required.";
				Assert.assertEquals(toastMessage, expectedMessage);

		}
		
	//Test Case ID: Home_0061
	//Test Scenario: Verify if the user can post Announcement without data on the fields.
		public void PostAnnouncementWithoutData(String ThisAnnouncementIsAbout, String TypeYourAnnouncementDetails)
		{
			Status_Icon.click();
			Announcement_Icon.click();
			ThisAnnouncementisAbout_Textbox.sendKeys(ThisAnnouncementIsAbout);
			TypeYourAnnouncementDetails_Textbox.sendKeys(TypeYourAnnouncementDetails);
			Send_Icon.click();
			String toastMessage = ToastMessage.getText();
			String expectedMessage = "All fields are required.";
			Assert.assertEquals(toastMessage, expectedMessage);
		}
		
		//Test Case ID: Home_0062
		//Test Scenario: Verify if the user can Post Announcement without data on This announcement is about field..
			public void PostAnnouncementWithoutDataOnThisAnnouncementIsAbout(String ThisAnnouncementIsAbout, String TypeYourAnnouncementDetails)
			{
				Status_Icon.click();
				Announcement_Icon.click();
				ThisAnnouncementisAbout_Textbox.sendKeys(ThisAnnouncementIsAbout);
				TypeYourAnnouncementDetails_Textbox.sendKeys(TypeYourAnnouncementDetails);
				Send_Icon.click();
				String toastMessage = ToastMessage.getText();
				String expectedMessage = "All fields are required.";
				Assert.assertEquals(toastMessage, expectedMessage);
			}
			
			//Test Case ID: Home_0063
			//Test Scenario: Verify if the user can Post Announcement without data on Type your announcement details field.
				public void PostAnnouncementWithoutDataOnTypeYourAnnouncmentDetails(String ThisAnnouncementIsAbout, String TypeYourAnnouncementDetails)
				{
					Status_Icon.click();
					Announcement_Icon.click();
					ThisAnnouncementisAbout_Textbox.sendKeys(ThisAnnouncementIsAbout);
					TypeYourAnnouncementDetails_Textbox.sendKeys(TypeYourAnnouncementDetails);
					Send_Icon.click();
					String toastMessage = ToastMessage.getText();
					String expectedMessage = "All fields are required.";
					Assert.assertEquals(toastMessage, expectedMessage);
				}
				
		//Test Case ID: Home_0065
		//Test Scenario: Verify if the user can edit Status without data on the required fields.
		public void EditPostStatusWithoutData()
		{
			Profile_Icon.click();
			String Name = Name_Text.getText();
			Home_Icon.click();
			do 
			{
				if(!Header_Text.getText().contains(Name+" posted a Status"))
				{
					scroll();
				}
			} 
			while (!Header_Text.getText().contains(Name+" posted a Status"));
			{
				if(Header_Text.getText().contains(Name+" posted a Status"))
				{
					MoreIcon.click();
					EditPost_Icon.click();
					WhatAreYouWorkinOn_Textbox.clear();
					//TagPersonOrGroup_Textbox.clear();
					System.out.println(Name);
				}
				
				
				
			}
		}
		
		

}
