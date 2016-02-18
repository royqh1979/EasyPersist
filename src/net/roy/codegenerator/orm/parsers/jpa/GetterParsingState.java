package net.roy.codegenerator.orm.parsers.jpa;

import net.roy.codegenerator.orm.parsers.ParseError;

/**
 * Created by Roy on 2016/2/11.
 */
public enum GetterParsingState {
    Transient,
    NotSpecified,
    Column,
    Id,
    OneToMany,
    ManyToOne,
    OneToOne,
    ManyToMany,
    ElementCollection, MappingByTable, MappingByColumn, Collection;

    public static GetterParsingState parseAnnotationName(String annoName) {
        switch (annoName) {
            case "Transient":
                return Transient;
            case "Column":
                return Column;
            case "Id":
                return Id;
            case "OneToOne":
                return OneToOne;
            case "OneToMany":
                return OneToMany;
            case "ManyToMany":
                return ManyToMany;
            case "ManyToOne":
                return ManyToOne;
            case "Temporal":
                return Column;
            case "ElementCollection":
            case "CollectionTable":
                return ElementCollection;
            case "JoinTable":
                return MappingByTable;
            case "JoinColumn":
                return MappingByColumn;
            case "OrderBy":
            case "OrderColumn":
                return Collection;
            default:
                throw new ParseError(" annotation "+annoName+" is not supported!");
        }
    }
}
