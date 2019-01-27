package entities;

public class Topic {

    private Integer idTopic;
    private String denumireTopic;

    private Topic(final TopicBuilder topicBuilder) {
        this.idTopic = topicBuilder.id;
        this.denumireTopic = topicBuilder.denumireTopic;
    }

    public Integer getIdTopic() {
        return idTopic;
    }

    public String getDenumireTopic() {
        return denumireTopic;
    }

    public static class TopicBuilder {

        private Integer id;
        private String denumireTopic;

        public TopicBuilder setIdTopic(final Integer id) {
            this.id = id;
            return this;
        }

        public TopicBuilder setDenumireTopic(final String denumireTopic) {
            this.denumireTopic = denumireTopic;
            return this;
        }

        public Topic build() {
            return new Topic(this);
        }
    }
}
