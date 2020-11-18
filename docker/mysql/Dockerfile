# Creates the minimum environment to package and run this Skyve application.
# Note that this uses an in-memory database and is only useful for demonstration/development.
FROM bizhubaustralia/skyve-wildfly-mysql

ENV LANG en_US.UTF-8

USER root
RUN mkdir /content
RUN chown jboss:jboss /content

USER jboss
ADD agedCare.war /opt/jboss/wildfly/standalone/deployments/agedCare.war
ADD agedCare.json /opt/jboss/wildfly/standalone/deployments
ADD agedCare-ds.xml /opt/jboss/wildfly/standalone/deployments
RUN touch /opt/jboss/wildfly/standalone/deployments/agedCare.war.dodeploy

ENV SKYVE_CONTENT='/content/' \
    SKYVE_DATASTORE_DIALECT='org.skyve.impl.persistence.hibernate.dialect.MySQL56InnoDBSpatialDialect' \
    DATABASE_URL='agedCare_db' \
    SKYVE_SECURITY_DOMAIN_NAME='agedCare' \
    SKYVE_JNDI_NAME='agedCareDB'

ENTRYPOINT [ "entrypoint.sh" ]