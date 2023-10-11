package ru.zherikhov.vladislav.webwork;

import com.atlassian.jira.web.action.JiraWebActionSupport;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import ru.zherikhov.vladislav.service.PluginSettingService;
import webwork.action.ResultException;

import javax.inject.Inject;
import java.util.HashMap;

@Slf4j
@Data
public class NFTWebWorkAction extends JiraWebActionSupport {

    private final PluginSettingService pluginSettingService;
    private String email;
    private String comment;

    @Inject
    public NFTWebWorkAction(PluginSettingService pluginSettingService) {
        this.pluginSettingService = pluginSettingService;
        this.refreshParameters();
    }

    @Override
    public String doExecute() {
        this.refreshParameters();

        return SUCCESS;
    }

    public String doSave() throws ResultException {
        this.validate();
        this.pluginSettingService.setEmail(this.email);
        this.pluginSettingService.setComment(this.comment);
        this.refreshParameters();

        return SUCCESS;
    }

    @Override
    public void doValidation() {
        try {
            Integer param1 = Integer.parseInt(this.email);
            if (param1 < 1) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            this.errorMap = new HashMap();
            this.errorMap.put("parameter1", "not positive integer");
        }
    }

    public String doClear() {

        return SUCCESS;
    }

    private void refreshParameters() {
        this.email = this.pluginSettingService.getEmail();
        this.comment = this.pluginSettingService.getComment();
    }
}
