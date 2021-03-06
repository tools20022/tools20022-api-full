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
import com.tools20022.repository.area.catm.CertificateManagementResponseV02;
import com.tools20022.repository.codeset.CardPaymentServiceType10Code;
import com.tools20022.repository.datatype.Max10KBinary;
import com.tools20022.repository.datatype.Max3000Binary;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification72;
import com.tools20022.repository.msg.ResponseType6;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.CertificateManagementResponseV02#mmCertificateManagementResponse
 * CertificateManagementResponseV02.mmCertificateManagementResponse}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CertificateManagementResponse1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the result of the certificate management request."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CertificateManagementResponse1", propOrder = {"pOIIdentification", "tMIdentification", "certificateService", "result", "securityProfile", "clientCertificate", "clientCertificatePath", "serverCertificatePath"})
public class CertificateManagementResponse1 {

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
	 * {@linkplain com.tools20022.repository.msg.CertificateManagementResponse1
	 * CertificateManagementResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POIId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the terminal or system using the certificate management service."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CertificateManagementResponse1, GenericIdentification72> mmPOIIdentification = new MMMessageAssociationEnd<CertificateManagementResponse1, GenericIdentification72>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateManagementResponse1.mmObject();
			isDerived = false;
			xmlTag = "POIId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIIdentification";
			definition = "Identification of the terminal or system using the certificate management service.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification72.mmObject();
		}

		@Override
		public GenericIdentification72 getValue(CertificateManagementResponse1 obj) {
			return obj.getPOIIdentification();
		}

		@Override
		public void setValue(CertificateManagementResponse1 obj, GenericIdentification72 value) {
			obj.setPOIIdentification(value);
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
	 * {@linkplain com.tools20022.repository.msg.CertificateManagementResponse1
	 * CertificateManagementResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TMId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the TM or the MTM providing the Certificate Authority service."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CertificateManagementResponse1, Optional<GenericIdentification72>> mmTMIdentification = new MMMessageAssociationEnd<CertificateManagementResponse1, Optional<GenericIdentification72>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateManagementResponse1.mmObject();
			isDerived = false;
			xmlTag = "TMId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMIdentification";
			definition = "Identification of the TM or the MTM providing the Certificate Authority service.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification72.mmObject();
		}

		@Override
		public Optional<GenericIdentification72> getValue(CertificateManagementResponse1 obj) {
			return obj.getTMIdentification();
		}

		@Override
		public void setValue(CertificateManagementResponse1 obj, Optional<GenericIdentification72> value) {
			obj.setTMIdentification(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CertificateManagementResponse1
	 * CertificateManagementResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertSvc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested certificate management service."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CertificateManagementResponse1, CardPaymentServiceType10Code> mmCertificateService = new MMMessageAttribute<CertificateManagementResponse1, CardPaymentServiceType10Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateManagementResponse1.mmObject();
			isDerived = false;
			xmlTag = "CertSvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateService";
			definition = "Requested certificate management service.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardPaymentServiceType10Code.mmObject();
		}

		@Override
		public CardPaymentServiceType10Code getValue(CertificateManagementResponse1 obj) {
			return obj.getCertificateService();
		}

		@Override
		public void setValue(CertificateManagementResponse1 obj, CardPaymentServiceType10Code value) {
			obj.setCertificateService(value);
		}
	};
	@XmlElement(name = "Rslt", required = true)
	protected ResponseType6 result;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Result"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Outcome of the certificate service processing."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CertificateManagementResponse1, ResponseType6> mmResult = new MMMessageAssociationEnd<CertificateManagementResponse1, ResponseType6>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateManagementResponse1.mmObject();
			isDerived = false;
			xmlTag = "Rslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Result";
			definition = "Outcome of the certificate service processing.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ResponseType6.mmObject();
		}

		@Override
		public ResponseType6 getValue(CertificateManagementResponse1 obj) {
			return obj.getResult();
		}

