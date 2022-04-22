// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluent

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupServiceAccount(ctx *pulumi.Context, args *LookupServiceAccountArgs, opts ...pulumi.InvokeOption) (*LookupServiceAccountResult, error) {
	var rv LookupServiceAccountResult
	err := ctx.Invoke("confluent:index/getServiceAccount:getServiceAccount", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServiceAccount.
type LookupServiceAccountArgs struct {
	// The name of the service account
	Name string `pulumi:"name"`
}

// A collection of values returned by getServiceAccount.
type LookupServiceAccountResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The name of the service account
	Name string `pulumi:"name"`
}

func LookupServiceAccountOutput(ctx *pulumi.Context, args LookupServiceAccountOutputArgs, opts ...pulumi.InvokeOption) LookupServiceAccountResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupServiceAccountResult, error) {
			args := v.(LookupServiceAccountArgs)
			r, err := LookupServiceAccount(ctx, &args, opts...)
			var s LookupServiceAccountResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupServiceAccountResultOutput)
}

// A collection of arguments for invoking getServiceAccount.
type LookupServiceAccountOutputArgs struct {
	// The name of the service account
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupServiceAccountOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceAccountArgs)(nil)).Elem()
}

// A collection of values returned by getServiceAccount.
type LookupServiceAccountResultOutput struct{ *pulumi.OutputState }

func (LookupServiceAccountResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceAccountResult)(nil)).Elem()
}

func (o LookupServiceAccountResultOutput) ToLookupServiceAccountResultOutput() LookupServiceAccountResultOutput {
	return o
}

func (o LookupServiceAccountResultOutput) ToLookupServiceAccountResultOutputWithContext(ctx context.Context) LookupServiceAccountResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupServiceAccountResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceAccountResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the service account
func (o LookupServiceAccountResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceAccountResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupServiceAccountResultOutput{})
}
