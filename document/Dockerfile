# 基础镜像用java
FROM java:8
# 作者
MAINTAINER saimi
# VOLUME指定临时文件目录为/tmp，在主机/var/lib/docker目录下创建了一个临时文件并链接到容器的/tmp
VOLUME /tmp
# 降jar包添加到容器中并改名为 power_docker.jar
ADD power-0.0.1-SNAPSHOT.jar power_docker.jar
# 运行jar包
RUN bash -c 'touch /power_docker.jar'
ENTRYPOINT ["java","-jar","/power_docker.jar"]
# 暴露8102端口作为微服务
EXPOSE 8102