package com.victor.todovictorb.tasklist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.victor.todovictorb.R
import com.victor.todovictorb.TaskListAdapter

class TaskListFragment : Fragment() {
    private val taskList = listOf(
        Task(id = 1, title = "Task 1", description = "description 1"),
        Task(id = 2, title = "Task 2"),
        Task(id = 3, title = "Task 3")
    )
    private val adapter: TaskListAdapter = TaskListAdapter(taskList)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_task_list, container, false)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = TaskListAdapter(taskList)
        adapter.onDeleteTask = { task -> }

    }
}