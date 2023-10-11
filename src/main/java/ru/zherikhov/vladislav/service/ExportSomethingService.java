package ru.zherikhov.vladislav.service;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class ExportSomethingService {
    private final PluginSettingService pluginSettingService;

    @Inject
    public ExportSomethingService(PluginSettingService pluginSettingService) {
        this.pluginSettingService = pluginSettingService;
    }

    public void exportDate() {
        this.pluginSettingService.getEmail();
    }
}
