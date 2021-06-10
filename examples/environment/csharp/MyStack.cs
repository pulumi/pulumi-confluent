using Pulumi;
using CCloud = Pulumi.Confluent;

class MyStack : Stack
{
    public MyStack()
    {
        var environment = new CCloud.ConfluentEnvironment("csharp-env");

        this.EnvironmentName = environment.Name;
    }

    [Output] public Output<string> EnvironmentName { get; set; }
}
