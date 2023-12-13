package org.desing;

import java.util.*;

public class Twitter {
    private Map<Integer, Set<Integer>> followers;
    private Map<Integer, List<Tweet>> tweets;
    private int timestamp;


    private class Tweet {
        private int tweetId;
        private int timestamp;

        public Tweet (int tweetId, int timestamp) {
            this.tweetId = tweetId;
            this.timestamp = timestamp;
        }
    }

    public  Twitter() {
        this.followers = new HashMap<>();
        this.tweets = new HashMap<>();
        this.timestamp = 0;
    }

    public void postTweet(int userId, int tweetId) {
        if (!this.tweets.containsKey(userId)) {
            this.tweets.put(userId, new ArrayList<>());
        }
        this.tweets.get(userId).add(new Tweet(tweetId, this.timestamp++));
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Integer> feeds = new ArrayList<>();
        PriorityQueue<Tweet> priorityFeeds = new PriorityQueue<>((a, b) -> b.timestamp - a.timestamp);

        if (this.tweets.containsKey(userId)) {
            priorityFeeds.addAll(this.tweets.get(userId));
        }

        if (this.followers.containsKey(userId)) {
            for (int followee: this.followers.get(userId)) {
                if (this.tweets.containsKey(followee)) {
                    priorityFeeds.addAll(this.tweets.get(followee));
                }
            }
        }

        while (feeds.size() < 10 && !priorityFeeds.isEmpty()) {
            feeds.add(priorityFeeds.poll().tweetId);
        }

        return feeds;
    }

    public void follow(int followerId, int followeeId) {
        if (!this.followers.containsKey(followerId)) {
            this.followers.put(followerId, new HashSet<Integer>());
        }
        if (followerId != followeeId) {
            this.followers.get(followerId).add(followeeId);
        }
        return;
    }

    public void unfollow(int followerId, int followeeId) {
        if (this.followers.containsKey(followerId) && followerId != followeeId) {
            this.followers.get(followerId).remove(followeeId);
        }
        return;
    }
}
