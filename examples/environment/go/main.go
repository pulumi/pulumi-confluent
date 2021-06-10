package main

import (
	"github.com/pulumi/pulumi-confluent/sdk/go/confluent"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {

		env, err := confluent.NewConfluentEnvironment(ctx, "py-env", nil)
		if err != nil {
			return err
		}

		ctx.Export("envName", env.Name)

		return nil
	})
}
