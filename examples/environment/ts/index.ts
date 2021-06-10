import * as pulumi from "@pulumi/pulumi";
import * as ccloud from "@pulumi/confluent";

const env = new ccloud.ConfluentEnvironment("ts-environment");

export const envName = env.name;
