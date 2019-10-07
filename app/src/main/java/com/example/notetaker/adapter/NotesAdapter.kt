package com.example.notetaker.adapter
//
//import android.content.Context
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.core.content.ContextCompat
//import androidx.recyclerview.widget.RecyclerView
//import com.example.notetaker.R
//import kotlinx.android.synthetic.main.notes_recycler_layout.view.*
//
//class NotesAdapter(private val notes: List<String>, private val delegator: NotesAdapter.notesAdapterDelegator) :
//    RecyclerView.Adapter<NotesAdapter.NotesTextViewHolder>() {
//    lateinit var appContext: Context
//    interface notesAdapterDelegator{
//        fun notePicked(notesResource: String)
//}
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesTextViewHolder {
//        val view = layoutInflater.from(parent.context)
//            .inflate(R.layout.notes_recycler_layout, parent, false)
//        appContext = parent.context.applicationContext
//        return NotesTextViewHolder(view)
//    }
//
//    override fun getIteomCount() = notes.size
//
//    override fun onBind(holder: NotesTextViewHolder, position: Int) {
//        holder.notesText.text = notes[position]
//        when (notes[position]) {
//            TextViewList.NOTE_1 -> {
//                holder.notesText.setText(ContextCompat.getString(R.))
//                holder.itemView.setOnClickListener(delegator.notePicked(TextViewList.NOTE_!))
//            }
//        }
//        when (notes[position]) {
//            TextViewList.NOTE_1 -> {
//                holder.notesText.setText(ContextCompat.getString(R.))
//                holder.itemView.setOnClickListener(delegator.notePicked(TextViewList.NOTE_!))
//            }
//        }
//        when (notes[position]) {
//            TextViewList.NOTE_1 -> {
//                holder.notesText.setText(ContextCompat.getString(R.))
//                holder.itemView.setOnClickListener(delegator.notePicked(TextViewList.NOTE_!))
//            }
//        }
//        when (notes[position]) {
//            TextViewList.NOTE_1 -> {
//                holder.notesText.setText(ContextCompat.getString(R.))
//                holder.itemView.setOnClickListener(delegator.notePicked(TextViewList.NOTE_!))
//            }
//        }
//    }
//
//    class NotesTextViewHolder(ItemView) : RecyclerView.ViewHolder(itemView) {
//        val notesText: TextView = itemView.findViewById(R.id.notes_recycler_textview)
//    }
//}


