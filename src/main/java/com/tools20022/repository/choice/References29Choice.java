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

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.RestrictedFINXMax16Text;
import com.tools20022.repository.entity.SecuritiesTradeExecution;
import com.tools20022.repository.entity.SecuritiesTradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SettlementTypeAndIdentification14;
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
 * Choice of reference.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References29Choice#mmSecuritiesSettlementTransactionConfirmationIdentification
 * References29Choice.
 * mmSecuritiesSettlementTransactionConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References29Choice#mmIntraPositionMovementConfirmationIdentification
 * References29Choice.mmIntraPositionMovementConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References29Choice#mmSecuritiesBalanceAccountingReportIdentification
 * References29Choice.mmSecuritiesBalanceAccountingReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References29Choice#mmSecuritiesBalanceCustodyReportIdentification
 * References29Choice.mmSecuritiesBalanceCustodyReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References29Choice#mmIntraPositionMovementPostingReportIdentification
 * References29Choice.mmIntraPositionMovementPostingReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References29Choice#mmSecuritiesFinancingConfirmationIdentification
 * References29Choice.mmSecuritiesFinancingConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References29Choice#mmSecuritiesTransactionPendingReportIdentification
 * References29Choice.mmSecuritiesTransactionPendingReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References29Choice#mmSecuritiesTransactionPostingReportIdentification
 * References29Choice.mmSecuritiesTransactionPostingReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References29Choice#mmSecuritiesSettlementTransactionAllegementReportIdentification
 * References29Choice.
 * mmSecuritiesSettlementTransactionAllegementReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References29Choice#mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
 * References29Choice.
 * mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References29Choice#mmPortfolioTransferNotificationIdentification
 * References29Choice.mmPortfolioTransferNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References29Choice#mmSecuritiesSettlementTransactionGenerationNotificationIdentification
 * References29Choice.
 * mmSecuritiesSettlementTransactionGenerationNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References29Choice#mmOtherMessageIdentification
 * References29Choice.mmOtherMessageIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
 * SecuritiesTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesSettlementTransactionAllegementNotificationRule#forReferences29Choice
 * ConstraintSecuritiesSettlementTransactionAllegementNotificationRule.
 * forReferences29Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#forReferences29Choice
 * ConstraintCoexistenceIdentificationRule.forReferences29Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherMessageIdentificationUsageRule#forReferences29Choice
 * ConstraintOtherMessageIdentificationUsageRule.forReferences29Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "References29Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of reference."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "References29Choice", propOrder = {"securitiesSettlementTransactionConfirmationIdentification", "intraPositionMovementConfirmationIdentification", "securitiesBalanceAccountingReportIdentification",
		"securitiesBalanceCustodyReportIdentification", "intraPositionMovementPostingReportIdentification", "securitiesFinancingConfirmationIdentification", "securitiesTransactionPendingReportIdentification",
		"securitiesTransactionPostingReportIdentification", "securitiesSettlementTransactionAllegementReportIdentification", "securitiesSettlementTransactionAllegementNotificationTransactionIdentification",
		"portfolioTransferNotificationIdentification", "securitiesSettlementTransactionGenerationNotificationIdentification", "otherMessageIdentification"})
