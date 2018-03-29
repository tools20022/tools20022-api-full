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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.entity.OrganisationIdentification;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification19;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of identification of a party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification36Choice#mmAnyBIC
 * PartyIdentification36Choice.mmAnyBIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification36Choice#mmProprietaryIdentification
 * PartyIdentification36Choice.mmProprietaryIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV01#mmAccountOwner
 * SecuritiesSettlementTransactionAuditTrailReportV01.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV02#mmAccountOwner
 * IntraPositionMovementConfirmationV02.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV03#mmAccountOwner
 * IntraPositionMovementConfirmationV03.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV04#mmAccountOwner
 * IntraPositionMovementConfirmationV04.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV02#mmAccountOwner
 * IntraPositionMovementPostingReportV02.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV03#mmAccountOwner
 * IntraPositionMovementPostingReportV03.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV04#mmAccountOwner
 * IntraPositionMovementPostingReportV04.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV04#mmAccountOwner
 * SecuritiesBalanceAccountingReportV04.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV05#mmAccountOwner
 * SecuritiesBalanceAccountingReportV05.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV06#mmAccountOwner
 * SecuritiesBalanceAccountingReportV06.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV04#mmAccountOwner
 * SecuritiesBalanceCustodyReportV04.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05#mmAccountOwner
 * SecuritiesBalanceCustodyReportV05.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV06#mmAccountOwner
 * SecuritiesBalanceCustodyReportV06.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV02#mmAccountOwner
 * SecuritiesMessageCancellationAdviceV02.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV03#mmAccountOwner
 * SecuritiesMessageCancellationAdviceV03.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV04#mmAccountOwner
 * SecuritiesMessageCancellationAdviceV04.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV02#mmAccountOwner
 * SecuritiesSettlementConditionModificationStatusAdviceV02.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV03#mmAccountOwner
 * SecuritiesSettlementConditionModificationStatusAdviceV03.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV04#mmAccountOwner
 * SecuritiesSettlementConditionModificationStatusAdviceV04.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV02#mmAccountOwner
 * SecuritiesSettlementConditionsModificationRequestV02.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV03#mmAccountOwner
 * SecuritiesSettlementConditionsModificationRequestV03.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV04#mmAccountOwner
 * SecuritiesSettlementConditionsModificationRequestV04.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV02#mmAccountOwner
 * SecuritiesTransactionPendingReportV02.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV03#mmAccountOwner
 * SecuritiesTransactionPendingReportV03.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV04#mmAccountOwner
 * SecuritiesTransactionPendingReportV04.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV02#mmAccountOwner
 * SecuritiesTransactionPostingReportV02.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV03#mmAccountOwner
 * SecuritiesTransactionPostingReportV03.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV04#mmAccountOwner
 * SecuritiesTransactionPostingReportV04.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV02#mmAccountOwner
 * IntraPositionMovementInstructionV02.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV02#mmAccountOwner
 * PortfolioTransferNotificationV02.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV02#mmAccountOwner
 * SecuritiesSettlementAllegementRemovalAdviceV02.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV02#mmAccountOwner
 * SecuritiesSettlementTransactionAllegementReportV02.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV02#mmAccountOwner
 * SecuritiesStatementQueryV02.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV02#mmAccountOwner
 * SecuritiesStatusOrStatementQueryStatusAdviceV02.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV02#mmAccountOwner
 * SecuritiesTransactionCancellationRequestV02.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV02#mmAccountOwner
 * SecuritiesTransactionStatusQueryV02.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV03#mmAccountOwner
 * SecuritiesSettlementAllegementRemovalAdviceV03.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV03#mmAccountOwner
 * SecuritiesSettlementTransactionAllegementReportV03.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV03#mmAccountOwner
 * SecuritiesStatementQueryV03.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV03#mmAccountOwner
 * SecuritiesStatusOrStatementQueryStatusAdviceV03.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV03#mmAccountOwner
 * SecuritiesTransactionCancellationRequestV03.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV03#mmAccountOwner
 * SecuritiesTransactionStatusQueryV03.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV03#mmAccountOwner
 * IntraPositionMovementInstructionV03.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV03#mmAccountOwner
 * PortfolioTransferNotificationV03.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV01#mmAccountOwner
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.
 * mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV04#mmAccountOwner
 * SecuritiesTransactionCancellationRequestV04.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV05#mmAccountOwner
 * SecuritiesSettlementConditionModificationStatusAdviceV05.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV05#mmAccountOwner
 * SecuritiesTransactionPendingReportV05.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV05#mmAccountOwner
 * SecuritiesTransactionPostingReportV05.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02#mmAccountOwner
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.
 * mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV05#mmAccountOwner
 * SecuritiesSettlementConditionsModificationRequestV05.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV07#mmAccountOwner
 * SecuritiesBalanceCustodyReportV07.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07#mmAccountOwner
 * SecuritiesBalanceAccountingReportV07.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV04#mmAccountOwner
 * SecuritiesSettlementTransactionAllegementReportV04.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV04#mmAccountOwner
 * SecuritiesStatementQueryV04.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV08#mmAccountOwner
 * SecuritiesBalanceCustodyReportV08.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV06#mmAccountOwner
 * SecuritiesTransactionPendingReportV06.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQueryV05#mmAccountOwner
 * SecuritiesStatementQueryV05.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08#mmAccountOwner
 * SecuritiesBalanceAccountingReportV08.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV06#mmAccountOwner
 * SecuritiesSettlementConditionModificationStatusAdviceV06.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03#mmAccountOwner
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.
 * mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV02#mmAccountOwner
 * SecuritiesSettlementTransactionAuditTrailReportV02.mmAccountOwner}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistencePartyProprietaryIdentificationRule#forPartyIdentification36Choice
 * ConstraintCoexistencePartyProprietaryIdentificationRule.
 * forPartyIdentification36Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyIdentification36Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of identification of a party."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyIdentification36Choice", propOrder = {"anyBIC", "proprietaryIdentification"})
