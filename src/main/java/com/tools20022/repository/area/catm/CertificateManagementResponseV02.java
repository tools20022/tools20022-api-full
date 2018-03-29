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
import com.tools20022.repository.msg.CertificateManagementResponse1;
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
 * The CertificateManagementResponse is sent by a terminal manager in response
 * to a CertificateManagementRequest to provide the outcome of the requested
 * service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.CertificateManagementResponseV02#mmHeader
 * CertificateManagementResponseV02.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.CertificateManagementResponseV02#mmCertificateManagementResponse
 * CertificateManagementResponseV02.mmCertificateManagementResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.CertificateManagementResponseV02#mmSecurityTrailer
 * CertificateManagementResponseV02.mmSecurityTrailer}</li>
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
 * xmlTag} = "CertMgmtRspn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TerminalManagementLatestVersion
 * TerminalManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code catm.008.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CertificateManagementResponseV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The CertificateManagementResponse is sent by a terminal manager in response to a CertificateManagementRequest to provide the outcome of the requested service."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.catm.CertificateManagementResponseV01
 * CertificateManagementResponseV01}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CertificateManagementResponseV02", propOrder = {"header", "certificateManagementResponse", "securityTrailer"})
public class CertificateManagementResponseV02 {

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
	 * {@linkplain com.tools20022.repository.area.catm.CertificateManagementResponseV01#mmHeader
	 * CertificateManagementResponseV01.mmHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CertificateManagementResponseV02, Header29> mmHeader = new MMMessageBuildingBlock<CertificateManagementResponseV02, Header29>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Information related to the protocol management.";
			previousVersion_lazy = () -> CertificateManagementResponseV01.mmHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header29.mmObject();
		}

		@Override
		public Header29 getValue(CertificateManagementResponseV02 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(CertificateManagementResponseV02 obj, Header29 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "CertMgmtRspn", required = true)
	protected CertificateManagementResponse1 certificateManagementResponse;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CertificateManagementResponse1
	 * CertificateManagementResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertMgmtRspn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateManagementResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the result of the certificate management request."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.catm.CertificateManagementResponseV01#mmCertificateManagementResponse
	 * CertificateManagementResponseV01.mmCertificateManagementResponse}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CertificateManagementResponseV02, CertificateManagementResponse1> mmCertificateManagementResponse = new MMMessageBuildingBlock<CertificateManagementResponseV02, CertificateManagementResponse1>() {
		{
			xmlTag = "CertMgmtRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateManagementResponse";
			definition = "Information related to the result of the certificate management request.";
			previousVersion_lazy = () -> CertificateManagementResponseV01.mmCertificateManagementResponse;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CertificateManagementResponse1.mmObject();
		}

		@Override
		public CertificateManagementResponse1 getValue(CertificateManagementResponseV02 obj) {
			return obj.getCertificateManagementResponse();
		}

		@Override
		public void setValue(CertificateManagementResponseV02 obj, CertificateManagementResponse1 value) {
			obj.setCertificateManagementResponse(value);
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
	 * {@linkplain com.tools20022.repository.area.catm.CertificateManagementResponseV01#mmSecurityTrailer
	 * CertificateManagementResponseV01.mmSecurityTrailer}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CertificateManagementResponseV02, Optional<ContentInformationType18>> mmSecurityTrailer = new MMMessageBuildingBlock<CertificateManagementResponseV02, Optional<ContentInformationType18>>() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC or a digital signature.";
			previousVersion_lazy = () -> CertificateManagementResponseV01.mmSecurityTrailer;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType18.mmObject();
		}

		@Override
		public Optional<ContentInformationType18> getValue(CertificateManagementResponseV02 obj) {
			return obj.getSecurityTrailer();
		}

		@Override
		public void setValue(CertificateManagementResponseV02 obj, Optional<ContentInformationType18> value) {
			obj.setSecurityTrailer(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CertificateManagementResponseV02";
				definition = "The CertificateManagementResponse is sent by a terminal manager in response to a CertificateManagementRequest to provide the outcome of the requested service.";
				previousVersion_lazy = () -> CertificateManagementResponseV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(CardPaymentsExchangesTerminalManagementISOLatestversion.mmObject(), CAPEMaintenance20172018.mmObject());
				rootElement = "Document";
				xmlTag = "CertMgmtRspn";
				businessArea_lazy = () -> TerminalManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.catm.CertificateManagementResponseV02.mmHeader,
						com.tools20022.repository.area.catm.CertificateManagementResponseV02.mmCertificateManagementResponse, com.tools20022.repository.area.catm.CertificateManagementResponseV02.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "catm";
						messageFunctionality = "008";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CertificateManagementResponseV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header29 getHeader() {
		return header;
	}

	public CertificateManagementResponseV02 setHeader(Header29 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public CertificateManagementResponse1 getCertificateManagementResponse() {
		return certificateManagementResponse;
	}

	public CertificateManagementResponseV02 setCertificateManagementResponse(CertificateManagementResponse1 certificateManagementResponse) {
		this.certificateManagementResponse = Objects.requireNonNull(certificateManagementResponse);
		return this;
	}

	public Optional<ContentInformationType18> getSecurityTrailer() {
		return securityTrailer == null ? Optional.empty() : Optional.of(securityTrailer);
	}

	public CertificateManagementResponseV02 setSecurityTrailer(ContentInformationType18 securityTrailer) {
		this.securityTrailer = securityTrailer;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.008.001.02")
	static public class Document {
		@XmlElement(name = "CertMgmtRspn", required = true)
		public CertificateManagementResponseV02 messageBody;
	}
}