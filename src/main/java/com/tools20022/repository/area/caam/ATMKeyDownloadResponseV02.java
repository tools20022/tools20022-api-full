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

package com.tools20022.repository.area.caam;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.ATMManagementPreviousVersion;
import com.tools20022.repository.msg.ATMKeyDownloadResponse2;
import com.tools20022.repository.msg.ContentInformationType10;
import com.tools20022.repository.msg.ContentInformationType13;
import com.tools20022.repository.msg.Header31;
import com.tools20022.repository.msgset.ATMInterfaceforTransactionProcessingandATMManagementISOPreviousversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * The ATMKeyDownloadResponse message is sent from an acquirer to an ATM in
 * response to an ATMKeyDownloadRequest message, to download of one or several
 * cryptographic keys.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code caam.004.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ATMManagementPreviousVersion
 * ATMManagementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadResponseV02#mmHeader
 * ATMKeyDownloadResponseV02.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadResponseV02#mmProtectedATMKeyDownloadResponse
 * ATMKeyDownloadResponseV02.mmProtectedATMKeyDownloadResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadResponseV02#mmATMKeyDownloadResponse
 * ATMKeyDownloadResponseV02.mmATMKeyDownloadResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadResponseV02#mmSecurityTrailer
 * ATMKeyDownloadResponseV02.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.ATMInterfaceforTransactionProcessingandATMManagementISOPreviousversion
 * ATMInterfaceforTransactionProcessingandATMManagementISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "ATMKeyDwnldRspn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMKeyDownloadResponseV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The ATMKeyDownloadResponse message is sent from an acquirer to an ATM in response to an ATMKeyDownloadRequest message, to download of one or several cryptographic keys."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadResponseV03
 * ATMKeyDownloadResponseV03}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadResponseV01
 * ATMKeyDownloadResponseV01}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMKeyDownloadResponseV02", propOrder = {"header", "protectedATMKeyDownloadResponse", "aTMKeyDownloadResponse", "securityTrailer"})
