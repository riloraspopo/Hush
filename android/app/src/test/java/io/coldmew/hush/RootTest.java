package io.coldmew.hush;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.coldmew.hush.helper.HelperProtocol;
import org.junit.Test;

public class RootTest {
    @Test
    public void testRootUidConstant() {
        assertEquals(0, HelperProtocol.ROOT_UID);
        assertEquals(2000, HelperProtocol.SHELL_UID);
    }

    @Test
    public void testRootState() {
        Shell.setRootGranted(false);
        assertFalse(Shell.rootGranted());
        Shell.setRootGranted(true);
        assertTrue(Shell.rootGranted());
        assertTrue(Shell.ready());
        Shell.setRootGranted(false);
    }
}

