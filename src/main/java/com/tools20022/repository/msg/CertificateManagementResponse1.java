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
import com.tools20022.repository.area.catm.CertificateManagementResponseV01;
import com.tools20022.repository.codeset.CardPaymentServiceType10Code;
import com.tools20022.repository.datatype.Max10KBinary;
import com.tools20022.repository.datatype.Max3000Binary;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Information related to the result of the certificate management request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateManagementResponse1#mmPOIIdentification
 * CertificateManagementResponse1.mmPOIIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateManagementResponse1#mmTMIdentification
 * CertificateManagementResponse1.mmTMIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateManagementResponse1#mmCertificateService
 * CertificateManagementResponse1.mmCertificateService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateManagementResponse1#mmResult
 * CertificateManagementResponse1.mmResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateManagementResponse1#mmSecurityProfile
 * CertificateManagementResponse1.mmSecurityProfile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateManagementResponse1#mmClientCertificate
 * CertificateManagementResponse1.mmClientCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateManagementResponse1#mmClientCertificatePath
 * CertificateManagementResponse1.mmClientCertificatePath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateManagementResponse1#mmServerCertificatePath
 * CertificateManagementResponse1.mmServerCertificatePath}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.CertificateManagementResponseV01#mmCertificateManagementResponse
 * CertificateManagementResponseV01.mmCertificateManagementResponse}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CertificateManagementResponse1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the result of the certificate management request."</li>
 * </ul>
 */
