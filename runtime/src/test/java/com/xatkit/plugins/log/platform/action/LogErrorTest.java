package com.xatkit.plugins.log.platform.action;

import com.xatkit.core.session.XatkitSession;
import fr.inria.atlanmod.commons.log.Log;

public class LogErrorTest extends LogActionTest<LogError> {

    private static String ERROR_TAG = "[ERROR]";

    @Override
    protected LogError createLogAction(String message) {
        LogError action = new LogError(platform, new XatkitSession("id"), message);
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
        return ERROR_TAG;
    }
}
