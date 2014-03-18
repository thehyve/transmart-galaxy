package org.transmartproject.galaxy

import nl.vumc.biomedbridges.WorkflowRunner
import org.junit.Test

class EndToEndTest {

    @Test
    void basicTest() {
        final Map<String, Object> workflowInputs = new HashMap<>();
        workflowInputs.put("WorkflowInput1", getTestFile('Hello'));
        workflowInputs.put("WorkflowInput2", getTestFile('World'));
        def json = new File('/projects/transmart-galaxy/test/integration/org/transmartproject/galaxy/TestWorkflowConcatenate.ga').text
        new WorkflowRunner().runWorkflow('http://127.0.0.1:8080/', '0dc542731d68978db9bc70cda62009ea', 'TestWorkflowConcatenate', json, workflowInputs);
    }

    private static File getTestFile(final String line) {
        File tempFile = File.createTempFile("workflow-runner", ".txt");
        tempFile.text = line
        tempFile
    }

}
