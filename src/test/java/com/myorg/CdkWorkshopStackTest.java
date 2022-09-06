package com.myorg;

import org.junit.jupiter.api.Test;
import software.amazon.awscdk.App;
import software.amazon.awscdk.assertions.Template;

import java.util.HashMap;

public class CdkWorkshopStackTest {

//    @Test
//    public void testStack() {
//        App app = new App();
//        CdkWorkshopStack stack = new CdkWorkshopStack(app, "test");
//
//        Template template = Template.fromStack(stack);
//
//        template.hasResourceProperties("AWS::SQS::Queue", new HashMap<String, Number>() {{
//          put("VisibilityTimeout", 300);
//        }});
//
//        template.resourceCountIs("AWS::SNS::Topic", 1);
//    }
}
