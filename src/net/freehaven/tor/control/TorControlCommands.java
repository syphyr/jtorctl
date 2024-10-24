/*
 * Copyright 2005 Nick Mathewson, Roger Dingledine
 * See LICENSE file for copying information
 */
package net.freehaven.tor.control;

/**
 * Interface defining constants used by the Tor controller protocol.
 *
 * @see <a href="https://gitweb.torproject.org/torspec.git/tree/control-spec.txt#n257">torspec.git/control-spec.txt 3. Commands</a>
 */
public interface TorControlCommands {

    // generated by tools/generate-TorControlCommands.py

    public static final String GENERATED_FROM_TOR_VERSION = "0.4.8.13";

    public static final String SETCONF = "SETCONF";
    public static final String RESETCONF = "RESETCONF";
    public static final String GETCONF = "GETCONF";
    public static final String LOADCONF = "+LOADCONF";
    public static final String SETEVENTS = "SETEVENTS";
    public static final String AUTHENTICATE = "AUTHENTICATE";
    public static final String SAVECONF = "SAVECONF";
    public static final String SIGNAL = "SIGNAL";
    public static final String TAKEOWNERSHIP = "TAKEOWNERSHIP";
    public static final String DROPOWNERSHIP = "DROPOWNERSHIP";
    public static final String MAPADDRESS = "MAPADDRESS";
    public static final String GETINFO = "GETINFO";
    public static final String EXTENDCIRCUIT = "EXTENDCIRCUIT";
    public static final String SETCIRCUITPURPOSE = "SETCIRCUITPURPOSE";
    @Deprecated
    public static final String SETROUTERPURPOSE = "SETROUTERPURPOSE";
    public static final String ATTACHSTREAM = "ATTACHSTREAM";
    public static final String POSTDESCRIPTOR = "+POSTDESCRIPTOR";
    public static final String REDIRECTSTREAM = "REDIRECTSTREAM";
    public static final String CLOSESTREAM = "CLOSESTREAM";
    public static final String CLOSECIRCUIT = "CLOSECIRCUIT";
    public static final String USEFEATURE = "USEFEATURE";
    public static final String RESOLVE = "RESOLVE";
    public static final String PROTOCOLINFO = "PROTOCOLINFO";
    public static final String AUTHCHALLENGE = "AUTHCHALLENGE";
    public static final String DROPGUARDS = "DROPGUARDS";
    public static final String DROPTIMEOUTS = "DROPTIMEOUTS";
    public static final String HSFETCH = "HSFETCH";
    public static final String HSPOST = "+HSPOST";
    public static final String ADD_ONION = "ADD_ONION";
    public static final String DEL_ONION = "DEL_ONION";
    public static final String ONION_CLIENT_AUTH_ADD = "ONION_CLIENT_AUTH_ADD";
    public static final String ONION_CLIENT_AUTH_REMOVE = "ONION_CLIENT_AUTH_REMOVE";
    public static final String ONION_CLIENT_AUTH_VIEW = "ONION_CLIENT_AUTH_VIEW";

    public static final short CMD_ERROR = 0x0000;
    public static final short CMD_DONE = 0x0001;
    public static final short CMD_SETCONF = 0x0002;
    public static final short CMD_RESETCONF = 0x0003;
    public static final short CMD_GETCONF = 0x0004;
    public static final short CMD_LOADCONF = 0x0005;
    public static final short CMD_SETEVENTS = 0x0006;
    public static final short CMD_AUTHENTICATE = 0x0007;
    public static final short CMD_SAVECONF = 0x0008;
    public static final short CMD_SIGNAL = 0x0009;
    public static final short CMD_TAKEOWNERSHIP = 0x000A;
    public static final short CMD_DROPOWNERSHIP = 0x000B;
    public static final short CMD_MAPADDRESS = 0x000C;
    public static final short CMD_GETINFO = 0x000D;
    public static final short CMD_EXTENDCIRCUIT = 0x000E;
    public static final short CMD_SETCIRCUITPURPOSE = 0x000F;
    @Deprecated
    public static final short CMD_SETROUTERPURPOSE = 0x0010;
    public static final short CMD_ATTACHSTREAM = 0x0011;
    public static final short CMD_POSTDESCRIPTOR = 0x0012;
    public static final short CMD_REDIRECTSTREAM = 0x0013;
    public static final short CMD_CLOSESTREAM = 0x0014;
    public static final short CMD_CLOSECIRCUIT = 0x0015;
    public static final short CMD_USEFEATURE = 0x0016;
    public static final short CMD_RESOLVE = 0x0017;
    public static final short CMD_PROTOCOLINFO = 0x0018;
    public static final short CMD_AUTHCHALLENGE = 0x0019;
    public static final short CMD_DROPGUARDS = 0x001A;
    public static final short CMD_DROPTIMEOUTS = 0x001B;
    public static final short CMD_HSFETCH = 0x001C;
    public static final short CMD_HSPOST = 0x001D;
    public static final short CMD_ADD_ONION = 0x001E;
    public static final short CMD_DEL_ONION = 0x001F;
    public static final short CMD_ONION_CLIENT_AUTH_ADD = 0x0020;
    public static final short CMD_ONION_CLIENT_AUTH_REMOVE = 0x0021;
    public static final short CMD_ONION_CLIENT_AUTH_VIEW = 0x0022;

