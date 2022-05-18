/*
 * Copyright 2000-2017 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.traidable.app;

import java.util.List;
import java.util.Locale;

import com.traidable.app.entity.TopTierAgency;
import com.traidable.app.service.AgencyService;
import com.traidable.app.service.DbService;
import com.traidable.app.service.ReferenceService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Style;
import com.vaadin.flow.i18n.LocaleChangeEvent;
import com.vaadin.flow.i18n.LocaleChangeObserver;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

@Route
public class MainView extends VerticalLayout {

    private RouterLink link;

    private final AgencyService agencyService;
    private final ReferenceService referenceService;
    private final DbService dbService;

    public MainView(AgencyService agencyService, DbService dbService, ReferenceService referenceService) {

        this.dbService = dbService;
        this.agencyService = agencyService;
        this.referenceService = referenceService;

        H1 heading = new H1("BIG IMPORTER");
        Button bigImporter = new Button("BIG IMPORTER", event -> bigImporter());


        add(heading);
        add(new HorizontalLayout(bigImporter));

        //db info
        H3 dbHeadline = new H3("DB INFO");
        Div dbInfo = new Div();
        dbInfo.setText(dbService.dbInfo());
        Button addDB = new Button("addDB", event -> dbService.addDB());
        Button dropDB = new Button("dropDB", event -> dbService.dropDB());
        Button deleteData = new Button("deleteData", event -> dbService.dropDBData());
        Button dropDBConstraints = new Button("dropDBConstraints", event -> dbService.dropDBConstraints());
        Button addDBConstraints = new Button("addDBConstraints", event -> dbService.addDBConstraints());

        add(dbHeadline);
        add(new HorizontalLayout(dbInfo));
        add(new HorizontalLayout(addDB, dropDB, dropDBConstraints, addDBConstraints, deleteData));

        //reference info
        H3 referenceHeadline = new H3("REFERENCE INFO");
        Div referenceInfo = new Div();
        referenceInfo.setText("Number of SubmissionPeriods: DB: " + referenceService.submissionPeriodsCountDB() + "  | API: " + referenceService.submissionPeriodsCountAPI());
        Button importSubmissionPeriods = new Button("importSubmissionPeriods", event -> referenceService.importSubmissionPeriods());

        add(referenceHeadline);
        add(new HorizontalLayout(referenceInfo));
        add(new HorizontalLayout(importSubmissionPeriods));

        //agency Info
        H3 agencyHeadline = new H3("AGENCY INFO");

        Div agencyInfo = new Div();
        agencyInfo.setText("Number of Agencies: DB: " + agencyService.topTierAgencyCountDB() + "  | API: " + agencyService.topTierAgencyCountAPI());

        Div subAgencyInfo = new Div();
        //subAgencyInfo.setText("Number of SubAgencies: DB: " + agencyService.topTierAgencyCountDB() + "  | API: " + agencyService.topTierAgencyCountAPI());

        Button importTopTierAgencies = new Button("importTopTierAgencies", event -> agencyService.importTopTierAgencies());
        Button importTopTierAgencySummaries = new Button("importTopTierAgencySummaries", event -> agencyService.importTopTierAgencySummaries());

        add(agencyHeadline);
        add(new HorizontalLayout(agencyInfo));
        add(new HorizontalLayout(importTopTierAgencies, importTopTierAgencySummaries));

        Grid<TopTierAgency> grid = new Grid<>(TopTierAgency.class, true);
        List<TopTierAgency> agencies = agencyService.getAllTopTierAgencies();
        grid.setItems(agencies);
        add(grid);

    }

    public void bigImporter(){
        dbService.dropDBData();
        dbService.dropDBConstraints();
        dbService.addDBConstraints();
        agencyService.importTopTierAgencies();
        //referenceService.importSubmissionPeriods();
    }

//    @Override
//    public void localeChange(LocaleChangeEvent event) {
//        link.setText(
//                getTranslation("root.navigate_to_component"));
//    }

}
