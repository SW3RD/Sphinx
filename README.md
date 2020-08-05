<p align="center">
  <img src="https://h.top4top.io/p_1677o4imz1.png">
</p>


# Sphinx
- Sphinx is a simple http request library to make http requests simple and easy only one line written in c# and java

- Java version : https://github.com/iiKillerxSG/Sphinx

- C# Version : https://github.com/Bowlingtoolkit/Sphinx


# How to use

# Get method

``` Java
SHttpRequest request = new SHttpRequest("web server domain here");

// If there is no headers

// Use this

String response = request.get(null);

// else

HashMap<String,String> headers = new HashMap<String,String>();
//Ex
headers.put("content-type","application/json");

String response = request.get(headers);

System.out.println(response);

```

# Post method

``` Java
SHttpRequest request = new SHttpRequest("web server domain here");

// If there is no headers

// Use this

String response = request.post("the payload here",null);

// else

HashMap<String,String> headers = new HashMap<String,String>();
//Ex
headers.put("content-type","application/json");

String response = request.post("the payload here",headers);

System.out.println(response);

```

# Credits

- All copyright reserved to REVENGE and SW3RD

# Note

- I will add proxy support 

- Any problem open a case
