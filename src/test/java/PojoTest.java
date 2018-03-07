import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import json.issue.Fields;
import json.issue.Issue;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class PojoTest {
    @Test
    public void sampleTest() {
        ObjectMapper mapper = new ObjectMapper();
        Fields fields = new Fields();
        fields.setAssignee("Anastasia");
        fields.setIssueType("Bug");
        fields.setProject("QAAUT-9");
        fields.setSummary("Issue summary from the Automation Test");

        Issue issue = new Issue(fields);
        String jsonInString = "";
        try {
            jsonInString = mapper.writeValueAsString(issue);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(jsonInString);
    }
}

