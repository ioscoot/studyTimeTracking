package entities;

import java.util.Date;

public class StudyTracking {

    private Integer id;
    private Date dataStudiu;
    private Integer nrOre;
    private Integer nrMinute;
    private Topic topic;

    private StudyTracking(final StudyTrackingBuilder studyTrackingBuilder) {
        this.id = studyTrackingBuilder.id;
        this.dataStudiu = studyTrackingBuilder.dataStudiu;
        this.nrOre = studyTrackingBuilder.nrOre;
        this.nrMinute = studyTrackingBuilder.nrMinute;
        this.topic = studyTrackingBuilder.topic;
    }

    public Integer getId() {
        return id;
    }

    public Date getDataStudiu() {
        return dataStudiu;
    }

    public Integer getNrOre() {
        return nrOre;
    }

    public Integer getNrMinute() {
        return nrMinute;
    }

    public Topic getTopic() {
        return topic;
    }

    public static class StudyTrackingBuilder {
        private Integer id;
        private Date dataStudiu;
        private Integer nrOre;
        private Integer nrMinute;
        private Topic topic;

        public StudyTrackingBuilder setId(final Integer id) {
            this.id = id;
            return this;
        }

        public StudyTrackingBuilder setDataStudiu(final Date dataStudiu) {
            this.dataStudiu = dataStudiu;
            return this;
        }

        public StudyTrackingBuilder setNrOreStudiu(final Integer nrOre) {
            this.nrOre = nrOre;
            return this;
        }

        public StudyTrackingBuilder setNrMinute(final Integer nrMinute) {
            this.nrMinute = nrMinute;
            return this;
        }

        public StudyTrackingBuilder setTopic(final Topic topic) {
            this.topic = topic;
            return this;
        }

        public StudyTracking build() {
            return new StudyTracking(this);
        }
    }
}
