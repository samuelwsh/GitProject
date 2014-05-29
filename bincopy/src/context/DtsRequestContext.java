package com.ford.dts.context;

import com.ford.it.context.RequestContext;
import com.ford.it.context.SubContext;

/**
 * This class holds the dts user's information (in this case the alias user id).
 * Based on the current design, the alias user id is the email address of either
 * the 'dts Agent' or the real user depending on whether the user elects to
 * enter as 'Agent' or 'Customer'.
 */
public class DtsRequestContext implements SubContext {
    /**
     * The dts alias user id
     */
    private String dtsAliasEmailId;

    /**
     * @see com.ford.it.context.SubContext#close()
     */
    public void close() {
        this.dtsAliasEmailId = null;
    }

    /**
     * @see com.ford.it.context.SubContext#init()
     */
    public void init() {
        // empty block
    }

    /**
     * @return The local instance of the dtsRequestContext class
     */
    public static DtsRequestContext getInstance() {
        final DtsRequestContext ctx =
                (DtsRequestContext)RequestContext.getLocalInstance()
                        .getSubContext(DtsRequestContext.class);
        return ctx;
    }

    /**
     * Get the dts alias email id stored in the thread. This will either be the
     * dts Agent email id (dtsagent@ford.com) if the user logged in as Agent, or
     * the logged in user's real email id if they logged in as a customer (e.g.
     * jburnard@ford.com).
     * 
     * @return The dts alias user id stored in the thread
     */
    public String getDtsAliasEmailId() {
        return this.dtsAliasEmailId;
    }

    /**
     * Setting the dts alias user id stored in the thread. If the user logged on
     * as the dts Agent, this set to dtsagent@ford.com otherwise it is set to
     * the real email id for the user logged in.
     * 
     * @param dtsAliasEmailId The dts alias user id to set
     */
    public void setDtsAliasEmailId(final String dtsAliasEmailId) {
        this.dtsAliasEmailId = dtsAliasEmailId;
    }
}
