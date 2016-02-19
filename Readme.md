# Readme
This is an Intellij IDEA plug-in to generate entity persistor source codes.
* Entity should use JPA Annotation to specify mapping infos.
* The generated persistors use JdbcTemplate to implement database operations, so the project should have spring-core and spring-jdbc dependencies.
## Usage
1. Create orm-config.xml file in your project. Following is an example:

    <pre>
      &lt;?xml version="1.0" encoding="ISO-8859-1" ?>
      &lt;entity-config
        xmlns="http://royqh.net/codegenerator/orm/schema/config/1.0"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://royqh.net/codegenerator/orm/schema/config/1.0 http://royqh.net/codegenerator/orm/schema/config_1_0.xsd">
      &lt;entities>
      &lt;annotation-based package="net.roy.domain" />
      &lt;persistor target-package="net.roy.persist" />
      &lt;/entities>
      &lt;/entity-config>
    </pre>

    In this exmaple, we told the generator that it should scan package "net.roy.domain"
    for entity classes, and should generator entity persistors in package "net.roy.persist"

    Note that all packages in the config should exist, or the generator will fail to work.
2. Create JPA-annotated entity class in the specified package.
3. Generate Persistors. You could use any one method in the following :

    * Select the orm-config.xml in the project window, then click "Generate ORM code" in context menu;
    * Select the orm-config.xml in the project window, then click "Generate ORM code" in Tools menu;
    * open orm-config.xml in editor, then click "Generate ORM code" in context menu;
    * open orm-config.xml in editor, then right click on the title tab, and click "Generate ORM code" in context menu;

4. Wrap auto-generated entity persistors in your own persistors.

    Note: I prefer composition to inheritence, but the generator persistors is not final, so it can be inheritenced.

## Design Decisions

### About How to Define Entity <-> Relational Mapping Infomation
I choose to use JPA annotation to specify mapping info, because it is easy to learn and use, and there are plentiful books and tutorials.

### About Collection and Entity Relationship Mappings
I choose to not support collection and relationship mappings now.The reason is:
* Hard to implement.Need enormous work.
    * If I use Lazy Fetch strategy, it's hard to handle update. I need a complex mechanism to decide if an entity's mapping collection property has been modified or not.
* Hard to optimize for complex relationships:
    * If I use Eager Fetch strategy, either 1+N or join selection is too expensive for most using scenarios.
* The most important reason is, if it's too easy to implement relation mapping in code for users,
they won't think twice if the relation is really needed. It's rather bad.

If I have time, I might implement lazy fetch strategy in the future.

### Generate Source Code vs Use Relfection On the Fly
Many ORM Tools, such as Hibernate/MyBatis, using reflection to work on the fly.But I decide to generate source code directly, Because:
1. Generated source code is more straitfoward for use, edit and copy.
2. Generated source code uses less runtime resources to run and work.
3. Generated source code is better for uses to understand、learn and master sql related knowleges.

### Parse Annotations by Parsing Source Code vs by using Class Reflection
The ORM Generator use JPA annotation to specify entity mapping information. So I need to parse annotation before generate codes.There are two ways to get annotation info, one is to use reflection on compiled classes, the other is to parse source codes.

I choose to parse source code, because reflection need first compile entity source codes to classes, then scan compiled classes to generate persistor source code. It's hard to use and work with.

### IDE Plugin vs Maven/Ant Preprocessor Plugin
I choose to write this generator as an intellij IDEA plug-in,because:
* If I write this generator as a maven or ant preprocessor plugin, which means to generator the persitor, I must invoke  maven or ant to comiple the project. It's not so straitforward to use.
* I can make use of the embedded source parse/analysis  and source reformating functions in Intellij IDEA IDE.

### The Code Generation Process
1. Parse the orm-config.xml config file
2. scan the specified entity package, parse entity classes, and add them to the mapping repository
3. for each entity in the mapping repository, generate corresponding persistor source file, add it to the project source tree, and reformat it.

### Supported JPA Annotations
* @Entity
* @Table
* @Id
* @GeneratedValue
* @Column
* @Transient
* @Temporal

### JPA Annotations that can be parsed, but not used in code generations
* @ElementCollection
* @CollectionTable
* @OneToOne
* @ManyToOne
* @ManyToMany
* @OneToMany
* @JoinColumn
* @JoinTable


