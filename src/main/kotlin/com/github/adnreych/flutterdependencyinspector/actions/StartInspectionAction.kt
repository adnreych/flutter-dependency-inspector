package com.github.adnreych.flutterdependencyinspector.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages


class StartInspectionAction : AnAction() {
    override fun actionPerformed(actionEvent: AnActionEvent) {
        val project = actionEvent.project

        Messages.showMessageDialog(
                project,
                "Hello world!",
                "Greeting",
                Messages.getInformationIcon()
        )
    }

}