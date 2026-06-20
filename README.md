# Spring Boot Database Optimization Lab

A practical deep-dive into identifying and resolving database bottlenecks, 
specifically the N+1 query problem and missing indexes in Spring Data JPA.

## 📊 Performance Baseline (Unoptimized)
- **Data Volume:** 1,000 Customers, 20,000 Orders
- **Endpoint:** `/api/customers/report`
- **Total DB Queries Executed:** 1,001
- **Average Response Time:** [Insert your baseline time here, e.g., 4.2s]
