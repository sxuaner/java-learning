package com.java.learning.javase;

// javax (Java X) The prefix used for a package of Java standard extensions.
import javax.net.ssl.SSLSocket;

/**
 * An abstract class always extends a concrete class (java.lang.Object at the
 * very least). So it works the same as it always does. If you want to
 * instantiate it, you will have to subclass it with a concrete implementation
 * of those abstract methods and instantiate it through the concrete class.
 * 
 * Just like you always do. This isn't a special case.
 * 
 * public abstract class SSLSocket extends Socket
 * 
 * This class extends Socket and provides secure sockets using protocols such as
 * the "Secure Sockets Layer" (SSL) or IETF "Transport Layer Security" (TLS)
 * protocols. Such sockets are normal stream sockets, but they add a layer of
 * security protections over the underlying network transport protocol, such as
 * TCP. Those protections include:
 * 
 * Integrity Protection. SSL protects against modification of messages by an
 * active wiretapper. Authentication. In most modes, SSL provides peer
 * authentication. Servers are usually authenticated, and clients may be
 * authenticated as requested by servers. Confidentiality (Privacy Protection).
 * In most modes, SSL encrypts data being sent between client and server. This
 * protects the confidentiality of data, so that passive wiretappers won't see
 * sensitive data such as financial information or personal information of many
 * kinds. These kinds of protection are specified by a "cipher suite", which is
 * a combination of cryptographic algorithms used by a given SSL connection.
 * During the negotiation process, the two endpoints must agree on a ciphersuite
 * that is available in both environments. If there is no such suite in common,
 * no SSL connection can be established, and no data can be exchanged.
 * 
 * The cipher suite used is established by a negotiation process called
 * "handshaking". The goal of this process is to create or rejoin a "session",
 * which may protect many connections over time. After handshaking has
 * completed, you can access session attributes by using the getSession method.
 * The initial handshake on this connection can be initiated in one of three
 * ways:
 * 
 * calling startHandshake which explicitly begins handshakes, or any attempt to
 * read or write application data on this socket causes an implicit handshake,
 * or a call to getSession tries to set up a session if there is no currently
 * valid session, and an implicit handshake is done. If handshaking fails for
 * any reason, the SSLSocket is closed, and no further communications can be
 * done.
 * 
 * There are two groups of cipher suites which you will need to know about when
 * managing cipher suites:
 * 
 * Supported cipher suites: all the suites which are supported by the SSL
 * implementation. This list is reported using getSupportedCipherSuites. Enabled
 * cipher suites, which may be fewer than the full set of supported suites. This
 * group is set using the setEnabledCipherSuites method, and queried using the
 * getEnabledCipherSuites method. Initially, a default set of cipher suites will
 * be enabled on a new socket that represents the minimum suggested
 * configuration. Implementation defaults require that only cipher suites which
 * authenticate servers and provide confidentiality be enabled by default. Only
 * if both sides explicitly agree to unauthenticated and/or non-private
 * (unencrypted) communications will such a ciphersuite be selected.
 * 
 * When an SSLSocket is first created, no handshaking is done so that
 * applications may first set their communication preferences: what cipher
 * suites to use, whether the socket should be in client or server mode, etc.
 * However, security is always provided by the time that application data is
 * sent over the connection.
 * 
 * You may register to receive event notification of handshake completion. This
 * involves the use of two additional classes. HandshakeCompletedEvent objects
 * are passed to HandshakeCompletedListener instances, which are registered by
 * users of this API. An SSLSocket is created by SSLSocketFactory, or by
 * accepting a connection from a SSLServerSocket.
 * 
 * A SSL socket must choose to operate in the client or server mode. This will
 * determine who begins the handshaking process, as well as which messages
 * should be sent by each party. Each connection must have one client and one
 * server, or handshaking will not progress properly. Once the initial
 * handshaking has started, a socket can not switch between client and server
 * modes, even when performing renegotiations.
 * 
 * API Note: When the connection is no longer needed, the client and server
 * applications should each close both sides of their respective connection. For
 * SSLSocket objects, for example, an application can call
 * Socket.shutdownOutput() or OutputStream.close() for output strean close and
 * call Socket.shutdownInput() or InputStream.close() for input stream close.
 * Note that in some cases, closing the input stream may depend on the peer's
 * output stream being closed first. If the connection is not closed in an
 * orderly manner (for example Socket.shutdownInput() is called before the
 * peer's write closure notification has been received), exceptions may be
 * raised to indicate that an error has occurred. Once an SSLSocket is closed,
 * it is not reusable: a new SSLSocket must be created.
 *
 * 
 * 
 * 
 */

public class SSLSocketSE {
    public static void main(String[] args) {
        
    }
    
}
