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
import com.tools20022.repository.area.sese.TransferInConfirmationV04;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.TransferReason1;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.HoldingsPlanType1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Completion of a securities settlement instruction, wherein securities are
 * delivered/debited from a securities account and received/credited to the
 * designated securities account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer26#mmTransferConfirmationReference
 * Transfer26.mmTransferConfirmationReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer26#mmTransferReference
 * Transfer26.mmTransferReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer26#mmClientReference
 * Transfer26.mmClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer26#mmCounterpartyReference
 * Transfer26.mmCounterpartyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer26#mmEffectiveTransferDate
 * Transfer26.mmEffectiveTransferDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer26#mmRequestedSettlementDate
 * Transfer26.mmRequestedSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer26#mmEffectiveSettlementDate
 * Transfer26.mmEffectiveSettlementDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer26#mmTradeDate
 * Transfer26.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer26#mmTransferOrderDateForm
 * Transfer26.mmTransferOrderDateForm}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer26#mmTransferReason
 * Transfer26.mmTransferReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer26#mmHoldingsPlanType
 * Transfer26.mmHoldingsPlanType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer26#mmFinancialInstrumentDetails
 * Transfer26.mmFinancialInstrumentDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer26#mmTotalUnitsNumber
 * Transfer26.mmTotalUnitsNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer26#mmUnitsDetails
 * Transfer26.mmUnitsDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer26#mmAveragePrice
 * Transfer26.mmAveragePrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer26#mmTransferCurrency
 * Transfer26.mmTransferCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer26#mmOwnAccountTransferIndicator
 * Transfer26.mmOwnAccountTransferIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer26#mmNonStandardSettlementInformation
 * Transfer26.mmNonStandardSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer26#mmReceivingAgentDetails
 * Transfer26.mmReceivingAgentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer26#mmDeliveringAgentDetails
 * Transfer26.mmDeliveringAgentDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
 * SecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV04#mmTransferDetails
 * TransferInConfirmationV04.mmTransferDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Transfer26"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Completion of a securities settlement instruction, wherein securities are delivered/debited from a securities account and received/credited to the designated securities account."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer29 Transfer29}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Transfer18
 * Transfer18}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Transfer26", propOrder = {"transferConfirmationReference", "transferReference", "clientReference", "counterpartyReference", "effectiveTransferDate", "requestedSettlementDate", "effectiveSettlementDate", "tradeDate",
		"transferOrderDateForm", "transferReason", "holdingsPlanType", "financialInstrumentDetails", "totalUnitsNumber", "unitsDetails", "averagePrice", "transferCurrency", "ownAccountTransferIndicator", "nonStandardSettlementInformation",
		"receivingAgentDetails", "deliveringAgentDetails"})
