"""A Python Pulumi program"""

import pulumi
import pulumi_confluent as ccloud

environment = ccloud.ConfluentEnvironment("py-env")

pulumi.export("name", environment.name)
