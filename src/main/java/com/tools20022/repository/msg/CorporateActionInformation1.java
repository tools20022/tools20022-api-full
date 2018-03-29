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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.choice.CorporateActionEventProcessingType1FormatChoice;
import com.tools20022.repository.choice.CorporateActionEventType2FormatChoice;
import com.tools20022.repository.choice.CorporateActionMandatoryVoluntary1FormatChoice;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.CorporateActionEventRegistration;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstrumentDescription3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * General information about the corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1#mmAgentIdentification
 * CorporateActionInformation1.mmAgentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1#mmIssuerCorporateActionIdentification
 * CorporateActionInformation1.mmIssuerCorporateActionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1#mmCorporateActionProcessingIdentification
 * CorporateActionInformation1.mmCorporateActionProcessingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1#mmEventType
 * CorporateActionInformation1.mmEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1#mmMandatoryVoluntaryEventType
 * CorporateActionInformation1.mmMandatoryVoluntaryEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1#mmEventProcessingType
 * CorporateActionInformation1.mmEventProcessingType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1#mmUnderlyingSecurity
 * CorporateActionInformation1.mmUnderlyingSecurity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAdviceV01#mmCorporateActionGeneralInformation
 * AgentCAElectionAdviceV01.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAmendmentRequestV01#mmCorporateActionGeneralInformation
 * AgentCAElectionAmendmentRequestV01.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionCancellationRequestV01#mmCorporateActionGeneralInformation
 * AgentCAElectionCancellationRequestV01.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#mmCorporateActionGeneralInformation
 * AgentCAElectionStatusAdviceV01.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADistributionBreakdownAdviceV01#mmCorporateActionGeneralInformation
 * AgentCADistributionBreakdownAdviceV01.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAGlobalDistributionAuthorisationRequestV01#mmCorporateActionGeneralInformation
 * AgentCAGlobalDistributionAuthorisationRequestV01.
 * mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01#mmCorporateActionGeneralInformation
 * AgentCAGlobalDistributionStatusAdviceV01.mmCorporateActionGeneralInformation}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementInstructionV01#mmCorporateActionGeneralInformation
 * AgentCAMovementInstructionV01.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementCancellationRequestV01#mmCorporateActionGeneralInformation
 * AgentCAMovementCancellationRequestV01.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01#mmCorporateActionGeneralInformation
 * AgentCAMovementConfirmationV01.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#mmCorporateActionGeneralInformation
 * AgentCAMovementStatusAdviceV01.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationAdviceV01#mmCorporateActionGeneralInformation
 * AgentCAInformationAdviceV01.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationInstructionV01#mmCorporateActionGeneralInformation
 * AgentCADeactivationInstructionV01.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationCancellationRequestV01#mmCorporateActionGeneralInformation
 * AgentCADeactivationCancellationRequestV01.mmCorporateActionGeneralInformation
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01#mmCorporateActionGeneralInformation
 * AgentCADeactivationStatusAdviceV01.mmCorporateActionGeneralInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateActionIdentificationRule#forCorporateActionInformation1
 * ConstraintCorporateActionIdentificationRule.forCorporateActionInformation1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "General information about the corporate action event."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionInformation1", propOrder = {"agentIdentification", "issuerCorporateActionIdentification", "corporateActionProcessingIdentification", "eventType", "mandatoryVoluntaryEventType", "eventProcessingType",
		"underlyingSecurity"})
