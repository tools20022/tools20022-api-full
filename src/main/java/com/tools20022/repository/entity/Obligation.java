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
import com.tools20022.repository.choice.PriorityNumeric3Choice;
import com.tools20022.repository.codeset.ExposureTypeV2Code;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.msg.NetObligation1;
import java.util.Arrays;
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
 * {@linkplain com.tools20022.repository.entity.Obligation#RequestedSettlementDate
 * Obligation.RequestedSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Obligation#RequestedSettlementAmount
 * Obligation.RequestedSettlementAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#Priority
 * Obligation.Priority}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#Trade
 * Obligation.Trade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#TransactionRisk
 * Obligation.TransactionRisk}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#ParentObligation
 * Obligation.ParentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#SubObligation
 * Obligation.SubObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#Offset
 * Obligation.Offset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Obligation#OriginalObligationProcess
 * Obligation.OriginalObligationProcess}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#ExposureType
 * Obligation.ExposureType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#Obligation
 * Trade.Obligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#ParentObligation
 * Obligation.ParentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Obligation#SubObligation
 * Obligation.SubObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#ObligationOffset
 * ObligationFulfilment.ObligationOffset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#ResultingObligation
 * ObligationFulfilment.ResultingObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TransactionRisk#Obligation
 * TransactionRisk.Obligation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetObligation1#ObligationIdentification
 * NetObligation1.ObligationIdentification}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Obligation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the assets (quantity of securities, goods, services, and cash amounts) that have to be delivered."
 * </li>
 * </ul>
 */
