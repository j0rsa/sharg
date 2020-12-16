package com.github.red-avtovo.sharg.services

import com.intellij.openapi.project.Project
import com.github.red-avtovo.sharg.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
