package com.victor.todovictorb.task

import android.os.Bundle
import com.victor.todovictorb.tasklist.Task
import java.util.*

class TaskActivity {
    companion object {
        const val TASK_KEY = "TSK"
    }

    fun onCreate(savedInstanceState: Bundle?) {
        val newTask = Task(id = UUID.randomUUID().toString(), title = "New Task !")
        val task = data?.getSerializableExtra(TaskActivity.TASK_KEY) as? Task
    }
}