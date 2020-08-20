package PSI;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Tiger.pom.CreatePurchaseOrderPage;
import com.Tiger.pom.PurchaseOrder;
import com.Tiger.pom.VtigerHomePage;

import Tiger.Tiger.Baseclass;

public class CreatePurchaseOrder extends Baseclass{
@Test
public void toCreatePurchase()
{
     VtigerHomePage v = new VtigerHomePage(d);
     WebElement More = v.getMoredropdn();
     Actions a = new Actions(d);
     a.click(More).perform();
     v.getPurchaseOrderlink().click();
     PurchaseOrder po = new PurchaseOrder(d);
     po.getCreatePurchasebn().click();
     CreatePurchaseOrderPage cpo = new CreatePurchaseOrderPage(d);
     cpo.getSubjecttb().sendKeys("Petroleum Cans");
     cpo.getVendorNamebn().click();
     cpo.getDueDatetb().sendKeys("2020-1-12");
     WebElement status = cpo.getStatusdropdn();
     Select sstatus = new Select(status);
     sstatus.selectByIndex(1);
     d.switchTo().frame(0);
}     
}
