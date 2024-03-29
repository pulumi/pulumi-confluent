// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluent.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServiceAccountPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceAccountPlainArgs Empty = new GetServiceAccountPlainArgs();

    /**
     * The name of the service account
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the service account
     * 
     */
    public String name() {
        return this.name;
    }

    private GetServiceAccountPlainArgs() {}

    private GetServiceAccountPlainArgs(GetServiceAccountPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceAccountPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceAccountPlainArgs $;

        public Builder() {
            $ = new GetServiceAccountPlainArgs();
        }

        public Builder(GetServiceAccountPlainArgs defaults) {
            $ = new GetServiceAccountPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the service account
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetServiceAccountPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
