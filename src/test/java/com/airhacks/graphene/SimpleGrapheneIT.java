package com.airhacks.graphene;

import static org.hamcrest.CoreMatchers.containsString;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.junit.Arquillian;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author airhacks.com
 */
@RunWith(Arquillian.class)
public class SimpleGrapheneIT {

    @Drone
    WebDriver browser;

    @Test
    public void validateAirhacksPage() {
        browser.get("http://roamingthings.de");
        String title = browser.getTitle();
        assertThat(title, containsString("roamingthings"));

        System.out.println("Got the title: " + title);
    }
}
