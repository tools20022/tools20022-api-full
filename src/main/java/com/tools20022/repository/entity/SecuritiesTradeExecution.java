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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.OffMarketCode;
import com.tools20022.repository.codeset.ProcessingPositionCode;
import com.tools20022.repository.codeset.ReportingCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Transaction between two counterparties in which they agree to buy and sell a
 * financial instrument. A trade transaction occurs with the matching of the two
 * counterparties orders. There could be several trade transactions necessary to
 * execute the trade.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesTradeExecution"
 * src="doc-files/SecuritiesTradeExecution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Reporting2Choice
 * Reporting2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Reporting3Choice
 * Reporting3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Reporting5Choice
 * Reporting5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OffMarket1Choice
 * OffMarket1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Reporting1Choice
 * Reporting1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Reporting4Choice
 * Reporting4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Reporting6Choice
 * Reporting6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Reporting7Choice
 * Reporting7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Reporting8Choice
 * Reporting8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Reporting9Choice
 * Reporting9Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSecuritiesTradeExecution
 * SecuritiesPricing.mmSecuritiesTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmExecutedSecuritiesTrade
 * PaymentObligation.mmExecutedSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesTradeExecution
 * SecuritiesQuantity.mmSecuritiesTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradingExecution
 * SecuritiesTrade.mmTradingExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesTradeExecution
 * SecuritiesSettlement.mmSecuritiesTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmSecuritiesTradeExecution
 * SecuritiesDeliveryObligation.mmSecuritiesTradeExecution}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
 * InvestmentFundOrderExecution}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmStampDutyIndicator
 * SecuritiesTradeExecution.mmStampDutyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmProcessingPosition
 * SecuritiesTradeExecution.mmProcessingPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmDealPrice
 * SecuritiesTradeExecution.mmDealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmMarginAmount
 * SecuritiesTradeExecution.mmMarginAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmExecutedTradeQuantity
 * SecuritiesTradeExecution.mmExecutedTradeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmOffMarketReason
 * SecuritiesTradeExecution.mmOffMarketReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmRelatedTrade
 * SecuritiesTradeExecution.mmRelatedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmDealExecutionAmount
 * SecuritiesTradeExecution.mmDealExecutionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmPaymentObligation
 * SecuritiesTradeExecution.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesDeliveryObligation
 * SecuritiesTradeExecution.mmSecuritiesDeliveryObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmReportingType
 * SecuritiesTradeExecution.mmReportingType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTradeExecution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Transaction between two counterparties in which they agree to buy and sell a financial instrument. A trade transaction occurs with the matching of the two counterparties orders. There could be several trade transactions necessary to execute the trade."
 * </li>
 * </ul>
 */
