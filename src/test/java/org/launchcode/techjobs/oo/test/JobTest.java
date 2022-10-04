package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void testSettingJobId (){
        Job test_job = new Job();
        Job test_job2 = new Job();
        assertNotEquals(test_job.getId(),test_job2.getId(),.001);
    }

    @Test
    public void testJobConstructorSetsAllFields (){
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test_job instanceof Job);
        assertTrue(test_job.getEmployer() instanceof Employer);
        assertTrue(test_job.getLocation() instanceof Location);
        assertTrue(test_job.getPositionType() instanceof PositionType);
        assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Product tester",test_job.getName());
        assertEquals("ACME",test_job.getEmployer().getValue());
        assertEquals("Desert",test_job.getLocation().getValue());
        assertEquals("Quality control",test_job.getPositionType().getValue());
        assertEquals("Persistence",test_job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(test_job.equals(test_job2));
    }

}
