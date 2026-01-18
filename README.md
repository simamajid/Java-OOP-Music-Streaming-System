Music Streaming System
Overview
A Java-based music streaming system built with OOP principles. Users can stream songs and podcasts, create playlists, and access features based on their subscription type.
Features
•	Free and Premium user accounts
•	Stream songs and podcasts
•	Playlist creation and management
•	Personal media library with search
•	Skip Ads, Download capabilities (Premium only)
OOP Concepts Used
•	Encapsulation - Private fields with getters/setters
•	Inheritance - User → FreeUser/PremiumUser, Media → Song/Podcast
•	Polymorphism - Different playMedia() implementations
•	Abstraction - Abstract User and Media classes
•	Interfaces - Playable, Downloadable, Searchable
•	Generics - Playlist<T>, Library<T>
How to Run
1.	Open project in NetBeans
2.	Compile all Java files
3.	Run MusicStreamingSystemOop.java
Package Structure
music.streaming.system.oop/
├── users/ (User, FreeUser, PremiumUser)
├── media/ (Media, Song, Podcast, Artist, Album)
├── playlist/ (Playlist, Library)
├── services/ (MusicService)
└── interfaces/ (Playable, Downloadable, Searchable)
Team Members
Member	Contribution
Sima Majid Rashid:	User module
Lanya Kamal Salih:	Media module&(playable)
Arya Ali M Rashid: Playlist & Library
Fro Wrya M Salih:	MusicService &(Album,Artist)& (Searchable, Downloadable)
