package br.com.fezor.screenmatch.models;

public class Series extends Title{
    private int Seasons;
    private int episodesPerSeason;
    private boolean active;
    private int minutesPerEpisode;

    public int getSeasons() {
        return Seasons;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public boolean isActive() {
        return active;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setSeasons(int seasons) {
        Seasons = seasons;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }
}
