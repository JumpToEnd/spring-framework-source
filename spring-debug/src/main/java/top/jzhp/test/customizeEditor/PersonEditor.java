package top.jzhp.test.customizeEditor;

import org.springframework.beans.PropertyEditorRegistrySupport;

import java.beans.PropertyEditorSupport;

public class PersonEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        super.setAsText(text);
    }
}
