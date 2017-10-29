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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.OffMarketCode;
import com.tools20022.repository.codeset.ProcessingPositionCode;
import com.tools20022.repository.codeset.ReportingCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#StampDutyIndicator
 * SecuritiesTradeExecution.StampDutyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#ProcessingPosition
 * SecuritiesTradeExecution.ProcessingPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#SecuritiesSettlement
 * SecuritiesTradeExecution.SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#DealPrice
 * SecuritiesTradeExecution.DealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#MarginAmount
 * SecuritiesTradeExecution.MarginAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#ExecutedTradeQuantity
 * SecuritiesTradeExecution.ExecutedTradeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#OffMarketReason
 * SecuritiesTradeExecution.OffMarketReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#RelatedTrade
 * SecuritiesTradeExecution.RelatedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#DealExecutionAmount
 * SecuritiesTradeExecution.DealExecutionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#PaymentObligation
 * SecuritiesTradeExecution.PaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#SecuritiesDeliveryObligation
 * SecuritiesTradeExecution.SecuritiesDeliveryObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#ReportingType
 * SecuritiesTradeExecution.ReportingType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#SecuritiesTradeExecution
 * SecuritiesPricing.SecuritiesTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#ExecutedSecuritiesTrade
 * PaymentObligation.ExecutedSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesTradeExecution
 * SecuritiesQuantity.SecuritiesTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradingExecution
 * SecuritiesTrade.TradingExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SecuritiesTradeExecution
 * SecuritiesSettlement.SecuritiesTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#SecuritiesTradeExecution
 * SecuritiesDeliveryObligation.SecuritiesTradeExecution}</li>
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
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation4#StampDutyIndicator
	 * DeliverInformation4.StampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation4#StampDutyIndicator
	 * ReceiveInformation4.StampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection32#StampDutyIndicator
	 * AmountAndDirection32.StampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection33#StampDutyIndicator
	 * AmountAndDirection33.StampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation3#StampDutyIndicator
	 * DeliverInformation3.StampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation3#StampDutyIndicator
	 * ReceiveInformation3.StampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection2#StampDutyIndicator
	 * AmountAndDirection2.StampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection16#StampDutyIndicator
	 * AmountAndDirection16.StampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#StampDutyIndicator
	 * SettlementDetails43.StampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection28#StampDutyIndicator
	 * AmountAndDirection28.StampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection36#StampDutyIndicator
	 * AmountAndDirection36.StampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection37#StampDutyIndicator
	 * AmountAndDirection37.StampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection38#StampDutyIndicator
	 * AmountAndDirection38.StampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection40#StampDutyIndicator
	 * AmountAndDirection40.StampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection46#StampDutyIndicator
	 * AmountAndDirection46.StampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection45#StampDutyIndicator
	 * AmountAndDirection45.StampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection60#StampDutyIndicator
	 * AmountAndDirection60.StampDutyIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection85#StampDutyIndicator
	 * AmountAndDirection85.StampDutyIndicator}</li>
	 * </ul>
	 * </li>
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
	 * name} = "StampDutyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Whether the net proceeds include stamp duty amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StampDutyIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliverInformation4.StampDutyIndicator, com.tools20022.repository.msg.ReceiveInformation4.StampDutyIndicator,
					com.tools20022.repository.msg.AmountAndDirection32.StampDutyIndicator, com.tools20022.repository.msg.AmountAndDirection33.StampDutyIndicator, com.tools20022.repository.msg.DeliverInformation3.StampDutyIndicator,
					com.tools20022.repository.msg.ReceiveInformation3.StampDutyIndicator, com.tools20022.repository.msg.AmountAndDirection2.StampDutyIndicator, com.tools20022.repository.msg.AmountAndDirection16.StampDutyIndicator,
					com.tools20022.repository.msg.SettlementDetails43.StampDutyIndicator, com.tools20022.repository.msg.AmountAndDirection28.StampDutyIndicator, com.tools20022.repository.msg.AmountAndDirection36.StampDutyIndicator,
					com.tools20022.repository.msg.AmountAndDirection37.StampDutyIndicator, com.tools20022.repository.msg.AmountAndDirection38.StampDutyIndicator, com.tools20022.repository.msg.AmountAndDirection40.StampDutyIndicator,
					com.tools20022.repository.msg.AmountAndDirection46.StampDutyIndicator, com.tools20022.repository.msg.AmountAndDirection45.StampDutyIndicator, com.tools20022.repository.msg.AmountAndDirection60.StampDutyIndicator,
					com.tools20022.repository.msg.AmountAndDirection85.StampDutyIndicator);
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StampDutyIndicator";
			definition = "Whether the net proceeds include stamp duty amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
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
	public static final MMBusinessAttribute ProcessingPosition = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessingPosition";
			definition = "When the transaction is to be executed relative to a linked transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ProcessingPositionCode.mmObject();
		}
	};
	/**
	 * Process of settling securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SecuritiesTradeExecution
	 * SecuritiesSettlement.SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References1Choice#SecuritiesSettlementTransactionIdentification
	 * References1Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Linkages1#LinkedQuantity
	 * Linkages1.LinkedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References12Choice#SecuritiesSettlementTransactionIdentification
	 * References12Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Linkages4#LinkedQuantity
	 * Linkages4.LinkedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References28Choice#SecuritiesSettlementTransactionIdentification
	 * References28Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References14Choice#SecuritiesSettlementTransactionIdentification
	 * References14Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Linkages9#LinkedQuantity
	 * Linkages9.LinkedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References16Choice#SecuritiesSettlementTransactionIdentification
	 * References16Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Linkages14#LinkedQuantity
	 * Linkages14.LinkedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References25Choice#SecuritiesSettlementTransactionIdentification
	 * References25Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Linkages17#LinkedQuantity
	 * Linkages17.LinkedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References32Choice#SecuritiesSettlementTransactionIdentification
	 * References32Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Linkages24#LinkedQuantity
	 * Linkages24.LinkedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References3Choice#SecuritiesSettlementTransactionConfirmationIdentification
	 * References3Choice.
	 * SecuritiesSettlementTransactionConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References3Choice#SecuritiesSettlementTransactionAllegementReportIdentification
	 * References3Choice.
	 * SecuritiesSettlementTransactionAllegementReportIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References3Choice#SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * References3Choice.
	 * SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References3Choice#SecuritiesSettlementTransactionGenerationNotificationIdentification
	 * References3Choice.
	 * SecuritiesSettlementTransactionGenerationNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References9Choice#SecuritiesSettlementTransactionConfirmationIdentification
	 * References9Choice.
	 * SecuritiesSettlementTransactionConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References9Choice#SecuritiesSettlementTransactionAllegementReportIdentification
	 * References9Choice.
	 * SecuritiesSettlementTransactionAllegementReportIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References9Choice#SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * References9Choice.
	 * SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References9Choice#SecuritiesSettlementTransactionGenerationNotificationIdentification
	 * References9Choice.
	 * SecuritiesSettlementTransactionGenerationNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References18Choice#SecuritiesSettlementTransactionConfirmationIdentification
	 * References18Choice.
	 * SecuritiesSettlementTransactionConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References18Choice#SecuritiesSettlementTransactionAllegementReportIdentification
	 * References18Choice.
	 * SecuritiesSettlementTransactionAllegementReportIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References18Choice#SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * References18Choice.
	 * SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References18Choice#SecuritiesSettlementTransactionGenerationNotificationIdentification
	 * References18Choice.
	 * SecuritiesSettlementTransactionGenerationNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References20Choice#SecuritiesSettlementTransactionConfirmationIdentification
	 * References20Choice.
	 * SecuritiesSettlementTransactionConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References20Choice#SecuritiesSettlementTransactionAllegementReportIdentification
	 * References20Choice.
	 * SecuritiesSettlementTransactionAllegementReportIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References20Choice#SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * References20Choice.
	 * SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References20Choice#SecuritiesSettlementTransactionGenerationNotificationIdentification
	 * References20Choice.
	 * SecuritiesSettlementTransactionGenerationNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References29Choice#SecuritiesSettlementTransactionConfirmationIdentification
	 * References29Choice.
	 * SecuritiesSettlementTransactionConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References29Choice#SecuritiesSettlementTransactionAllegementReportIdentification
	 * References29Choice.
	 * SecuritiesSettlementTransactionAllegementReportIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References29Choice#SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * References29Choice.
	 * SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References29Choice#SecuritiesSettlementTransactionGenerationNotificationIdentification
	 * References29Choice.
	 * SecuritiesSettlementTransactionGenerationNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References37Choice#SecuritiesSettlementTransactionConfirmationIdentification
	 * References37Choice.
	 * SecuritiesSettlementTransactionConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References37Choice#SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * References37Choice.
	 * SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References37Choice#SecuritiesSettlementTransactionGenerationNotificationIdentification
	 * References37Choice.
	 * SecuritiesSettlementTransactionGenerationNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References38Choice#SecuritiesSettlementTransactionConfirmationIdentification
	 * References38Choice.
	 * SecuritiesSettlementTransactionConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References38Choice#SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * References38Choice.
	 * SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References38Choice#SecuritiesSettlementTransactionGenerationNotificationIdentification
	 * References38Choice.
	 * SecuritiesSettlementTransactionGenerationNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References13Choice#SecuritiesSettlementTransactionIdentification
	 * References13Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References15Choice#SecuritiesSettlementTransactionIdentification
	 * References15Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References24Choice#SecuritiesSettlementTransactionIdentification
	 * References24Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References31Choice#SecuritiesSettlementTransactionIdentification
	 * References31Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Linkages7#LinkedQuantity
	 * Linkages7.LinkedQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Linkages12#LinkedQuantity
	 * Linkages12.LinkedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#SettlementParameters
	 * TransactionDetails5.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#SettlementParameters
	 * TransactionDetails9.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#SettlementParameters
	 * TransactionDetails22.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#SettlementParameters
	 * TransactionDetails23.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#SettlementParameters
	 * TransactionDetails36.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#SettlementParameters
	 * TransactionDetails47.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#SettlementParameters
	 * TransactionDetails53.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#SettlementParameters
	 * TransactionDetails58.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#SettlementParameters
	 * TransactionDetails7.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#SettlementParameters
	 * TransactionDetails8.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#SettlementParameters
	 * TransactionDetails16.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#SettlementParameters
	 * TransactionDetails17.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#SettlementParameters
	 * TransactionDetails26.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#SettlementParameters
	 * TransactionDetails25.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#SettlementParameters
	 * TransactionDetails27.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#SettlementParameters
	 * TransactionDetails33.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#SettlementParameters
	 * TransactionDetails39.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#SettlementParameters
	 * TransactionDetails50.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#SettlementParameters
	 * TransactionDetails56.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#SettlementParameters
	 * TransactionDetails59.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#SettlementParameters
	 * TransactionDetails6.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#SettlementParameters
	 * TransactionDetails18.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#SettlementParameters
	 * TransactionDetails24.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#SettlementParameters
	 * TransactionDetails34.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#SettlementParameters
	 * TransactionDetails37.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#SettlementParameters
	 * TransactionDetails48.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#SettlementParameters
	 * TransactionDetails57.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#SettlementParameters
	 * TransactionDetails60.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#CurrencyToBuyOrSell
	 * Order16.CurrencyToBuyOrSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#CurrencyToBuyOrSell
	 * Order14.CurrencyToBuyOrSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#ClosingAmountPerPiecesOfCollateral
	 * SecuritiesFinancing10.ClosingAmountPerPiecesOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#SettlementAndCustodyDetails
	 * RedemptionOrder3.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#SettlementAndCustodyDetails
	 * RedemptionOrder5.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#SettlementAndCustodyDetails
	 * RedemptionExecution3.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#SettlementAndCustodyDetails
	 * RedemptionExecution5.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#SettlementAndCustodyDetails
	 * RedemptionOrder7.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#SettlementAndCustodyDetails
	 * RedemptionOrder4.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#SettlementAndCustodyDetails
	 * RedemptionOrder6.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#SettlementAndCustodyDetails
	 * RedemptionExecution4.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#SettlementAndCustodyDetails
	 * RedemptionExecution6.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#SettlementAndCustodyDetails
	 * RedemptionOrder8.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#SettlementAndCustodyDetails
	 * SubscriptionOrder3.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#SettlementAndCustodyDetails
	 * SubscriptionOrder5.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#SettlementAndCustodyDetails
	 * SubscriptionExecution3.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#SettlementAndCustodyDetails
	 * SubscriptionExecution5.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#SettlementAndCustodyDetails
	 * SubscriptionOrder7.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#SettlementAndCustodyDetails
	 * SubscriptionOrder4.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#SettlementAndCustodyDetails
	 * SubscriptionOrder6.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#SettlementAndCustodyDetails
	 * SubscriptionExecution4.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#SettlementAndCustodyDetails
	 * SubscriptionExecution6.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#SettlementAndCustodyDetails
	 * SubscriptionOrder8.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#SettlementAndCustodyDetails
	 * SwitchRedemptionLegExecution2.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#SettlementAndCustodyDetails
	 * SwitchRedemptionLegExecution3.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7#SettlementParameters
	 * SecuritiesTradeDetails7.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19#SettlementParameters
	 * SecuritiesTradeDetails19.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#QuantityAndAccountDetails
	 * SecuritiesTradeDetails4.QuantityAndAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#SettlementParameters
	 * SecuritiesTradeDetails4.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#QuantityAndAccountDetails
	 * SecuritiesTradeDetails17.QuantityAndAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#SettlementParameters
	 * SecuritiesTradeDetails17.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References4Choice#SecuritiesFinancingTransactionIdentification
	 * References4Choice.SecuritiesFinancingTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References4Choice#SecuritiesSettlementTransactionIdentification
	 * References4Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References22Choice#SecuritiesFinancingTransactionIdentification
	 * References22Choice.SecuritiesFinancingTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References22Choice#SecuritiesSettlementTransactionIdentification
	 * References22Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References2Choice#SecuritiesSettlementTransactionIdentification
	 * References2Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References2Choice#SecuritiesFinancingTransactionIdentification
	 * References2Choice.SecuritiesFinancingTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#QuantityAndAccountDetails
	 * SecuritiesTradeDetails10.QuantityAndAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#SettlementParameters
	 * SecuritiesTradeDetails10.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#QuantityAndAccountDetails
	 * SecuritiesTradeDetails22.QuantityAndAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#SettlementParameters
	 * SecuritiesTradeDetails22.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#QuantityAndAccountDetails
	 * SecuritiesTradeDetails23.QuantityAndAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#SettlementParameters
	 * SecuritiesTradeDetails23.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#QuantityAndAccountDetails
	 * SecuritiesTradeDetails29.QuantityAndAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#SettlementParameters
	 * SecuritiesTradeDetails29.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References8Choice#SecuritiesSettlementTransactionIdentification
	 * References8Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References8Choice#SecuritiesFinancingTransactionIdentification
	 * References8Choice.SecuritiesFinancingTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References17Choice#SecuritiesSettlementTransactionIdentification
	 * References17Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References17Choice#SecuritiesFinancingTransactionIdentification
	 * References17Choice.SecuritiesFinancingTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References7Choice#SecuritiesFinancingTransactionIdentification
	 * References7Choice.SecuritiesFinancingTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References7Choice#SecuritiesSettlementTransactionIdentification
	 * References7Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References23Choice#SecuritiesFinancingTransactionIdentification
	 * References23Choice.SecuritiesFinancingTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References23Choice#SecuritiesSettlementTransactionIdentification
	 * References23Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References30Choice#SecuritiesFinancingTransactionIdentification
	 * References30Choice.SecuritiesFinancingTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References30Choice#SecuritiesSettlementTransactionIdentification
	 * References30Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14#SettlementParameters
	 * SecuritiesTradeDetails14.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20#SettlementParameters
	 * SecuritiesTradeDetails20.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#SettlementParameters
	 * SecuritiesTradeDetails24.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30#SettlementParameters
	 * SecuritiesTradeDetails30.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg3#SettlementDetails
	 * TradeLeg3.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#SettlementDetails
	 * TradeLeg6.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#SettlementAndCustodyDetails
	 * RedemptionOrder11.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#SettlementAndCustodyDetails
	 * RedemptionExecution12.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#SettlementAndCustodyDetails
	 * SubscriptionOrder11.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#SettlementAndCustodyDetails
	 * SubscriptionExecution9.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References34Choice#SecuritiesSettlementTransactionIdentification
	 * References34Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#SettlementParameters
	 * TransactionDetails51.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification2#RequestDetails
	 * IntraBalanceModification2.RequestDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#SettlementDetails
	 * Order9.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuoteEntry2#SettlementDetails
	 * QuoteEntry2.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuoteEntry1#SettlementDetails
	 * QuoteEntry1.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DisclosedBid1#SettlementDetails
	 * DisclosedBid1.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BidResponsePrice1#SettlementDetails
	 * BidResponsePrice1.SettlementDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#SettlementDetails
	 * Order6.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#SettlementParameters
	 * TransactionDetails61.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#SettlementParameters
	 * TransactionDetails62.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#SettlementParameters
	 * TransactionDetails63.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#QuantityAndAccountDetails
	 * SecuritiesTradeDetails35.QuantityAndAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#SettlementParameters
	 * SecuritiesTradeDetails35.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#CurrencyToBuyOrSell
	 * Order17.CurrencyToBuyOrSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#CurrencyToBuyOrSell
	 * Order18.CurrencyToBuyOrSell}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#SettlementParameters
	 * TransactionDetails66.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#QuantityAndAccountDetails
	 * SecuritiesTradeDetails42.QuantityAndAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#SettlementParameters
	 * SecuritiesTradeDetails42.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#SettlementParameters
	 * TransactionDetails67.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#SettlementParameters
	 * TransactionDetails68.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#SettlementParameters
	 * TransactionDetails70.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#SettlementParameters
	 * TransactionDetails69.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#SettlementDetails
	 * TradeLeg9.SettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#SettlementParameters
	 * TransactionDetails71.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#SettlementParameters
	 * TransactionDetails72.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#QuantityAndAccountDetails
	 * SecuritiesTradeDetails49.QuantityAndAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#SettlementParameters
	 * SecuritiesTradeDetails49.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#SettlementParameters
	 * TransactionDetails79.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#SettlementParameters
	 * SecuritiesTradeDetails48.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#SettlementParameters
	 * TransactionDetails75.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#SettlementParameters
	 * TransactionDetails78.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References45Choice#SecuritiesSettlementTransactionIdentification
	 * References45Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References45Choice#SecuritiesFinancingTransactionIdentification
	 * References45Choice.SecuritiesFinancingTransactionIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Linkages37#LinkedQuantity
	 * Linkages37.LinkedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References43Choice#SecuritiesSettlementTransactionConfirmationIdentification
	 * References43Choice.
	 * SecuritiesSettlementTransactionConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References43Choice#SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * References43Choice.
	 * SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References43Choice#SecuritiesSettlementTransactionGenerationNotificationIdentification
	 * References43Choice.
	 * SecuritiesSettlementTransactionGenerationNotificationIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Linkages38#LinkedQuantity
	 * Linkages38.LinkedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References46Choice#SecuritiesSettlementTransactionIdentification
	 * References46Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References41Choice#SecuritiesSettlementTransactionIdentification
	 * References41Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References44Choice#SecuritiesFinancingTransactionIdentification
	 * References44Choice.SecuritiesFinancingTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References44Choice#SecuritiesSettlementTransactionIdentification
	 * References44Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References47Choice#SecuritiesSettlementTransactionIdentification
	 * References47Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57#SettlementParameters
	 * SecuritiesTradeDetails57.SettlementParameters}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Linkages43#LinkedQuantity
	 * Linkages43.LinkedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References60Choice#SecuritiesSettlementTransactionIdentification
	 * References60Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References60Choice#SecuritiesFinancingTransactionIdentification
	 * References60Choice.SecuritiesFinancingTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#QuantityAndAccountDetails
	 * SecuritiesTradeDetails61.QuantityAndAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#SettlementParameters
	 * SecuritiesTradeDetails61.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References53Choice#SecuritiesSettlementTransactionConfirmationIdentification
	 * References53Choice.
	 * SecuritiesSettlementTransactionConfirmationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References53Choice#SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * References53Choice.
	 * SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References53Choice#SecuritiesSettlementTransactionGenerationNotificationIdentification
	 * References53Choice.
	 * SecuritiesSettlementTransactionGenerationNotificationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#SettlementParameters
	 * TransactionDetails87.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References58Choice#SecuritiesSettlementTransactionIdentification
	 * References58Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#SettlementParameters
	 * TransactionDetails91.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References50Choice#SecuritiesSettlementTransactionIdentification
	 * References50Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#SettlementParameters
	 * TransactionDetails90.SettlementParameters}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Linkages48#LinkedQuantity
	 * Linkages48.LinkedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References59Choice#SecuritiesFinancingTransactionIdentification
	 * References59Choice.SecuritiesFinancingTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References59Choice#SecuritiesSettlementTransactionIdentification
	 * References59Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References54Choice#SecuritiesSettlementTransactionIdentification
	 * References54Choice.SecuritiesSettlementTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#SettlementAndCustodyDetails
	 * RedemptionOrder14.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#SettlementAndCustodyDetails
	 * SubscriptionExecution13.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#SettlementAndCustodyDetails
	 * SubscriptionExecution12.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#SettlementAndCustodyDetails
	 * SubscriptionOrder15.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#SettlementAndCustodyDetails
	 * RedemptionOrder15.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#SettlementAndCustodyDetails
	 * RedemptionExecution16.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#SettlementAndCustodyDetails
	 * SubscriptionOrder14.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#SettlementAndCustodyDetails
	 * RedemptionExecution15.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#SettlementAndCustodyDetails
	 * SwitchRedemptionLegExecution4.SettlementAndCustodyDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#QuantityAndAccountDetails
	 * SecuritiesTradeDetails68.QuantityAndAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#SettlementParameters
	 * SecuritiesTradeDetails68.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#SettlementParameters
	 * TransactionDetails97.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#SettlementParameters
	 * TransactionDetails96.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#SettlementParameters
	 * TransactionDetails95.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#QuantityAndAccountDetails
	 * SecuritiesTradeDetails69.QuantityAndAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#SettlementParameters
	 * SecuritiesTradeDetails69.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#SettlementParameters
	 * TransactionDetails100.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#SettlementParameters
	 * TransactionDetails99.SettlementParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#SettlementParameters
	 * TransactionDetails98.SettlementParameters}</li>
	 * </ul>
	 * </li>
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
	 * name} = "SecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Process of settling securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.References1Choice.SecuritiesSettlementTransactionIdentification, com.tools20022.repository.msg.Linkages1.LinkedQuantity,
					com.tools20022.repository.choice.References12Choice.SecuritiesSettlementTransactionIdentification, com.tools20022.repository.msg.Linkages4.LinkedQuantity,
					com.tools20022.repository.choice.References28Choice.SecuritiesSettlementTransactionIdentification, com.tools20022.repository.choice.References14Choice.SecuritiesSettlementTransactionIdentification,
					com.tools20022.repository.msg.Linkages9.LinkedQuantity, com.tools20022.repository.choice.References16Choice.SecuritiesSettlementTransactionIdentification, com.tools20022.repository.msg.Linkages14.LinkedQuantity,
					com.tools20022.repository.choice.References25Choice.SecuritiesSettlementTransactionIdentification, com.tools20022.repository.msg.Linkages17.LinkedQuantity,
					com.tools20022.repository.choice.References32Choice.SecuritiesSettlementTransactionIdentification, com.tools20022.repository.msg.Linkages24.LinkedQuantity,
					com.tools20022.repository.choice.References3Choice.SecuritiesSettlementTransactionConfirmationIdentification,
					com.tools20022.repository.choice.References3Choice.SecuritiesSettlementTransactionAllegementReportIdentification,
					com.tools20022.repository.choice.References3Choice.SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification,
					com.tools20022.repository.choice.References3Choice.SecuritiesSettlementTransactionGenerationNotificationIdentification,
					com.tools20022.repository.choice.References9Choice.SecuritiesSettlementTransactionConfirmationIdentification,
					com.tools20022.repository.choice.References9Choice.SecuritiesSettlementTransactionAllegementReportIdentification,
					com.tools20022.repository.choice.References9Choice.SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification,
					com.tools20022.repository.choice.References9Choice.SecuritiesSettlementTransactionGenerationNotificationIdentification,
					com.tools20022.repository.choice.References18Choice.SecuritiesSettlementTransactionConfirmationIdentification,
					com.tools20022.repository.choice.References18Choice.SecuritiesSettlementTransactionAllegementReportIdentification,
					com.tools20022.repository.choice.References18Choice.SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification,
					com.tools20022.repository.choice.References18Choice.SecuritiesSettlementTransactionGenerationNotificationIdentification,
					com.tools20022.repository.choice.References20Choice.SecuritiesSettlementTransactionConfirmationIdentification,
					com.tools20022.repository.choice.References20Choice.SecuritiesSettlementTransactionAllegementReportIdentification,
					com.tools20022.repository.choice.References20Choice.SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification,
					com.tools20022.repository.choice.References20Choice.SecuritiesSettlementTransactionGenerationNotificationIdentification,
					com.tools20022.repository.choice.References29Choice.SecuritiesSettlementTransactionConfirmationIdentification,
					com.tools20022.repository.choice.References29Choice.SecuritiesSettlementTransactionAllegementReportIdentification,
					com.tools20022.repository.choice.References29Choice.SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification,
					com.tools20022.repository.choice.References29Choice.SecuritiesSettlementTransactionGenerationNotificationIdentification,
					com.tools20022.repository.choice.References37Choice.SecuritiesSettlementTransactionConfirmationIdentification,
					com.tools20022.repository.choice.References37Choice.SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification,
					com.tools20022.repository.choice.References37Choice.SecuritiesSettlementTransactionGenerationNotificationIdentification,
					com.tools20022.repository.choice.References38Choice.SecuritiesSettlementTransactionConfirmationIdentification,
					com.tools20022.repository.choice.References38Choice.SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification,
					com.tools20022.repository.choice.References38Choice.SecuritiesSettlementTransactionGenerationNotificationIdentification, com.tools20022.repository.choice.References13Choice.SecuritiesSettlementTransactionIdentification,
					com.tools20022.repository.choice.References15Choice.SecuritiesSettlementTransactionIdentification, com.tools20022.repository.choice.References24Choice.SecuritiesSettlementTransactionIdentification,
					com.tools20022.repository.choice.References31Choice.SecuritiesSettlementTransactionIdentification, com.tools20022.repository.msg.Linkages7.LinkedQuantity, com.tools20022.repository.msg.Linkages12.LinkedQuantity,
					com.tools20022.repository.msg.TransactionDetails5.SettlementParameters, com.tools20022.repository.msg.TransactionDetails9.SettlementParameters, com.tools20022.repository.msg.TransactionDetails22.SettlementParameters,
					com.tools20022.repository.msg.TransactionDetails23.SettlementParameters, com.tools20022.repository.msg.TransactionDetails36.SettlementParameters, com.tools20022.repository.msg.TransactionDetails47.SettlementParameters,
					com.tools20022.repository.msg.TransactionDetails53.SettlementParameters, com.tools20022.repository.msg.TransactionDetails58.SettlementParameters, com.tools20022.repository.msg.TransactionDetails7.SettlementParameters,
					com.tools20022.repository.msg.TransactionDetails8.SettlementParameters, com.tools20022.repository.msg.TransactionDetails16.SettlementParameters, com.tools20022.repository.msg.TransactionDetails17.SettlementParameters,
					com.tools20022.repository.msg.TransactionDetails26.SettlementParameters, com.tools20022.repository.msg.TransactionDetails25.SettlementParameters, com.tools20022.repository.msg.TransactionDetails27.SettlementParameters,
					com.tools20022.repository.msg.TransactionDetails33.SettlementParameters, com.tools20022.repository.msg.TransactionDetails39.SettlementParameters, com.tools20022.repository.msg.TransactionDetails50.SettlementParameters,
					com.tools20022.repository.msg.TransactionDetails56.SettlementParameters, com.tools20022.repository.msg.TransactionDetails59.SettlementParameters, com.tools20022.repository.msg.TransactionDetails6.SettlementParameters,
					com.tools20022.repository.msg.TransactionDetails18.SettlementParameters, com.tools20022.repository.msg.TransactionDetails24.SettlementParameters, com.tools20022.repository.msg.TransactionDetails34.SettlementParameters,
					com.tools20022.repository.msg.TransactionDetails37.SettlementParameters, com.tools20022.repository.msg.TransactionDetails48.SettlementParameters, com.tools20022.repository.msg.TransactionDetails57.SettlementParameters,
					com.tools20022.repository.msg.TransactionDetails60.SettlementParameters, com.tools20022.repository.msg.Order16.CurrencyToBuyOrSell, com.tools20022.repository.msg.Order14.CurrencyToBuyOrSell,
					com.tools20022.repository.msg.SecuritiesFinancing10.ClosingAmountPerPiecesOfCollateral, com.tools20022.repository.msg.RedemptionOrder3.SettlementAndCustodyDetails,
					com.tools20022.repository.msg.RedemptionOrder5.SettlementAndCustodyDetails, com.tools20022.repository.msg.RedemptionExecution3.SettlementAndCustodyDetails,
					com.tools20022.repository.msg.RedemptionExecution5.SettlementAndCustodyDetails, com.tools20022.repository.msg.RedemptionOrder7.SettlementAndCustodyDetails,
					com.tools20022.repository.msg.RedemptionOrder4.SettlementAndCustodyDetails, com.tools20022.repository.msg.RedemptionOrder6.SettlementAndCustodyDetails,
					com.tools20022.repository.msg.RedemptionExecution4.SettlementAndCustodyDetails, com.tools20022.repository.msg.RedemptionExecution6.SettlementAndCustodyDetails,
					com.tools20022.repository.msg.RedemptionOrder8.SettlementAndCustodyDetails, com.tools20022.repository.msg.SubscriptionOrder3.SettlementAndCustodyDetails,
					com.tools20022.repository.msg.SubscriptionOrder5.SettlementAndCustodyDetails, com.tools20022.repository.msg.SubscriptionExecution3.SettlementAndCustodyDetails,
					com.tools20022.repository.msg.SubscriptionExecution5.SettlementAndCustodyDetails, com.tools20022.repository.msg.SubscriptionOrder7.SettlementAndCustodyDetails,
					com.tools20022.repository.msg.SubscriptionOrder4.SettlementAndCustodyDetails, com.tools20022.repository.msg.SubscriptionOrder6.SettlementAndCustodyDetails,
					com.tools20022.repository.msg.SubscriptionExecution4.SettlementAndCustodyDetails, com.tools20022.repository.msg.SubscriptionExecution6.SettlementAndCustodyDetails,
					com.tools20022.repository.msg.SubscriptionOrder8.SettlementAndCustodyDetails, com.tools20022.repository.msg.SwitchRedemptionLegExecution2.SettlementAndCustodyDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution3.SettlementAndCustodyDetails, com.tools20022.repository.msg.SecuritiesTradeDetails7.SettlementParameters,
					com.tools20022.repository.msg.SecuritiesTradeDetails19.SettlementParameters, com.tools20022.repository.msg.SecuritiesTradeDetails4.QuantityAndAccountDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails4.SettlementParameters, com.tools20022.repository.msg.SecuritiesTradeDetails17.QuantityAndAccountDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails17.SettlementParameters, com.tools20022.repository.choice.References4Choice.SecuritiesFinancingTransactionIdentification,
					com.tools20022.repository.choice.References4Choice.SecuritiesSettlementTransactionIdentification, com.tools20022.repository.choice.References22Choice.SecuritiesFinancingTransactionIdentification,
					com.tools20022.repository.choice.References22Choice.SecuritiesSettlementTransactionIdentification, com.tools20022.repository.choice.References2Choice.SecuritiesSettlementTransactionIdentification,
					com.tools20022.repository.choice.References2Choice.SecuritiesFinancingTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails10.QuantityAndAccountDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails10.SettlementParameters, com.tools20022.repository.msg.SecuritiesTradeDetails22.QuantityAndAccountDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails22.SettlementParameters, com.tools20022.repository.msg.SecuritiesTradeDetails23.QuantityAndAccountDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails23.SettlementParameters, com.tools20022.repository.msg.SecuritiesTradeDetails29.QuantityAndAccountDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails29.SettlementParameters, com.tools20022.repository.choice.References8Choice.SecuritiesSettlementTransactionIdentification,
					com.tools20022.repository.choice.References8Choice.SecuritiesFinancingTransactionIdentification, com.tools20022.repository.choice.References17Choice.SecuritiesSettlementTransactionIdentification,
					com.tools20022.repository.choice.References17Choice.SecuritiesFinancingTransactionIdentification, com.tools20022.repository.choice.References7Choice.SecuritiesFinancingTransactionIdentification,
					com.tools20022.repository.choice.References7Choice.SecuritiesSettlementTransactionIdentification, com.tools20022.repository.choice.References23Choice.SecuritiesFinancingTransactionIdentification,
					com.tools20022.repository.choice.References23Choice.SecuritiesSettlementTransactionIdentification, com.tools20022.repository.choice.References30Choice.SecuritiesFinancingTransactionIdentification,
					com.tools20022.repository.choice.References30Choice.SecuritiesSettlementTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails14.SettlementParameters,
					com.tools20022.repository.msg.SecuritiesTradeDetails20.SettlementParameters, com.tools20022.repository.msg.SecuritiesTradeDetails24.SettlementParameters,
					com.tools20022.repository.msg.SecuritiesTradeDetails30.SettlementParameters, com.tools20022.repository.msg.TradeLeg3.SettlementDetails, com.tools20022.repository.msg.TradeLeg6.SettlementDetails,
					com.tools20022.repository.msg.RedemptionOrder11.SettlementAndCustodyDetails, com.tools20022.repository.msg.RedemptionExecution12.SettlementAndCustodyDetails,
					com.tools20022.repository.msg.SubscriptionOrder11.SettlementAndCustodyDetails, com.tools20022.repository.msg.SubscriptionExecution9.SettlementAndCustodyDetails,
					com.tools20022.repository.choice.References34Choice.SecuritiesSettlementTransactionIdentification, com.tools20022.repository.msg.TransactionDetails51.SettlementParameters,
					com.tools20022.repository.msg.IntraBalanceModification2.RequestDetails, com.tools20022.repository.msg.Order9.SettlementDetails, com.tools20022.repository.msg.QuoteEntry2.SettlementDetails,
					com.tools20022.repository.msg.QuoteEntry1.SettlementDetails, com.tools20022.repository.msg.DisclosedBid1.SettlementDetails, com.tools20022.repository.msg.BidResponsePrice1.SettlementDetails,
					com.tools20022.repository.msg.Order6.SettlementDetails, com.tools20022.repository.msg.TransactionDetails61.SettlementParameters, com.tools20022.repository.msg.TransactionDetails62.SettlementParameters,
					com.tools20022.repository.msg.TransactionDetails63.SettlementParameters, com.tools20022.repository.msg.SecuritiesTradeDetails35.QuantityAndAccountDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails35.SettlementParameters, com.tools20022.repository.msg.Order17.CurrencyToBuyOrSell, com.tools20022.repository.msg.Order18.CurrencyToBuyOrSell,
					com.tools20022.repository.msg.TransactionDetails66.SettlementParameters, com.tools20022.repository.msg.SecuritiesTradeDetails42.QuantityAndAccountDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails42.SettlementParameters, com.tools20022.repository.msg.TransactionDetails67.SettlementParameters,
					com.tools20022.repository.msg.TransactionDetails68.SettlementParameters, com.tools20022.repository.msg.TransactionDetails70.SettlementParameters, com.tools20022.repository.msg.TransactionDetails69.SettlementParameters,
					com.tools20022.repository.msg.TradeLeg9.SettlementDetails, com.tools20022.repository.msg.TransactionDetails71.SettlementParameters, com.tools20022.repository.msg.TransactionDetails72.SettlementParameters,
					com.tools20022.repository.msg.SecuritiesTradeDetails49.QuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesTradeDetails49.SettlementParameters,
					com.tools20022.repository.msg.TransactionDetails79.SettlementParameters, com.tools20022.repository.msg.SecuritiesTradeDetails48.SettlementParameters,
					com.tools20022.repository.msg.TransactionDetails75.SettlementParameters, com.tools20022.repository.msg.TransactionDetails78.SettlementParameters,
					com.tools20022.repository.choice.References45Choice.SecuritiesSettlementTransactionIdentification, com.tools20022.repository.choice.References45Choice.SecuritiesFinancingTransactionIdentification,
					com.tools20022.repository.msg.Linkages37.LinkedQuantity, com.tools20022.repository.choice.References43Choice.SecuritiesSettlementTransactionConfirmationIdentification,
					com.tools20022.repository.choice.References43Choice.SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification,
					com.tools20022.repository.choice.References43Choice.SecuritiesSettlementTransactionGenerationNotificationIdentification, com.tools20022.repository.msg.Linkages38.LinkedQuantity,
					com.tools20022.repository.choice.References46Choice.SecuritiesSettlementTransactionIdentification, com.tools20022.repository.choice.References41Choice.SecuritiesSettlementTransactionIdentification,
					com.tools20022.repository.choice.References44Choice.SecuritiesFinancingTransactionIdentification, com.tools20022.repository.choice.References44Choice.SecuritiesSettlementTransactionIdentification,
					com.tools20022.repository.choice.References47Choice.SecuritiesSettlementTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails57.SettlementParameters,
					com.tools20022.repository.msg.Linkages43.LinkedQuantity, com.tools20022.repository.choice.References60Choice.SecuritiesSettlementTransactionIdentification,
					com.tools20022.repository.choice.References60Choice.SecuritiesFinancingTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails61.QuantityAndAccountDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails61.SettlementParameters, com.tools20022.repository.choice.References53Choice.SecuritiesSettlementTransactionConfirmationIdentification,
					com.tools20022.repository.choice.References53Choice.SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification,
					com.tools20022.repository.choice.References53Choice.SecuritiesSettlementTransactionGenerationNotificationIdentification, com.tools20022.repository.msg.TransactionDetails87.SettlementParameters,
					com.tools20022.repository.choice.References58Choice.SecuritiesSettlementTransactionIdentification, com.tools20022.repository.msg.TransactionDetails91.SettlementParameters,
					com.tools20022.repository.choice.References50Choice.SecuritiesSettlementTransactionIdentification, com.tools20022.repository.msg.TransactionDetails90.SettlementParameters,
					com.tools20022.repository.msg.Linkages48.LinkedQuantity, com.tools20022.repository.choice.References59Choice.SecuritiesFinancingTransactionIdentification,
					com.tools20022.repository.choice.References59Choice.SecuritiesSettlementTransactionIdentification, com.tools20022.repository.choice.References54Choice.SecuritiesSettlementTransactionIdentification,
					com.tools20022.repository.msg.RedemptionOrder14.SettlementAndCustodyDetails, com.tools20022.repository.msg.SubscriptionExecution13.SettlementAndCustodyDetails,
					com.tools20022.repository.msg.SubscriptionExecution12.SettlementAndCustodyDetails, com.tools20022.repository.msg.SubscriptionOrder15.SettlementAndCustodyDetails,
					com.tools20022.repository.msg.RedemptionOrder15.SettlementAndCustodyDetails, com.tools20022.repository.msg.RedemptionExecution16.SettlementAndCustodyDetails,
					com.tools20022.repository.msg.SubscriptionOrder14.SettlementAndCustodyDetails, com.tools20022.repository.msg.RedemptionExecution15.SettlementAndCustodyDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution4.SettlementAndCustodyDetails, com.tools20022.repository.msg.SecuritiesTradeDetails68.QuantityAndAccountDetails,
					com.tools20022.repository.msg.SecuritiesTradeDetails68.SettlementParameters, com.tools20022.repository.msg.TransactionDetails97.SettlementParameters,
					com.tools20022.repository.msg.TransactionDetails96.SettlementParameters, com.tools20022.repository.msg.TransactionDetails95.SettlementParameters,
					com.tools20022.repository.msg.SecuritiesTradeDetails69.QuantityAndAccountDetails, com.tools20022.repository.msg.SecuritiesTradeDetails69.SettlementParameters,
					com.tools20022.repository.msg.TransactionDetails100.SettlementParameters, com.tools20022.repository.msg.TransactionDetails99.SettlementParameters, com.tools20022.repository.msg.TransactionDetails98.SettlementParameters);
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Process of settling securities.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.SecuritiesTradeExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#SecuritiesTradeExecution
	 * SecuritiesPricing.SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#DealPrice
	 * SecuritiesTradeDetails25.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#DealPrice
	 * SecuritiesTradeDetails26.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#DealPrice
	 * SecuritiesTradeDetails27.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#DealPrice
	 * SecuritiesTradeDetails28.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#DealPrice
	 * SecuritiesTradeDetails6.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails13#DealPrice
	 * SecuritiesTradeDetails13.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3#DealPrice
	 * SecuritiesTradeDetails3.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11#DealPrice
	 * SecuritiesTradeDetails11.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#DealPrice
	 * SecuritiesTradeDetails2.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#DealPrice
	 * SecuritiesTradeDetails16.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#DealPrice
	 * SecuritiesTradeDetails1.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#DealPrice
	 * SecuritiesTradeDetails15.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#RelatedPrice
	 * EntryTransaction1.RelatedPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#RelatedPrice
	 * EntryTransaction2.RelatedPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#RelatedPrice
	 * EntryTransaction3.RelatedPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#RelatedPrice
	 * EntryTransaction4.RelatedPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#ExecutedTradePrice
	 * TransactionDetails3.ExecutedTradePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails8#DealPrice
	 * SecuritiesTradeDetails8.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails18#DealPrice
	 * SecuritiesTradeDetails18.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#DealPrice
	 * SecuritiesTradeDetails4.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#DealPrice
	 * SecuritiesTradeDetails17.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails9#DealPrice
	 * SecuritiesTradeDetails9.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails21#DealPrice
	 * SecuritiesTradeDetails21.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#DealPrice
	 * SecuritiesTradeDetails10.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#DealPrice
	 * SecuritiesTradeDetails22.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#DealPrice
	 * SecuritiesTradeDetails23.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#DealPrice
	 * SecuritiesTradeDetails29.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation1#DealPrice
	 * SettlementObligation1.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation6#DealPrice
	 * SettlementObligation6.DealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg2#DealPrice
	 * TradeLeg2.DealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg5#DealPrice
	 * TradeLeg5.DealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg1#DealPrice
	 * TradeLeg1.DealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg3#DealPrice
	 * TradeLeg3.DealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg6#DealPrice
	 * TradeLeg6.DealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg4#DealPrice
	 * TradeLeg4.DealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg7#DealPrice
	 * TradeLeg7.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#DealPrice
	 * SecuritiesTradeDetails31.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#DealPrice
	 * SecuritiesTradeDetails33.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#DealPrice
	 * SecuritiesTradeDetails35.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#DealPrice
	 * SecuritiesTradeDetails38.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#DealPrice
	 * SecuritiesTradeDetails37.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails36#DealPrice
	 * SecuritiesTradeDetails36.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#DealPrice
	 * SecuritiesTradeDetails34.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#DealPrice
	 * SecuritiesTradeDetails32.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#DealPrice
	 * SecuritiesTradeDetails44.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails39#DealPrice
	 * SecuritiesTradeDetails39.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#DealPrice
	 * SecuritiesTradeDetails43.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails41#DealPrice
	 * SecuritiesTradeDetails41.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40#DealPrice
	 * SecuritiesTradeDetails40.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#DealPrice
	 * SecuritiesTradeDetails42.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#DealPrice
	 * SecuritiesTradeDetails46.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#DealPrice
	 * SecuritiesTradeDetails47.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#RelatedPrice
	 * EntryTransaction7.RelatedPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#DealPrice
	 * TradeLeg8.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#DealPrice
	 * SettlementObligation7.DealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg10#DealPrice
	 * TradeLeg10.DealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#DealPrice
	 * TradeLeg9.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#DealPrice
	 * UnsecuredMarketTransaction1.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#DealPrice
	 * SecuritiesTradeDetails49.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#DealPrice
	 * SecuritiesTradeDetails51.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#DealPrice
	 * SecuritiesTradeDetails53.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#DealPrice
	 * SecuritiesTradeDetails55.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#DealPrice
	 * SecuritiesTradeDetails56.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#DealPrice
	 * SecuritiesTradeDetails54.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#DealPrice
	 * SecuritiesTradeDetails52.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#DealPrice
	 * SecuritiesTradeDetails50.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#RelatedPrice
	 * EntryTransaction8.RelatedPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59#DealPrice
	 * SecuritiesTradeDetails59.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58#DealPrice
	 * SecuritiesTradeDetails58.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#DealPrice
	 * SecuritiesTradeDetails61.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#DealPrice
	 * SecuritiesTradeDetails63.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#DealPrice
	 * SecuritiesTradeDetails62.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails60#DealPrice
	 * SecuritiesTradeDetails60.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#DealPrice
	 * SecuritiesTradeDetails65.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#DealPrice
	 * SecuritiesTradeDetails66.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#DealPrice
	 * UnsecuredMarketTransaction2.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#DealPrice
	 * UnsecuredMarketTransaction3.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#DealPrice
	 * SecuritiesTradeDetails67.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#DealPrice
	 * SecuritiesTradeDetails68.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#DealPrice
	 * SecuritiesTradeDetails69.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#DealPrice
	 * SecuritiesTradeDetails70.DealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#DealPrice
	 * UnsecuredMarketTransaction4.DealPrice}</li>
	 * </ul>
	 * </li>
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
	 * name} = "DealPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the price of the traded financial instrument.\nThis is the deal price of the individual trade transaction. \nIf there is only one trade transaction for the execution of the trade, then the deal price could equal the executed trade price (unless, for example, the price includes commissions or rounding, or some other factor has been applied to the deal price or the executed trade price, or both)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DealPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesTradeDetails25.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails26.DealPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails27.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails28.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails6.DealPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails13.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails3.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails11.DealPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails2.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails16.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails1.DealPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails15.DealPrice, com.tools20022.repository.msg.EntryTransaction1.RelatedPrice, com.tools20022.repository.msg.EntryTransaction2.RelatedPrice,
					com.tools20022.repository.msg.EntryTransaction3.RelatedPrice, com.tools20022.repository.msg.EntryTransaction4.RelatedPrice, com.tools20022.repository.msg.TransactionDetails3.ExecutedTradePrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails8.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails18.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails4.DealPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails17.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails9.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails21.DealPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails10.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails22.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails23.DealPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails29.DealPrice, com.tools20022.repository.msg.SettlementObligation1.DealPrice, com.tools20022.repository.msg.SettlementObligation6.DealPrice,
					com.tools20022.repository.msg.TradeLeg2.DealPrice, com.tools20022.repository.msg.TradeLeg5.DealPrice, com.tools20022.repository.msg.TradeLeg1.DealPrice, com.tools20022.repository.msg.TradeLeg3.DealPrice,
					com.tools20022.repository.msg.TradeLeg6.DealPrice, com.tools20022.repository.msg.TradeLeg4.DealPrice, com.tools20022.repository.msg.TradeLeg7.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails31.DealPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails33.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails35.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails38.DealPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails37.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails36.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails34.DealPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails32.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails44.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails39.DealPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails43.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails41.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails40.DealPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails42.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails46.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails47.DealPrice,
					com.tools20022.repository.msg.EntryTransaction7.RelatedPrice, com.tools20022.repository.msg.TradeLeg8.DealPrice, com.tools20022.repository.msg.SettlementObligation7.DealPrice,
					com.tools20022.repository.msg.TradeLeg10.DealPrice, com.tools20022.repository.msg.TradeLeg9.DealPrice, com.tools20022.repository.msg.UnsecuredMarketTransaction1.DealPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails49.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails51.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails53.DealPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails55.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails56.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails54.DealPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails52.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails50.DealPrice, com.tools20022.repository.msg.EntryTransaction8.RelatedPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails59.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails58.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails61.DealPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails63.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails62.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails60.DealPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails65.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails66.DealPrice, com.tools20022.repository.msg.UnsecuredMarketTransaction2.DealPrice,
					com.tools20022.repository.msg.UnsecuredMarketTransaction3.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails67.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails68.DealPrice,
					com.tools20022.repository.msg.SecuritiesTradeDetails69.DealPrice, com.tools20022.repository.msg.SecuritiesTradeDetails70.DealPrice, com.tools20022.repository.msg.UnsecuredMarketTransaction4.DealPrice);
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DealPrice";
			definition = "Specifies the price of the traded financial instrument.\nThis is the deal price of the individual trade transaction. \nIf there is only one trade transaction for the execution of the trade, then the deal price could equal the executed trade price (unless, for example, the price includes commissions or rounding, or some other factor has been applied to the deal price or the executed trade price, or both).";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.SecuritiesTradeExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute MarginAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarginAmount";
			definition = "Difference in prices at which a dealer will buy and sell.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Quantity of financial instrument executed by the trading party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesTradeExecution
	 * SecuritiesQuantity.SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#ExecutedTradeQuantity
	 * TransactionDetails3.ExecutedTradeQuantity}</li>
	 * </ul>
	 * </li>
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
	 * name} = "ExecutedTradeQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instrument executed by the trading party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExecutedTradeQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionDetails3.ExecutedTradeQuantity);
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutedTradeQuantity";
			definition = "Quantity of financial instrument executed by the trading party.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesTradeExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OffMarket1Choice#OffMarketIndicator
	 * OffMarket1Choice.OffMarketIndicator}</li>
	 * </ul>
	 * </li>
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
	 * name} = "OffMarketReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for which the trade was executed off-market."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OffMarketReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.OffMarket1Choice.OffMarketIndicator);
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OffMarketReason";
			definition = "Reason for which the trade was executed off-market.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OffMarketCode.mmObject();
		}
	};
	/**
	 * Trade which is executed through one or more execution trades.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#TradingExecution
	 * SecuritiesTrade.TradingExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3#TradeDetails
	 * SecuritiesSettlementTransactionDetails3.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4#TradeDetails
	 * SecuritiesSettlementTransactionDetails4.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2#TradeDetails
	 * SecuritiesSettlementTransactionDetails2.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5#TradeDetails
	 * SecuritiesSettlementTransactionDetails5.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#TradeDetails
	 * SecuritiesSettlementTransactionDetails6.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7#TradeDetails
	 * SecuritiesSettlementTransactionDetails7.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8#TradeDetails
	 * SecuritiesSettlementTransactionDetails8.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9#TradeDetails
	 * SecuritiesSettlementTransactionDetails9.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10#TradeDetails
	 * SecuritiesSettlementTransactionDetails10.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11#TradeDetails
	 * SecuritiesSettlementTransactionDetails11.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12#TradeDetails
	 * SecuritiesSettlementTransactionDetails12.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13#TradeDetails
	 * SecuritiesSettlementTransactionDetails13.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Clearing1#NonGuaranteedTrade
	 * Clearing1.NonGuaranteedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Clearing2#NonGuaranteedTrade
	 * Clearing2.NonGuaranteedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16#TradeDetails
	 * SecuritiesSettlementTransactionDetails16.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14#TradeDetails
	 * SecuritiesSettlementTransactionDetails14.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15#TradeDetails
	 * SecuritiesSettlementTransactionDetails15.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17#TradeDetails
	 * SecuritiesSettlementTransactionDetails17.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18#TradeDetails
	 * SecuritiesSettlementTransactionDetails18.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19#TradeDetails
	 * SecuritiesSettlementTransactionDetails19.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Clearing4#NonGuaranteedTrade
	 * Clearing4.NonGuaranteedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21#TradeDetails
	 * SecuritiesSettlementTransactionDetails21.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22#TradeDetails
	 * SecuritiesSettlementTransactionDetails22.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20#TradeDetails
	 * SecuritiesSettlementTransactionDetails20.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23#TradeDetails
	 * SecuritiesSettlementTransactionDetails23.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25#TradeDetails
	 * SecuritiesSettlementTransactionDetails25.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24#TradeDetails
	 * SecuritiesSettlementTransactionDetails24.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#TradeDetails
	 * SecuritiesSettlementTransactionDetails27.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#TradeDetails
	 * SecuritiesSettlementTransactionDetails28.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#TradeDetails
	 * SecuritiesSettlementTransactionDetails26.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30#TradeDetails
	 * SecuritiesSettlementTransactionDetails30.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29#TradeDetails
	 * SecuritiesSettlementTransactionDetails29.TradeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31#TradeDetails
	 * SecuritiesSettlementTransactionDetails31.TradeDetails}</li>
	 * </ul>
	 * </li>
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
	 * name} = "RelatedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade which is executed through one or more execution trades."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedTrade = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3.TradeDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4.TradeDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2.TradeDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5.TradeDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6.TradeDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7.TradeDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8.TradeDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9.TradeDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10.TradeDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11.TradeDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12.TradeDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13.TradeDetails,
					com.tools20022.repository.msg.Clearing1.NonGuaranteedTrade, com.tools20022.repository.msg.Clearing2.NonGuaranteedTrade, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16.TradeDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14.TradeDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15.TradeDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17.TradeDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18.TradeDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19.TradeDetails, com.tools20022.repository.msg.Clearing4.NonGuaranteedTrade,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21.TradeDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22.TradeDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20.TradeDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23.TradeDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25.TradeDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24.TradeDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27.TradeDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28.TradeDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26.TradeDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30.TradeDetails,
					com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29.TradeDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31.TradeDetails);
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedTrade";
			definition = "Trade which is executed through one or more execution trades.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.TradingExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute DealExecutionAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DealExecutionAmount";
			definition = "Deal price multiplied by the quantity of a financial instrument traded for the specific trade transaction i.e. the partially filled quantity.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the cash delivery obligations resulting from the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#ExecutedSecuritiesTrade
	 * PaymentObligation.ExecutedSecuritiesTrade}</li>
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
	public static final MMBusinessAssociationEnd PaymentObligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Specifies the cash delivery obligations resulting from the trade.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.ExecutedSecuritiesTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the securities delivery obligations resulting from the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#SecuritiesTradeExecution
	 * SecuritiesDeliveryObligation.SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation2#AdditionalSettlementObligationDetails
	 * SettlementObligation2.AdditionalSettlementObligationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#AdditionalSettlementObligationDetails
	 * SettlementObligation4.AdditionalSettlementObligationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#AdditionalSettlementObligationDetails
	 * SettlementObligation8.AdditionalSettlementObligationDetails}</li>
	 * </ul>
	 * </li>
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
	 * name} = "SecuritiesDeliveryObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the securities delivery obligations resulting from the trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesDeliveryObligation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementObligation2.AdditionalSettlementObligationDetails, com.tools20022.repository.msg.SettlementObligation4.AdditionalSettlementObligationDetails,
					com.tools20022.repository.msg.SettlementObligation8.AdditionalSettlementObligationDetails);
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesDeliveryObligation";
			definition = "Specifies the securities delivery obligations resulting from the trade.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.SecuritiesTradeExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.Reporting2Choice#Code
	 * Reporting2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reporting2Choice#Proprietary
	 * Reporting2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Reporting3Choice#Code
	 * Reporting3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reporting3Choice#Proprietary
	 * Reporting3Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Reporting5Choice#Code
	 * Reporting5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reporting5Choice#Proprietary
	 * Reporting5Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#Reporting
	 * Order16.Reporting}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#Reporting
	 * Order14.Reporting}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Reporting1Choice#Code
	 * Reporting1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reporting1Choice#Proprietary
	 * Reporting1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Reporting4Choice#Code
	 * Reporting4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reporting4Choice#Proprietary
	 * Reporting4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1#ReportingIndicator
	 * OrderParameters1.ReportingIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#Reporting
	 * Order17.Reporting}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#Reporting
	 * Order18.Reporting}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Reporting6Choice#Code
	 * Reporting6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reporting6Choice#Proprietary
	 * Reporting6Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Reporting7Choice#Code
	 * Reporting7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reporting7Choice#Proprietary
	 * Reporting7Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Reporting8Choice#Code
	 * Reporting8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reporting8Choice#Proprietary
	 * Reporting8Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Reporting9Choice#Code
	 * Reporting9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reporting9Choice#Proprietary
	 * Reporting9Choice.Proprietary}</li>
	 * </ul>
	 * </li>
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
	 * name} = "ReportingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that a trade is to be reported to a third party."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReportingType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Reporting2Choice.Code, com.tools20022.repository.choice.Reporting2Choice.Proprietary, com.tools20022.repository.choice.Reporting3Choice.Code,
					com.tools20022.repository.choice.Reporting3Choice.Proprietary, com.tools20022.repository.choice.Reporting5Choice.Code, com.tools20022.repository.choice.Reporting5Choice.Proprietary,
					com.tools20022.repository.msg.Order16.Reporting, com.tools20022.repository.msg.Order14.Reporting, com.tools20022.repository.choice.Reporting1Choice.Code, com.tools20022.repository.choice.Reporting1Choice.Proprietary,
					com.tools20022.repository.choice.Reporting4Choice.Code, com.tools20022.repository.choice.Reporting4Choice.Proprietary, com.tools20022.repository.msg.OrderParameters1.ReportingIndicator,
					com.tools20022.repository.msg.Order17.Reporting, com.tools20022.repository.msg.Order18.Reporting, com.tools20022.repository.choice.Reporting6Choice.Code, com.tools20022.repository.choice.Reporting6Choice.Proprietary,
					com.tools20022.repository.choice.Reporting7Choice.Code, com.tools20022.repository.choice.Reporting7Choice.Proprietary, com.tools20022.repository.choice.Reporting8Choice.Code,
					com.tools20022.repository.choice.Reporting8Choice.Proprietary, com.tools20022.repository.choice.Reporting9Choice.Code, com.tools20022.repository.choice.Reporting9Choice.Proprietary);
			elementContext_lazy = () -> SecuritiesTradeExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportingType";
			definition = "Specifies that a trade is to be reported to a third party.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ReportingCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTradeExecution";
				definition = "Transaction between two counterparties in which they agree to buy and sell a financial instrument. A trade transaction occurs with the matching of the two counterparties orders. There could be several trade transactions necessary to execute the trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.SecuritiesTradeExecution, com.tools20022.repository.entity.PaymentObligation.ExecutedSecuritiesTrade,
						com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesTrade.TradingExecution,
						com.tools20022.repository.entity.SecuritiesSettlement.SecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesDeliveryObligation.SecuritiesTradeExecution);
				subType_lazy = () -> Arrays.asList(InvestmentFundOrderExecution.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTradeExecution.StampDutyIndicator, com.tools20022.repository.entity.SecuritiesTradeExecution.ProcessingPosition,
						com.tools20022.repository.entity.SecuritiesTradeExecution.SecuritiesSettlement, com.tools20022.repository.entity.SecuritiesTradeExecution.DealPrice,
						com.tools20022.repository.entity.SecuritiesTradeExecution.MarginAmount, com.tools20022.repository.entity.SecuritiesTradeExecution.ExecutedTradeQuantity,
						com.tools20022.repository.entity.SecuritiesTradeExecution.OffMarketReason, com.tools20022.repository.entity.SecuritiesTradeExecution.RelatedTrade,
						com.tools20022.repository.entity.SecuritiesTradeExecution.DealExecutionAmount, com.tools20022.repository.entity.SecuritiesTradeExecution.PaymentObligation,
						com.tools20022.repository.entity.SecuritiesTradeExecution.SecuritiesDeliveryObligation, com.tools20022.repository.entity.SecuritiesTradeExecution.ReportingType);
				derivationComponent_lazy = () -> Arrays.asList(Reporting2Choice.mmObject(), Reporting3Choice.mmObject(), Reporting5Choice.mmObject(), OffMarket1Choice.mmObject(), Reporting1Choice.mmObject(), Reporting4Choice.mmObject(),
						Reporting6Choice.mmObject(), Reporting7Choice.mmObject(), Reporting8Choice.mmObject(), Reporting9Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}