package at.mikemitterer.gradle.helloworld

import at.mikemitterer.gradle.hellokotlin.KotlinExamplePlugin
import at.mikemitterer.gradle.hellokotlin.Tasks
import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class KotlinExampleRunTaskTest {

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
    fun `test execute task`() {
        val task = project.tasks.findByName(Tasks.runKotlinExample)
        task?.actions?.get(0)?.execute(task)
    }

}