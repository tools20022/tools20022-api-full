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

package com.tools20022.repository.area.tsrv;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TradeServicesLatestVersion;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.msg.Amendment3;
import com.tools20022.repository.msg.PartyAndSignature2;
import com.tools20022.repository.msgset.DemandGuaranteesandStandbyLettersofCreditISOLatestversion;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * The UndertakingAmendmentRequest message is sent by the party that requested
 * issuance of the undertaking (applicant or obligor) to the party that issued
 * the undertaking to request issuance of a proposed amendment to the
 * undertaking. The undertaking could be a demand guarantee, standby letter of
 * credit, counter-undertaking (counter-guarantee or counter-standby), or
 * suretyship undertaking. The message provides details on proposed changes to
 * the undertaking, for example, to the expiry date, amount, and/or terms and
 * conditions. It may also be used to request termination or cancellation of the
 * undertaking.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentRequestV01#mmUndertakingAmendmentRequestDetails
 * UndertakingAmendmentRequestV01.mmUndertakingAmendmentRequestDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentRequestV01#mmInstructionsToBank
 * UndertakingAmendmentRequestV01.mmInstructionsToBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentRequestV01#mmDigitalSignature
 * UndertakingAmendmentRequestV01.mmDigitalSignature}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.DemandGuaranteesandStandbyLettersofCreditISOLatestversion
 * DemandGuaranteesandStandbyLettersofCreditISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "UdrtkgAmdmntReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesLatestVersion
 * TradeServicesLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsrv.004.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UndertakingAmendmentRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The UndertakingAmendmentRequest message is sent by the party that requested issuance of the undertaking (applicant or obligor) to the party that issued the undertaking to request issuance of a proposed amendment to the undertaking. The undertaking could be a demand guarantee, standby letter of credit, counter-undertaking (counter-guarantee or counter-standby), or suretyship undertaking. The message provides details on proposed changes to the undertaking, for example, to the expiry date, amount, and/or terms and conditions. It may also be used to request termination or cancellation of the undertaking."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UndertakingAmendmentRequestV01", propOrder = {"undertakingAmendmentRequestDetails", "instructionsToBank", "digitalSignature"})
public class UndertakingAmendmentRequestV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UdrtkgAmdmntReqDtls", required = true)
	protected Amendment3 undertakingAmendmentRequestDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Amendment3
	 * Amendment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UdrtkgAmdmntReqDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingAmendmentRequestDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the request for an amendment of an undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<UndertakingAmendmentRequestV01, Amendment3> mmUndertakingAmendmentRequestDetails = new MMMessageBuildingBlock<UndertakingAmendmentRequestV01, Amendment3>() {
		{
			xmlTag = "UdrtkgAmdmntReqDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingAmendmentRequestDetails";
			definition = "Details related to the request for an amendment of an undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Amendment3.mmObject();
		}

		@Override
		public Amendment3 getValue(UndertakingAmendmentRequestV01 obj) {
			return obj.getUndertakingAmendmentRequestDetails();
		}

		@Override
		public void setValue(UndertakingAmendmentRequestV01 obj, Amendment3 value) {
			obj.setUndertakingAmendmentRequestDetails(value);
		}
	};
	@XmlElement(name = "InstrsToBk")
	protected List<Max2000Text> instructionsToBank;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrsToBk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionsToBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instructions specific to the bank receiving the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<UndertakingAmendmentRequestV01, List<Max2000Text>> mmInstructionsToBank = new MMMessageBuildingBlock<UndertakingAmendmentRequestV01, List<Max2000Text>>() {
		{
			xmlTag = "InstrsToBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionsToBank";
			definition = "Instructions specific to the bank receiving the message.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		@Override
		public List<Max2000Text> getValue(UndertakingAmendmentRequestV01 obj) {
			return obj.getInstructionsToBank();
		}

		@Override
		public void setValue(UndertakingAmendmentRequestV01 obj, List<Max2000Text> value) {
			obj.setInstructionsToBank(value);
		}
	};
	@XmlElement(name = "DgtlSgntr")
	protected PartyAndSignature2 digitalSignature;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndSignature2
	 * PartyAndSignature2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgtlSgntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigitalSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Digital signature of the undertaking amendment request."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<UndertakingAmendmentRequestV01, Optional<PartyAndSignature2>> mmDigitalSignature = new MMMessageBuildingBlock<UndertakingAmendmentRequestV01, Optional<PartyAndSignature2>>() {
		{
			xmlTag = "DgtlSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalSignature";
			definition = "Digital signature of the undertaking amendment request.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyAndSignature2.mmObject();
		}

		@Override
		public Optional<PartyAndSignature2> getValue(UndertakingAmendmentRequestV01 obj) {
			return obj.getDigitalSignature();
		}

		@Override
		public void setValue(UndertakingAmendmentRequestV01 obj, Optional<PartyAndSignature2> value) {
			obj.setDigitalSignature(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingAmendmentRequestV01";
				definition = "The UndertakingAmendmentRequest message is sent by the party that requested issuance of the undertaking (applicant or obligor) to the party that issued the undertaking to request issuance of a proposed amendment to the undertaking. The undertaking could be a demand guarantee, standby letter of credit, counter-undertaking (counter-guarantee or counter-standby), or suretyship undertaking. The message provides details on proposed changes to the undertaking, for example, to the expiry date, amount, and/or terms and conditions. It may also be used to request termination or cancellation of the undertaking.";
				messageSet_lazy = () -> Arrays.asList(DemandGuaranteesandStandbyLettersofCreditISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "UdrtkgAmdmntReq";
				businessArea_lazy = () -> TradeServicesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsrv.UndertakingAmendmentRequestV01.mmUndertakingAmendmentRequestDetails,
						com.tools20022.repository.area.tsrv.UndertakingAmendmentRequestV01.mmInstructionsToBank, com.tools20022.repository.area.tsrv.UndertakingAmendmentRequestV01.mmDigitalSignature);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsrv";
						messageFunctionality = "004";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return UndertakingAmendmentRequestV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Amendment3 getUndertakingAmendmentRequestDetails() {
		return undertakingAmendmentRequestDetails;
	}

	public UndertakingAmendmentRequestV01 setUndertakingAmendmentRequestDetails(Amendment3 undertakingAmendmentRequestDetails) {
		this.undertakingAmendmentRequestDetails = Objects.requireNonNull(undertakingAmendmentRequestDetails);
		return this;
	}

	public List<Max2000Text> getInstructionsToBank() {
		return instructionsToBank == null ? instructionsToBank = new ArrayList<>() : instructionsToBank;
	}

	public UndertakingAmendmentRequestV01 setInstructionsToBank(List<Max2000Text> instructionsToBank) {
		this.instructionsToBank = Objects.requireNonNull(instructionsToBank);
		return this;
	}

	public Optional<PartyAndSignature2> getDigitalSignature() {
		return digitalSignature == null ? Optional.empty() : Optional.of(digitalSignature);
	}

	public UndertakingAmendmentRequestV01 setDigitalSignature(PartyAndSignature2 digitalSignature) {
		this.digitalSignature = digitalSignature;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsrv.004.001.01")
	static public class Document {
		@XmlElement(name = "UdrtkgAmdmntReq", required = true)
		public UndertakingAmendmentRequestV01 messageBody;
	}
}