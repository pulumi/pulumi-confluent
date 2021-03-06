// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluent

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetEnvironment(ctx *pulumi.Context, args *GetEnvironmentArgs, opts ...pulumi.InvokeOption) (*GetEnvironmentResult, error) {
	var rv GetEnvironmentResult
	err := ctx.Invoke("confluent:index/getEnvironment:getEnvironment", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEnvironment.
type GetEnvironmentArgs struct {
	// The name of the environment
	Name string `pulumi:"name"`
}

// A collection of values returned by getEnvironment.
type GetEnvironmentResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The name of the environment
	Name string `pulumi:"name"`
}

func GetEnvironmentOutput(ctx *pulumi.Context, args GetEnvironmentOutputArgs, opts ...pulumi.InvokeOption) GetEnvironmentResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetEnvironmentResult, error) {
			args := v.(GetEnvironmentArgs)
			r, err := GetEnvironment(ctx, &args, opts...)
			var s GetEnvironmentResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetEnvironmentResultOutput)
}

// A collection of arguments for invoking getEnvironment.
type GetEnvironmentOutputArgs struct {
	// The name of the environment
	Name pulumi.StringInput `pulumi:"name"`
}

func (GetEnvironmentOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEnvironmentArgs)(nil)).Elem()
}

// A collection of values returned by getEnvironment.
type GetEnvironmentResultOutput struct{ *pulumi.OutputState }

func (GetEnvironmentResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEnvironmentResult)(nil)).Elem()
}

func (o GetEnvironmentResultOutput) ToGetEnvironmentResultOutput() GetEnvironmentResultOutput {
	return o
}

func (o GetEnvironmentResultOutput) ToGetEnvironmentResultOutputWithContext(ctx context.Context) GetEnvironmentResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetEnvironmentResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetEnvironmentResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the environment
func (o GetEnvironmentResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetEnvironmentResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEnvironmentResultOutput{})
}
