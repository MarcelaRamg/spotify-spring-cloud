package com.spotify.playlist.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PLAYLIST")
public class Playlist implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PLAYLIST_ID", unique = true, nullable = false)
    private Long playListId;

    @Column(name = "NAME", nullable = false, length = 50)
    private String name;

    @Column(name = "MGCOUNT", nullable = false, columnDefinition = " integer default 0")
    private Integer mgCount = 0;


}
