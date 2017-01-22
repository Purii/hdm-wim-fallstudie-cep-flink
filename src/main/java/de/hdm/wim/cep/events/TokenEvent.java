package de.hdm.wim.cep.events;

import de.hdm.wim.classes.Participant;

import java.util.Objects;

/**
 * The type Token event.
 */
public class TokenEvent{

    private String _token;
    private Participant _sender;
    private int _messageId;

    /**
     * Instantiates a new Token event.
     *
     * @param messageId the message id
     * @param _token    the token
     * @param _sender   the sender
     */
    public TokenEvent(int messageId, String _token, Participant _sender) {
        this._token = _token;
        this._sender = _sender;
        this._messageId = messageId;
    }

    /**
     * Instantiates a new Token event.
     */
    public TokenEvent(){};

    /**
     * Gets sender.
     *
     * @return the sender
     */
    public Participant get_sender() {
        return _sender;
    }

    /**
     * Sets sender.
     *
     * @param _sender the sender
     */
    public void set_sender(Participant _sender) {
        this._sender = _sender;
    }

    /**
     * Gets token.
     *
     * @return the token
     */
    public String get_token() {
        return _token;
    }

    /**
     * Sets token.
     *
     * @param _token the token
     */
    public void set_token(String _token) {
        this._token = _token;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TokenEvent) {
            TokenEvent other = (TokenEvent) obj;

            return other.canEquals(this) && super.equals(other)
                    && _token == other._token
                    && _sender == other._sender
                    && _messageId == other._messageId;
        } else {
            return false;
        }
    }

    /**
     * Can equals boolean.
     *
     * @param obj the obj
     * @return the boolean
     */
    public boolean canEquals(Object obj){
        return obj instanceof TokenEvent;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(_sender, _token);
    }

    @Override
    public String toString() {
        return "[TokenEvent] Message ID: " + _messageId
                + " , Token: "  + _token
                + " , Sender: " + _sender;
    }
}
