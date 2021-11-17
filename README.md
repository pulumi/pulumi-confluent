[![Actions Status](https://github.com/pulumi/pulumi-confluent/workflows/master/badge.svg)](https://github.com/pulumi/pulumi-confluent/actions)
[![Slack](http://www.pulumi.com/images/docs/badges/slack.svg)](https://slack.pulumi.com)
[![NPM version](https://badge.fury.io/js/%40pulumi%2Fconfluent.svg)](https://www.npmjs.com/package/@pulumi/confluent)
[![Python version](https://badge.fury.io/py/pulumi-confluent.svg)](https://pypi.org/project/pulumi-confluent)
[![NuGet version](https://badge.fury.io/nu/pulumi.confluent.svg)](https://badge.fury.io/nu/pulumi.confluent)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/pulumi/pulumi-confluent/sdk/go)](https://pkg.go.dev/github.com/pulumi/pulumi-confluent/sdk/go)
[![License](https://img.shields.io/npm/l/%40pulumi%2Fpulumi.svg)](https://github.com/pulumi/pulumi-confluent/blob/master/LICENSE)

# Confluent Cloud Resource Provider

The Confluent Cloud Resource Provider lets you manage Confluent Cloud resources.

## Installing

This package is available in many languages in the standard packaging formats.

### Node.js (Java/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

    $ npm install @pulumi/confluent

or `yarn`:

    $ yarn add @pulumi/confluent

### Python

To use from Python, install using `pip`:

    $ pip install pulumi_confluent

### Go

To use from Go, use `go get` to grab the latest version of the library

    $ go get github.com/pulumi/pulumi-confluent/sdk

### .NET

To use from .NET, install using `dotnet add package`:

    $ dotnet add package Pulumi.Confluent

## Configuration

The following configuration points are available:

- `confluent:username` - (Required) Confluent cloud username. It must be provided, but it can also be sourced
  from the `CONFLUENT_CLOUD_USERNAME` environment variable.
- `confluent:password` - (Required) Confluent cloud password. It must be provided, but it can also be
  sourced from the `CONFLUENT_CLOUD_PASSWORD` variable.

## Reference

For further information, please visit [the Confluent provider docs](https://www.pulumi.com/docs/intro/cloud-providers/confluent)
or for detailed reference documentation, please visit [the API docs](https://www.pulumi.com/docs/reference/pkg/confluent).