    public static final String[] CMD_NAMES = {
        "ERROR",
        "DONE",
        "SETCONF",
        "RESETCONF",
        "GETCONF",
        "LOADCONF",
        "SETEVENTS",
        "AUTHENTICATE",
        "SAVECONF",
        "SIGNAL",
        "TAKEOWNERSHIP",
        "DROPOWNERSHIP",
        "MAPADDRESS",
        "GETINFO",
        "EXTENDCIRCUIT",
        "SETCIRCUITPURPOSE",
        "SETROUTERPURPOSE",
        "ATTACHSTREAM",
        "POSTDESCRIPTOR",
        "REDIRECTSTREAM",
        "CLOSESTREAM",
        "CLOSECIRCUIT",
        "USEFEATURE",
        "RESOLVE",
        "PROTOCOLINFO",
        "AUTHCHALLENGE",
        "DROPGUARDS",
        "DROPTIMEOUTS",
        "HSFETCH",
        "HSPOST",
        "ADD_ONION",
        "DEL_ONION",
        "ONION_CLIENT_AUTH_ADD",
        "ONION_CLIENT_AUTH_REMOVE",
        "ONION_CLIENT_AUTH_VIEW",
    };

    public static final String CIRCUIT_PURPOSE_C_GENERAL = "general";
    public static final String CIRCUIT_PURPOSE_CONTROLLER = "controller";

    public static final short EVENT_CIRCUIT_STATUS_INDEX = 0x0001;
    public static final short EVENT_CIRCUIT_STATUS_MINOR_INDEX = 0x0002;
    public static final short EVENT_STREAM_STATUS_INDEX = 0x0003;
    public static final short EVENT_OR_CONN_STATUS_INDEX = 0x0004;
    public static final short EVENT_BANDWIDTH_USED_INDEX = 0x0005;
    public static final short EVENT_DEBUG_MSG_INDEX = 0x0006;
    public static final short EVENT_INFO_MSG_INDEX = 0x0007;
    public static final short EVENT_NOTICE_MSG_INDEX = 0x0008;
    public static final short EVENT_WARN_MSG_INDEX = 0x0009;
    public static final short EVENT_ERR_MSG_INDEX = 0x000A;
    public static final short EVENT_NEW_DESC_INDEX = 0x000B;
    public static final short EVENT_ADDRMAP_INDEX = 0x000C;
    public static final short EVENT_DESCCHANGED_INDEX = 0x000D;
    public static final short EVENT_NS_INDEX = 0x000E;
    public static final short EVENT_STATUS_GENERAL_INDEX = 0x000F;
    public static final short EVENT_STATUS_CLIENT_INDEX = 0x0010;
    public static final short EVENT_STATUS_SERVER_INDEX = 0x0011;
    public static final short EVENT_GUARD_INDEX = 0x0012;
    public static final short EVENT_STREAM_BANDWIDTH_USED_INDEX = 0x0013;
    public static final short EVENT_CLIENTS_SEEN_INDEX = 0x0014;
    public static final short EVENT_NEWCONSENSUS_INDEX = 0x0015;
    public static final short EVENT_BUILDTIMEOUT_SET_INDEX = 0x0016;
    public static final short EVENT_GOT_SIGNAL_INDEX = 0x0017;
    public static final short EVENT_CONF_CHANGED_INDEX = 0x0018;
    public static final short EVENT_CONN_BW_INDEX = 0x0019;
    public static final short EVENT_CELL_STATS_INDEX = 0x001A;
    public static final short EVENT_CIRC_BANDWIDTH_USED_INDEX = 0x001B;
    public static final short EVENT_TRANSPORT_LAUNCHED_INDEX = 0x001C;
    public static final short EVENT_HS_DESC_INDEX = 0x001D;
    public static final short EVENT_HS_DESC_CONTENT_INDEX = 0x001E;
    public static final short EVENT_NETWORK_LIVENESS_INDEX = 0x001F;

