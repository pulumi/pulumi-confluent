// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluent.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorState extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorState Empty = new ConnectorState();

    /**
     * ID of containing cluster, e.g. lkc-abc123
     * 
     */
    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    /**
     * @return ID of containing cluster, e.g. lkc-abc123
     * 
     */
    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * Type-specific Configuration of connector. String keys and values
     * 
     */
    @Import(name="config")
    private @Nullable Output<Map<String,Object>> config;

    /**
     * @return Type-specific Configuration of connector. String keys and values
     * 
     */
    public Optional<Output<Map<String,Object>>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * Sensitive part of connector configuration. String keys and values
     * 
     */
    @Import(name="configSensitive")
    private @Nullable Output<Map<String,Object>> configSensitive;

    /**
     * @return Sensitive part of connector configuration. String keys and values
     * 
     */
    public Optional<Output<Map<String,Object>>> configSensitive() {
        return Optional.ofNullable(this.configSensitive);
    }

    /**
     * ID of containing environment, e.g. env-abc123
     * 
     */
    @Import(name="environmentId")
    private @Nullable Output<String> environmentId;

    /**
     * @return ID of containing environment, e.g. env-abc123
     * 
     */
    public Optional<Output<String>> environmentId() {
        return Optional.ofNullable(this.environmentId);
    }

    /**
     * The name of the connector
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the connector
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ConnectorState() {}

    private ConnectorState(ConnectorState $) {
        this.clusterId = $.clusterId;
        this.config = $.config;
        this.configSensitive = $.configSensitive;
        this.environmentId = $.environmentId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorState $;

        public Builder() {
            $ = new ConnectorState();
        }

        public Builder(ConnectorState defaults) {
            $ = new ConnectorState(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId ID of containing cluster, e.g. lkc-abc123
         * 
         * @return builder
         * 
         */
        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId ID of containing cluster, e.g. lkc-abc123
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param config Type-specific Configuration of connector. String keys and values
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<Map<String,Object>> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config Type-specific Configuration of connector. String keys and values
         * 
         * @return builder
         * 
         */
        public Builder config(Map<String,Object> config) {
            return config(Output.of(config));
        }

        /**
         * @param configSensitive Sensitive part of connector configuration. String keys and values
         * 
         * @return builder
         * 
         */
        public Builder configSensitive(@Nullable Output<Map<String,Object>> configSensitive) {
            $.configSensitive = configSensitive;
            return this;
        }

        /**
         * @param configSensitive Sensitive part of connector configuration. String keys and values
         * 
         * @return builder
         * 
         */
        public Builder configSensitive(Map<String,Object> configSensitive) {
            return configSensitive(Output.of(configSensitive));
        }

        /**
         * @param environmentId ID of containing environment, e.g. env-abc123
         * 
         * @return builder
         * 
         */
        public Builder environmentId(@Nullable Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        /**
         * @param environmentId ID of containing environment, e.g. env-abc123
         * 
         * @return builder
         * 
         */
        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
        }

        /**
         * @param name The name of the connector
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the connector
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ConnectorState build() {
            return $;
        }
    }

}
