package com.pscu.quickAssist.util;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.pscu.config.ConfigImpl;

public class QuickAssistConfigImplTest {

	private static final String JNDI_NAME = "resource/entries/quickAssist"; 
	private static final ConfigImpl CONFIG_IMPL = new ConfigImpl(JNDI_NAME);
	
	@Test
	public void getAttribute() {
		
		String response = (String) CONFIG_IMPL.getAttribute("applicationId");
		assertEquals(8488, response);
		
	}
	
}
