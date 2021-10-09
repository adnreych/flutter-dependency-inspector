package com.github.adnreych.flutterdependencyinspector.services

import com.intellij.openapi.project.Project
import com.github.adnreych.flutterdependencyinspector.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
