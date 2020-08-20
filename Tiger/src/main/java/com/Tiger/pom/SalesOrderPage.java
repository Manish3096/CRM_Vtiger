package com.Tiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesOrderPage {
@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
private WebElement CreateSalesbn;

@FindBy(xpath="themes/softed/images/btnL3Search.gif")
private WebElement Searchbn;

@FindBy(xpath="//input[@name='search_text']")
private WebElement Searchfortb;

@FindBy(xpath="//select[@id='bas_searchfield']")
private WebElement Indropdn;

@FindBy(xpath="//input[@class='crmbutton small create']")
private WebElement SearchNowbn;

@FindBy(xpath="//select[@id='viewname']")
private WebElement FiltersDropdn;

@FindBy(xpath="//a[.='Create Filter']")
private WebElement CreatefilterLink;

@FindBy(xpath="//a[.='Edit']")
private WebElement EditfilterLink;

@FindBy(xpath="//a[.='Delete']")
private WebElement DeletefilterLink;

@FindBy(xpath="//input[@class='crmbutton small delete']")
private WebElement Deletebn;

@FindBy(xpath="//input[@class='crmbutton small edit']")
private WebElement MassEditbn;

@FindBy(xpath="//a[.='edit']")
private WebElement editlink;

@FindBy(xpath="//a[.='del']")
private WebElement dellink;
public SalesOrderPage(WebDriver d)
{
PageFactory.initElements(d, this);	
}
public WebElement getCreateSalesbn() {
	return CreateSalesbn;
}
public WebElement getSearchbn() {
	return Searchbn;
}
public WebElement getSearchfortb() {
	return Searchfortb;
}
public WebElement getIndropdn() {
	return Indropdn;
}
public WebElement getSearchNowbn() {
	return SearchNowbn;
}
public WebElement getFiltersDropdn() {
	return FiltersDropdn;
}
public WebElement getCreatefilterLink() {
	return CreatefilterLink;
}
public WebElement getEditfilterLink() {
	return EditfilterLink;
}
public WebElement getDeletefilterLink() {
	return DeletefilterLink;
}
public WebElement getDeletebn() {
	return Deletebn;
}
public WebElement getMassEditbn() {
	return MassEditbn;
}
public WebElement getEditlink() {
	return editlink;
}
public WebElement getDellink() {
	return dellink;
}
}

