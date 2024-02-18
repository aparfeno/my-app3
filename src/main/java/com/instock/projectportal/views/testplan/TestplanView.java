package com.instock.projectportal.views.testplan;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.progressbar.ProgressBar;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import jakarta.annotation.security.RolesAllowed;

@PageTitle("Testplan")
@Route(value = "testplan")
@RolesAllowed("USER")
@Uses(Icon.class)
public class TestplanView extends Composite<VerticalLayout> {

    public TestplanView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        H1 h1 = new H1();
        H2 h2 = new H2();
        H3 h3 = new H3();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        TextField textField = new TextField();
        HorizontalLayout layoutRow4 = new HorizontalLayout();
        TextField textField2 = new TextField();
        ProgressBar progressBar = new ProgressBar();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        TabSheet tabSheet = new TabSheet();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        h1.setText("Heading");
        layoutRow.setAlignSelf(FlexComponent.Alignment.CENTER, h1);
        h1.setWidth("max-content");
        h2.setText("Heading");
        layoutRow.setAlignSelf(FlexComponent.Alignment.CENTER, h2);
        h2.setWidth("max-content");
        h3.setText("Heading");
        layoutRow.setAlignSelf(FlexComponent.Alignment.CENTER, h3);
        h3.setWidth("max-content");
        layoutRow2.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        layoutRow2.setAlignItems(Alignment.CENTER);
        layoutRow2.setJustifyContentMode(JustifyContentMode.END);
        layoutColumn2.setHeightFull();
        layoutRow2.setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth("min-content");
        layoutColumn2.getStyle().set("flex-grow", "1");
        layoutColumn2.setJustifyContentMode(JustifyContentMode.CENTER);
        layoutColumn2.setAlignItems(Alignment.END);
        layoutRow3.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.getStyle().set("flex-grow", "1");
        textField.setLabel("Text field");
        textField.setWidth("100px");
        layoutRow4.setHeightFull();
        layoutRow3.setFlexGrow(1.0, layoutRow4);
        layoutRow4.addClassName(Gap.MEDIUM);
        layoutRow4.setWidth("100%");
        layoutRow4.getStyle().set("flex-grow", "1");
        layoutRow4.setAlignItems(Alignment.CENTER);
        layoutRow4.setJustifyContentMode(JustifyContentMode.END);
        textField2.setLabel("Text field");
        layoutRow4.setAlignSelf(FlexComponent.Alignment.CENTER, textField2);
        textField2.setWidth("50px");
        progressBar.setValue(0.5);
        layoutColumn2.setAlignSelf(FlexComponent.Alignment.CENTER, progressBar);
        progressBar.setWidth("300px");
        progressBar.setHeight("15px");
        layoutColumn3.addClassName(Gap.XLARGE);
        layoutColumn3.setWidth("100%");
        layoutColumn3.getStyle().set("flex-grow", "1");
        tabSheet.setWidth("100%");
        tabSheet.getStyle().set("flex-grow", "1");
        setTabSheetSampleData(tabSheet);
        getContent().add(layoutRow);
        layoutRow.add(h1);
        layoutRow.add(h2);
        layoutRow.add(h3);
        layoutRow.add(layoutRow2);
        layoutRow2.add(layoutColumn2);
        layoutColumn2.add(layoutRow3);
        layoutRow3.add(textField);
        layoutRow3.add(layoutRow4);
        layoutRow4.add(textField2);
        layoutColumn2.add(progressBar);
        getContent().add(layoutColumn3);
        layoutColumn3.add(tabSheet);
    }

    private void setTabSheetSampleData(TabSheet tabSheet) {
        tabSheet.add("Dashboard", new Div(new Text("This is the Dashboard tab content")));
        tabSheet.add("Payment", new Div(new Text("This is the Payment tab content")));
        tabSheet.add("Shipping", new Div(new Text("This is the Shipping tab content")));
    }
}
