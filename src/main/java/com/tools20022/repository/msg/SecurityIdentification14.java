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
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV02;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03;
import com.tools20022.repository.datatype.ISINIdentifier;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.SecuritiesIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of a security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14#mmISIN
 * SecurityIdentification14.mmISIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14#mmOtherIdentification
 * SecurityIdentification14.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14#mmDescription
 * SecurityIdentification14.mmDescription}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
 * SecuritiesIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV02#mmFinancialInstrumentIdentification
 * IntraPositionMovementConfirmationV02.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV03#mmFinancialInstrumentIdentification
 * IntraPositionMovementConfirmationV03.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV04#mmFinancialInstrumentIdentification
 * IntraPositionMovementConfirmationV04.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV02#mmFinancialInstrumentIdentification
 * SecuritiesFinancingConfirmationV02.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV03#mmFinancialInstrumentIdentification
 * SecuritiesFinancingConfirmationV03.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmFinancialInstrumentIdentification
 * SecuritiesFinancingConfirmationV04.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV02#mmFinancialInstrumentIdentification
 * SecuritiesFinancingInstructionV02.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV03#mmFinancialInstrumentIdentification
 * SecuritiesFinancingInstructionV03.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV02#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionConfirmationV02.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV03#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionConfirmationV03.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV04#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionConfirmationV04.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV02#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionGenerationNotificationV02.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV03#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionGenerationNotificationV03.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV04#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionGenerationNotificationV04.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV02#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionInstructionV02.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV03#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionInstructionV03.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionInstructionV04.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmFinancialInstrumentIdentification
 * SecuritiesTradeConfirmationV01.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV04#mmFinancialInstrumentIdentification
 * SecuritiesFinancingInstructionV04.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV02#mmFinancialInstrumentIdentification
 * SecuritiesTradeConfirmationV02.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV02#mmFinancialInstrumentIdentification
 * IntraPositionMovementInstructionV02.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV02#mmFinancialInstrumentIdentification
 * SecuritiesFinancingModificationInstructionV02.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV02#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionAllegementNotificationV02.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV02#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionReversalAdviceV02.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNarrativeV03#mmUnderlyingSecurity
 * CorporateActionNarrativeV03.mmUnderlyingSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV03#mmFinancialInstrumentIdentification
 * SecuritiesFinancingModificationInstructionV03.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV03#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionAllegementNotificationV03.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionReversalAdviceV03.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV03#mmFinancialInstrumentIdentification
 * IntraPositionMovementInstructionV03.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV04#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionAllegementNotificationV04.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmFinancialInstrumentIdentification
 * SecuritiesFinancingConfirmationV05.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionGenerationNotificationV05.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionReversalAdviceV04.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV05#mmFinancialInstrumentIdentification
 * SecuritiesFinancingInstructionV05.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionInstructionV05.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV05#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionConfirmationV05.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04#mmFinancialInstrumentIdentification
 * SecuritiesFinancingModificationInstructionV04.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmFinancialInstrumentIdentification
 * SecuritiesTradeConfirmationV03.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV05#mmFinancialInstrumentIdentification
 * MeetingInstructionCancellationRequestV05.mmFinancialInstrumentIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV05#mmFinancialInstrumentIdentification
 * MeetingInstructionStatusV05.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV05#mmFinancialInstrumentIdentification
 * MeetingVoteExecutionConfirmationV05.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionV05#mmFinancialInstrumentIdentification
 * MeetingInstructionV05.mmFinancialInstrumentIdentification}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintDescriptionPresenceRule#forSecurityIdentification14
 * ConstraintDescriptionPresenceRule.forSecurityIdentification14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherIdentificationPresenceRule#forSecurityIdentification14
 * ConstraintOtherIdentificationPresenceRule.forSecurityIdentification14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintISINPresenceRule#forSecurityIdentification14
 * ConstraintISINPresenceRule.forSecurityIdentification14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDescriptionUsageRule#forSecurityIdentification14
 * ConstraintDescriptionUsageRule.forSecurityIdentification14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintISINGuideline#forSecurityIdentification14
 * ConstraintISINGuideline.forSecurityIdentification14}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityIdentification14"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of a security."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification19
 * SecurityIdentification19}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityIdentification14", propOrder = {"iSIN", "otherIdentification", "description"})
