package com.app.config;

public final class HibernateProperties {

    public static final String HIBERNATE_DIALECT = "hibernate.dialect";
    public static final String HIBERNATE_CONNECTION_DRIVER_CLASS = "hibernate.connection.driver_class";
    public static final String HIBERNATE_CONNECTION_USERNAME = "hibernate.connection.username";
    public static final String HIBERNATE_CONNECTION_PASSWORD = "hibernate.connection.password";
    public static final String HIBERNATE_CONNECTION_URL = "hibernate.connection.url";
    public static final String HIBERNATE_CONNECTION_POOL_SIZE = "hibernate.connection.pool_size";

    //specify a JDBC isolation level
    public static final String HIBERNATE_CONNECTION_ISOLATION = "hibernate.connection.isolation";
    //enable JDBC autocommit (not recommended!)
    public static final String HIBERNATE_CONNECTION_AUTOCOMMIT = "hibernate.connection.autocommit";

    //print all generated SQL to the console
    public static final String HIBERNATE_SHOW_SQL = "hibernate.show_sql";
    //format SQL in log and console
    public static final String HIBERNATE_FORMAT_SQL = "hibernate.format_sql";
    //add comments to the generated SQL
    public static final String HIBERNATE_USE_SQL_COMMENTS = "hibernate.use_sql_comments";
    //auto schema export
    public static final String HIBERNATE_HBM2DDL_AUTO = "hibernate.hbm2ddl.auto";
    //specify a default schema and catalog for unqualified tablenames
    public static final String HIBERNATE_DEFAULT_SCHEMA = "hibernate.default_schema";

    //set the JDBC fetch size
    public static final String HIBERNATE_JDBC_FETCH_SIZE = "hibernate.jdbc.fetch_size";
    //set the maximum JDBC 2 batch size (a nonzero value enables batching)
    public static final String HIBERNATE_JDBC_BATCH_SIZE = "hibernate.jdbc.batch_size";
    //enable batch updates even for versioned data
    public static final String HIBERNATE_JDBC_BATCH_VERSIONED_DATA = "hibernate.jdbc.batch_versioned_data";
    //enable use of JDBC 2 scrollable ResultSets (specifying a Dialect will cause Hibernate to use a sensible default)
    public static final String HIBERNATE_JDBC_USE_SCROLLABLE_RESULTSET = "hibernate.jdbc.use_scrollable_resultset";
    //use streams when writing binary types to / from JDBC
    public static final String HIBERNATE_JDBC_USE_STREAMS_FOR_BINARY = "hibernate.jdbc.use_streams_for_binary";
    //use JDBC 3 PreparedStatement.getGeneratedKeys() to get the identifier of an inserted row
    public static final String HIBERNATE_JDBC_USE_GET_GENERATED_KEYS = "hibernate.jdbc.use_get_generated_keys";
    //choose a custom JDBC batcher
    public static final String HIBERNATE_JDBC_FACTORY_CLASS = "hibernate.jdbc.factory_class";
    //enable JDBC result set column alias caching (minor performance enhancement for broken JDBC drivers)
    public static final String HIBERNATE_JDBC_WRAP_RESULT_SETS = "hibernate.jdbc.wrap_result_sets";
    //choose a custom SQL exception converter
    public static final String HIBERNATE_JDBC_SQL_EXCEPTION_CONVERTER = "hibernate.jdbc.sql_exception_converter";

    //optimize cache for minimal "puts" instead of minimal "gets" (good for clustered cache)
    public static final String HIBERNATE_CACHE_USE_MINIMAL_PUTS = "hibernate.cache.use_minimal_puts";
    //set a prefix for cache region names
    public static final String HIBERNATE_CACHE_REGION_PREFIX = "hibernate.cache.region_prefix";
    //disable the second-level cache
    public static final String HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = "hibernate.cache.use_second_level_cache";
    //enable the query cache
    public static final String HIBERNATE_CACHE_USE_QUERY_CACHE = "hibernate.cache.use_query_cache";
    //tore the second-level cache entries in a more human-friendly format
    public static final String HIBERNATE_CACHE_USE_STRUCTURED_ENTRIES = "hibernate.cache.use_structured_entries";
    //choose a cache implementation
    public static final String HIBERNATE_CACHE_REGION_FACTORY_CLASS = "hibernate.cache.region.factory_class";
    //choose a custom query cache implementation
    public static final String HIBERNATE_CACHE_QUERY_CACHE_FACTORY = "hibernate.cache.query_cache_factory";

    //generate statistics
    public static final String HIBERNATE_GENERATE_STATISTICS = "hibernate.generate_statistics";
    //enable ordering of SQL UPDATEs by primary key
    public static final String HIBERNATE_ORDER_UPDATES = "hibernate.order_updates";
    //set the maximum depth of the outer join fetch tree
    public static final String HIBERNATE_MAX_FETCH_DEPTH = "hibernate.max_fetch_depth";
    //set the default batch size for batch fetching
    public static final String HIBERNATE_DEFAULT_BATCH_FETCH_SIZE = "hibernate.default_batch_fetch_size";
    //rollback generated identifier values of deleted entities to default values
    public static final String HIBERNATE_USE_IDENTIFIER_ROLLBACK = "hibernate.use_identifier_rollback";
    //enable bytecode reflection optimizer (disabled by default)
    public static final String HIBERNATE_BYTECODE_USE_REFLECTION_OPTIMIZER = "hibernate.bytecode.use_reflection_optimizer";
}
