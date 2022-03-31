package com.github.pythonicart.blockagent.services

import com.intellij.openapi.project.Project
import com.github.pythonicart.blockagent.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