public class CorporateActionInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AgtId", required = true)
	protected PartyIdentification2Choice agentIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1
	 * CorporateActionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the issuer agent."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInformation1, PartyIdentification2Choice> mmAgentIdentification = new MMMessageAttribute<CorporateActionInformation1, PartyIdentification2Choice>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInformation1.mmObject();
			isDerived = false;
			xmlTag = "AgtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentIdentification";
			definition = "Identification of the issuer agent.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		@Override
		public PartyIdentification2Choice getValue(CorporateActionInformation1 obj) {
			return obj.getAgentIdentification();
		}

		@Override
		public void setValue(CorporateActionInformation1 obj, PartyIdentification2Choice value) {
			obj.setAgentIdentification(value);
		}
	};
	@XmlElement(name = "IssrCorpActnId")
	protected Max35Text issuerCorporateActionIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmCorporateActionEventIdentification
	 * CorporateActionEventRegistration.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1
	 * CorporateActionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrCorpActnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerCorporateActionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference given to the event by the CA event issuer (agent)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInformation1, Optional<Max35Text>> mmIssuerCorporateActionIdentification = new MMMessageAttribute<CorporateActionInformation1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEventRegistration.mmCorporateActionEventIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInformation1.mmObject();
			isDerived = false;
			xmlTag = "IssrCorpActnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerCorporateActionIdentification";
			definition = "Reference given to the event by the CA event issuer (agent).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CorporateActionInformation1 obj) {
			return obj.getIssuerCorporateActionIdentification();
		}

		@Override
		public void setValue(CorporateActionInformation1 obj, Optional<Max35Text> value) {
			obj.setIssuerCorporateActionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActnPrcgId")
	protected Max35Text corporateActionProcessingIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmCorporateActionEventIdentification
	 * CorporateActionEventRegistration.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1
	 * CorporateActionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnPrcgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionProcessingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned by the account servicer to unambiguously identify a corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInformation1, Optional<Max35Text>> mmCorporateActionProcessingIdentification = new MMMessageAttribute<CorporateActionInformation1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEventRegistration.mmCorporateActionEventIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInformation1.mmObject();
			isDerived = false;
			xmlTag = "CorpActnPrcgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionProcessingIdentification";
			definition = "Reference assigned by the account servicer to unambiguously identify a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CorporateActionInformation1 obj) {
			return obj.getCorporateActionProcessingIdentification();
		}

		@Override
		public void setValue(CorporateActionInformation1 obj, Optional<Max35Text> value) {
			obj.setCorporateActionProcessingIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "EvtTp", required = true)
	protected CorporateActionEventType2FormatChoice eventType;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1
	 * CorporateActionInformation1}</li>
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
	 * definition} = "Type of corporate action event."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInformation1, CorporateActionEventType2FormatChoice> mmEventType = new MMMessageAttribute<CorporateActionInformation1, CorporateActionEventType2FormatChoice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInformation1.mmObject();
			isDerived = false;
			xmlTag = "EvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventType";
			definition = "Type of corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionEventType2FormatChoice.mmObject();
		}

		@Override
		public CorporateActionEventType2FormatChoice getValue(CorporateActionInformation1 obj) {
			return obj.getEventType();
		}

		@Override
		public void setValue(CorporateActionInformation1 obj, CorporateActionEventType2FormatChoice value) {
			obj.setEventType(value);
		}
	};
	@XmlElement(name = "MndtryVlntryEvtTp", required = true)
	protected CorporateActionMandatoryVoluntary1FormatChoice mandatoryVoluntaryEventType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionMandatoryVoluntary1FormatChoice
	 * CorporateActionMandatoryVoluntary1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmMandatoryVoluntaryEventType
	 * CorporateActionEvent.mmMandatoryVoluntaryEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1
	 * CorporateActionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MndtryVlntryEvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatoryVoluntaryEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the event is mandatory, mandatory with options or voluntary."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInformation1, CorporateActionMandatoryVoluntary1FormatChoice> mmMandatoryVoluntaryEventType = new MMMessageAttribute<CorporateActionInformation1, CorporateActionMandatoryVoluntary1FormatChoice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmMandatoryVoluntaryEventType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInformation1.mmObject();
			isDerived = false;
			xmlTag = "MndtryVlntryEvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandatoryVoluntaryEventType";
			definition = "Specifies whether the event is mandatory, mandatory with options or voluntary.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionMandatoryVoluntary1FormatChoice.mmObject();
		}

		@Override
		public CorporateActionMandatoryVoluntary1FormatChoice getValue(CorporateActionInformation1 obj) {
			return obj.getMandatoryVoluntaryEventType();
		}

		@Override
		public void setValue(CorporateActionInformation1 obj, CorporateActionMandatoryVoluntary1FormatChoice value) {
			obj.setMandatoryVoluntaryEventType(value);
		}
	};
	@XmlElement(name = "EvtPrcgTp")
	protected CorporateActionEventProcessingType1FormatChoice eventProcessingType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingType1FormatChoice
	 * CorporateActionEventProcessingType1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmEventProcessingType
	 * CorporateActionEvent.mmEventProcessingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1
	 * CorporateActionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtPrcgTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventProcessingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of processing involved by a Corporate Action."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInformation1, Optional<CorporateActionEventProcessingType1FormatChoice>> mmEventProcessingType = new MMMessageAttribute<CorporateActionInformation1, Optional<CorporateActionEventProcessingType1FormatChoice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmEventProcessingType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInformation1.mmObject();
			isDerived = false;
			xmlTag = "EvtPrcgTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventProcessingType";
			definition = "Type of processing involved by a Corporate Action.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionEventProcessingType1FormatChoice.mmObject();
		}

		@Override
		public Optional<CorporateActionEventProcessingType1FormatChoice> getValue(CorporateActionInformation1 obj) {
			return obj.getEventProcessingType();
		}

		@Override
		public void setValue(CorporateActionInformation1 obj, Optional<CorporateActionEventProcessingType1FormatChoice> value) {
			obj.setEventProcessingType(value.orElse(null));
		}
	};
	@XmlElement(name = "UndrlygScty", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1
	 * CorporateActionInformation1}</li>
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
	public static final MMMessageAttribute<CorporateActionInformation1, FinancialInstrumentDescription3> mmUnderlyingSecurity = new MMMessageAttribute<CorporateActionInformation1, FinancialInstrumentDescription3>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmUnderlyingSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInformation1.mmObject();
			isDerived = false;
			xmlTag = "UndrlygScty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingSecurity";
			definition = "Identification of the underlying financial instrument, ie, the financial instrument affected by the corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentDescription3.mmObject();
		}

		@Override
		public FinancialInstrumentDescription3 getValue(CorporateActionInformation1 obj) {
			return obj.getUnderlyingSecurity();
		}

		@Override
		public void setValue(CorporateActionInformation1 obj, FinancialInstrumentDescription3 value) {
			obj.setUnderlyingSecurity(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionInformation1.mmAgentIdentification, com.tools20022.repository.msg.CorporateActionInformation1.mmIssuerCorporateActionIdentification,
						com.tools20022.repository.msg.CorporateActionInformation1.mmCorporateActionProcessingIdentification, com.tools20022.repository.msg.CorporateActionInformation1.mmEventType,
						com.tools20022.repository.msg.CorporateActionInformation1.mmMandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionInformation1.mmEventProcessingType,
						com.tools20022.repository.msg.CorporateActionInformation1.mmUnderlyingSecurity);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCAElectionAdviceV01.mmCorporateActionGeneralInformation, AgentCAElectionAmendmentRequestV01.mmCorporateActionGeneralInformation,
						AgentCAElectionCancellationRequestV01.mmCorporateActionGeneralInformation, AgentCAElectionStatusAdviceV01.mmCorporateActionGeneralInformation,
						AgentCADistributionBreakdownAdviceV01.mmCorporateActionGeneralInformation, AgentCAGlobalDistributionAuthorisationRequestV01.mmCorporateActionGeneralInformation,
						AgentCAGlobalDistributionStatusAdviceV01.mmCorporateActionGeneralInformation, AgentCAMovementInstructionV01.mmCorporateActionGeneralInformation,
						AgentCAMovementCancellationRequestV01.mmCorporateActionGeneralInformation, AgentCAMovementConfirmationV01.mmCorporateActionGeneralInformation, AgentCAMovementStatusAdviceV01.mmCorporateActionGeneralInformation,
						AgentCAInformationAdviceV01.mmCorporateActionGeneralInformation, AgentCADeactivationInstructionV01.mmCorporateActionGeneralInformation, AgentCADeactivationCancellationRequestV01.mmCorporateActionGeneralInformation,
						AgentCADeactivationStatusAdviceV01.mmCorporateActionGeneralInformation);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCorporateActionIdentificationRule.forCorporateActionInformation1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionInformation1";
				definition = "General information about the corporate action event.";
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification2Choice getAgentIdentification() {
		return agentIdentification;
	}

	public CorporateActionInformation1 setAgentIdentification(PartyIdentification2Choice agentIdentification) {
		this.agentIdentification = Objects.requireNonNull(agentIdentification);
		return this;
	}

	public Optional<Max35Text> getIssuerCorporateActionIdentification() {
		return issuerCorporateActionIdentification == null ? Optional.empty() : Optional.of(issuerCorporateActionIdentification);
	}

	public CorporateActionInformation1 setIssuerCorporateActionIdentification(Max35Text issuerCorporateActionIdentification) {
		this.issuerCorporateActionIdentification = issuerCorporateActionIdentification;
		return this;
	}

	public Optional<Max35Text> getCorporateActionProcessingIdentification() {
		return corporateActionProcessingIdentification == null ? Optional.empty() : Optional.of(corporateActionProcessingIdentification);
	}

	public CorporateActionInformation1 setCorporateActionProcessingIdentification(Max35Text corporateActionProcessingIdentification) {
		this.corporateActionProcessingIdentification = corporateActionProcessingIdentification;
		return this;
	}

	public CorporateActionEventType2FormatChoice getEventType() {
		return eventType;
	}

	public CorporateActionInformation1 setEventType(CorporateActionEventType2FormatChoice eventType) {
		this.eventType = Objects.requireNonNull(eventType);
		return this;
	}

	public CorporateActionMandatoryVoluntary1FormatChoice getMandatoryVoluntaryEventType() {
		return mandatoryVoluntaryEventType;
	}

	public CorporateActionInformation1 setMandatoryVoluntaryEventType(CorporateActionMandatoryVoluntary1FormatChoice mandatoryVoluntaryEventType) {
		this.mandatoryVoluntaryEventType = Objects.requireNonNull(mandatoryVoluntaryEventType);
		return this;
	}

	public Optional<CorporateActionEventProcessingType1FormatChoice> getEventProcessingType() {
		return eventProcessingType == null ? Optional.empty() : Optional.of(eventProcessingType);
	}

	public CorporateActionInformation1 setEventProcessingType(CorporateActionEventProcessingType1FormatChoice eventProcessingType) {
		this.eventProcessingType = eventProcessingType;
		return this;
	}

	public FinancialInstrumentDescription3 getUnderlyingSecurity() {
		return underlyingSecurity;
	}

	public CorporateActionInformation1 setUnderlyingSecurity(FinancialInstrumentDescription3 underlyingSecurity) {
		this.underlyingSecurity = Objects.requireNonNull(underlyingSecurity);
		return this;
	}
}