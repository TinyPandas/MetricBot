### Concept

<br>The PrimaryCluster will contain two Databases, primary-metrics and archive-metrics. This will allow to preserve top-level metrics, such as monthlys, without destroying the data. Each Database will follow the same structure.

### Structure

<br>A Collection shall be created with the guildId as the name. This will ensure a separate collection for each guild, and remove the potential to gather the wrong information. Within these Collections, each day will be its own Document, consiting of the following elements:

- date: The day of metric monitoring.
- joinCount: The number of member joins.
- leaveCount: The number of member leaves.
- messages: An Object, where the key is channelId and value being the number of messages in that channel for that day.
- members: An Array, containing singleton indecies of memberId to track unique members.
- ~~retention: The percentage of members who leave after
being in the server longer than a week.~~
- invites: An Object, where the key is the invite and value being the number of joins from that invite.

Weekly and Monthly metrics will be compiled from date ranges provided. Weekly metrics will be posted on Monday, for the previous Monday - Sunday period. Monthly metrics will be posted on the 1st of each month for the previous month.

### Archivability

<br>A guild can opt in to have their data archived after a 120 day period. On the start of the 4th month, the 1st month in primary-metrics will be compressed into a single document of averages, and stored in archive-metrics. After this compression is complete, the data for that month will be removed from primary-metrics.

<br>**A guild will have 120 days to opt into the archive program, otherwise data will be unretrievable.**
