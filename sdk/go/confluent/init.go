// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package confluent

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "confluent:index/apiKey:ApiKey":
		r = &ApiKey{}
	case "confluent:index/confluentEnvironment:ConfluentEnvironment":
		r = &ConfluentEnvironment{}
	case "confluent:index/connector:Connector":
		r = &Connector{}
	case "confluent:index/kafkaCluster:KafkaCluster":
		r = &KafkaCluster{}
	case "confluent:index/schemaRegistry:SchemaRegistry":
		r = &SchemaRegistry{}
	case "confluent:index/serviceAccount:ServiceAccount":
		r = &ServiceAccount{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

type pkg struct {
	version semver.Version
}

func (p *pkg) Version() semver.Version {
	return p.version
}

func (p *pkg) ConstructProvider(ctx *pulumi.Context, name, typ, urn string) (pulumi.ProviderResource, error) {
	if typ != "pulumi:providers:confluent" {
		return nil, fmt.Errorf("unknown provider type: %s", typ)
	}

	r := &Provider{}
	err := ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return r, err
}

func init() {
	version, err := PkgVersion()
	if err != nil {
		fmt.Println("failed to determine package version. defaulting to v1: %v", err)
	}
	pulumi.RegisterResourceModule(
		"confluent",
		"index/apiKey",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluent",
		"index/confluentEnvironment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluent",
		"index/connector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluent",
		"index/kafkaCluster",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluent",
		"index/schemaRegistry",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluent",
		"index/serviceAccount",
		&module{version},
	)
	pulumi.RegisterResourcePackage(
		"confluent",
		&pkg{version},
	)
}
