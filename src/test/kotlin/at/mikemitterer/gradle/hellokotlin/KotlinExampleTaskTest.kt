package at.mikemitterer.gradle.hellokotlin

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class KotlinExampleTaskTest {

    lateinit var project: Project

    @Before
    fun setUp() {
        project = ProjectBuilder.builder().build()
    }

    @Test
    fun `test type of task`() {
        val task = project.tasks.create(Tasks.runKotlinExample, KotlinExampleTask::class.java)
        assertTrue(task is KotlinExampleTask)
    }
}