public class ATMKeyDownloadResponseV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header31 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header31
	 * Header31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the protocol management on a segment of the path from the ATM to the acquirer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ATMKeyDownloadResponseV02, Header31> mmHeader = new MMMessageBuildingBlock<ATMKeyDownloadResponseV02, Header31>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Information related to the protocol management on a segment of the path from the ATM to the acquirer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header31.mmObject();
		}

		@Override
		public Header31 getValue(ATMKeyDownloadResponseV02 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(ATMKeyDownloadResponseV02 obj, Header31 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "PrtctdATMKeyDwnldRspn")
	protected ContentInformationType10 protectedATMKeyDownloadResponse;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType10
	 * ContentInformationType10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdATMKeyDwnldRspn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedATMKeyDownloadResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encrypted body of the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ATMKeyDownloadResponseV02, Optional<ContentInformationType10>> mmProtectedATMKeyDownloadResponse = new MMMessageBuildingBlock<ATMKeyDownloadResponseV02, Optional<ContentInformationType10>>() {
		{
			xmlTag = "PrtctdATMKeyDwnldRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedATMKeyDownloadResponse";
			definition = "Encrypted body of the message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType10.mmObject();
		}

		@Override
		public Optional<ContentInformationType10> getValue(ATMKeyDownloadResponseV02 obj) {
			return obj.getProtectedATMKeyDownloadResponse();
		}

		@Override
		public void setValue(ATMKeyDownloadResponseV02 obj, Optional<ContentInformationType10> value) {
			obj.setProtectedATMKeyDownloadResponse(value.orElse(null));
		}
	};
	@XmlElement(name = "ATMKeyDwnldRspn")
	protected ATMKeyDownloadResponse2 aTMKeyDownloadResponse;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse2
	 * ATMKeyDownloadResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMKeyDwnldRspn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMKeyDownloadResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the response of an ATM key download from an ATM manager."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ATMKeyDownloadResponseV02, Optional<ATMKeyDownloadResponse2>> mmATMKeyDownloadResponse = new MMMessageBuildingBlock<ATMKeyDownloadResponseV02, Optional<ATMKeyDownloadResponse2>>() {
		{
			xmlTag = "ATMKeyDwnldRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMKeyDownloadResponse";
			definition = "Information related to the response of an ATM key download from an ATM manager.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ATMKeyDownloadResponse2.mmObject();
		}

		@Override
		public Optional<ATMKeyDownloadResponse2> getValue(ATMKeyDownloadResponseV02 obj) {
			return obj.getATMKeyDownloadResponse();
		}

		@Override
		public void setValue(ATMKeyDownloadResponseV02 obj, Optional<ATMKeyDownloadResponse2> value) {
			obj.setATMKeyDownloadResponse(value.orElse(null));
		}
	};
	@XmlElement(name = "SctyTrlr")
	protected ContentInformationType13 securityTrailer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType13
	 * ContentInformationType13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyTrlr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityTrailer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trailer of the message containing a MAC or a digital signature."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ATMKeyDownloadResponseV02, Optional<ContentInformationType13>> mmSecurityTrailer = new MMMessageBuildingBlock<ATMKeyDownloadResponseV02, Optional<ContentInformationType13>>() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC or a digital signature.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType13.mmObject();
		}

		@Override
		public Optional<ContentInformationType13> getValue(ATMKeyDownloadResponseV02 obj) {
			return obj.getSecurityTrailer();
		}

		@Override
		public void setValue(ATMKeyDownloadResponseV02 obj, Optional<ContentInformationType13> value) {
			obj.setSecurityTrailer(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMKeyDownloadResponseV02";
				definition = "The ATMKeyDownloadResponse message is sent from an acquirer to an ATM in response to an ATMKeyDownloadRequest message, to download of one or several cryptographic keys.";
				nextVersions_lazy = () -> Arrays.asList(ATMKeyDownloadResponseV03.mmObject());
				previousVersion_lazy = () -> ATMKeyDownloadResponseV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(ATMInterfaceforTransactionProcessingandATMManagementISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "ATMKeyDwnldRspn";
				businessArea_lazy = () -> ATMManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caam.ATMKeyDownloadResponseV02.mmHeader, com.tools20022.repository.area.caam.ATMKeyDownloadResponseV02.mmProtectedATMKeyDownloadResponse,
						com.tools20022.repository.area.caam.ATMKeyDownloadResponseV02.mmATMKeyDownloadResponse, com.tools20022.repository.area.caam.ATMKeyDownloadResponseV02.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "caam";
						messageFunctionality = "004";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ATMKeyDownloadResponseV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header31 getHeader() {
		return header;
	}

	public ATMKeyDownloadResponseV02 setHeader(Header31 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public Optional<ContentInformationType10> getProtectedATMKeyDownloadResponse() {
		return protectedATMKeyDownloadResponse == null ? Optional.empty() : Optional.of(protectedATMKeyDownloadResponse);
	}

	public ATMKeyDownloadResponseV02 setProtectedATMKeyDownloadResponse(ContentInformationType10 protectedATMKeyDownloadResponse) {
		this.protectedATMKeyDownloadResponse = protectedATMKeyDownloadResponse;
		return this;
	}

	public Optional<ATMKeyDownloadResponse2> getATMKeyDownloadResponse() {
		return aTMKeyDownloadResponse == null ? Optional.empty() : Optional.of(aTMKeyDownloadResponse);
	}

	public ATMKeyDownloadResponseV02 setATMKeyDownloadResponse(ATMKeyDownloadResponse2 aTMKeyDownloadResponse) {
		this.aTMKeyDownloadResponse = aTMKeyDownloadResponse;
		return this;
	}

	public Optional<ContentInformationType13> getSecurityTrailer() {
		return securityTrailer == null ? Optional.empty() : Optional.of(securityTrailer);
	}

	public ATMKeyDownloadResponseV02 setSecurityTrailer(ContentInformationType13 securityTrailer) {
		this.securityTrailer = securityTrailer;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caam.004.001.02")
	static public class Document {
		@XmlElement(name = "ATMKeyDwnldRspn", required = true)
		public ATMKeyDownloadResponseV02 messageBody;
	}
}