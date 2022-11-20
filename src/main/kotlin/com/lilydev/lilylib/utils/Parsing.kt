package com.lilydev.lilylib.utils

object Parsing {
    fun replaceVariable(content: String, variableName: String, variableValue: String): String {
        return content.replace("${'$'}{${variableName}}", variableValue)
    }
}