package com.cmucs426.model.test;

import com.cmucs426.model.User;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;

public class UserTest extends TestCase {

    public void testUserConstructor() {
        User user = new User("user1", "user1@cmucs246.com");
        assertEquals("user1", user.getEmail());
    }

    public void testSetEmail() {
        User user = new User("user1", "user1@cmucs246.com");
        user.setEmail("newemail@cmucs246.com");
        assertEquals("newemail@cmucs246.com", user.getEmail());
    }

    public void testUpdateEmail() {
        User user = new User("user1", "user1@cmucs246.com");
        user.updateEmail("updatedemail@cmucs246.com");
        assertEquals("updatedemail@cmucs246.com", user.getEmail());
    }
}
