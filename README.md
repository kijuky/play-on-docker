# play-on-docker

このプロジェクトはplayをdocker化するデモです。

## usage

```shell
$ sbt Docker/publishLocal
$ docker run -it --rm -p 9000:9000 -v "$(pwd)/logs:/opt/docker/logs" play-on-docker:1.0-SNAPSHOT
```

```shell
$ open http://localhost:9000
```

GET IT!!!
