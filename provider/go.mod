module github.com/pulumi/pulumi-confluent/provider

go 1.16

replace github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20201218231525-9cca98608a5e

// Necessary for `github.com/Mongey/terraform-provider-confluentcloud@v0.0.12` due to it depending on a temporary fork of
// `github.com/cgroschupp/go-client-confluent-cloud`
replace github.com/cgroschupp/go-client-confluent-cloud => github.com/Mongey/go-client-confluent-cloud v0.0.0-20210716182312-db34016c1db0

require (
	github.com/Mongey/terraform-provider-confluentcloud v0.0.14
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.18.0
	github.com/pulumi/pulumi/sdk/v3 v3.23.2
)
