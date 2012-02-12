package org.elasticsearch.plugin.river.couchbase;

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.plugins.AbstractPlugin;
import org.elasticsearch.river.RiversModule;
import org.elasticsearch.river.couchbase.CouchbaseRiverModule;

public class CouchbaseRiverPlugin extends AbstractPlugin {

    @Inject
    public CouchbaseRiverPlugin() {
    }

    @Override
    public String name() {
        return "river-couchbase";
    }

    @Override
    public String description() {
        return "River Couchbase Plugin";
    }

    public void onModule(RiversModule module) {
        module.registerRiver("couchbase", CouchbaseRiverModule.class);
    }

}