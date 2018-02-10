/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.catm.CertificateManagementRequestV01;
import com.tools20022.repository.codeset.CardPaymentServiceType10Code;
import com.tools20022.repository.datatype.Max10KBinary;
import com.tools20022.repository.datatype.Max20000Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the request of certificate management.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateManagementRequest1#mmPOIIdentification
 * CertificateManagementRequest1.mmPOIIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateManagementRequest1#mmTMIdentification
 * CertificateManagementRequest1.mmTMIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateManagementRequest1#mmCertificateService
 * CertificateManagementRequest1.mmCertificateService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateManagementRequest1#mmSecurityDomain
 * CertificateManagementRequest1.mmSecurityDomain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateManagementRequest1#mmBinaryCertificationRequest
 * CertificateManagementRequest1.mmBinaryCertificationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateManagementRequest1#mmCertificationRequest
 * CertificateManagementRequest1.mmCertificationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateManagementRequest1#mmClientCertificate
 * CertificateManagementRequest1.mmClientCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateManagementRequest1#mmWhiteListIdentification
 * CertificateManagementRequest1.mmWhiteListIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.CertificateManagementRequestV01#mmCertificateManagementRequest
 * CertificateManagementRequestV01.mmCertificateManagementRequest}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CertificateManagementRequest1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to the request of certificate management."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CertificateManagementRequest1", propOrder = {"pOIIdentification", "tMIdentification", "certificateService", "securityDomain", "binaryCertificationRequest", "certificationRequest", "clientCertificate",
		"whiteListIdentification"})
