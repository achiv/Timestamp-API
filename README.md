# Timestamp-API

## Requirements
<ul>
  <li>A request to /api/{date} with a valid date should return a JSON object with a unix key that is a Unix timestamp of the input date in milliseconds
</li>
  <li>A request to /api/{date} with a valid date should return a JSON object with a utc key that is a string of the input date in the format: Thu, 01 Jan 1970 00:00:00 GMT
</li>
  <li>A request to /api/1451001600000 should return { unix: 1451001600000, utc: "Fri, 25 Dec 2015 00:00:00 GMT" }
</li>
  <li>An empty date parameter should return the current time in a JSON object with a unix key
</li>
  <li>An empty date parameter should return the current time in a JSON object with a utc key
</li>
</ul>
<hr>

# API Response

### Get Current Date
![image](https://user-images.githubusercontent.com/16984674/129013314-327768f8-ae70-4ca8-ad12-740c0ef13dbe.png)

### Get Date from Unix Timestamp
![image](https://user-images.githubusercontent.com/16984674/129013527-a270536d-42ac-4cd5-badd-91097a767493.png)

### Get Unix Timestamp from Date
![image](https://user-images.githubusercontent.com/16984674/129013689-f29ee4c0-7eb2-4130-8776-bae1b41c43dd.png)

