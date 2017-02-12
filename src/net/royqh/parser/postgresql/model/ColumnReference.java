package net.royqh.parser.postgresql.model;

/**
 * Created by Roy on 2017/2/4.
 */
public class ColumnReference {
    private String table;
    private String column;
    private MatchType matchType;
    private Action onDelete;
    private Action onUpdate;

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public MatchType getMatchType() {
        return matchType;
    }

    public void setMatchType(MatchType matchType) {
        this.matchType = matchType;
    }

    public Action getOnDelete() {
        return onDelete;
    }

    public void setOnDelete(Action onDelete) {
        this.onDelete = onDelete;
    }

    public Action getOnUpdate() {
        return onUpdate;
    }

    public void setOnUpdate(Action onUpdate) {
        this.onUpdate = onUpdate;
    }

    public enum MatchType{
        MATCH_FULL,
        MATCH_PARTIAL,
        MATCH_SIMPLE
    }
    public enum Action{
        RESTRICT ,
        CASCADE,
        SET_NULL,
        NO_ACTION
    }
}
