package at.mikemitterer.gradle.hellokotlin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

open class KotlinExampleTask : DefaultTask() {
    lateinit var messageText: String

    init {
        project.plugins.apply(KotlinExamplePlugin::class.java)

        group = "sample"
        description = "Sample-Task written in Kotlin"
    }

    @TaskAction
    fun runTask() {
        //println("[YIPPIE] Running gradle plugin written in kotlin")
        //println(messageText)
        println("Message: ${message}")
    }

    private val message : String
        get() {
            val extension = project.extensions.findByType(GreetingPluginExtension::class.java)
            return extension?.message ?: "abc"
        }
}