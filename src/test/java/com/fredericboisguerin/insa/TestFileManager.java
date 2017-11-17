package com.fredericboisguerin.insa;

import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import java.io.ByteArrayInputStream;



public class TestFileManager {

    @Test
    public void test_ajouter_un_contact_complet () throws Exception {
        ContactsManager contactmanager = mock(ContactsManager.class);

        String entree = "2\njean\njean@insa\n0606\n4\n";

        System.setIn(new ByteArrayInputStream(entree.getBytes()));

        new UI(contactmanager).start();

        verify(contactmanager).addContact("jean","jean@insa","0606");

    }
}