public class Obligation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date and time at which a trade must be executed. For a direct debit, it
	 * is the date and time at which the creditor requests that the amount of
	 * money is to be collected from the debtor. For a credit transfer, it is
	 * the date and time at which the debtor requests the clearing agent to
	 * process the payment. For a securities trade, it is the date and time at
	 * which the securities are to be delivered or received.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#RequestedExecutionDate
	 * PaymentSearch4.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument33#RequestedSettlementDate
	 * FinancialInstrument33.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer24#RequestedSettlementDate
	 * Transfer24.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation11#RequestedSettlementDate
	 * ReceiveInformation11.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer25#RequestedSettlementDate
	 * Transfer25.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation11#RequestedSettlementDate
	 * DeliverInformation11.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementDate1Choice#DateCode
	 * SettlementDate1Choice.DateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails10#SettlementDate
	 * TransactionDetails10.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails29#SettlementDate
	 * TransactionDetails29.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#SettlementDate
	 * SecuritiesTradeDetails26.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails28#SettlementDate
	 * TransactionDetails28.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementDate4Choice#DateCode
	 * SettlementDate4Choice.DateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails31#SettlementDate
	 * TransactionDetails31.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails44#SettlementDate
	 * TransactionDetails44.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#SettlementDate
	 * SecuritiesTradeDetails28.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer1#RequestedTransferDate
	 * Transfer1.RequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer9#RequestedTransferDate
	 * Transfer9.RequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut7#RequestedTransferDate
	 * TransferOut7.RequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer20#RequestedSettlementDate
	 * Transfer20.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#RequestedSettlementDate
	 * ReceiveInformation9.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut9#RequestedTransferDate
	 * TransferOut9.RequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer22#RequestedSettlementDate
	 * Transfer22.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#RequestedSettlementDate
	 * DeliverInformation9.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer26#RequestedSettlementDate
	 * Transfer26.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer21#RequestedSettlementDate
	 * Transfer21.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer23#RequestedSettlementDate
	 * Transfer23.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer8#RequestedTransferDate
	 * Transfer8.RequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer19#RequestedSettlementDate
	 * Transfer19.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails1#SettlementDate
	 * IntraPositionMovementDetails1.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails2#SettlementDate
	 * IntraPositionMovementDetails2.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails5#SettlementDate
	 * IntraPositionMovementDetails5.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#SettlementDate
	 * IntraPositionMovementDetails6.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails7#SettlementDate
	 * IntraPositionMovementDetails7.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails8#SettlementDate
	 * IntraPositionMovementDetails8.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails9#SettlementDate
	 * IntraPositionMovementDetails9.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails10#SettlementDate
	 * IntraPositionMovementDetails10.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementDate3Choice#DateCode
	 * SettlementDate3Choice.DateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#SettlementDate
	 * SecuritiesTradeDetails6.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementDate5Choice#DateCode
	 * SettlementDate5Choice.DateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails13#SettlementDate
	 * SecuritiesTradeDetails13.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#SettlementDate
	 * SecuritiesTradeDetails2.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#SettlementDate
	 * SecuritiesTradeDetails16.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#SettlementDate
	 * SecuritiesTradeDetails1.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#SettlementDate
	 * SecuritiesTradeDetails15.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#ExpectedSettlementDate
	 * TransactionDetails5.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#SettlementDate
	 * TransactionDetails5.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#ExpectedSettlementDate
	 * TransactionDetails9.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#SettlementDate
	 * TransactionDetails9.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#ExpectedSettlementDate
	 * TransactionDetails22.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#SettlementDate
	 * TransactionDetails22.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#ExpectedSettlementDate
	 * TransactionDetails23.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#SettlementDate
	 * TransactionDetails23.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#ExpectedSettlementDate
	 * TransactionDetails36.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#SettlementDate
	 * TransactionDetails36.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#ExpectedSettlementDate
	 * TransactionDetails47.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#SettlementDate
	 * TransactionDetails47.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#ExpectedSettlementDate
	 * TransactionDetails53.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#SettlementDate
	 * TransactionDetails53.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#ExpectedSettlementDate
	 * TransactionDetails58.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#SettlementDate
	 * TransactionDetails58.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#ExpectedSettlementDate
	 * TransactionDetails7.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#SettlementDate
	 * TransactionDetails7.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#ExpectedSettlementDate
	 * TransactionDetails8.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#SettlementDate
	 * TransactionDetails8.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#ExpectedSettlementDate
	 * TransactionDetails16.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#SettlementDate
	 * TransactionDetails16.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#ExpectedSettlementDate
	 * TransactionDetails17.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#SettlementDate
	 * TransactionDetails17.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#ExpectedSettlementDate
	 * TransactionDetails26.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#SettlementDate
	 * TransactionDetails26.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#ExpectedSettlementDate
	 * TransactionDetails25.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#SettlementDate
	 * TransactionDetails25.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#ExpectedSettlementDate
	 * TransactionDetails27.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#SettlementDate
	 * TransactionDetails27.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#ExpectedSettlementDate
	 * TransactionDetails33.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#SettlementDate
	 * TransactionDetails33.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#ExpectedSettlementDate
	 * TransactionDetails39.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#SettlementDate
	 * TransactionDetails39.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#ExpectedSettlementDate
	 * TransactionDetails50.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#SettlementDate
	 * TransactionDetails50.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#ExpectedSettlementDate
	 * TransactionDetails56.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#SettlementDate
	 * TransactionDetails56.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#ExpectedSettlementDate
	 * TransactionDetails59.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#SettlementDate
	 * TransactionDetails59.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#SettlementDate
	 * TransactionDetails6.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#SettlementDate
	 * TransactionDetails18.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#SettlementDate
	 * TransactionDetails24.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#SettlementDate
	 * TransactionDetails34.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#SettlementDate
	 * TransactionDetails37.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#SettlementDate
	 * TransactionDetails48.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#SettlementDate
	 * TransactionDetails57.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#SettlementDate
	 * TransactionDetails60.SettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#SettlementDate
	 * Order16.SettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#SettlementDate
	 * Order14.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates2#TradeActivityContractualSettlementDate
	 * TransactionDates2.TradeActivityContractualSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference1#RequestedExecutionDate
	 * OriginalTransactionReference1.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference1#RequestedCollectionDate
	 * OriginalTransactionReference1.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference13#RequestedCollectionDate
	 * OriginalTransactionReference13.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference13#RequestedExecutionDate
	 * OriginalTransactionReference13.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference16#RequestedCollectionDate
	 * OriginalTransactionReference16.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference16#RequestedExecutionDate
	 * OriginalTransactionReference16.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction37#OriginalRequestedExecutionDate
	 * PaymentTransaction37.OriginalRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction37#OriginalRequestedCollectionDate
	 * PaymentTransaction37.OriginalRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction47#OriginalRequestedExecutionDate
	 * PaymentTransaction47.OriginalRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction47#OriginalRequestedCollectionDate
	 * PaymentTransaction47.OriginalRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#RequestedCollectionDate
	 * DirectDebitTransactionInformation2.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#RequestedCollectionDate
	 * DirectDebitTransactionInformation10.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#RequestedCollectionDate
	 * DirectDebitTransactionInformation12.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#RequestedCollectionDate
	 * DirectDebitTransactionInformation14.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference15#RequestedCollectionDate
	 * OriginalTransactionReference15.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference15#RequestedExecutionDate
	 * OriginalTransactionReference15.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference17#RequestedCollectionDate
	 * OriginalTransactionReference17.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference17#RequestedExecutionDate
	 * OriginalTransactionReference17.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference19#RequestedExecutionDate
	 * OriginalTransactionReference19.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails1#ExpectedSettlementDate
	 * ExpectedExecutionDetails1.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails2#ExpectedCashSettlementDate
	 * ExpectedExecutionDetails2.ExpectedCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification#RequestedExecutionDate
	 * RequestedModification.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails1#SettlementDate
	 * TransactionDetails1.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3#SettlementDate
	 * TransactionDetails3.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7#SettlementDate
	 * SecuritiesTradeDetails7.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19#SettlementDate
	 * SecuritiesTradeDetails19.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#ExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails2.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#ExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails8.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails8#SettlementDate
	 * SecuritiesTradeDetails8.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails18#SettlementDate
	 * SecuritiesTradeDetails18.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#SettlementDate
	 * SecuritiesTradeDetails4.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#SettlementDate
	 * SecuritiesTradeDetails17.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails4#SettlementDate
	 * TransactionDetails4.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails30#SettlementDate
	 * TransactionDetails30.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction1#RequestedCollectionDate
	 * UnderlyingPaymentInstruction1.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#RequestedExecutionDate
	 * RequestedModification2.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#RequestedCollectionDate
	 * RequestedModification2.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation1#RequestedCollectionDate
	 * CorrectivePaymentInitiation1.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Summary1#RequestedSettlementDate
	 * Summary1.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#ExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails6.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#ExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails10.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#ExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails17.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#ExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails18.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails20#SettlementDate
	 * TransactionDetails20.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails9#SettlementDate
	 * SecuritiesTradeDetails9.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails21#SettlementDate
	 * SecuritiesTradeDetails21.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#SettlementDate
	 * SecuritiesTradeDetails10.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#SettlementDate
	 * SecuritiesTradeDetails22.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#SettlementDate
	 * SecuritiesTradeDetails23.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#SettlementDate
	 * SecuritiesTradeDetails29.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails40#SettlementDate
	 * TransactionDetails40.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails42#SettlementDate
	 * TransactionDetails42.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails46#SettlementDate
	 * TransactionDetails46.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails32#SettlementDate
	 * TransactionDetails32.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails14#SettlementDate
	 * TransactionDetails14.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails35#SettlementDate
	 * TransactionDetails35.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14#SettlementDate
	 * SecuritiesTradeDetails14.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20#SettlementDate
	 * SecuritiesTradeDetails20.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#SettlementDate
	 * SecuritiesTradeDetails24.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30#SettlementDate
	 * SecuritiesTradeDetails30.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails45#SettlementDate
	 * TransactionDetails45.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2#RequestedCollectionDate
	 * UnderlyingPaymentInstruction2.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction39#OriginalRequestedExecutionDate
	 * PaymentTransaction39.OriginalRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction39#OriginalRequestedCollectionDate
	 * PaymentTransaction39.OriginalRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#RequestedExecutionDate
	 * RequestedModification3.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#RequestedCollectionDate
	 * RequestedModification3.RequestedCollectionDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg2#SettlementDate
	 * TradeLeg2.SettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg5#SettlementDate
	 * TradeLeg5.SettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg1#SettlementDate
	 * TradeLeg1.SettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg3#SettlementDate
	 * TradeLeg3.SettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg6#SettlementDate
	 * TradeLeg6.SettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg4#SettlementDate
	 * TradeLeg4.SettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg7#SettlementDate
	 * TradeLeg7.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3#ExpectedCashSettlementDate
	 * ExpectedExecutionDetails3.ExpectedCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference7#RequestedCollectionDate
	 * OriginalTransactionReference7.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference10#RequestedCollectionDate
	 * OriginalTransactionReference10.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference9#RequestedCollectionDate
	 * OriginalTransactionReference9.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference12#RequestedExecutionDate
	 * OriginalTransactionReference12.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference12#RequestedCollectionDate
	 * OriginalTransactionReference12.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference8#RequestedCollectionDate
	 * OriginalTransactionReference8.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference11#RequestedCollectionDate
	 * OriginalTransactionReference11.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation5#RequestedCollectionDate
	 * DirectDebitTransactionInformation5.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation7#RequestedCollectionDate
	 * DirectDebitTransactionInformation7.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#RequestedCollectionDate
	 * DirectDebitTransactionInformation6.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#RequestedCollectionDate
	 * DirectDebitTransactionInformation8.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails3#SettlementDate
	 * IntraPositionMovementDetails3.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails4#SettlementDate
	 * IntraPositionMovementDetails4.SettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesSettlement1#Date
	 * SecuritiesSettlement1.Date}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesSettlement2#Date
	 * SecuritiesSettlement2.Date}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement2#IntendedSettlementDate
	 * IntraBalanceMovement2.IntendedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#IntendedSettlementDate
	 * TransactionDetails51.IntendedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#IntendedSettlementDate
	 * IntraPositionQueryCriteria1.IntendedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails52#SettlementDate
	 * TransactionDetails52.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#RequestedSettlementDate
	 * ReceiveInformation13.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer27#RequestedSettlementDate
	 * Transfer27.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#RequestedSettlementDate
	 * Transfer28.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation12#RequestedSettlementDate
	 * ReceiveInformation12.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#RequestedSettlementDate
	 * Transfer29.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation12#RequestedSettlementDate
	 * DeliverInformation12.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#RequestedSettlementDate
	 * DeliverInformation13.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn10#RequestedTransferDate
	 * TransferIn10.RequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut11#RequestedTransferDate
	 * TransferOut11.RequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#RequestedExecutionDate
	 * PaymentSearch5.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument35#RequestedSettlementDate
	 * FinancialInstrument35.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#ExpectedSettlementDate
	 * TransactionDetails61.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#SettlementDate
	 * TransactionDetails61.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation6#RequestedCollectionDate
	 * OriginalPaymentInformation6.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#ExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails21.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#ExpectedSettlementDate
	 * TransactionDetails62.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#SettlementDate
	 * TransactionDetails62.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#SettlementDate
	 * TransactionDetails63.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#SettlementDate
	 * SecuritiesTradeDetails31.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#SettlementDate
	 * SecuritiesTradeDetails33.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#SettlementDate
	 * SecuritiesTradeDetails35.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#SettlementDate
	 * SecuritiesTradeDetails38.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails36#SettlementDate
	 * SecuritiesTradeDetails36.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#SettlementDate
	 * SecuritiesTradeDetails34.SettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#SettlementDate
	 * Order17.SettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#SettlementDate
	 * Order18.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#SettlementDate
	 * SecuritiesTradeDetails44.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails39#SettlementDate
	 * SecuritiesTradeDetails39.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#SettlementDate
	 * SecuritiesTradeDetails43.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails41#SettlementDate
	 * SecuritiesTradeDetails41.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#ExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails22.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#ExpectedSettlementDate
	 * TransactionDetails66.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#SettlementDate
	 * TransactionDetails66.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#SettlementDate
	 * SecuritiesTradeDetails42.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#ExpectedSettlementDate
	 * TransactionDetails67.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#SettlementDate
	 * TransactionDetails67.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#SettlementDate
	 * TransactionDetails68.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#SettlementDate
	 * SecuritiesTradeDetails47.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument40#RequestedSettlementDate
	 * FinancialInstrument40.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#RequestedCollectionDate
	 * DirectDebitTransactionInformation17.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#RequestedExecutionDate
	 * RequestedModification4.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#RequestedCollectionDate
	 * RequestedModification4.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction58#OriginalRequestedExecutionDate
	 * PaymentTransaction58.OriginalRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction58#OriginalRequestedCollectionDate
	 * PaymentTransaction58.OriginalRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction54#OriginalRequestedExecutionDate
	 * PaymentTransaction54.OriginalRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction54#OriginalRequestedCollectionDate
	 * PaymentTransaction54.OriginalRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference20#RequestedCollectionDate
	 * OriginalTransactionReference20.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference20#RequestedExecutionDate
	 * OriginalTransactionReference20.RequestedExecutionDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#SettlementDate
	 * TradeLeg8.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#RequestedSettlementDate
	 * DeliverInformation15.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation14#RequestedSettlementDate
	 * DeliverInformation14.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#RequestedSettlementDate
	 * ReceiveInformation15.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation14#RequestedSettlementDate
	 * ReceiveInformation14.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn13#RequestedTransferDate
	 * TransferIn13.RequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut15#RequestedTransferDate
	 * TransferOut15.RequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#ExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails24.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#ExpectedSettlementDate
	 * TransactionDetails70.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#SettlementDate
	 * TransactionDetails70.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#ExpectedSettlementDate
	 * TransactionDetails69.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#SettlementDate
	 * TransactionDetails69.SettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg10#SettlementDate
	 * TradeLeg10.SettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#SettlementDate
	 * TradeLeg9.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference21#RequestedExecutionDate
	 * OriginalTransactionReference21.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#ExpectedSettlementDate
	 * TransactionDetails71.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#SettlementDate
	 * TransactionDetails71.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#ExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails25.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#ExpectedSettlementDate
	 * TransactionDetails72.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#SettlementDate
	 * TransactionDetails72.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails81#SettlementDate
	 * TransactionDetails81.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails74#SettlementDate
	 * TransactionDetails74.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#SettlementDate
	 * SecuritiesTradeDetails49.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails82#SettlementDate
	 * TransactionDetails82.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#ExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails26.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#ExpectedSettlementDate
	 * TransactionDetails79.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#SettlementDate
	 * TransactionDetails79.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#SettlementDate
	 * SecuritiesTradeDetails48.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails80#SettlementDate
	 * TransactionDetails80.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#ExpectedSettlementDate
	 * TransactionDetails75.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#SettlementDate
	 * TransactionDetails75.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#SettlementDate
	 * TransactionDetails78.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestPaymentDateRange2#DueDate
	 * InterestPaymentDateRange2.DueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#SettlementDate
	 * SecuritiesTradeDetails51.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#SettlementDate
	 * SecuritiesTradeDetails53.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#SettlementDate
	 * SecuritiesTradeDetails55.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#SettlementDate
	 * SecuritiesTradeDetails54.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementDate9Choice#DateCode
	 * SettlementDate9Choice.DateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementDate11Choice#DateCode
	 * SettlementDate11Choice.DateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#SettlementDate
	 * SecuritiesTradeDetails52.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails11#SettlementDate
	 * IntraPositionMovementDetails11.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#RequestedExecutionDate
	 * RequestedModification5.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#RequestedCollectionDate
	 * RequestedModification5.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#RequestedCollectionDate
	 * DirectDebitTransactionInformation20.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction61#OriginalRequestedExecutionDate
	 * PaymentTransaction61.OriginalRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction61#OriginalRequestedCollectionDate
	 * PaymentTransaction61.OriginalRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference22#RequestedCollectionDate
	 * OriginalTransactionReference22.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference22#RequestedExecutionDate
	 * OriginalTransactionReference22.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66#OriginalRequestedExecutionDate
	 * PaymentTransaction66.OriginalRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66#OriginalRequestedCollectionDate
	 * PaymentTransaction66.OriginalRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#RequestedSettlementDate
	 * ReceiveInformation17.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#RequestedSettlementDate
	 * Transfer31.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#RequestedSettlementDate
	 * Transfer30.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#RequestedSettlementDate
	 * ReceiveInformation16.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#RequestedSettlementDate
	 * DeliverInformation16.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer32#RequestedSettlementDate
	 * Transfer32.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#RequestedSettlementDate
	 * DeliverInformation17.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#RequestedSettlementDate
	 * Transfer33.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut17#RequestedTransferDate
	 * TransferOut17.RequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn15#RequestedTransferDate
	 * TransferIn15.RequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#RequestedSettlementDate
	 * FinancialInstrument48.RequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference23#RequestedExecutionDate
	 * OriginalTransactionReference23.RequestedExecutionDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CollateralMovement9#Date
	 * CollateralMovement9.Date}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57#SettlementDate
	 * SecuritiesTradeDetails57.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#ExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails33.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails88#SettlementDate
	 * TransactionDetails88.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58#SettlementDate
	 * SecuritiesTradeDetails58.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#SettlementDate
	 * SecuritiesTradeDetails61.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails92#SettlementDate
	 * TransactionDetails92.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails84#SettlementDate
	 * TransactionDetails84.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#SettlementDate
	 * SecuritiesTradeDetails63.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails83#SettlementDate
	 * TransactionDetails83.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#SettlementDate
	 * SecuritiesTradeDetails62.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#ExpectedSettlementDate
	 * TransactionDetails87.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#SettlementDate
	 * TransactionDetails87.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails60#SettlementDate
	 * SecuritiesTradeDetails60.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementDate12Choice#DateCode
	 * SettlementDate12Choice.DateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementDate14Choice#DateCode
	 * SettlementDate14Choice.DateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#SettlementDate
	 * TransactionDetails91.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#ExpectedSettlementDate
	 * TransactionDetails90.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#SettlementDate
	 * TransactionDetails90.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails12#SettlementDate
	 * IntraPositionMovementDetails12.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#SettlementDate
	 * SecuritiesTradeDetails66.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails4#ExpectedCashSettlementDate
	 * ExpectedExecutionDetails4.ExpectedCashSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#RequestedCollectionDate
	 * DirectDebitTransactionInformation21.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#RequestedExecutionDate
	 * RequestedModification6.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#RequestedCollectionDate
	 * RequestedModification6.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#OriginalRequestedExecutionDate
	 * PaymentTransaction78.OriginalRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#OriginalRequestedCollectionDate
	 * PaymentTransaction78.OriginalRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#RequestedCollectionDate
	 * OriginalTransactionReference24.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#RequestedExecutionDate
	 * OriginalTransactionReference24.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction74#OriginalRequestedExecutionDate
	 * PaymentTransaction74.OriginalRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction74#OriginalRequestedCollectionDate
	 * PaymentTransaction74.OriginalRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#RequestedCollectionDate
	 * OriginalPaymentInformation7.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#RequestedExecutionDate
	 * OriginalTransactionReference26.RequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#RequestedCollectionDate
	 * CorrectivePaymentInitiation2.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#RequestedCollectionDate
	 * UnderlyingPaymentInstruction3.RequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#SettlementDate
	 * SecuritiesTradeDetails67.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#SettlementDate
	 * SecuritiesTradeDetails68.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#ExpectedSettlementDate
	 * TransactionDetails97.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#SettlementDate
	 * TransactionDetails97.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#ExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails35.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#ExpectedSettlementDate
	 * TransactionDetails96.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#SettlementDate
	 * TransactionDetails96.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails13#SettlementDate
	 * IntraPositionMovementDetails13.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#SettlementDate
	 * TransactionDetails95.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#SettlementDate
	 * SecuritiesTradeDetails69.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#SettlementDate
	 * SecuritiesTradeDetails70.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#ExpectedSettlementDate
	 * SecuritiesFinancingTransactionDetails36.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails14#SettlementDate
	 * IntraPositionMovementDetails14.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#ExpectedSettlementDate
	 * TransactionDetails100.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#SettlementDate
	 * TransactionDetails100.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#ExpectedSettlementDate
	 * TransactionDetails99.ExpectedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#SettlementDate
	 * TransactionDetails99.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#SettlementDate
	 * TransactionDetails98.SettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a trade must be executed. For a direct debit, it is the date and time at which the creditor requests that the amount of money is to be collected from the debtor. For a credit transfer, it is the date and time at which the debtor requests the clearing agent to process the payment. For a securities trade, it is the date and time at which the securities are to be delivered or received."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RequestedSettlementDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentSearch4.RequestedExecutionDate, com.tools20022.repository.msg.FinancialInstrument33.RequestedSettlementDate,
					com.tools20022.repository.msg.Transfer24.RequestedSettlementDate, com.tools20022.repository.msg.ReceiveInformation11.RequestedSettlementDate, com.tools20022.repository.msg.Transfer25.RequestedSettlementDate,
					com.tools20022.repository.msg.DeliverInformation11.RequestedSettlementDate, com.tools20022.repository.choice.SettlementDate1Choice.DateCode, com.tools20022.repository.msg.TransactionDetails10.SettlementDate,
					com.tools20022.repository.msg.TransactionDetails29.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails26.SettlementDate, com.tools20022.repository.msg.TransactionDetails28.SettlementDate,
					com.tools20022.repository.choice.SettlementDate4Choice.DateCode, com.tools20022.repository.msg.TransactionDetails31.SettlementDate, com.tools20022.repository.msg.TransactionDetails44.SettlementDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails28.SettlementDate, com.tools20022.repository.msg.Transfer1.RequestedTransferDate, com.tools20022.repository.msg.Transfer9.RequestedTransferDate,
					com.tools20022.repository.msg.TransferOut7.RequestedTransferDate, com.tools20022.repository.msg.Transfer20.RequestedSettlementDate, com.tools20022.repository.msg.ReceiveInformation9.RequestedSettlementDate,
					com.tools20022.repository.msg.TransferOut9.RequestedTransferDate, com.tools20022.repository.msg.Transfer22.RequestedSettlementDate, com.tools20022.repository.msg.DeliverInformation9.RequestedSettlementDate,
					com.tools20022.repository.msg.Transfer26.RequestedSettlementDate, com.tools20022.repository.msg.Transfer21.RequestedSettlementDate, com.tools20022.repository.msg.Transfer23.RequestedSettlementDate,
					com.tools20022.repository.msg.Transfer8.RequestedTransferDate, com.tools20022.repository.msg.Transfer19.RequestedSettlementDate, com.tools20022.repository.msg.IntraPositionMovementDetails1.SettlementDate,
					com.tools20022.repository.msg.IntraPositionMovementDetails2.SettlementDate, com.tools20022.repository.msg.IntraPositionMovementDetails5.SettlementDate,
					com.tools20022.repository.msg.IntraPositionMovementDetails6.SettlementDate, com.tools20022.repository.msg.IntraPositionMovementDetails7.SettlementDate,
					com.tools20022.repository.msg.IntraPositionMovementDetails8.SettlementDate, com.tools20022.repository.msg.IntraPositionMovementDetails9.SettlementDate,
					com.tools20022.repository.msg.IntraPositionMovementDetails10.SettlementDate, com.tools20022.repository.choice.SettlementDate3Choice.DateCode, com.tools20022.repository.msg.SecuritiesTradeDetails6.SettlementDate,
					com.tools20022.repository.choice.SettlementDate5Choice.DateCode, com.tools20022.repository.msg.SecuritiesTradeDetails13.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails2.SettlementDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails16.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails1.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails15.SettlementDate,
					com.tools20022.repository.msg.TransactionDetails5.ExpectedSettlementDate, com.tools20022.repository.msg.TransactionDetails5.SettlementDate, com.tools20022.repository.msg.TransactionDetails9.ExpectedSettlementDate,
					com.tools20022.repository.msg.TransactionDetails9.SettlementDate, com.tools20022.repository.msg.TransactionDetails22.ExpectedSettlementDate, com.tools20022.repository.msg.TransactionDetails22.SettlementDate,
					com.tools20022.repository.msg.TransactionDetails23.ExpectedSettlementDate, com.tools20022.repository.msg.TransactionDetails23.SettlementDate, com.tools20022.repository.msg.TransactionDetails36.ExpectedSettlementDate,
					com.tools20022.repository.msg.TransactionDetails36.SettlementDate, com.tools20022.repository.msg.TransactionDetails47.ExpectedSettlementDate, com.tools20022.repository.msg.TransactionDetails47.SettlementDate,
					com.tools20022.repository.msg.TransactionDetails53.ExpectedSettlementDate, com.tools20022.repository.msg.TransactionDetails53.SettlementDate, com.tools20022.repository.msg.TransactionDetails58.ExpectedSettlementDate,
					com.tools20022.repository.msg.TransactionDetails58.SettlementDate, com.tools20022.repository.msg.TransactionDetails7.ExpectedSettlementDate, com.tools20022.repository.msg.TransactionDetails7.SettlementDate,
					com.tools20022.repository.msg.TransactionDetails8.ExpectedSettlementDate, com.tools20022.repository.msg.TransactionDetails8.SettlementDate, com.tools20022.repository.msg.TransactionDetails16.ExpectedSettlementDate,
					com.tools20022.repository.msg.TransactionDetails16.SettlementDate, com.tools20022.repository.msg.TransactionDetails17.ExpectedSettlementDate, com.tools20022.repository.msg.TransactionDetails17.SettlementDate,
					com.tools20022.repository.msg.TransactionDetails26.ExpectedSettlementDate, com.tools20022.repository.msg.TransactionDetails26.SettlementDate, com.tools20022.repository.msg.TransactionDetails25.ExpectedSettlementDate,
					com.tools20022.repository.msg.TransactionDetails25.SettlementDate, com.tools20022.repository.msg.TransactionDetails27.ExpectedSettlementDate, com.tools20022.repository.msg.TransactionDetails27.SettlementDate,
					com.tools20022.repository.msg.TransactionDetails33.ExpectedSettlementDate, com.tools20022.repository.msg.TransactionDetails33.SettlementDate, com.tools20022.repository.msg.TransactionDetails39.ExpectedSettlementDate,
					com.tools20022.repository.msg.TransactionDetails39.SettlementDate, com.tools20022.repository.msg.TransactionDetails50.ExpectedSettlementDate, com.tools20022.repository.msg.TransactionDetails50.SettlementDate,
					com.tools20022.repository.msg.TransactionDetails56.ExpectedSettlementDate, com.tools20022.repository.msg.TransactionDetails56.SettlementDate, com.tools20022.repository.msg.TransactionDetails59.ExpectedSettlementDate,
					com.tools20022.repository.msg.TransactionDetails59.SettlementDate, com.tools20022.repository.msg.TransactionDetails6.SettlementDate, com.tools20022.repository.msg.TransactionDetails18.SettlementDate,
					com.tools20022.repository.msg.TransactionDetails24.SettlementDate, com.tools20022.repository.msg.TransactionDetails34.SettlementDate, com.tools20022.repository.msg.TransactionDetails37.SettlementDate,
					com.tools20022.repository.msg.TransactionDetails48.SettlementDate, com.tools20022.repository.msg.TransactionDetails57.SettlementDate, com.tools20022.repository.msg.TransactionDetails60.SettlementDate,
					com.tools20022.repository.msg.Order16.SettlementDate, com.tools20022.repository.msg.Order14.SettlementDate, com.tools20022.repository.msg.TransactionDates2.TradeActivityContractualSettlementDate,
					com.tools20022.repository.msg.OriginalTransactionReference1.RequestedExecutionDate, com.tools20022.repository.msg.OriginalTransactionReference1.RequestedCollectionDate,
					com.tools20022.repository.msg.OriginalTransactionReference13.RequestedCollectionDate, com.tools20022.repository.msg.OriginalTransactionReference13.RequestedExecutionDate,
					com.tools20022.repository.msg.OriginalTransactionReference16.RequestedCollectionDate, com.tools20022.repository.msg.OriginalTransactionReference16.RequestedExecutionDate,
					com.tools20022.repository.msg.PaymentTransaction37.OriginalRequestedExecutionDate, com.tools20022.repository.msg.PaymentTransaction37.OriginalRequestedCollectionDate,
					com.tools20022.repository.msg.PaymentTransaction47.OriginalRequestedExecutionDate, com.tools20022.repository.msg.PaymentTransaction47.OriginalRequestedCollectionDate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation2.RequestedCollectionDate, com.tools20022.repository.msg.DirectDebitTransactionInformation10.RequestedCollectionDate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation12.RequestedCollectionDate, com.tools20022.repository.msg.DirectDebitTransactionInformation14.RequestedCollectionDate,
					com.tools20022.repository.msg.OriginalTransactionReference15.RequestedCollectionDate, com.tools20022.repository.msg.OriginalTransactionReference15.RequestedExecutionDate,
					com.tools20022.repository.msg.OriginalTransactionReference17.RequestedCollectionDate, com.tools20022.repository.msg.OriginalTransactionReference17.RequestedExecutionDate,
					com.tools20022.repository.msg.OriginalTransactionReference19.RequestedExecutionDate, com.tools20022.repository.msg.ExpectedExecutionDetails1.ExpectedSettlementDate,
					com.tools20022.repository.msg.ExpectedExecutionDetails2.ExpectedCashSettlementDate, com.tools20022.repository.msg.RequestedModification.RequestedExecutionDate,
					com.tools20022.repository.msg.TransactionDetails1.SettlementDate, com.tools20022.repository.msg.TransactionDetails3.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails7.SettlementDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails19.SettlementDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.ExpectedSettlementDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.ExpectedSettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails8.SettlementDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails18.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails4.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails17.SettlementDate,
					com.tools20022.repository.msg.TransactionDetails4.SettlementDate, com.tools20022.repository.msg.TransactionDetails30.SettlementDate, com.tools20022.repository.msg.UnderlyingPaymentInstruction1.RequestedCollectionDate,
					com.tools20022.repository.msg.RequestedModification2.RequestedExecutionDate, com.tools20022.repository.msg.RequestedModification2.RequestedCollectionDate,
					com.tools20022.repository.msg.CorrectivePaymentInitiation1.RequestedCollectionDate, com.tools20022.repository.msg.Summary1.RequestedSettlementDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.ExpectedSettlementDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.ExpectedSettlementDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.ExpectedSettlementDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.ExpectedSettlementDate,
					com.tools20022.repository.msg.TransactionDetails20.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails9.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails21.SettlementDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails10.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails22.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails23.SettlementDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails29.SettlementDate, com.tools20022.repository.msg.TransactionDetails40.SettlementDate, com.tools20022.repository.msg.TransactionDetails42.SettlementDate,
					com.tools20022.repository.msg.TransactionDetails46.SettlementDate, com.tools20022.repository.msg.TransactionDetails32.SettlementDate, com.tools20022.repository.msg.TransactionDetails14.SettlementDate,
					com.tools20022.repository.msg.TransactionDetails35.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails14.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails20.SettlementDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails24.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails30.SettlementDate, com.tools20022.repository.msg.TransactionDetails45.SettlementDate,
					com.tools20022.repository.msg.UnderlyingPaymentInstruction2.RequestedCollectionDate, com.tools20022.repository.msg.PaymentTransaction39.OriginalRequestedExecutionDate,
					com.tools20022.repository.msg.PaymentTransaction39.OriginalRequestedCollectionDate, com.tools20022.repository.msg.RequestedModification3.RequestedExecutionDate,
					com.tools20022.repository.msg.RequestedModification3.RequestedCollectionDate, com.tools20022.repository.msg.TradeLeg2.SettlementDate, com.tools20022.repository.msg.TradeLeg5.SettlementDate,
					com.tools20022.repository.msg.TradeLeg1.SettlementDate, com.tools20022.repository.msg.TradeLeg3.SettlementDate, com.tools20022.repository.msg.TradeLeg6.SettlementDate,
					com.tools20022.repository.msg.TradeLeg4.SettlementDate, com.tools20022.repository.msg.TradeLeg7.SettlementDate, com.tools20022.repository.msg.ExpectedExecutionDetails3.ExpectedCashSettlementDate,
					com.tools20022.repository.msg.OriginalTransactionReference7.RequestedCollectionDate, com.tools20022.repository.msg.OriginalTransactionReference10.RequestedCollectionDate,
					com.tools20022.repository.msg.OriginalTransactionReference9.RequestedCollectionDate, com.tools20022.repository.msg.OriginalTransactionReference12.RequestedExecutionDate,
					com.tools20022.repository.msg.OriginalTransactionReference12.RequestedCollectionDate, com.tools20022.repository.msg.OriginalTransactionReference8.RequestedCollectionDate,
					com.tools20022.repository.msg.OriginalTransactionReference11.RequestedCollectionDate, com.tools20022.repository.msg.DirectDebitTransactionInformation5.RequestedCollectionDate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation7.RequestedCollectionDate, com.tools20022.repository.msg.DirectDebitTransactionInformation6.RequestedCollectionDate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation8.RequestedCollectionDate, com.tools20022.repository.msg.IntraPositionMovementDetails3.SettlementDate,
					com.tools20022.repository.msg.IntraPositionMovementDetails4.SettlementDate, com.tools20022.repository.msg.SecuritiesSettlement1.Date, com.tools20022.repository.msg.SecuritiesSettlement2.Date,
					com.tools20022.repository.msg.IntraBalanceMovement2.IntendedSettlementDate, com.tools20022.repository.msg.TransactionDetails51.IntendedSettlementDate,
					com.tools20022.repository.msg.IntraPositionQueryCriteria1.IntendedSettlementDate, com.tools20022.repository.msg.TransactionDetails52.SettlementDate,
					com.tools20022.repository.msg.ReceiveInformation13.RequestedSettlementDate, com.tools20022.repository.msg.Transfer27.RequestedSettlementDate, com.tools20022.repository.msg.Transfer28.RequestedSettlementDate,
					com.tools20022.repository.msg.ReceiveInformation12.RequestedSettlementDate, com.tools20022.repository.msg.Transfer29.RequestedSettlementDate, com.tools20022.repository.msg.DeliverInformation12.RequestedSettlementDate,
					com.tools20022.repository.msg.DeliverInformation13.RequestedSettlementDate, com.tools20022.repository.msg.TransferIn10.RequestedTransferDate, com.tools20022.repository.msg.TransferOut11.RequestedTransferDate,
					com.tools20022.repository.msg.PaymentSearch5.RequestedExecutionDate, com.tools20022.repository.msg.FinancialInstrument35.RequestedSettlementDate,
					com.tools20022.repository.msg.TransactionDetails61.ExpectedSettlementDate, com.tools20022.repository.msg.TransactionDetails61.SettlementDate,
					com.tools20022.repository.msg.OriginalPaymentInformation6.RequestedCollectionDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.ExpectedSettlementDate,
					com.tools20022.repository.msg.TransactionDetails62.ExpectedSettlementDate, com.tools20022.repository.msg.TransactionDetails62.SettlementDate, com.tools20022.repository.msg.TransactionDetails63.SettlementDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails31.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails33.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails35.SettlementDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails38.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails36.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails34.SettlementDate,
					com.tools20022.repository.msg.Order17.SettlementDate, com.tools20022.repository.msg.Order18.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails44.SettlementDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails39.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails43.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails41.SettlementDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.ExpectedSettlementDate, com.tools20022.repository.msg.TransactionDetails66.ExpectedSettlementDate,
					com.tools20022.repository.msg.TransactionDetails66.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails42.SettlementDate, com.tools20022.repository.msg.TransactionDetails67.ExpectedSettlementDate,
					com.tools20022.repository.msg.TransactionDetails67.SettlementDate, com.tools20022.repository.msg.TransactionDetails68.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails47.SettlementDate,
					com.tools20022.repository.msg.FinancialInstrument40.RequestedSettlementDate, com.tools20022.repository.msg.DirectDebitTransactionInformation17.RequestedCollectionDate,
					com.tools20022.repository.msg.RequestedModification4.RequestedExecutionDate, com.tools20022.repository.msg.RequestedModification4.RequestedCollectionDate,
					com.tools20022.repository.msg.PaymentTransaction58.OriginalRequestedExecutionDate, com.tools20022.repository.msg.PaymentTransaction58.OriginalRequestedCollectionDate,
					com.tools20022.repository.msg.PaymentTransaction54.OriginalRequestedExecutionDate, com.tools20022.repository.msg.PaymentTransaction54.OriginalRequestedCollectionDate,
					com.tools20022.repository.msg.OriginalTransactionReference20.RequestedCollectionDate, com.tools20022.repository.msg.OriginalTransactionReference20.RequestedExecutionDate,
					com.tools20022.repository.msg.TradeLeg8.SettlementDate, com.tools20022.repository.msg.DeliverInformation15.RequestedSettlementDate, com.tools20022.repository.msg.DeliverInformation14.RequestedSettlementDate,
					com.tools20022.repository.msg.ReceiveInformation15.RequestedSettlementDate, com.tools20022.repository.msg.ReceiveInformation14.RequestedSettlementDate, com.tools20022.repository.msg.TransferIn13.RequestedTransferDate,
					com.tools20022.repository.msg.TransferOut15.RequestedTransferDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.ExpectedSettlementDate,
					com.tools20022.repository.msg.TransactionDetails70.ExpectedSettlementDate, com.tools20022.repository.msg.TransactionDetails70.SettlementDate, com.tools20022.repository.msg.TransactionDetails69.ExpectedSettlementDate,
					com.tools20022.repository.msg.TransactionDetails69.SettlementDate, com.tools20022.repository.msg.TradeLeg10.SettlementDate, com.tools20022.repository.msg.TradeLeg9.SettlementDate,
					com.tools20022.repository.msg.OriginalTransactionReference21.RequestedExecutionDate, com.tools20022.repository.msg.TransactionDetails71.ExpectedSettlementDate,
					com.tools20022.repository.msg.TransactionDetails71.SettlementDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.ExpectedSettlementDate,
					com.tools20022.repository.msg.TransactionDetails72.ExpectedSettlementDate, com.tools20022.repository.msg.TransactionDetails72.SettlementDate, com.tools20022.repository.msg.TransactionDetails81.SettlementDate,
					com.tools20022.repository.msg.TransactionDetails74.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails49.SettlementDate, com.tools20022.repository.msg.TransactionDetails82.SettlementDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.ExpectedSettlementDate, com.tools20022.repository.msg.TransactionDetails79.ExpectedSettlementDate,
					com.tools20022.repository.msg.TransactionDetails79.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails48.SettlementDate, com.tools20022.repository.msg.TransactionDetails80.SettlementDate,
					com.tools20022.repository.msg.TransactionDetails75.ExpectedSettlementDate, com.tools20022.repository.msg.TransactionDetails75.SettlementDate, com.tools20022.repository.msg.TransactionDetails78.SettlementDate,
					com.tools20022.repository.msg.InterestPaymentDateRange2.DueDate, com.tools20022.repository.msg.SecuritiesTradeDetails51.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails53.SettlementDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails55.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails54.SettlementDate, com.tools20022.repository.choice.SettlementDate9Choice.DateCode,
					com.tools20022.repository.choice.SettlementDate11Choice.DateCode, com.tools20022.repository.msg.SecuritiesTradeDetails52.SettlementDate, com.tools20022.repository.msg.IntraPositionMovementDetails11.SettlementDate,
					com.tools20022.repository.msg.RequestedModification5.RequestedExecutionDate, com.tools20022.repository.msg.RequestedModification5.RequestedCollectionDate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation20.RequestedCollectionDate, com.tools20022.repository.msg.PaymentTransaction61.OriginalRequestedExecutionDate,
					com.tools20022.repository.msg.PaymentTransaction61.OriginalRequestedCollectionDate, com.tools20022.repository.msg.OriginalTransactionReference22.RequestedCollectionDate,
					com.tools20022.repository.msg.OriginalTransactionReference22.RequestedExecutionDate, com.tools20022.repository.msg.PaymentTransaction66.OriginalRequestedExecutionDate,
					com.tools20022.repository.msg.PaymentTransaction66.OriginalRequestedCollectionDate, com.tools20022.repository.msg.ReceiveInformation17.RequestedSettlementDate,
					com.tools20022.repository.msg.Transfer31.RequestedSettlementDate, com.tools20022.repository.msg.Transfer30.RequestedSettlementDate, com.tools20022.repository.msg.ReceiveInformation16.RequestedSettlementDate,
					com.tools20022.repository.msg.DeliverInformation16.RequestedSettlementDate, com.tools20022.repository.msg.Transfer32.RequestedSettlementDate, com.tools20022.repository.msg.DeliverInformation17.RequestedSettlementDate,
					com.tools20022.repository.msg.Transfer33.RequestedSettlementDate, com.tools20022.repository.msg.TransferOut17.RequestedTransferDate, com.tools20022.repository.msg.TransferIn15.RequestedTransferDate,
					com.tools20022.repository.msg.FinancialInstrument48.RequestedSettlementDate, com.tools20022.repository.msg.OriginalTransactionReference23.RequestedExecutionDate, com.tools20022.repository.msg.CollateralMovement9.Date,
					com.tools20022.repository.msg.SecuritiesTradeDetails57.SettlementDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.ExpectedSettlementDate,
					com.tools20022.repository.msg.TransactionDetails88.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails58.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails61.SettlementDate,
					com.tools20022.repository.msg.TransactionDetails92.SettlementDate, com.tools20022.repository.msg.TransactionDetails84.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails63.SettlementDate,
					com.tools20022.repository.msg.TransactionDetails83.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails62.SettlementDate, com.tools20022.repository.msg.TransactionDetails87.ExpectedSettlementDate,
					com.tools20022.repository.msg.TransactionDetails87.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails60.SettlementDate, com.tools20022.repository.choice.SettlementDate12Choice.DateCode,
					com.tools20022.repository.choice.SettlementDate14Choice.DateCode, com.tools20022.repository.msg.TransactionDetails91.SettlementDate, com.tools20022.repository.msg.TransactionDetails90.ExpectedSettlementDate,
					com.tools20022.repository.msg.TransactionDetails90.SettlementDate, com.tools20022.repository.msg.IntraPositionMovementDetails12.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails66.SettlementDate,
					com.tools20022.repository.msg.ExpectedExecutionDetails4.ExpectedCashSettlementDate, com.tools20022.repository.msg.DirectDebitTransactionInformation21.RequestedCollectionDate,
					com.tools20022.repository.msg.RequestedModification6.RequestedExecutionDate, com.tools20022.repository.msg.RequestedModification6.RequestedCollectionDate,
					com.tools20022.repository.msg.PaymentTransaction78.OriginalRequestedExecutionDate, com.tools20022.repository.msg.PaymentTransaction78.OriginalRequestedCollectionDate,
					com.tools20022.repository.msg.OriginalTransactionReference24.RequestedCollectionDate, com.tools20022.repository.msg.OriginalTransactionReference24.RequestedExecutionDate,
					com.tools20022.repository.msg.PaymentTransaction74.OriginalRequestedExecutionDate, com.tools20022.repository.msg.PaymentTransaction74.OriginalRequestedCollectionDate,
					com.tools20022.repository.msg.OriginalPaymentInformation7.RequestedCollectionDate, com.tools20022.repository.msg.OriginalTransactionReference26.RequestedExecutionDate,
					com.tools20022.repository.msg.CorrectivePaymentInitiation2.RequestedCollectionDate, com.tools20022.repository.msg.UnderlyingPaymentInstruction3.RequestedCollectionDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails67.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails68.SettlementDate, com.tools20022.repository.msg.TransactionDetails97.ExpectedSettlementDate,
					com.tools20022.repository.msg.TransactionDetails97.SettlementDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.ExpectedSettlementDate,
					com.tools20022.repository.msg.TransactionDetails96.ExpectedSettlementDate, com.tools20022.repository.msg.TransactionDetails96.SettlementDate, com.tools20022.repository.msg.IntraPositionMovementDetails13.SettlementDate,
					com.tools20022.repository.msg.TransactionDetails95.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails69.SettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails70.SettlementDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.ExpectedSettlementDate, com.tools20022.repository.msg.IntraPositionMovementDetails14.SettlementDate,
					com.tools20022.repository.msg.TransactionDetails100.ExpectedSettlementDate, com.tools20022.repository.msg.TransactionDetails100.SettlementDate, com.tools20022.repository.msg.TransactionDetails99.ExpectedSettlementDate,
					com.tools20022.repository.msg.TransactionDetails99.SettlementDate, com.tools20022.repository.msg.TransactionDetails98.SettlementDate);
			elementContext_lazy = () -> Obligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedSettlementDate";
			definition = "Date and time at which a trade must be executed. For a direct debit, it is the date and time at which the creditor requests that the amount of money is to be collected from the debtor. For a credit transfer, it is the date and time at which the debtor requests the clearing agent to process the payment. For a securities trade, it is the date and time at which the securities are to be delivered or received.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Total amount of money to be paid or received.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7#SettlementAmount
	 * SecuritiesTradeDetails7.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19#SettlementAmount
	 * SecuritiesTradeDetails19.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#SettlementAmount
	 * SecuritiesTradeDetails4.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#SettlementAmount
	 * SecuritiesTradeDetails17.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementData1#SettledAmount
	 * SettlementData1.SettledAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#SettlementAmount
	 * SecuritiesTradeDetails10.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#SettlementAmount
	 * SecuritiesTradeDetails22.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#SettlementAmount
	 * SecuritiesTradeDetails23.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#SettlementAmount
	 * SecuritiesTradeDetails29.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14#SettlementAmount
	 * SecuritiesTradeDetails14.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20#SettlementAmount
	 * SecuritiesTradeDetails20.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#SettlementAmount
	 * SecuritiesTradeDetails24.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30#SettlementAmount
	 * SecuritiesTradeDetails30.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3#ExpectedExecutedAmount
	 * ExpectedExecutionDetails3.ExpectedExecutedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement2#SettlementAmount
	 * IntraBalanceMovement2.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#SettlementAmount
	 * SecuritiesTradeDetails35.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#SettlementAmount
	 * SecuritiesTradeDetails42.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#SettlementAmount
	 * SecuritiesTradeDetails49.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#SettlementAmount
	 * SecuritiesTradeDetails48.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57#SettlementAmount
	 * SecuritiesTradeDetails57.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#SettlementAmount
	 * SecuritiesTradeDetails61.SettlementAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NetObligation1#Amount
	 * NetObligation1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#SettlementAmount
	 * SecuritiesTradeDetails68.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#SettlementAmount
	 * SecuritiesTradeDetails69.SettlementAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount of money to be paid or received."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RequestedSettlementAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesTradeDetails7.SettlementAmount, com.tools20022.repository.msg.SecuritiesTradeDetails19.SettlementAmount,
					com.tools20022.repository.msg.SecuritiesTradeDetails4.SettlementAmount, com.tools20022.repository.msg.SecuritiesTradeDetails17.SettlementAmount, com.tools20022.repository.msg.SettlementData1.SettledAmount,
					com.tools20022.repository.msg.SecuritiesTradeDetails10.SettlementAmount, com.tools20022.repository.msg.SecuritiesTradeDetails22.SettlementAmount, com.tools20022.repository.msg.SecuritiesTradeDetails23.SettlementAmount,
					com.tools20022.repository.msg.SecuritiesTradeDetails29.SettlementAmount, com.tools20022.repository.msg.SecuritiesTradeDetails14.SettlementAmount, com.tools20022.repository.msg.SecuritiesTradeDetails20.SettlementAmount,
					com.tools20022.repository.msg.SecuritiesTradeDetails24.SettlementAmount, com.tools20022.repository.msg.SecuritiesTradeDetails30.SettlementAmount,
					com.tools20022.repository.msg.ExpectedExecutionDetails3.ExpectedExecutedAmount, com.tools20022.repository.msg.IntraBalanceMovement2.SettlementAmount,
					com.tools20022.repository.msg.SecuritiesTradeDetails35.SettlementAmount, com.tools20022.repository.msg.SecuritiesTradeDetails42.SettlementAmount, com.tools20022.repository.msg.SecuritiesTradeDetails49.SettlementAmount,
					com.tools20022.repository.msg.SecuritiesTradeDetails48.SettlementAmount, com.tools20022.repository.msg.SecuritiesTradeDetails57.SettlementAmount, com.tools20022.repository.msg.SecuritiesTradeDetails61.SettlementAmount,
					com.tools20022.repository.msg.NetObligation1.Amount, com.tools20022.repository.msg.SecuritiesTradeDetails68.SettlementAmount, com.tools20022.repository.msg.SecuritiesTradeDetails69.SettlementAmount);
			elementContext_lazy = () -> Obligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedSettlementAmount";
			definition = "Total amount of money to be paid or received.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies whether the transaction is to be executed with a high priority.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#Priority
	 * SettlementDetails9.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#Priority
	 * SettlementDetails17.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#Priority
	 * SettlementDetails30.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#Priority
	 * SettlementDetails32.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#Priority
	 * SettlementDetails60.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#Priority
	 * SettlementDetails64.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#Priority
	 * SettlementDetails3.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#Priority
	 * SettlementDetails16.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#Priority
	 * SettlementDetails31.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#Priority
	 * SettlementDetails40.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#Priority
	 * SettlementDetails62.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#Priority
	 * SettlementDetails63.Priority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails1#Priority
	 * RequestDetails1.Priority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails2#Priority
	 * RequestDetails2.Priority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails6#Priority
	 * RequestDetails6.Priority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails7#Priority
	 * RequestDetails7.Priority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails8#Priority
	 * RequestDetails8.Priority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails9#Priority
	 * RequestDetails9.Priority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails11#Priority
	 * RequestDetails11.Priority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails12#Priority
	 * RequestDetails12.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#Priority
	 * SettlementDetails6.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#Priority
	 * SettlementDetails20.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#Priority
	 * SettlementDetails24.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#Priority
	 * SettlementDetails33.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#Priority
	 * SettlementDetails45.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#Priority
	 * SettlementDetails54.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#Priority
	 * SettlementDetails1.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#Priority
	 * SettlementDetails19.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#Priority
	 * SettlementDetails22.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#Priority
	 * SettlementDetails35.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#Priority
	 * SettlementDetails42.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#Priority
	 * SettlementDetails52.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriorityNumeric3Choice#Numeric
	 * PriorityNumeric3Choice.Numeric}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriorityNumeric3Choice#Proprietary
	 * PriorityNumeric3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#Priority
	 * SettlementDetails43.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails1#Priority
	 * IntraPositionDetails1.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails11#Priority
	 * IntraPositionDetails11.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#Priority
	 * SettlementDetails5.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#Priority
	 * SettlementDetails26.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#Priority
	 * SettlementDetails65.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#Priority
	 * SettlementDetails15.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#Priority
	 * SettlementDetails36.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails7#Priority
	 * IntraPositionDetails7.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails16#Priority
	 * IntraPositionDetails16.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails21#Priority
	 * IntraPositionDetails21.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails25#Priority
	 * IntraPositionDetails25.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#Priority
	 * SettlementDetails67.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#Priority
	 * SettlementDetails70.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#Priority
	 * SettlementDetails71.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#Priority
	 * SettlementDetails72.Priority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails13#Priority
	 * RequestDetails13.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#Priority
	 * SettlementDetails81.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#Priority
	 * SettlementDetails76.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#Priority
	 * SettlementDetails80.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#Priority
	 * SettlementDetails78.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#Priority
	 * SettlementDetails77.Priority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails14#Priority
	 * RequestDetails14.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails33#Priority
	 * IntraPositionDetails33.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#Priority
	 * SettlementDetails93.Priority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails15#Priority
	 * RequestDetails15.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#Priority
	 * SettlementDetails90.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#Priority
	 * SettlementDetails96.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#Priority
	 * SettlementDetails97.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#Priority
	 * SettlementDetails101.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#Priority
	 * SettlementDetails105.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#Priority
	 * SettlementDetails106.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#Priority
	 * SettlementDetails104.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#Priority
	 * SettlementDetails111.Priority}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails16#Priority
	 * RequestDetails16.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails36#Priority
	 * IntraPositionDetails36.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#Priority
	 * SettlementDetails112.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#Priority
	 * SettlementDetails110.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#Priority
	 * SettlementDetails128.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#Priority
	 * SettlementDetails120.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#Priority
	 * SettlementDetails119.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#Priority
	 * SettlementDetails134.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#Priority
	 * SettlementDetails137.Priority}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#Priority
	 * SettlementDetails132.Priority}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction is to be executed with a high priority."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Priority = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails9.Priority, com.tools20022.repository.msg.SettlementDetails17.Priority, com.tools20022.repository.msg.SettlementDetails30.Priority,
					com.tools20022.repository.msg.SettlementDetails32.Priority, com.tools20022.repository.msg.SettlementDetails60.Priority, com.tools20022.repository.msg.SettlementDetails64.Priority,
					com.tools20022.repository.msg.SettlementDetails3.Priority, com.tools20022.repository.msg.SettlementDetails16.Priority, com.tools20022.repository.msg.SettlementDetails31.Priority,
					com.tools20022.repository.msg.SettlementDetails40.Priority, com.tools20022.repository.msg.SettlementDetails62.Priority, com.tools20022.repository.msg.SettlementDetails63.Priority,
					com.tools20022.repository.msg.RequestDetails1.Priority, com.tools20022.repository.msg.RequestDetails2.Priority, com.tools20022.repository.msg.RequestDetails6.Priority,
					com.tools20022.repository.msg.RequestDetails7.Priority, com.tools20022.repository.msg.RequestDetails8.Priority, com.tools20022.repository.msg.RequestDetails9.Priority,
					com.tools20022.repository.msg.RequestDetails11.Priority, com.tools20022.repository.msg.RequestDetails12.Priority, com.tools20022.repository.msg.SettlementDetails6.Priority,
					com.tools20022.repository.msg.SettlementDetails20.Priority, com.tools20022.repository.msg.SettlementDetails24.Priority, com.tools20022.repository.msg.SettlementDetails33.Priority,
					com.tools20022.repository.msg.SettlementDetails45.Priority, com.tools20022.repository.msg.SettlementDetails54.Priority, com.tools20022.repository.msg.SettlementDetails1.Priority,
					com.tools20022.repository.msg.SettlementDetails19.Priority, com.tools20022.repository.msg.SettlementDetails22.Priority, com.tools20022.repository.msg.SettlementDetails35.Priority,
					com.tools20022.repository.msg.SettlementDetails42.Priority, com.tools20022.repository.msg.SettlementDetails52.Priority, com.tools20022.repository.choice.PriorityNumeric3Choice.Numeric,
					com.tools20022.repository.choice.PriorityNumeric3Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails43.Priority, com.tools20022.repository.msg.IntraPositionDetails1.Priority,
					com.tools20022.repository.msg.IntraPositionDetails11.Priority, com.tools20022.repository.msg.SettlementDetails5.Priority, com.tools20022.repository.msg.SettlementDetails26.Priority,
					com.tools20022.repository.msg.SettlementDetails65.Priority, com.tools20022.repository.msg.SettlementDetails15.Priority, com.tools20022.repository.msg.SettlementDetails36.Priority,
					com.tools20022.repository.msg.IntraPositionDetails7.Priority, com.tools20022.repository.msg.IntraPositionDetails16.Priority, com.tools20022.repository.msg.IntraPositionDetails21.Priority,
					com.tools20022.repository.msg.IntraPositionDetails25.Priority, com.tools20022.repository.msg.SettlementDetails67.Priority, com.tools20022.repository.msg.SettlementDetails70.Priority,
					com.tools20022.repository.msg.SettlementDetails71.Priority, com.tools20022.repository.msg.SettlementDetails72.Priority, com.tools20022.repository.msg.RequestDetails13.Priority,
					com.tools20022.repository.msg.SettlementDetails81.Priority, com.tools20022.repository.msg.SettlementDetails76.Priority, com.tools20022.repository.msg.SettlementDetails80.Priority,
					com.tools20022.repository.msg.SettlementDetails78.Priority, com.tools20022.repository.msg.SettlementDetails77.Priority, com.tools20022.repository.msg.RequestDetails14.Priority,
					com.tools20022.repository.msg.IntraPositionDetails33.Priority, com.tools20022.repository.msg.SettlementDetails93.Priority, com.tools20022.repository.msg.RequestDetails15.Priority,
					com.tools20022.repository.msg.SettlementDetails90.Priority, com.tools20022.repository.msg.SettlementDetails96.Priority, com.tools20022.repository.msg.SettlementDetails97.Priority,
					com.tools20022.repository.msg.SettlementDetails101.Priority, com.tools20022.repository.msg.SettlementDetails105.Priority, com.tools20022.repository.msg.SettlementDetails106.Priority,
					com.tools20022.repository.msg.SettlementDetails104.Priority, com.tools20022.repository.msg.SettlementDetails111.Priority, com.tools20022.repository.msg.RequestDetails16.Priority,
					com.tools20022.repository.msg.IntraPositionDetails36.Priority, com.tools20022.repository.msg.SettlementDetails112.Priority, com.tools20022.repository.msg.SettlementDetails110.Priority,
					com.tools20022.repository.msg.SettlementDetails128.Priority, com.tools20022.repository.msg.SettlementDetails120.Priority, com.tools20022.repository.msg.SettlementDetails119.Priority,
					com.tools20022.repository.msg.SettlementDetails134.Priority, com.tools20022.repository.msg.SettlementDetails137.Priority, com.tools20022.repository.msg.SettlementDetails132.Priority);
			elementContext_lazy = () -> Obligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Priority";
			definition = "Specifies whether the transaction is to be executed with a high priority.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	/**
	 * Specifies the trade which originates the obligation to deliver a product,
	 * cash or securities..
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#Obligation
	 * Trade.Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the trade which originates the obligation to deliver a product, cash or securities.."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Trade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Obligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Specifies the trade which originates the obligation to deliver a product, cash or securities..";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.Obligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Transaction risk calculated per obligation type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TransactionRisk#Obligation
	 * TransactionRisk.Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TransactionRisk
	 * TransactionRisk}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionRisk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction risk calculated per obligation type."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TransactionRisk = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Obligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionRisk";
			definition = "Transaction risk calculated per obligation type.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.TransactionRisk.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TransactionRisk.Obligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Obligation which is divided into several sub-obligations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#SubObligation
	 * Obligation.SubObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Obligation
	 * Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParentObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Obligation which is divided into several sub-obligations."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ParentObligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Obligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ParentObligation";
			definition = "Obligation which is divided into several sub-obligations.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Obligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Obligation.SubObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies an obligation resulting from another existing obligation, for
	 * instance each leg of a financing agreement is a sub-obligation of the
	 * global financing obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#ParentObligation
	 * Obligation.ParentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Obligation
	 * Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies an obligation resulting from another existing obligation, for instance each leg of a financing agreement is a sub-obligation of the global financing obligation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SubObligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Obligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubObligation";
			definition = "Specifies an obligation resulting from another existing obligation, for instance each leg of a financing agreement is a sub-obligation of the global financing obligation.";
			minOccurs = 0;
			type_lazy = () -> Obligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Obligation.ParentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the method used to settle a specific obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#ObligationOffset
	 * ObligationFulfilment.ObligationOffset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
	 * ObligationFulfilment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Offset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the method used to settle a specific obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Offset = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Obligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Offset";
			definition = "Specifies the method used to settle a specific obligation.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ObligationFulfilment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ObligationFulfilment.ObligationOffset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Obligation fulfilment process which did not extinguish the obligation but
	 * replaced it by a new one, for instance in case of netting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#ResultingObligation
	 * ObligationFulfilment.ResultingObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
	 * ObligationFulfilment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalObligationProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Obligation fulfilment process which did not extinguish the obligation but replaced it by a new one, for instance in case of netting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OriginalObligationProcess = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Obligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OriginalObligationProcess";
			definition = "Obligation fulfilment process which did not extinguish the obligation but replaced it by a new one, for instance in case of netting.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ObligationFulfilment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ObligationFulfilment.ResultingObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Type of exposure related to this obligation.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#ExposureType
	 * SettlementDetails43.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#ExposureType
	 * AggregateBalancePerSafekeepingPlace24.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25#ExposureType
	 * AggregateBalancePerSafekeepingPlace25.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26#ExposureType
	 * AggregateBalancePerSafekeepingPlace26.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#ExposureType
	 * AggregateBalancePerSafekeepingPlace27.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#ExposureType
	 * AggregateBalancePerSafekeepingPlace28.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#ExposureType
	 * AggregateBalancePerSafekeepingPlace29.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#ExposureType
	 * AggregateBalancePerSafekeepingPlace31.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30#ExposureType
	 * AggregateBalancePerSafekeepingPlace30.ExposureType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposureType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of exposure related to this obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExposureType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails43.ExposureType, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.ExposureType,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25.ExposureType, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26.ExposureType,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27.ExposureType, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.ExposureType,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29.ExposureType, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31.ExposureType,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30.ExposureType);
			elementContext_lazy = () -> Obligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExposureType";
			definition = "Type of exposure related to this obligation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ExposureTypeV2Code.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Obligation";
				definition = "Specifies the assets (quantity of securities, goods, services, and cash amounts) that have to be delivered.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.Obligation, com.tools20022.repository.entity.Obligation.ParentObligation, com.tools20022.repository.entity.Obligation.SubObligation,
						com.tools20022.repository.entity.ObligationFulfilment.ObligationOffset, com.tools20022.repository.entity.ObligationFulfilment.ResultingObligation, com.tools20022.repository.entity.TransactionRisk.Obligation);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NetObligation1.ObligationIdentification);
				subType_lazy = () -> Arrays.asList(PaymentObligation.mmObject(), SecuritiesDeliveryObligation.mmObject(), ProductDeliveryObligation.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Obligation.RequestedSettlementDate, com.tools20022.repository.entity.Obligation.RequestedSettlementAmount,
						com.tools20022.repository.entity.Obligation.Priority, com.tools20022.repository.entity.Obligation.Trade, com.tools20022.repository.entity.Obligation.TransactionRisk,
						com.tools20022.repository.entity.Obligation.ParentObligation, com.tools20022.repository.entity.Obligation.SubObligation, com.tools20022.repository.entity.Obligation.Offset,
						com.tools20022.repository.entity.Obligation.OriginalObligationProcess, com.tools20022.repository.entity.Obligation.ExposureType);
				derivationComponent_lazy = () -> Arrays.asList(PriorityNumeric3Choice.mmObject(), NetObligation1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}