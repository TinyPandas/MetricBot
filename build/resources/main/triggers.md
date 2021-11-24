### Triggers

<br>Triggers are defined as being what causes a metric to update, such as a Member joining or leaving. This document looks to define every trigger that will be utilized, and the metric it is associated with.

- guildMemberAdd
  - Updates `joinCount`
  - Pulls all invites and their joins, checking against last pull in memory to find the invite used.
  - Updates `invites`
- guildMemberLeave
  - Updates `leaveCount`
- messageCreate
  - Updates: `messages`
  - Adds `member` to `members` if not already in
