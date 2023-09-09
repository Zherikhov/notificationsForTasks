package ru.zherikhov.vladislav.webwork;

import com.atlassian.jira.web.action.JiraWebActionSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NFTWebWorkAction extends JiraWebActionSupport {

    private static final Logger log = LoggerFactory.getLogger(NFTWebWorkAction.class);

    @Override
    public String doExecute() throws Exception {

        return SUCCESS;
    }
}
