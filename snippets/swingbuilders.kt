package demo

import javax.swing.*
import kotlin.swing.*

fun main(args: Array<String>): Unit {

    val greeting = """
Welcome to Kotlin

Enter some text here!
"""

frame("Kool Kotlin Swing Demo") {
    exitOnClose()
    size = #(500, 300)

    val textArea = JTextArea(greeting)

    center = textArea
    south = borderPanel {
        west = button("Clear") {
            textArea.setText("")
        }
        east = button("Restore") {
            textArea.setText(greeting)
        }
    }
}.setVisible(true)

    f.setLocationRelativeTo(null)
    f.setVisible(true)
}
