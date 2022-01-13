package com.priyank.notesapp.feature_note.domain.use_case

import com.priyank.notesapp.feature_note.domain.use_case.AddNote
import com.priyank.notesapp.feature_note.domain.use_case.DeleteNote
import com.priyank.notesapp.feature_note.domain.use_case.GetNote
import com.priyank.notesapp.feature_note.domain.use_case.GetNotes

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)
