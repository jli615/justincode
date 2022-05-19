## Video: AWS DynamoDB Tutorial for Beginners

https://www.youtube.com/watch?v=2k2GINpO308

## Notes:
DynamoDB

-   NoSQL Database optimized for performance at scale

-   Key-value lookup stores

-   Distributes data across different partitions (machines, physical or virtual)

-   Total managed AWS Service

-   Can scale out horizontally by adding more nodes onto the cluster and separating data into clusters

-   Even as data grows, performance does not slow down

-   High Availability & Durability

-   Will store multiple copies of data across multiple nodes

-   Ideal for applications with known access patterns

-   Concern: need to know how you want to access your data

-   What is our access pattern?

-   Access through APIs / Object Relational Mappers and authorized through IAM

-   ORMS

-   Java: Dynamo Mapper

-   Python: Modal 3

-   Everything is managed through IAM - need user with correct permissions to access specific API

-   Integrates well with other AWS services 

-   Cost effective usage based payment model

Core Concepts - Tables, Items, Attributes, Indexes

-   Tables are a collection of items

-   Items are collections of Attributes, or key / value pairs

-   Every Row is an item - collections of attributes or key value pairs

-   Attribute is a column - one specific characteristic for each item

-   ![](https://lh5.googleusercontent.com/M6wSOXgQQ3poXX_TRKOxMfGEZrX2dxwqht9c3UjSzAoavo1XqjLGGgorBo8-UU_YnPx10O2nYgU9yYJUAaUSdXacaTBrfrm4YwBtglB6tdxRcVWxQSF5tqTx8Sr9T_g0cmbsvXtE6HSXxmgaBA)

-   Primary key: partition key and sort key

-   Can't have any duplicates of a partition key with a sort key

-   Sort key allows you to do range-like operation

-   Attribute: Strings, booleans, lists, etc.

-   Indexes:

-   Global secondary index (GSI): instead of querying in just partition and sort key, you can query on any column

-   Make it more efficient to access our data

Dynamo DB Console

-   AWS Management Console > DynamoDB > Create table

-   Tables are region specific - make sure you are in the right region

-   Create partition and sort key

-   Sort key cannot be changed or added later

-   Does your data set require your partition key to be duplicated

-   Customize Settings

-   On Demand Capacity: pays for actual reads and writes that are performed 

-   Provisioned Capacity: manage and optimize costs by allocating read/write capacity in advance

-   More cost effective for predictable traffic

-   Secondary indexes:

-   Local indexes can only be created at time of table creation

-   Allows us to query based on range like attributes

-   GSIs from above

-   Can be added at any time

-   Cost implications of using GSIs

Dynamo DB Tabs

-   Monitor tab: shows info about dataset

-   Global tables: can have multiple representations of the same table across multiple regions 

-   Backups tab: 

-   PITR: provides continuous backups of data for 35 days, allows you to do equivalent of windows system restore

-   On-demand backups

-   Exports and Streams

-   Additional Settings

-   Can change read and write capacity

-   Time to Live: need to say what column name you want to run it on

-   Encryption

-   Tags

Table

-   Can query and scan for items with certain attributes


