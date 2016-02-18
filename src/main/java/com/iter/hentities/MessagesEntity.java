package com.iter.hentities;

import javax.persistence.*;

@Entity
@Table(name = "messages")
public class MessagesEntity {
    private int messageId;
    private String messagebody;
    private String author;

    @Id
    @Column(name = "messageId")
    public int getMessageId() {
        return messageId;
    }

    public void setMessageId( int messageId ) {
        this.messageId = messageId;
    }

    @Basic
    @Column(name = "messagebody")
    public String getMessagebody() {
        return messagebody;
    }

    public void setMessagebody( String messagebody ) {
        this.messagebody = messagebody;
    }

    @Basic
    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor( String author ) {
        this.author = author;
    }

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;

        MessagesEntity that = (MessagesEntity) o;

        if ( messageId != that.messageId ) return false;
        if ( messagebody != null ? !messagebody.equals( that.messagebody ) : that.messagebody != null ) return false;
        if ( author != null ? !author.equals( that.author ) : that.author != null ) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = messageId;
        result = 31 * result + ( messagebody != null ? messagebody.hashCode() : 0 );
        result = 31 * result + ( author != null ? author.hashCode() : 0 );
        return result;
    }
}