    public static final String[] EVENT_NAMES = {
        "(0)",
        "CIRC",
        "CIRC_MINOR",
        "STREAM",
        "ORCONN",
        "BW",
        "DEBUG",
        "INFO",
        "NOTICE",
        "WARN",
        "ERR",
        "NEWDESC",
        "ADDRMAP",
        "DESCCHANGED",
        "NS",
        "STATUS_GENERAL",
        "STATUS_CLIENT",
        "STATUS_SERVER",
        "GUARD",
        "STREAM_BW",
        "CLIENTS_SEEN",
//        "NEWCONSENSUS",
        "BUILDTIMEOUT_SET",
        "SIGNAL",
        "CONF_CHANGED",
        "CONN_BW",
        "CELL_STATS",
        "CIRC_BW",
        "TRANSPORT_LAUNCHED",
        "HS_DESC",
//        "HS_DESC_CONTENT",
        "NETWORK_LIVENESS"
    };

    public static final String EVENT_CIRCUIT_STATUS = "CIRC";
    public static final String EVENT_CIRCUIT_STATUS_MINOR = "CIRC_MINOR";
    public static final String EVENT_STREAM_STATUS = "STREAM";
    public static final String EVENT_OR_CONN_STATUS = "ORCONN";
    public static final String EVENT_BANDWIDTH_USED = "BW";
    public static final String EVENT_DEBUG_MSG = "DEBUG";
    public static final String EVENT_INFO_MSG = "INFO";
    public static final String EVENT_NOTICE_MSG = "NOTICE";
    public static final String EVENT_WARN_MSG = "WARN";
    public static final String EVENT_ERR_MSG = "ERR";
    public static final String EVENT_NEW_DESC = "NEWDESC";
    public static final String EVENT_ADDRMAP = "ADDRMAP";
    public static final String EVENT_DESCCHANGED = "DESCCHANGED";
    public static final String EVENT_NS = "NS";
    public static final String EVENT_STATUS_GENERAL = "STATUS_GENERAL";
    public static final String EVENT_STATUS_CLIENT = "STATUS_CLIENT";
    public static final String EVENT_STATUS_SERVER = "STATUS_SERVER";
    public static final String EVENT_GUARD = "GUARD";
    public static final String EVENT_STREAM_BANDWIDTH_USED = "STREAM_BW";
    public static final String EVENT_CLIENTS_SEEN = "CLIENTS_SEEN";
//    public static final String EVENT_NEWCONSENSUS = "NEWCONSENSUS";
    public static final String EVENT_BUILDTIMEOUT_SET = "BUILDTIMEOUT_SET";
    public static final String EVENT_GOT_SIGNAL = "SIGNAL";
    public static final String EVENT_CONF_CHANGED = "CONF_CHANGED";
    public static final String EVENT_CONN_BW = "CONN_BW";
    public static final String EVENT_CELL_STATS = "CELL_STATS";
    public static final String EVENT_CIRC_BANDWIDTH_USED = "CIRC_BW";
    public static final String EVENT_TRANSPORT_LAUNCHED = "TRANSPORT_LAUNCHED";
    public static final String EVENT_HS_DESC = "HS_DESC";
//    public static final String EVENT_HS_DESC_CONTENT = "HS_DESC_CONTENT";
    public static final String EVENT_NETWORK_LIVENESS = "NETWORK_LIVENESS";

    public static final byte CIRC_STATUS_LAUNCHED = 0x01;
    public static final byte CIRC_STATUS_BUILT = 0x02;
    public static final byte CIRC_STATUS_EXTENDED = 0x03;
    public static final byte CIRC_STATUS_FAILED = 0x04;
    public static final byte CIRC_STATUS_CLOSED = 0x05;