public class CertificateManagementResponse1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected GenericIdentification72 pOIIdentification;
	/**
	 * Identification of the terminal or system using the certificate management
	 * service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification72
	 * GenericIdentification72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateManagementResponse1
	 * CertificateManagementResponse1}</li>
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
			componentContext_lazy = () -> CertificateManagementResponse1.mmObject();
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
	protected GenericIdentification72 tMIdentification;
	/**
	 * Identification of the TM or the MTM providing the Certificate Authority
	 * service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification72
	 * GenericIdentification72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateManagementResponse1
	 * CertificateManagementResponse1}</li>
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
			componentContext_lazy = () -> CertificateManagementResponse1.mmObject();
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
	protected CardPaymentServiceType10Code certificateService;
	/**
	 * Requested certificate management service.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CertificateManagementResponse1
	 * CertificateManagementResponse1}</li>
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
			componentContext_lazy = () -> CertificateManagementResponse1.mmObject();
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
	protected ResponseType6 result;
	/**
	 * Outcome of the certificate service processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ResponseType6
	 * ResponseType6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateManagementResponse1
	 * CertificateManagementResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Result"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Outcome of the certificate service processing."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmResult = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CertificateManagementResponse1.mmObject();
			isDerived = false;
			xmlTag = "Rslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Result";
			definition = "Outcome of the certificate service processing.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ResponseType6.mmObject();
		}
	};
	protected Max35Text securityProfile;
	/**
	 * Identification of the security profile, for creation, renewal or
	 * revocation of certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateManagementResponse1
	 * CertificateManagementResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyPrfl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityProfile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the security profile, for creation, renewal or revocation of certificate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecurityProfile = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CertificateManagementResponse1.mmObject();
			isDerived = false;
			xmlTag = "SctyPrfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityProfile";
			definition = "Identification of the security profile, for creation, renewal or revocation of certificate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max3000Binary clientCertificate;
	/**
	 * Created or renewed certificate. The certificate is ASN.1/DER encoded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3000Binary
	 * Max3000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificateManagementResponse1
	 * CertificateManagementResponse1}</li>
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
	 * "Created or renewed certificate. The certificate is ASN.1/DER encoded."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientCertificate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CertificateManagementResponse1.mmObject();
			isDerived = false;
			xmlTag = "ClntCert";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientCertificate";
			definition = "Created or renewed certificate. The certificate is ASN.1/DER encoded.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3000Binary.mmObject();
		}
	};
	protected List<Max10KBinary> clientCertificatePath;
	/**
	 * Certificate of the client certificate path, from the CA (Certificate
	 * Authority) certificate, to the root certificate, for renewal or
	 * revocation of certificate.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CertificateManagementResponse1
	 * CertificateManagementResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntCertPth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientCertificatePath"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certificate of the client certificate path, from the CA (Certificate Authority) certificate, to the root certificate, for renewal or revocation of certificate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientCertificatePath = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CertificateManagementResponse1.mmObject();
			isDerived = false;
			xmlTag = "ClntCertPth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientCertificatePath";
			definition = "Certificate of the client certificate path, from the CA (Certificate Authority) certificate, to the root certificate, for renewal or revocation of certificate.";
			minOccurs = 0;
			simpleType_lazy = () -> Max10KBinary.mmObject();
		}
	};
	protected List<Max10KBinary> serverCertificatePath;
	/**
	 * Certificate of the server certificate path, from the CA (Certificate
	 * Authority) certificate, to the root certificate, for renewal or
	 * revocation of certificate.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CertificateManagementResponse1
	 * CertificateManagementResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvrCertPth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServerCertificatePath"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certificate of the server certificate path, from the CA (Certificate Authority) certificate, to the root certificate, for renewal or revocation of certificate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmServerCertificatePath = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CertificateManagementResponse1.mmObject();
			isDerived = false;
			xmlTag = "SvrCertPth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServerCertificatePath";
			definition = "Certificate of the server certificate path, from the CA (Certificate Authority) certificate, to the root certificate, for renewal or revocation of certificate.";
			minOccurs = 0;
			simpleType_lazy = () -> Max10KBinary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CertificateManagementResponse1.mmPOIIdentification, CertificateManagementResponse1.mmTMIdentification, CertificateManagementResponse1.mmCertificateService,
						CertificateManagementResponse1.mmResult, CertificateManagementResponse1.mmSecurityProfile, CertificateManagementResponse1.mmClientCertificate, CertificateManagementResponse1.mmClientCertificatePath,
						CertificateManagementResponse1.mmServerCertificatePath);
				messageBuildingBlock_lazy = () -> Arrays.asList(CertificateManagementResponseV01.mmCertificateManagementResponse);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CertificateManagementResponse1";
				definition = "Information related to the result of the certificate management request.";
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification72 getPOIIdentification() {
		return pOIIdentification;
	}

	public void setPOIIdentification(com.tools20022.repository.msg.GenericIdentification72 pOIIdentification) {
		this.pOIIdentification = pOIIdentification;
	}

	public GenericIdentification72 getTMIdentification() {
		return tMIdentification;
	}

	public void setTMIdentification(com.tools20022.repository.msg.GenericIdentification72 tMIdentification) {
		this.tMIdentification = tMIdentification;
	}

	public CardPaymentServiceType10Code getCertificateService() {
		return certificateService;
	}

	public void setCertificateService(CardPaymentServiceType10Code certificateService) {
		this.certificateService = certificateService;
	}

	public ResponseType6 getResult() {
		return result;
	}

	public void setResult(com.tools20022.repository.msg.ResponseType6 result) {
		this.result = result;
	}

	public Max35Text getSecurityProfile() {
		return securityProfile;
	}

	public void setSecurityProfile(Max35Text securityProfile) {
		this.securityProfile = securityProfile;
	}

	public Max3000Binary getClientCertificate() {
		return clientCertificate;
	}

	public void setClientCertificate(Max3000Binary clientCertificate) {
		this.clientCertificate = clientCertificate;
	}

	public List<Max10KBinary> getClientCertificatePath() {
		return clientCertificatePath;
	}

	public void setClientCertificatePath(List<Max10KBinary> clientCertificatePath) {
		this.clientCertificatePath = clientCertificatePath;
	}

	public List<Max10KBinary> getServerCertificatePath() {
		return serverCertificatePath;
	}

	public void setServerCertificatePath(List<Max10KBinary> serverCertificatePath) {
		this.serverCertificatePath = serverCertificatePath;
	}
}