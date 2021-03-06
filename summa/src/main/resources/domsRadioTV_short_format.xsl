<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet
        xmlns:dobundle="http://ecm.sourceforge.net/types/digitalobjectbundle/0/2/#"
        xmlns:foxml="info:fedora/fedora-system:def/foxml#"
        xmlns:pbcore="http://www.pbcore.org/PBCore/PBCoreNamespace.html"
        xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
        xmlns:Index="http://statsbiblioteket.dk/summa/2008/Document"
        xmlns:xs="http://www.w3.org/2001/XMLSchema-instance"
        xmlns:xalan="http://xml.apache.org/xalan"
        xmlns:java="http://xml.apache.org/xalan/java"
        xmlns:dc="http://purl.org/dc/elements/1.1/"
        xmlns:oai_dc="http://www.openarchives.org/OAI/2.0/oai_dc/"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        exclude-result-prefixes="java xs xalan xsl" version="1.0" xsi:schemaLocation="http://www.openarchiv">
    <xsl:output version="1.0" encoding="UTF-8" indent="yes" method="xml"/>
    <xsl:template name="doms_shortformat">
        <Index:field Index:name="shortformat">
            <xsl:text disable-output-escaping="yes">&lt;![CDATA[</xsl:text>
            <shortrecord>
                <rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#" xmlns:dc="http://purl.org/dc/elements/1.1/">
                    <rdf:Description>
                        <dc:title>
                            <xsl:value-of
                            select="foxml:digitalObject/
                            foxml:datastream[@ID='PBCORE']/
                            foxml:datastreamVersion[last()]/
                            foxml:xmlContent/
                            pbcore:PBCoreDescriptionDocument/
                            pbcore:pbcoreTitle/
                            pbcore:title"/>
                        </dc:title>
                    </rdf:Description>
                </rdf:RDF>
            </shortrecord>
            <xsl:text disable-output-escaping="yes">]]&gt;</xsl:text>
        </Index:field>
    </xsl:template>
</xsl:stylesheet>