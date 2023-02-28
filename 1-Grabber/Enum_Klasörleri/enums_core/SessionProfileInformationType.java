package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author myalcinkaya
 */
public enum SessionProfileInformationType implements DbEnum {

    UNDEFINED(0, "Undefined", SessionProfileActionType.INFO),
    SESSION_NAME(1, "SessionName", SessionProfileActionType.INFO),
    LOGIN_TIME(2, "LoginTime", SessionProfileActionType.INFO),
    RCM_SATUS(3, "CacheCoordinationStatus", SessionProfileActionType.INFO),
    CACHE_SIZE(4, "CacheSize", SessionProfileActionType.INFO), // TODO

    CLIENT_SESSION_CREATED(5, "ClientSessionCreates", SessionProfileActionType.COUNTER),
    CLIENT_SESSION_RELEASED(6, "ClientSessionReleases", SessionProfileActionType.COUNTER),
    UOW_CREATED(7, "UnitOfWorkCreates", SessionProfileActionType.COUNTER),
    UOW_RELEASED(8, "UnitOfWorkReleases", SessionProfileActionType.COUNTER),
    UOW_COMMITS(9, "UnitOfWorkCommits", SessionProfileActionType.COUNTER),
    UOW_ROLLBACKS(10, "UnitOfWorkRollbacks", SessionProfileActionType.COUNTER),
    OPTIMISTIC_LOCK_EXCEPTION(11, "OptimisticLocks", SessionProfileActionType.COUNTER),
    RCM_RECEIVED(12, "MessagesReceived", SessionProfileActionType.COUNTER),
    RCM_SENT(13, "MessagesSent", SessionProfileActionType.COUNTER),
    REMOTE_CHANGE_SET(14, "RemoteChangeSets", SessionProfileActionType.COUNTER),
    CONNECTS(15, "ConnectCalls", SessionProfileActionType.COUNTER),
    DISCONNECTS(16, "DisconnectCalls", SessionProfileActionType.COUNTER),
    CACHE_HITS(17, "CacheHits", SessionProfileActionType.COUNTER),
    CACHE_MISSES(18, "CacheMisses", SessionProfileActionType.COUNTER),
    CHANGE_SETS_PROCESSED(19, "ChangesProcessed", SessionProfileActionType.COUNTER),
    CHANGE_SETS_NOT_PROCESSED(20, "ChangesNotProcessed", SessionProfileActionType.COUNTER),
    
    DESCRIPTOR_EVENT(21, "DescriptorEvents", SessionProfileActionType.TIMER),
    SESSION_EVENT(22, "SessionEvents", SessionProfileActionType.TIMER),
    QUERY_PREPARATION(23, "QueryPreparation", SessionProfileActionType.TIMER),
    SQL_GENERATION(24, "SqlGeneration", SessionProfileActionType.TIMER),
    SQL_PREPARE(25, "SqlPrepare", SessionProfileActionType.TIMER),
    STATEMENT_EXECUTE(26, "StatementExecute", SessionProfileActionType.TIMER),
    ROW_FETCH(27, "RowFetch", SessionProfileActionType.TIMER),
    OBJECT_BUILDING(28, "ObjectBuilding", SessionProfileActionType.TIMER),
    REGISTER(29, "Register", SessionProfileActionType.TIMER),
    MERGE(30, "Merge", SessionProfileActionType.TIMER),
    DISTRIBUTED_MERGE(31, "DistributedMerge", SessionProfileActionType.TIMER),
    ASSIGN_SEQUENCE(32, "Sequencing", SessionProfileActionType.TIMER),
    CACHING(33, "Caching", SessionProfileActionType.TIMER),
    CACHE_COORDINATION_SERIALIZE(34, "CacheCoordinationSerialize", SessionProfileActionType.TIMER),
    CACHE_COORDINATION(35, "CacheCoordination", SessionProfileActionType.TIMER),
    CONNECTION_MANAGEMENT(36, "ConnectionManagement", SessionProfileActionType.TIMER),
    LOGGING(37, "Logging", SessionProfileActionType.TIMER),
    JTS_BEFORE_COMPLETION(38, "TXBeforeCompletion", SessionProfileActionType.TIMER),
    JTS_AFTER_COMPLETION(39, "TXAfterCompletion", SessionProfileActionType.TIMER),
    TRANSACTION(40, "Transactions", SessionProfileActionType.TIMER),
    UOW_COMMIT(41, "UnitOfWorkCommit", SessionProfileActionType.TIMER),
    CONNECTION_PING(42, "ConnectionPing", SessionProfileActionType.TIMER),
    REMOTE(43, "Remote", SessionProfileActionType.TIMER),
    REMOTE_LAZY(44, "RemoteLazy", SessionProfileActionType.TIMER),
    REMOTE_METADATA(45, "RemoteMetadata", SessionProfileActionType.TIMER),
    
    QUERY_EXECUTE(46, "QueryExecute", SessionProfileActionType.USER);

    private final Integer id;
    private final Serializable adi;
    private final SessionProfileActionType actionType;

    SessionProfileInformationType(Integer id, Serializable adi, SessionProfileActionType actionType) {
	this.id = id;
	this.adi = adi;
	this.actionType = actionType;
    }

    @Override
    public Serializable getAdi() {
	return adi;
    }

    @Override
    public Serializable getId() {
	return id;
    }

    public SessionProfileActionType getActionType() {
        return actionType;
    }
    
}