public class Transfer26 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text transferConfirmationReference;
	/**
	 * Unique and unambiguous identifier for a transfer execution, as assigned
	 * by a confirming party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer26
	 * Transfer26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfConfRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferConfirmationReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a transfer execution, as assigned by a confirming party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmTransferConfirmationReference
	 * Transfer29.mmTransferConfirmationReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferConfirmationReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Transfer26.mmObject();
			isDerived = false;
			xmlTag = "TrfConfRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferConfirmationReference";
			definition = "Unique and unambiguous identifier for a transfer execution, as assigned by a confirming party.";
			nextVersions_lazy = () -> Arrays.asList(Transfer29.mmTransferConfirmationReference);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text transferReference;
	/**
	 * Unique and unambiguous identifier for a transfer instruction, as assigned
	 * by the instructing party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmIdentification
	 * SecuritiesTransfer.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer26
	 * Transfer26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a transfer instruction, as assigned by the instructing party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmTransferReference
	 * Transfer29.mmTransferReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmIdentification;
			componentContext_lazy = () -> Transfer26.mmObject();
			isDerived = false;
			xmlTag = "TrfRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferReference";
			definition = "Unique and unambiguous identifier for a transfer instruction, as assigned by the instructing party.";
			nextVersions_lazy = () -> Arrays.asList(Transfer29.mmTransferReference);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text clientReference;
	/**
	 * Unique and unambiguous investor's identification of a transfer. This
	 * reference can typically be used in a hub scenario to give the reference
	 * of the transfer as assigned by the underlying client.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmClientReference
	 * InvestmentFundTransaction.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer26
	 * Transfer26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous investor's identification of a transfer. This reference can typically be used in a hub scenario to give the reference of the transfer as assigned by the underlying client."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmClientReference
	 * Transfer29.mmClientReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmClientReference;
			componentContext_lazy = () -> Transfer26.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of a transfer. This reference can typically be used in a hub scenario to give the reference of the transfer as assigned by the underlying client.";
			nextVersions_lazy = () -> Arrays.asList(Transfer29.mmClientReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected AdditionalReference2 counterpartyReference;
	/**
	 * Unambiguous identification of the transfer allocated by the counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference2
	 * AdditionalReference2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCounterpartyReference
	 * TradeIdentification.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer26
	 * Transfer26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtyRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transfer allocated by the counterparty."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmCounterpartyReference
	 * Transfer29.mmCounterpartyReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCounterpartyReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmCounterpartyReference;
			componentContext_lazy = () -> Transfer26.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyReference";
			definition = "Unambiguous identification of the transfer allocated by the counterparty.";
			nextVersions_lazy = () -> Arrays.asList(Transfer29.mmCounterpartyReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AdditionalReference2.mmObject();
		}
	};
	protected DateAndDateTimeChoice effectiveTransferDate;
	/**
	 * Date and time at which the transfer was executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmDate
	 * ObligationFulfilment.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer26
	 * Transfer26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvTrfDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveTransferDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the transfer was executed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmEffectiveTransferDate
	 * Transfer29.mmEffectiveTransferDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEffectiveTransferDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ObligationFulfilment.mmDate;
			componentContext_lazy = () -> Transfer26.mmObject();
			isDerived = false;
			xmlTag = "FctvTrfDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveTransferDate";
			definition = "Date and time at which the transfer was executed.";
			nextVersions_lazy = () -> Arrays.asList(Transfer29.mmEffectiveTransferDate);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected ISODate requestedSettlementDate;
	/**
	 * Date and time at which the securities are to be exchanged at the
	 * International Central Securities Depository (ICSD) or Central Securities
	 * Depository (CSD).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer26
	 * Transfer26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the securities are to be exchanged at the International Central Securities Depository (ICSD) or Central Securities Depository (CSD)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmRequestedSettlementDate
	 * Transfer29.mmRequestedSettlementDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> Transfer26.mmObject();
			isDerived = false;
			xmlTag = "ReqdSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDate";
			definition = "Date and time at which the securities are to be exchanged at the International Central Securities Depository (ICSD) or Central Securities Depository (CSD).";
			nextVersions_lazy = () -> Arrays.asList(Transfer29.mmRequestedSettlementDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected DateAndDateTimeChoice effectiveSettlementDate;
	/**
	 * Date and time at which the securities were exchanged at the International
	 * Central Securities Depository (ICSD) or Central Securities Depository
	 * (CSD).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementDate
	 * SecuritiesSettlement.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer26
	 * Transfer26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the securities were exchanged at the International Central Securities Depository (ICSD) or Central Securities Depository (CSD)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmEffectiveSettlementDate
	 * Transfer29.mmEffectiveSettlementDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEffectiveSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementDate;
			componentContext_lazy = () -> Transfer26.mmObject();
			isDerived = false;
			xmlTag = "FctvSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDate";
			definition = "Date and time at which the securities were exchanged at the International Central Securities Depository (ICSD) or Central Securities Depository (CSD).";
			nextVersions_lazy = () -> Arrays.asList(Transfer29.mmEffectiveSettlementDate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected DateAndDateTimeChoice tradeDate;
	/**
	 * Date and time at which a transaction is completed and cleared, ie,
	 * securities are delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer26
	 * Transfer26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a transaction is completed and cleared, ie, securities are delivered."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer29#mmTradeDate
	 * Transfer29.mmTradeDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> Transfer26.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Date and time at which a transaction is completed and cleared, ie, securities are delivered.";
			nextVersions_lazy = () -> Arrays.asList(Transfer29.mmTradeDate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected ISODate transferOrderDateForm;
	/**
	 * Identifies in which date the investor signed the transfer order form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer26
	 * Transfer26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfOrdrDtForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferOrderDateForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies in which date the investor signed the transfer order form."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmTransferOrderDateForm
	 * Transfer29.mmTransferOrderDateForm}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferOrderDateForm = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> Transfer26.mmObject();
			isDerived = false;
			xmlTag = "TrfOrdrDtForm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferOrderDateForm";
			definition = "Identifies in which date the investor signed the transfer order form.";
			nextVersions_lazy = () -> Arrays.asList(Transfer29.mmTransferOrderDateForm);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected TransferReason1 transferReason;
	/**
	 * Specifies the reason for the assets transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TransferReason1
	 * TransferReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferReason
	 * SecuritiesTransfer.mmTransferReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer26
	 * Transfer26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason for the assets transfer."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmTransferReason
	 * Transfer29.mmTransferReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferReason;
			componentContext_lazy = () -> Transfer26.mmObject();
			isDerived = false;
			xmlTag = "TrfRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferReason";
			definition = "Specifies the reason for the assets transfer.";
			nextVersions_lazy = () -> Arrays.asList(Transfer29.mmTransferReason);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransferReason1.mmObject();
		}
	};
	protected List<HoldingsPlanType1Code> holdingsPlanType;
	/**
	 * Identifies whether or not saving plan or withdrawal or switch plan are
	 * included in the holdings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingsPlanType1Code
	 * HoldingsPlanType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmHoldingsPlanType
	 * SecuritiesSettlement.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer26
	 * Transfer26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldgsPlanTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingsPlanType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether or not saving plan or withdrawal or switch plan are included in the holdings."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmHoldingsPlanType
	 * Transfer29.mmHoldingsPlanType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHoldingsPlanType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmHoldingsPlanType;
			componentContext_lazy = () -> Transfer26.mmObject();
			isDerived = false;
			xmlTag = "HldgsPlanTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingsPlanType";
			definition = "Identifies whether or not saving plan or withdrawal or switch plan are included in the holdings.";
			nextVersions_lazy = () -> Arrays.asList(Transfer29.mmHoldingsPlanType);
			maxOccurs = 3;
			minOccurs = 0;
			simpleType_lazy = () -> HoldingsPlanType1Code.mmObject();
		}
	};
	protected FinancialInstrument13 financialInstrumentDetails;
	/**
	 * Information related to the financial instrument received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument13
	 * FinancialInstrument13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer26
	 * Transfer26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the financial instrument received."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmFinancialInstrumentDetails
	 * Transfer29.mmFinancialInstrumentDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinancialInstrumentDetails = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> Transfer26.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Information related to the financial instrument received.";
			nextVersions_lazy = () -> Arrays.asList(Transfer29.mmFinancialInstrumentDetails);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.FinancialInstrument13.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1 totalUnitsNumber;
	/**
	 * Total quantity of securities settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity1
	 * FinancialInstrumentQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
	 * SecuritiesTransfer.mmTransferredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer26
	 * Transfer26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlUnitsNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of securities settled."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmTotalUnitsNumber
	 * Transfer29.mmTotalUnitsNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalUnitsNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferredQuantity;
			componentContext_lazy = () -> Transfer26.mmObject();
			isDerived = false;
			xmlTag = "TtlUnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumber";
			definition = "Total quantity of securities settled.";
			nextVersions_lazy = () -> Arrays.asList(Transfer29.mmTotalUnitsNumber);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentQuantity1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Unit3> unitsDetails;
	/**
	 * Information about the units to be transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Unit3 Unit3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
	 * SecuritiesTransfer.mmTransferredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer26
	 * Transfer26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitsDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the units to be transferred."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer29#mmUnitsDetails
	 * Transfer29.mmUnitsDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnitsDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferredQuantity;
			componentContext_lazy = () -> Transfer26.mmObject();
			isDerived = false;
			xmlTag = "UnitsDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsDetails";
			definition = "Information about the units to be transferred.";
			nextVersions_lazy = () -> Arrays.asList(Transfer29.mmUnitsDetails);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Unit3.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAnd13DecimalAmount averagePrice;
	/**
	 * Value of a security, as booked in an account. Book value is often
	 * different from the current market value of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd13DecimalAmount
	 * ActiveOrHistoricCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmBookValue
	 * AssetHolding.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer26
	 * Transfer26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvrgPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AveragePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of a security, as booked in an account. Book value is often different from the current market value of the security."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer29#mmAveragePrice
	 * Transfer29.mmAveragePrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAveragePrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmBookValue;
			componentContext_lazy = () -> Transfer26.mmObject();
			isDerived = false;
			xmlTag = "AvrgPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AveragePrice";
			definition = "Value of a security, as booked in an account. Book value is often different from the current market value of the security.";
			nextVersions_lazy = () -> Arrays.asList(Transfer29.mmAveragePrice);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	protected CurrencyCode transferCurrency;
	/**
	 * Identifies the currency to be used to transfer the holdings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmTransferCurrency
	 * SecuritiesDeliveryObligation.mmTransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer26
	 * Transfer26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the currency to be used to transfer the holdings."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmTransferCurrency
	 * Transfer29.mmTransferCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesDeliveryObligation.mmTransferCurrency;
			componentContext_lazy = () -> Transfer26.mmObject();
			isDerived = false;
			xmlTag = "TrfCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferCurrency";
			definition = "Identifies the currency to be used to transfer the holdings.";
			nextVersions_lazy = () -> Arrays.asList(Transfer29.mmTransferCurrency);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected YesNoIndicator ownAccountTransferIndicator;
	/**
	 * Indicates whether the transfer results in a change of beneficial owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmOwnAccountTransferIndicator
	 * SecuritiesTransfer.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer26
	 * Transfer26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OwnAcctTrfInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnAccountTransferIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transfer results in a change of beneficial owner."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmOwnAccountTransferIndicator
	 * Transfer29.mmOwnAccountTransferIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOwnAccountTransferIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmOwnAccountTransferIndicator;
			componentContext_lazy = () -> Transfer26.mmObject();
			isDerived = false;
			xmlTag = "OwnAcctTrfInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnAccountTransferIndicator";
			definition = "Indicates whether the transfer results in a change of beneficial owner.";
			nextVersions_lazy = () -> Arrays.asList(Transfer29.mmOwnAccountTransferIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max350Text nonStandardSettlementInformation;
	/**
	 * Additional specific settlement information for non-regulated traded
	 * funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmNonStandardSettlementInformation
	 * InvestmentFundOrderExecution.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer26
	 * Transfer26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonStdSttlmInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonStandardSettlementInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional specific settlement information for non-regulated traded funds."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmNonStandardSettlementInformation
	 * Transfer29.mmNonStandardSettlementInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNonStandardSettlementInformation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmNonStandardSettlementInformation;
			componentContext_lazy = () -> Transfer26.mmObject();
			isDerived = false;
			xmlTag = "NonStdSttlmInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandardSettlementInformation";
			definition = "Additional specific settlement information for non-regulated traded funds.";
			nextVersions_lazy = () -> Arrays.asList(Transfer29.mmNonStandardSettlementInformation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected PartyIdentificationAndAccount93 receivingAgentDetails;
	/**
	 * Party that receives securities from the delivering agent via the place of
	 * settlement, for example, securities central depository.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount93
	 * PartyIdentificationAndAccount93}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer26
	 * Transfer26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgAgtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingAgentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that receives securities from the delivering agent via the place of settlement, for example, securities central depository."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmReceivingAgentDetails
	 * Transfer29.mmReceivingAgentDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReceivingAgentDetails = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Transfer26.mmObject();
			isDerived = false;
			xmlTag = "RcvgAgtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingAgentDetails";
			definition = "Party that receives securities from the delivering agent via the place of settlement, for example, securities central depository.";
			nextVersions_lazy = () -> Arrays.asList(Transfer29.mmReceivingAgentDetails);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount93.mmObject();
		}
	};
	protected PartyIdentificationAndAccount93 deliveringAgentDetails;
	/**
	 * Party that delivers securities to the receiving agent at the place of
	 * settlement, for example, a central securities depository.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount93
	 * PartyIdentificationAndAccount93}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer26
	 * Transfer26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgAgtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringAgentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that delivers securities to the receiving agent at the place of settlement, for example, a central securities depository."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmDeliveringAgentDetails
	 * Transfer29.mmDeliveringAgentDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeliveringAgentDetails = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Transfer26.mmObject();
			isDerived = false;
			xmlTag = "DlvrgAgtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringAgentDetails";
			definition = "Party that delivers securities to the receiving agent at the place of settlement, for example, a central securities depository.";
			nextVersions_lazy = () -> Arrays.asList(Transfer29.mmDeliveringAgentDetails);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount93.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Transfer26.mmTransferConfirmationReference, Transfer26.mmTransferReference, Transfer26.mmClientReference, Transfer26.mmCounterpartyReference, Transfer26.mmEffectiveTransferDate,
						Transfer26.mmRequestedSettlementDate, Transfer26.mmEffectiveSettlementDate, Transfer26.mmTradeDate, Transfer26.mmTransferOrderDateForm, Transfer26.mmTransferReason, Transfer26.mmHoldingsPlanType,
						Transfer26.mmFinancialInstrumentDetails, Transfer26.mmTotalUnitsNumber, Transfer26.mmUnitsDetails, Transfer26.mmAveragePrice, Transfer26.mmTransferCurrency, Transfer26.mmOwnAccountTransferIndicator,
						Transfer26.mmNonStandardSettlementInformation, Transfer26.mmReceivingAgentDetails, Transfer26.mmDeliveringAgentDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(TransferInConfirmationV04.mmTransferDetails);
				trace_lazy = () -> SecuritiesTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "Transfer26";
				definition = "Completion of a securities settlement instruction, wherein securities are delivered/debited from a securities account and received/credited to the designated securities account.";
				nextVersions_lazy = () -> Arrays.asList(Transfer29.mmObject());
				previousVersion_lazy = () -> Transfer18.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TrfConfRef", required = true)
	public Max35Text getTransferConfirmationReference() {
		return transferConfirmationReference;
	}

	public void setTransferConfirmationReference(Max35Text transferConfirmationReference) {
		this.transferConfirmationReference = transferConfirmationReference;
	}

	@XmlElement(name = "TrfRef", required = true)
	public Max35Text getTransferReference() {
		return transferReference;
	}

	public void setTransferReference(Max35Text transferReference) {
		this.transferReference = transferReference;
	}

	@XmlElement(name = "ClntRef")
	public Max35Text getClientReference() {
		return clientReference;
	}

	public void setClientReference(Max35Text clientReference) {
		this.clientReference = clientReference;
	}

	@XmlElement(name = "CtrPtyRef")
	public AdditionalReference2 getCounterpartyReference() {
		return counterpartyReference;
	}

	public void setCounterpartyReference(com.tools20022.repository.msg.AdditionalReference2 counterpartyReference) {
		this.counterpartyReference = counterpartyReference;
	}

	@XmlElement(name = "FctvTrfDt", required = true)
	public DateAndDateTimeChoice getEffectiveTransferDate() {
		return effectiveTransferDate;
	}

	public void setEffectiveTransferDate(DateAndDateTimeChoice effectiveTransferDate) {
		this.effectiveTransferDate = effectiveTransferDate;
	}

	@XmlElement(name = "ReqdSttlmDt")
	public ISODate getRequestedSettlementDate() {
		return requestedSettlementDate;
	}

	public void setRequestedSettlementDate(ISODate requestedSettlementDate) {
		this.requestedSettlementDate = requestedSettlementDate;
	}

	@XmlElement(name = "FctvSttlmDt")
	public DateAndDateTimeChoice getEffectiveSettlementDate() {
		return effectiveSettlementDate;
	}

	public void setEffectiveSettlementDate(DateAndDateTimeChoice effectiveSettlementDate) {
		this.effectiveSettlementDate = effectiveSettlementDate;
	}

	@XmlElement(name = "TradDt")
	public DateAndDateTimeChoice getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(DateAndDateTimeChoice tradeDate) {
		this.tradeDate = tradeDate;
	}

	@XmlElement(name = "TrfOrdrDtForm")
	public ISODate getTransferOrderDateForm() {
		return transferOrderDateForm;
	}

	public void setTransferOrderDateForm(ISODate transferOrderDateForm) {
		this.transferOrderDateForm = transferOrderDateForm;
	}

	@XmlElement(name = "TrfRsn")
	public TransferReason1 getTransferReason() {
		return transferReason;
	}

	public void setTransferReason(TransferReason1 transferReason) {
		this.transferReason = transferReason;
	}

	@XmlElement(name = "HldgsPlanTp")
	public List<HoldingsPlanType1Code> getHoldingsPlanType() {
		return holdingsPlanType;
	}

	public void setHoldingsPlanType(List<HoldingsPlanType1Code> holdingsPlanType) {
		this.holdingsPlanType = holdingsPlanType;
	}

	@XmlElement(name = "FinInstrmDtls", required = true)
	public FinancialInstrument13 getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public void setFinancialInstrumentDetails(com.tools20022.repository.msg.FinancialInstrument13 financialInstrumentDetails) {
		this.financialInstrumentDetails = financialInstrumentDetails;
	}

	@XmlElement(name = "TtlUnitsNb", required = true)
	public FinancialInstrumentQuantity1 getTotalUnitsNumber() {
		return totalUnitsNumber;
	}

	public void setTotalUnitsNumber(com.tools20022.repository.msg.FinancialInstrumentQuantity1 totalUnitsNumber) {
		this.totalUnitsNumber = totalUnitsNumber;
	}

	@XmlElement(name = "UnitsDtls")
	public List<Unit3> getUnitsDetails() {
		return unitsDetails;
	}

	public void setUnitsDetails(List<com.tools20022.repository.msg.Unit3> unitsDetails) {
		this.unitsDetails = unitsDetails;
	}

	@XmlElement(name = "AvrgPric")
	public ActiveOrHistoricCurrencyAnd13DecimalAmount getAveragePrice() {
		return averagePrice;
	}

	public void setAveragePrice(ActiveOrHistoricCurrencyAnd13DecimalAmount averagePrice) {
		this.averagePrice = averagePrice;
	}

	@XmlElement(name = "TrfCcy")
	public CurrencyCode getTransferCurrency() {
		return transferCurrency;
	}

	public void setTransferCurrency(CurrencyCode transferCurrency) {
		this.transferCurrency = transferCurrency;
	}

	@XmlElement(name = "OwnAcctTrfInd")
	public YesNoIndicator getOwnAccountTransferIndicator() {
		return ownAccountTransferIndicator;
	}

	public void setOwnAccountTransferIndicator(YesNoIndicator ownAccountTransferIndicator) {
		this.ownAccountTransferIndicator = ownAccountTransferIndicator;
	}

	@XmlElement(name = "NonStdSttlmInf")
	public Max350Text getNonStandardSettlementInformation() {
		return nonStandardSettlementInformation;
	}

	public void setNonStandardSettlementInformation(Max350Text nonStandardSettlementInformation) {
		this.nonStandardSettlementInformation = nonStandardSettlementInformation;
	}

	@XmlElement(name = "RcvgAgtDtls")
	public PartyIdentificationAndAccount93 getReceivingAgentDetails() {
		return receivingAgentDetails;
	}

	public void setReceivingAgentDetails(com.tools20022.repository.msg.PartyIdentificationAndAccount93 receivingAgentDetails) {
		this.receivingAgentDetails = receivingAgentDetails;
	}

	@XmlElement(name = "DlvrgAgtDtls")
	public PartyIdentificationAndAccount93 getDeliveringAgentDetails() {
		return deliveringAgentDetails;
	}

	public void setDeliveringAgentDetails(com.tools20022.repository.msg.PartyIdentificationAndAccount93 deliveringAgentDetails) {
		this.deliveringAgentDetails = deliveringAgentDetails;
	}
}