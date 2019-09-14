package com.fairfield.event.eventfinder.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("application")
public class ApplicationConfiguration {

    private EventFInder eventFInder;

    public EventFInder getEventFInder() {
        return eventFInder;
    }

    public void setEventFInder(EventFInder eventFInder) {
        this.eventFInder = eventFInder;
    }

    public static class EventFInder{
        private String url;
        private String appId;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getAppId() {
            return appId;
        }

        public void setAppId(String appId) {
            this.appId = appId;
        }
    }
}
