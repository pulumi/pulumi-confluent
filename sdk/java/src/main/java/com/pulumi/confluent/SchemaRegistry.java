// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluent;

import com.pulumi.confluent.SchemaRegistryArgs;
import com.pulumi.confluent.Utilities;
import com.pulumi.confluent.inputs.SchemaRegistryState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="confluent:index/schemaRegistry:SchemaRegistry")
public class SchemaRegistry extends com.pulumi.resources.CustomResource {
    @Export(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    public Output<String> endpoint() {
        return this.endpoint;
    }
    /**
     * Environment ID
     * 
     */
    @Export(name="environmentId", type=String.class, parameters={})
    private Output<String> environmentId;

    /**
     * @return Environment ID
     * 
     */
    public Output<String> environmentId() {
        return this.environmentId;
    }
    /**
     * where
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return where
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Cloud provider
     * 
     */
    @Export(name="serviceProvider", type=String.class, parameters={})
    private Output<String> serviceProvider;

    /**
     * @return Cloud provider
     * 
     */
    public Output<String> serviceProvider() {
        return this.serviceProvider;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SchemaRegistry(String name) {
        this(name, SchemaRegistryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SchemaRegistry(String name, SchemaRegistryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SchemaRegistry(String name, SchemaRegistryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluent:index/schemaRegistry:SchemaRegistry", name, args == null ? SchemaRegistryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SchemaRegistry(String name, Output<String> id, @Nullable SchemaRegistryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluent:index/schemaRegistry:SchemaRegistry", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SchemaRegistry get(String name, Output<String> id, @Nullable SchemaRegistryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SchemaRegistry(name, id, state, options);
    }
}
