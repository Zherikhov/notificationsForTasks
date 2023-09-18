package ru.zherikhov.vladislav.webwork;

import com.atlassian.jira.web.action.JiraWebActionSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NFTWebWorkAction extends JiraWebActionSupport {

    private static final Logger log = LoggerFactory.getLogger(NFTWebWorkAction.class);

    @Override
    public String doExecute() throws Exception {
        //<img src="../../../download/resources/ru.zherikhov.vladislav.notificationsForTasks:nft-web-panel/nft-web" alt="Icon">
        return SUCCESS;
    }
}
