// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluent;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfluentEnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfluentEnvironmentArgs Empty = new ConfluentEnvironmentArgs();

    /**
     * The name of the environment
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the environment
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ConfluentEnvironmentArgs() {}

    private ConfluentEnvironmentArgs(ConfluentEnvironmentArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfluentEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfluentEnvironmentArgs $;

        public Builder() {
            $ = new ConfluentEnvironmentArgs();
        }

        public Builder(ConfluentEnvironmentArgs defaults) {
            $ = new ConfluentEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the environment
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the environment
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ConfluentEnvironmentArgs build() {
            return $;
        }
    }

}
