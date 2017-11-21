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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.RestrictedFINXMax16Text;
import com.tools20022.repository.entity.SecuritiesTradeExecution;
import com.tools20022.repository.entity.SecuritiesTradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
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
 * {@linkplain com.tools20022.repository.choice.References9Choice#mmSecuritiesSettlementTransactionConfirmationIdentification
 * References9Choice.mmSecuritiesSettlementTransactionConfirmationIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References9Choice#mmIntraPositionMovementConfirmationIdentification
 * References9Choice.mmIntraPositionMovementConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References9Choice#mmSecuritiesBalanceAccountingReportIdentification
 * References9Choice.mmSecuritiesBalanceAccountingReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References9Choice#mmSecuritiesBalanceCustodyReportIdentification
 * References9Choice.mmSecuritiesBalanceCustodyReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References9Choice#mmIntraPositionMovementPostingReportIdentification
 * References9Choice.mmIntraPositionMovementPostingReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References9Choice#mmSecuritiesFinancingConfirmationIdentification
 * References9Choice.mmSecuritiesFinancingConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References9Choice#mmSecuritiesTransactionPendingReportIdentification
 * References9Choice.mmSecuritiesTransactionPendingReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References9Choice#mmSecuritiesTransactionPostingReportIdentification
 * References9Choice.mmSecuritiesTransactionPostingReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References9Choice#mmSecuritiesSettlementTransactionAllegementReportIdentification
 * References9Choice.
 * mmSecuritiesSettlementTransactionAllegementReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References9Choice#mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
 * References9Choice.
 * mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References9Choice#mmPortfolioTransferNotificationIdentification
 * References9Choice.mmPortfolioTransferNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References9Choice#mmSecuritiesSettlementTransactionGenerationNotificationIdentification
 * References9Choice.
 * mmSecuritiesSettlementTransactionGenerationNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References9Choice#mmOtherMessageIdentification
 * References9Choice.mmOtherMessageIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
 * SecuritiesTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "References9Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of reference."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "References9Choice", propOrder = {"securitiesSettlementTransactionConfirmationIdentification", "intraPositionMovementConfirmationIdentification", "securitiesBalanceAccountingReportIdentification",
		"securitiesBalanceCustodyReportIdentification", "intraPositionMovementPostingReportIdentification", "securitiesFinancingConfirmationIdentification", "securitiesTransactionPendingReportIdentification",
		"securitiesTransactionPostingReportIdentification", "securitiesSettlementTransactionAllegementReportIdentification", "securitiesSettlementTransactionAllegementNotificationTransactionIdentification",
		"portfolioTransferNotificationIdentification", "securitiesSettlementTransactionGenerationNotificationIdentification", "otherMessageIdentification"})