public class CertificateManagementRequest1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "POIId", required = true)
	protected GenericIdentification72 pOIIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification72
	 * GenericIdentification72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateManagementRequest1
	 * CertificateManagementRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POIId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the terminal or system using the certificate management service."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPOIIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateManagementRequest1.mmObject();
			isDerived = false;
			xmlTag = "POIId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIIdentification";
			definition = "Identification of the terminal or system using the certificate management service.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification72.mmObject();
		}
	};
	@XmlElement(name = "TMId")
	protected GenericIdentification72 tMIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification72
	 * GenericIdentification72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateManagementRequest1
	 * CertificateManagementRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TMId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the TM or the MTM providing the Certificate Authority service."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTMIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateManagementRequest1.mmObject();
			isDerived = false;
			xmlTag = "TMId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMIdentification";
			definition = "Identification of the TM or the MTM providing the Certificate Authority service.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification72.mmObject();
		}
	};
	@XmlElement(name = "CertSvc", required = true)
	protected CardPaymentServiceType10Code certificateService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType10Code
	 * CardPaymentServiceType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateManagementRequest1
	 * CertificateManagementRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertSvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested certificate management service."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCertificateService = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateManagementRequest1.mmObject();
			isDerived = false;
			xmlTag = "CertSvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateService";
			definition = "Requested certificate management service.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardPaymentServiceType10Code.mmObject();
		}
	};
	@XmlElement(name = "SctyDomn")
	protected Max70Text securityDomain;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateManagementRequest1
	 * CertificateManagementRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyDomn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityDomain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the client and server public key infrastructures containing the certificate. In addition, it may identify specific requirements of the customer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecurityDomain = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateManagementRequest1.mmObject();
			isDerived = false;
			xmlTag = "SctyDomn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDomain";
			definition = "Identification of the client and server public key infrastructures containing the certificate. In addition, it may identify specific requirements of the customer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	@XmlElement(name = "BinryCertfctnReq")
	protected Max20000Text binaryCertificationRequest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max20000Text Max20000Text}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateManagementRequest1
	 * CertificateManagementRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BinryCertfctnReq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BinaryCertificationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PKCS#10 (Public Key Certificate Standard 10) certification request coded in base64 ASN.1/DER (Abstract Syntax Notation 1, Distinguished Encoding Rules) or PEM (Privacy Enhanced Message) format."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBinaryCertificationRequest = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateManagementRequest1.mmObject();
			isDerived = false;
			xmlTag = "BinryCertfctnReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BinaryCertificationRequest";
			definition = "PKCS#10 (Public Key Certificate Standard 10) certification request coded in base64 ASN.1/DER (Abstract Syntax Notation 1, Distinguished Encoding Rules) or PEM (Privacy Enhanced Message) format.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max20000Text.mmObject();
		}
	};
	@XmlElement(name = "CertfctnReq")
	protected CertificationRequest1 certificationRequest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CertificationRequest1
	 * CertificationRequest1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateManagementRequest1
	 * CertificateManagementRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnReq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certification request PKCS#10 (Public Key Certificate Standard 10) for creation or renewal of an X.509 certificate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCertificationRequest = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateManagementRequest1.mmObject();
			isDerived = false;
			xmlTag = "CertfctnReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationRequest";
			definition = "Certification request PKCS#10 (Public Key Certificate Standard 10) for creation or renewal of an X.509 certificate.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CertificationRequest1.mmObject();
		}
	};
	@XmlElement(name = "ClntCert")
	protected Max10KBinary clientCertificate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10KBinary Max10KBinary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateManagementRequest1
	 * CertificateManagementRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntCert"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Created certificate. The certificate is ASN.1/DER encoded, for renewal or revocation of certificate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientCertificate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateManagementRequest1.mmObject();
			isDerived = false;
			xmlTag = "ClntCert";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientCertificate";
			definition = "Created certificate. The certificate is ASN.1/DER encoded, for renewal or revocation of certificate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10KBinary.mmObject();
		}
	};
	@XmlElement(name = "WhtListId")
	protected PointOfInteraction6 whiteListIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PointOfInteraction6
	 * PointOfInteraction6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateManagementRequest1
	 * CertificateManagementRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhtListId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhiteListIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the white list element, for white list addition or removal."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmWhiteListIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateManagementRequest1.mmObject();
			isDerived = false;
			xmlTag = "WhtListId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WhiteListIdentification";
			definition = "Identification of the white list element, for white list addition or removal.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PointOfInteraction6.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CertificateManagementRequest1.mmPOIIdentification, com.tools20022.repository.msg.CertificateManagementRequest1.mmTMIdentification,
						com.tools20022.repository.msg.CertificateManagementRequest1.mmCertificateService, com.tools20022.repository.msg.CertificateManagementRequest1.mmSecurityDomain,
						com.tools20022.repository.msg.CertificateManagementRequest1.mmBinaryCertificationRequest, com.tools20022.repository.msg.CertificateManagementRequest1.mmCertificationRequest,
						com.tools20022.repository.msg.CertificateManagementRequest1.mmClientCertificate, com.tools20022.repository.msg.CertificateManagementRequest1.mmWhiteListIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(CertificateManagementRequestV01.mmCertificateManagementRequest);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CertificateManagementRequest1";
				definition = "Information related to the request of certificate management.";
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification72 getPOIIdentification() {
		return pOIIdentification;
	}

	public CertificateManagementRequest1 setPOIIdentification(com.tools20022.repository.msg.GenericIdentification72 pOIIdentification) {
		this.pOIIdentification = Objects.requireNonNull(pOIIdentification);
		return this;
	}

	public Optional<GenericIdentification72> getTMIdentification() {
		return tMIdentification == null ? Optional.empty() : Optional.of(tMIdentification);
	}

	public CertificateManagementRequest1 setTMIdentification(com.tools20022.repository.msg.GenericIdentification72 tMIdentification) {
		this.tMIdentification = tMIdentification;
		return this;
	}

	public CardPaymentServiceType10Code getCertificateService() {
		return certificateService;
	}

	public CertificateManagementRequest1 setCertificateService(CardPaymentServiceType10Code certificateService) {
		this.certificateService = Objects.requireNonNull(certificateService);
		return this;
	}

	public Optional<Max70Text> getSecurityDomain() {
		return securityDomain == null ? Optional.empty() : Optional.of(securityDomain);
	}

	public CertificateManagementRequest1 setSecurityDomain(Max70Text securityDomain) {
		this.securityDomain = securityDomain;
		return this;
	}

	public Optional<Max20000Text> getBinaryCertificationRequest() {
		return binaryCertificationRequest == null ? Optional.empty() : Optional.of(binaryCertificationRequest);
	}

	public CertificateManagementRequest1 setBinaryCertificationRequest(Max20000Text binaryCertificationRequest) {
		this.binaryCertificationRequest = binaryCertificationRequest;
		return this;
	}

	public Optional<CertificationRequest1> getCertificationRequest() {
		return certificationRequest == null ? Optional.empty() : Optional.of(certificationRequest);
	}

	public CertificateManagementRequest1 setCertificationRequest(com.tools20022.repository.msg.CertificationRequest1 certificationRequest) {
		this.certificationRequest = certificationRequest;
		return this;
	}

	public Optional<Max10KBinary> getClientCertificate() {
		return clientCertificate == null ? Optional.empty() : Optional.of(clientCertificate);
	}

	public CertificateManagementRequest1 setClientCertificate(Max10KBinary clientCertificate) {
		this.clientCertificate = clientCertificate;
		return this;
	}

	public Optional<PointOfInteraction6> getWhiteListIdentification() {
		return whiteListIdentification == null ? Optional.empty() : Optional.of(whiteListIdentification);
	}

	public CertificateManagementRequest1 setWhiteListIdentification(com.tools20022.repository.msg.PointOfInteraction6 whiteListIdentification) {
		this.whiteListIdentification = whiteListIdentification;
		return this;
	}
}