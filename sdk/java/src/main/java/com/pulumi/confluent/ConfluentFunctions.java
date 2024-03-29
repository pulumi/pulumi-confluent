// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluent;

import com.pulumi.confluent.Utilities;
import com.pulumi.confluent.inputs.GetEnvironmentArgs;
import com.pulumi.confluent.inputs.GetEnvironmentPlainArgs;
import com.pulumi.confluent.inputs.GetServiceAccountArgs;
import com.pulumi.confluent.inputs.GetServiceAccountPlainArgs;
import com.pulumi.confluent.outputs.GetEnvironmentResult;
import com.pulumi.confluent.outputs.GetServiceAccountResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ConfluentFunctions {
    public static Output<GetEnvironmentResult> getEnvironment(GetEnvironmentArgs args) {
        return getEnvironment(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetEnvironmentResult> getEnvironmentPlain(GetEnvironmentPlainArgs args) {
        return getEnvironmentPlain(args, InvokeOptions.Empty);
    }
    public static Output<GetEnvironmentResult> getEnvironment(GetEnvironmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("confluent:index/getEnvironment:getEnvironment", TypeShape.of(GetEnvironmentResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetEnvironmentResult> getEnvironmentPlain(GetEnvironmentPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("confluent:index/getEnvironment:getEnvironment", TypeShape.of(GetEnvironmentResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetServiceAccountResult> getServiceAccount(GetServiceAccountArgs args) {
        return getServiceAccount(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetServiceAccountResult> getServiceAccountPlain(GetServiceAccountPlainArgs args) {
        return getServiceAccountPlain(args, InvokeOptions.Empty);
    }
    public static Output<GetServiceAccountResult> getServiceAccount(GetServiceAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("confluent:index/getServiceAccount:getServiceAccount", TypeShape.of(GetServiceAccountResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetServiceAccountResult> getServiceAccountPlain(GetServiceAccountPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("confluent:index/getServiceAccount:getServiceAccount", TypeShape.of(GetServiceAccountResult.class), args, Utilities.withVersion(options));
    }
}
