FROM openjdk

WORKDIR /app

copy A2.java .

RUN javac A2.java

CMD java A2