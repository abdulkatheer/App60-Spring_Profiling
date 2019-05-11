package org.katheer.test;

import org.katheer.bean.Welcome;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        /*
        Application Lifecycle has three main stages
        1. Development
        2. Testing
        3. Production

        Environment for each stage may vary. So configuration details will
        also vary for each stage. It is difficult to configure for each stage
        at each time.

        For that spring provides profiling concept, we can have multiple
        profiles and each profile will have a different specific spring conf
        files.

        We can activate profile by setting the system property,
        spring.profiles.active with profile name.
         */
        System.setProperty("spring.profiles.active", "development");
        //System.setProperty("spring.profiles.active", "testing");
        //System.setProperty("spring.profiles.active", "production");

        GenericXmlApplicationContext context =
                new GenericXmlApplicationContext();

        context.load(
                "org/katheer/resource/applicationContext-development.xml",
                "org/katheer/resource/applicationContext-testing.xml",
                "org/katheer/resource/applicationContext-production.xml");
        context.refresh();

        Welcome welcome = (Welcome) context.getBean("welcome");
        welcome.welcomeUser();
    }
}