    public static final String[] CIRC_STATUS_NAMES = {
        "LAUNCHED",
        "BUILT",
        "EXTENDED",
        "FAILED",
        "CLOSED",
    };

    public static final String CIRC_EVENT_LAUNCHED = "LAUNCHED";
    public static final String CIRC_EVENT_BUILT = "BUILT";
    public static final String CIRC_EVENT_EXTENDED = "EXTENDED";
    public static final String CIRC_EVENT_FAILED = "FAILED";
    public static final String CIRC_EVENT_CLOSED = "CLOSED";

    public static final byte STREAM_STATUS_SENT_CONNECT = 0x00;
    public static final byte STREAM_STATUS_SENT_RESOLVE = 0x01;
    public static final byte STREAM_STATUS_SUCCEEDED = 0x02;
    public static final byte STREAM_STATUS_FAILED = 0x03;
    public static final byte STREAM_STATUS_CLOSED = 0x04;
    public static final byte STREAM_STATUS_NEW = 0x05;
    public static final byte STREAM_STATUS_NEW_RESOLVE = 0x06;
    public static final byte STREAM_STATUS_FAILED_RETRIABLE = 0x07;
    public static final byte STREAM_STATUS_REMAP = 0x08;
    public static final byte STREAM_STATUS_CONTROLLER_WAIT = 0x09;
    public static final byte STREAM_STATUS_XOFF_SENT = 0x10;
    public static final byte STREAM_STATUS_XOFF_RECV = 0x11;
    public static final byte STREAM_STATUS_XON_SENT = 0x12;
    public static final byte STREAM_STATUS_XON_RECV = 0x13;

    public static final String[] STREAM_STATUS_NAMES = {
        "SENT_CONNECT",
        "SENT_RESOLVE",
        "SUCCEEDED",
        "FAILED",
        "CLOSED",
        "NEW",
        "NEW_RESOLVE",
        "FAILED_RETRIABLE",
        "REMAP",
        "CONTROLLER_WAIT",
        "XOFF_SENT",
        "XOFF_RECV",
        "XON_SENT",
        "XON_RECV"
    };

    public static final String STREAM_EVENT_SENT_CONNECT = "SENT_CONNECT";
    public static final String STREAM_EVENT_SENT_RESOLVE = "SENT_RESOLVE";
    public static final String STREAM_EVENT_SUCCEEDED = "SUCCEEDED";
    public static final String STREAM_EVENT_FAILED = "FAILED";
    public static final String STREAM_EVENT_CLOSED = "CLOSED";
    public static final String STREAM_EVENT_NEW = "NEW";
    public static final String STREAM_EVENT_NEW_RESOLVE = "NEW_RESOLVE";
    public static final String STREAM_EVENT_FAILED_RETRIABLE = "FAILED_RETRIABLE";
    public static final String STREAM_EVENT_REMAP = "REMAP";
    public static final String STREAM_EVENT_CONTROLLER_WAIT = "CONTROLLER_WAIT";
    public static final String STREAM_EVENT_XOFF_SENT = "XOFF_SENT";
    public static final String STREAM_EVENT_XOFF_RECV = "XOFF_RECV";
    public static final String STREAM_EVENT_XON_SENT = "XON_SENT";
    public static final String STREAM_EVENT_XON_RECV = "XON_RECV";

    public static final byte OR_CONN_STATUS_LAUNCHED = 0x00;
    public static final byte OR_CONN_STATUS_CONNECTED = 0x01;
    public static final byte OR_CONN_STATUS_FAILED = 0x02;
    public static final byte OR_CONN_STATUS_CLOSED = 0x03;
    public static final byte OR_CONN_STATUS_NEW = 0x04;

    public static final String[] OR_CONN_STATUS_NAMES = {
        "LAUNCHED", "CONNECTED", "FAILED", "CLOSED", "NEW"
    };

    public static final String OR_CONN_EVENT_LAUNCHED = "LAUNCHED";
    public static final String OR_CONN_EVENT_CONNECTED = "CONNECTED";
    public static final String OR_CONN_EVENT_FAILED = "FAILED";
    public static final String OR_CONN_EVENT_CLOSED = "CLOSED";
    public static final String OR_CONN_EVENT_NEW = "NEW";

