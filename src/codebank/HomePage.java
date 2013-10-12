package codebank;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.Model;

/**
 * Homepage
 */
public class HomePage extends WebPage {

	
        private Label label;
        private TextField field;
        private TextField field2;
        
        public HomePage() 
        {
        	
        Form form = new Form("form");
        
        field = new TextField("field", new Model(""));
        form.add(field);
        
        field2 = new TextField("field2", new Model(""));
        form.add(field2);
        
        form.add(new Button("button") {
        @Override
        public void onSubmit() {
        String value = (String)field.getModelObject();
        String value2 = (String)field2.getModelObject();
        
        int summ = Integer.parseInt(value) + Integer.parseInt(value2);
        
        label.setModelObject(Integer.toString(summ));
        field.setModelObject("");
        field2.setModelObject("");
        }
        });
        add(form);
        add(label = new Label("message", new Model("")));
        }
        
        
   
}
