package org.example.lesson_17

class Folder {
    var folderName = "files"
        get() = if (isSecret) "скрытая папка" else field
    var filesCount = 0
        get() = if (isSecret) 0 else field
    var isSecret = false
}

fun main() {
    val folder1 = Folder()
    folder1.filesCount = 10
    println(folder1.folderName)
    println(folder1.filesCount)
    folder1.isSecret = true
    println(folder1.folderName)
    println(folder1.filesCount)
}