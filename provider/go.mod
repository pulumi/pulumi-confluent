module github.com/pulumi/pulumi-confluent/provider

go 1.16

replace github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20201218231525-9cca98608a5e

require (
	github.com/Mongey/terraform-provider-confluentcloud v0.0.10
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.2.1
	github.com/pulumi/pulumi/sdk/v3 v3.4.0
)
