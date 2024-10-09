package org.example._2024_02_15;

interface RateLimiter {
    /**
     @return True if the request should be consumed.
     False if the rate limit has been exceeded.
     */
    boolean shouldConsumeRequest();

}

public class RateLimiterImpl implements RateLimiter {

    private static final int MAX_NUMBER_OF_REQUESTS = 100;
    private int currentNumberOfRequests = 0;
    private int processedRequestsPerSec = 5;
    private long lastSuccessfulRequest = 0;

    public boolean shouldConsumeRequest() {
        currentNumberOfRequests = calculateCurrentNumberOfRequests();
        if (currentNumberOfRequests >= MAX_NUMBER_OF_REQUESTS) {
            return false;
        }
        currentNumberOfRequests++;
        lastSuccessfulRequest = System.currentTimeMillis();
        return true;
    }

    private int calculateCurrentNumberOfRequests() {
        int result = currentNumberOfRequests - (((int) (System.currentTimeMillis() - lastSuccessfulRequest) / 1000) * processedRequestsPerSec);
        return Math.max(result, 0);
    }

}
