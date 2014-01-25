package com.basicproject.gwt.client;

import com.github.gwtbootstrap.client.ui.NavLink;
import com.github.gwtbootstrap.client.ui.Navbar;
import com.github.gwtbootstrap.client.ui.base.NavbarButton;
import com.github.gwtbootstrap.client.ui.constants.NavbarPosition;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
public class Home implements EntryPoint {

	private testUiBinder testBootstrap= new testUiBinder();
	
	@Override
	public void onModuleLoad() {
		//testDockPanel p = new testDockPanel();
		//RootPanel.get().add(p.onInitialize());
		/*Navbar navbar = new Navbar();
		NavbarButton testButton = new NavbarButton("testButton");
		navbar.add(testButton);
		
		RootPanel.get().add(navbar); */
/*		Navbar navbar = new Navbar();
		navbar.setPosition(NavbarPosition.TOP);
		RootPanel.get().add(navbar);*/
		
		RootPanel.get().add(testBootstrap);
/*		DockLayoutPanel p = new DockLayoutPanel(Unit.EM);
		p.addNorth(new HTML("header"), 2);
		p.addSouth(new HTML("footer"), 2);
		p.addWest(new HTML("navigation"), 10);
		p.add(new HTML("test"));
		
		RootLayoutPanel.get().add(p);*/
	}

}
