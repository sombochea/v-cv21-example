package com.cubetiqs.vaadin.example.v21.views.about;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.cubetiqs.vaadin.example.v21.views.MainLayout;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@PageTitle("About")
@Route(value = "about", layout = MainLayout.class)
@AnonymousAllowed
public class AboutView extends Div {

    public AboutView() {
        addClassName("about-view");
        add(new Text("Content placeholder"));
    }

}
