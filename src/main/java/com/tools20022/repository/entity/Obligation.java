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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.ExposureTypeV2Code;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.entity.Obligation;
import com.tools20022.repository.entity.ObligationFulfilment;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.entity.TransactionRisk;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the assets (quantity of securities, goods, services, and cash
 * amounts) that have to be delivered.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Obligation" src="doc-files/Obligation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
 * Obligation.mmRequestedSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementAmount
 * Obligation.mmRequestedSettlementAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#mmPriority
 * Obligation.mmPriority}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#mmTrade
 * Obligation.mmTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Obligation#mmTransactionRisk
 * Obligation.mmTransactionRisk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Obligation#mmParentObligation
 * Obligation.mmParentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#mmSubObligation
 * Obligation.mmSubObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#mmOffset
 * Obligation.mmOffset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Obligation#mmOriginalObligationProcess
 * Obligation.mmOriginalObligationProcess}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#mmExposureType
 * Obligation.mmExposureType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmObligation
 * Trade.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Obligation#mmParentObligation
 * Obligation.mmParentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#mmSubObligation
 * Obligation.mmSubObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmObligationOffset
 * ObligationFulfilment.mmObligationOffset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmResultingObligation
 * ObligationFulfilment.mmResultingObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionRisk#mmObligation
 * TransactionRisk.mmObligation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetObligation1#mmObligationIdentification
 * NetObligation1.mmObligationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeClearing2#mmClearingObligation
 * TradeClearing2.mmClearingObligation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentObligation
 * PaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
 * SecuritiesDeliveryObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductDeliveryObligation
 * ProductDeliveryObligation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.PriorityNumeric3Choice
 * PriorityNumeric3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetObligation1 NetObligation1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Obligation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the assets (quantity of securities, goods, services, and cash amounts) that have to be delivered."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class Obligation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime requestedSettlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmRequestedExecutionDate
	 * PaymentSearch4.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument33#mmRequestedSettlementDate
	 * FinancialInstrument33.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer24#mmRequestedSettlementDate
	 * Transfer24.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation11#mmRequestedSettlementDate
	 * ReceiveInformation11.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer25#mmRequestedSettlementDate
	 * Transfer25.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation11#mmRequestedSettlementDate
	 * DeliverInformation11.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementDate1Choice#mmDateCode
	 * SettlementDate1Choice.mmDateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails10#mmSettlementDate
	 * TransactionDetails10.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails29#mmSettlementDate
	 * TransactionDetails29.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#mmSettlementDate
	 * SecuritiesTradeDetails26.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails28#mmSettlementDate
	 * TransactionDetails28.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementDate4Choice#mmDateCode
	 * SettlementDate4Choice.mmDateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails31#mmSettlementDate
	 * TransactionDetails31.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails44#mmSettlementDate
	 * TransactionDetails44.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#mmSettlementDate
	 * SecuritiesTradeDetails28.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer1#mmRequestedTransferDate
	 * Transfer1.mmRequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer9#mmRequestedTransferDate
	 * Transfer9.mmRequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut7#mmRequestedTransferDate
	 * TransferOut7.mmRequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer20#mmRequestedSettlementDate
	 * Transfer20.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#mmRequestedSettlementDate
	 * ReceiveInformation9.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut9#mmRequestedTransferDate
	 * TransferOut9.mmRequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer22#mmRequestedSettlementDate
	 * Transfer22.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#mmRequestedSettlementDate
	 * DeliverInformation9.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer26#mmRequestedSettlementDate
	 * Transfer26.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer21#mmRequestedSettlementDate
	 * Transfer21.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer23#mmRequestedSettlementDate
	 * Transfer23.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer8#mmRequestedTransferDate
	 * Transfer8.mmRequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer19#mmRequestedSettlementDate
	 * Transfer19.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails1#mmSettlementDate
	 * IntraPositionMovementDetails1.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails2#mmSettlementDate
	 * IntraPositionMovementDetails2.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails5#mmSettlementDate
	 * IntraPositionMovementDetails5.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#mmSettlementDate
	 * IntraPositionMovementDetails6.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails7#mmSettlementDate
	 * IntraPositionMovementDetails7.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails8#mmSettlementDate
	 * IntraPositionMovementDetails8.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails9#mmSettlementDate
	 * IntraPositionMovementDetails9.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails10#mmSettlementDate
	 * IntraPositionMovementDetails10.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementDate3Choice#mmDateCode
	 * SettlementDate3Choice.mmDateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#mmSettlementDate
	 * SecuritiesTradeDetails6.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementDate5Choice#mmDateCode
	 * SettlementDate5Choice.mmDateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails13#mmSettlementDate
	 * SecuritiesTradeDetails13.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#mmSettlementDate
	 * SecuritiesTradeDetails2.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#mmSettlementDate
	 * SecuritiesTradeDetails16.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmSettlementDate
	 * SecuritiesTradeDetails1.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#mmSettlementDate
	 * SecuritiesTradeDetails15.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#mmExpectedSettlementDate
	 * TransactionDetails5.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#mmSettlementDate
	 * TransactionDetails5.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#mmExpectedSettlementDate
	 * TransactionDetails9.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#mmSettlementDate
	 * TransactionDetails9.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#mmExpectedSettlementDate
	 * TransactionDetails22.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#mmSettlementDate
	 * TransactionDetails22.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#mmExpectedSettlementDate
	 * TransactionDetails23.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#mmSettlementDate
	 * TransactionDetails23.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#mmExpectedSettlementDate
	 * TransactionDetails36.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#mmSettlementDate
	 * TransactionDetails36.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#mmExpectedSettlementDate
	 * TransactionDetails47.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#mmSettlementDate
	 * TransactionDetails47.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#mmExpectedSettlementDate
	 * TransactionDetails53.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#mmSettlementDate
	 * TransactionDetails53.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#mmExpectedSettlementDate
	 * TransactionDetails58.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#mmSettlementDate
	 * TransactionDetails58.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#mmExpectedSettlementDate
	 * TransactionDetails7.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#mmSettlementDate
	 * TransactionDetails7.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#mmExpectedSettlementDate
	 * TransactionDetails8.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#mmSettlementDate
	 * TransactionDetails8.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#mmExpectedSettlementDate
	 * TransactionDetails16.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#mmSettlementDate
	 * TransactionDetails16.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#mmExpectedSettlementDate
	 * TransactionDetails17.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#mmSettlementDate
	 * TransactionDetails17.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#mmExpectedSettlementDate
	 * TransactionDetails26.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#mmSettlementDate
	 * TransactionDetails26.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#mmExpectedSettlementDate
	 * TransactionDetails25.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#mmSettlementDate
	 * TransactionDetails25.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#mmExpectedSettlementDate
	 * TransactionDetails27.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#mmSettlementDate
	 * TransactionDetails27.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#mmExpectedSettlementDate
	 * TransactionDetails33.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#mmSettlementDate
	 * TransactionDetails33.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#mmExpectedSettlementDate
	 * TransactionDetails39.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#mmSettlementDate
	 * TransactionDetails39.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#mmExpectedSettlementDate
	 * TransactionDetails50.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#mmSettlementDate
	 * TransactionDetails50.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#mmExpectedSettlementDate
	 * TransactionDetails56.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#mmSettlementDate
	 * TransactionDetails56.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#mmExpectedSettlementDate
	 * TransactionDetails59.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#mmSettlementDate
	 * TransactionDetails59.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#mmSettlementDate
	 * TransactionDetails6.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#mmSettlementDate
	 * TransactionDetails18.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#mmSettlementDate
	 * TransactionDetails24.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#mmSettlementDate
	 * TransactionDetails34.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#mmSettlementDate
	 * TransactionDetails37.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#mmSettlementDate
	 * TransactionDetails48.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#mmSettlementDate
	 * TransactionDetails57.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#mmSettlementDate
	 * TransactionDetails60.mmSettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmSettlementDate
	 * Order16.mmSettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmSettlementDate
	 * Order14.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates2#mmTradeActivityContractualSettlementDate
	 * TransactionDates2.mmTradeActivityContractualSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference1#mmRequestedExecutionDate
	 * OriginalTransactionReference1.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference1#mmRequestedCollectionDate
	 * OriginalTransactionReference1.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference13#mmRequestedCollectionDate
	 * OriginalTransactionReference13.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference13#mmRequestedExecutionDate
	 * OriginalTransactionReference13.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference16#mmRequestedCollectionDate
	 * OriginalTransactionReference16.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference16#mmRequestedExecutionDate
	 * OriginalTransactionReference16.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction37#mmOriginalRequestedExecutionDate
	 * PaymentTransaction37.mmOriginalRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction37#mmOriginalRequestedCollectionDate
	 * PaymentTransaction37.mmOriginalRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction47#mmOriginalRequestedExecutionDate
	 * PaymentTransaction47.mmOriginalRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction47#mmOriginalRequestedCollectionDate
	 * PaymentTransaction47.mmOriginalRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#mmRequestedCollectionDate
	 * DirectDebitTransactionInformation2.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#mmRequestedCollectionDate
	 * DirectDebitTransactionInformation10.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#mmRequestedCollectionDate
	 * DirectDebitTransactionInformation12.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#mmRequestedCollectionDate
	 * DirectDebitTransactionInformation14.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference15#mmRequestedCollectionDate
	 * OriginalTransactionReference15.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference15#mmRequestedExecutionDate
	 * OriginalTransactionReference15.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference17#mmRequestedCollectionDate
	 * OriginalTransactionReference17.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference17#mmRequestedExecutionDate
	 * OriginalTransactionReference17.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference19#mmRequestedExecutionDate
	 * OriginalTransactionReference19.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails1#mmExpectedSettlementDate
	 * ExpectedExecutionDetails1.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails2#mmExpectedCashSettlementDate
	 * ExpectedExecutionDetails2.mmExpectedCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmRequestedExecutionDate
	 * RequestedModification.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#mmSettlementDate
	 * TransactionDetails1.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#mmSettlementDate
	 * TransactionDetails3.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7#mmSettlementDate
	 * SecuritiesTradeDetails7.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19#mmSettlementDate
	 * SecuritiesTradeDetails19.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails2.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails8.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails8#mmSettlementDate
	 * SecuritiesTradeDetails8.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails18#mmSettlementDate
	 * SecuritiesTradeDetails18.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmSettlementDate
	 * SecuritiesTradeDetails4.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#mmSettlementDate
	 * SecuritiesTradeDetails17.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails4#mmSettlementDate
	 * TransactionDetails4.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails30#mmSettlementDate
	 * TransactionDetails30.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction1#mmRequestedCollectionDate
	 * UnderlyingPaymentInstruction1.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#mmRequestedExecutionDate
	 * RequestedModification2.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#mmRequestedCollectionDate
	 * RequestedModification2.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation1#mmRequestedCollectionDate
	 * CorrectivePaymentInitiation1.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Summary1#mmRequestedSettlementDate
	 * Summary1.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails6.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails10.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails17.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails18.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails20#mmSettlementDate
	 * TransactionDetails20.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails9#mmSettlementDate
	 * SecuritiesTradeDetails9.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails21#mmSettlementDate
	 * SecuritiesTradeDetails21.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmSettlementDate
	 * SecuritiesTradeDetails10.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#mmSettlementDate
	 * SecuritiesTradeDetails22.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#mmSettlementDate
	 * SecuritiesTradeDetails23.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#mmSettlementDate
	 * SecuritiesTradeDetails29.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails40#mmSettlementDate
	 * TransactionDetails40.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42#mmSettlementDate
	 * TransactionDetails42.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails46#mmSettlementDate
	 * TransactionDetails46.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails32#mmSettlementDate
	 * TransactionDetails32.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails14#mmSettlementDate
	 * TransactionDetails14.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails35#mmSettlementDate
	 * TransactionDetails35.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14#mmSettlementDate
	 * SecuritiesTradeDetails14.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20#mmSettlementDate
	 * SecuritiesTradeDetails20.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmSettlementDate
	 * SecuritiesTradeDetails24.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30#mmSettlementDate
	 * SecuritiesTradeDetails30.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails45#mmSettlementDate
	 * TransactionDetails45.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2#mmRequestedCollectionDate
	 * UnderlyingPaymentInstruction2.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction39#mmOriginalRequestedExecutionDate
	 * PaymentTransaction39.mmOriginalRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction39#mmOriginalRequestedCollectionDate
	 * PaymentTransaction39.mmOriginalRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#mmRequestedExecutionDate
	 * RequestedModification3.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#mmRequestedCollectionDate
	 * RequestedModification3.mmRequestedCollectionDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg2#mmSettlementDate
	 * TradeLeg2.mmSettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg5#mmSettlementDate
	 * TradeLeg5.mmSettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg1#mmSettlementDate
	 * TradeLeg1.mmSettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg3#mmSettlementDate
	 * TradeLeg3.mmSettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg6#mmSettlementDate
	 * TradeLeg6.mmSettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg4#mmSettlementDate
	 * TradeLeg4.mmSettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg7#mmSettlementDate
	 * TradeLeg7.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3#mmExpectedCashSettlementDate
	 * ExpectedExecutionDetails3.mmExpectedCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference7#mmRequestedCollectionDate
	 * OriginalTransactionReference7.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference10#mmRequestedCollectionDate
	 * OriginalTransactionReference10.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference9#mmRequestedCollectionDate
	 * OriginalTransactionReference9.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference12#mmRequestedExecutionDate
	 * OriginalTransactionReference12.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference12#mmRequestedCollectionDate
	 * OriginalTransactionReference12.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference8#mmRequestedCollectionDate
	 * OriginalTransactionReference8.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference11#mmRequestedCollectionDate
	 * OriginalTransactionReference11.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation5#mmRequestedCollectionDate
	 * DirectDebitTransactionInformation5.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation7#mmRequestedCollectionDate
	 * DirectDebitTransactionInformation7.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#mmRequestedCollectionDate
	 * DirectDebitTransactionInformation6.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#mmRequestedCollectionDate
	 * DirectDebitTransactionInformation8.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails3#mmSettlementDate
	 * IntraPositionMovementDetails3.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails4#mmSettlementDate
	 * IntraPositionMovementDetails4.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlement1#mmDate
	 * SecuritiesSettlement1.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlement2#mmDate
	 * SecuritiesSettlement2.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement2#mmIntendedSettlementDate
	 * IntraBalanceMovement2.mmIntendedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#mmIntendedSettlementDate
	 * TransactionDetails51.mmIntendedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#mmIntendedSettlementDate
	 * IntraPositionQueryCriteria1.mmIntendedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails52#mmSettlementDate
	 * TransactionDetails52.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#mmRequestedSettlementDate
	 * ReceiveInformation13.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer27#mmRequestedSettlementDate
	 * Transfer27.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmRequestedSettlementDate
	 * Transfer28.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation12#mmRequestedSettlementDate
	 * ReceiveInformation12.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmRequestedSettlementDate
	 * Transfer29.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation12#mmRequestedSettlementDate
	 * DeliverInformation12.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#mmRequestedSettlementDate
	 * DeliverInformation13.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn10#mmRequestedTransferDate
	 * TransferIn10.mmRequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut11#mmRequestedTransferDate
	 * TransferOut11.mmRequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmRequestedExecutionDate
	 * PaymentSearch5.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument35#mmRequestedSettlementDate
	 * FinancialInstrument35.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#mmExpectedSettlementDate
	 * TransactionDetails61.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#mmSettlementDate
	 * TransactionDetails61.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation6#mmRequestedCollectionDate
	 * OriginalPaymentInformation6.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails21.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#mmExpectedSettlementDate
	 * TransactionDetails62.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#mmSettlementDate
	 * TransactionDetails62.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#mmSettlementDate
	 * TransactionDetails63.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#mmSettlementDate
	 * SecuritiesTradeDetails31.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmSettlementDate
	 * SecuritiesTradeDetails33.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#mmSettlementDate
	 * SecuritiesTradeDetails35.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#mmSettlementDate
	 * SecuritiesTradeDetails38.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails36#mmSettlementDate
	 * SecuritiesTradeDetails36.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#mmSettlementDate
	 * SecuritiesTradeDetails34.mmSettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmSettlementDate
	 * Order17.mmSettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmSettlementDate
	 * Order18.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#mmSettlementDate
	 * SecuritiesTradeDetails44.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails39#mmSettlementDate
	 * SecuritiesTradeDetails39.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#mmSettlementDate
	 * SecuritiesTradeDetails43.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails41#mmSettlementDate
	 * SecuritiesTradeDetails41.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails22.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#mmExpectedSettlementDate
	 * TransactionDetails66.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#mmSettlementDate
	 * TransactionDetails66.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#mmSettlementDate
	 * SecuritiesTradeDetails42.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#mmExpectedSettlementDate
	 * TransactionDetails67.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#mmSettlementDate
	 * TransactionDetails67.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#mmSettlementDate
	 * TransactionDetails68.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#mmSettlementDate
	 * SecuritiesTradeDetails47.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument40#mmRequestedSettlementDate
	 * FinancialInstrument40.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#mmRequestedCollectionDate
	 * DirectDebitTransactionInformation17.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#mmRequestedExecutionDate
	 * RequestedModification4.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#mmRequestedCollectionDate
	 * RequestedModification4.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction58#mmOriginalRequestedExecutionDate
	 * PaymentTransaction58.mmOriginalRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction58#mmOriginalRequestedCollectionDate
	 * PaymentTransaction58.mmOriginalRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction54#mmOriginalRequestedExecutionDate
	 * PaymentTransaction54.mmOriginalRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction54#mmOriginalRequestedCollectionDate
	 * PaymentTransaction54.mmOriginalRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference20#mmRequestedCollectionDate
	 * OriginalTransactionReference20.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference20#mmRequestedExecutionDate
	 * OriginalTransactionReference20.mmRequestedExecutionDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmSettlementDate
	 * TradeLeg8.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#mmRequestedSettlementDate
	 * DeliverInformation15.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation14#mmRequestedSettlementDate
	 * DeliverInformation14.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#mmRequestedSettlementDate
	 * ReceiveInformation15.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation14#mmRequestedSettlementDate
	 * ReceiveInformation14.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn13#mmRequestedTransferDate
	 * TransferIn13.mmRequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut15#mmRequestedTransferDate
	 * TransferOut15.mmRequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails24.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#mmExpectedSettlementDate
	 * TransactionDetails70.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#mmSettlementDate
	 * TransactionDetails70.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#mmExpectedSettlementDate
	 * TransactionDetails69.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#mmSettlementDate
	 * TransactionDetails69.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#mmSettlementDate
	 * TradeLeg10.mmSettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmSettlementDate
	 * TradeLeg9.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference21#mmRequestedExecutionDate
	 * OriginalTransactionReference21.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#mmExpectedSettlementDate
	 * TransactionDetails71.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#mmSettlementDate
	 * TransactionDetails71.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails25.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#mmExpectedSettlementDate
	 * TransactionDetails72.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#mmSettlementDate
	 * TransactionDetails72.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails81#mmSettlementDate
	 * TransactionDetails81.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails74#mmSettlementDate
	 * TransactionDetails74.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#mmSettlementDate
	 * SecuritiesTradeDetails49.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82#mmSettlementDate
	 * TransactionDetails82.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails26.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#mmExpectedSettlementDate
	 * TransactionDetails79.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#mmSettlementDate
	 * TransactionDetails79.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmSettlementDate
	 * SecuritiesTradeDetails48.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails80#mmSettlementDate
	 * TransactionDetails80.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#mmExpectedSettlementDate
	 * TransactionDetails75.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#mmSettlementDate
	 * TransactionDetails75.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmSettlementDate
	 * TransactionDetails78.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestPaymentDateRange2#mmDueDate
	 * InterestPaymentDateRange2.mmDueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmSettlementDate
	 * SecuritiesTradeDetails51.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#mmSettlementDate
	 * SecuritiesTradeDetails53.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmSettlementDate
	 * SecuritiesTradeDetails55.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#mmSettlementDate
	 * SecuritiesTradeDetails54.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementDate9Choice#mmDateCode
	 * SettlementDate9Choice.mmDateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementDate11Choice#mmDateCode
	 * SettlementDate11Choice.mmDateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmSettlementDate
	 * SecuritiesTradeDetails52.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails11#mmSettlementDate
	 * IntraPositionMovementDetails11.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#mmRequestedExecutionDate
	 * RequestedModification5.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#mmRequestedCollectionDate
	 * RequestedModification5.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#mmRequestedCollectionDate
	 * DirectDebitTransactionInformation20.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction61#mmOriginalRequestedExecutionDate
	 * PaymentTransaction61.mmOriginalRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction61#mmOriginalRequestedCollectionDate
	 * PaymentTransaction61.mmOriginalRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference22#mmRequestedCollectionDate
	 * OriginalTransactionReference22.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference22#mmRequestedExecutionDate
	 * OriginalTransactionReference22.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66#mmOriginalRequestedExecutionDate
	 * PaymentTransaction66.mmOriginalRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66#mmOriginalRequestedCollectionDate
	 * PaymentTransaction66.mmOriginalRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#mmRequestedSettlementDate
	 * ReceiveInformation17.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmRequestedSettlementDate
	 * Transfer31.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmRequestedSettlementDate
	 * Transfer30.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#mmRequestedSettlementDate
	 * ReceiveInformation16.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmRequestedSettlementDate
	 * DeliverInformation16.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer32#mmRequestedSettlementDate
	 * Transfer32.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#mmRequestedSettlementDate
	 * DeliverInformation17.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#mmRequestedSettlementDate
	 * Transfer33.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut17#mmRequestedTransferDate
	 * TransferOut17.mmRequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn15#mmRequestedTransferDate
	 * TransferIn15.mmRequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#mmRequestedSettlementDate
	 * FinancialInstrument48.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference23#mmRequestedExecutionDate
	 * OriginalTransactionReference23.mmRequestedExecutionDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CollateralMovement9#mmDate
	 * CollateralMovement9.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57#mmSettlementDate
	 * SecuritiesTradeDetails57.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails33.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails88#mmSettlementDate
	 * TransactionDetails88.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58#mmSettlementDate
	 * SecuritiesTradeDetails58.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#mmSettlementDate
	 * SecuritiesTradeDetails61.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails92#mmSettlementDate
	 * TransactionDetails92.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails84#mmSettlementDate
	 * TransactionDetails84.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmSettlementDate
	 * SecuritiesTradeDetails63.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails83#mmSettlementDate
	 * TransactionDetails83.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmSettlementDate
	 * SecuritiesTradeDetails62.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#mmExpectedSettlementDate
	 * TransactionDetails87.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#mmSettlementDate
	 * TransactionDetails87.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails60#mmSettlementDate
	 * SecuritiesTradeDetails60.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementDate12Choice#mmDateCode
	 * SettlementDate12Choice.mmDateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementDate14Choice#mmDateCode
	 * SettlementDate14Choice.mmDateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#mmSettlementDate
	 * TransactionDetails91.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#mmExpectedSettlementDate
	 * TransactionDetails90.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#mmSettlementDate
	 * TransactionDetails90.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails12#mmSettlementDate
	 * IntraPositionMovementDetails12.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#mmSettlementDate
	 * SecuritiesTradeDetails66.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement4#mmIntendedSettlementDate
	 * IntraBalanceMovement4.mmIntendedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails93#mmIntendedSettlementDate
	 * TransactionDetails93.mmIntendedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria6#mmIntendedSettlementDate
	 * IntraPositionQueryCriteria6.mmIntendedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails94#mmSettlementDate
	 * TransactionDetails94.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch6#mmRequestedExecutionDate
	 * PaymentSearch6.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails4#mmExpectedCashSettlementDate
	 * ExpectedExecutionDetails4.mmExpectedCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmRequestedCollectionDate
	 * DirectDebitTransactionInformation21.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmRequestedExecutionDate
	 * RequestedModification6.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmRequestedCollectionDate
	 * RequestedModification6.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#mmOriginalRequestedExecutionDate
	 * PaymentTransaction78.mmOriginalRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#mmOriginalRequestedCollectionDate
	 * PaymentTransaction78.mmOriginalRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmRequestedCollectionDate
	 * OriginalTransactionReference24.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmRequestedExecutionDate
	 * OriginalTransactionReference24.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction74#mmOriginalRequestedExecutionDate
	 * PaymentTransaction74.mmOriginalRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction74#mmOriginalRequestedCollectionDate
	 * PaymentTransaction74.mmOriginalRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#mmRequestedCollectionDate
	 * OriginalPaymentInformation7.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#mmRequestedExecutionDate
	 * OriginalTransactionReference26.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#mmRequestedCollectionDate
	 * CorrectivePaymentInitiation2.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#mmRequestedCollectionDate
	 * UnderlyingPaymentInstruction3.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmSettlementDate
	 * SecuritiesTradeDetails67.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmSettlementDate
	 * SecuritiesTradeDetails68.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmExpectedSettlementDate
	 * TransactionDetails97.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmSettlementDate
	 * TransactionDetails97.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails35.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmExpectedSettlementDate
	 * TransactionDetails96.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmSettlementDate
	 * TransactionDetails96.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails13#mmSettlementDate
	 * IntraPositionMovementDetails13.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmSettlementDate
	 * TransactionDetails95.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#mmSettlementDate
	 * SecuritiesTradeDetails69.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#mmSettlementDate
	 * SecuritiesTradeDetails70.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails36.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails14#mmSettlementDate
	 * IntraPositionMovementDetails14.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#mmExpectedSettlementDate
	 * TransactionDetails100.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#mmSettlementDate
	 * TransactionDetails100.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#mmExpectedSettlementDate
	 * TransactionDetails99.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#mmSettlementDate
	 * TransactionDetails99.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#mmSettlementDate
	 * TransactionDetails98.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails102#mmIntendedSettlementDate
	 * TransactionDetails102.mmIntendedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation18#mmRequestedSettlementDate
	 * ReceiveInformation18.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmRequestedSettlementDate
	 * Transfer35.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer34#mmRequestedSettlementDate
	 * Transfer34.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19#mmRequestedSettlementDate
	 * DeliverInformation19.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation19#mmRequestedSettlementDate
	 * ReceiveInformation19.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation18#mmRequestedSettlementDate
	 * DeliverInformation18.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument65#mmRequestedSettlementDate
	 * FinancialInstrument65.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification7#mmRequestedExecutionDate
	 * RequestedModification7.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification7#mmRequestedCollectionDate
	 * RequestedModification7.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates3#mmTradeActivityContractualSettlementDate
	 * TransactionDates3.mmTradeActivityContractualSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference27#mmRequestedCollectionDate
	 * OriginalTransactionReference27.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference27#mmRequestedExecutionDate
	 * OriginalTransactionReference27.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction84#mmOriginalRequestedExecutionDate
	 * PaymentTransaction84.mmOriginalRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction84#mmOriginalRequestedCollectionDate
	 * PaymentTransaction84.mmOriginalRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction4#mmRequestedCollectionDate
	 * UnderlyingPaymentInstruction4.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation3#mmRequestedCollectionDate
	 * CorrectivePaymentInitiation3.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch7#mmRequestedExecutionDate
	 * PaymentSearch7.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmSettlementDate
	 * SecuritiesTradeDetails71.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmExpectedSettlementDate
	 * TransactionDetails105.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmSettlementDate
	 * TransactionDetails105.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmSettlementDate
	 * SecuritiesTradeDetails72.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails104#mmExpectedSettlementDate
	 * TransactionDetails104.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails104#mmSettlementDate
	 * TransactionDetails104.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails103#mmSettlementDate
	 * TransactionDetails103.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails15#mmSettlementDate
	 * IntraPositionMovementDetails15.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails73#mmSettlementDate
	 * SecuritiesTradeDetails73.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails74#mmSettlementDate
	 * SecuritiesTradeDetails74.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails75#mmSettlementDate
	 * SecuritiesTradeDetails75.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails76#mmSettlementDate
	 * SecuritiesTradeDetails76.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails107#mmSettlementDate
	 * TransactionDetails107.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails79#mmSettlementDate
	 * SecuritiesTradeDetails79.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails80#mmSettlementDate
	 * SecuritiesTradeDetails80.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementDate17Choice#mmDateCode
	 * SettlementDate17Choice.mmDateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementDate18Choice#mmDateCode
	 * SettlementDate18Choice.mmDateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction95#mmOriginalRequestedExecutionDate
	 * PaymentTransaction95.mmOriginalRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction95#mmOriginalRequestedCollectionDate
	 * PaymentTransaction95.mmOriginalRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails16#mmSettlementDate
	 * IntraPositionMovementDetails16.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails81#mmSettlementDate
	 * SecuritiesTradeDetails81.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementDate20Choice#mmDateCode
	 * SettlementDate20Choice.mmDateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails82#mmSettlementDate
	 * SecuritiesTradeDetails82.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementDate22Choice#mmDateCode
	 * SettlementDate22Choice.mmDateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails84#mmSettlementDate
	 * SecuritiesTradeDetails84.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails85#mmSettlementDate
	 * SecuritiesTradeDetails85.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails86#mmSettlementDate
	 * SecuritiesTradeDetails86.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails87#mmSettlementDate
	 * SecuritiesTradeDetails87.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails88#mmSettlementDate
	 * SecuritiesTradeDetails88.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails109#mmSettlementDate
	 * TransactionDetails109.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails90#mmSettlementDate
	 * SecuritiesTradeDetails90.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails110#mmExpectedSettlementDate
	 * TransactionDetails110.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails110#mmSettlementDate
	 * TransactionDetails110.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails111#mmExpectedSettlementDate
	 * TransactionDetails111.mmExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails111#mmSettlementDate
	 * TransactionDetails111.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails112#mmSettlementDate
	 * TransactionDetails112.mmSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a trade must be executed. For a direct debit, it is the date and time at which the creditor requests that the amount of money is to be collected from the debtor. For a credit transfer, it is the date and time at which the debtor requests the clearing agent to process the payment. For a securities trade, it is the date and time at which the securities are to be delivered or received."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::RSET</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Obligation, ISODateTime> mmRequestedSettlementDate = new MMBusinessAttribute<Obligation, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentSearch4.mmRequestedExecutionDate, FinancialInstrument33.mmRequestedSettlementDate, Transfer24.mmRequestedSettlementDate, ReceiveInformation11.mmRequestedSettlementDate,
					Transfer25.mmRequestedSettlementDate, DeliverInformation11.mmRequestedSettlementDate, SettlementDate1Choice.mmDateCode, TransactionDetails10.mmSettlementDate, TransactionDetails29.mmSettlementDate,
					SecuritiesTradeDetails26.mmSettlementDate, TransactionDetails28.mmSettlementDate, SettlementDate4Choice.mmDateCode, TransactionDetails31.mmSettlementDate, TransactionDetails44.mmSettlementDate,
					SecuritiesTradeDetails28.mmSettlementDate, Transfer1.mmRequestedTransferDate, Transfer9.mmRequestedTransferDate, TransferOut7.mmRequestedTransferDate, Transfer20.mmRequestedSettlementDate,
					ReceiveInformation9.mmRequestedSettlementDate, TransferOut9.mmRequestedTransferDate, Transfer22.mmRequestedSettlementDate, DeliverInformation9.mmRequestedSettlementDate, Transfer26.mmRequestedSettlementDate,
					Transfer21.mmRequestedSettlementDate, Transfer23.mmRequestedSettlementDate, Transfer8.mmRequestedTransferDate, Transfer19.mmRequestedSettlementDate, IntraPositionMovementDetails1.mmSettlementDate,
					IntraPositionMovementDetails2.mmSettlementDate, IntraPositionMovementDetails5.mmSettlementDate, IntraPositionMovementDetails6.mmSettlementDate, IntraPositionMovementDetails7.mmSettlementDate,
					IntraPositionMovementDetails8.mmSettlementDate, IntraPositionMovementDetails9.mmSettlementDate, IntraPositionMovementDetails10.mmSettlementDate, SettlementDate3Choice.mmDateCode,
					SecuritiesTradeDetails6.mmSettlementDate, SettlementDate5Choice.mmDateCode, SecuritiesTradeDetails13.mmSettlementDate, SecuritiesTradeDetails2.mmSettlementDate, SecuritiesTradeDetails16.mmSettlementDate,
					SecuritiesTradeDetails1.mmSettlementDate, SecuritiesTradeDetails15.mmSettlementDate, TransactionDetails5.mmExpectedSettlementDate, TransactionDetails5.mmSettlementDate, TransactionDetails9.mmExpectedSettlementDate,
					TransactionDetails9.mmSettlementDate, TransactionDetails22.mmExpectedSettlementDate, TransactionDetails22.mmSettlementDate, TransactionDetails23.mmExpectedSettlementDate, TransactionDetails23.mmSettlementDate,
					TransactionDetails36.mmExpectedSettlementDate, TransactionDetails36.mmSettlementDate, TransactionDetails47.mmExpectedSettlementDate, TransactionDetails47.mmSettlementDate, TransactionDetails53.mmExpectedSettlementDate,
					TransactionDetails53.mmSettlementDate, TransactionDetails58.mmExpectedSettlementDate, TransactionDetails58.mmSettlementDate, TransactionDetails7.mmExpectedSettlementDate, TransactionDetails7.mmSettlementDate,
					TransactionDetails8.mmExpectedSettlementDate, TransactionDetails8.mmSettlementDate, TransactionDetails16.mmExpectedSettlementDate, TransactionDetails16.mmSettlementDate, TransactionDetails17.mmExpectedSettlementDate,
					TransactionDetails17.mmSettlementDate, TransactionDetails26.mmExpectedSettlementDate, TransactionDetails26.mmSettlementDate, TransactionDetails25.mmExpectedSettlementDate, TransactionDetails25.mmSettlementDate,
					TransactionDetails27.mmExpectedSettlementDate, TransactionDetails27.mmSettlementDate, TransactionDetails33.mmExpectedSettlementDate, TransactionDetails33.mmSettlementDate, TransactionDetails39.mmExpectedSettlementDate,
					TransactionDetails39.mmSettlementDate, TransactionDetails50.mmExpectedSettlementDate, TransactionDetails50.mmSettlementDate, TransactionDetails56.mmExpectedSettlementDate, TransactionDetails56.mmSettlementDate,
					TransactionDetails59.mmExpectedSettlementDate, TransactionDetails59.mmSettlementDate, TransactionDetails6.mmSettlementDate, TransactionDetails18.mmSettlementDate, TransactionDetails24.mmSettlementDate,
					TransactionDetails34.mmSettlementDate, TransactionDetails37.mmSettlementDate, TransactionDetails48.mmSettlementDate, TransactionDetails57.mmSettlementDate, TransactionDetails60.mmSettlementDate,
					Order16.mmSettlementDate, Order14.mmSettlementDate, TransactionDates2.mmTradeActivityContractualSettlementDate, OriginalTransactionReference1.mmRequestedExecutionDate,
					OriginalTransactionReference1.mmRequestedCollectionDate, OriginalTransactionReference13.mmRequestedCollectionDate, OriginalTransactionReference13.mmRequestedExecutionDate,
					OriginalTransactionReference16.mmRequestedCollectionDate, OriginalTransactionReference16.mmRequestedExecutionDate, PaymentTransaction37.mmOriginalRequestedExecutionDate,
					PaymentTransaction37.mmOriginalRequestedCollectionDate, PaymentTransaction47.mmOriginalRequestedExecutionDate, PaymentTransaction47.mmOriginalRequestedCollectionDate,
					DirectDebitTransactionInformation2.mmRequestedCollectionDate, DirectDebitTransactionInformation10.mmRequestedCollectionDate, DirectDebitTransactionInformation12.mmRequestedCollectionDate,
					DirectDebitTransactionInformation14.mmRequestedCollectionDate, OriginalTransactionReference15.mmRequestedCollectionDate, OriginalTransactionReference15.mmRequestedExecutionDate,
					OriginalTransactionReference17.mmRequestedCollectionDate, OriginalTransactionReference17.mmRequestedExecutionDate, OriginalTransactionReference19.mmRequestedExecutionDate,
					ExpectedExecutionDetails1.mmExpectedSettlementDate, ExpectedExecutionDetails2.mmExpectedCashSettlementDate, RequestedModification.mmRequestedExecutionDate, TransactionDetails1.mmSettlementDate,
					TransactionDetails3.mmSettlementDate, SecuritiesTradeDetails7.mmSettlementDate, SecuritiesTradeDetails19.mmSettlementDate, SecuritiesFinancingTransactionDetails2.mmExpectedSettlementDate,
					SecuritiesFinancingTransactionDetails8.mmExpectedSettlementDate, SecuritiesTradeDetails8.mmSettlementDate, SecuritiesTradeDetails18.mmSettlementDate, SecuritiesTradeDetails4.mmSettlementDate,
					SecuritiesTradeDetails17.mmSettlementDate, TransactionDetails4.mmSettlementDate, TransactionDetails30.mmSettlementDate, UnderlyingPaymentInstruction1.mmRequestedCollectionDate,
					RequestedModification2.mmRequestedExecutionDate, RequestedModification2.mmRequestedCollectionDate, CorrectivePaymentInitiation1.mmRequestedCollectionDate, Summary1.mmRequestedSettlementDate,
					SecuritiesFinancingTransactionDetails6.mmExpectedSettlementDate, SecuritiesFinancingTransactionDetails10.mmExpectedSettlementDate, SecuritiesFinancingTransactionDetails17.mmExpectedSettlementDate,
					SecuritiesFinancingTransactionDetails18.mmExpectedSettlementDate, TransactionDetails20.mmSettlementDate, SecuritiesTradeDetails9.mmSettlementDate, SecuritiesTradeDetails21.mmSettlementDate,
					SecuritiesTradeDetails10.mmSettlementDate, SecuritiesTradeDetails22.mmSettlementDate, SecuritiesTradeDetails23.mmSettlementDate, SecuritiesTradeDetails29.mmSettlementDate, TransactionDetails40.mmSettlementDate,
					TransactionDetails42.mmSettlementDate, TransactionDetails46.mmSettlementDate, TransactionDetails32.mmSettlementDate, TransactionDetails14.mmSettlementDate, TransactionDetails35.mmSettlementDate,
					SecuritiesTradeDetails14.mmSettlementDate, SecuritiesTradeDetails20.mmSettlementDate, SecuritiesTradeDetails24.mmSettlementDate, SecuritiesTradeDetails30.mmSettlementDate, TransactionDetails45.mmSettlementDate,
					UnderlyingPaymentInstruction2.mmRequestedCollectionDate, PaymentTransaction39.mmOriginalRequestedExecutionDate, PaymentTransaction39.mmOriginalRequestedCollectionDate, RequestedModification3.mmRequestedExecutionDate,
					RequestedModification3.mmRequestedCollectionDate, TradeLeg2.mmSettlementDate, TradeLeg5.mmSettlementDate, TradeLeg1.mmSettlementDate, TradeLeg3.mmSettlementDate, TradeLeg6.mmSettlementDate, TradeLeg4.mmSettlementDate,
					TradeLeg7.mmSettlementDate, ExpectedExecutionDetails3.mmExpectedCashSettlementDate, OriginalTransactionReference7.mmRequestedCollectionDate, OriginalTransactionReference10.mmRequestedCollectionDate,
					OriginalTransactionReference9.mmRequestedCollectionDate, OriginalTransactionReference12.mmRequestedExecutionDate, OriginalTransactionReference12.mmRequestedCollectionDate,
					OriginalTransactionReference8.mmRequestedCollectionDate, OriginalTransactionReference11.mmRequestedCollectionDate, DirectDebitTransactionInformation5.mmRequestedCollectionDate,
					DirectDebitTransactionInformation7.mmRequestedCollectionDate, DirectDebitTransactionInformation6.mmRequestedCollectionDate, DirectDebitTransactionInformation8.mmRequestedCollectionDate,
					IntraPositionMovementDetails3.mmSettlementDate, IntraPositionMovementDetails4.mmSettlementDate, SecuritiesSettlement1.mmDate, SecuritiesSettlement2.mmDate, IntraBalanceMovement2.mmIntendedSettlementDate,
					TransactionDetails51.mmIntendedSettlementDate, IntraPositionQueryCriteria1.mmIntendedSettlementDate, TransactionDetails52.mmSettlementDate, ReceiveInformation13.mmRequestedSettlementDate,
					Transfer27.mmRequestedSettlementDate, Transfer28.mmRequestedSettlementDate, ReceiveInformation12.mmRequestedSettlementDate, Transfer29.mmRequestedSettlementDate, DeliverInformation12.mmRequestedSettlementDate,
					DeliverInformation13.mmRequestedSettlementDate, TransferIn10.mmRequestedTransferDate, TransferOut11.mmRequestedTransferDate, PaymentSearch5.mmRequestedExecutionDate, FinancialInstrument35.mmRequestedSettlementDate,
					TransactionDetails61.mmExpectedSettlementDate, TransactionDetails61.mmSettlementDate, OriginalPaymentInformation6.mmRequestedCollectionDate, SecuritiesFinancingTransactionDetails21.mmExpectedSettlementDate,
					TransactionDetails62.mmExpectedSettlementDate, TransactionDetails62.mmSettlementDate, TransactionDetails63.mmSettlementDate, SecuritiesTradeDetails31.mmSettlementDate, SecuritiesTradeDetails33.mmSettlementDate,
					SecuritiesTradeDetails35.mmSettlementDate, SecuritiesTradeDetails38.mmSettlementDate, SecuritiesTradeDetails36.mmSettlementDate, SecuritiesTradeDetails34.mmSettlementDate, Order17.mmSettlementDate,
					Order18.mmSettlementDate, SecuritiesTradeDetails44.mmSettlementDate, SecuritiesTradeDetails39.mmSettlementDate, SecuritiesTradeDetails43.mmSettlementDate, SecuritiesTradeDetails41.mmSettlementDate,
					SecuritiesFinancingTransactionDetails22.mmExpectedSettlementDate, TransactionDetails66.mmExpectedSettlementDate, TransactionDetails66.mmSettlementDate, SecuritiesTradeDetails42.mmSettlementDate,
					TransactionDetails67.mmExpectedSettlementDate, TransactionDetails67.mmSettlementDate, TransactionDetails68.mmSettlementDate, SecuritiesTradeDetails47.mmSettlementDate, FinancialInstrument40.mmRequestedSettlementDate,
					DirectDebitTransactionInformation17.mmRequestedCollectionDate, RequestedModification4.mmRequestedExecutionDate, RequestedModification4.mmRequestedCollectionDate, PaymentTransaction58.mmOriginalRequestedExecutionDate,
					PaymentTransaction58.mmOriginalRequestedCollectionDate, PaymentTransaction54.mmOriginalRequestedExecutionDate, PaymentTransaction54.mmOriginalRequestedCollectionDate,
					OriginalTransactionReference20.mmRequestedCollectionDate, OriginalTransactionReference20.mmRequestedExecutionDate, TradeLeg8.mmSettlementDate, DeliverInformation15.mmRequestedSettlementDate,
					DeliverInformation14.mmRequestedSettlementDate, ReceiveInformation15.mmRequestedSettlementDate, ReceiveInformation14.mmRequestedSettlementDate, TransferIn13.mmRequestedTransferDate,
					TransferOut15.mmRequestedTransferDate, SecuritiesFinancingTransactionDetails24.mmExpectedSettlementDate, TransactionDetails70.mmExpectedSettlementDate, TransactionDetails70.mmSettlementDate,
					TransactionDetails69.mmExpectedSettlementDate, TransactionDetails69.mmSettlementDate, TradeLeg10.mmSettlementDate, TradeLeg9.mmSettlementDate, OriginalTransactionReference21.mmRequestedExecutionDate,
					TransactionDetails71.mmExpectedSettlementDate, TransactionDetails71.mmSettlementDate, SecuritiesFinancingTransactionDetails25.mmExpectedSettlementDate, TransactionDetails72.mmExpectedSettlementDate,
					TransactionDetails72.mmSettlementDate, TransactionDetails81.mmSettlementDate, TransactionDetails74.mmSettlementDate, SecuritiesTradeDetails49.mmSettlementDate, TransactionDetails82.mmSettlementDate,
					SecuritiesFinancingTransactionDetails26.mmExpectedSettlementDate, TransactionDetails79.mmExpectedSettlementDate, TransactionDetails79.mmSettlementDate, SecuritiesTradeDetails48.mmSettlementDate,
					TransactionDetails80.mmSettlementDate, TransactionDetails75.mmExpectedSettlementDate, TransactionDetails75.mmSettlementDate, TransactionDetails78.mmSettlementDate, InterestPaymentDateRange2.mmDueDate,
					SecuritiesTradeDetails51.mmSettlementDate, SecuritiesTradeDetails53.mmSettlementDate, SecuritiesTradeDetails55.mmSettlementDate, SecuritiesTradeDetails54.mmSettlementDate, SettlementDate9Choice.mmDateCode,
					SettlementDate11Choice.mmDateCode, SecuritiesTradeDetails52.mmSettlementDate, IntraPositionMovementDetails11.mmSettlementDate, RequestedModification5.mmRequestedExecutionDate,
					RequestedModification5.mmRequestedCollectionDate, DirectDebitTransactionInformation20.mmRequestedCollectionDate, PaymentTransaction61.mmOriginalRequestedExecutionDate,
					PaymentTransaction61.mmOriginalRequestedCollectionDate, OriginalTransactionReference22.mmRequestedCollectionDate, OriginalTransactionReference22.mmRequestedExecutionDate,
					PaymentTransaction66.mmOriginalRequestedExecutionDate, PaymentTransaction66.mmOriginalRequestedCollectionDate, ReceiveInformation17.mmRequestedSettlementDate, Transfer31.mmRequestedSettlementDate,
					Transfer30.mmRequestedSettlementDate, ReceiveInformation16.mmRequestedSettlementDate, DeliverInformation16.mmRequestedSettlementDate, Transfer32.mmRequestedSettlementDate, DeliverInformation17.mmRequestedSettlementDate,
					Transfer33.mmRequestedSettlementDate, TransferOut17.mmRequestedTransferDate, TransferIn15.mmRequestedTransferDate, FinancialInstrument48.mmRequestedSettlementDate,
					OriginalTransactionReference23.mmRequestedExecutionDate, CollateralMovement9.mmDate, SecuritiesTradeDetails57.mmSettlementDate, SecuritiesFinancingTransactionDetails33.mmExpectedSettlementDate,
					TransactionDetails88.mmSettlementDate, SecuritiesTradeDetails58.mmSettlementDate, SecuritiesTradeDetails61.mmSettlementDate, TransactionDetails92.mmSettlementDate, TransactionDetails84.mmSettlementDate,
					SecuritiesTradeDetails63.mmSettlementDate, TransactionDetails83.mmSettlementDate, SecuritiesTradeDetails62.mmSettlementDate, TransactionDetails87.mmExpectedSettlementDate, TransactionDetails87.mmSettlementDate,
					SecuritiesTradeDetails60.mmSettlementDate, SettlementDate12Choice.mmDateCode, SettlementDate14Choice.mmDateCode, TransactionDetails91.mmSettlementDate, TransactionDetails90.mmExpectedSettlementDate,
					TransactionDetails90.mmSettlementDate, IntraPositionMovementDetails12.mmSettlementDate, SecuritiesTradeDetails66.mmSettlementDate, IntraBalanceMovement4.mmIntendedSettlementDate,
					TransactionDetails93.mmIntendedSettlementDate, IntraPositionQueryCriteria6.mmIntendedSettlementDate, TransactionDetails94.mmSettlementDate, PaymentSearch6.mmRequestedExecutionDate,
					ExpectedExecutionDetails4.mmExpectedCashSettlementDate, DirectDebitTransactionInformation21.mmRequestedCollectionDate, RequestedModification6.mmRequestedExecutionDate, RequestedModification6.mmRequestedCollectionDate,
					PaymentTransaction78.mmOriginalRequestedExecutionDate, PaymentTransaction78.mmOriginalRequestedCollectionDate, OriginalTransactionReference24.mmRequestedCollectionDate,
					OriginalTransactionReference24.mmRequestedExecutionDate, PaymentTransaction74.mmOriginalRequestedExecutionDate, PaymentTransaction74.mmOriginalRequestedCollectionDate,
					OriginalPaymentInformation7.mmRequestedCollectionDate, OriginalTransactionReference26.mmRequestedExecutionDate, CorrectivePaymentInitiation2.mmRequestedCollectionDate,
					UnderlyingPaymentInstruction3.mmRequestedCollectionDate, SecuritiesTradeDetails67.mmSettlementDate, SecuritiesTradeDetails68.mmSettlementDate, TransactionDetails97.mmExpectedSettlementDate,
					TransactionDetails97.mmSettlementDate, SecuritiesFinancingTransactionDetails35.mmExpectedSettlementDate, TransactionDetails96.mmExpectedSettlementDate, TransactionDetails96.mmSettlementDate,
					IntraPositionMovementDetails13.mmSettlementDate, TransactionDetails95.mmSettlementDate, SecuritiesTradeDetails69.mmSettlementDate, SecuritiesTradeDetails70.mmSettlementDate,
					SecuritiesFinancingTransactionDetails36.mmExpectedSettlementDate, IntraPositionMovementDetails14.mmSettlementDate, TransactionDetails100.mmExpectedSettlementDate, TransactionDetails100.mmSettlementDate,
					TransactionDetails99.mmExpectedSettlementDate, TransactionDetails99.mmSettlementDate, TransactionDetails98.mmSettlementDate, TransactionDetails102.mmIntendedSettlementDate,
					ReceiveInformation18.mmRequestedSettlementDate, Transfer35.mmRequestedSettlementDate, Transfer34.mmRequestedSettlementDate, DeliverInformation19.mmRequestedSettlementDate, ReceiveInformation19.mmRequestedSettlementDate,
					DeliverInformation18.mmRequestedSettlementDate, FinancialInstrument65.mmRequestedSettlementDate, RequestedModification7.mmRequestedExecutionDate, RequestedModification7.mmRequestedCollectionDate,
					TransactionDates3.mmTradeActivityContractualSettlementDate, OriginalTransactionReference27.mmRequestedCollectionDate, OriginalTransactionReference27.mmRequestedExecutionDate,
					PaymentTransaction84.mmOriginalRequestedExecutionDate, PaymentTransaction84.mmOriginalRequestedCollectionDate, UnderlyingPaymentInstruction4.mmRequestedCollectionDate,
					CorrectivePaymentInitiation3.mmRequestedCollectionDate, PaymentSearch7.mmRequestedExecutionDate, SecuritiesTradeDetails71.mmSettlementDate, TransactionDetails105.mmExpectedSettlementDate,
					TransactionDetails105.mmSettlementDate, SecuritiesTradeDetails72.mmSettlementDate, TransactionDetails104.mmExpectedSettlementDate, TransactionDetails104.mmSettlementDate, TransactionDetails103.mmSettlementDate,
					IntraPositionMovementDetails15.mmSettlementDate, SecuritiesTradeDetails73.mmSettlementDate, SecuritiesTradeDetails74.mmSettlementDate, SecuritiesTradeDetails75.mmSettlementDate,
					SecuritiesTradeDetails76.mmSettlementDate, TransactionDetails107.mmSettlementDate, SecuritiesTradeDetails79.mmSettlementDate, SecuritiesTradeDetails80.mmSettlementDate, SettlementDate17Choice.mmDateCode,
					SettlementDate18Choice.mmDateCode, PaymentTransaction95.mmOriginalRequestedExecutionDate, PaymentTransaction95.mmOriginalRequestedCollectionDate, IntraPositionMovementDetails16.mmSettlementDate,
					SecuritiesTradeDetails81.mmSettlementDate, SettlementDate20Choice.mmDateCode, SecuritiesTradeDetails82.mmSettlementDate, SettlementDate22Choice.mmDateCode, SecuritiesTradeDetails84.mmSettlementDate,
					SecuritiesTradeDetails85.mmSettlementDate, SecuritiesTradeDetails86.mmSettlementDate, SecuritiesTradeDetails87.mmSettlementDate, SecuritiesTradeDetails88.mmSettlementDate, TransactionDetails109.mmSettlementDate,
					SecuritiesTradeDetails90.mmSettlementDate, TransactionDetails110.mmExpectedSettlementDate, TransactionDetails110.mmSettlementDate, TransactionDetails111.mmExpectedSettlementDate, TransactionDetails111.mmSettlementDate,
					TransactionDetails112.mmSettlementDate);
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::RSET"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedSettlementDate";
			definition = "Date and time at which a trade must be executed. For a direct debit, it is the date and time at which the creditor requests that the amount of money is to be collected from the debtor. For a credit transfer, it is the date and time at which the debtor requests the clearing agent to process the payment. For a securities trade, it is the date and time at which the securities are to be delivered or received.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Obligation obj) {
			return obj.getRequestedSettlementDate();
		}

		@Override
		public void setValue(Obligation obj, ISODateTime value) {
			obj.setRequestedSettlementDate(value);
		}
	};
	protected CurrencyAndAmount requestedSettlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7#mmSettlementAmount
	 * SecuritiesTradeDetails7.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19#mmSettlementAmount
	 * SecuritiesTradeDetails19.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmSettlementAmount
	 * SecuritiesTradeDetails4.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#mmSettlementAmount
	 * SecuritiesTradeDetails17.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementData1#mmSettledAmount
	 * SettlementData1.mmSettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmSettlementAmount
	 * SecuritiesTradeDetails10.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#mmSettlementAmount
	 * SecuritiesTradeDetails22.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#mmSettlementAmount
	 * SecuritiesTradeDetails23.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#mmSettlementAmount
	 * SecuritiesTradeDetails29.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14#mmSettlementAmount
	 * SecuritiesTradeDetails14.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20#mmSettlementAmount
	 * SecuritiesTradeDetails20.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmSettlementAmount
	 * SecuritiesTradeDetails24.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30#mmSettlementAmount
	 * SecuritiesTradeDetails30.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3#mmExpectedExecutedAmount
	 * ExpectedExecutionDetails3.mmExpectedExecutedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement2#mmSettlementAmount
	 * IntraBalanceMovement2.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#mmSettlementAmount
	 * SecuritiesTradeDetails35.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#mmSettlementAmount
	 * SecuritiesTradeDetails42.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#mmSettlementAmount
	 * SecuritiesTradeDetails49.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmSettlementAmount
	 * SecuritiesTradeDetails48.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57#mmSettlementAmount
	 * SecuritiesTradeDetails57.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#mmSettlementAmount
	 * SecuritiesTradeDetails61.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement4#mmSettlementAmount
	 * IntraBalanceMovement4.mmSettlementAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NetObligation1#mmAmount
	 * NetObligation1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmSettlementAmount
	 * SecuritiesTradeDetails68.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#mmSettlementAmount
	 * SecuritiesTradeDetails69.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmSettlementAmount
	 * SecuritiesTradeDetails71.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmSettlementAmount
	 * SecuritiesTradeDetails72.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails81#mmSettlementAmount
	 * SecuritiesTradeDetails81.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails85#mmSettlementAmount
	 * SecuritiesTradeDetails85.mmSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount of money to be paid or received."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Obligation, CurrencyAndAmount> mmRequestedSettlementAmount = new MMBusinessAttribute<Obligation, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesTradeDetails7.mmSettlementAmount, SecuritiesTradeDetails19.mmSettlementAmount, SecuritiesTradeDetails4.mmSettlementAmount, SecuritiesTradeDetails17.mmSettlementAmount,
					SettlementData1.mmSettledAmount, SecuritiesTradeDetails10.mmSettlementAmount, SecuritiesTradeDetails22.mmSettlementAmount, SecuritiesTradeDetails23.mmSettlementAmount, SecuritiesTradeDetails29.mmSettlementAmount,
					SecuritiesTradeDetails14.mmSettlementAmount, SecuritiesTradeDetails20.mmSettlementAmount, SecuritiesTradeDetails24.mmSettlementAmount, SecuritiesTradeDetails30.mmSettlementAmount,
					ExpectedExecutionDetails3.mmExpectedExecutedAmount, IntraBalanceMovement2.mmSettlementAmount, SecuritiesTradeDetails35.mmSettlementAmount, SecuritiesTradeDetails42.mmSettlementAmount,
					SecuritiesTradeDetails49.mmSettlementAmount, SecuritiesTradeDetails48.mmSettlementAmount, SecuritiesTradeDetails57.mmSettlementAmount, SecuritiesTradeDetails61.mmSettlementAmount,
					IntraBalanceMovement4.mmSettlementAmount, NetObligation1.mmAmount, SecuritiesTradeDetails68.mmSettlementAmount, SecuritiesTradeDetails69.mmSettlementAmount, SecuritiesTradeDetails71.mmSettlementAmount,
					SecuritiesTradeDetails72.mmSettlementAmount, SecuritiesTradeDetails81.mmSettlementAmount, SecuritiesTradeDetails85.mmSettlementAmount);
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::SETT"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedSettlementAmount";
			definition = "Total amount of money to be paid or received.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Obligation obj) {
			return obj.getRequestedSettlementAmount();
		}

		@Override
		public void setValue(Obligation obj, CurrencyAndAmount value) {
			obj.setRequestedSettlementAmount(value);
		}
	};
	protected Max4AlphaNumericText priority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#mmPriority
	 * SettlementDetails9.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#mmPriority
	 * SettlementDetails17.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#mmPriority
	 * SettlementDetails30.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#mmPriority
	 * SettlementDetails32.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#mmPriority
	 * SettlementDetails60.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#mmPriority
	 * SettlementDetails64.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#mmPriority
	 * SettlementDetails3.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#mmPriority
	 * SettlementDetails16.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#mmPriority
	 * SettlementDetails31.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#mmPriority
	 * SettlementDetails40.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmPriority
	 * SettlementDetails62.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#mmPriority
	 * SettlementDetails63.mmPriority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails1#mmPriority
	 * RequestDetails1.mmPriority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails2#mmPriority
	 * RequestDetails2.mmPriority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails6#mmPriority
	 * RequestDetails6.mmPriority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails7#mmPriority
	 * RequestDetails7.mmPriority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails8#mmPriority
	 * RequestDetails8.mmPriority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails9#mmPriority
	 * RequestDetails9.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails11#mmPriority
	 * RequestDetails11.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails12#mmPriority
	 * RequestDetails12.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#mmPriority
	 * SettlementDetails6.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmPriority
	 * SettlementDetails20.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#mmPriority
	 * SettlementDetails24.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#mmPriority
	 * SettlementDetails33.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#mmPriority
	 * SettlementDetails45.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#mmPriority
	 * SettlementDetails54.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#mmPriority
	 * SettlementDetails1.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#mmPriority
	 * SettlementDetails19.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmPriority
	 * SettlementDetails22.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmPriority
	 * SettlementDetails35.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmPriority
	 * SettlementDetails42.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmPriority
	 * SettlementDetails52.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriorityNumeric3Choice#mmNumeric
	 * PriorityNumeric3Choice.mmNumeric}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriorityNumeric3Choice#mmProprietary
	 * PriorityNumeric3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmPriority
	 * SettlementDetails43.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails1#mmPriority
	 * IntraPositionDetails1.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails11#mmPriority
	 * IntraPositionDetails11.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#mmPriority
	 * SettlementDetails5.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#mmPriority
	 * SettlementDetails26.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#mmPriority
	 * SettlementDetails65.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#mmPriority
	 * SettlementDetails15.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#mmPriority
	 * SettlementDetails36.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails7#mmPriority
	 * IntraPositionDetails7.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails16#mmPriority
	 * IntraPositionDetails16.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails21#mmPriority
	 * IntraPositionDetails21.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails25#mmPriority
	 * IntraPositionDetails25.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmPriority
	 * SettlementDetails67.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#mmPriority
	 * SettlementDetails70.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#mmPriority
	 * SettlementDetails71.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmPriority
	 * SettlementDetails72.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails13#mmPriority
	 * RequestDetails13.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmPriority
	 * SettlementDetails81.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#mmPriority
	 * SettlementDetails76.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#mmPriority
	 * SettlementDetails80.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#mmPriority
	 * SettlementDetails78.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#mmPriority
	 * SettlementDetails77.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails14#mmPriority
	 * RequestDetails14.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails33#mmPriority
	 * IntraPositionDetails33.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmPriority
	 * SettlementDetails93.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails15#mmPriority
	 * RequestDetails15.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#mmPriority
	 * SettlementDetails90.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmPriority
	 * SettlementDetails96.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmPriority
	 * SettlementDetails97.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmPriority
	 * SettlementDetails101.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#mmPriority
	 * SettlementDetails105.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#mmPriority
	 * SettlementDetails106.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#mmPriority
	 * SettlementDetails104.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmPriority
	 * SettlementDetails111.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails16#mmPriority
	 * RequestDetails16.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails36#mmPriority
	 * IntraPositionDetails36.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmPriority
	 * SettlementDetails112.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#mmPriority
	 * SettlementDetails110.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestDetails18#mmPriority
	 * RequestDetails18.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmPriority
	 * SettlementDetails128.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmPriority
	 * SettlementDetails120.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmPriority
	 * SettlementDetails119.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#mmPriority
	 * SettlementDetails134.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmPriority
	 * SettlementDetails137.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmPriority
	 * SettlementDetails132.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails140#mmPriority
	 * SettlementDetails140.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147#mmPriority
	 * SettlementDetails147.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmPriority
	 * SettlementDetails142.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmPriority
	 * SettlementDetails144.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmPriority
	 * SettlementDetails148.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmPriority
	 * SettlementDetails145.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails151#mmPriority
	 * SettlementDetails151.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails152#mmPriority
	 * SettlementDetails152.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails155#mmPriority
	 * SettlementDetails155.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails156#mmPriority
	 * SettlementDetails156.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails157#mmPriority
	 * SettlementDetails157.mmPriority}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction is to be executed with a high priority."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRIR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Obligation, Max4AlphaNumericText> mmPriority = new MMBusinessAttribute<Obligation, Max4AlphaNumericText>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDetails9.mmPriority, SettlementDetails17.mmPriority, SettlementDetails30.mmPriority, SettlementDetails32.mmPriority, SettlementDetails60.mmPriority,
					SettlementDetails64.mmPriority, SettlementDetails3.mmPriority, SettlementDetails16.mmPriority, SettlementDetails31.mmPriority, SettlementDetails40.mmPriority, SettlementDetails62.mmPriority,
					SettlementDetails63.mmPriority, RequestDetails1.mmPriority, RequestDetails2.mmPriority, RequestDetails6.mmPriority, RequestDetails7.mmPriority, RequestDetails8.mmPriority, RequestDetails9.mmPriority,
					RequestDetails11.mmPriority, RequestDetails12.mmPriority, SettlementDetails6.mmPriority, SettlementDetails20.mmPriority, SettlementDetails24.mmPriority, SettlementDetails33.mmPriority, SettlementDetails45.mmPriority,
					SettlementDetails54.mmPriority, SettlementDetails1.mmPriority, SettlementDetails19.mmPriority, SettlementDetails22.mmPriority, SettlementDetails35.mmPriority, SettlementDetails42.mmPriority,
					SettlementDetails52.mmPriority, PriorityNumeric3Choice.mmNumeric, PriorityNumeric3Choice.mmProprietary, SettlementDetails43.mmPriority, IntraPositionDetails1.mmPriority, IntraPositionDetails11.mmPriority,
					SettlementDetails5.mmPriority, SettlementDetails26.mmPriority, SettlementDetails65.mmPriority, SettlementDetails15.mmPriority, SettlementDetails36.mmPriority, IntraPositionDetails7.mmPriority,
					IntraPositionDetails16.mmPriority, IntraPositionDetails21.mmPriority, IntraPositionDetails25.mmPriority, SettlementDetails67.mmPriority, SettlementDetails70.mmPriority, SettlementDetails71.mmPriority,
					SettlementDetails72.mmPriority, RequestDetails13.mmPriority, SettlementDetails81.mmPriority, SettlementDetails76.mmPriority, SettlementDetails80.mmPriority, SettlementDetails78.mmPriority,
					SettlementDetails77.mmPriority, RequestDetails14.mmPriority, IntraPositionDetails33.mmPriority, SettlementDetails93.mmPriority, RequestDetails15.mmPriority, SettlementDetails90.mmPriority,
					SettlementDetails96.mmPriority, SettlementDetails97.mmPriority, SettlementDetails101.mmPriority, SettlementDetails105.mmPriority, SettlementDetails106.mmPriority, SettlementDetails104.mmPriority,
					SettlementDetails111.mmPriority, RequestDetails16.mmPriority, IntraPositionDetails36.mmPriority, SettlementDetails112.mmPriority, SettlementDetails110.mmPriority, RequestDetails18.mmPriority,
					SettlementDetails128.mmPriority, SettlementDetails120.mmPriority, SettlementDetails119.mmPriority, SettlementDetails134.mmPriority, SettlementDetails137.mmPriority, SettlementDetails132.mmPriority,
					SettlementDetails140.mmPriority, SettlementDetails147.mmPriority, SettlementDetails142.mmPriority, SettlementDetails144.mmPriority, SettlementDetails148.mmPriority, SettlementDetails145.mmPriority,
					SettlementDetails151.mmPriority, SettlementDetails152.mmPriority, SettlementDetails155.mmPriority, SettlementDetails156.mmPriority, SettlementDetails157.mmPriority);
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRIR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Priority";
			definition = "Specifies whether the transaction is to be executed with a high priority.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}

		@Override
		public Max4AlphaNumericText getValue(Obligation obj) {
			return obj.getPriority();
		}

		@Override
		public void setValue(Obligation obj, Max4AlphaNumericText value) {
			obj.setPriority(value);
		}
	};
	protected Trade trade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmObligation
	 * Trade.mmObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the trade which originates the obligation to deliver a product, cash or securities.."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Obligation, Trade> mmTrade = new MMBusinessAssociationEnd<Obligation, Trade>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Specifies the trade which originates the obligation to deliver a product, cash or securities..";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Trade.mmObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Trade.mmObject();
		}

		@Override
		public Trade getValue(Obligation obj) {
			return obj.getTrade();
		}

		@Override
		public void setValue(Obligation obj, Trade value) {
			obj.setTrade(value);
		}
	};
	protected TransactionRisk transactionRisk;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TransactionRisk
	 * TransactionRisk}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TransactionRisk#mmObligation
	 * TransactionRisk.mmObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionRisk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction risk calculated per obligation type."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Obligation, TransactionRisk> mmTransactionRisk = new MMBusinessAssociationEnd<Obligation, TransactionRisk>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionRisk";
			definition = "Transaction risk calculated per obligation type.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> TransactionRisk.mmObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TransactionRisk.mmObject();
		}

		@Override
		public TransactionRisk getValue(Obligation obj) {
			return obj.getTransactionRisk();
		}

		@Override
		public void setValue(Obligation obj, TransactionRisk value) {
			obj.setTransactionRisk(value);
		}
	};
	protected Obligation parentObligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Obligation
	 * Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmSubObligation
	 * Obligation.mmSubObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParentObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Obligation which is divided into several sub-obligations."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Obligation, Obligation> mmParentObligation = new MMBusinessAssociationEnd<Obligation, Obligation>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ParentObligation";
			definition = "Obligation which is divided into several sub-obligations.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Obligation.mmSubObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Obligation.mmObject();
		}

		@Override
		public Obligation getValue(Obligation obj) {
			return obj.getParentObligation();
		}

		@Override
		public void setValue(Obligation obj, Obligation value) {
			obj.setParentObligation(value);
		}
	};
	protected List<Obligation> subObligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Obligation
	 * Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmParentObligation
	 * Obligation.mmParentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies an obligation resulting from another existing obligation, for instance each leg of a financing agreement is a sub-obligation of the global financing obligation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Obligation, List<Obligation>> mmSubObligation = new MMBusinessAssociationEnd<Obligation, List<Obligation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubObligation";
			definition = "Specifies an obligation resulting from another existing obligation, for instance each leg of a financing agreement is a sub-obligation of the global financing obligation.";
			minOccurs = 0;
			opposite_lazy = () -> Obligation.mmParentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Obligation.mmObject();
		}

		@Override
		public List<Obligation> getValue(Obligation obj) {
			return obj.getSubObligation();
		}

		@Override
		public void setValue(Obligation obj, List<Obligation> value) {
			obj.setSubObligation(value);
		}
	};
	protected ObligationFulfilment offset;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
	 * ObligationFulfilment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmObligationOffset
	 * ObligationFulfilment.mmObligationOffset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Offset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the method used to settle a specific obligation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Obligation, Optional<ObligationFulfilment>> mmOffset = new MMBusinessAssociationEnd<Obligation, Optional<ObligationFulfilment>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Offset";
			definition = "Specifies the method used to settle a specific obligation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ObligationFulfilment.mmObligationOffset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ObligationFulfilment.mmObject();
		}

		@Override
		public Optional<ObligationFulfilment> getValue(Obligation obj) {
			return obj.getOffset();
		}

		@Override
		public void setValue(Obligation obj, Optional<ObligationFulfilment> value) {
			obj.setOffset(value.orElse(null));
		}
	};
	protected ObligationFulfilment originalObligationProcess;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
	 * ObligationFulfilment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmResultingObligation
	 * ObligationFulfilment.mmResultingObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalObligationProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Obligation fulfilment process which did not extinguish the obligation but replaced it by a new one, for instance in case of netting."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Obligation, ObligationFulfilment> mmOriginalObligationProcess = new MMBusinessAssociationEnd<Obligation, ObligationFulfilment>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OriginalObligationProcess";
			definition = "Obligation fulfilment process which did not extinguish the obligation but replaced it by a new one, for instance in case of netting.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ObligationFulfilment.mmResultingObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ObligationFulfilment.mmObject();
		}

		@Override
		public ObligationFulfilment getValue(Obligation obj) {
			return obj.getOriginalObligationProcess();
		}

		@Override
		public void setValue(Obligation obj, ObligationFulfilment value) {
			obj.setOriginalObligationProcess(value);
		}
	};
	protected ExposureTypeV2Code exposureType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeV2Code
	 * ExposureTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmExposureType
	 * SettlementDetails43.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmExposureType
	 * AggregateBalancePerSafekeepingPlace24.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25#mmExposureType
	 * AggregateBalancePerSafekeepingPlace25.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26#mmExposureType
	 * AggregateBalancePerSafekeepingPlace26.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#mmExposureType
	 * AggregateBalancePerSafekeepingPlace27.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmExposureType
	 * AggregateBalancePerSafekeepingPlace28.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#mmExposureType
	 * AggregateBalancePerSafekeepingPlace29.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmExposureType
	 * AggregateBalancePerSafekeepingPlace31.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30#mmExposureType
	 * AggregateBalancePerSafekeepingPlace30.mmExposureType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposureType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of exposure related to this obligation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Obligation, ExposureTypeV2Code> mmExposureType = new MMBusinessAttribute<Obligation, ExposureTypeV2Code>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDetails43.mmExposureType, AggregateBalancePerSafekeepingPlace24.mmExposureType, AggregateBalancePerSafekeepingPlace25.mmExposureType,
					AggregateBalancePerSafekeepingPlace26.mmExposureType, AggregateBalancePerSafekeepingPlace27.mmExposureType, AggregateBalancePerSafekeepingPlace28.mmExposureType, AggregateBalancePerSafekeepingPlace29.mmExposureType,
					AggregateBalancePerSafekeepingPlace31.mmExposureType, AggregateBalancePerSafekeepingPlace30.mmExposureType);
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExposureType";
			definition = "Type of exposure related to this obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExposureTypeV2Code.mmObject();
		}

		@Override
		public ExposureTypeV2Code getValue(Obligation obj) {
			return obj.getExposureType();
		}

		@Override
		public void setValue(Obligation obj, ExposureTypeV2Code value) {
			obj.setExposureType(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Obligation";
				definition = "Specifies the assets (quantity of securities, goods, services, and cash amounts) that have to be delivered.";
				associationDomain_lazy = () -> Arrays.asList(Trade.mmObligation, Obligation.mmParentObligation, Obligation.mmSubObligation, ObligationFulfilment.mmObligationOffset, ObligationFulfilment.mmResultingObligation,
						TransactionRisk.mmObligation);
				derivationElement_lazy = () -> Arrays.asList(NetObligation1.mmObligationIdentification, TradeClearing2.mmClearingObligation);
				subType_lazy = () -> Arrays.asList(PaymentObligation.mmObject(), SecuritiesDeliveryObligation.mmObject(), ProductDeliveryObligation.mmObject());
				element_lazy = () -> Arrays.asList(Obligation.mmRequestedSettlementDate, Obligation.mmRequestedSettlementAmount, Obligation.mmPriority, Obligation.mmTrade, Obligation.mmTransactionRisk, Obligation.mmParentObligation,
						Obligation.mmSubObligation, Obligation.mmOffset, Obligation.mmOriginalObligationProcess, Obligation.mmExposureType);
				derivationComponent_lazy = () -> Arrays.asList(PriorityNumeric3Choice.mmObject(), NetObligation1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Obligation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getRequestedSettlementDate() {
		return requestedSettlementDate;
	}

	public Obligation setRequestedSettlementDate(ISODateTime requestedSettlementDate) {
		this.requestedSettlementDate = Objects.requireNonNull(requestedSettlementDate);
		return this;
	}

	public CurrencyAndAmount getRequestedSettlementAmount() {
		return requestedSettlementAmount;
	}

	public Obligation setRequestedSettlementAmount(CurrencyAndAmount requestedSettlementAmount) {
		this.requestedSettlementAmount = Objects.requireNonNull(requestedSettlementAmount);
		return this;
	}

	public Max4AlphaNumericText getPriority() {
		return priority;
	}

	public Obligation setPriority(Max4AlphaNumericText priority) {
		this.priority = Objects.requireNonNull(priority);
		return this;
	}

	public Trade getTrade() {
		return trade;
	}

	public Obligation setTrade(Trade trade) {
		this.trade = Objects.requireNonNull(trade);
		return this;
	}

	public TransactionRisk getTransactionRisk() {
		return transactionRisk;
	}

	public Obligation setTransactionRisk(TransactionRisk transactionRisk) {
		this.transactionRisk = Objects.requireNonNull(transactionRisk);
		return this;
	}

	public Obligation getParentObligation() {
		return parentObligation;
	}

	public Obligation setParentObligation(Obligation parentObligation) {
		this.parentObligation = Objects.requireNonNull(parentObligation);
		return this;
	}

	public List<Obligation> getSubObligation() {
		return subObligation == null ? subObligation = new ArrayList<>() : subObligation;
	}

	public Obligation setSubObligation(List<Obligation> subObligation) {
		this.subObligation = Objects.requireNonNull(subObligation);
		return this;
	}

	public Optional<ObligationFulfilment> getOffset() {
		return offset == null ? Optional.empty() : Optional.of(offset);
	}

	public Obligation setOffset(ObligationFulfilment offset) {
		this.offset = offset;
		return this;
	}

	public ObligationFulfilment getOriginalObligationProcess() {
		return originalObligationProcess;
	}

	public Obligation setOriginalObligationProcess(ObligationFulfilment originalObligationProcess) {
		this.originalObligationProcess = Objects.requireNonNull(originalObligationProcess);
		return this;
	}

	public ExposureTypeV2Code getExposureType() {
		return exposureType;
	}

	public Obligation setExposureType(ExposureTypeV2Code exposureType) {
		this.exposureType = Objects.requireNonNull(exposureType);
		return this;
	}
}