    /**
     * @see <a href="https://torproject.gitlab.io/torspec/control-spec/#signal">control-spec: SIGNAL</a>
     */
    public static final String SIGNAL_RELOAD = "RELOAD";
    /**
     * @see <a href="https://torproject.gitlab.io/torspec/control-spec/#signal">control-spec: SIGNAL</a>
     */
    public static final String SIGNAL_SHUTDOWN = "SHUTDOWN";
    /**
     * @see <a href="https://torproject.gitlab.io/torspec/control-spec/#signal">control-spec: SIGNAL</a>
     */
    public static final String SIGNAL_DUMP = "DUMP";
    /**
     * @see <a href="https://torproject.gitlab.io/torspec/control-spec/#signal">control-spec: SIGNAL</a>
     */
    public static final String SIGNAL_DEBUG = "DEBUG";
    /**
     * @see <a href="https://torproject.gitlab.io/torspec/control-spec/#signal">control-spec: SIGNAL</a>
     */
    public static final String SIGNAL_HALT = "HALT";
    /**
     * @see <a href="https://torproject.gitlab.io/torspec/control-spec/#signal">control-spec: SIGNAL</a>
     */
    public static final String SIGNAL_NEWNYM = "NEWNYM";
    /**
     * @see <a href="https://torproject.gitlab.io/torspec/control-spec/#signal">control-spec: SIGNAL</a>
     */
    public static final String SIGNAL_CLEARDNSCACHE = "CLEARDNSCACHE";
    /**
     * @see <a href="https://torproject.gitlab.io/torspec/control-spec/#signal">control-spec: SIGNAL</a>
     */
    public static final String SIGNAL_HEARTBEAT = "HEARTBEAT";
    /**
     * @see <a href="https://torproject.gitlab.io/torspec/control-spec/#signal">control-spec: SIGNAL</a>
     */
    public static final String SIGNAL_ACTIVE = "ACTIVE";
    /**
     * @see <a href="https://torproject.gitlab.io/torspec/control-spec/#signal">control-spec: SIGNAL</a>
     */
    public static final String SIGNAL_DORMANT = "DORMANT";

    @Deprecated
    public static final byte SIGNAL_HUP = 0x01;
    @Deprecated
    public static final byte SIGNAL_INT = 0x02;
    @Deprecated
    public static final byte SIGNAL_USR1 = 0x0A;
    @Deprecated
    public static final byte SIGNAL_USR2 = 0x0C;
    @Deprecated
    public static final byte SIGNAL_TERM = 0x0F;

    public static final String ERROR_MSGS[] = {
        "Unspecified error",
        "Internal error",
        "Unrecognized message type",
        "Syntax error",
        "Unrecognized configuration key",
        "Invalid configuration value",
        "Unrecognized byte code",
        "Unauthorized",
        "Failed authentication attempt",
        "Resource exhausted",
        "No such stream",
        "No such circuit",
        "No such OR",
    };

    public static final String HS_ADDRESS = "onionAddress";
    public static final String HS_PRIVKEY = "onionPrivKey";

    @Deprecated
    public static final byte STREAM_STATUS_NEW_CONNECT = STREAM_STATUS_NEW;

    @Deprecated
    public static final short EVENT_CIRCSTATUS = EVENT_CIRCUIT_STATUS_INDEX;
    @Deprecated
    public static final short EVENT_STREAMSTATUS = EVENT_STREAM_STATUS_INDEX;
    @Deprecated
    public static final short EVENT_ORCONNSTATUS = EVENT_OR_CONN_STATUS_INDEX;
    @Deprecated
    public static final short EVENT_BANDWIDTH = EVENT_CONN_BW_INDEX;
    @Deprecated
    public static final short EVENT_MSG_DEBUG = EVENT_DEBUG_MSG_INDEX;
    @Deprecated
    public static final short EVENT_MSG_INFO = EVENT_INFO_MSG_INDEX;
    @Deprecated
    public static final short EVENT_MSG_NOTICE = EVENT_NOTICE_MSG_INDEX;
    @Deprecated
    public static final short EVENT_MSG_WARN = EVENT_WARN_MSG_INDEX;
    @Deprecated
    public static final short EVENT_MSG_ERROR = EVENT_ERR_MSG_INDEX;
}
