package at.mikemitterer.gradle.helloworld

import at.mikemitterer.gradle.hellokotlin.KotlinExamplePlugin
import at.mikemitterer.gradle.hellokotlin.KotlinExampleTask
import at.mikemitterer.gradle.hellokotlin.Tasks
import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class KotlinExamplePluginTest {

    lateinit var project: Project

    @Rule
    @JvmField
    var testProjectDir = TemporaryFolder()

    @Before
    fun setUp() {
        project = ProjectBuilder.builder().build()
        project.pluginManager.apply(KotlinExamplePlugin::class.java)
    }

    @Test
    fun `test get task by name`() {
        Assert.assertTrue(project.tasks.getByName(Tasks.runKotlinExample) is KotlinExampleTask)
    }
}