public class References29Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesSttlmTxConfId", required = true)
	protected SettlementTypeAndIdentification14 securitiesSettlementTransactionConfirmationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification14
	 * SettlementTypeAndIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References29Choice
	 * References29Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesSttlmTxConfId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlementTransactionConfirmationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the confirmation to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesSettlementTransactionConfirmationIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.choice.References29Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesSttlmTxConfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementTransactionConfirmationIdentification";
			definition = "Unambiguous identification of the confirmation to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementTypeAndIdentification14.mmObject();
		}
	};
	@XmlElement(name = "IntraPosMvmntConfId", required = true)
	protected RestrictedFINXMax16Text intraPositionMovementConfirmationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References29Choice
	 * References29Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntraPosMvmntConfId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraPositionMovementConfirmationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous account servicer identification of the intra-position movement confirmation to be cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIntraPositionMovementConfirmationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.References29Choice.mmObject();
			isDerived = false;
			xmlTag = "IntraPosMvmntConfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraPositionMovementConfirmationIdentification";
			definition = "Unambiguous account servicer identification of the intra-position movement confirmation to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	@XmlElement(name = "SctiesBalAcctgRptId", required = true)
	protected RestrictedFINXMax16Text securitiesBalanceAccountingReportIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References29Choice
	 * References29Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesBalAcctgRptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBalanceAccountingReportIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the report message to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesBalanceAccountingReportIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.References29Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesBalAcctgRptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBalanceAccountingReportIdentification";
			definition = "Unambiguous identification of the report message to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	@XmlElement(name = "SctiesBalCtdyRptId", required = true)
	protected RestrictedFINXMax16Text securitiesBalanceCustodyReportIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References29Choice
	 * References29Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesBalCtdyRptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBalanceCustodyReportIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the report message to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesBalanceCustodyReportIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.References29Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesBalCtdyRptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBalanceCustodyReportIdentification";
			definition = "Unambiguous identification of the report message to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	@XmlElement(name = "IntraPosMvmntPstngRptId", required = true)
	protected RestrictedFINXMax16Text intraPositionMovementPostingReportIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References29Choice
	 * References29Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntraPosMvmntPstngRptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraPositionMovementPostingReportIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the intra-position movement posting report to be cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIntraPositionMovementPostingReportIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.References29Choice.mmObject();
			isDerived = false;
			xmlTag = "IntraPosMvmntPstngRptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraPositionMovementPostingReportIdentification";
			definition = "Identification of the intra-position movement posting report to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	@XmlElement(name = "SctiesFincgConfId", required = true)
	protected SettlementTypeAndIdentification14 securitiesFinancingConfirmationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification14
	 * SettlementTypeAndIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References29Choice
	 * References29Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesFincgConfId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingConfirmationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the confirmation to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesFinancingConfirmationIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.References29Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesFincgConfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingConfirmationIdentification";
			definition = "Unambiguous identification of the confirmation to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementTypeAndIdentification14.mmObject();
		}
	};
	@XmlElement(name = "SctiesTxPdgRptId", required = true)
	protected RestrictedFINXMax16Text securitiesTransactionPendingReportIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References29Choice
	 * References29Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesTxPdgRptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransactionPendingReportIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the report message to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesTransactionPendingReportIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.References29Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesTxPdgRptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTransactionPendingReportIdentification";
			definition = "Unambiguous identification of the report message to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	@XmlElement(name = "SctiesTxPstngRptId", required = true)
	protected RestrictedFINXMax16Text securitiesTransactionPostingReportIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References29Choice
	 * References29Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesTxPstngRptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransactionPostingReportIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the report message to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesTransactionPostingReportIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.References29Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesTxPstngRptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTransactionPostingReportIdentification";
			definition = "Unambiguous identification of the report message to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	@XmlElement(name = "SctiesSttlmTxAllgmtRptId", required = true)
	protected RestrictedFINXMax16Text securitiesSettlementTransactionAllegementReportIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References29Choice
	 * References29Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesSttlmTxAllgmtRptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlementTransactionAllegementReportIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unambiguous identification of the report to be cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesSettlementTransactionAllegementReportIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.choice.References29Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesSttlmTxAllgmtRptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementTransactionAllegementReportIdentification";
			definition = "Unambiguous identification of the report to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	@XmlElement(name = "SctiesSttlmTxAllgmtNtfctnTxId", required = true)
	protected SettlementTypeAndIdentification14 securitiesSettlementTransactionAllegementNotificationTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification14
	 * SettlementTypeAndIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References29Choice
	 * References29Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesSttlmTxAllgmtNtfctnTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the allegement notification to be cancelled as know by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.choice.References29Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesSttlmTxAllgmtNtfctnTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification";
			definition = "Unambiguous identification of the allegement notification to be cancelled as know by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementTypeAndIdentification14.mmObject();
		}
	};
	@XmlElement(name = "PrtflTrfNtfctnId", required = true)
	protected RestrictedFINXMax16Text portfolioTransferNotificationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References29Choice
	 * References29Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtflTrfNtfctnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioTransferNotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the portfolio transfer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPortfolioTransferNotificationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.References29Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtflTrfNtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioTransferNotificationIdentification";
			definition = "Identification of the portfolio transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	@XmlElement(name = "SctiesSttlmTxGnrtnNtfctnId", required = true)
	protected SettlementTypeAndIdentification14 securitiesSettlementTransactionGenerationNotificationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification14
	 * SettlementTypeAndIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References29Choice
	 * References29Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesSttlmTxGnrtnNtfctnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "SecuritiesSettlementTransactionGenerationNotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the notification message to be cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesSettlementTransactionGenerationNotificationIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.choice.References29Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesSttlmTxGnrtnNtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementTransactionGenerationNotificationIdentification";
			definition = "Unambiguous identification of the notification message to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementTypeAndIdentification14.mmObject();
		}
	};
	@XmlElement(name = "OthrMsgId", required = true)
	protected RestrictedFINXMax16Text otherMessageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References29Choice
	 * References29Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrMsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherMessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the message to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOtherMessageIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.References29Choice.mmObject();
			isDerived = false;
			xmlTag = "OthrMsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherMessageIdentification";
			definition = "Unambiguous identification of the message to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.References29Choice.mmSecuritiesSettlementTransactionConfirmationIdentification,
						com.tools20022.repository.choice.References29Choice.mmIntraPositionMovementConfirmationIdentification, com.tools20022.repository.choice.References29Choice.mmSecuritiesBalanceAccountingReportIdentification,
						com.tools20022.repository.choice.References29Choice.mmSecuritiesBalanceCustodyReportIdentification, com.tools20022.repository.choice.References29Choice.mmIntraPositionMovementPostingReportIdentification,
						com.tools20022.repository.choice.References29Choice.mmSecuritiesFinancingConfirmationIdentification, com.tools20022.repository.choice.References29Choice.mmSecuritiesTransactionPendingReportIdentification,
						com.tools20022.repository.choice.References29Choice.mmSecuritiesTransactionPostingReportIdentification,
						com.tools20022.repository.choice.References29Choice.mmSecuritiesSettlementTransactionAllegementReportIdentification,
						com.tools20022.repository.choice.References29Choice.mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification,
						com.tools20022.repository.choice.References29Choice.mmPortfolioTransferNotificationIdentification,
						com.tools20022.repository.choice.References29Choice.mmSecuritiesSettlementTransactionGenerationNotificationIdentification, com.tools20022.repository.choice.References29Choice.mmOtherMessageIdentification);
				trace_lazy = () -> SecuritiesTradeIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesSettlementTransactionAllegementNotificationRule.forReferences29Choice,
						com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.forReferences29Choice, com.tools20022.repository.constraints.ConstraintOtherMessageIdentificationUsageRule.forReferences29Choice);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "References29Choice";
				definition = "Choice of reference.";
			}
		});
		return mmObject_lazy.get();
	}

	public SettlementTypeAndIdentification14 getSecuritiesSettlementTransactionConfirmationIdentification() {
		return securitiesSettlementTransactionConfirmationIdentification;
	}

	public References29Choice setSecuritiesSettlementTransactionConfirmationIdentification(SettlementTypeAndIdentification14 securitiesSettlementTransactionConfirmationIdentification) {
		this.securitiesSettlementTransactionConfirmationIdentification = Objects.requireNonNull(securitiesSettlementTransactionConfirmationIdentification);
		return this;
	}

	public RestrictedFINXMax16Text getIntraPositionMovementConfirmationIdentification() {
		return intraPositionMovementConfirmationIdentification;
	}

	public References29Choice setIntraPositionMovementConfirmationIdentification(RestrictedFINXMax16Text intraPositionMovementConfirmationIdentification) {
		this.intraPositionMovementConfirmationIdentification = Objects.requireNonNull(intraPositionMovementConfirmationIdentification);
		return this;
	}

	public RestrictedFINXMax16Text getSecuritiesBalanceAccountingReportIdentification() {
		return securitiesBalanceAccountingReportIdentification;
	}

	public References29Choice setSecuritiesBalanceAccountingReportIdentification(RestrictedFINXMax16Text securitiesBalanceAccountingReportIdentification) {
		this.securitiesBalanceAccountingReportIdentification = Objects.requireNonNull(securitiesBalanceAccountingReportIdentification);
		return this;
	}

	public RestrictedFINXMax16Text getSecuritiesBalanceCustodyReportIdentification() {
		return securitiesBalanceCustodyReportIdentification;
	}

	public References29Choice setSecuritiesBalanceCustodyReportIdentification(RestrictedFINXMax16Text securitiesBalanceCustodyReportIdentification) {
		this.securitiesBalanceCustodyReportIdentification = Objects.requireNonNull(securitiesBalanceCustodyReportIdentification);
		return this;
	}

	public RestrictedFINXMax16Text getIntraPositionMovementPostingReportIdentification() {
		return intraPositionMovementPostingReportIdentification;
	}

	public References29Choice setIntraPositionMovementPostingReportIdentification(RestrictedFINXMax16Text intraPositionMovementPostingReportIdentification) {
		this.intraPositionMovementPostingReportIdentification = Objects.requireNonNull(intraPositionMovementPostingReportIdentification);
		return this;
	}

	public SettlementTypeAndIdentification14 getSecuritiesFinancingConfirmationIdentification() {
		return securitiesFinancingConfirmationIdentification;
	}

	public References29Choice setSecuritiesFinancingConfirmationIdentification(SettlementTypeAndIdentification14 securitiesFinancingConfirmationIdentification) {
		this.securitiesFinancingConfirmationIdentification = Objects.requireNonNull(securitiesFinancingConfirmationIdentification);
		return this;
	}

	public RestrictedFINXMax16Text getSecuritiesTransactionPendingReportIdentification() {
		return securitiesTransactionPendingReportIdentification;
	}

	public References29Choice setSecuritiesTransactionPendingReportIdentification(RestrictedFINXMax16Text securitiesTransactionPendingReportIdentification) {
		this.securitiesTransactionPendingReportIdentification = Objects.requireNonNull(securitiesTransactionPendingReportIdentification);
		return this;
	}

	public RestrictedFINXMax16Text getSecuritiesTransactionPostingReportIdentification() {
		return securitiesTransactionPostingReportIdentification;
	}

	public References29Choice setSecuritiesTransactionPostingReportIdentification(RestrictedFINXMax16Text securitiesTransactionPostingReportIdentification) {
		this.securitiesTransactionPostingReportIdentification = Objects.requireNonNull(securitiesTransactionPostingReportIdentification);
		return this;
	}

	public RestrictedFINXMax16Text getSecuritiesSettlementTransactionAllegementReportIdentification() {
		return securitiesSettlementTransactionAllegementReportIdentification;
	}

	public References29Choice setSecuritiesSettlementTransactionAllegementReportIdentification(RestrictedFINXMax16Text securitiesSettlementTransactionAllegementReportIdentification) {
		this.securitiesSettlementTransactionAllegementReportIdentification = Objects.requireNonNull(securitiesSettlementTransactionAllegementReportIdentification);
		return this;
	}

	public SettlementTypeAndIdentification14 getSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification() {
		return securitiesSettlementTransactionAllegementNotificationTransactionIdentification;
	}

	public References29Choice setSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification(SettlementTypeAndIdentification14 securitiesSettlementTransactionAllegementNotificationTransactionIdentification) {
		this.securitiesSettlementTransactionAllegementNotificationTransactionIdentification = Objects.requireNonNull(securitiesSettlementTransactionAllegementNotificationTransactionIdentification);
		return this;
	}

	public RestrictedFINXMax16Text getPortfolioTransferNotificationIdentification() {
		return portfolioTransferNotificationIdentification;
	}

	public References29Choice setPortfolioTransferNotificationIdentification(RestrictedFINXMax16Text portfolioTransferNotificationIdentification) {
		this.portfolioTransferNotificationIdentification = Objects.requireNonNull(portfolioTransferNotificationIdentification);
		return this;
	}

	public SettlementTypeAndIdentification14 getSecuritiesSettlementTransactionGenerationNotificationIdentification() {
		return securitiesSettlementTransactionGenerationNotificationIdentification;
	}

	public References29Choice setSecuritiesSettlementTransactionGenerationNotificationIdentification(SettlementTypeAndIdentification14 securitiesSettlementTransactionGenerationNotificationIdentification) {
		this.securitiesSettlementTransactionGenerationNotificationIdentification = Objects.requireNonNull(securitiesSettlementTransactionGenerationNotificationIdentification);
		return this;
	}

	public RestrictedFINXMax16Text getOtherMessageIdentification() {
		return otherMessageIdentification;
	}

	public References29Choice setOtherMessageIdentification(RestrictedFINXMax16Text otherMessageIdentification) {
		this.otherMessageIdentification = Objects.requireNonNull(otherMessageIdentification);
		return this;
	}
}