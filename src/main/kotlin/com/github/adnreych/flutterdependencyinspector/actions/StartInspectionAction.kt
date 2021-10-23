package com.github.adnreych.flutterdependencyinspector.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages
import com.intellij.psi.search.FilenameIndex
import com.intellij.psi.search.GlobalSearchScope


class StartInspectionAction : AnAction() {
    override fun actionPerformed(actionEvent: AnActionEvent) {
        val project = actionEvent.project
        val allFilesByExt = FilenameIndex.getAllFilesByExt(
                project!!, "kt", GlobalSearchScope.projectScope(project))
        println("allFilesByExt $allFilesByExt")
        Messages.showMessageDialog(
                project,
                "allFilesByExt $allFilesByExt",
                "Greeting",
                Messages.getInformationIcon()
        )
    }

}