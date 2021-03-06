# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['SchemaRegistryArgs', 'SchemaRegistry']

@pulumi.input_type
class SchemaRegistryArgs:
    def __init__(__self__, *,
                 environment_id: pulumi.Input[str],
                 region: pulumi.Input[str],
                 service_provider: pulumi.Input[str]):
        """
        The set of arguments for constructing a SchemaRegistry resource.
        :param pulumi.Input[str] environment_id: Environment ID
        :param pulumi.Input[str] region: where
        :param pulumi.Input[str] service_provider: Cloud provider
        """
        pulumi.set(__self__, "environment_id", environment_id)
        pulumi.set(__self__, "region", region)
        pulumi.set(__self__, "service_provider", service_provider)

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> pulumi.Input[str]:
        """
        Environment ID
        """
        return pulumi.get(self, "environment_id")

    @environment_id.setter
    def environment_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "environment_id", value)

    @property
    @pulumi.getter
    def region(self) -> pulumi.Input[str]:
        """
        where
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: pulumi.Input[str]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="serviceProvider")
    def service_provider(self) -> pulumi.Input[str]:
        """
        Cloud provider
        """
        return pulumi.get(self, "service_provider")

    @service_provider.setter
    def service_provider(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_provider", value)


@pulumi.input_type
class _SchemaRegistryState:
    def __init__(__self__, *,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 environment_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 service_provider: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SchemaRegistry resources.
        :param pulumi.Input[str] environment_id: Environment ID
        :param pulumi.Input[str] region: where
        :param pulumi.Input[str] service_provider: Cloud provider
        """
        if endpoint is not None:
            pulumi.set(__self__, "endpoint", endpoint)
        if environment_id is not None:
            pulumi.set(__self__, "environment_id", environment_id)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if service_provider is not None:
            pulumi.set(__self__, "service_provider", service_provider)

    @property
    @pulumi.getter
    def endpoint(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "endpoint")

    @endpoint.setter
    def endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "endpoint", value)

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> Optional[pulumi.Input[str]]:
        """
        Environment ID
        """
        return pulumi.get(self, "environment_id")

    @environment_id.setter
    def environment_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "environment_id", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        where
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="serviceProvider")
    def service_provider(self) -> Optional[pulumi.Input[str]]:
        """
        Cloud provider
        """
        return pulumi.get(self, "service_provider")

    @service_provider.setter
    def service_provider(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_provider", value)


class SchemaRegistry(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 environment_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 service_provider: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a SchemaRegistry resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] environment_id: Environment ID
        :param pulumi.Input[str] region: where
        :param pulumi.Input[str] service_provider: Cloud provider
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SchemaRegistryArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a SchemaRegistry resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param SchemaRegistryArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SchemaRegistryArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 environment_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 service_provider: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SchemaRegistryArgs.__new__(SchemaRegistryArgs)

            if environment_id is None and not opts.urn:
                raise TypeError("Missing required property 'environment_id'")
            __props__.__dict__["environment_id"] = environment_id
            if region is None and not opts.urn:
                raise TypeError("Missing required property 'region'")
            __props__.__dict__["region"] = region
            if service_provider is None and not opts.urn:
                raise TypeError("Missing required property 'service_provider'")
            __props__.__dict__["service_provider"] = service_provider
            __props__.__dict__["endpoint"] = None
        super(SchemaRegistry, __self__).__init__(
            'confluent:index/schemaRegistry:SchemaRegistry',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            endpoint: Optional[pulumi.Input[str]] = None,
            environment_id: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None,
            service_provider: Optional[pulumi.Input[str]] = None) -> 'SchemaRegistry':
        """
        Get an existing SchemaRegistry resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] environment_id: Environment ID
        :param pulumi.Input[str] region: where
        :param pulumi.Input[str] service_provider: Cloud provider
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SchemaRegistryState.__new__(_SchemaRegistryState)

        __props__.__dict__["endpoint"] = endpoint
        __props__.__dict__["environment_id"] = environment_id
        __props__.__dict__["region"] = region
        __props__.__dict__["service_provider"] = service_provider
        return SchemaRegistry(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def endpoint(self) -> pulumi.Output[str]:
        return pulumi.get(self, "endpoint")

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> pulumi.Output[str]:
        """
        Environment ID
        """
        return pulumi.get(self, "environment_id")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        where
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="serviceProvider")
    def service_provider(self) -> pulumi.Output[str]:
        """
        Cloud provider
        """
        return pulumi.get(self, "service_provider")

