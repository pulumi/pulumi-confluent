// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluent.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEnvironmentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentPlainArgs Empty = new GetEnvironmentPlainArgs();

    /**
     * The name of the environment
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the environment
     * 
     */
    public String name() {
        return this.name;
    }

    private GetEnvironmentPlainArgs() {}

    private GetEnvironmentPlainArgs(GetEnvironmentPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEnvironmentPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEnvironmentPlainArgs $;

        public Builder() {
            $ = new GetEnvironmentPlainArgs();
        }

        public Builder(GetEnvironmentPlainArgs defaults) {
            $ = new GetEnvironmentPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the environment
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetEnvironmentPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}