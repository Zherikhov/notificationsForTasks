package ru.zherikhov.vladislav.service;

import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
import com.atlassian.sal.api.pluginsettings.PluginSettings;
import com.atlassian.sal.api.pluginsettings.PluginSettingsFactory;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class PluginSettingService {

    private final PluginSettings pluginSettings;
    private final String PLUGIN_STORAGE_KEY = "ru.zherikhov.vladislav.aaa";

    @Inject
    public PluginSettingService(@ComponentImport PluginSettingsFactory pluginSettingsFactory) {
        this.pluginSettings = pluginSettingsFactory.createGlobalSettings();
    }

    public String getParameter(String parameterName) {
        return pluginSettings.get(PLUGIN_STORAGE_KEY + parameterName) == null || pluginSettings.get(PLUGIN_STORAGE_KEY + parameterName).toString().isEmpty() ?
                "no value" : pluginSettings.get(PLUGIN_STORAGE_KEY + parameterName).toString();
    }

    public void setParameter(String parameterName, String parameterValue) {
        this.pluginSettings.put(PLUGIN_STORAGE_KEY + parameterName, parameterValue);
    }

    public String getEmail() {
        return this.getParameter("email");
    }

    public String getComment() {
        return this.getParameter("comment");
    }

    public void setEmail(String parameter1) {
        this.setParameter("email", parameter1);
    }

    public void setComment(String parameter2) {
        this.setParameter("comment", parameter2);
    }
}
