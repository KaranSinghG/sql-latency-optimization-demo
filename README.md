# SQL Latency Optimization Demo

A practical deep-dive into identifying and resolving database bottlenecks, 
specifically the N+1 query problem and missing indexes in Spring Data JPA.

## Performance Baseline (Unoptimized-Data-small)
- **Data Volume:** 1,000 Customers, 20,000 Orders
- **Endpoint:** `/api/orders/all`
- **Total DB Queries Executed:** 1,001
- **Average Response Time:** 83 ms (10 calls)

## Performance Baseline (Unoptimized-Data-large)
- **Data Volume:** 10,000 Customers, 2,000,000 Orders
- **Endpoint:** `/api/orders/all`
- **Total DB Queries Executed:** 1,001
- **Average Response Time:** 7.06 s (10 calls)
