// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export function getEnvironment(args: GetEnvironmentArgs, opts?: pulumi.InvokeOptions): Promise<GetEnvironmentResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("confluent:index/getEnvironment:getEnvironment", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getEnvironment.
 */
export interface GetEnvironmentArgs {
    name: string;
}

/**
 * A collection of values returned by getEnvironment.
 */
export interface GetEnvironmentResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
}

export function getEnvironmentOutput(args: GetEnvironmentOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetEnvironmentResult> {
    return pulumi.output(args).apply(a => getEnvironment(a, opts))
}

/**
 * A collection of arguments for invoking getEnvironment.
 */
export interface GetEnvironmentOutputArgs {
    name: pulumi.Input<string>;
}
