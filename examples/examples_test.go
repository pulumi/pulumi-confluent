package examples

import (
	"os"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func getBaseOptions(t *testing.T) integration.ProgramTestOptions {
	checkConfluentCreds(t)
	return integration.ProgramTestOptions{
		ExpectRefreshChanges: true,
	}
}

func checkConfluentCreds(t *testing.T) {
	_, exists := os.LookupEnv("CONFLUENT_CLOUD_USERNAME")
	if !exists {
		t.Skipf("Skipping test due to missing CONFLUENT_CLOUD_USERNAME environment variable")
	}

	_, exists = os.LookupEnv("CONFLUENT_CLOUD_PASSWORD")
	if !exists {
		t.Skipf("Skipping test due to missing CONFLUENT_CLOUD_PASSWORD environment variable")
	}
}

func getCwd(t *testing.T) string {
	cwd, err := os.Getwd()
	if err != nil {
		t.FailNow()
	}

	return cwd
}