public class References9Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected RestrictedFINXMax16Text securitiesSettlementTransactionConfirmationIdentification;
	/**
	 * Unambiguous identification of the confirmation to be cancelled.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.References9Choice
	 * References9Choice}</li>
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
	public static final MMMessageAttribute mmSecuritiesSettlementTransactionConfirmationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> References9Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesSttlmTxConfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementTransactionConfirmationIdentification";
			definition = "Unambiguous identification of the confirmation to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	protected RestrictedFINXMax16Text intraPositionMovementConfirmationIdentification;
	/**
	 * Unambiguous account servicer identification of the intra-position
	 * movement confirmation to be cancelled.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.References9Choice
	 * References9Choice}</li>
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
			componentContext_lazy = () -> References9Choice.mmObject();
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
	protected RestrictedFINXMax16Text securitiesBalanceAccountingReportIdentification;
	/**
	 * Unambiguous identification of the report message to be cancelled.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.References9Choice
	 * References9Choice}</li>
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
			componentContext_lazy = () -> References9Choice.mmObject();
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
	protected RestrictedFINXMax16Text securitiesBalanceCustodyReportIdentification;
	/**
	 * Unambiguous identification of the report message to be cancelled.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.References9Choice
	 * References9Choice}</li>
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
			componentContext_lazy = () -> References9Choice.mmObject();
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
	protected RestrictedFINXMax16Text intraPositionMovementPostingReportIdentification;
	/**
	 * Identification of the intra-position movement posting report to be
	 * cancelled.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.References9Choice
	 * References9Choice}</li>
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
			componentContext_lazy = () -> References9Choice.mmObject();
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
	protected RestrictedFINXMax16Text securitiesFinancingConfirmationIdentification;
	/**
	 * Unambiguous identification of the confirmation to be cancelled.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.References9Choice
	 * References9Choice}</li>
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
	public static final MMMessageAttribute mmSecuritiesFinancingConfirmationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> References9Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesFincgConfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingConfirmationIdentification";
			definition = "Unambiguous identification of the confirmation to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	protected RestrictedFINXMax16Text securitiesTransactionPendingReportIdentification;
	/**
	 * Unambiguous identification of the report message to be cancelled.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.References9Choice
	 * References9Choice}</li>
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
			componentContext_lazy = () -> References9Choice.mmObject();
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
	protected RestrictedFINXMax16Text securitiesTransactionPostingReportIdentification;
	/**
	 * Unambiguous identification of the report message to be cancelled.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.References9Choice
	 * References9Choice}</li>
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
			componentContext_lazy = () -> References9Choice.mmObject();
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
	protected RestrictedFINXMax16Text securitiesSettlementTransactionAllegementReportIdentification;
	/**
	 * Unambiguous identification of the report to be cancelled.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.References9Choice
	 * References9Choice}</li>
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
			componentContext_lazy = () -> References9Choice.mmObject();
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
	protected RestrictedFINXMax16Text securitiesSettlementTransactionAllegementNotificationTransactionIdentification;
	/**
	 * Unambiguous identification of the allegement notification to be cancelled
	 * as know by the account servicer.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.References9Choice
	 * References9Choice}</li>
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
	public static final MMMessageAttribute mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> References9Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesSttlmTxAllgmtNtfctnTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification";
			definition = "Unambiguous identification of the allegement notification to be cancelled as know by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	protected RestrictedFINXMax16Text portfolioTransferNotificationIdentification;
	/**
	 * Identification of the portfolio transfer.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.References9Choice
	 * References9Choice}</li>
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
			componentContext_lazy = () -> References9Choice.mmObject();
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
	protected RestrictedFINXMax16Text securitiesSettlementTransactionGenerationNotificationIdentification;
	/**
	 * Unambiguous identification of the notification message to be cancelled.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.References9Choice
	 * References9Choice}</li>
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
	public static final MMMessageAttribute mmSecuritiesSettlementTransactionGenerationNotificationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> References9Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesSttlmTxGnrtnNtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementTransactionGenerationNotificationIdentification";
			definition = "Unambiguous identification of the notification message to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	protected RestrictedFINXMax16Text otherMessageIdentification;
	/**
	 * Unambiguous identification of the message to be cancelled.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.References9Choice
	 * References9Choice}</li>
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
			componentContext_lazy = () -> References9Choice.mmObject();
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
				messageElement_lazy = () -> Arrays.asList(References9Choice.mmSecuritiesSettlementTransactionConfirmationIdentification, References9Choice.mmIntraPositionMovementConfirmationIdentification,
						References9Choice.mmSecuritiesBalanceAccountingReportIdentification, References9Choice.mmSecuritiesBalanceCustodyReportIdentification, References9Choice.mmIntraPositionMovementPostingReportIdentification,
						References9Choice.mmSecuritiesFinancingConfirmationIdentification, References9Choice.mmSecuritiesTransactionPendingReportIdentification, References9Choice.mmSecuritiesTransactionPostingReportIdentification,
						References9Choice.mmSecuritiesSettlementTransactionAllegementReportIdentification, References9Choice.mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification,
						References9Choice.mmPortfolioTransferNotificationIdentification, References9Choice.mmSecuritiesSettlementTransactionGenerationNotificationIdentification, References9Choice.mmOtherMessageIdentification);
				trace_lazy = () -> SecuritiesTradeIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "References9Choice";
				definition = "Choice of reference.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SctiesSttlmTxConfId", required = true)
	public RestrictedFINXMax16Text getSecuritiesSettlementTransactionConfirmationIdentification() {
		return securitiesSettlementTransactionConfirmationIdentification;
	}

	public void setSecuritiesSettlementTransactionConfirmationIdentification(RestrictedFINXMax16Text securitiesSettlementTransactionConfirmationIdentification) {
		this.securitiesSettlementTransactionConfirmationIdentification = securitiesSettlementTransactionConfirmationIdentification;
	}

	@XmlElement(name = "IntraPosMvmntConfId", required = true)
	public RestrictedFINXMax16Text getIntraPositionMovementConfirmationIdentification() {
		return intraPositionMovementConfirmationIdentification;
	}

	public void setIntraPositionMovementConfirmationIdentification(RestrictedFINXMax16Text intraPositionMovementConfirmationIdentification) {
		this.intraPositionMovementConfirmationIdentification = intraPositionMovementConfirmationIdentification;
	}

	@XmlElement(name = "SctiesBalAcctgRptId", required = true)
	public RestrictedFINXMax16Text getSecuritiesBalanceAccountingReportIdentification() {
		return securitiesBalanceAccountingReportIdentification;
	}

	public void setSecuritiesBalanceAccountingReportIdentification(RestrictedFINXMax16Text securitiesBalanceAccountingReportIdentification) {
		this.securitiesBalanceAccountingReportIdentification = securitiesBalanceAccountingReportIdentification;
	}

	@XmlElement(name = "SctiesBalCtdyRptId", required = true)
	public RestrictedFINXMax16Text getSecuritiesBalanceCustodyReportIdentification() {
		return securitiesBalanceCustodyReportIdentification;
	}

	public void setSecuritiesBalanceCustodyReportIdentification(RestrictedFINXMax16Text securitiesBalanceCustodyReportIdentification) {
		this.securitiesBalanceCustodyReportIdentification = securitiesBalanceCustodyReportIdentification;
	}

	@XmlElement(name = "IntraPosMvmntPstngRptId", required = true)
	public RestrictedFINXMax16Text getIntraPositionMovementPostingReportIdentification() {
		return intraPositionMovementPostingReportIdentification;
	}

	public void setIntraPositionMovementPostingReportIdentification(RestrictedFINXMax16Text intraPositionMovementPostingReportIdentification) {
		this.intraPositionMovementPostingReportIdentification = intraPositionMovementPostingReportIdentification;
	}

	@XmlElement(name = "SctiesFincgConfId", required = true)
	public RestrictedFINXMax16Text getSecuritiesFinancingConfirmationIdentification() {
		return securitiesFinancingConfirmationIdentification;
	}

	public void setSecuritiesFinancingConfirmationIdentification(RestrictedFINXMax16Text securitiesFinancingConfirmationIdentification) {
		this.securitiesFinancingConfirmationIdentification = securitiesFinancingConfirmationIdentification;
	}

	@XmlElement(name = "SctiesTxPdgRptId", required = true)
	public RestrictedFINXMax16Text getSecuritiesTransactionPendingReportIdentification() {
		return securitiesTransactionPendingReportIdentification;
	}

	public void setSecuritiesTransactionPendingReportIdentification(RestrictedFINXMax16Text securitiesTransactionPendingReportIdentification) {
		this.securitiesTransactionPendingReportIdentification = securitiesTransactionPendingReportIdentification;
	}

	@XmlElement(name = "SctiesTxPstngRptId", required = true)
	public RestrictedFINXMax16Text getSecuritiesTransactionPostingReportIdentification() {
		return securitiesTransactionPostingReportIdentification;
	}

	public void setSecuritiesTransactionPostingReportIdentification(RestrictedFINXMax16Text securitiesTransactionPostingReportIdentification) {
		this.securitiesTransactionPostingReportIdentification = securitiesTransactionPostingReportIdentification;
	}

	@XmlElement(name = "SctiesSttlmTxAllgmtRptId", required = true)
	public RestrictedFINXMax16Text getSecuritiesSettlementTransactionAllegementReportIdentification() {
		return securitiesSettlementTransactionAllegementReportIdentification;
	}

	public void setSecuritiesSettlementTransactionAllegementReportIdentification(RestrictedFINXMax16Text securitiesSettlementTransactionAllegementReportIdentification) {
		this.securitiesSettlementTransactionAllegementReportIdentification = securitiesSettlementTransactionAllegementReportIdentification;
	}

	@XmlElement(name = "SctiesSttlmTxAllgmtNtfctnTxId", required = true)
	public RestrictedFINXMax16Text getSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification() {
		return securitiesSettlementTransactionAllegementNotificationTransactionIdentification;
	}

	public void setSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification(RestrictedFINXMax16Text securitiesSettlementTransactionAllegementNotificationTransactionIdentification) {
		this.securitiesSettlementTransactionAllegementNotificationTransactionIdentification = securitiesSettlementTransactionAllegementNotificationTransactionIdentification;
	}

	@XmlElement(name = "PrtflTrfNtfctnId", required = true)
	public RestrictedFINXMax16Text getPortfolioTransferNotificationIdentification() {
		return portfolioTransferNotificationIdentification;
	}

	public void setPortfolioTransferNotificationIdentification(RestrictedFINXMax16Text portfolioTransferNotificationIdentification) {
		this.portfolioTransferNotificationIdentification = portfolioTransferNotificationIdentification;
	}

	@XmlElement(name = "SctiesSttlmTxGnrtnNtfctnId", required = true)
	public RestrictedFINXMax16Text getSecuritiesSettlementTransactionGenerationNotificationIdentification() {
		return securitiesSettlementTransactionGenerationNotificationIdentification;
	}

	public void setSecuritiesSettlementTransactionGenerationNotificationIdentification(RestrictedFINXMax16Text securitiesSettlementTransactionGenerationNotificationIdentification) {
		this.securitiesSettlementTransactionGenerationNotificationIdentification = securitiesSettlementTransactionGenerationNotificationIdentification;
	}

	@XmlElement(name = "OthrMsgId", required = true)
	public RestrictedFINXMax16Text getOtherMessageIdentification() {
		return otherMessageIdentification;
	}

	public void setOtherMessageIdentification(RestrictedFINXMax16Text otherMessageIdentification) {
		this.otherMessageIdentification = otherMessageIdentification;
	}
}