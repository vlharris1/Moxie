package com.tts.techtalenttwitter.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tag_id")
    private Long id;

    private String phrase;

    @ManyToMany(mappedBy = "tags")
    private List<Tweet> tweets;
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(name = "tweet_tag", joinColumns = @JoinColumn(name = "tweet_id"),
        inverseJoinColumns = @JoinColumn(name = "tag_id"))
    private List<Tag> tags;

     public Long getId() {
     return id;
     }
     public String getPhrase() {
     return phrase;
     }
     public void setPhrase(String phrase) {
     this.phrase = phrase;
     }
     public List<Tweet> getTweets() {
     return tweets;
     }
     public void setTweets(List<Tweet> tweets) {
     this.tweets = tweets;
     }
     @Override
     public String toString() {
     return "Tag [id=" + id + ", phrase=" + phrase + ", tweets=" + tweets + "]";
     }

}
