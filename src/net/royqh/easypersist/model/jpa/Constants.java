/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.royqh.easypersist.model.jpa;

import net.royqh.easypersist.annotations.ChineseAlias;
import net.royqh.easypersist.annotations.ListHeader;
import net.royqh.easypersist.annotations.Reference;
import net.royqh.easypersist.annotations.Suggestion;

import java.util.*;

/**
 * @author Hardy Ferentschik
 */
public final class Constants {
	// we are trying to to reference jpa annotations directly
	public static final String ENTITY = "javax.persistence.Entity";
	public static final String MAPPED_SUPERCLASS = "javax.persistence.MappedSuperclass";
	public static final String EMBEDDABLE = "javax.persistence.Embeddable";
	public static final String ID = "javax.persistence.Id";
	public static final String EMBEDDED_ID = "javax.persistence.EmbeddedId";
	public static final String TRANSIENT = "javax.persistence.Transient";
	public static final String BASIC = "javax.persistence.Basic";
	public static final String ONE_TO_ONE = "javax.persistence.OneToOne";
	public static final String ONE_TO_MANY = "javax.persistence.OneToMany";
	public static final String MANY_TO_ONE = "javax.persistence.ManyToOne";
	public static final String MANY_TO_MANY = "javax.persistence.ManyToMany";
	public static final String MAP_KEY_CLASS = "javax.persistence.MapKeyClass";
	public static final String ELEMENT_COLLECTION = "javax.persistence.ElementCollection";
	public static final String ACCESS = "javax.persistence.Access";
	public static final String TABLE = "javax.persistence.Table";

	public static final String COLLECTION = java.util.Collection.class.getCanonicalName();
	public static final String SET = java.util.Set.class.getCanonicalName();
	public static final String LIST = java.util.List.class.getCanonicalName();
	public static final Set<String> COLLECTIONS = new HashSet<>();
	public static final String VOID = "void.class";
	public static final String JOIN_COLUMN = "javax.persistence.JoinColumn";
	public static final String JOIN_TABLE = "javax.persistence.JoinTable";
	public static final String COLUMN = "javax.persistence.Column";
	public static final String TEMPORAL = "javax.persistence.Temporal" ;
	public static final String ENUMERATED = "javax.persistence.Enumerated" ;
	public static final String COLLECTION_TABLE = "javax.persistence.CollectionTable";
	public static final String GENERATED_VALUE = "javax.persistence.GeneratedValue";
	public static final String MAP_RELATIONS = "net.royqh.easypersist.annotations.MapRelations";
	public static final String MAP_RELATION = "net.royqh.easypersist.annotations.MapRelation";
	public static final String LOB = "javax.persistence.Lob";
	public static final String CHINESE_ALIAS = ChineseAlias.class.getCanonicalName();
	public static final String LIST_HEADER = ListHeader.class.getCanonicalName();
	public static final String REFERENCE = Reference.class.getCanonicalName();
	public static final String SUGGESTION = Suggestion.class.getCanonicalName();

    static {
		COLLECTIONS.add(SET);
		COLLECTIONS.add(LIST);
		COLLECTIONS.add(COLLECTION);
	}
	public static final String MAP = java.util.Map.class.getCanonicalName();

	public static final Set<String> BASIC_TYPES = new HashSet<>();
	public static final Set<String> WRAPER_TYPES = new HashSet<>();

	static {
		WRAPER_TYPES.add(Byte.class.getName());
		WRAPER_TYPES.add(Short.class.getName());
		WRAPER_TYPES.add(Integer.class.getName());
		WRAPER_TYPES.add(Long.class.getName());
		WRAPER_TYPES.add(Float.class.getName());
		WRAPER_TYPES.add(Double.class.getName());
	}

	static {
		BASIC_TYPES.add( String.class.getName() );
		BASIC_TYPES.add( Boolean.class.getName() );
		BASIC_TYPES.add( Byte.class.getName() );
		BASIC_TYPES.add( Character.class.getName() );
		BASIC_TYPES.add( Short.class.getName() );
		BASIC_TYPES.add( Integer.class.getName() );
		BASIC_TYPES.add( Long.class.getName() );
		BASIC_TYPES.add( Float.class.getName() );
		BASIC_TYPES.add( Double.class.getName() );
		//BASIC_TYPES.add( java.math.BigInteger.class.getName() );
		//BASIC_TYPES.add( java.math.BigDecimal.class.getName() );
		BASIC_TYPES.add( java.util.Date.class.getName() );
		BASIC_TYPES.add( java.util.Calendar.class.getName() );
		BASIC_TYPES.add( java.sql.Date.class.getName() );
		BASIC_TYPES.add( java.sql.Time.class.getName() );
		BASIC_TYPES.add( java.sql.Timestamp.class.getName() );
		//BASIC_TYPES.add( java.sql.Blob.class.getName() );
	}

	public static final Set<String> PRIMITIVE_TYPES = new HashSet<>();
	static {
		PRIMITIVE_TYPES.add("int");
		PRIMITIVE_TYPES.add("long");
		PRIMITIVE_TYPES.add("boolean");
		PRIMITIVE_TYPES.add("byte");
		PRIMITIVE_TYPES.add("char");
		PRIMITIVE_TYPES.add("short");
		PRIMITIVE_TYPES.add("float");
		PRIMITIVE_TYPES.add("double");
	}


	private Constants() {
	}
}