public class SecurityIdentification14 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ISIN")
	protected ISINIdentifier iSIN;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISINIdentifier
	 * ISINIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSecurityIdentification
	 * SecuritiesIdentification.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ISIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "International Securities Identification Number (ISIN). A numbering system designed by the United Nation's International Organisation for Standardisation (ISO). The ISIN is composed of a 2-character prefix representing the country of issue, followed by the national security number (if one exists), and a check digit. Each country has a national numbering agency that assigns ISIN numbers for securities in that country."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19#mmISIN
	 * SecurityIdentification19.mmISIN}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmISIN = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSecurityIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityIdentification14.mmObject();
			isDerived = false;
			xmlTag = "ISIN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISIN";
			definition = "International Securities Identification Number (ISIN). A numbering system designed by the United Nation's International Organisation for Standardisation (ISO). The ISIN is composed of a 2-character prefix representing the country of issue, followed by the national security number (if one exists), and a check digit. Each country has a national numbering agency that assigns ISIN numbers for securities in that country.";
			nextVersions_lazy = () -> Arrays.asList(SecurityIdentification19.mmISIN);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISINIdentifier.mmObject();
		}
	};
	@XmlElement(name = "OthrId")
	protected List<com.tools20022.repository.msg.OtherIdentification1> otherIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherIdentification1
	 * OtherIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a security by proprietary or domestic identification scheme."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19#mmOtherIdentification
	 * SecurityIdentification19.mmOtherIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherIdentification = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityIdentification14.mmObject();
			isDerived = false;
			xmlTag = "OthrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherIdentification";
			definition = "Identification of a security by proprietary or domestic identification scheme.";
			nextVersions_lazy = () -> Arrays.asList(SecurityIdentification19.mmOtherIdentification);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OtherIdentification1.mmObject();
		}
	};
	@XmlElement(name = "Desc")
	protected Max140Text description;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Textual description of a security instrument."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19#mmDescription
	 * SecurityIdentification19.mmDescription}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDescription = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityIdentification14.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Textual description of a security instrument.";
			nextVersions_lazy = () -> Arrays.asList(SecurityIdentification19.mmDescription);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityIdentification14.mmISIN, com.tools20022.repository.msg.SecurityIdentification14.mmOtherIdentification,
						com.tools20022.repository.msg.SecurityIdentification14.mmDescription);
				messageBuildingBlock_lazy = () -> Arrays.asList(IntraPositionMovementConfirmationV02.mmFinancialInstrumentIdentification, IntraPositionMovementConfirmationV03.mmFinancialInstrumentIdentification,
						IntraPositionMovementConfirmationV04.mmFinancialInstrumentIdentification, SecuritiesFinancingConfirmationV02.mmFinancialInstrumentIdentification,
						SecuritiesFinancingConfirmationV03.mmFinancialInstrumentIdentification, SecuritiesFinancingConfirmationV04.mmFinancialInstrumentIdentification, SecuritiesFinancingInstructionV02.mmFinancialInstrumentIdentification,
						SecuritiesFinancingInstructionV03.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionConfirmationV02.mmFinancialInstrumentIdentification,
						SecuritiesSettlementTransactionConfirmationV03.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionConfirmationV04.mmFinancialInstrumentIdentification,
						SecuritiesSettlementTransactionGenerationNotificationV02.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionGenerationNotificationV03.mmFinancialInstrumentIdentification,
						SecuritiesSettlementTransactionGenerationNotificationV04.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionInstructionV02.mmFinancialInstrumentIdentification,
						SecuritiesSettlementTransactionInstructionV03.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionInstructionV04.mmFinancialInstrumentIdentification,
						SecuritiesTradeConfirmationV01.mmFinancialInstrumentIdentification, SecuritiesFinancingInstructionV04.mmFinancialInstrumentIdentification, SecuritiesTradeConfirmationV02.mmFinancialInstrumentIdentification,
						IntraPositionMovementInstructionV02.mmFinancialInstrumentIdentification, SecuritiesFinancingModificationInstructionV02.mmFinancialInstrumentIdentification,
						SecuritiesSettlementTransactionAllegementNotificationV02.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionReversalAdviceV02.mmFinancialInstrumentIdentification,
						CorporateActionNarrativeV03.mmUnderlyingSecurity, SecuritiesFinancingModificationInstructionV03.mmFinancialInstrumentIdentification,
						SecuritiesSettlementTransactionAllegementNotificationV03.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionReversalAdviceV03.mmFinancialInstrumentIdentification,
						IntraPositionMovementInstructionV03.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionAllegementNotificationV04.mmFinancialInstrumentIdentification,
						SecuritiesFinancingConfirmationV05.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionGenerationNotificationV05.mmFinancialInstrumentIdentification,
						SecuritiesSettlementTransactionReversalAdviceV04.mmFinancialInstrumentIdentification, SecuritiesFinancingInstructionV05.mmFinancialInstrumentIdentification,
						SecuritiesSettlementTransactionInstructionV05.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionConfirmationV05.mmFinancialInstrumentIdentification,
						SecuritiesFinancingModificationInstructionV04.mmFinancialInstrumentIdentification, SecuritiesTradeConfirmationV03.mmFinancialInstrumentIdentification,
						MeetingInstructionCancellationRequestV05.mmFinancialInstrumentIdentification, MeetingInstructionStatusV05.mmFinancialInstrumentIdentification, MeetingVoteExecutionConfirmationV05.mmFinancialInstrumentIdentification,
						MeetingInstructionV05.mmFinancialInstrumentIdentification);
				trace_lazy = () -> SecuritiesIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDescriptionPresenceRule.forSecurityIdentification14,
						com.tools20022.repository.constraints.ConstraintOtherIdentificationPresenceRule.forSecurityIdentification14, com.tools20022.repository.constraints.ConstraintISINPresenceRule.forSecurityIdentification14,
						com.tools20022.repository.constraints.ConstraintDescriptionUsageRule.forSecurityIdentification14, com.tools20022.repository.constraints.ConstraintISINGuideline.forSecurityIdentification14);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecurityIdentification14";
				definition = "Identification of a security.";
				nextVersions_lazy = () -> Arrays.asList(SecurityIdentification19.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISINIdentifier> getISIN() {
		return iSIN == null ? Optional.empty() : Optional.of(iSIN);
	}

	public SecurityIdentification14 setISIN(ISINIdentifier iSIN) {
		this.iSIN = iSIN;
		return this;
	}

	public List<OtherIdentification1> getOtherIdentification() {
		return otherIdentification == null ? otherIdentification = new ArrayList<>() : otherIdentification;
	}

	public SecurityIdentification14 setOtherIdentification(List<com.tools20022.repository.msg.OtherIdentification1> otherIdentification) {
		this.otherIdentification = Objects.requireNonNull(otherIdentification);
		return this;
	}

	public Optional<Max140Text> getDescription() {
		return description == null ? Optional.empty() : Optional.of(description);
	}

	public SecurityIdentification14 setDescription(Max140Text description) {
		this.description = description;
		return this;
	}
}