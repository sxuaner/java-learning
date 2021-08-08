package com.java.learning.javase;

/**
 * 
 * public abstract class SSLServerSocket extends ServerSocket
 * 
 * This class extends ServerSocket and provides secure server sockets using
 * protocols such as the Secure Sockets Layer (SSL) or Transport Layer Security
 * (TLS) protocols. Instances of this class are generally created using an
 * SSLServerSocketFactory. The primary function of an SSLServerSocket is to
 * create SSLSockets by accepting connections.
 * 
 * An SSLServerSocket contains several pieces of state data which are inherited
 * by the SSLSocket at socket creation. These include the enabled cipher suites
 * and protocols, whether client authentication is necessary, and whether
 * created sockets should begin handshaking in client or server mode. The state
 * inherited by the created SSLSocket can be overriden by calling the
 * appropriate methods.
 */
public class SSLServerSocketSE {
    
}
