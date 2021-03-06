// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Confluent
{
    public static class GetServiceAccount
    {
        public static Task<GetServiceAccountResult> InvokeAsync(GetServiceAccountArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetServiceAccountResult>("confluent:index/getServiceAccount:getServiceAccount", args ?? new GetServiceAccountArgs(), options.WithDefaults());

        public static Output<GetServiceAccountResult> Invoke(GetServiceAccountInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetServiceAccountResult>("confluent:index/getServiceAccount:getServiceAccount", args ?? new GetServiceAccountInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServiceAccountArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the service account
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetServiceAccountArgs()
        {
        }
    }

    public sealed class GetServiceAccountInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the service account
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetServiceAccountInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetServiceAccountResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the service account
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetServiceAccountResult(
            string id,

            string name)
        {
            Id = id;
            Name = name;
        }
    }
}
