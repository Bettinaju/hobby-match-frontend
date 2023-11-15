package com.hobbymatch.application.views.list;

import com.hobbymatch.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

@PageTitle("List")
@Route(value = "list", layout = MainLayout.class)
@PermitAll
@Uses(Icon.class)
public class ListView extends Composite<VerticalLayout> {

    public ListView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
