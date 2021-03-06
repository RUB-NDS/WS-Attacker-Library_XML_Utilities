/**
 * WS-Attacker - A Modular Web Services Penetration Testing Framework Copyright
 * (C) 2013 Christian Mainka
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
package wsattacker.library.xmlutilities.namespace;

public final class NamespaceConstants
{

    final public static String URI_NS_SOAP_1_1 = javax.xml.soap.SOAPConstants.URI_NS_SOAP_1_1_ENVELOPE;

    final public static String URI_NS_SOAP_1_2 = javax.xml.soap.SOAPConstants.URI_NS_SOAP_1_2_ENVELOPE;

    final public static String URI_NS_WSSE_1_0 =
        "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";

    final public static String URI_NS_WSSE_1_1 = "http://docs.oasis-open.org/wss/oasis-wss-wssecurity-secext-1.1.xsd";

    final public static String URI_NS_WSU =
        "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd";

    final public static String URI_NS_DS = javax.xml.crypto.dsig.XMLSignature.XMLNS;

    final public static String URI_NS_XF = "http://www.w3.org/2002/06/xmldsig-filter2";

    final public static String URI_NS_SCHEMA = "http://www.w3.org/2001/XMLSchema";

    final public static String URI_NS_WSATTACKER = "https://github.com/RUB-NDS/WS-Attacker";

    final public static String URI_NS_SAML10 = "urn:oasis:names:tc:SAML:1.0:assertion";

    final public static String URI_NS_SAML10P = "urn:oasis:names:tc:SAML:1.0:protocol";

    final public static String URI_NS_SAML20 = "urn:oasis:names:tc:SAML:2.0:assertion";

    final public static String URI_NS_SAML20P = "urn:oasis:names:tc:SAML:2.0:protocol";

    final public static String PREFIX_NS_SOAP_1_1 = "soapenv";

    final public static String PREFIX_NS_SOAP_1_2 = "soap";

    final public static String PREFIX_NS_WSSE = "wsse";

    final public static String PREFIX_NS_WSU = "wsu";

    final public static String PREFIX_NS_DS = "ds";

    final public static String PREFIX_NS_XF = "xf";

    final public static String PREFIX_NS_SCHEMA = "xs";

    final public static String PREFIX_NS_WSATTACKER = "wsatk";

    final public static String PREFIX_NS_SAML = "saml";

    final public static String PREFIX_NS_SAMLP = "samlp";

    private NamespaceConstants()
    {
    }
}
