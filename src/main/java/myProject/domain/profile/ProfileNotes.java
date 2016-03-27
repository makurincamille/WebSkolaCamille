package myProject.domain.profile;

import java.time.LocalDateTime;

/**
 * Created by Camille on 27.03.2016.
 */
public class ProfileNotes {
    private Long noteId;
    private String noteText;
    private LocalDateTime noteDate;

    public Long getNoteId() {
        return noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    public LocalDateTime getNoteDate() {
        return noteDate;
    }

    public void setNoteDate(LocalDateTime noteDate) {
        this.noteDate = noteDate;
    }
}
