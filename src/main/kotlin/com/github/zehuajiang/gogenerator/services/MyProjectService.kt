package com.github.zehuajiang.gogenerator.services

import com.intellij.openapi.project.Project
import com.github.zehuajiang.gogenerator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
