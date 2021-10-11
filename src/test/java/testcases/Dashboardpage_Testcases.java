package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Website_pages.Authorization_page;
import Website_pages.Configuration_page;
import Website_pages.Connected_Users_page;
import Website_pages.Dashboard_page;
import Website_pages.Login_page;
import Website_pages.Roles_page;
import Website_pages.Tenant_page;
import Website_pages.User_Group_page;
import Website_pages.User_Management_page;
import basepackage.Base_Class;

public class Dashboardpage_Testcases extends Base_Class {
	
	public User_Group_page Usrgrp;
	public User_Management_page usrmang;
	public Roles_page role;
	public Authorization_page auth;
	public Tenant_page ten;
	public Connected_Users_page conusr;
	public Configuration_page config;
	public ExtentTest test;
	public Dashboard_page dash;
	
	public Dashboardpage_Testcases () throws IOException
	{
		super();
		Usrgrp = new User_Group_page();
		usrmang = new User_Management_page();
		role = new Roles_page();
		auth = new Authorization_page();
		ten = new Tenant_page();
		conusr = new Connected_Users_page();
		config = new Configuration_page();	
		dash = new Dashboard_page();
	}
	
	
	@BeforeTest
	public void initExtentreport() throws IOException
	{
		ExtentReports();
		
	}
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialzation();
	}
	
	
	@Test (priority=1)
	public void Verify_menus() throws IOException, InterruptedException
	{
		dash.checkMenus();
	}
	
	@Test (priority=2)
	public void Verify_UsergroupTest() throws IOException, InterruptedException
	{
		Usrgrp = dash.verify_Usergroup();
	}
	
	@Test (priority=3)
	public void Verify_UserManagementTest() throws IOException, InterruptedException
	{
		usrmang = dash.verify_UserManagement();
	}
	
	@Test (priority=4)
	public void Verify_RolesTest() throws IOException, InterruptedException
	{
		role = dash.verify_Roles();
	}
	
	
	@Test (priority=5)
	public void Verify_AuthorizationTest() throws IOException, InterruptedException
	{
		auth = dash.verify_Authorization();
	}
	
	@Test (priority=6)
	public void Verify_TenantTest() throws IOException, InterruptedException
	{
		ten = dash.verify_Tenant();
	}
	
	@Test (priority=7)
	public void Verify_connectedUsersTest() throws IOException, InterruptedException
	{
		conusr = dash.verify_connectedUsers();
	}
	
	@Test (priority=8)
	public void Verify_ConfigurationTest() throws IOException, InterruptedException
	{
		config = dash.verify_Configuration();
	}
	
	@Test (priority=9)
	public void Verify_logout() throws IOException, InterruptedException
	{
		dash.Logout();
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	@AfterTest
	public void flushextent()
	{
		extentflush();
	}
	

}
