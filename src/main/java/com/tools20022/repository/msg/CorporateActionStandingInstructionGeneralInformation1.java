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
import com.tools20022.repository.area.seev.AgentCAStandingInstructionCancellationRequestV01;
import com.tools20022.repository.area.seev.AgentCAStandingInstructionRequestV01;
import com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01;
import com.tools20022.repository.choice.CorporateActionEventType2FormatChoice;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.codeset.StandingInstructionType1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.AgentCorporateActionStandingInstruction;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.SecuritiesAccount;
import com.tools20022.repository.entity.StandingSettlementInstruction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstrumentDescription3;
import com.tools20022.repository.msg.IncludedAccount1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the standing instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1#mmStandingInstructionType
 * CorporateActionStandingInstructionGeneralInformation1.
 * mmStandingInstructionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1#mmEventType
 * CorporateActionStandingInstructionGeneralInformation1.mmEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1#mmInstructingPartyIdentification
 * CorporateActionStandingInstructionGeneralInformation1.
 * mmInstructingPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1#mmClientStandingInstructionIdentification
 * CorporateActionStandingInstructionGeneralInformation1.
 * mmClientStandingInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1#mmAccountDetails
 * CorporateActionStandingInstructionGeneralInformation1.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1#mmUnderlyingSecurity
 * CorporateActionStandingInstructionGeneralInformation1.mmUnderlyingSecurity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction
 * AgentCorporateActionStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionRequestV01#mmStandingInstructionGeneralInformation
 * AgentCAStandingInstructionRequestV01.mmStandingInstructionGeneralInformation}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionCancellationRequestV01#mmStandingInstructionGeneralInformation
 * AgentCAStandingInstructionCancellationRequestV01.
 * mmStandingInstructionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01#mmStandingInstructionGeneralInformation
 * AgentCAStandingInstructionStatusAdviceV01.
 * mmStandingInstructionGeneralInformation}</li>
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
 * "CorporateActionStandingInstructionGeneralInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the standing instruction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionStandingInstructionGeneralInformation1", propOrder = {"standingInstructionType", "eventType", "instructingPartyIdentification", "clientStandingInstructionIdentification", "accountDetails",
		"underlyingSecurity"})
public class CorporateActionStandingInstructionGeneralInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StgInstrTp", required = true)
	protected StandingInstructionType1Code standingInstructionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StandingInstructionType1Code
	 * StandingInstructionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction#mmStandingInstructionType
	 * AgentCorporateActionStandingInstruction.mmStandingInstructionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1
	 * CorporateActionStandingInstructionGeneralInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgInstrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingInstructionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of standing instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionStandingInstructionGeneralInformation1, StandingInstructionType1Code> mmStandingInstructionType = new MMMessageAttribute<CorporateActionStandingInstructionGeneralInformation1, StandingInstructionType1Code>() {
		{
			businessElementTrace_lazy = () -> AgentCorporateActionStandingInstruction.mmStandingInstructionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1.mmObject();
			isDerived = false;
			xmlTag = "StgInstrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingInstructionType";
			definition = "Type of standing instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StandingInstructionType1Code.mmObject();
		}

		@Override
		public StandingInstructionType1Code getValue(CorporateActionStandingInstructionGeneralInformation1 obj) {
			return obj.getStandingInstructionType();
		}

		@Override
		public void setValue(CorporateActionStandingInstructionGeneralInformation1 obj, StandingInstructionType1Code value) {
			obj.setStandingInstructionType(value);
		}
	};
	@XmlElement(name = "EvtTp")
	protected List<CorporateActionEventType2FormatChoice> eventType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType2FormatChoice
	 * CorporateActionEventType2FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmType
	 * CorporateActionEvent.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1
	 * CorporateActionStandingInstructionGeneralInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of coporpate action event."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionStandingInstructionGeneralInformation1, List<CorporateActionEventType2FormatChoice>> mmEventType = new MMMessageAttribute<CorporateActionStandingInstructionGeneralInformation1, List<CorporateActionEventType2FormatChoice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1.mmObject();
			isDerived = false;
			xmlTag = "EvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventType";
			definition = "Type of coporpate action event.";
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionEventType2FormatChoice.mmObject();
		}

		@Override
		public List<CorporateActionEventType2FormatChoice> getValue(CorporateActionStandingInstructionGeneralInformation1 obj) {
			return obj.getEventType();
		}

		@Override
		public void setValue(CorporateActionStandingInstructionGeneralInformation1 obj, List<CorporateActionEventType2FormatChoice> value) {
			obj.setEventType(value);
		}
	};
	@XmlElement(name = "InstgPtyId", required = true)
	protected PartyIdentification2Choice instructingPartyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1
	 * CorporateActionStandingInstructionGeneralInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstgPtyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingPartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the instructing party, ie, the CSD client."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionStandingInstructionGeneralInformation1, PartyIdentification2Choice> mmInstructingPartyIdentification = new MMMessageAttribute<CorporateActionStandingInstructionGeneralInformation1, PartyIdentification2Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1.mmObject();
			isDerived = false;
			xmlTag = "InstgPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingPartyIdentification";
			definition = "Identification of the instructing party, ie, the CSD client.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		@Override
		public PartyIdentification2Choice getValue(CorporateActionStandingInstructionGeneralInformation1 obj) {
			return obj.getInstructingPartyIdentification();
		}

		@Override
		public void setValue(CorporateActionStandingInstructionGeneralInformation1 obj, PartyIdentification2Choice value) {
			obj.setInstructingPartyIdentification(value);
		}
	};
	@XmlElement(name = "ClntStgInstrId", required = true)
	protected Max35Text clientStandingInstructionIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmIdentification
	 * StandingSettlementInstruction.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1
	 * CorporateActionStandingInstructionGeneralInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntStgInstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientStandingInstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of the standing instruction assigned by the client."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionStandingInstructionGeneralInformation1, Max35Text> mmClientStandingInstructionIdentification = new MMMessageAttribute<CorporateActionStandingInstructionGeneralInformation1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> StandingSettlementInstruction.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1.mmObject();
			isDerived = false;
			xmlTag = "ClntStgInstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientStandingInstructionIdentification";
			definition = "Reference of the standing instruction assigned by the client.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CorporateActionStandingInstructionGeneralInformation1 obj) {
			return obj.getClientStandingInstructionIdentification();
		}

		@Override
		public void setValue(CorporateActionStandingInstructionGeneralInformation1 obj, Max35Text value) {
			obj.setClientStandingInstructionIdentification(value);
		}
	};
	@XmlElement(name = "AcctDtls")
	protected List<IncludedAccount1> accountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IncludedAccount1
	 * IncludedAccount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1
	 * CorporateActionStandingInstructionGeneralInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the account to which the standing instruction can apply."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionStandingInstructionGeneralInformation1, List<IncludedAccount1>> mmAccountDetails = new MMMessageAssociationEnd<CorporateActionStandingInstructionGeneralInformation1, List<IncludedAccount1>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1.mmObject();
			isDerived = false;
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "Provides information about the account to which the standing instruction can apply.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IncludedAccount1.mmObject();
		}

		@Override
		public List<IncludedAccount1> getValue(CorporateActionStandingInstructionGeneralInformation1 obj) {
			return obj.getAccountDetails();
		}

		@Override
		public void setValue(CorporateActionStandingInstructionGeneralInformation1 obj, List<IncludedAccount1> value) {
			obj.setAccountDetails(value);
		}
	};
	@XmlElement(name = "UndrlygScty")
	protected FinancialInstrumentDescription3 underlyingSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDescription3
	 * FinancialInstrumentDescription3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmUnderlyingSecurity
	 * CorporateActionEvent.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1
	 * CorporateActionStandingInstructionGeneralInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygScty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the underlying financial instrument, ie, the financial instrument affected by the corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionStandingInstructionGeneralInformation1, Optional<FinancialInstrumentDescription3>> mmUnderlyingSecurity = new MMMessageAttribute<CorporateActionStandingInstructionGeneralInformation1, Optional<FinancialInstrumentDescription3>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmUnderlyingSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1.mmObject();
			isDerived = false;
			xmlTag = "UndrlygScty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingSecurity";
			definition = "Identification of the underlying financial instrument, ie, the financial instrument affected by the corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentDescription3.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentDescription3> getValue(CorporateActionStandingInstructionGeneralInformation1 obj) {
			return obj.getUnderlyingSecurity();
		}

		@Override
		public void setValue(CorporateActionStandingInstructionGeneralInformation1 obj, Optional<FinancialInstrumentDescription3> value) {
			obj.setUnderlyingSecurity(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1.mmStandingInstructionType,
						com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1.mmEventType, com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1.mmInstructingPartyIdentification,
						com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1.mmClientStandingInstructionIdentification,
						com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1.mmAccountDetails, com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1.mmUnderlyingSecurity);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCAStandingInstructionRequestV01.mmStandingInstructionGeneralInformation, AgentCAStandingInstructionCancellationRequestV01.mmStandingInstructionGeneralInformation,
						AgentCAStandingInstructionStatusAdviceV01.mmStandingInstructionGeneralInformation);
				trace_lazy = () -> AgentCorporateActionStandingInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionStandingInstructionGeneralInformation1";
				definition = "Provides information about the standing instruction.";
			}
		});
		return mmObject_lazy.get();
	}

	public StandingInstructionType1Code getStandingInstructionType() {
		return standingInstructionType;
	}

	public CorporateActionStandingInstructionGeneralInformation1 setStandingInstructionType(StandingInstructionType1Code standingInstructionType) {
		this.standingInstructionType = Objects.requireNonNull(standingInstructionType);
		return this;
	}

	public List<CorporateActionEventType2FormatChoice> getEventType() {
		return eventType == null ? eventType = new ArrayList<>() : eventType;
	}

	public CorporateActionStandingInstructionGeneralInformation1 setEventType(List<CorporateActionEventType2FormatChoice> eventType) {
		this.eventType = Objects.requireNonNull(eventType);
		return this;
	}

	public PartyIdentification2Choice getInstructingPartyIdentification() {
		return instructingPartyIdentification;
	}

	public CorporateActionStandingInstructionGeneralInformation1 setInstructingPartyIdentification(PartyIdentification2Choice instructingPartyIdentification) {
		this.instructingPartyIdentification = Objects.requireNonNull(instructingPartyIdentification);
		return this;
	}

	public Max35Text getClientStandingInstructionIdentification() {
		return clientStandingInstructionIdentification;
	}

	public CorporateActionStandingInstructionGeneralInformation1 setClientStandingInstructionIdentification(Max35Text clientStandingInstructionIdentification) {
		this.clientStandingInstructionIdentification = Objects.requireNonNull(clientStandingInstructionIdentification);
		return this;
	}

	public List<IncludedAccount1> getAccountDetails() {
		return accountDetails == null ? accountDetails = new ArrayList<>() : accountDetails;
	}

	public CorporateActionStandingInstructionGeneralInformation1 setAccountDetails(List<IncludedAccount1> accountDetails) {
		this.accountDetails = Objects.requireNonNull(accountDetails);
		return this;
	}

	public Optional<FinancialInstrumentDescription3> getUnderlyingSecurity() {
		return underlyingSecurity == null ? Optional.empty() : Optional.of(underlyingSecurity);
	}

	public CorporateActionStandingInstructionGeneralInformation1 setUnderlyingSecurity(FinancialInstrumentDescription3 underlyingSecurity) {
		this.underlyingSecurity = underlyingSecurity;
		return this;
	}
}