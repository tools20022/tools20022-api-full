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
import com.tools20022.repository.msg.ATMDiagnosticRequest1;
import com.tools20022.repository.msg.ContentInformationType10;
import com.tools20022.repository.msg.ContentInformationType15;
import com.tools20022.repository.msg.Header20;
import com.tools20022.repository.msgset.ATMInterfaceforTransactionProcessingandATMManagementISOPreviousversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * The ATMDiagnosticRequest message is sent from an ATM to an acquirer to verify
 * the availability of the acquirer. The acquirer will also validate that this
 * ATM is a valid ATM for its particular network.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code caam.005.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ATMManagementPreviousVersion
 * ATMManagementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticRequestV01#mmHeader
 * ATMDiagnosticRequestV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticRequestV01#mmProtectedATMDiagnosticRequest
 * ATMDiagnosticRequestV01.mmProtectedATMDiagnosticRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticRequestV01#mmATMDiagnosticRequest
 * ATMDiagnosticRequestV01.mmATMDiagnosticRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticRequestV01#mmSecurityTrailer
 * ATMDiagnosticRequestV01.mmSecurityTrailer}</li>
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
 * xmlTag} = "ATMDgnstcReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMDiagnosticRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The ATMDiagnosticRequest message is sent from an ATM to an acquirer to verify the availability of the acquirer. The acquirer will also validate that this ATM is a valid ATM for its particular network."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMDiagnosticRequestV02
 * ATMDiagnosticRequestV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMDiagnosticRequestV01", propOrder = {"header", "protectedATMDiagnosticRequest", "aTMDiagnosticRequest", "securityTrailer"})
public class ATMDiagnosticRequestV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header20 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header20
	 * Header20}</li>
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
	public static final MMMessageBuildingBlock<ATMDiagnosticRequestV01, Header20> mmHeader = new MMMessageBuildingBlock<ATMDiagnosticRequestV01, Header20>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Information related to the protocol management on a segment of the path from the ATM to the acquirer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header20.mmObject();
		}

		@Override
		public Header20 getValue(ATMDiagnosticRequestV01 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(ATMDiagnosticRequestV01 obj, Header20 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "PrtctdATMDgnstcReq")
	protected ContentInformationType10 protectedATMDiagnosticRequest;
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
	 * xmlTag} = "PrtctdATMDgnstcReq"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedATMDiagnosticRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encrypted body of the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ATMDiagnosticRequestV01, Optional<ContentInformationType10>> mmProtectedATMDiagnosticRequest = new MMMessageBuildingBlock<ATMDiagnosticRequestV01, Optional<ContentInformationType10>>() {
		{
			xmlTag = "PrtctdATMDgnstcReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedATMDiagnosticRequest";
			definition = "Encrypted body of the message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType10.mmObject();
		}

		@Override
		public Optional<ContentInformationType10> getValue(ATMDiagnosticRequestV01 obj) {
			return obj.getProtectedATMDiagnosticRequest();
		}

		@Override
		public void setValue(ATMDiagnosticRequestV01 obj, Optional<ContentInformationType10> value) {
			obj.setProtectedATMDiagnosticRequest(value.orElse(null));
		}
	};
	@XmlElement(name = "ATMDgnstcReq")
	protected ATMDiagnosticRequest1 aTMDiagnosticRequest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ATMDiagnosticRequest1
	 * ATMDiagnosticRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMDgnstcReq"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMDiagnosticRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the request of a diagnostic from an ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ATMDiagnosticRequestV01, Optional<ATMDiagnosticRequest1>> mmATMDiagnosticRequest = new MMMessageBuildingBlock<ATMDiagnosticRequestV01, Optional<ATMDiagnosticRequest1>>() {
		{
			xmlTag = "ATMDgnstcReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDiagnosticRequest";
			definition = "Information related to the request of a diagnostic from an ATM.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ATMDiagnosticRequest1.mmObject();
		}

		@Override
		public Optional<ATMDiagnosticRequest1> getValue(ATMDiagnosticRequestV01 obj) {
			return obj.getATMDiagnosticRequest();
		}

		@Override
		public void setValue(ATMDiagnosticRequestV01 obj, Optional<ATMDiagnosticRequest1> value) {
			obj.setATMDiagnosticRequest(value.orElse(null));
		}
	};
	@XmlElement(name = "SctyTrlr")
	protected ContentInformationType15 securityTrailer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType15
	 * ContentInformationType15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyTrlr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityTrailer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trailer of the message containing a MAC."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ATMDiagnosticRequestV01, Optional<ContentInformationType15>> mmSecurityTrailer = new MMMessageBuildingBlock<ATMDiagnosticRequestV01, Optional<ContentInformationType15>>() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType15.mmObject();
		}

		@Override
		public Optional<ContentInformationType15> getValue(ATMDiagnosticRequestV01 obj) {
			return obj.getSecurityTrailer();
		}

		@Override
		public void setValue(ATMDiagnosticRequestV01 obj, Optional<ContentInformationType15> value) {
			obj.setSecurityTrailer(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMDiagnosticRequestV01";
				definition = "The ATMDiagnosticRequest message is sent from an ATM to an acquirer to verify the availability of the acquirer. The acquirer will also validate that this ATM is a valid ATM for its particular network.";
				nextVersions_lazy = () -> Arrays.asList(ATMDiagnosticRequestV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ATMInterfaceforTransactionProcessingandATMManagementISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "ATMDgnstcReq";
				businessArea_lazy = () -> ATMManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caam.ATMDiagnosticRequestV01.mmHeader, com.tools20022.repository.area.caam.ATMDiagnosticRequestV01.mmProtectedATMDiagnosticRequest,
						com.tools20022.repository.area.caam.ATMDiagnosticRequestV01.mmATMDiagnosticRequest, com.tools20022.repository.area.caam.ATMDiagnosticRequestV01.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "caam";
						messageFunctionality = "005";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ATMDiagnosticRequestV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header20 getHeader() {
		return header;
	}

	public ATMDiagnosticRequestV01 setHeader(Header20 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public Optional<ContentInformationType10> getProtectedATMDiagnosticRequest() {
		return protectedATMDiagnosticRequest == null ? Optional.empty() : Optional.of(protectedATMDiagnosticRequest);
	}

	public ATMDiagnosticRequestV01 setProtectedATMDiagnosticRequest(ContentInformationType10 protectedATMDiagnosticRequest) {
		this.protectedATMDiagnosticRequest = protectedATMDiagnosticRequest;
		return this;
	}

	public Optional<ATMDiagnosticRequest1> getATMDiagnosticRequest() {
		return aTMDiagnosticRequest == null ? Optional.empty() : Optional.of(aTMDiagnosticRequest);
	}

	public ATMDiagnosticRequestV01 setATMDiagnosticRequest(ATMDiagnosticRequest1 aTMDiagnosticRequest) {
		this.aTMDiagnosticRequest = aTMDiagnosticRequest;
		return this;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return securityTrailer == null ? Optional.empty() : Optional.of(securityTrailer);
	}

	public ATMDiagnosticRequestV01 setSecurityTrailer(ContentInformationType15 securityTrailer) {
		this.securityTrailer = securityTrailer;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caam.005.001.01")
	static public class Document {
		@XmlElement(name = "ATMDgnstcReq", required = true)
		public ATMDiagnosticRequestV01 messageBody;
	}
}