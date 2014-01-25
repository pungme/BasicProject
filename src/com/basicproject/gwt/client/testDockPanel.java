package com.basicproject.gwt.client;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.Widget;

public class testDockPanel {
	
	  public Widget onInitialize() {
		    // Create a Dock Panel
		    DockPanel dock = new DockPanel();
		    dock.setStyleName("cw-DockPanel"); // from this we can add css...
		    dock.setSpacing(4);
		    dock.setSize("100%", "100%");
		    dock.setHorizontalAlignment(DockPanel.ALIGN_CENTER);

		    // Add text all around
		    dock.add(new HTML("testNorth"), DockPanel.NORTH);
		    dock.add(new HTML("testSouth"), DockPanel.SOUTH);
		    dock.add(new HTML("testEast"), DockPanel.EAST);
		    dock.add(new HTML("testWest"), DockPanel.WEST);
		 //   dock.add(new HTML("testNorth2"), DockPanel.NORTH);
		 //   dock.add(new HTML("testSouth2"), DockPanel.SOUTH);
		    
		    // Add scrollable text in the center
		    HTML contents = new HTML("content krub");
		    ScrollPanel scroller = new ScrollPanel(contents);
		    scroller.setSize("400px", "100%");
		    dock.add(scroller, DockPanel.CENTER);

		    // Return the content
		    dock.ensureDebugId("cwDockPanel");

			//RootLayoutPanel.get().add(p);
		    return dock;
		  }
}
