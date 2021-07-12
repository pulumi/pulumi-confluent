# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ConnectorArgs', 'Connector']

@pulumi.input_type
class ConnectorArgs:
    def __init__(__self__, *,
                 cluster_id: pulumi.Input[str],
                 config: pulumi.Input[Mapping[str, Any]],
                 environment_id: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Connector resource.
        :param pulumi.Input[str] cluster_id: ID of containing cluster, e.g. lkc-abc123
        :param pulumi.Input[Mapping[str, Any]] config: Type-specific Configuration of cluster. String keys and values
        :param pulumi.Input[str] environment_id: ID of containing environment, e.g. env-abc123
        :param pulumi.Input[str] name: The name of the connector
        """
        pulumi.set(__self__, "cluster_id", cluster_id)
        pulumi.set(__self__, "config", config)
        pulumi.set(__self__, "environment_id", environment_id)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Input[str]:
        """
        ID of containing cluster, e.g. lkc-abc123
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter
    def config(self) -> pulumi.Input[Mapping[str, Any]]:
        """
        Type-specific Configuration of cluster. String keys and values
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: pulumi.Input[Mapping[str, Any]]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> pulumi.Input[str]:
        """
        ID of containing environment, e.g. env-abc123
        """
        return pulumi.get(self, "environment_id")

    @environment_id.setter
    def environment_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "environment_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the connector
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _ConnectorState:
    def __init__(__self__, *,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 config: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 environment_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Connector resources.
        :param pulumi.Input[str] cluster_id: ID of containing cluster, e.g. lkc-abc123
        :param pulumi.Input[Mapping[str, Any]] config: Type-specific Configuration of cluster. String keys and values
        :param pulumi.Input[str] environment_id: ID of containing environment, e.g. env-abc123
        :param pulumi.Input[str] name: The name of the connector
        """
        if cluster_id is not None:
            pulumi.set(__self__, "cluster_id", cluster_id)
        if config is not None:
            pulumi.set(__self__, "config", config)
        if environment_id is not None:
            pulumi.set(__self__, "environment_id", environment_id)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of containing cluster, e.g. lkc-abc123
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Type-specific Configuration of cluster. String keys and values
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of containing environment, e.g. env-abc123
        """
        return pulumi.get(self, "environment_id")

    @environment_id.setter
    def environment_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "environment_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the connector
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class Connector(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 config: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 environment_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a Connector resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: ID of containing cluster, e.g. lkc-abc123
        :param pulumi.Input[Mapping[str, Any]] config: Type-specific Configuration of cluster. String keys and values
        :param pulumi.Input[str] environment_id: ID of containing environment, e.g. env-abc123
        :param pulumi.Input[str] name: The name of the connector
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ConnectorArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a Connector resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param ConnectorArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ConnectorArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 config: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 environment_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
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
            __props__ = ConnectorArgs.__new__(ConnectorArgs)

            if cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_id'")
            __props__.__dict__["cluster_id"] = cluster_id
            if config is None and not opts.urn:
                raise TypeError("Missing required property 'config'")
            __props__.__dict__["config"] = config
            if environment_id is None and not opts.urn:
                raise TypeError("Missing required property 'environment_id'")
            __props__.__dict__["environment_id"] = environment_id
            __props__.__dict__["name"] = name
        super(Connector, __self__).__init__(
            'confluent:index/connector:Connector',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            config: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            environment_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'Connector':
        """
        Get an existing Connector resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: ID of containing cluster, e.g. lkc-abc123
        :param pulumi.Input[Mapping[str, Any]] config: Type-specific Configuration of cluster. String keys and values
        :param pulumi.Input[str] environment_id: ID of containing environment, e.g. env-abc123
        :param pulumi.Input[str] name: The name of the connector
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ConnectorState.__new__(_ConnectorState)

        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["config"] = config
        __props__.__dict__["environment_id"] = environment_id
        __props__.__dict__["name"] = name
        return Connector(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[str]:
        """
        ID of containing cluster, e.g. lkc-abc123
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter
    def config(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        Type-specific Configuration of cluster. String keys and values
        """
        return pulumi.get(self, "config")

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> pulumi.Output[str]:
        """
        ID of containing environment, e.g. env-abc123
        """
        return pulumi.get(self, "environment_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the connector
        """
        return pulumi.get(self, "name")

