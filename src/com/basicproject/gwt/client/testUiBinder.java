package com.basicproject.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class testUiBinder extends Composite implements HasText {

	private static testUiBinderUiBinder uiBinder = GWT
			.create(testUiBinderUiBinder.class);

	interface testUiBinderUiBinder extends UiBinder<Widget, testUiBinder> {
	}

	public testUiBinder() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	//@UiField
	@UiField Button testBtn;
	//@UiField Button button;
	//Button button;

	public testUiBinder(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiHandler("button")
	void onClick(ClickEvent e) {
		//Window.alert("Hello!");
		testBtn.setText("Change!");
	}

	public void setText(String text) {
		//button.setText(text);
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

}
