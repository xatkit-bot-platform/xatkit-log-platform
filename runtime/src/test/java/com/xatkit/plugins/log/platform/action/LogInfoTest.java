package com.xatkit.plugins.log.platform.action;

import com.xatkit.core.session.XatkitSession;
import fr.inria.atlanmod.commons.log.Log;

public class LogInfoTest extends LogActionTest<LogInfo> {

    private static String INFO_TAG = "[INFO]";

    @Override
    protected LogInfo createLogAction(String message) {
        LogInfo action = new LogInfo(platform, new XatkitSession("id"), message);
        /*
         * Clear the appender if the action initialization generated logs.
         */
        try {
            Thread.sleep(200);
        } catch(InterruptedException e) {
            Log.error("An error occurred while waiting for new logged messages");
        }
        listAppender.clear();
        return action;
    }

    @Override
    protected String expectedLogTag() {
        return INFO_TAG;
    }
}