		@Override
		public void setValue(CertificateManagementResponse1 obj, ResponseType6 value) {
			obj.setResult(value);
		}
	};
	@XmlElement(name = "SctyPrfl")
	protected Max35Text securityProfile;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityProfile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the security profile, for creation, renewal or revocation of certificate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CertificateManagementResponse1, Optional<Max35Text>> mmSecurityProfile = new MMMessageAttribute<CertificateManagementResponse1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateManagementResponse1.mmObject();
			isDerived = false;
			xmlTag = "SctyPrfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityProfile";
			definition = "Identification of the security profile, for creation, renewal or revocation of certificate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CertificateManagementResponse1 obj) {
			return obj.getSecurityProfile();
		}

		@Override
		public void setValue(CertificateManagementResponse1 obj, Optional<Max35Text> value) {
			obj.setSecurityProfile(value.orElse(null));
		}
	};
	@XmlElement(name = "ClntCert")
	protected Max3000Binary clientCertificate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Created or renewed certificate. The certificate is ASN.1/DER encoded."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CertificateManagementResponse1, Optional<Max3000Binary>> mmClientCertificate = new MMMessageAttribute<CertificateManagementResponse1, Optional<Max3000Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateManagementResponse1.mmObject();
			isDerived = false;
			xmlTag = "ClntCert";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientCertificate";
			definition = "Created or renewed certificate. The certificate is ASN.1/DER encoded.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3000Binary.mmObject();
		}

		@Override
		public Optional<Max3000Binary> getValue(CertificateManagementResponse1 obj) {
			return obj.getClientCertificate();
		}

		@Override
		public void setValue(CertificateManagementResponse1 obj, Optional<Max3000Binary> value) {
			obj.setClientCertificate(value.orElse(null));
		}
	};
	@XmlElement(name = "ClntCertPth")
	protected List<Max10KBinary> clientCertificatePath;
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
	 * {@linkplain com.tools20022.repository.msg.CertificateManagementResponse1
	 * CertificateManagementResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntCertPth"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientCertificatePath"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certificate of the client certificate path, from the CA (Certificate Authority) certificate, to the root certificate, for renewal or revocation of certificate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CertificateManagementResponse1, List<Max10KBinary>> mmClientCertificatePath = new MMMessageAttribute<CertificateManagementResponse1, List<Max10KBinary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateManagementResponse1.mmObject();
			isDerived = false;
			xmlTag = "ClntCertPth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientCertificatePath";
			definition = "Certificate of the client certificate path, from the CA (Certificate Authority) certificate, to the root certificate, for renewal or revocation of certificate.";
			minOccurs = 0;
			simpleType_lazy = () -> Max10KBinary.mmObject();
		}

		@Override
		public List<Max10KBinary> getValue(CertificateManagementResponse1 obj) {
			return obj.getClientCertificatePath();
		}

		@Override
		public void setValue(CertificateManagementResponse1 obj, List<Max10KBinary> value) {
			obj.setClientCertificatePath(value);
		}
	};
	@XmlElement(name = "SvrCertPth")
	protected List<Max10KBinary> serverCertificatePath;
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
	 * {@linkplain com.tools20022.repository.msg.CertificateManagementResponse1
	 * CertificateManagementResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvrCertPth"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServerCertificatePath"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certificate of the server certificate path, from the CA (Certificate Authority) certificate, to the root certificate, for renewal or revocation of certificate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CertificateManagementResponse1, List<Max10KBinary>> mmServerCertificatePath = new MMMessageAttribute<CertificateManagementResponse1, List<Max10KBinary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CertificateManagementResponse1.mmObject();
			isDerived = false;
			xmlTag = "SvrCertPth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServerCertificatePath";
			definition = "Certificate of the server certificate path, from the CA (Certificate Authority) certificate, to the root certificate, for renewal or revocation of certificate.";
			minOccurs = 0;
			simpleType_lazy = () -> Max10KBinary.mmObject();
		}

		@Override
		public List<Max10KBinary> getValue(CertificateManagementResponse1 obj) {
			return obj.getServerCertificatePath();
		}

		@Override
		public void setValue(CertificateManagementResponse1 obj, List<Max10KBinary> value) {
			obj.setServerCertificatePath(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CertificateManagementResponse1.mmPOIIdentification, com.tools20022.repository.msg.CertificateManagementResponse1.mmTMIdentification,
						com.tools20022.repository.msg.CertificateManagementResponse1.mmCertificateService, com.tools20022.repository.msg.CertificateManagementResponse1.mmResult,
						com.tools20022.repository.msg.CertificateManagementResponse1.mmSecurityProfile, com.tools20022.repository.msg.CertificateManagementResponse1.mmClientCertificate,
						com.tools20022.repository.msg.CertificateManagementResponse1.mmClientCertificatePath, com.tools20022.repository.msg.CertificateManagementResponse1.mmServerCertificatePath);
				messageBuildingBlock_lazy = () -> Arrays.asList(CertificateManagementResponseV01.mmCertificateManagementResponse, CertificateManagementResponseV02.mmCertificateManagementResponse);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
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

	public CertificateManagementResponse1 setPOIIdentification(GenericIdentification72 pOIIdentification) {
		this.pOIIdentification = Objects.requireNonNull(pOIIdentification);
		return this;
	}

	public Optional<GenericIdentification72> getTMIdentification() {
		return tMIdentification == null ? Optional.empty() : Optional.of(tMIdentification);
	}

	public CertificateManagementResponse1 setTMIdentification(GenericIdentification72 tMIdentification) {
		this.tMIdentification = tMIdentification;
		return this;
	}

	public CardPaymentServiceType10Code getCertificateService() {
		return certificateService;
	}

	public CertificateManagementResponse1 setCertificateService(CardPaymentServiceType10Code certificateService) {
		this.certificateService = Objects.requireNonNull(certificateService);
		return this;
	}

	public ResponseType6 getResult() {
		return result;
	}

	public CertificateManagementResponse1 setResult(ResponseType6 result) {
		this.result = Objects.requireNonNull(result);
		return this;
	}

	public Optional<Max35Text> getSecurityProfile() {
		return securityProfile == null ? Optional.empty() : Optional.of(securityProfile);
	}

	public CertificateManagementResponse1 setSecurityProfile(Max35Text securityProfile) {
		this.securityProfile = securityProfile;
		return this;
	}

	public Optional<Max3000Binary> getClientCertificate() {
		return clientCertificate == null ? Optional.empty() : Optional.of(clientCertificate);
	}

	public CertificateManagementResponse1 setClientCertificate(Max3000Binary clientCertificate) {
		this.clientCertificate = clientCertificate;
		return this;
	}

	public List<Max10KBinary> getClientCertificatePath() {
		return clientCertificatePath == null ? clientCertificatePath = new ArrayList<>() : clientCertificatePath;
	}

	public CertificateManagementResponse1 setClientCertificatePath(List<Max10KBinary> clientCertificatePath) {
		this.clientCertificatePath = Objects.requireNonNull(clientCertificatePath);
		return this;
	}

	public List<Max10KBinary> getServerCertificatePath() {
		return serverCertificatePath == null ? serverCertificatePath = new ArrayList<>() : serverCertificatePath;
	}

	public CertificateManagementResponse1 setServerCertificatePath(List<Max10KBinary> serverCertificatePath) {
		this.serverCertificatePath = Objects.requireNonNull(serverCertificatePath);
		return this;
	}
}