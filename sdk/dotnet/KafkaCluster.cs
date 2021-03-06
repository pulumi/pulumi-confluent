// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Confluent
{
    [ConfluentResourceType("confluent:index/kafkaCluster:KafkaCluster")]
    public partial class KafkaCluster : Pulumi.CustomResource
    {
        /// <summary>
        /// LOW(single-zone) or HIGH(multi-zone)
        /// </summary>
        [Output("availability")]
        public Output<string> Availability { get; private set; } = null!;

        [Output("bootstrapServers")]
        public Output<string> BootstrapServers { get; private set; } = null!;

        /// <summary>
        /// cku
        /// </summary>
        [Output("cku")]
        public Output<int?> Cku { get; private set; } = null!;

        /// <summary>
        /// Deployment settings. Currently only `sku` is supported.
        /// </summary>
        [Output("deployment")]
        public Output<ImmutableDictionary<string, string>?> Deployment { get; private set; } = null!;

        /// <summary>
        /// Environment ID
        /// </summary>
        [Output("environmentId")]
        public Output<string> EnvironmentId { get; private set; } = null!;

        /// <summary>
        /// The name of the cluster
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Network egress limit(MBps)
        /// </summary>
        [Output("networkEgress")]
        public Output<int?> NetworkEgress { get; private set; } = null!;

        /// <summary>
        /// Network ingress limit(MBps)
        /// </summary>
        [Output("networkIngress")]
        public Output<int?> NetworkIngress { get; private set; } = null!;

        /// <summary>
        /// where
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// AWS / GCP
        /// </summary>
        [Output("serviceProvider")]
        public Output<string> ServiceProvider { get; private set; } = null!;

        /// <summary>
        /// Storage limit(GB)
        /// </summary>
        [Output("storage")]
        public Output<int?> Storage { get; private set; } = null!;


        /// <summary>
        /// Create a KafkaCluster resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public KafkaCluster(string name, KafkaClusterArgs args, CustomResourceOptions? options = null)
            : base("confluent:index/kafkaCluster:KafkaCluster", name, args ?? new KafkaClusterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private KafkaCluster(string name, Input<string> id, KafkaClusterState? state = null, CustomResourceOptions? options = null)
            : base("confluent:index/kafkaCluster:KafkaCluster", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing KafkaCluster resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static KafkaCluster Get(string name, Input<string> id, KafkaClusterState? state = null, CustomResourceOptions? options = null)
        {
            return new KafkaCluster(name, id, state, options);
        }
    }

    public sealed class KafkaClusterArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// LOW(single-zone) or HIGH(multi-zone)
        /// </summary>
        [Input("availability", required: true)]
        public Input<string> Availability { get; set; } = null!;

        /// <summary>
        /// cku
        /// </summary>
        [Input("cku")]
        public Input<int>? Cku { get; set; }

        [Input("deployment")]
        private InputMap<string>? _deployment;

        /// <summary>
        /// Deployment settings. Currently only `sku` is supported.
        /// </summary>
        public InputMap<string> Deployment
        {
            get => _deployment ?? (_deployment = new InputMap<string>());
            set => _deployment = value;
        }

        /// <summary>
        /// Environment ID
        /// </summary>
        [Input("environmentId", required: true)]
        public Input<string> EnvironmentId { get; set; } = null!;

        /// <summary>
        /// The name of the cluster
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Network egress limit(MBps)
        /// </summary>
        [Input("networkEgress")]
        public Input<int>? NetworkEgress { get; set; }

        /// <summary>
        /// Network ingress limit(MBps)
        /// </summary>
        [Input("networkIngress")]
        public Input<int>? NetworkIngress { get; set; }

        /// <summary>
        /// where
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// AWS / GCP
        /// </summary>
        [Input("serviceProvider", required: true)]
        public Input<string> ServiceProvider { get; set; } = null!;

        /// <summary>
        /// Storage limit(GB)
        /// </summary>
        [Input("storage")]
        public Input<int>? Storage { get; set; }

        public KafkaClusterArgs()
        {
        }
    }

    public sealed class KafkaClusterState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// LOW(single-zone) or HIGH(multi-zone)
        /// </summary>
        [Input("availability")]
        public Input<string>? Availability { get; set; }

        [Input("bootstrapServers")]
        public Input<string>? BootstrapServers { get; set; }

        /// <summary>
        /// cku
        /// </summary>
        [Input("cku")]
        public Input<int>? Cku { get; set; }

        [Input("deployment")]
        private InputMap<string>? _deployment;

        /// <summary>
        /// Deployment settings. Currently only `sku` is supported.
        /// </summary>
        public InputMap<string> Deployment
        {
            get => _deployment ?? (_deployment = new InputMap<string>());
            set => _deployment = value;
        }

        /// <summary>
        /// Environment ID
        /// </summary>
        [Input("environmentId")]
        public Input<string>? EnvironmentId { get; set; }

        /// <summary>
        /// The name of the cluster
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Network egress limit(MBps)
        /// </summary>
        [Input("networkEgress")]
        public Input<int>? NetworkEgress { get; set; }

        /// <summary>
        /// Network ingress limit(MBps)
        /// </summary>
        [Input("networkIngress")]
        public Input<int>? NetworkIngress { get; set; }

        /// <summary>
        /// where
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// AWS / GCP
        /// </summary>
        [Input("serviceProvider")]
        public Input<string>? ServiceProvider { get; set; }

        /// <summary>
        /// Storage limit(GB)
        /// </summary>
        [Input("storage")]
        public Input<int>? Storage { get; set; }

        public KafkaClusterState()
        {
        }
    }
}
