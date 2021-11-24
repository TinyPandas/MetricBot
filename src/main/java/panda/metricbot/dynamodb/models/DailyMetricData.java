package panda.metricbot.dynamodb.models;

import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DailyMetricData {

    private String guildId;
    private ZonedDateTime date;
    private Integer joinCount;
    private Integer leaveCount;
    private Map<String, Integer> messages;
    private Set<String> members;
    private Map<String, Integer> invites;

    public DailyMetricData(String guildId) {
        this.guildId = guildId;
        date = ZonedDateTime.now();
        joinCount = 0;
        leaveCount = 0;
        messages = new HashMap<>();
        members = new HashSet<>();
        invites = new HashMap<>();
    }

    public String getGuildId() {
        return guildId;
    }

    public void setGuildId(String guildId) {
        this.guildId = guildId;
    }

    public ZonedDateTime getDate() {
        return date;
    }

    public void setDate(ZonedDateTime date) {
        this.date = date;
    }

    public Integer getJoinCount() {
        return joinCount;
    }

    public void setJoinCount(Integer joinCount) {
        this.joinCount = joinCount;
    }

    public Integer getLeaveCount() {
        return leaveCount;
    }

    public void setLeaveCount(Integer leaveCount) {
        this.leaveCount = leaveCount;
    }

    public Map<String, Integer> getMessages() {
        return messages;
    }

    public void setMessages(Map<String, Integer> messages) {
        this.messages = messages;
    }

    public Set<String> getMembers() {
        return members;
    }

    public void setMembers(Set<String> members) {
        this.members = members;
    }

    public Map<String, Integer> getInvites() {
        return invites;
    }

    public void setInvites(Map<String, Integer> invites) {
        this.invites = invites;
    }
}
