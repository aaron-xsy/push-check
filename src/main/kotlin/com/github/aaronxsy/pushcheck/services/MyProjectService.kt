package com.github.aaronxsy.pushcheck.services

import com.intellij.openapi.project.Project
import com.github.aaronxsy.pushcheck.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
