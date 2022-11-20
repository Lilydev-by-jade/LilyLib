package com.lilydev.lilylib.utils

import java.io.File
import java.io.FileNotFoundException

object Files {
    fun getOrCreateFile(filePath: String): File {
        return try {
            File(filePath)
        } catch (e: FileNotFoundException) {
            createFile(filePath)
        }
    }

    private fun createFile(filePath: String): File {
        val file = File(filePath)
        file.createNewFile()
        return file
    }

    fun readFileContents(file: File): String {
        return file.readText()
    }



}