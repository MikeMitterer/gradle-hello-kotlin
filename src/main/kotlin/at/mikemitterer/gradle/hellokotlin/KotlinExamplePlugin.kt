package at.mikemitterer.gradle.hellokotlin

import org.gradle.api.Plugin
import org.gradle.api.Project

//var configuration: GreetingPluginExtension = GreetingPluginExtension()

class GreetingPluginExtension {
    var message: String = "Hello from GreetingPlugin"
}


open class KotlinExamplePlugin : Plugin<Project> {

    override fun apply(project: Project) {
        with(project) {
            extensions.create("greeting", GreetingPluginExtension::class.java)

            tasks.create(Tasks.runKotlinExample, KotlinExampleTask::class.java)
        }
    }
}