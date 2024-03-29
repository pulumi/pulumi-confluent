// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluent;

import com.pulumi.confluent.ApiKeyArgs;
import com.pulumi.confluent.Utilities;
import com.pulumi.confluent.inputs.ApiKeyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="confluent:index/apiKey:ApiKey")
public class ApiKey extends com.pulumi.resources.CustomResource {
    @Export(name="clusterId", type=String.class, parameters={})
    private Output</* @Nullable */ String> clusterId;

    public Output<Optional<String>> clusterId() {
        return Codegen.optional(this.clusterId);
    }
    /**
     * Description
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
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
    @Export(name="key", type=String.class, parameters={})
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }
    /**
     * Logical Cluster ID List to create API Key
     * 
     */
    @Export(name="logicalClusters", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> logicalClusters;

    /**
     * @return Logical Cluster ID List to create API Key
     * 
     */
    public Output<Optional<List<String>>> logicalClusters() {
        return Codegen.optional(this.logicalClusters);
    }
    @Export(name="secret", type=String.class, parameters={})
    private Output<String> secret;

    public Output<String> secret() {
        return this.secret;
    }
    /**
     * User ID
     * 
     */
    @Export(name="userId", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> userId;

    /**
     * @return User ID
     * 
     */
    public Output<Optional<Integer>> userId() {
        return Codegen.optional(this.userId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiKey(String name) {
        this(name, ApiKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiKey(String name, ApiKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiKey(String name, ApiKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluent:index/apiKey:ApiKey", name, args == null ? ApiKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApiKey(String name, Output<String> id, @Nullable ApiKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluent:index/apiKey:ApiKey", name, state, makeResourceOptions(options, id));
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
    public static ApiKey get(String name, Output<String> id, @Nullable ApiKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApiKey(name, id, state, options);
    }
}
