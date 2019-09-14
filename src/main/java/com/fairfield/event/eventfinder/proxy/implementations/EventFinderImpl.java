package com.fairfield.event.eventfinder.proxy.implementations;

import com.fairfield.event.eventfinder.config.ApplicationConfiguration;
import com.fairfield.event.eventfinder.proxy.IEventFinder;
import com.fairfield.event.eventfinder.proxy.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EventFinderImpl implements IEventFinder {
    @Autowired
    private ApplicationConfiguration applicationConfiguration;

    @Override
    public List<Event> getEvents() {
        System.out.println(">>>>>>> "+
                applicationConfiguration.getEventFInder().getUrl()+" - "+
                        applicationConfiguration.getEventFInder().getAppId());
        return null;
    }
}
