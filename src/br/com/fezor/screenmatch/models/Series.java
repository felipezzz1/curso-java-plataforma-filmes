package br.com.fezor.screenmatch.models;

public class Series extends Title{
    private int seasons;
    private int episodesPerSeason;
    private boolean active;
    private int minutesPerEpisode;

    public Series(String name, int yearOfRelease, int duration) {
        super(name, yearOfRelease, duration);
    }

    public int getSeasons() {
        return seasons;
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
        this.seasons = seasons;
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

    @Override
    public int getDuration() {
        return seasons * episodesPerSeason * minutesPerEpisode;
    }
}
