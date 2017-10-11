package com.gitrep.gitrepsample;

import com.gitrep.mylibrary.DecodeJson;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    final String json = "{\n" +
            "  \"name\": \"Vansi\",\n" +
            "  \"collegeName\": \"Pydah\",\n" +
            "  \"age\": 30\n" +
            "}";

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testJson() throws Exception{
        Student student = (Student) DecodeJson.decode(json, Student.class);
        if(student != null)
            assertTrue("SPE_TAG Student not null and gives "+student.name, student!= null);
        else
            assertTrue("SPE_TAG Student is null", student== null);
    }
}