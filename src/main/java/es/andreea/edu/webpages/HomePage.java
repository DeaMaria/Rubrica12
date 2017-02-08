package es.andreea.edu.webpages;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.Model;
import org.joda.time.DateTime;

import de.agilecoders.wicket.extensions.markup.html.bootstrap.form.datetime.DatetimePicker;

public class HomePage extends WebPage {

	public HomePage() {
		
		private static final Logger logger = LogManager.getLogger(HomePage.class.getName());

		Form form = new Form("formInsertLogin",
				new CompoundPropertyModel());
		form.add(new Label("nameAuthorLabel", getString("author.name")));
		form.add(new Label("dateOfBirthKabel", getString("date.of.birth")));
		form.add(new RequiredTextField("nameAuthor"));
		DatetimePicker datetimePicker = new DatetimePicker("dateOfBirth", "yyyy-MM-dd");
		form.add(datetimePicker);
		FeedbackPanel feedbackPanel = new FeedbackPanel("feedbackMessage");
		feedbackPanel.setOutputMarkupId(true);
		add(feedbackPanel);

		add(form);
	}



}