public class SecuritiesTradeExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator stampDutyIndicator;
	/**
	 * Whether the net proceeds include stamp duty amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation4#mmStampDutyIndicator
	 * DeliverInformation4.mmStampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation4#mmStampDutyIndicator
	 * ReceiveInformation4.mmStampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection32#mmStampDutyIndicator
	 * AmountAndDirection32.mmStampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection33#mmStampDutyIndicator
	 * AmountAndDirection33.mmStampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation3#mmStampDutyIndicator
	 * DeliverInformation3.mmStampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation3#mmStampDutyIndicator
	 * ReceiveInformation3.mmStampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection2#mmStampDutyIndicator
	 * AmountAndDirection2.mmStampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection16#mmStampDutyIndicator
	 * AmountAndDirection16.mmStampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmStampDutyIndicator
	 * SettlementDetails43.mmStampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection28#mmStampDutyIndicator
	 * AmountAndDirection28.mmStampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection36#mmStampDutyIndicator
	 * AmountAndDirection36.mmStampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection37#mmStampDutyIndicator
	 * AmountAndDirection37.mmStampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection38#mmStampDutyIndicator
	 * AmountAndDirection38.mmStampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection40#mmStampDutyIndicator
	 * AmountAndDirection40.mmStampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection46#mmStampDutyIndicator
	 * AmountAndDirection46.mmStampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection45#mmStampDutyIndicator
	 * AmountAndDirection45.mmStampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection60#mmStampDutyIndicator
	 * AmountAndDirection60.mmStampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection85#mmStampDutyIndicator
	 * AmountAndDirection85.mmStampDutyIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDutyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Whether the net proceeds include stamp duty amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStampDutyIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DeliverInformation4.mmStampDutyIndicator, ReceiveInformation4.mmStampDutyIndicator, AmountAndDirection32.mmStampDutyIndicator, AmountAndDirection33.mmStampDutyIndicator,
					DeliverInformation3.mmStampDutyIndicator, ReceiveInformation3.mmStampDutyIndicator, AmountAndDirection2.mmStampDutyIndicator, AmountAndDirection16.mmStampDutyIndicator, SettlementDetails43.mmStampDutyIndicator,
					AmountAndDirection28.mmStampDutyIndicator, AmountAndDirection36.mmStampDutyIndicator, AmountAndDirection37.mmStampDutyIndicator, AmountAndDirection38.mmStampDutyIndicator, AmountAndDirection40.mmStampDutyIndicator,
					AmountAndDirection46.mmStampDutyIndicator, AmountAndDirection45.mmStampDutyIndicator, AmountAndDirection60.mmStampDutyIndicator, AmountAndDirection85.mmStampDutyIndicator);
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StampDutyIndicator";
			definition = "Whether the net proceeds include stamp duty amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected ProcessingPositionCode processingPosition;
	/**
	 * When the transaction is to be executed relative to a linked transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingPositionCode
	 * ProcessingPositionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When the transaction is to be executed relative to a linked transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmProcessingPosition = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProcessingPosition";
			definition = "When the transaction is to be executed relative to a linked transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProcessingPositionCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesSettlement> securitiesSettlement;
	/**
	 * Process of settling securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesTradeExecution
	 * SecuritiesSettlement.mmSecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References1Choice#mmSecuritiesSettlementTransactionIdentification
	 * References1Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Linkages1#mmLinkedQuantity
	 * Linkages1.mmLinkedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References12Choice#mmSecuritiesSettlementTransactionIdentification
	 * References12Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Linkages4#mmLinkedQuantity
	 * Linkages4.mmLinkedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References28Choice#mmSecuritiesSettlementTransactionIdentification
	 * References28Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References14Choice#mmSecuritiesSettlementTransactionIdentification
	 * References14Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Linkages9#mmLinkedQuantity
	 * Linkages9.mmLinkedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References16Choice#mmSecuritiesSettlementTransactionIdentification
	 * References16Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Linkages14#mmLinkedQuantity
	 * Linkages14.mmLinkedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References25Choice#mmSecuritiesSettlementTransactionIdentification
	 * References25Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Linkages17#mmLinkedQuantity
	 * Linkages17.mmLinkedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References32Choice#mmSecuritiesSettlementTransactionIdentification
	 * References32Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Linkages24#mmLinkedQuantity
	 * Linkages24.mmLinkedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References3Choice#mmSecuritiesSettlementTransactionConfirmationIdentification
	 * References3Choice.
	 * mmSecuritiesSettlementTransactionConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References3Choice#mmSecuritiesSettlementTransactionAllegementReportIdentification
	 * References3Choice.
	 * mmSecuritiesSettlementTransactionAllegementReportIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References3Choice#mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * References3Choice.
	 * mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References3Choice#mmSecuritiesSettlementTransactionGenerationNotificationIdentification
	 * References3Choice.
	 * mmSecuritiesSettlementTransactionGenerationNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References9Choice#mmSecuritiesSettlementTransactionConfirmationIdentification
	 * References9Choice.
	 * mmSecuritiesSettlementTransactionConfirmationIdentification}</li>
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
	 * {@linkplain com.tools20022.repository.choice.References9Choice#mmSecuritiesSettlementTransactionGenerationNotificationIdentification
	 * References9Choice.
	 * mmSecuritiesSettlementTransactionGenerationNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References18Choice#mmSecuritiesSettlementTransactionConfirmationIdentification
	 * References18Choice.
	 * mmSecuritiesSettlementTransactionConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References18Choice#mmSecuritiesSettlementTransactionAllegementReportIdentification
	 * References18Choice.
	 * mmSecuritiesSettlementTransactionAllegementReportIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References18Choice#mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * References18Choice.
	 * mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References18Choice#mmSecuritiesSettlementTransactionGenerationNotificationIdentification
	 * References18Choice.
	 * mmSecuritiesSettlementTransactionGenerationNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References20Choice#mmSecuritiesSettlementTransactionConfirmationIdentification
	 * References20Choice.
	 * mmSecuritiesSettlementTransactionConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References20Choice#mmSecuritiesSettlementTransactionAllegementReportIdentification
	 * References20Choice.
	 * mmSecuritiesSettlementTransactionAllegementReportIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References20Choice#mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * References20Choice.
	 * mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References20Choice#mmSecuritiesSettlementTransactionGenerationNotificationIdentification
	 * References20Choice.
	 * mmSecuritiesSettlementTransactionGenerationNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References29Choice#mmSecuritiesSettlementTransactionConfirmationIdentification
	 * References29Choice.
	 * mmSecuritiesSettlementTransactionConfirmationIdentification}</li>
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
	 * {@linkplain com.tools20022.repository.choice.References29Choice#mmSecuritiesSettlementTransactionGenerationNotificationIdentification
	 * References29Choice.
	 * mmSecuritiesSettlementTransactionGenerationNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References37Choice#mmSecuritiesSettlementTransactionConfirmationIdentification
	 * References37Choice.
	 * mmSecuritiesSettlementTransactionConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References37Choice#mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * References37Choice.
	 * mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References37Choice#mmSecuritiesSettlementTransactionGenerationNotificationIdentification
	 * References37Choice.
	 * mmSecuritiesSettlementTransactionGenerationNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References38Choice#mmSecuritiesSettlementTransactionConfirmationIdentification
	 * References38Choice.
	 * mmSecuritiesSettlementTransactionConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References38Choice#mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * References38Choice.
	 * mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References38Choice#mmSecuritiesSettlementTransactionGenerationNotificationIdentification
	 * References38Choice.
	 * mmSecuritiesSettlementTransactionGenerationNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References13Choice#mmSecuritiesSettlementTransactionIdentification
	 * References13Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References15Choice#mmSecuritiesSettlementTransactionIdentification
	 * References15Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References24Choice#mmSecuritiesSettlementTransactionIdentification
	 * References24Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References31Choice#mmSecuritiesSettlementTransactionIdentification
	 * References31Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Linkages7#mmLinkedQuantity
	 * Linkages7.mmLinkedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Linkages12#mmLinkedQuantity
	 * Linkages12.mmLinkedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#mmSettlementParameters
	 * TransactionDetails5.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#mmSettlementParameters
	 * TransactionDetails9.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#mmSettlementParameters
	 * TransactionDetails22.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#mmSettlementParameters
	 * TransactionDetails23.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#mmSettlementParameters
	 * TransactionDetails36.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#mmSettlementParameters
	 * TransactionDetails47.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#mmSettlementParameters
	 * TransactionDetails53.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#mmSettlementParameters
	 * TransactionDetails58.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#mmSettlementParameters
	 * TransactionDetails7.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#mmSettlementParameters
	 * TransactionDetails8.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#mmSettlementParameters
	 * TransactionDetails16.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#mmSettlementParameters
	 * TransactionDetails17.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#mmSettlementParameters
	 * TransactionDetails26.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#mmSettlementParameters
	 * TransactionDetails25.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#mmSettlementParameters
	 * TransactionDetails27.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#mmSettlementParameters
	 * TransactionDetails33.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#mmSettlementParameters
	 * TransactionDetails39.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#mmSettlementParameters
	 * TransactionDetails50.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#mmSettlementParameters
	 * TransactionDetails56.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#mmSettlementParameters
	 * TransactionDetails59.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#mmSettlementParameters
	 * TransactionDetails6.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#mmSettlementParameters
	 * TransactionDetails18.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#mmSettlementParameters
	 * TransactionDetails24.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#mmSettlementParameters
	 * TransactionDetails34.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#mmSettlementParameters
	 * TransactionDetails37.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#mmSettlementParameters
	 * TransactionDetails48.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#mmSettlementParameters
	 * TransactionDetails57.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#mmSettlementParameters
	 * TransactionDetails60.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#mmCurrencyToBuyOrSell
	 * Order16.mmCurrencyToBuyOrSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#mmCurrencyToBuyOrSell
	 * Order14.mmCurrencyToBuyOrSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmClosingAmountPerPiecesOfCollateral
	 * SecuritiesFinancing10.mmClosingAmountPerPiecesOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#mmSettlementAndCustodyDetails
	 * RedemptionOrder3.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmSettlementAndCustodyDetails
	 * RedemptionOrder5.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmSettlementAndCustodyDetails
	 * RedemptionExecution3.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmSettlementAndCustodyDetails
	 * RedemptionExecution5.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmSettlementAndCustodyDetails
	 * RedemptionOrder7.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#mmSettlementAndCustodyDetails
	 * RedemptionOrder4.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmSettlementAndCustodyDetails
	 * RedemptionOrder6.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmSettlementAndCustodyDetails
	 * RedemptionExecution4.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmSettlementAndCustodyDetails
	 * RedemptionExecution6.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmSettlementAndCustodyDetails
	 * RedemptionOrder8.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmSettlementAndCustodyDetails
	 * SubscriptionOrder3.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmSettlementAndCustodyDetails
	 * SubscriptionOrder5.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmSettlementAndCustodyDetails
	 * SubscriptionExecution3.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmSettlementAndCustodyDetails
	 * SubscriptionExecution5.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmSettlementAndCustodyDetails
	 * SubscriptionOrder7.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#mmSettlementAndCustodyDetails
	 * SubscriptionOrder4.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmSettlementAndCustodyDetails
	 * SubscriptionOrder6.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmSettlementAndCustodyDetails
	 * SubscriptionExecution4.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmSettlementAndCustodyDetails
	 * SubscriptionExecution6.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmSettlementAndCustodyDetails
	 * SubscriptionOrder8.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#mmSettlementAndCustodyDetails
	 * SwitchRedemptionLegExecution2.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#mmSettlementAndCustodyDetails
	 * SwitchRedemptionLegExecution3.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7#mmSettlementParameters
	 * SecuritiesTradeDetails7.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19#mmSettlementParameters
	 * SecuritiesTradeDetails19.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmQuantityAndAccountDetails
	 * SecuritiesTradeDetails4.mmQuantityAndAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmSettlementParameters
	 * SecuritiesTradeDetails4.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#mmQuantityAndAccountDetails
	 * SecuritiesTradeDetails17.mmQuantityAndAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#mmSettlementParameters
	 * SecuritiesTradeDetails17.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References4Choice#mmSecuritiesFinancingTransactionIdentification
	 * References4Choice.mmSecuritiesFinancingTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References4Choice#mmSecuritiesSettlementTransactionIdentification
	 * References4Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References22Choice#mmSecuritiesFinancingTransactionIdentification
	 * References22Choice.mmSecuritiesFinancingTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References22Choice#mmSecuritiesSettlementTransactionIdentification
	 * References22Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References2Choice#mmSecuritiesSettlementTransactionIdentification
	 * References2Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References2Choice#mmSecuritiesFinancingTransactionIdentification
	 * References2Choice.mmSecuritiesFinancingTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmQuantityAndAccountDetails
	 * SecuritiesTradeDetails10.mmQuantityAndAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmSettlementParameters
	 * SecuritiesTradeDetails10.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#mmQuantityAndAccountDetails
	 * SecuritiesTradeDetails22.mmQuantityAndAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#mmSettlementParameters
	 * SecuritiesTradeDetails22.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#mmQuantityAndAccountDetails
	 * SecuritiesTradeDetails23.mmQuantityAndAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#mmSettlementParameters
	 * SecuritiesTradeDetails23.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#mmQuantityAndAccountDetails
	 * SecuritiesTradeDetails29.mmQuantityAndAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#mmSettlementParameters
	 * SecuritiesTradeDetails29.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References8Choice#mmSecuritiesSettlementTransactionIdentification
	 * References8Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References8Choice#mmSecuritiesFinancingTransactionIdentification
	 * References8Choice.mmSecuritiesFinancingTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References17Choice#mmSecuritiesSettlementTransactionIdentification
	 * References17Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References17Choice#mmSecuritiesFinancingTransactionIdentification
	 * References17Choice.mmSecuritiesFinancingTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References7Choice#mmSecuritiesFinancingTransactionIdentification
	 * References7Choice.mmSecuritiesFinancingTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References7Choice#mmSecuritiesSettlementTransactionIdentification
	 * References7Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References23Choice#mmSecuritiesFinancingTransactionIdentification
	 * References23Choice.mmSecuritiesFinancingTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References23Choice#mmSecuritiesSettlementTransactionIdentification
	 * References23Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References30Choice#mmSecuritiesFinancingTransactionIdentification
	 * References30Choice.mmSecuritiesFinancingTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References30Choice#mmSecuritiesSettlementTransactionIdentification
	 * References30Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14#mmSettlementParameters
	 * SecuritiesTradeDetails14.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20#mmSettlementParameters
	 * SecuritiesTradeDetails20.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmSettlementParameters
	 * SecuritiesTradeDetails24.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30#mmSettlementParameters
	 * SecuritiesTradeDetails30.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg3#mmSettlementDetails
	 * TradeLeg3.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmSettlementDetails
	 * TradeLeg6.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#mmSettlementAndCustodyDetails
	 * RedemptionOrder11.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmSettlementAndCustodyDetails
	 * RedemptionExecution12.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#mmSettlementAndCustodyDetails
	 * SubscriptionOrder11.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmSettlementAndCustodyDetails
	 * SubscriptionExecution9.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References34Choice#mmSecuritiesSettlementTransactionIdentification
	 * References34Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#mmSettlementParameters
	 * TransactionDetails51.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification2#mmRequestDetails
	 * IntraBalanceModification2.mmRequestDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmSettlementDetails
	 * Order9.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuoteEntry2#mmSettlementDetails
	 * QuoteEntry2.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuoteEntry1#mmSettlementDetails
	 * QuoteEntry1.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DisclosedBid1#mmSettlementDetails
	 * DisclosedBid1.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BidResponsePrice1#mmSettlementDetails
	 * BidResponsePrice1.mmSettlementDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmSettlementDetails
	 * Order6.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#mmSettlementParameters
	 * TransactionDetails61.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#mmSettlementParameters
	 * TransactionDetails62.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#mmSettlementParameters
	 * TransactionDetails63.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#mmQuantityAndAccountDetails
	 * SecuritiesTradeDetails35.mmQuantityAndAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#mmSettlementParameters
	 * SecuritiesTradeDetails35.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmCurrencyToBuyOrSell
	 * Order17.mmCurrencyToBuyOrSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmCurrencyToBuyOrSell
	 * Order18.mmCurrencyToBuyOrSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#mmSettlementParameters
	 * TransactionDetails66.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#mmQuantityAndAccountDetails
	 * SecuritiesTradeDetails42.mmQuantityAndAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#mmSettlementParameters
	 * SecuritiesTradeDetails42.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#mmSettlementParameters
	 * TransactionDetails67.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#mmSettlementParameters
	 * TransactionDetails68.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#mmSettlementParameters
	 * TransactionDetails70.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#mmSettlementParameters
	 * TransactionDetails69.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmSettlementDetails
	 * TradeLeg9.mmSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#mmSettlementParameters
	 * TransactionDetails71.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#mmSettlementParameters
	 * TransactionDetails72.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#mmQuantityAndAccountDetails
	 * SecuritiesTradeDetails49.mmQuantityAndAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#mmSettlementParameters
	 * SecuritiesTradeDetails49.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#mmSettlementParameters
	 * TransactionDetails79.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmSettlementParameters
	 * SecuritiesTradeDetails48.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#mmSettlementParameters
	 * TransactionDetails75.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmSettlementParameters
	 * TransactionDetails78.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References45Choice#mmSecuritiesSettlementTransactionIdentification
	 * References45Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References45Choice#mmSecuritiesFinancingTransactionIdentification
	 * References45Choice.mmSecuritiesFinancingTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Linkages37#mmLinkedQuantity
	 * Linkages37.mmLinkedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References43Choice#mmSecuritiesSettlementTransactionConfirmationIdentification
	 * References43Choice.
	 * mmSecuritiesSettlementTransactionConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References43Choice#mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * References43Choice.
	 * mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References43Choice#mmSecuritiesSettlementTransactionGenerationNotificationIdentification
	 * References43Choice.
	 * mmSecuritiesSettlementTransactionGenerationNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Linkages38#mmLinkedQuantity
	 * Linkages38.mmLinkedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References46Choice#mmSecuritiesSettlementTransactionIdentification
	 * References46Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References41Choice#mmSecuritiesSettlementTransactionIdentification
	 * References41Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References44Choice#mmSecuritiesFinancingTransactionIdentification
	 * References44Choice.mmSecuritiesFinancingTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References44Choice#mmSecuritiesSettlementTransactionIdentification
	 * References44Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References47Choice#mmSecuritiesSettlementTransactionIdentification
	 * References47Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57#mmSettlementParameters
	 * SecuritiesTradeDetails57.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Linkages43#mmLinkedQuantity
	 * Linkages43.mmLinkedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References60Choice#mmSecuritiesSettlementTransactionIdentification
	 * References60Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References60Choice#mmSecuritiesFinancingTransactionIdentification
	 * References60Choice.mmSecuritiesFinancingTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#mmQuantityAndAccountDetails
	 * SecuritiesTradeDetails61.mmQuantityAndAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#mmSettlementParameters
	 * SecuritiesTradeDetails61.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References53Choice#mmSecuritiesSettlementTransactionConfirmationIdentification
	 * References53Choice.
	 * mmSecuritiesSettlementTransactionConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References53Choice#mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * References53Choice.
	 * mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References53Choice#mmSecuritiesSettlementTransactionGenerationNotificationIdentification
	 * References53Choice.
	 * mmSecuritiesSettlementTransactionGenerationNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#mmSettlementParameters
	 * TransactionDetails87.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References58Choice#mmSecuritiesSettlementTransactionIdentification
	 * References58Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#mmSettlementParameters
	 * TransactionDetails91.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References50Choice#mmSecuritiesSettlementTransactionIdentification
	 * References50Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#mmSettlementParameters
	 * TransactionDetails90.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Linkages48#mmLinkedQuantity
	 * Linkages48.mmLinkedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References59Choice#mmSecuritiesFinancingTransactionIdentification
	 * References59Choice.mmSecuritiesFinancingTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References59Choice#mmSecuritiesSettlementTransactionIdentification
	 * References59Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References54Choice#mmSecuritiesSettlementTransactionIdentification
	 * References54Choice.mmSecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmSettlementAndCustodyDetails
	 * RedemptionOrder14.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmSettlementAndCustodyDetails
	 * SubscriptionExecution13.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmSettlementAndCustodyDetails
	 * SubscriptionExecution12.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmSettlementAndCustodyDetails
	 * SubscriptionOrder15.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmSettlementAndCustodyDetails
	 * RedemptionOrder15.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmSettlementAndCustodyDetails
	 * RedemptionExecution16.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmSettlementAndCustodyDetails
	 * SubscriptionOrder14.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmSettlementAndCustodyDetails
	 * RedemptionExecution15.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmSettlementAndCustodyDetails
	 * SwitchRedemptionLegExecution4.mmSettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmQuantityAndAccountDetails
	 * SecuritiesTradeDetails68.mmQuantityAndAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmSettlementParameters
	 * SecuritiesTradeDetails68.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmSettlementParameters
	 * TransactionDetails97.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmSettlementParameters
	 * TransactionDetails96.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmSettlementParameters
	 * TransactionDetails95.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#mmQuantityAndAccountDetails
	 * SecuritiesTradeDetails69.mmQuantityAndAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#mmSettlementParameters
	 * SecuritiesTradeDetails69.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#mmSettlementParameters
	 * TransactionDetails100.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#mmSettlementParameters
	 * TransactionDetails99.mmSettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#mmSettlementParameters
	 * TransactionDetails98.mmSettlementParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Process of settling securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(References1Choice.mmSecuritiesSettlementTransactionIdentification, Linkages1.mmLinkedQuantity, References12Choice.mmSecuritiesSettlementTransactionIdentification,
					Linkages4.mmLinkedQuantity, References28Choice.mmSecuritiesSettlementTransactionIdentification, References14Choice.mmSecuritiesSettlementTransactionIdentification, Linkages9.mmLinkedQuantity,
					References16Choice.mmSecuritiesSettlementTransactionIdentification, Linkages14.mmLinkedQuantity, References25Choice.mmSecuritiesSettlementTransactionIdentification, Linkages17.mmLinkedQuantity,
					References32Choice.mmSecuritiesSettlementTransactionIdentification, Linkages24.mmLinkedQuantity, References3Choice.mmSecuritiesSettlementTransactionConfirmationIdentification,
					References3Choice.mmSecuritiesSettlementTransactionAllegementReportIdentification, References3Choice.mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification,
					References3Choice.mmSecuritiesSettlementTransactionGenerationNotificationIdentification, References9Choice.mmSecuritiesSettlementTransactionConfirmationIdentification,
					References9Choice.mmSecuritiesSettlementTransactionAllegementReportIdentification, References9Choice.mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification,
					References9Choice.mmSecuritiesSettlementTransactionGenerationNotificationIdentification, References18Choice.mmSecuritiesSettlementTransactionConfirmationIdentification,
					References18Choice.mmSecuritiesSettlementTransactionAllegementReportIdentification, References18Choice.mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification,
					References18Choice.mmSecuritiesSettlementTransactionGenerationNotificationIdentification, References20Choice.mmSecuritiesSettlementTransactionConfirmationIdentification,
					References20Choice.mmSecuritiesSettlementTransactionAllegementReportIdentification, References20Choice.mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification,
					References20Choice.mmSecuritiesSettlementTransactionGenerationNotificationIdentification, References29Choice.mmSecuritiesSettlementTransactionConfirmationIdentification,
					References29Choice.mmSecuritiesSettlementTransactionAllegementReportIdentification, References29Choice.mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification,
					References29Choice.mmSecuritiesSettlementTransactionGenerationNotificationIdentification, References37Choice.mmSecuritiesSettlementTransactionConfirmationIdentification,
					References37Choice.mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification, References37Choice.mmSecuritiesSettlementTransactionGenerationNotificationIdentification,
					References38Choice.mmSecuritiesSettlementTransactionConfirmationIdentification, References38Choice.mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification,
					References38Choice.mmSecuritiesSettlementTransactionGenerationNotificationIdentification, References13Choice.mmSecuritiesSettlementTransactionIdentification,
					References15Choice.mmSecuritiesSettlementTransactionIdentification, References24Choice.mmSecuritiesSettlementTransactionIdentification, References31Choice.mmSecuritiesSettlementTransactionIdentification,
					Linkages7.mmLinkedQuantity, Linkages12.mmLinkedQuantity, TransactionDetails5.mmSettlementParameters, TransactionDetails9.mmSettlementParameters, TransactionDetails22.mmSettlementParameters,
					TransactionDetails23.mmSettlementParameters, TransactionDetails36.mmSettlementParameters, TransactionDetails47.mmSettlementParameters, TransactionDetails53.mmSettlementParameters,
					TransactionDetails58.mmSettlementParameters, TransactionDetails7.mmSettlementParameters, TransactionDetails8.mmSettlementParameters, TransactionDetails16.mmSettlementParameters,
					TransactionDetails17.mmSettlementParameters, TransactionDetails26.mmSettlementParameters, TransactionDetails25.mmSettlementParameters, TransactionDetails27.mmSettlementParameters,
					TransactionDetails33.mmSettlementParameters, TransactionDetails39.mmSettlementParameters, TransactionDetails50.mmSettlementParameters, TransactionDetails56.mmSettlementParameters,
					TransactionDetails59.mmSettlementParameters, TransactionDetails6.mmSettlementParameters, TransactionDetails18.mmSettlementParameters, TransactionDetails24.mmSettlementParameters,
					TransactionDetails34.mmSettlementParameters, TransactionDetails37.mmSettlementParameters, TransactionDetails48.mmSettlementParameters, TransactionDetails57.mmSettlementParameters,
					TransactionDetails60.mmSettlementParameters, Order16.mmCurrencyToBuyOrSell, Order14.mmCurrencyToBuyOrSell, SecuritiesFinancing10.mmClosingAmountPerPiecesOfCollateral, RedemptionOrder3.mmSettlementAndCustodyDetails,
					RedemptionOrder5.mmSettlementAndCustodyDetails, RedemptionExecution3.mmSettlementAndCustodyDetails, RedemptionExecution5.mmSettlementAndCustodyDetails, RedemptionOrder7.mmSettlementAndCustodyDetails,
					RedemptionOrder4.mmSettlementAndCustodyDetails, RedemptionOrder6.mmSettlementAndCustodyDetails, RedemptionExecution4.mmSettlementAndCustodyDetails, RedemptionExecution6.mmSettlementAndCustodyDetails,
					RedemptionOrder8.mmSettlementAndCustodyDetails, SubscriptionOrder3.mmSettlementAndCustodyDetails, SubscriptionOrder5.mmSettlementAndCustodyDetails, SubscriptionExecution3.mmSettlementAndCustodyDetails,
					SubscriptionExecution5.mmSettlementAndCustodyDetails, SubscriptionOrder7.mmSettlementAndCustodyDetails, SubscriptionOrder4.mmSettlementAndCustodyDetails, SubscriptionOrder6.mmSettlementAndCustodyDetails,
					SubscriptionExecution4.mmSettlementAndCustodyDetails, SubscriptionExecution6.mmSettlementAndCustodyDetails, SubscriptionOrder8.mmSettlementAndCustodyDetails, SwitchRedemptionLegExecution2.mmSettlementAndCustodyDetails,
					SwitchRedemptionLegExecution3.mmSettlementAndCustodyDetails, SecuritiesTradeDetails7.mmSettlementParameters, SecuritiesTradeDetails19.mmSettlementParameters, SecuritiesTradeDetails4.mmQuantityAndAccountDetails,
					SecuritiesTradeDetails4.mmSettlementParameters, SecuritiesTradeDetails17.mmQuantityAndAccountDetails, SecuritiesTradeDetails17.mmSettlementParameters, References4Choice.mmSecuritiesFinancingTransactionIdentification,
					References4Choice.mmSecuritiesSettlementTransactionIdentification, References22Choice.mmSecuritiesFinancingTransactionIdentification, References22Choice.mmSecuritiesSettlementTransactionIdentification,
					References2Choice.mmSecuritiesSettlementTransactionIdentification, References2Choice.mmSecuritiesFinancingTransactionIdentification, SecuritiesTradeDetails10.mmQuantityAndAccountDetails,
					SecuritiesTradeDetails10.mmSettlementParameters, SecuritiesTradeDetails22.mmQuantityAndAccountDetails, SecuritiesTradeDetails22.mmSettlementParameters, SecuritiesTradeDetails23.mmQuantityAndAccountDetails,
					SecuritiesTradeDetails23.mmSettlementParameters, SecuritiesTradeDetails29.mmQuantityAndAccountDetails, SecuritiesTradeDetails29.mmSettlementParameters, References8Choice.mmSecuritiesSettlementTransactionIdentification,
					References8Choice.mmSecuritiesFinancingTransactionIdentification, References17Choice.mmSecuritiesSettlementTransactionIdentification, References17Choice.mmSecuritiesFinancingTransactionIdentification,
					References7Choice.mmSecuritiesFinancingTransactionIdentification, References7Choice.mmSecuritiesSettlementTransactionIdentification, References23Choice.mmSecuritiesFinancingTransactionIdentification,
					References23Choice.mmSecuritiesSettlementTransactionIdentification, References30Choice.mmSecuritiesFinancingTransactionIdentification, References30Choice.mmSecuritiesSettlementTransactionIdentification,
					SecuritiesTradeDetails14.mmSettlementParameters, SecuritiesTradeDetails20.mmSettlementParameters, SecuritiesTradeDetails24.mmSettlementParameters, SecuritiesTradeDetails30.mmSettlementParameters,
					TradeLeg3.mmSettlementDetails, TradeLeg6.mmSettlementDetails, RedemptionOrder11.mmSettlementAndCustodyDetails, RedemptionExecution12.mmSettlementAndCustodyDetails, SubscriptionOrder11.mmSettlementAndCustodyDetails,
					SubscriptionExecution9.mmSettlementAndCustodyDetails, References34Choice.mmSecuritiesSettlementTransactionIdentification, TransactionDetails51.mmSettlementParameters, IntraBalanceModification2.mmRequestDetails,
					Order9.mmSettlementDetails, QuoteEntry2.mmSettlementDetails, QuoteEntry1.mmSettlementDetails, DisclosedBid1.mmSettlementDetails, BidResponsePrice1.mmSettlementDetails, Order6.mmSettlementDetails,
					TransactionDetails61.mmSettlementParameters, TransactionDetails62.mmSettlementParameters, TransactionDetails63.mmSettlementParameters, SecuritiesTradeDetails35.mmQuantityAndAccountDetails,
					SecuritiesTradeDetails35.mmSettlementParameters, Order17.mmCurrencyToBuyOrSell, Order18.mmCurrencyToBuyOrSell, TransactionDetails66.mmSettlementParameters, SecuritiesTradeDetails42.mmQuantityAndAccountDetails,
					SecuritiesTradeDetails42.mmSettlementParameters, TransactionDetails67.mmSettlementParameters, TransactionDetails68.mmSettlementParameters, TransactionDetails70.mmSettlementParameters,
					TransactionDetails69.mmSettlementParameters, TradeLeg9.mmSettlementDetails, TransactionDetails71.mmSettlementParameters, TransactionDetails72.mmSettlementParameters, SecuritiesTradeDetails49.mmQuantityAndAccountDetails,
					SecuritiesTradeDetails49.mmSettlementParameters, TransactionDetails79.mmSettlementParameters, SecuritiesTradeDetails48.mmSettlementParameters, TransactionDetails75.mmSettlementParameters,
					TransactionDetails78.mmSettlementParameters, References45Choice.mmSecuritiesSettlementTransactionIdentification, References45Choice.mmSecuritiesFinancingTransactionIdentification, Linkages37.mmLinkedQuantity,
					References43Choice.mmSecuritiesSettlementTransactionConfirmationIdentification, References43Choice.mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification,
					References43Choice.mmSecuritiesSettlementTransactionGenerationNotificationIdentification, Linkages38.mmLinkedQuantity, References46Choice.mmSecuritiesSettlementTransactionIdentification,
					References41Choice.mmSecuritiesSettlementTransactionIdentification, References44Choice.mmSecuritiesFinancingTransactionIdentification, References44Choice.mmSecuritiesSettlementTransactionIdentification,
					References47Choice.mmSecuritiesSettlementTransactionIdentification, SecuritiesTradeDetails57.mmSettlementParameters, Linkages43.mmLinkedQuantity, References60Choice.mmSecuritiesSettlementTransactionIdentification,
					References60Choice.mmSecuritiesFinancingTransactionIdentification, SecuritiesTradeDetails61.mmQuantityAndAccountDetails, SecuritiesTradeDetails61.mmSettlementParameters,
					References53Choice.mmSecuritiesSettlementTransactionConfirmationIdentification, References53Choice.mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification,
					References53Choice.mmSecuritiesSettlementTransactionGenerationNotificationIdentification, TransactionDetails87.mmSettlementParameters, References58Choice.mmSecuritiesSettlementTransactionIdentification,
					TransactionDetails91.mmSettlementParameters, References50Choice.mmSecuritiesSettlementTransactionIdentification, TransactionDetails90.mmSettlementParameters, Linkages48.mmLinkedQuantity,
					References59Choice.mmSecuritiesFinancingTransactionIdentification, References59Choice.mmSecuritiesSettlementTransactionIdentification, References54Choice.mmSecuritiesSettlementTransactionIdentification,
					RedemptionOrder14.mmSettlementAndCustodyDetails, SubscriptionExecution13.mmSettlementAndCustodyDetails, SubscriptionExecution12.mmSettlementAndCustodyDetails, SubscriptionOrder15.mmSettlementAndCustodyDetails,
					RedemptionOrder15.mmSettlementAndCustodyDetails, RedemptionExecution16.mmSettlementAndCustodyDetails, SubscriptionOrder14.mmSettlementAndCustodyDetails, RedemptionExecution15.mmSettlementAndCustodyDetails,
					SwitchRedemptionLegExecution4.mmSettlementAndCustodyDetails, SecuritiesTradeDetails68.mmQuantityAndAccountDetails, SecuritiesTradeDetails68.mmSettlementParameters, TransactionDetails97.mmSettlementParameters,
					TransactionDetails96.mmSettlementParameters, TransactionDetails95.mmSettlementParameters, SecuritiesTradeDetails69.mmQuantityAndAccountDetails, SecuritiesTradeDetails69.mmSettlementParameters,
					TransactionDetails100.mmSettlementParameters, TransactionDetails99.mmSettlementParameters, TransactionDetails98.mmSettlementParameters);
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Process of settling securities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmSecuritiesTradeExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}
	};
	protected SecuritiesPricing dealPrice;
	/**
	 * Specifies the price of the traded financial instrument. This is the deal
	 * price of the individual trade transaction. If there is only one trade
	 * transaction for the execution of the trade, then the deal price could
	 * equal the executed trade price (unless, for example, the price includes
	 * commissions or rounding, or some other factor has been applied to the
	 * deal price or the executed trade price, or both).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSecuritiesTradeExecution
	 * SecuritiesPricing.mmSecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#mmDealPrice
	 * SecuritiesTradeDetails25.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#mmDealPrice
	 * SecuritiesTradeDetails26.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#mmDealPrice
	 * SecuritiesTradeDetails27.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#mmDealPrice
	 * SecuritiesTradeDetails28.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#mmDealPrice
	 * SecuritiesTradeDetails6.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails13#mmDealPrice
	 * SecuritiesTradeDetails13.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3#mmDealPrice
	 * SecuritiesTradeDetails3.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11#mmDealPrice
	 * SecuritiesTradeDetails11.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#mmDealPrice
	 * SecuritiesTradeDetails2.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#mmDealPrice
	 * SecuritiesTradeDetails16.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmDealPrice
	 * SecuritiesTradeDetails1.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#mmDealPrice
	 * SecuritiesTradeDetails15.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmRelatedPrice
	 * EntryTransaction1.mmRelatedPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmRelatedPrice
	 * EntryTransaction2.mmRelatedPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#mmRelatedPrice
	 * EntryTransaction3.mmRelatedPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmRelatedPrice
	 * EntryTransaction4.mmRelatedPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#mmExecutedTradePrice
	 * TransactionDetails3.mmExecutedTradePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails8#mmDealPrice
	 * SecuritiesTradeDetails8.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails18#mmDealPrice
	 * SecuritiesTradeDetails18.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmDealPrice
	 * SecuritiesTradeDetails4.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#mmDealPrice
	 * SecuritiesTradeDetails17.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails9#mmDealPrice
	 * SecuritiesTradeDetails9.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails21#mmDealPrice
	 * SecuritiesTradeDetails21.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmDealPrice
	 * SecuritiesTradeDetails10.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#mmDealPrice
	 * SecuritiesTradeDetails22.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#mmDealPrice
	 * SecuritiesTradeDetails23.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#mmDealPrice
	 * SecuritiesTradeDetails29.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation1#mmDealPrice
	 * SettlementObligation1.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation6#mmDealPrice
	 * SettlementObligation6.mmDealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg2#mmDealPrice
	 * TradeLeg2.mmDealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg5#mmDealPrice
	 * TradeLeg5.mmDealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg1#mmDealPrice
	 * TradeLeg1.mmDealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg3#mmDealPrice
	 * TradeLeg3.mmDealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg6#mmDealPrice
	 * TradeLeg6.mmDealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg4#mmDealPrice
	 * TradeLeg4.mmDealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg7#mmDealPrice
	 * TradeLeg7.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#mmDealPrice
	 * SecuritiesTradeDetails31.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmDealPrice
	 * SecuritiesTradeDetails33.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#mmDealPrice
	 * SecuritiesTradeDetails35.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#mmDealPrice
	 * SecuritiesTradeDetails38.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmDealPrice
	 * SecuritiesTradeDetails37.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails36#mmDealPrice
	 * SecuritiesTradeDetails36.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#mmDealPrice
	 * SecuritiesTradeDetails34.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#mmDealPrice
	 * SecuritiesTradeDetails32.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#mmDealPrice
	 * SecuritiesTradeDetails44.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails39#mmDealPrice
	 * SecuritiesTradeDetails39.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#mmDealPrice
	 * SecuritiesTradeDetails43.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails41#mmDealPrice
	 * SecuritiesTradeDetails41.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40#mmDealPrice
	 * SecuritiesTradeDetails40.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#mmDealPrice
	 * SecuritiesTradeDetails42.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#mmDealPrice
	 * SecuritiesTradeDetails46.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#mmDealPrice
	 * SecuritiesTradeDetails47.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmRelatedPrice
	 * EntryTransaction7.mmRelatedPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmDealPrice
	 * TradeLeg8.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#mmDealPrice
	 * SettlementObligation7.mmDealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg10#mmDealPrice
	 * TradeLeg10.mmDealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmDealPrice
	 * TradeLeg9.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmDealPrice
	 * UnsecuredMarketTransaction1.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#mmDealPrice
	 * SecuritiesTradeDetails49.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmDealPrice
	 * SecuritiesTradeDetails51.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#mmDealPrice
	 * SecuritiesTradeDetails53.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmDealPrice
	 * SecuritiesTradeDetails55.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmDealPrice
	 * SecuritiesTradeDetails56.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#mmDealPrice
	 * SecuritiesTradeDetails54.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmDealPrice
	 * SecuritiesTradeDetails52.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#mmDealPrice
	 * SecuritiesTradeDetails50.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmRelatedPrice
	 * EntryTransaction8.mmRelatedPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59#mmDealPrice
	 * SecuritiesTradeDetails59.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58#mmDealPrice
	 * SecuritiesTradeDetails58.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#mmDealPrice
	 * SecuritiesTradeDetails61.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmDealPrice
	 * SecuritiesTradeDetails63.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmDealPrice
	 * SecuritiesTradeDetails62.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails60#mmDealPrice
	 * SecuritiesTradeDetails60.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#mmDealPrice
	 * SecuritiesTradeDetails65.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#mmDealPrice
	 * SecuritiesTradeDetails66.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmDealPrice
	 * UnsecuredMarketTransaction2.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmDealPrice
	 * UnsecuredMarketTransaction3.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmDealPrice
	 * SecuritiesTradeDetails67.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmDealPrice
	 * SecuritiesTradeDetails68.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#mmDealPrice
	 * SecuritiesTradeDetails69.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#mmDealPrice
	 * SecuritiesTradeDetails70.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmDealPrice
	 * UnsecuredMarketTransaction4.mmDealPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the price of the traded financial instrument.\nThis is the deal price of the individual trade transaction. \nIf there is only one trade transaction for the execution of the trade, then the deal price could equal the executed trade price (unless, for example, the price includes commissions or rounding, or some other factor has been applied to the deal price or the executed trade price, or both)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDealPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesTradeDetails25.mmDealPrice, SecuritiesTradeDetails26.mmDealPrice, SecuritiesTradeDetails27.mmDealPrice, SecuritiesTradeDetails28.mmDealPrice, SecuritiesTradeDetails6.mmDealPrice,
					SecuritiesTradeDetails13.mmDealPrice, SecuritiesTradeDetails3.mmDealPrice, SecuritiesTradeDetails11.mmDealPrice, SecuritiesTradeDetails2.mmDealPrice, SecuritiesTradeDetails16.mmDealPrice,
					SecuritiesTradeDetails1.mmDealPrice, SecuritiesTradeDetails15.mmDealPrice, EntryTransaction1.mmRelatedPrice, EntryTransaction2.mmRelatedPrice, EntryTransaction3.mmRelatedPrice, EntryTransaction4.mmRelatedPrice,
					TransactionDetails3.mmExecutedTradePrice, SecuritiesTradeDetails8.mmDealPrice, SecuritiesTradeDetails18.mmDealPrice, SecuritiesTradeDetails4.mmDealPrice, SecuritiesTradeDetails17.mmDealPrice,
					SecuritiesTradeDetails9.mmDealPrice, SecuritiesTradeDetails21.mmDealPrice, SecuritiesTradeDetails10.mmDealPrice, SecuritiesTradeDetails22.mmDealPrice, SecuritiesTradeDetails23.mmDealPrice,
					SecuritiesTradeDetails29.mmDealPrice, SettlementObligation1.mmDealPrice, SettlementObligation6.mmDealPrice, TradeLeg2.mmDealPrice, TradeLeg5.mmDealPrice, TradeLeg1.mmDealPrice, TradeLeg3.mmDealPrice,
					TradeLeg6.mmDealPrice, TradeLeg4.mmDealPrice, TradeLeg7.mmDealPrice, SecuritiesTradeDetails31.mmDealPrice, SecuritiesTradeDetails33.mmDealPrice, SecuritiesTradeDetails35.mmDealPrice,
					SecuritiesTradeDetails38.mmDealPrice, SecuritiesTradeDetails37.mmDealPrice, SecuritiesTradeDetails36.mmDealPrice, SecuritiesTradeDetails34.mmDealPrice, SecuritiesTradeDetails32.mmDealPrice,
					SecuritiesTradeDetails44.mmDealPrice, SecuritiesTradeDetails39.mmDealPrice, SecuritiesTradeDetails43.mmDealPrice, SecuritiesTradeDetails41.mmDealPrice, SecuritiesTradeDetails40.mmDealPrice,
					SecuritiesTradeDetails42.mmDealPrice, SecuritiesTradeDetails46.mmDealPrice, SecuritiesTradeDetails47.mmDealPrice, EntryTransaction7.mmRelatedPrice, TradeLeg8.mmDealPrice, SettlementObligation7.mmDealPrice,
					TradeLeg10.mmDealPrice, TradeLeg9.mmDealPrice, UnsecuredMarketTransaction1.mmDealPrice, SecuritiesTradeDetails49.mmDealPrice, SecuritiesTradeDetails51.mmDealPrice, SecuritiesTradeDetails53.mmDealPrice,
					SecuritiesTradeDetails55.mmDealPrice, SecuritiesTradeDetails56.mmDealPrice, SecuritiesTradeDetails54.mmDealPrice, SecuritiesTradeDetails52.mmDealPrice, SecuritiesTradeDetails50.mmDealPrice,
					EntryTransaction8.mmRelatedPrice, SecuritiesTradeDetails59.mmDealPrice, SecuritiesTradeDetails58.mmDealPrice, SecuritiesTradeDetails61.mmDealPrice, SecuritiesTradeDetails63.mmDealPrice,
					SecuritiesTradeDetails62.mmDealPrice, SecuritiesTradeDetails60.mmDealPrice, SecuritiesTradeDetails65.mmDealPrice, SecuritiesTradeDetails66.mmDealPrice, UnsecuredMarketTransaction2.mmDealPrice,
					UnsecuredMarketTransaction3.mmDealPrice, SecuritiesTradeDetails67.mmDealPrice, SecuritiesTradeDetails68.mmDealPrice, SecuritiesTradeDetails69.mmDealPrice, SecuritiesTradeDetails70.mmDealPrice,
					UnsecuredMarketTransaction4.mmDealPrice);
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DealPrice";
			definition = "Specifies the price of the traded financial instrument.\nThis is the deal price of the individual trade transaction. \nIf there is only one trade transaction for the execution of the trade, then the deal price could equal the executed trade price (unless, for example, the price includes commissions or rounding, or some other factor has been applied to the deal price or the executed trade price, or both).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmSecuritiesTradeExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected CurrencyAndAmount marginAmount;
	/**
	 * Difference in prices at which a dealer will buy and sell.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Difference in prices at which a dealer will buy and sell."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMarginAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarginAmount";
			definition = "Difference in prices at which a dealer will buy and sell.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesQuantity> executedTradeQuantity;
	/**
	 * Quantity of financial instrument executed by the trading party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesTradeExecution
	 * SecuritiesQuantity.mmSecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#mmExecutedTradeQuantity
	 * TransactionDetails3.mmExecutedTradeQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutedTradeQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instrument executed by the trading party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmExecutedTradeQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionDetails3.mmExecutedTradeQuantity);
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExecutedTradeQuantity";
			definition = "Quantity of financial instrument executed by the trading party.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesTradeExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected OffMarketCode offMarketReason;
	/**
	 * Reason for which the trade was executed off-market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OffMarketCode
	 * OffMarketCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OffMarket1Choice#mmOffMarketIndicator
	 * OffMarket1Choice.mmOffMarketIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffMarketReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for which the trade was executed off-market."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOffMarketReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OffMarket1Choice.mmOffMarketIndicator);
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OffMarketReason";
			definition = "Reason for which the trade was executed off-market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OffMarketCode.mmObject();
		}
	};
	protected SecuritiesTrade relatedTrade;
	/**
	 * Trade which is executed through one or more execution trades.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradingExecution
	 * SecuritiesTrade.mmTradingExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails3.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails4.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails2.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails5.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails6.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails7.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails8.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails9.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails10.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails11.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails12.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails13.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Clearing1#mmNonGuaranteedTrade
	 * Clearing1.mmNonGuaranteedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Clearing2#mmNonGuaranteedTrade
	 * Clearing2.mmNonGuaranteedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails16.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails14.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails15.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails17.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails18.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails19.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Clearing4#mmNonGuaranteedTrade
	 * Clearing4.mmNonGuaranteedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails21.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails22.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails20.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails23.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails25.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails24.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails27.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails28.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails26.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails30.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails29.mmTradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails31.mmTradeDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade which is executed through one or more execution trades."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedTrade = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionDetails3.mmTradeDetails, SecuritiesSettlementTransactionDetails4.mmTradeDetails, SecuritiesSettlementTransactionDetails2.mmTradeDetails,
					SecuritiesSettlementTransactionDetails5.mmTradeDetails, SecuritiesSettlementTransactionDetails6.mmTradeDetails, SecuritiesSettlementTransactionDetails7.mmTradeDetails,
					SecuritiesSettlementTransactionDetails8.mmTradeDetails, SecuritiesSettlementTransactionDetails9.mmTradeDetails, SecuritiesSettlementTransactionDetails10.mmTradeDetails,
					SecuritiesSettlementTransactionDetails11.mmTradeDetails, SecuritiesSettlementTransactionDetails12.mmTradeDetails, SecuritiesSettlementTransactionDetails13.mmTradeDetails, Clearing1.mmNonGuaranteedTrade,
					Clearing2.mmNonGuaranteedTrade, SecuritiesSettlementTransactionDetails16.mmTradeDetails, SecuritiesSettlementTransactionDetails14.mmTradeDetails, SecuritiesSettlementTransactionDetails15.mmTradeDetails,
					SecuritiesSettlementTransactionDetails17.mmTradeDetails, SecuritiesSettlementTransactionDetails18.mmTradeDetails, SecuritiesSettlementTransactionDetails19.mmTradeDetails, Clearing4.mmNonGuaranteedTrade,
					SecuritiesSettlementTransactionDetails21.mmTradeDetails, SecuritiesSettlementTransactionDetails22.mmTradeDetails, SecuritiesSettlementTransactionDetails20.mmTradeDetails,
					SecuritiesSettlementTransactionDetails23.mmTradeDetails, SecuritiesSettlementTransactionDetails25.mmTradeDetails, SecuritiesSettlementTransactionDetails24.mmTradeDetails,
					SecuritiesSettlementTransactionDetails27.mmTradeDetails, SecuritiesSettlementTransactionDetails28.mmTradeDetails, SecuritiesSettlementTransactionDetails26.mmTradeDetails,
					SecuritiesSettlementTransactionDetails30.mmTradeDetails, SecuritiesSettlementTransactionDetails29.mmTradeDetails, SecuritiesSettlementTransactionDetails31.mmTradeDetails);
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedTrade";
			definition = "Trade which is executed through one or more execution trades.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmTradingExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
		}
	};
	protected CurrencyAndAmount dealExecutionAmount;
	/**
	 * Deal price multiplied by the quantity of a financial instrument traded
	 * for the specific trade transaction i.e. the partially filled quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealExecutionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deal price multiplied by the quantity of a financial instrument traded for the specific trade transaction i.e. the partially filled quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDealExecutionAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DealExecutionAmount";
			definition = "Deal price multiplied by the quantity of a financial instrument traded for the specific trade transaction i.e. the partially filled quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PaymentObligation> paymentObligation;
	/**
	 * Specifies the cash delivery obligations resulting from the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmExecutedSecuritiesTrade
	 * PaymentObligation.mmExecutedSecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the cash delivery obligations resulting from the trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPaymentObligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Specifies the cash delivery obligations resulting from the trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmExecutedSecuritiesTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesDeliveryObligation> securitiesDeliveryObligation;
	/**
	 * Specifies the securities delivery obligations resulting from the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmSecuritiesTradeExecution
	 * SecuritiesDeliveryObligation.mmSecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation2#mmAdditionalSettlementObligationDetails
	 * SettlementObligation2.mmAdditionalSettlementObligationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#mmAdditionalSettlementObligationDetails
	 * SettlementObligation4.mmAdditionalSettlementObligationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmAdditionalSettlementObligationDetails
	 * SettlementObligation8.mmAdditionalSettlementObligationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesDeliveryObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the securities delivery obligations resulting from the trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesDeliveryObligation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementObligation2.mmAdditionalSettlementObligationDetails, SettlementObligation4.mmAdditionalSettlementObligationDetails, SettlementObligation8.mmAdditionalSettlementObligationDetails);
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesDeliveryObligation";
			definition = "Specifies the securities delivery obligations resulting from the trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmSecuritiesTradeExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmObject();
		}
	};
	protected ReportingCode reportingType;
	/**
	 * Specifies that a trade is to be reported to a third party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingCode
	 * ReportingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.Reporting2Choice#mmCode
	 * Reporting2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reporting2Choice#mmProprietary
	 * Reporting2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Reporting3Choice#mmCode
	 * Reporting3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reporting3Choice#mmProprietary
	 * Reporting3Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Reporting5Choice#mmCode
	 * Reporting5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reporting5Choice#mmProprietary
	 * Reporting5Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmReporting
	 * Order16.mmReporting}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmReporting
	 * Order14.mmReporting}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Reporting1Choice#mmCode
	 * Reporting1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reporting1Choice#mmProprietary
	 * Reporting1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Reporting4Choice#mmCode
	 * Reporting4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reporting4Choice#mmProprietary
	 * Reporting4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1#mmReportingIndicator
	 * OrderParameters1.mmReportingIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmReporting
	 * Order17.mmReporting}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmReporting
	 * Order18.mmReporting}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Reporting6Choice#mmCode
	 * Reporting6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reporting6Choice#mmProprietary
	 * Reporting6Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Reporting7Choice#mmCode
	 * Reporting7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reporting7Choice#mmProprietary
	 * Reporting7Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Reporting8Choice#mmCode
	 * Reporting8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reporting8Choice#mmProprietary
	 * Reporting8Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Reporting9Choice#mmCode
	 * Reporting9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reporting9Choice#mmProprietary
	 * Reporting9Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that a trade is to be reported to a third party."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmReportingType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Reporting2Choice.mmCode, Reporting2Choice.mmProprietary, Reporting3Choice.mmCode, Reporting3Choice.mmProprietary, Reporting5Choice.mmCode, Reporting5Choice.mmProprietary,
					Order16.mmReporting, Order14.mmReporting, Reporting1Choice.mmCode, Reporting1Choice.mmProprietary, Reporting4Choice.mmCode, Reporting4Choice.mmProprietary, OrderParameters1.mmReportingIndicator, Order17.mmReporting,
					Order18.mmReporting, Reporting6Choice.mmCode, Reporting6Choice.mmProprietary, Reporting7Choice.mmCode, Reporting7Choice.mmProprietary, Reporting8Choice.mmCode, Reporting8Choice.mmProprietary, Reporting9Choice.mmCode,
					Reporting9Choice.mmProprietary);
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReportingType";
			definition = "Specifies that a trade is to be reported to a third party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReportingCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTradeExecution";
				definition = "Transaction between two counterparties in which they agree to buy and sell a financial instrument. A trade transaction occurs with the matching of the two counterparties orders. There could be several trade transactions necessary to execute the trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.mmSecuritiesTradeExecution, com.tools20022.repository.entity.PaymentObligation.mmExecutedSecuritiesTrade,
						com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesTrade.mmTradingExecution,
						com.tools20022.repository.entity.SecuritiesSettlement.mmSecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmSecuritiesTradeExecution);
				subType_lazy = () -> Arrays.asList(InvestmentFundOrderExecution.mmObject());
				element_lazy = () -> Arrays.asList(SecuritiesTradeExecution.mmStampDutyIndicator, SecuritiesTradeExecution.mmProcessingPosition, SecuritiesTradeExecution.mmSecuritiesSettlement, SecuritiesTradeExecution.mmDealPrice,
						SecuritiesTradeExecution.mmMarginAmount, SecuritiesTradeExecution.mmExecutedTradeQuantity, SecuritiesTradeExecution.mmOffMarketReason, SecuritiesTradeExecution.mmRelatedTrade,
						SecuritiesTradeExecution.mmDealExecutionAmount, SecuritiesTradeExecution.mmPaymentObligation, SecuritiesTradeExecution.mmSecuritiesDeliveryObligation, SecuritiesTradeExecution.mmReportingType);
				derivationComponent_lazy = () -> Arrays.asList(Reporting2Choice.mmObject(), Reporting3Choice.mmObject(), Reporting5Choice.mmObject(), OffMarket1Choice.mmObject(), Reporting1Choice.mmObject(), Reporting4Choice.mmObject(),
						Reporting6Choice.mmObject(), Reporting7Choice.mmObject(), Reporting8Choice.mmObject(), Reporting9Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getStampDutyIndicator() {
		return stampDutyIndicator;
	}

	public void setStampDutyIndicator(YesNoIndicator stampDutyIndicator) {
		this.stampDutyIndicator = stampDutyIndicator;
	}

	public ProcessingPositionCode getProcessingPosition() {
		return processingPosition;
	}

	public void setProcessingPosition(ProcessingPositionCode processingPosition) {
		this.processingPosition = processingPosition;
	}

	public List<SecuritiesSettlement> getSecuritiesSettlement() {
		return securitiesSettlement;
	}

	public void setSecuritiesSettlement(List<com.tools20022.repository.entity.SecuritiesSettlement> securitiesSettlement) {
		this.securitiesSettlement = securitiesSettlement;
	}

	public SecuritiesPricing getDealPrice() {
		return dealPrice;
	}

	public void setDealPrice(com.tools20022.repository.entity.SecuritiesPricing dealPrice) {
		this.dealPrice = dealPrice;
	}

	public CurrencyAndAmount getMarginAmount() {
		return marginAmount;
	}

	public void setMarginAmount(CurrencyAndAmount marginAmount) {
		this.marginAmount = marginAmount;
	}

	public List<SecuritiesQuantity> getExecutedTradeQuantity() {
		return executedTradeQuantity;
	}

	public void setExecutedTradeQuantity(List<com.tools20022.repository.entity.SecuritiesQuantity> executedTradeQuantity) {
		this.executedTradeQuantity = executedTradeQuantity;
	}

	public OffMarketCode getOffMarketReason() {
		return offMarketReason;
	}

	public void setOffMarketReason(OffMarketCode offMarketReason) {
		this.offMarketReason = offMarketReason;
	}

	public SecuritiesTrade getRelatedTrade() {
		return relatedTrade;
	}

	public void setRelatedTrade(com.tools20022.repository.entity.SecuritiesTrade relatedTrade) {
		this.relatedTrade = relatedTrade;
	}

	public CurrencyAndAmount getDealExecutionAmount() {
		return dealExecutionAmount;
	}

	public void setDealExecutionAmount(CurrencyAndAmount dealExecutionAmount) {
		this.dealExecutionAmount = dealExecutionAmount;
	}

	public List<PaymentObligation> getPaymentObligation() {
		return paymentObligation;
	}

	public void setPaymentObligation(List<com.tools20022.repository.entity.PaymentObligation> paymentObligation) {
		this.paymentObligation = paymentObligation;
	}

	public List<SecuritiesDeliveryObligation> getSecuritiesDeliveryObligation() {
		return securitiesDeliveryObligation;
	}

	public void setSecuritiesDeliveryObligation(List<com.tools20022.repository.entity.SecuritiesDeliveryObligation> securitiesDeliveryObligation) {
		this.securitiesDeliveryObligation = securitiesDeliveryObligation;
	}

	public ReportingCode getReportingType() {
		return reportingType;
	}

	public void setReportingType(ReportingCode reportingType) {
		this.reportingType = reportingType;
	}
}