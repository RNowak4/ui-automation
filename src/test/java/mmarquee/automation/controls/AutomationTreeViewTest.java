package mmarquee.automation.controls;

import mmarquee.automation.AutomationElement;
import mmarquee.automation.PropertyID;
import mmarquee.automation.pattern.ItemContainer;
import mmarquee.automation.uiautomation.IUIAutomationElement3;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.when;

/**
 * Created by Mark Humphreys on 30/11/2016.
 */
public class AutomationTreeViewTest {

    static {
        ClassLoader.getSystemClassLoader().setDefaultAssertionStatus(true);
    }

    @Test
    public void testName() throws Exception {
        AutomationElement element = Mockito.mock(AutomationElement.class);

        when(element.getName()).thenReturn("NAME");

        AutomationTreeView ctrl = new AutomationTreeView(element);

        String name = ctrl.name();

        assertTrue(name.equals("NAME"));    }

    @Test
    public void testGetItem_When_Item_Present() throws Exception {
        AutomationElement element = Mockito.mock(AutomationElement.class);

        IUIAutomationElement3 listElement = Mockito.mock(IUIAutomationElement3.class);

        AutomationElement result = new AutomationElement(listElement);

        when(element.findFirst(anyObject(), anyObject())).thenReturn(result);
        when(element.getPropertyValue(PropertyID.IsSelectionItemPatternAvailable.getValue())).thenReturn(1);

        AutomationTreeView ctrl = new AutomationTreeView(element);

        AutomationTreeViewItem treeItem = ctrl.getItem("SubItem");

        // Need to verify something
    }
}
