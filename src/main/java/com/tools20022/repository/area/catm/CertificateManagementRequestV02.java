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

package com.tools20022.repository.area.catm;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TerminalManagementLatestVersion;
import com.tools20022.repository.msg.CertificateManagementRequest1;
import com.tools20022.repository.msg.ContentInformationType18;
import com.tools20022.repository.msg.Header29;
import com.tools20022.repository.msgset.CAPEMaintenance20172018;
import com.tools20022.repository.msgset.CardPaymentsExchangesTerminalManagementISOLatestversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * The certificate management request message is sent by a POI terminal or any
 * intermediary entity either to a terminal manager acting as a certificate
 * authority for managing X.509 certificate of a public key owned by the
 * initiating party, or for requesting the inclusion or the removal of the POI
 * to a white list of the terminal manager.<br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.CertificateManagementRequestV02#mmHeader
 * CertificateManagementRequestV02.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.CertificateManagementRequestV02#mmCertificateManagementRequest
 * CertificateManagementRequestV02.mmCertificateManagementRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.CertificateManagementRequestV02#mmSecurityTrailer
 * CertificateManagementRequestV02.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CardPaymentsExchangesTerminalManagementISOLatestversion
 * CardPaymentsExchangesTerminalManagementISOLatestversion}</li>
 * <li>{@linkplain com.tools20022.repository.msgset.CAPEMaintenance20172018
 * CAPEMaintenance20172018}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CertMgmtReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TerminalManagementLatestVersion
 * TerminalManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code catm.007.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CertificateManagementRequestV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The certificate management request message is sent by a POI terminal or any intermediary entity either to a terminal manager acting as a certificate authority for managing X.509 certificate of a public key owned by the initiating party, or for requesting the inclusion or the removal of the POI to a white list of the terminal manager.\r\n"
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.catm.CertificateManagementRequestV01
 * CertificateManagementRequestV01}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CertificateManagementRequestV02", propOrder = {"header", "certificateManagementRequest", "securityTrailer"})
public class CertificateManagementRequestV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header29 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header29
	 * Header29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the protocol management."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.catm.CertificateManagementRequestV01#mmHeader
	 * CertificateManagementRequestV01.mmHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CertificateManagementRequestV02, Header29> mmHeader = new MMMessageBuildingBlock<CertificateManagementRequestV02, Header29>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Information related to the protocol management.";
			previousVersion_lazy = () -> CertificateManagementRequestV01.mmHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header29.mmObject();
		}

		@Override
		public Header29 getValue(CertificateManagementRequestV02 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(CertificateManagementRequestV02 obj, Header29 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "CertMgmtReq", required = true)
	protected CertificateManagementRequest1 certificateManagementRequest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CertificateManagementRequest1
	 * CertificateManagementRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertMgmtReq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateManagementRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the request of certificate management."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.catm.CertificateManagementRequestV01#mmCertificateManagementRequest
	 * CertificateManagementRequestV01.mmCertificateManagementRequest}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CertificateManagementRequestV02, CertificateManagementRequest1> mmCertificateManagementRequest = new MMMessageBuildingBlock<CertificateManagementRequestV02, CertificateManagementRequest1>() {
		{
			xmlTag = "CertMgmtReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateManagementRequest";
			definition = "Information related to the request of certificate management.";
			previousVersion_lazy = () -> CertificateManagementRequestV01.mmCertificateManagementRequest;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CertificateManagementRequest1.mmObject();
		}

		@Override
		public CertificateManagementRequest1 getValue(CertificateManagementRequestV02 obj) {
			return obj.getCertificateManagementRequest();
		}

		@Override
		public void setValue(CertificateManagementRequestV02 obj, CertificateManagementRequest1 value) {
			obj.setCertificateManagementRequest(value);
		}
	};
	@XmlElement(name = "SctyTrlr")
	protected ContentInformationType18 securityTrailer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType18
	 * ContentInformationType18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyTrlr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityTrailer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trailer of the message containing a MAC or a digital signature."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.catm.CertificateManagementRequestV01#mmSecurityTrailer
	 * CertificateManagementRequestV01.mmSecurityTrailer}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CertificateManagementRequestV02, Optional<ContentInformationType18>> mmSecurityTrailer = new MMMessageBuildingBlock<CertificateManagementRequestV02, Optional<ContentInformationType18>>() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC or a digital signature.";
			previousVersion_lazy = () -> CertificateManagementRequestV01.mmSecurityTrailer;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType18.mmObject();
		}

		@Override
		public Optional<ContentInformationType18> getValue(CertificateManagementRequestV02 obj) {
			return obj.getSecurityTrailer();
		}

		@Override
		public void setValue(CertificateManagementRequestV02 obj, Optional<ContentInformationType18> value) {
			obj.setSecurityTrailer(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CertificateManagementRequestV02";
				definition = "The certificate management request message is sent by a POI terminal or any intermediary entity either to a terminal manager acting as a certificate authority for managing X.509 certificate of a public key owned by the initiating party, or for requesting the inclusion or the removal of the POI to a white list of the terminal manager.\r\n";
				previousVersion_lazy = () -> CertificateManagementRequestV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(CardPaymentsExchangesTerminalManagementISOLatestversion.mmObject(), CAPEMaintenance20172018.mmObject());
				rootElement = "Document";
				xmlTag = "CertMgmtReq";
				businessArea_lazy = () -> TerminalManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.catm.CertificateManagementRequestV02.mmHeader,
						com.tools20022.repository.area.catm.CertificateManagementRequestV02.mmCertificateManagementRequest, com.tools20022.repository.area.catm.CertificateManagementRequestV02.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "catm";
						messageFunctionality = "007";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CertificateManagementRequestV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header29 getHeader() {
		return header;
	}

	public CertificateManagementRequestV02 setHeader(Header29 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public CertificateManagementRequest1 getCertificateManagementRequest() {
		return certificateManagementRequest;
	}

	public CertificateManagementRequestV02 setCertificateManagementRequest(CertificateManagementRequest1 certificateManagementRequest) {
		this.certificateManagementRequest = Objects.requireNonNull(certificateManagementRequest);
		return this;
	}

	public Optional<ContentInformationType18> getSecurityTrailer() {
		return securityTrailer == null ? Optional.empty() : Optional.of(securityTrailer);
	}

	public CertificateManagementRequestV02 setSecurityTrailer(ContentInformationType18 securityTrailer) {
		this.securityTrailer = securityTrailer;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.007.001.02")
	static public class Document {
		@XmlElement(name = "CertMgmtReq", required = true)
		public CertificateManagementRequestV02 messageBody;
	}
}