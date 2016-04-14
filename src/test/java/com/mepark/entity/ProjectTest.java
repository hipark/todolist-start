package com.mepark.entity;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ProjectTest {

	@Test
	public void test() {
		String name = "testProject";
		Project project = new Project(name);
		assertThat(project.getName(), is(name));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testName��Null�ΰ��_���ܹ߻�() {
		String name = null;
		Project project = new Project(name);
		assertThat(project.getName(), is(name));
	}
	
	@Test
	public void testChangeName() {
		String name = "testProject";
		Project project = new Project(name);
		
		String changedName = "changedTestProject";
		project.changeName(changedName);
		
		assertThat(project.getName(), is(changedName));
	}

}
