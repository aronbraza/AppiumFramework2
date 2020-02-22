package HiMollyAppPageObjects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.xmlbeans.impl.xb.xsdschema.impl.PublicImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
import org.springframework.context.annotation.Profile;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.events.Event.ID;

import com.google.common.io.BaseEncoding;

import WOG.AppiumFramework.base;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ProfilePage extends base {

	public ProfilePage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.wog.himolly:id/img_dp")
	public WebElement Profile_Picture;
	
	
	//Status
	@AndroidFindBy(id = "com.wog.himolly:id/lnr_status")
	public WebElement Status_Icon;
		
	@AndroidFindBy(id = "com.wog.himolly:id/action_send")
	public WebElement Send_Icon;
		
	@AndroidFindBy(id = "com.wog.himolly:id/txt_content")
	public WebElement WhatAreYouWorkinOn_Textbox;
		
	@AndroidFindBy(uiAutomator = "text(\"Tag a person or group\")")
	public WebElement TagPersonOrGroup_Textbox;
		
	@AndroidFindBy(uiAutomator = "text(\"Add a hashtag\")")
	public WebElement Hashtag_Textbox;
		
	@AndroidFindBy(id ="com.wog.himolly:id/txt_hashtag")
	public WebElement Hashtag_Text;
		
	@AndroidFindBy(id ="com.wog.himolly:id/btn_tag_person")
	public WebElement TagPersonOrGroup_Icon;
		
	@AndroidFindBy(id ="com.wog.himolly:id/btn_add_hashtag")
	public WebElement Hashtag_Icon;
		
	@AndroidFindBy(xpath ="//android.widget.Button[@resource-id='com.wog.himolly:id/btn_add_image']")
	public WebElement Camera_Icon;
		
	@AndroidFindBy (id = "com.wog.himolly:id/check_view")
	public List<WebElement> CheckView_Photo;
		
	@AndroidFindBy (id = "com.wog.himolly:id/photo_thumbnail")
	public WebElement Photo_Thumbnail;
		
	@AndroidFindBy (id = "com.wog.himolly:id/button_apply")
	public WebElement Apply_Button;
		
	@AndroidFindBy (id = "com.wog.himolly:id/button_preview")
	public WebElement Preview_Button;
		
	@AndroidFindBy (id = "com.wog.himolly:id/button_preview")
	public WebElement Back_Button;
		
	@AndroidFindBy (id = "com.wog.himolly:id/btn_remove")
	public List<WebElement> RemoveImage_Icon;

		
	@AndroidFindBy (id ="com.wog.himolly:id/img_thumbnail")
	public WebElement Attached_Image;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_content")
	public WebElement Text_ContentPost;
	
	//Poll
	
	@AndroidFindBy(id = "com.wog.himolly:id/lnr_poll")
	public WebElement Poll_Icon;
	
	@AndroidFindBy (id = "com.wog.himolly:id/txt_content")
	public WebElement WhatsThisPollAbout_Textbox;
	
	@AndroidFindBy (id ="com.wog.himolly:id/txt_label")
	public List<WebElement> Option_Textbox;
	
	@AndroidFindBy (id ="com.wog.himolly:id/img_add")
	public WebElement AddOption_Button;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_label")
	public List<WebElement> PollChoices;
	
	
	//Event
	@AndroidFindBy (id ="com.wog.himolly:id/lnr_event")
	public WebElement Event_Icon;
		
	@AndroidFindBy (id ="com.wog.himolly:id/txt_content")
	public WebElement SaySomething_Textbox;
		
	@AndroidFindBy (id ="com.wog.himolly:id/txt_content")
	public WebElement UploadEventBanner_Button;
		
	@AndroidFindBy (id ="com.wog.himolly:id/txt_name")
	public WebElement EventName_Textbox;
		
	@AndroidFindBy (id ="com.wog.himolly:id/txt_detail")
	public WebElement AboutTheEvent_Textbox;
		
	@AndroidFindBy (id ="com.wog.himolly:id/cb_holiday")
	public WebElement MarkThisAsHoliday_Checkbox;
		
	@AndroidFindBy (id ="com.wog.himolly:id/txt_place")
	public WebElement AddAPlace_Textbox;
		
	@AndroidFindBy (id ="com.wog.himolly:id/txt_start")
	public WebElement StartDate_Textbox;
		
	@AndroidFindBy (id ="com.wog.himolly:id/txt_end")
	public WebElement EndDate_Textbox;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_title")
	public WebElement EventName_Text;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_description")
	public WebElement AboutTheEvent_Text;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_time")
	public WebElement DateTime_Text;
		
	//Category
	
	@AndroidFindBy (id ="com.wog.himolly:id/lnr_category")
	public WebElement SelectCategory;
		
	@AndroidFindBy (xpath ="//android.widget.TextView[@text='ADD NEW CATEGORY']")
	public WebElement AddNewCategory_Button;
		
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Select Category\"));")
	public WebElement ScrollInto_SelectCategory;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@resource-id='com.wog.himolly:id/txt_name']")
	public List<WebElement> Category_Name;
			
	@AndroidFindBy (id ="com.wog.himolly:id/dlg_txt_input")
	public WebElement CategoryName_Textbox;
		
	@AndroidFindBy (id = "com.wog.himolly:id/txt_picker")
	public WebElement SelectPicker_Textbox;
		
	@AndroidFindBy (id ="com.wog.himolly:id/txt_positive")
	public WebElement SaveCategory_Button;
		
	@AndroidFindBy (id ="Cancel")
	public WebElement CancelCategory_Button;
	
	
	//Announcement
	@AndroidFindBy (uiAutomator ="text(\"Announcement\")")
	public WebElement Announcement_Icon;
		
	@AndroidFindBy (id ="com.wog.himolly:id/txt_title")
	public WebElement ThisAnnouncementisAbout_Textbox;
		
	@AndroidFindBy (id ="com.wog.himolly:id/txt_detail")
	public WebElement TypeYourAnnouncementDetails_Textbox;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_title")
	public WebElement ThisAnnouncementisAbout_Text;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_detail")
	public WebElement TypeYourAnnouncementDetails_Text;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Home']")
	public WebElement Home_Icon;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Profile']")
	public WebElement Profile_Icon;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='About']")
	public WebElement About_Tab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Files']")
	public WebElement Files_Tab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Groups']")
	public WebElement Groups_Tab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Events']")
	public WebElement Events_Tab;

	@AndroidFindBy(accessibility = "Navigate up")
	public WebElement Back_Icon;

	@AndroidFindBy(id = "com.wog.himolly:id/btn_save")
	public WebElement UpdateProfile_Button;

	@AndroidFindBy(id = "com.wog.himolly:id/btn_positive")
	public WebElement Proceed_Button;

	@AndroidFindBy(id = "com.wog.himolly:id/btn_negative")
	public WebElement Cancel_Button;
	
	
	@AndroidFindBy(id ="com.wog.himolly:id/img_photo")
	public WebElement Image_Photo;
	
	@AndroidFindBy(id = "com.wog.himolly:id/toolbar")
	public WebElement Toolbar;

	@AndroidFindBy(xpath = "//android.widget.Toast[1]")
	public WebElement ToastMessage;

	// Personal Information
	@AndroidFindBy(id = "com.wog.himolly:id/btn_edit_personal_info")
	public WebElement PersonalInformation_EditIcon;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_first_name")
	public WebElement FirstName_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_middle_name")
	public WebElement MiddleName_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_last_name")
	public WebElement LastName_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_suffix")
	public WebElement Suffix_Textbox;

	
	
	@AndroidFindBy(id = "com.wog.himolly:id/txt_birth_date")
	public WebElement Birthdate_Textbox;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.wog.himolly:id/txt_expertise']")
	public WebElement Expertise_Textbox;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.wog.himolly:id/txt_interest']")
	public WebElement Interests_Textbox;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_name")
	public WebElement FullName_Text;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_birthdate")
	public WebElement BirthDate_Text;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@resource-id='com.wog.himolly:id/txt_expertise']")
	public WebElement Expertise_Text;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@resource-id='com.wog.himolly:id/txt_interest']")
	public WebElement Interests_Text;
	

	// Contact Information
	@AndroidFindBy(id = "com.wog.himolly:id/btn_edit_contact_info")
	public WebElement ContactInformation_EditIcon;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.wog.himolly:id/txt_address']")
	public WebElement CompleteAddress_Textbox;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.wog.himolly:id/txt_phone']")
	public WebElement PhoneNumber_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_mobile")
	public WebElement MobileNumber_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_email")
	public WebElement EmailAddress_Textbox;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.wog.himolly:id/txt_name']")
	public WebElement ContactPersonName_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_relationship")
	public WebElement Relationship_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_contact")
	public WebElement ContactNumber_Textbox;
	
	@AndroidFindBy(id = "com.wog.himolly:id/txt_address")
	public WebElement CompleteAddress_Text;
	
	@AndroidFindBy(id = "com.wog.himolly:id/txt_phone")
	public WebElement PhoneNumber_Text;
	
	@AndroidFindBy(id = "com.wog.himolly:id/txt_mobile")
	public WebElement MobileNumber_Text;
	
	@AndroidFindBy(id = "com.wog.himolly:id/txt_name")
	public WebElement ContactPersonName_Text;
	
	@AndroidFindBy(id = "com.wog.himolly:id/txt_relationship")
	public WebElement Relationship_Text;
	
	@AndroidFindBy(id = "com.wog.himolly:id/txt_contact")
	public WebElement ContactNumber_Text;
	
	@AndroidFindBy(id ="com.wog.himolly:id/lbl_contact_person")
	public WebElement ContactPerson_Label;

	// Educational Attainment

	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceId(\"com.wog.himolly:id/txt_add\").instance(0))")
	public WebElement AddEducationalAttainment_Button;

	@AndroidFindBy(id = "com.wog.himolly:id/btn_edit_educ_attainment")
	public WebElement EducationalAttainment_EditIcon;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.wog.himolly:id/txt_school']")
	public List<WebElement> School_Textbox;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.wog.himolly:id/txt_degree']")
	public List<WebElement> Degree_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/btn_remove")
	public List<WebElement> Remove_Button;

	// Duration Year on Educational Information and Professional Information

	@AndroidFindBy(id = "com.wog.himolly:id/txt_start")
	public List<WebElement> FromYear_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_end")
	public List<WebElement> ToYear_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/mdtp_month_text_view")
	public List<WebElement> Year;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_school")
	public List<WebElement> School_Text;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_degree")
	public List<WebElement> Degree_Text;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_since")
	public List<WebElement> Since_Text;
	


	// Professional Information

	@AndroidFindBy(id = "com.wog.himolly:id/btn_edit_prof_info")
	// id ="com.wog.himolly:id/btn_edit_prof_info"
	public WebElement ProfessionalInformation_EditIcon;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.wog.himolly:id/txt_company']")
	public List<WebElement> Company_Textbox;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.wog.himolly:id/txt_department']")
	public List<WebElement> Department_Textbox;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.wog.himolly:id/txt_job_title']")
	public List<WebElement> JobTitle_Textbox;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.wog.himolly:id/txt_accomplishment']")
	public List<WebElement> WorkAccomplishments_Textbox;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.wog.himolly:id/txt_certificate']")
	public List<WebElement> CertificatesReceived_Textbox;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.wog.himolly:id/txt_pro_skill']")
	public WebElement ProfessionalSkills_Textbox;

	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceId(\"com.wog.himolly:id/txt_add\").instance(0))")
	public WebElement AddCompany;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_company")
	public List<WebElement> Company_Text;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_duration")
	public List<WebElement> DurationOfService_Text;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_accomplishment")
	public List<WebElement> WorkAccomplishments_Text;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_certificate")
	public List<WebElement> CertificateReceived_Text;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_pro_skill")
	public WebElement ProfessionalSkills_Text;

	// Files Tab

	@AndroidFindBy(id = "com.wog.himolly:id/txt_search")
	public WebElement FilesTab_SearchBox;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@index='1']")
	public WebElement FilesTab_FilterIcon;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='All']")
	public WebElement All_Filter;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Documents']")
	public WebElement Documents_Filter;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Images']")
	public WebElement Images_Filter;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Videos']")
	public WebElement Videos_Filter;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Audio']")
	public WebElement Audio_Filter;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@index='2']")
	public List<WebElement> FilesTab_MoreIcon;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Rename']")
	public WebElement Rename;
	
	@AndroidFindBy(id ="com.wog.himolly:id/dlg_txt_input")
	public WebElement Rename_Textbox;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Download']")
	public WebElement Download;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Share']")
	public WebElement Share;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Share via link']")
	public WebElement ShareViaLink;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Share via email']")
	public WebElement ShareViaEmail;

	@AndroidFindBy(className = "android.widget.EditText")
	public WebElement ColleagueOrGroupName_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_add_note")
	public WebElement AddNote_Textbox;

	@AndroidFindBy(id = "com.wog.himolly:id/btn_positive")
	public WebElement Share_Button;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Delete']")
	public WebElement Delete;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_filename")
	public List<WebElement> FileName;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_size")
	public List<WebElement> FileNameSize;

	@AndroidFindBy(id = "com.wog.himolly:id/txt_notification")
	public WebElement TextNotification;
	
	//Group Tab
	
	@AndroidFindBy(id ="com.wog.himolly:id/btn_option")
	public List<WebElement> GroupTab_MoreIcon;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='View Group']")
	public WebElement ViewGroup;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Leave Group']")
	public WebElement LeaveGroup;
	
	@AndroidFindBy(id = "com.wog.himolly:id/txt_name")
	public List<WebElement> GroupNameText_OnGroupTab;
	
	@AndroidFindBy(id = "com.wog.himolly:id/txt_detail")
	public List<WebElement> NumberOfMemberText_OnGroupTab;
	
	//Group Profile
	@AndroidFindBy(id = "com.wog.himolly:id/txt_name")
	public List<WebElement> GroupNameText_OnGroupProfile;
	
	@AndroidFindBy(id = "com.wog.himolly:id/txt_detail")
	public List<WebElement> NumberOfMemberText_OnGroupProfile;
	
	//Event
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_title")
	public List<WebElement> EventName;
	
	@AndroidFindBy(id ="com.wog.himolly:id/txt_header")
	public List<WebElement> Header_Text;
	
	@AndroidFindBy(id ="com.wog.himolly:id/tv_file_name")
	public List<WebElement> FileName_Text;
	
	@AndroidFindBy(id ="com.wog.himolly:id/tv_file_size")
	public List<WebElement> FileNameSize_Text;
	

	// Scroll Method
	public void scrollToEducationalAttainmentEditIcon() {

		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.wog.himolly:id/drawer_layout\")).scrollIntoView("
						+ "new UiSelector().resourceId(\"com.wog.himolly:id/btn_edit_educ_attainment\"))");
	}

	public void scrollToProfessionalInformationEditIcon() {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.wog.himolly:id/drawer_layout\")).scrollIntoView("
						+ "new UiSelector().resourceId(\"com.wog.himolly:id/btn_edit_prof_info\"))");
	}

	public void scrollToUpdateProfileButton() {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceId(\"com.wog.himolly:id/btn_save\").instance(0))");
	}

	public void scrollToProfessionalSkills() {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceId(\"com.wog.himolly:id/txt_pro_skill\").instance(0))");
	}
	
	public void scrollToContactInformation() {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.wog.himolly:id/drawer_layout\")).scrollIntoView("
						+ "new UiSelector().resourceId(\"com.wog.himolly:id/lbl_contact_information\"))");
	}

	public void scrollUp() {

	
		Dimension dimension = driver.manage().window().getSize();
		int start = (int) dimension.width / 2;
		Double scrollHeightStart = dimension.getHeight() * 0.20;
		int scrollStart = scrollHeightStart.intValue();
		Double scrollHeightEnd = dimension.getHeight() * 0.50;
		int scrollEnd = scrollHeightEnd.intValue();
		
		TouchAction action = new TouchAction((PerformsTouchActions) driver);
		action.press(new PointOption().withCoordinates(start, scrollStart))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(0)))
				.moveTo(new PointOption().withCoordinates(start, scrollEnd)).release().perform();

	}
	
	public void scrollDown() {

		Dimension dimension = driver.manage().window().getSize();
		int start = (int) dimension.width / 2;
		Double scrollHeightStart = dimension.getHeight() * 0.50;
		int scrollStart = scrollHeightStart.intValue();
		Double scrollHeightEnd = dimension.getHeight() * 0.20;
		int scrollEnd = scrollHeightEnd.intValue();
		
		TouchAction action = new TouchAction((PerformsTouchActions) driver);
		action.press(new PointOption().withCoordinates(start, scrollStart))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(0)))
				.moveTo(new PointOption().withCoordinates(start, scrollEnd)).release().perform();

	}
	
	public void scroll() {		
		Dimension dimension = driver.manage().window().getSize();
		int start = (int) dimension.width / 2;
		Double scrollHeightStart = dimension.getHeight() * 0.70;
		int scrollStart = scrollHeightStart.intValue();
		Double scrollHeightEnd = dimension.getHeight() * 0.30;
		int scrollEnd = scrollHeightEnd.intValue();
		
		TouchAction action = new TouchAction((PerformsTouchActions) driver);
		action.press(new PointOption().withCoordinates(start, scrollStart))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(0)))
				.moveTo(new PointOption().withCoordinates(start, scrollEnd)).release().perform();
	}
	
	
	public void scrollToNoAvailableData() {

		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.wog.himolly:id/drawer_layout\")).scrollIntoView(new UiSelector().text(\"No available data.\"))");
	}
	
	//Test Case ID: Profile_0001
	//Test Scenario: Verify if the user can change his/her profile picture.
	
	public void ChangeProfilePicture()
	{
		Profile_Icon.click();
		Profile_Picture.click();
		CheckView_Photo.get(0).click();
		Apply_Button.click();
		Proceed_Button.click();
		String ExpectedMessage ="Your avatar was successfully updated.";
		String ActualMessage = ToastMessage.getText();
		Assert.assertEquals(ExpectedMessage, ActualMessage);
		
		
	}
	
	//Test Case ID: Profile_0002
	//Test Scenario: Verify if the user can post status on profile page with valid data. 
	
	public void PostStatusWithValidData(String WhatAreYouWorkingOn, String TagAPersonOrGroup, String Hashtag) throws InterruptedException
	{
		Profile_Icon.click();
		Status_Icon.click();
		Hashtag_Icon.click();
		WhatAreYouWorkinOn_Textbox.sendKeys(WhatAreYouWorkingOn);
		Send_Icon.click();
		String toastmessage = ToastMessage.getText();
		String expectedmessage = "Your post was successfully posted.";
		Assert.assertTrue(toastmessage.toString().contains(expectedmessage.toString()) && Text_ContentPost.getText().toString().contains(WhatAreYouWorkingOn.toString()));
		System.out.println(toastmessage.toString());
		System.out.println(Text_ContentPost.getText());
		System.out.println(WhatAreYouWorkingOn.toString());
	}
	
	
	//Test Case ID: Profile_0003
	//Test Scenario: Verify if the user can post image only on profile page.
	public void PostImageOnly()
	{
		Profile_Icon.click();
		Status_Icon.click();
		Camera_Icon.click();
		Photo_Thumbnail.click();
		CheckView_Photo.get(0).click();
		Apply_Button.click();
		Send_Icon.click();
		String toastmessage = ToastMessage.getText();
		String expectedmessage = "Your post was successfully posted.";
		Assert.assertEquals(toastmessage, expectedmessage);
	}
	
	//Test Case ID: Profile_0004
	//Test Scenario: Verify if the user can post multiple images on profile page.
	
	public void PostMultipleImages()
	{
		Profile_Icon.click();
		Status_Icon.click();
		Camera_Icon.click();
		CheckView_Photo.get(0).click();
		CheckView_Photo.get(1).click();
		Apply_Button.click();
		Send_Icon.click();
		String toastmessage = ToastMessage.getText();
		String expectedmessage = "Your post was successfully posted.";
		Assert.assertEquals(toastmessage, expectedmessage);
	}
	
	//Test Case ID: Profile_0005
	//Test Scenario: Verify if the user can delete attached image on Post Status page.
	
	public void RemoveAttachedImage() throws InterruptedException
	{
	
		try
		{
			Profile_Icon.click();
			Status_Icon.click();
			Camera_Icon.click();
			Photo_Thumbnail.click();
			CheckView_Photo.get(0).click();
			Apply_Button.click();
			RemoveImage_Icon.get(0).click();
			Assert.assertTrue(!Attached_Image.isDisplayed());
		}
		catch (NoSuchElementException e) 
		{
			System.out.println("No image attached.");
		}	
	}
	
	//Test Case ID: Profile_0006
	//Test Scenario: Verify if the user can delete multiple images on Post Status page.
	
	public void RemoveMultipleAttachedImages() throws InterruptedException
	{
		try
		{
			Profile_Icon.click();
			Status_Icon.click();
			Camera_Icon.click();
			CheckView_Photo.get(0).click();
			CheckView_Photo.get(1).click();
			Apply_Button.click();
			RemoveImage_Icon.get(0).click();
			RemoveImage_Icon.get(0).click();
			Assert.assertFalse(Attached_Image.isDisplayed());
		}
		catch (NoSuchElementException e)
		{
			System.out.println("No image attached.");
		}		
	}
	
	//Test Case ID: Profile_0007
	//Test Scenario: Verify if the user can post status on profile page with tag person or group.
	
	public void PostStatusWithValidDataWithTagPersonOrGroup(String WhatAreYouWorkingOn, String TagAPersonOrGroup, String TagAPersonOrGroup2, String Hashtag) throws InterruptedException
	{
		Profile_Icon.click();
		Status_Icon.click();
		Hashtag_Icon.click();
		WhatAreYouWorkinOn_Textbox.sendKeys(WhatAreYouWorkingOn);
		TagPersonOrGroup_Textbox.sendKeys(TagAPersonOrGroup);
		Image_Photo.click();
		Send_Icon.click();
		String toastmessage = ToastMessage.getText();
		String expectedmessage = "Your post was successfully posted.";
		List<String> getHeaderText = new ArrayList<String>();
		for(WebElement item : Header_Text)
		{
			getHeaderText.add(item.getText().toString());
		}
		Assert.assertTrue(toastmessage.contains(expectedmessage) && Text_ContentPost.getText().contains(WhatAreYouWorkingOn.toString()) && getHeaderText.toString().contains(TagAPersonOrGroup.toString()));
		System.out.println(Text_ContentPost.getText());
		System.out.println(getHeaderText.toString());
	}
	
	//Test Case ID: Profile_0013
	//Test Scenario: Verify if the user can post poll on profile page with valid data.
	public void PostPollWithValidData(String WhatsThisPollABout, String Option1, String Option2)
	{
		Profile_Icon.click();
		Poll_Icon.click();
		WhatsThisPollAbout_Textbox.sendKeys(WhatsThisPollABout);
		Option_Textbox.get(0).sendKeys(Option1);
		Option_Textbox.get(1).sendKeys(Option2);
		Send_Icon.click();
		List<String> getChoices = new ArrayList<String>();
		for(WebElement item : PollChoices )
		{
			getChoices.add(item.getText().toString());
		}
		System.out.println(getChoices.toString());
		String expectedmessage = "Your post was successfully posted.";
		String toastmessage = ToastMessage.getText();
		Assert.assertTrue(toastmessage.contains(expectedmessage) && Text_ContentPost.getText().contains(WhatsThisPollABout.toString()) && getChoices.toString().contains(Option1.toString()+", "+Option2.toString()) );
		System.out.println(getChoices.toString());
		System.out.println(Option1+", "+Option2);
		
			
	}
	
	//Test Case ID: Profile_0014
	//Test Scenario: Verify if the user can post poll on profile page with more than two option.
	
	public void PostPollWithMoreThanTwoOption(String WhatsThisPollABout, String Option1, String Option2, String Option3, String Option4)
	{
		Profile_Icon.click();
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
		for(WebElement item : PollChoices )
		{
			getChoices.add(item.getText().toString());
		}
		
		String expectedmessage = "Your post was successfully posted.";
		String toastmessage = ToastMessage.getText();
		Assert.assertTrue(toastmessage.contains(expectedmessage) && Text_ContentPost.getText().contains(WhatsThisPollABout.toString()) && getChoices.toString().contains(Option1.toString()+", "+Option2.toString()+", "+Option3.toString()+", "+Option4.toString()) );
		System.out.println(getChoices.toString());
		System.out.println(Option1+", "+Option2+", "+Option3 +", "+Option4);
		
		
	}
	
	//Test Case ID: Profile_0015
	//Test Scenario: Verify if the user can add new category on event. 
	
	public void AddNewCategory(String CategoryName, String SelectColor)
	{
		Profile_Icon.click();
		Event_Icon.click();
		ScrollInto_SelectCategory.click();
		AddNewCategory_Button.click();
		CategoryName_Textbox.sendKeys(CategoryName);
		SelectPicker_Textbox.sendKeys(SelectColor);
		SaveCategory_Button.click();
		List<String> getCategoryName = new ArrayList<String>();
		for(WebElement item : Category_Name)
		{
			getCategoryName.add(item.getText().toString());
		}
		String toastmessage = ToastMessage.getText();
		String expectedmessage = "New category was successfully added.";
		Assert.assertTrue(toastmessage.contains(expectedmessage) && getCategoryName.toString().contains(CategoryName.toString()));
		System.out.println(getCategoryName.toString());
		System.out.println(CategoryName.toString());
	}
	
	//Test Case ID: Profile_0020
	//Test Scenario: Verify if the user can post Annual Event with valid data. 
		
	
	
	//Test Case ID: Profile_0021
	//Test Scenario: Verify if the user can post announcement with valid data.
	
	public void PostAnnouncementWithValidData(String ThisAnnouncementisAbout, String TypeYourAnnouncementDetails )
	{
		Profile_Icon.click();
		Status_Icon.click();
		Announcement_Icon.click();
		ThisAnnouncementisAbout_Textbox.sendKeys(ThisAnnouncementisAbout);
		TypeYourAnnouncementDetails_Textbox.sendKeys(TypeYourAnnouncementDetails);
		Send_Icon.click();
		String toastmessage = ToastMessage.getText();
		String expectedmessage = "Your post was successfully posted.";
		Assert.assertTrue(toastmessage.contains(expectedmessage) && ThisAnnouncementisAbout_Text.getText().contains(ThisAnnouncementisAbout.toString()) && TypeYourAnnouncementDetails_Text.getText().contains(TypeYourAnnouncementDetails.toString()));
	}
	

	// Test Case ID: Profile_0030
	// Test Scenario: Verify if the user can edit his/her personal information.
	public void EditPersonalInformationWithValidData(String FirstName, String MiddleName, String LastName,
			String Suffix, String Birthdate, String Expertise, String Interests) {
		Profile_Icon.click();
		About_Tab.click();
		PersonalInformation_EditIcon.click();

		// Clear Data on text fields
		FirstName_Textbox.clear();
		MiddleName_Textbox.clear();
		LastName_Textbox.clear();
		Suffix_Textbox.clear();
		Birthdate_Textbox.clear();

		int ExpertiseTextLength = Expertise_Textbox.getText().length();
		int InterestTextLength = Interests_Textbox.getText().length();

		
		for (int i = 0; i <= ExpertiseTextLength; i++) {
			Expertise_Textbox.clear();
		}

		for (int i = 0; i <= InterestTextLength; i++) {
			Interests_Textbox.clear();
		}
		

		FirstName_Textbox.sendKeys(FirstName);
		MiddleName_Textbox.sendKeys(MiddleName);
		LastName_Textbox.sendKeys(LastName);
		Suffix_Textbox.sendKeys(Suffix);
		Birthdate_Textbox.sendKeys(Birthdate);
		Expertise_Textbox.sendKeys(Expertise);
		Interests_Textbox.sendKeys(Interests);
		UpdateProfile_Button.click();
		String expectedmessage = "Your profile was successfully updated.";
		String toastmessage = ToastMessage.getText();
		
		List<String> getPersonalInformation = new ArrayList<String>();
		getPersonalInformation.add(FullName_Text.getText());
		
		Assert.assertTrue(toastmessage.contains(expectedmessage) && toastmessage.contains(expectedmessage) && FullName_Text.getText().contains(FirstName+" "+MiddleName+" "+LastName+" "+Suffix) && BirthDate_Text.getText().contains(Birthdate) && Expertise_Text.getText().replaceAll("\\s+", "").contains(Expertise.replaceAll("\\s+", "")) && Interests_Text.getText().replaceAll("\\s+", "").contains(Interests.replaceAll("\\s+", "")));	
		System.out.println(FullName_Text.getText());
		System.out.println(BirthDate_Text.getText());
		System.out.println(Expertise_Text.getText());
		System.out.println(Interests_Text.getText().replaceAll("\\s+", "") +" "+Interests.replaceAll("\\s+", ""));
	}

	// Test Case ID: Profile_0031
	// Test Scenario: Verify if the user can edit his/her contact information.
	public void EditContactInformationWithValidData(String CompleteAddress, String PhoneNumber, String MobileNumber,
			String EmailAddress, String ContactPersonName, String Relationship, String ContactNumber) throws InterruptedException {
		Profile_Icon.click();
		About_Tab.click();		
		ContactInformation_EditIcon.click();

		// Clear Data on textfields.
		CompleteAddress_Textbox.clear();
		PhoneNumber_Textbox.clear();
		MobileNumber_Textbox.clear();
		ContactPersonName_Textbox.clear();
		Relationship_Textbox.clear();
		ContactNumber_Textbox.clear();

		CompleteAddress_Textbox.sendKeys(CompleteAddress);
		PhoneNumber_Textbox.sendKeys(PhoneNumber);
		MobileNumber_Textbox.sendKeys(MobileNumber);
		ContactPersonName_Textbox.sendKeys(ContactPersonName);
		Relationship_Textbox.sendKeys(Relationship);
		ContactNumber_Textbox.sendKeys(ContactNumber);
		UpdateProfile_Button.click();
		String expectedmessage = "Your profile was successfully updated.";
		String toastmessage = ToastMessage.getText();
		Thread.sleep(2000);
		scroll();
		//String expectedMessage = "Your profile was successfully updated.";
		//String toastMessage = ToastMessage.getText();
		Assert.assertTrue(toastmessage.contains(expectedmessage) && CompleteAddress_Text.getText().contains(CompleteAddress) && PhoneNumber_Text.getText().contains(PhoneNumber) && MobileNumber_Text.getText().contains(MobileNumber) && ContactPersonName_Text.getText().contains(ContactPersonName) && Relationship_Text.getText().contains(Relationship) && ContactNumber_Text.getText().contains(ContactNumber));
		System.out.println(CompleteAddress_Text.getText());
		System.out.println(PhoneNumber_Text.getText());
		System.out.println(MobileNumber_Text.getText());
		System.out.println(ContactPersonName_Text.getText());
		System.out.println(Relationship_Text.getText());
		System.out.println(ContactNumber_Text.getText());
		

	}

	// Test Case ID: Profile_0032
	// Test Scenario: Verify if the user can add educational attainment.

	public void AddEducationalAttainmentWithValidData(String School, String Degree) throws InterruptedException {
		
		Profile_Icon.click();
		About_Tab.click();
		scrollToEducationalAttainmentEditIcon();
		EducationalAttainment_EditIcon.click();
		AddEducationalAttainment_Button.click();
		int SchoolTextbox_Size = School_Textbox.size();
		int DegreeTextbox_Size = Degree_Textbox.size();
		int FromYearTextbox_Size = FromYear_Textbox.size();
		int ToYearTextbox_Size = ToYear_Textbox.size();
		int getSchoolTextbox = 0;
		int getDegreeTextbox = 0;
		int getFromYearTextbox = 0;
		int getToYearTextbox = 0;
		for (int i = 0; i < SchoolTextbox_Size; i++) {
			getSchoolTextbox = i;

			for (int j = 0; j < DegreeTextbox_Size; j++) {
				getDegreeTextbox = j;
			}

			for (int l = 0; l < FromYearTextbox_Size; l++) {
				getFromYearTextbox = l;
			}

			for (int k = 0; k < ToYearTextbox_Size; k++) {
				getToYearTextbox = k;
			}
		}

		School_Textbox.get(getSchoolTextbox).sendKeys(School);
		Degree_Textbox.get(getDegreeTextbox).sendKeys(Degree);
		FromYear_Textbox.get(getFromYearTextbox).click();
		Year.get(0).click();
		ToYear_Textbox.get(getToYearTextbox).click();
		Year.get(1).click();
			
		String StartDate = FromYear_Textbox.get(getFromYearTextbox).getText();
		String EndDate = ToYear_Textbox.get(getToYearTextbox).getText();
		UpdateProfile_Button.click();	
		String expectedmessage = "Your profile was successfully updated.";
		String toastmessage = ToastMessage.getText();
		List<String> getSchoolList = new ArrayList<String>();
		List<String> getDegreeList = new ArrayList<String>();
		List<String> getStartEndDateList = new ArrayList<String>();
		for (WebElement item : School_Text) 
		{
			getSchoolList.add(item.getText().toString());
		}
		
		for (WebElement item : Degree_Text) 
		{
			getDegreeList.add(item.getText().toString());
		}
		
		for(WebElement item : Since_Text)
		{
			getStartEndDateList.add(item.getText().toString());
		}
		Assert.assertTrue(toastmessage.contains(expectedmessage) && getSchoolList.toString().contains(School) && getDegreeList.toString().contains(Degree) && getStartEndDateList.toString().contains(StartDate+" - "+EndDate));
		System.out.println(getSchoolList.toString());
		System.out.println(getDegreeList.toString());
		System.out.println(getStartEndDateList.toString());
		System.out.println(StartDate.toString()+" - "+EndDate.toString());
		

	}

	// Test Case ID: Profile_0033
	// Test Scenario: Verify if the user can edit his/her educational attainment.
	public void EditEducationalAttainmentWithValidData(String School, String Degree) throws InterruptedException {
		Profile_Icon.click();
		About_Tab.click();
		scrollToEducationalAttainmentEditIcon();
		EducationalAttainment_EditIcon.click();
		// Clear Data
		School_Textbox.get(0).clear();
		Degree_Textbox.get(0).clear();
		FromYear_Textbox.get(0).clear();
		ToYear_Textbox.get(0).clear();
		// Input Data
		School_Textbox.get(0).sendKeys(School);
		Degree_Textbox.get(0).sendKeys(Degree);
		FromYear_Textbox.get(0).click();
		Year.get(2).click();
		ToYear_Textbox.get(0).click();
		Year.get(1).click();
		String StartDate = FromYear_Textbox.get(0).getText();
		String EndDate = ToYear_Textbox.get(0).getText();
		UpdateProfile_Button.click();
		String expectedmessage = "Your profile was successfully updated.";
		String toastmessage = ToastMessage.getText();
		List<String> getSchoolList = new ArrayList<String>();
		List<String> getDegreeList = new ArrayList<String>();
		List<String> getStartEndDateList = new ArrayList<String>();
		for (WebElement item : School_Text) 
		{
			getSchoolList.add(item.getText().toString());
		}
		
		for (WebElement item : Degree_Text) 
		{
			getDegreeList.add(item.getText().toString());
		}
		
		for(WebElement item : Since_Text)
		{
			getStartEndDateList.add(item.getText().toString());
		}
		Assert.assertTrue(toastmessage.contains(expectedmessage) && getSchoolList.toString().contains(School) && getDegreeList.toString().contains(Degree) && getStartEndDateList.toString().contains(StartDate+" - "+EndDate));
		System.out.println(getSchoolList.toString());
		System.out.println(getDegreeList.toString());
		System.out.println(getStartEndDateList.toString());
		System.out.println(StartDate.toString()+" - "+EndDate.toString());
	}

	// Test Case ID: Profile_0034
	// Test Scenario: Verify if the user can delete educational attainment.
	public void DeleteEducationalBackground(String School, String Degree) {
		Profile_Icon.click();
		About_Tab.click();
		scrollToEducationalAttainmentEditIcon();
		EducationalAttainment_EditIcon.click();
		int getFromYearTextbox_Size = FromYear_Textbox.size();
		int getToYearTextbox_Size = ToYear_Textbox.size();
		
		int getFromYearTextboxSize = 0;
		int getToYearTextboxSize = 0;
		for(int i=0; i<getFromYearTextbox_Size; i++)
		{
			getFromYearTextboxSize = i;
		}
		
		for(int i=0; i<getToYearTextbox_Size; i++)
		{
			getToYearTextboxSize = i;
		}
		String StartDate = FromYear_Textbox.get(getFromYearTextboxSize).getText();
		String EndDate = ToYear_Textbox.get(getToYearTextboxSize).getText();
		Remove_Button.get(0).click();
		UpdateProfile_Button.click();
		List<String> getSchool = new ArrayList<String>();
		List<String> getDegree = new ArrayList<String>();
		List<String> getStartEndDate = new ArrayList<String>();
		
		for(WebElement item : School_Text)
		{
			getSchool.add(item.getText().toString());
		}
		
		for(WebElement item : Degree_Text)
		{
			getDegree.add(item.getText().toString());
		}
		
		for(WebElement item : Since_Text)
		{
			getStartEndDate.add(item.getText().toString());
		}
		String expectedmessage = "Your profile was successfully updated.";
		String toastmessage = ToastMessage.getText();
		Assert.assertTrue(toastmessage.contains(expectedmessage) && !getSchool.toString().contains(School) && !getDegree.toString().contains(Degree) && !getStartEndDate.contains(StartDate+" - "+EndDate));
		
	}

	// Test Case ID: Profile_0035
	// Test Scenario: Verify if the user can add work experience on professional information.
	public void AddWorkExperience(String Company, String Department, String JobTitle, String WorkAccomplishments,
			String CertificatesReceived, String ProfessionalSkills) throws InterruptedException {
		Profile_Icon.click();
		About_Tab.click();
		scrollToProfessionalInformationEditIcon();
		ProfessionalInformation_EditIcon.click();
		AddCompany.click();
		scrollToUpdateProfileButton();
		int CompanyTextbox_Size = Company_Textbox.size();
		int DepartmentTextbox_Size = Department_Textbox.size();
		int JobTitleTextbox_Size = JobTitle_Textbox.size();
		int FromYearTextbox_Size = FromYear_Textbox.size();
		int ToYearTextbox_Size = ToYear_Textbox.size();
		int WorkAccomplishmentsTextbox_Size = WorkAccomplishments_Textbox.size();
		int CertificateReceivedTextbox_Size = CertificatesReceived_Textbox.size();

		int getCompanyTextboxSize = 0;
		int getDepartmentTextboxSize = 0;
		int getJobTitleTextboxSize = 0;
		int getFromYearTextboxSize = 0;
		int getToYearTextboxSize = 0;
		int getWorkAccomplishmentsTextboxSize = 0;
		int getCertificateReceivedTextboxSize = 0;

		for (int i = 0; i < CompanyTextbox_Size; i++) {
			getCompanyTextboxSize = i;
		}
		
		for (int i = 0; i < DepartmentTextbox_Size; i++) {
			getDepartmentTextboxSize = i;
		}
		
		for (int i = 0; i < JobTitleTextbox_Size; i++) {
			getJobTitleTextboxSize = i;
		}		

		for (int i = 0; i < FromYearTextbox_Size; i++) {
			getFromYearTextboxSize = i;
		}
		
		for (int i = 0; i < ToYearTextbox_Size; i++) {
			getToYearTextboxSize = i;
		}
	
		for (int i = 0; i < WorkAccomplishmentsTextbox_Size; i++) {
			getWorkAccomplishmentsTextboxSize = i;

		}
		
		for (int i = 0; i < CertificateReceivedTextbox_Size; i++) {
			getCertificateReceivedTextboxSize = i;
		}
		Company_Textbox.get(getCompanyTextboxSize).sendKeys(Company);
		Department_Textbox.get(getDepartmentTextboxSize).sendKeys(Department);
		JobTitle_Textbox.get(getJobTitleTextboxSize).sendKeys(JobTitle);
		FromYear_Textbox.get(getFromYearTextboxSize).click();
		Year.get(0).click();
		ToYear_Textbox.get(getToYearTextboxSize).click();
		Year.get(1).click();
		String StartDate = FromYear_Textbox.get(getFromYearTextboxSize).getText();
		String EndDate = ToYear_Textbox.get(getToYearTextboxSize).getText();
		WorkAccomplishments_Textbox.get(getWorkAccomplishmentsTextboxSize).sendKeys(WorkAccomplishments);
		CertificatesReceived_Textbox.get(getCertificateReceivedTextboxSize).sendKeys(CertificatesReceived);
		//ProfessionalSkills_Textbox.sendKeys(ProfessionalSkills);
		UpdateProfile_Button.click();
		String expectedmessage = "Your profile was successfully updated.";
		String toastmessage = ToastMessage.getText();
		Thread.sleep(1000);	
		scroll();
		List<String> getCompany = new ArrayList<String>();
		List<String> getDepartment = new ArrayList<String>();
		List<String> getJobTitle = new ArrayList<String>();
		List<String> getDurationOfService = new ArrayList<String>();
		List<String> getWorkAccomplishments = new ArrayList<String>();
		List<String> getCertificatesReceived = new ArrayList<String>();
		
		for(WebElement item : Company_Text)
		{
			getCompany.add(item.getText().toString());
		}				
		
		for(WebElement item : DurationOfService_Text)
		{
			getDurationOfService.add(item.getText().toString());
		}
		
		for(WebElement item : WorkAccomplishments_Text)
		{
			getWorkAccomplishments.add(item.getText().toString());
		}
		
		for(WebElement item : CertificateReceived_Text)
		{
			getCertificatesReceived.add(item.getText().toString());
		}
		
		Assert.assertTrue(toastmessage.contains(expectedmessage) && getCompany.toString().contains(Company) && getDurationOfService.toString().contains(StartDate+" - "+EndDate) && getCertificatesReceived.toString().contains(CertificatesReceived));
		System.out.println(toastmessage);
	}

	// Test Case ID: Profile_0036
	// Test Scenario: Verify if the user can edit his/her professional information
	public void EditProfessionalInformationWithValidData(String Company, String Department, String JobTitle,
			String WorkAccomplishments, String CertificatesReceived, String ProfessionalSkills) throws InterruptedException {
		Profile_Icon.click();
		About_Tab.click();
		scrollToProfessionalInformationEditIcon();
		ProfessionalInformation_EditIcon.click();
		scrollToUpdateProfileButton();
		int CompanyTextbox_Size = Company_Textbox.size();
		int DepartmentTextbox_Size = Department_Textbox.size();
		int JobTitleTextbox_Size = JobTitle_Textbox.size();
		int FromYearTextbox_Size = FromYear_Textbox.size();
		int ToYearTextbox_Size = ToYear_Textbox.size();
		int WorkAccomplishmentsTextbox_Size = WorkAccomplishments_Textbox.size();
		int CertificateReceivedTextbox_Size = CertificatesReceived_Textbox.size();

		int getCompanyTextboxSize = 0;
		int getDepartmentTextboxSize = 0;
		int getJobTitleTextboxSize = 0;
		int getFromYearTextboxSize = 0;
		int getToYearTextboxSize = 0;
		int getWorkAccomplishmentsTextboxSize = 0;
		int getCertificateReceivedTextboxSize = 0;

		for (int i = 0; i < CompanyTextbox_Size; i++) {
			getCompanyTextboxSize = i;
		}
		
		for (int i = 0; i < DepartmentTextbox_Size; i++) {
			getDepartmentTextboxSize = i;
		}
		
		for (int i = 0; i < JobTitleTextbox_Size; i++) {
			getJobTitleTextboxSize = i;
		}		

		for (int i = 0; i < FromYearTextbox_Size; i++) {
			getFromYearTextboxSize = i;
		}
		
		for (int i = 0; i < ToYearTextbox_Size; i++) {
			getToYearTextboxSize = i;
		}
	
		for (int i = 0; i < WorkAccomplishmentsTextbox_Size; i++) {
			getWorkAccomplishmentsTextboxSize = i;

		}
		
		for (int i = 0; i < CertificateReceivedTextbox_Size; i++) {
			getCertificateReceivedTextboxSize = i;
		}
		
		Company_Textbox.get(getCompanyTextboxSize).clear();
		Department_Textbox.get(getDepartmentTextboxSize).clear();
		JobTitle_Textbox.get(getJobTitleTextboxSize).clear();	
		FromYear_Textbox.get(getFromYearTextboxSize).clear();
		ToYear_Textbox.get(getToYearTextboxSize).clear();
		WorkAccomplishments_Textbox.get(getWorkAccomplishmentsTextboxSize).clear();
		CertificatesReceived_Textbox.get(getCertificateReceivedTextboxSize).clear();
		ProfessionalSkills_Textbox.clear();
		Company_Textbox.get(getCompanyTextboxSize).sendKeys(Company);
		Department_Textbox.get(getDepartmentTextboxSize).sendKeys(Department);
		JobTitle_Textbox.get(getJobTitleTextboxSize).sendKeys(JobTitle);
		FromYear_Textbox.get(getFromYearTextboxSize).click();
		Year.get(1).click();
		ToYear_Textbox.get(getToYearTextboxSize).click();
		Year.get(2).click();
		String StartDate = FromYear_Textbox.get(getFromYearTextboxSize).getText();
		String EndDate = ToYear_Textbox.get(getToYearTextboxSize).getText();
		WorkAccomplishments_Textbox.get(getWorkAccomplishmentsTextboxSize).sendKeys(WorkAccomplishments);
		CertificatesReceived_Textbox.get(getCertificateReceivedTextboxSize).sendKeys(CertificatesReceived);
		scrollToProfessionalSkills();
		ProfessionalSkills_Textbox.sendKeys(ProfessionalSkills);
		UpdateProfile_Button.click();
		String expectedmessage = "Your profile was successfully updated.";
		String toastmessage = ToastMessage.getText();
		scroll();
		Thread.sleep(1000);
		List<String> getCompany = new ArrayList<String>();
		List<String> getDepartment = new ArrayList<String>();
		List<String> getJobTitle = new ArrayList<String>();
		List<String> getDurationOfService = new ArrayList<String>();
		List<String> getWorkAccomplishments = new ArrayList<String>();
		List<String> getCertificatesReceived = new ArrayList<String>();
		
		for(WebElement item : Company_Text)
		{
			getCompany.add(item.getText().toString());
		}				
		
		for(WebElement item : DurationOfService_Text)
		{
			getDurationOfService.add(item.getText().toString());
		}
		
		for(WebElement item : WorkAccomplishments_Text)
		{
			getWorkAccomplishments.add(item.getText().toString());
		}
		
		for(WebElement item : CertificateReceived_Text)
		{
			getCertificatesReceived.add(item.getText().toString());
		}
		
		Assert.assertTrue(toastmessage.contains(expectedmessage) && getCompany.toString().contains(Company) && getDurationOfService.toString().contains(StartDate+" - "+EndDate) && getCertificatesReceived.toString().contains(CertificatesReceived) && ProfessionalSkills_Text.getText().contains(ProfessionalSkills));
	}

	// Test Case ID: Profile_0037
	// Verify if the user can delete work experience on professional information.

	public void DeleteWorkProfessionalInformation(String Company, String Department, String JobTitle,
			String WorkAccomplishments, String CertificatesReceived, String ProfessionalSkills) throws InterruptedException {
		Profile_Icon.click();
		About_Tab.click();
		scrollToProfessionalInformationEditIcon();
		ProfessionalInformation_EditIcon.click();
		
		int FromYearTextbox_Size = FromYear_Textbox.size();
		int ToYearTextbox_Size = ToYear_Textbox.size();
		
		int getFromYearTextboxSize = 0;
		int getToYearTextboxSize = 0;
		for (int i = 0; i < FromYearTextbox_Size; i++) {
			getFromYearTextboxSize = i;
		}
		
		for (int i = 0; i < ToYearTextbox_Size; i++) {
			getToYearTextboxSize = i;
		}
		String StartDate = FromYear_Textbox.get(getFromYearTextboxSize).getText();
		String EndDate = ToYear_Textbox.get(getToYearTextboxSize).getText();
		Remove_Button.get(0).click();
		scrollToUpdateProfileButton();
		UpdateProfile_Button.click();
		Thread.sleep(1000);
		scroll();
		String expectedMessage = "Your profile was successfully updated.";
		String toastMessage = ToastMessage.getText();
		List<String> getCompany = new ArrayList<String>();
		List<String> getDepartment = new ArrayList<String>();
		List<String> getJobTitle = new ArrayList<String>();
		List<String> getDurationOfService = new ArrayList<String>();
		List<String> getWorkAccomplishments = new ArrayList<String>();
		List<String> getCertificatesReceived = new ArrayList<String>();
		
		for(WebElement item : Company_Text)
		{
			getCompany.add(item.getText().toString());
		}				
		
		for(WebElement item : DurationOfService_Text)
		{
			getDurationOfService.add(item.getText().toString());
		}
		
		for(WebElement item : WorkAccomplishments_Text)
		{
			getWorkAccomplishments.add(item.getText().toString());
		}
		
		for(WebElement item : CertificateReceived_Text)
		{
			getCertificatesReceived.add(item.getText().toString());
		}
		Assert.assertTrue(toastMessage.contains(expectedMessage) && !getCompany.contains(Company) && !getDurationOfService.contains(StartDate+" - "+EndDate) && !getWorkAccomplishments.contains(WorkAccomplishments) && !getCertificatesReceived.toString().contains(CertificatesReceived));
	}

	// Test Case ID: Profile_0038
	// Test Scenario: Verify if the user can filter the files by Documents.

	public void FilterFilesByDocuments() throws WebDriverException, IOException, InterruptedException {
		Profile_Icon.click();
		Files_Tab.click();
		FilesTab_FilterIcon.click();
		Documents_Filter.click();
		
		List<String> RetrieveFileName = new ArrayList<String>();
		List<String> getFile = new ArrayList<String>();
		
		if(FileName.size() == 0)
		{
			scrollToNoAvailableData();
			Assert.assertEquals(TextNotification.getText(), "No available data.");
		}
		else
		{
			
			// String FirstFileName ="novo.PNG.png";
			String LastFileName = "Countries POEA.xlsx";
			boolean found = false;
			while (!found) {
				int size = 0;

				size = size + FileName.size();
				for (int i = 0; i < size; i++) {
					String getLastFileName = FileName.get(i).getText();
					if (LastFileName.equals(getLastFileName)) {
						found = true;
						break;
					}

					if (!found) {
						for (WebElement item : FileName) {
							getFile.add(item.getText().toString());
						}
						RetrieveFileName.addAll(getFile);
						scroll();
						Thread.sleep(2000);
					}
				}
			}

			Set<String> set = new HashSet<>(RetrieveFileName);
			RetrieveFileName.clear();
			RetrieveFileName.addAll(set);
			
			//Assert.assertTrue(RetrieveFileName.toString().contains(".txt") || RetrieveFileName.toString().contains(".doc") || RetrieveFileName.toString().contains(".xls") || RetrieveFileName.toString().contains(".ppt") ||  RetrieveFileName.toString().contains(".csv") ||  RetrieveFileName.toString().contains(".pdf"));
			Assert.assertTrue(!RetrieveFileName.toString().contains(".jpg") && !RetrieveFileName.toString().contains(".png") && !RetrieveFileName.toString().contains(".gif") && !RetrieveFileName.toString().contains(".mp4") && !RetrieveFileName.toString().contains(".mp3") && !RetrieveFileName.toString().contains(".wav"));
		}
		
		System.out.println(RetrieveFileName.toString());
		System.out.println(RetrieveFileName.size());

	}

	// Test Case ID: Profile_0039
	// Test Scenario: Verify if the user can filter the files by Images.
	public void FilterFilesByImages() throws InterruptedException {
		Profile_Icon.click();
		Files_Tab.click();
		FilesTab_FilterIcon.click();
		Images_Filter.click();		

		List<String> RetrieveFileName = new ArrayList<String>();
		List<String> getFile = new ArrayList<String>();
		
		if (FileName.size() == 0) {
			scrollToNoAvailableData();
			Assert.assertEquals(TextNotification.getText(), "No available data.");
		}

		else {
		
			
			String LastFileName ="novo.PNG.png";
			//String LastFileName ="mobile_upload_1.jpeg";
			boolean found = false;
			while (!found) {
				int size = 0;

				size = size + FileName.size();
				for (int i = 0; i < size; i++) {
					String getLastFileName = FileName.get(i).getText();
					if (LastFileName.equals(getLastFileName)) {
						found = true;
						break;
					}

					if (!found) {
						for (WebElement item : FileName) {
							getFile.add(item.getText().toString());
						}
						RetrieveFileName.addAll(getFile);
						scroll();
						Thread.sleep(2000);
					}
				}
			}
			
			Set<String> set = new HashSet<>(RetrieveFileName);
			RetrieveFileName.clear();
			RetrieveFileName.addAll(set);
			
			//Assert.assertTrue(RetrieveFileName.toString().contains(".jpg") || RetrieveFileName.toString().contains(".png")|| RetrieveFileName.toString().contains(".gif"));
			Assert.assertTrue(!RetrieveFileName.toString().contains(".mp4") && !RetrieveFileName.toString().contains(".mp3") && !RetrieveFileName.toString().contains(".wav") && !RetrieveFileName.toString().contains(".txt") && !RetrieveFileName.toString().contains(".doc") && !RetrieveFileName.toString().contains(".xls") && !RetrieveFileName.toString().contains(".ppt") && !RetrieveFileName.toString().contains(".csv") && !RetrieveFileName.toString().contains(".pdf"));
		}
		System.out.println(RetrieveFileName.toString());
		System.out.println(RetrieveFileName.size());

	}

	// Test Case ID: Profile_0040
	// Test Scenario: Verify if the user can filter the files by Videos.
	public void FilterFilesByVideos() throws InterruptedException {

		Profile_Icon.click();
		Files_Tab.click();
		FilesTab_FilterIcon.click();
		Videos_Filter.click();


		List<String> RetrieveFileName = new ArrayList<String>();
		List<String> getFile = new ArrayList<String>();
		
		if (FileName.size() == 0) {
			scrollToNoAvailableData();
			Assert.assertEquals(TextNotification.getText(), "No available data.");
		}

		else {
			
			String LastFileName ="video sample type.mp4";
			boolean found = false;
			while (!found) {
				int size = 0;

				size = size + FileName.size();
				for (int i = 0; i < size; i++) {
					String getLastFileName = FileName.get(i).getText();
					if (LastFileName.equals(getLastFileName)) {
						found = true;
						break;
					}

					if (!found) {
						for (WebElement item : FileName) {
							getFile.add(item.getText().toString());
						}
						RetrieveFileName.addAll(getFile);
						scroll();
						Thread.sleep(2000);
					}
				}
			}
			
			Set<String> set = new HashSet<>(RetrieveFileName);
			RetrieveFileName.clear();
			RetrieveFileName.addAll(set);
			
			//Assert.assertTrue(RetrieveFileName.toString().contains(".jpg") || RetrieveFileName.toString().contains(".png")|| RetrieveFileName.toString().contains(".gif"));
			Assert.assertTrue(!RetrieveFileName.toString().contains(".jpg") && !RetrieveFileName.toString().contains(".png") && !RetrieveFileName.toString().contains(".gif") && !RetrieveFileName.toString().contains(".mp3") && !RetrieveFileName.toString().contains(".wav") && !RetrieveFileName.toString().contains(".txt") && !RetrieveFileName.toString().contains(".doc") && !RetrieveFileName.toString().contains(".xls") && !RetrieveFileName.toString().contains(".ppt") && !RetrieveFileName.toString().contains(".csv") && !RetrieveFileName.toString().contains(".pdf"));
		}
		System.out.println(RetrieveFileName.toString());
		System.out.println(RetrieveFileName.size());

	}
	
	//Test Case ID: Profile_0041
	//Test Scenario: Verify if the user can filter all audio file.
	public void FilterFilesByAudio() throws InterruptedException
	{
		Profile_Icon.click();
		Files_Tab.click();
		FilesTab_FilterIcon.click();
		Audio_Filter.click();


		List<String> RetrieveFileName = new ArrayList<String>();
		List<String> getFile = new ArrayList<String>();
		
		if (FileName.size() == 0) {
			scrollToNoAvailableData();
			Assert.assertEquals(TextNotification.getText(), "No available data.");
		}

		else {
			
			String LastFileName ="Ensoniq-ESQ-1-Bass-C2.wav";
			boolean found = false;
			while (!found) {
				int size = 0;

				size = size + FileName.size();
				for (int i = 0; i < size; i++) {
					String getLastFileName = FileName.get(i).getText();
					if (LastFileName.equals(getLastFileName)) {
						found = true;
						break;
					}

					if (!found) {
						for (WebElement item : FileName) {
							getFile.add(item.getText().toString());
						}
						RetrieveFileName.addAll(getFile);
						scroll();
						Thread.sleep(2000);
					}
				}
			}
			
			Set<String> set = new HashSet<>(RetrieveFileName);
			RetrieveFileName.clear();
			RetrieveFileName.addAll(set);
			
			//Assert.assertTrue(RetrieveFileName.toString().contains(".jpg") || RetrieveFileName.toString().contains(".png")|| RetrieveFileName.toString().contains(".gif"));
			Assert.assertTrue(!RetrieveFileName.toString().contains(".mp4")  &&!RetrieveFileName.toString().contains(".jpg") && !RetrieveFileName.toString().contains(".png") && !RetrieveFileName.toString().contains(".gif") && !RetrieveFileName.toString().contains(".txt") && !RetrieveFileName.toString().contains(".doc") && !RetrieveFileName.toString().contains(".xls") && !RetrieveFileName.toString().contains(".ppt") && !RetrieveFileName.toString().contains(".csv") && !RetrieveFileName.toString().contains(".pdf"));
		}
		System.out.println(RetrieveFileName.toString());
		System.out.println(RetrieveFileName.size());
	}
	
	//Test Case ID: Profile_0042
	//Test Scenario: Verify if the user can view All the files.	
	public void FilterAllFiles() throws InterruptedException
	{
		Profile_Icon.click();
		Files_Tab.click();
		FilesTab_FilterIcon.click();
		All_Filter.click();
		
		List<String> RetrieveFileName = new ArrayList<String>();
		List<String> getFile = new ArrayList<String>();
		
		if (FileName.size() == 0) {
			scrollToNoAvailableData();
			Assert.assertEquals(TextNotification.getText(), "No available data.");
		}

		else {
			
			
			String LastFileName ="novo.PNG.png";			
			boolean found = false;
			while (!found) {
				int size = 0;

				size = size + FileName.size();
				for (int i = 0; i < size; i++) {
					String getLastFileName = FileName.get(i).getText();
					if (LastFileName.equals(getLastFileName)) {
						found = true;
						break;
					}

					if (!found) {
						for (WebElement item : FileName) {
							getFile.add(item.getText().toString());
						}
						RetrieveFileName.addAll(getFile);
						scroll();
						Thread.sleep(2000);
					}
				}
			}
			
			Set<String> set = new HashSet<>(RetrieveFileName);
			RetrieveFileName.clear();
			RetrieveFileName.addAll(set);
			
			Assert.assertTrue(RetrieveFileName.toString().contains(".jpg") || RetrieveFileName.toString().contains(".png")|| RetrieveFileName.toString().contains(".gif") || RetrieveFileName.toString().contains(".mp4")|| RetrieveFileName.toString().contains(".mp3")|| RetrieveFileName.toString().contains(".wav")|| RetrieveFileName.toString().contains(".txt")|| RetrieveFileName.toString().contains(".doc") || RetrieveFileName.toString().contains(".xls")|| RetrieveFileName.toString().contains(".ppt")|| RetrieveFileName.toString().contains(".csv")|| RetrieveFileName.toString().contains(".pdf"));
			
		}
		System.out.println(RetrieveFileName.toString());
		System.out.println(RetrieveFileName.size());
		
	}
	
	//Test Case ID: Profile_0043
	//Test Scenario: Verify if the user can search a file on Search field.
	public void SearchFile(String SearchFile)
	{
		Profile_Icon.click();
		Files_Tab.click();
		FilesTab_SearchBox.sendKeys(SearchFile);
		Assert.assertEquals(FileName.get(0).getText().toString(),SearchFile);
		System.out.println("File Name: "+ FileName.get(0).getText()+ ",  Expected Result: "+SearchFile);
		
	}
	
	//Test Case ID: Profile_0044
	//Test Scenario: Verify if the user can Rename a file.
	public void RenameFile(String File_Name)
	{
		Profile_Icon.click();
		Files_Tab.click();
		FilesTab_MoreIcon.get(0).click();
		Rename.click();
		Rename_Textbox.clear();
		Rename_Textbox.sendKeys(File_Name);
		Proceed_Button.click();
		String expectedMessage ="File was renamed successfully.";
		String toastMessage = ToastMessage.getText();
		Assert.assertTrue(expectedMessage.equals(toastMessage) && FileName.get(0).getText().contains(File_Name.toString()));
		
		System.out.println("Expected Message: "+expectedMessage);
		System.out.println("Actual Message: "+toastMessage);
		System.out.println("Rename: " +File_Name);
		System.out.println("File Name: " +FileName.get(0).getText().toString());	
		
	}
	
	//Test Case ID: Profile_0045
	//Test Scenario: Verify if the user can download a file.
	public void DownloadFile()
	{
		Profile_Icon.click();
		Files_Tab.click();
		FilesTab_MoreIcon.get(0).click();
		Download.click();
		Proceed_Button.click();
		String File_Name = FileName.get(0).getText();
		String expectedMessage = File_Name+" Saved";
		String toastMessage = ToastMessage.getText();
		Assert.assertEquals(expectedMessage, toastMessage);
		
	}
	
	//Test Case ID: Profile_0046
	//Test Scenario: Verify if the user can Share a file via link.	
	public void ShareFileViaLink(String ColleagueNameOrGroupName) throws InterruptedException
	{
		Profile_Icon.click();
		Files_Tab.click();
		FilesTab_MoreIcon.get(0).click();
		Share.click();
		ShareViaLink.click();
		ColleagueOrGroupName_Textbox.sendKeys(ColleagueNameOrGroupName);
		Image_Photo.click();
		Proceed_Button.click();
		String expectedmessage = "File has been shared via link.";
		String toastmessage = ToastMessage.getText();
		String FileName_OnFileTab = FileName.get(0).getText();
		String FileSize_OnFileTab = FileNameSize.get(0).getText();
		Home_Icon.click();
		scrollUp();
		Thread.sleep(2000);
		List<String> getHeaderText = new ArrayList<String>();
		List<String> getFileNameList = new ArrayList<String>();
		List<String> getFileSizeList = new ArrayList<String>();
				
		for(WebElement item : Header_Text)
		{
			getHeaderText.add(item.getText().toString());
		}
		
		for(WebElement item : FileName_Text)
		{
			getFileNameList.add(item.getText().toString());
		}
		
		for(WebElement item : FileNameSize_Text)
		{
			getFileSizeList.add(item.getText().toString());
		}

		Assert.assertTrue(toastmessage.contains(expectedmessage) && getHeaderText.toString().contains("shared a File --with "+ColleagueNameOrGroupName) && getFileNameList.toString().contains(FileName_OnFileTab) && getFileSizeList.toString().contains(FileSize_OnFileTab));
		System.out.println(getHeaderText.toString());
		System.out.println(getFileNameList.toString());
		System.out.println(getFileSizeList.toString());
		System.out.println("shared a File --with "+ColleagueNameOrGroupName);
		System.out.println(FileName_OnFileTab);
		System.out.println(FileSize_OnFileTab);
		
	}
	
	//Test Case ID: Profile_0047
	//Test Scenario: Verify if the user can Share a file via email.	
	public void ShareFileViaEmail(String ColleagueName, String Note)
	{
		Profile_Icon.click();
		Files_Tab.click();
		FilesTab_MoreIcon.get(0).click();
		Share.click();
		ShareViaEmail.click();
		ColleagueOrGroupName_Textbox.sendKeys(ColleagueName);
		Image_Photo.click();
		AddNote_Textbox.sendKeys(Note);
		Proceed_Button.click();
		String expectedMessage = "File has been shared via email.";
		String toastMessage = ToastMessage.getText();
		Assert.assertEquals(expectedMessage, toastMessage);
		System.out.println(expectedMessage);
		System.out.println(toastMessage);
		
	}
	
	//Test Case ID: Profile_0048
	//Test Scenario: Verify if the user can Delete a file.	
	public void DeleteFile()
	{
		Profile_Icon.click();
		Files_Tab.click();
		String DeletedFileName = FileName.get(0).getText();
		FilesTab_MoreIcon.get(0).click();
		Delete.click();
		Proceed_Button.click();
		String expectedmessage = "The file has been deleted.";
		String toastmessage = ToastMessage.getText();
		List<String> getFileName = new ArrayList<String>();
		for(WebElement item : FileName)
		{
			getFileName.add(item.getText().toString());
		}		
		Assert.assertTrue(toastmessage.contains(expectedmessage) && !getFileName.toString().contains(DeletedFileName));	
		System.out.println(getFileName.toString());
		System.out.println(DeletedFileName);
	}
	
	//Test Case ID: Profile_0049
	//Test Scenario: Verify if the user can view group.	
	public void ViewGroup() throws InterruptedException
	{
		Profile_Icon.click();
		Groups_Tab.click();
		Thread.sleep(3000);
		List<String> getNumberOfMember = new ArrayList<String>();
		for(WebElement item : NumberOfMemberText_OnGroupTab)
		{
			getNumberOfMember.add(item.getText().toString());
		}
		String GroupName_OnGroupTab = GroupNameText_OnGroupTab.get(1).getText();
		String NumberOfMember_OnGroupTab = NumberOfMemberText_OnGroupTab.get(0).getText();				
		GroupTab_MoreIcon.get(0).click();
		ViewGroup.click();
		
		
		//Assert.assertTrue(GroupNameText_OnGroupProfile.get(1).getText().contains(GroupName_OnGroupTab) && NumberOfMemberText_OnGroupProfile.getText().contains(NumberOfMember_OnGroupTab));
		System.out.println(GroupName_OnGroupTab);
		System.out.println(NumberOfMember_OnGroupTab);
		System.out.println(GroupNameText_OnGroupProfile.get(1).getText());
		System.out.println(NumberOfMemberText_OnGroupProfile.get(0).getText());
		System.out.println(getNumberOfMember.toString());

	}
	
	//Test Case ID: Profile_0050
	//Test Scenario: Verify if the user can leave group.
	public void LeaveGroup()
	{
		Profile_Icon.click();
		Groups_Tab.click();
		GroupTab_MoreIcon.get(0).click();
		LeaveGroup.click();
		String expectedMessage = "You have successfully left the group.";
		String toastMessage = ToastMessage.getText();
		Assert.assertEquals(expectedMessage, toastMessage);
	}
	
	
	public void ViewEventDetails()
	{
		Profile_Icon.click();
		Events_Tab.click();
		
	}

}