public class PartyIdentification36Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AnyBIC", required = true)
	protected AnyBICIdentifier anyBIC;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmAnyBIC
	 * OrganisationIdentification.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification36Choice
	 * PartyIdentification36Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AnyBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnyBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\"."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentification36Choice, AnyBICIdentifier> mmAnyBIC = new MMMessageAttribute<PartyIdentification36Choice, AnyBICIdentifier>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmAnyBIC;
			componentContext_lazy = () -> com.tools20022.repository.choice.PartyIdentification36Choice.mmObject();
			isDerived = false;
			xmlTag = "AnyBIC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnyBIC";
			definition = "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}

		@Override
		public AnyBICIdentifier getValue(PartyIdentification36Choice obj) {
			return obj.getAnyBIC();
		}

		@Override
		public void setValue(PartyIdentification36Choice obj, AnyBICIdentifier value) {
			obj.setAnyBIC(value);
		}
	};
	@XmlElement(name = "PrtryId", required = true)
	protected GenericIdentification19 proprietaryIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification19
	 * GenericIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification36Choice
	 * PartyIdentification36Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95R:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier, as assigned to a financial institution using a proprietary identification scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyIdentification36Choice, GenericIdentification19> mmProprietaryIdentification = new MMMessageAssociationEnd<PartyIdentification36Choice, GenericIdentification19>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.PartyIdentification36Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtryId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95R:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Unique and unambiguous identifier, as assigned to a financial institution using a proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification19.mmObject();
		}

		@Override
		public GenericIdentification19 getValue(PartyIdentification36Choice obj) {
			return obj.getProprietaryIdentification();
		}

		@Override
		public void setValue(PartyIdentification36Choice obj, GenericIdentification19 value) {
			obj.setProprietaryIdentification(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PartyIdentification36Choice.mmAnyBIC, com.tools20022.repository.choice.PartyIdentification36Choice.mmProprietaryIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionAuditTrailReportV01.mmAccountOwner, IntraPositionMovementConfirmationV02.mmAccountOwner, IntraPositionMovementConfirmationV03.mmAccountOwner,
						IntraPositionMovementConfirmationV04.mmAccountOwner, IntraPositionMovementPostingReportV02.mmAccountOwner, IntraPositionMovementPostingReportV03.mmAccountOwner, IntraPositionMovementPostingReportV04.mmAccountOwner,
						SecuritiesBalanceAccountingReportV04.mmAccountOwner, SecuritiesBalanceAccountingReportV05.mmAccountOwner, SecuritiesBalanceAccountingReportV06.mmAccountOwner, SecuritiesBalanceCustodyReportV04.mmAccountOwner,
						SecuritiesBalanceCustodyReportV05.mmAccountOwner, SecuritiesBalanceCustodyReportV06.mmAccountOwner, SecuritiesMessageCancellationAdviceV02.mmAccountOwner, SecuritiesMessageCancellationAdviceV03.mmAccountOwner,
						SecuritiesMessageCancellationAdviceV04.mmAccountOwner, SecuritiesSettlementConditionModificationStatusAdviceV02.mmAccountOwner, SecuritiesSettlementConditionModificationStatusAdviceV03.mmAccountOwner,
						SecuritiesSettlementConditionModificationStatusAdviceV04.mmAccountOwner, SecuritiesSettlementConditionsModificationRequestV02.mmAccountOwner, SecuritiesSettlementConditionsModificationRequestV03.mmAccountOwner,
						SecuritiesSettlementConditionsModificationRequestV04.mmAccountOwner, SecuritiesTransactionPendingReportV02.mmAccountOwner, SecuritiesTransactionPendingReportV03.mmAccountOwner,
						SecuritiesTransactionPendingReportV04.mmAccountOwner, SecuritiesTransactionPostingReportV02.mmAccountOwner, SecuritiesTransactionPostingReportV03.mmAccountOwner, SecuritiesTransactionPostingReportV04.mmAccountOwner,
						IntraPositionMovementInstructionV02.mmAccountOwner, PortfolioTransferNotificationV02.mmAccountOwner, SecuritiesSettlementAllegementRemovalAdviceV02.mmAccountOwner,
						SecuritiesSettlementTransactionAllegementReportV02.mmAccountOwner, SecuritiesStatementQueryV02.mmAccountOwner, SecuritiesStatusOrStatementQueryStatusAdviceV02.mmAccountOwner,
						SecuritiesTransactionCancellationRequestV02.mmAccountOwner, SecuritiesTransactionStatusQueryV02.mmAccountOwner, SecuritiesSettlementAllegementRemovalAdviceV03.mmAccountOwner,
						SecuritiesSettlementTransactionAllegementReportV03.mmAccountOwner, SecuritiesStatementQueryV03.mmAccountOwner, SecuritiesStatusOrStatementQueryStatusAdviceV03.mmAccountOwner,
						SecuritiesTransactionCancellationRequestV03.mmAccountOwner, SecuritiesTransactionStatusQueryV03.mmAccountOwner, IntraPositionMovementInstructionV03.mmAccountOwner, PortfolioTransferNotificationV03.mmAccountOwner,
						SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.mmAccountOwner, SecuritiesTransactionCancellationRequestV04.mmAccountOwner, SecuritiesSettlementConditionModificationStatusAdviceV05.mmAccountOwner,
						SecuritiesTransactionPendingReportV05.mmAccountOwner, SecuritiesTransactionPostingReportV05.mmAccountOwner, SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.mmAccountOwner,
						SecuritiesSettlementConditionsModificationRequestV05.mmAccountOwner, SecuritiesBalanceCustodyReportV07.mmAccountOwner, SecuritiesBalanceAccountingReportV07.mmAccountOwner,
						SecuritiesSettlementTransactionAllegementReportV04.mmAccountOwner, SecuritiesStatementQueryV04.mmAccountOwner, SecuritiesBalanceCustodyReportV08.mmAccountOwner, SecuritiesTransactionPendingReportV06.mmAccountOwner,
						SecuritiesStatementQueryV05.mmAccountOwner, SecuritiesBalanceAccountingReportV08.mmAccountOwner, SecuritiesSettlementConditionModificationStatusAdviceV06.mmAccountOwner,
						SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.mmAccountOwner, SecuritiesSettlementTransactionAuditTrailReportV02.mmAccountOwner);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistencePartyProprietaryIdentificationRule.forPartyIdentification36Choice);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PartyIdentification36Choice";
				definition = "Choice of identification of a party.";
			}
		});
		return mmObject_lazy.get();
	}

	public AnyBICIdentifier getAnyBIC() {
		return anyBIC;
	}

	public PartyIdentification36Choice setAnyBIC(AnyBICIdentifier anyBIC) {
		this.anyBIC = Objects.requireNonNull(anyBIC);
		return this;
	}

	public GenericIdentification19 getProprietaryIdentification() {
		return proprietaryIdentification;
	}

	public PartyIdentification36Choice setProprietaryIdentification(GenericIdentification19 proprietaryIdentification) {
		this.proprietaryIdentification = Objects.requireNonNull(proprietaryIdentification);
		return this;
	}
}