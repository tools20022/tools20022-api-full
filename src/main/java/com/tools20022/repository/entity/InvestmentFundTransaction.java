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
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Process of buying, selling, switching or transferring fund units.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentFundTransaction"
 * src="doc-files/InvestmentFundTransaction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#InvestmentFundOrder
 * InvestmentFundTransaction.InvestmentFundOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#ClientReference
 * InvestmentFundTransaction.ClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#Type
 * InvestmentFundTransaction.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#TransactionCharge
 * InvestmentFundTransaction.TransactionCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#InvestmentAccount
 * InvestmentFundTransaction.InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#InvestmentFundClass
 * InvestmentFundTransaction.InvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#TransactionTax
 * InvestmentFundTransaction.TransactionTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#CreditDebitIndicator
 * InvestmentFundTransaction.CreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#InvestmentFundOrderExecution
 * InvestmentFundTransaction.InvestmentFundOrderExecution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#InvestmentFundTransaction
 * InvestmentFundClass.InvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#InvestmentFundTransaction
 * InvestmentAccount.InvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#Transaction
 * InvestmentFundTax.Transaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#RelatedTransaction
 * InvestmentFundOrder.RelatedTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#InvestmentFundTransaction
 * InvestmentFundOrderExecution.InvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#InvestmentFundTransaction
 * Charges.InvestmentFundTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1#TransactionDetails
 * InvestmentFundTransactionsByFund1.TransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#EventType
 * InvestmentFundTransaction4.EventType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
 * SecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionInType1
 * InvestmentFundTransactionInType1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InvestmentAccountOrFinancialInstrument1Choice
 * InvestmentAccountOrFinancialInstrument1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransactionType1CodeChoice
 * TransactionType1CodeChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2
 * InvestmentFundTransaction2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1
 * InvestmentFundTransactionsByFund1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3
 * InvestmentFundTransaction3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund2
 * InvestmentFundTransactionsByFund2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice
 * SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderDataChoice
 * SubscriptionOrRedemptionOrSwitchOrderDataChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund3
 * InvestmentFundTransactionsByFund3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4
 * InvestmentFundTransaction4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransactionType1Choice
 * TransactionType1Choice}</li>
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
 * "InvestmentFundTransaction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Process of buying, selling, switching or transferring fund units."</li>
 * </ul>
 */
public class InvestmentFundTransaction extends SecuritiesTrade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * An investor's instruction to either subscribe or redeem an amount of
	 * money or its equivalent, eg, other assets, into or out of an investment
	 * fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#RelatedTransaction
	 * InvestmentFundOrder.RelatedTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Blocked1#OrderType
	 * Blocked1.OrderType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Blocked2#OrderType
	 * Blocked2.OrderType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An investor's instruction to either subscribe or redeem an amount of money or its equivalent, eg, other assets, into or out of an investment fund."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentFundOrder = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Blocked1.OrderType, com.tools20022.repository.msg.Blocked2.OrderType);
			elementContext_lazy = () -> InvestmentFundTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundOrder";
			definition = "An investor's instruction to either subscribe or redeem an amount of money or its equivalent, eg, other assets, into or out of an investment fund.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.RelatedTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Unique and unambiguous investor's identification of an order assigned by
	 * a client.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer7#ClientReference
	 * Transfer7.ClientReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer10#ClientReference
	 * Transfer10.ClientReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer6#ClientReference
	 * Transfer6.ClientReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer9#ClientReference
	 * Transfer9.ClientReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer18#ClientReference
	 * Transfer18.ClientReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer26#ClientReference
	 * Transfer26.ClientReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer5#ClientReference
	 * Transfer5.ClientReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer15#ClientReference
	 * Transfer15.ClientReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer21#ClientReference
	 * Transfer21.ClientReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer13#ClientReference
	 * Transfer13.ClientReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer23#ClientReference
	 * Transfer23.ClientReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer8#ClientReference
	 * Transfer8.ClientReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer11#ClientReference
	 * Transfer11.ClientReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer19#ClientReference
	 * Transfer19.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#ClientReference
	 * SwitchOrderStatusAndReason1.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder5#ClientReference
	 * InvestmentFundOrder5.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#ClientReference
	 * RedemptionOrder5.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#ClientReference
	 * RedemptionExecution5.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution2#ClientReference
	 * InvestmentFundOrderExecution2.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#ClientReference
	 * RedemptionOrder7.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#ClientReference
	 * RedemptionOrder6.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#ClientReference
	 * RedemptionExecution6.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#ClientReference
	 * RedemptionOrder8.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder3#ClientReference
	 * InvestmentFundOrder3.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder2#ClientReference
	 * InvestmentFundOrder2.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#ClientReference
	 * InvestmentFundTransaction3.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#ClientReference
	 * SubscriptionOrder5.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#ClientReference
	 * SubscriptionExecution5.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#ClientReference
	 * SubscriptionOrder7.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#ClientReference
	 * SubscriptionOrder6.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#ClientReference
	 * SubscriptionExecution6.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#ClientReference
	 * SubscriptionOrder8.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#ClientReference
	 * SwitchOrder3.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#ClientReference
	 * SwitchExecution4.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#ClientReference
	 * SwitchOrder4.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason2#ClientReference
	 * CancellationStatusAndReason2.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#ClientReference
	 * RedemptionExecution10.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#ClientReference
	 * RedemptionOrder9.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#ClientReference
	 * SubscriptionExecution7.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#ClientReference
	 * SubscriptionOrder9.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution3#ClientReference
	 * InvestmentFundOrderExecution3.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder6#ClientReference
	 * InvestmentFundOrder6.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#ClientReference
	 * RedemptionOrder11.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#ClientReference
	 * RedemptionExecution12.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#ClientReference
	 * SubscriptionOrder11.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#ClientReference
	 * SubscriptionExecution9.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#ClientReference
	 * ReceiveInformation13.ClientReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer27#ClientReference
	 * Transfer27.ClientReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer28#ClientReference
	 * Transfer28.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation12#ClientReference
	 * ReceiveInformation12.ClientReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer29#ClientReference
	 * Transfer29.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation12#ClientReference
	 * DeliverInformation12.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#ClientReference
	 * DeliverInformation13.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification1#ClientReference
	 * InvestmentAccountModification1.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOpening1#ClientReference
	 * InvestmentAccountOpening1.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation2#ClientReference
	 * AccountManagementConfirmation2.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#ClientReference
	 * InvestmentFundTransaction4.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#ClientReference
	 * DeliverInformation15.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation14#ClientReference
	 * DeliverInformation14.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#ClientReference
	 * ReceiveInformation15.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation14#ClientReference
	 * ReceiveInformation14.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOpening2#ClientReference
	 * InvestmentAccountOpening2.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer26#ClientReference
	 * ISATransfer26.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#ClientReference
	 * ReceiveInformation17.ClientReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer31#ClientReference
	 * Transfer31.ClientReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer30#ClientReference
	 * Transfer30.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#ClientReference
	 * ReceiveInformation16.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification2#ClientReference
	 * InvestmentAccountModification2.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation3#ClientReference
	 * AccountManagementConfirmation3.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#ClientReference
	 * DeliverInformation16.ClientReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer32#ClientReference
	 * Transfer32.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason3#ClientReference
	 * CancellationStatusAndReason3.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#ClientReference
	 * DeliverInformation17.ClientReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer33#ClientReference
	 * Transfer33.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer22#ClientReference
	 * ISATransfer22.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOpening3#ClientReference
	 * InvestmentAccountOpening3.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder11#ClientReference
	 * InvestmentFundOrder11.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#ClientReference
	 * SwitchExecution7.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification3#ClientReference
	 * InvestmentAccountModification3.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder9#ClientReference
	 * InvestmentFundOrder9.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#ClientReference
	 * SwitchOrder7.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation4#ClientReference
	 * AccountManagementConfirmation4.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#ClientReference
	 * RedemptionOrder14.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#ClientReference
	 * SwitchOrderStatusAndReason2.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#ClientReference
	 * SubscriptionExecution13.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#ClientReference
	 * SubscriptionExecution12.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#ClientReference
	 * SubscriptionOrder15.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#ClientReference
	 * RedemptionOrder15.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#ClientReference
	 * RedemptionExecution16.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#ClientReference
	 * SubscriptionOrder14.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder8#ClientReference
	 * InvestmentFundOrder8.ClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#ClientReference
	 * RedemptionExecution15.ClientReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous investor's identification of an order assigned by a client."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ClientReference = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Transfer7.ClientReference, com.tools20022.repository.msg.Transfer10.ClientReference, com.tools20022.repository.msg.Transfer6.ClientReference,
					com.tools20022.repository.msg.Transfer9.ClientReference, com.tools20022.repository.msg.Transfer18.ClientReference, com.tools20022.repository.msg.Transfer26.ClientReference,
					com.tools20022.repository.msg.Transfer5.ClientReference, com.tools20022.repository.msg.Transfer15.ClientReference, com.tools20022.repository.msg.Transfer21.ClientReference,
					com.tools20022.repository.msg.Transfer13.ClientReference, com.tools20022.repository.msg.Transfer23.ClientReference, com.tools20022.repository.msg.Transfer8.ClientReference,
					com.tools20022.repository.msg.Transfer11.ClientReference, com.tools20022.repository.msg.Transfer19.ClientReference, com.tools20022.repository.msg.SwitchOrderStatusAndReason1.ClientReference,
					com.tools20022.repository.msg.InvestmentFundOrder5.ClientReference, com.tools20022.repository.msg.RedemptionOrder5.ClientReference, com.tools20022.repository.msg.RedemptionExecution5.ClientReference,
					com.tools20022.repository.msg.InvestmentFundOrderExecution2.ClientReference, com.tools20022.repository.msg.RedemptionOrder7.ClientReference, com.tools20022.repository.msg.RedemptionOrder6.ClientReference,
					com.tools20022.repository.msg.RedemptionExecution6.ClientReference, com.tools20022.repository.msg.RedemptionOrder8.ClientReference, com.tools20022.repository.msg.InvestmentFundOrder3.ClientReference,
					com.tools20022.repository.msg.InvestmentFundOrder2.ClientReference, com.tools20022.repository.msg.InvestmentFundTransaction3.ClientReference, com.tools20022.repository.msg.SubscriptionOrder5.ClientReference,
					com.tools20022.repository.msg.SubscriptionExecution5.ClientReference, com.tools20022.repository.msg.SubscriptionOrder7.ClientReference, com.tools20022.repository.msg.SubscriptionOrder6.ClientReference,
					com.tools20022.repository.msg.SubscriptionExecution6.ClientReference, com.tools20022.repository.msg.SubscriptionOrder8.ClientReference, com.tools20022.repository.msg.SwitchOrder3.ClientReference,
					com.tools20022.repository.msg.SwitchExecution4.ClientReference, com.tools20022.repository.msg.SwitchOrder4.ClientReference, com.tools20022.repository.msg.CancellationStatusAndReason2.ClientReference,
					com.tools20022.repository.msg.RedemptionExecution10.ClientReference, com.tools20022.repository.msg.RedemptionOrder9.ClientReference, com.tools20022.repository.msg.SubscriptionExecution7.ClientReference,
					com.tools20022.repository.msg.SubscriptionOrder9.ClientReference, com.tools20022.repository.msg.InvestmentFundOrderExecution3.ClientReference, com.tools20022.repository.msg.InvestmentFundOrder6.ClientReference,
					com.tools20022.repository.msg.RedemptionOrder11.ClientReference, com.tools20022.repository.msg.RedemptionExecution12.ClientReference, com.tools20022.repository.msg.SubscriptionOrder11.ClientReference,
					com.tools20022.repository.msg.SubscriptionExecution9.ClientReference, com.tools20022.repository.msg.ReceiveInformation13.ClientReference, com.tools20022.repository.msg.Transfer27.ClientReference,
					com.tools20022.repository.msg.Transfer28.ClientReference, com.tools20022.repository.msg.ReceiveInformation12.ClientReference, com.tools20022.repository.msg.Transfer29.ClientReference,
					com.tools20022.repository.msg.DeliverInformation12.ClientReference, com.tools20022.repository.msg.DeliverInformation13.ClientReference, com.tools20022.repository.msg.InvestmentAccountModification1.ClientReference,
					com.tools20022.repository.msg.InvestmentAccountOpening1.ClientReference, com.tools20022.repository.msg.AccountManagementConfirmation2.ClientReference,
					com.tools20022.repository.msg.InvestmentFundTransaction4.ClientReference, com.tools20022.repository.msg.DeliverInformation15.ClientReference, com.tools20022.repository.msg.DeliverInformation14.ClientReference,
					com.tools20022.repository.msg.ReceiveInformation15.ClientReference, com.tools20022.repository.msg.ReceiveInformation14.ClientReference, com.tools20022.repository.msg.InvestmentAccountOpening2.ClientReference,
					com.tools20022.repository.msg.ISATransfer26.ClientReference, com.tools20022.repository.msg.ReceiveInformation17.ClientReference, com.tools20022.repository.msg.Transfer31.ClientReference,
					com.tools20022.repository.msg.Transfer30.ClientReference, com.tools20022.repository.msg.ReceiveInformation16.ClientReference, com.tools20022.repository.msg.InvestmentAccountModification2.ClientReference,
					com.tools20022.repository.msg.AccountManagementConfirmation3.ClientReference, com.tools20022.repository.msg.DeliverInformation16.ClientReference, com.tools20022.repository.msg.Transfer32.ClientReference,
					com.tools20022.repository.msg.CancellationStatusAndReason3.ClientReference, com.tools20022.repository.msg.DeliverInformation17.ClientReference, com.tools20022.repository.msg.Transfer33.ClientReference,
					com.tools20022.repository.msg.ISATransfer22.ClientReference, com.tools20022.repository.msg.InvestmentAccountOpening3.ClientReference, com.tools20022.repository.msg.InvestmentFundOrder11.ClientReference,
					com.tools20022.repository.msg.SwitchExecution7.ClientReference, com.tools20022.repository.msg.InvestmentAccountModification3.ClientReference, com.tools20022.repository.msg.InvestmentFundOrder9.ClientReference,
					com.tools20022.repository.msg.SwitchOrder7.ClientReference, com.tools20022.repository.msg.AccountManagementConfirmation4.ClientReference, com.tools20022.repository.msg.RedemptionOrder14.ClientReference,
					com.tools20022.repository.msg.SwitchOrderStatusAndReason2.ClientReference, com.tools20022.repository.msg.SubscriptionExecution13.ClientReference, com.tools20022.repository.msg.SubscriptionExecution12.ClientReference,
					com.tools20022.repository.msg.SubscriptionOrder15.ClientReference, com.tools20022.repository.msg.RedemptionOrder15.ClientReference, com.tools20022.repository.msg.RedemptionExecution16.ClientReference,
					com.tools20022.repository.msg.SubscriptionOrder14.ClientReference, com.tools20022.repository.msg.InvestmentFundOrder8.ClientReference, com.tools20022.repository.msg.RedemptionExecution15.ClientReference);
			elementContext_lazy = () -> InvestmentFundTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of an order assigned by a client.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Type of investment fund transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
	 * InvestmentFundTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionInType1#Structured
	 * InvestmentFundTransactionInType1.Structured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown1#InvestmentFundTransactionInTypeDetails
	 * FundCashInBreakdown1.InvestmentFundTransactionInTypeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown1#InvestmentFundTransactionOutTypeDetails
	 * FundCashOutBreakdown1.InvestmentFundTransactionOutTypeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown2#InvestmentFundTransactionInType
	 * FundCashInBreakdown2.InvestmentFundTransactionInType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown2#ExtendedInvestmentFundTransactionInType
	 * FundCashInBreakdown2.ExtendedInvestmentFundTransactionInType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#InvestmentFundTransactionOutType
	 * FundCashOutBreakdown2.InvestmentFundTransactionOutType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#ExtendedInvestmentFundTransactionOutType
	 * FundCashOutBreakdown2.ExtendedInvestmentFundTransactionOutType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionType1CodeChoice#Structured
	 * TransactionType1CodeChoice.Structured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionType1CodeChoice#Unstructured
	 * TransactionType1CodeChoice.Unstructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#TransactionType
	 * InvestmentFundTransaction2.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#TransactionType
	 * InvestmentFundTransaction3.TransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#ExtendedTransactionType
	 * InvestmentFundTransaction3.ExtendedTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#InvestmentFundTransactionOutType
	 * FundCashOutBreakdown3.InvestmentFundTransactionOutType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#InvestmentFundTransactionInType
	 * FundCashInBreakdown3.InvestmentFundTransactionInType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionType2Choice#Type
	 * TransactionType2Choice.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionType2Choice#Proprietary
	 * TransactionType2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentFundTransactionInType1Choice#Code
	 * InvestmentFundTransactionInType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentFundTransactionInType1Choice#Proprietary
	 * InvestmentFundTransactionInType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentFundTransactionOutType1Choice#Code
	 * InvestmentFundTransactionOutType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentFundTransactionOutType1Choice#Proprietary
	 * InvestmentFundTransactionOutType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionType1Choice#TransactionType
	 * TransactionType1Choice.TransactionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of investment fund transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentFundTransactionInType1.Structured, com.tools20022.repository.msg.FundCashInBreakdown1.InvestmentFundTransactionInTypeDetails,
					com.tools20022.repository.msg.FundCashOutBreakdown1.InvestmentFundTransactionOutTypeDetails, com.tools20022.repository.msg.FundCashInBreakdown2.InvestmentFundTransactionInType,
					com.tools20022.repository.msg.FundCashInBreakdown2.ExtendedInvestmentFundTransactionInType, com.tools20022.repository.msg.FundCashOutBreakdown2.InvestmentFundTransactionOutType,
					com.tools20022.repository.msg.FundCashOutBreakdown2.ExtendedInvestmentFundTransactionOutType, com.tools20022.repository.choice.TransactionType1CodeChoice.Structured,
					com.tools20022.repository.choice.TransactionType1CodeChoice.Unstructured, com.tools20022.repository.msg.InvestmentFundTransaction2.TransactionType,
					com.tools20022.repository.msg.InvestmentFundTransaction3.TransactionType, com.tools20022.repository.msg.InvestmentFundTransaction3.ExtendedTransactionType,
					com.tools20022.repository.msg.FundCashOutBreakdown3.InvestmentFundTransactionOutType, com.tools20022.repository.msg.FundCashInBreakdown3.InvestmentFundTransactionInType,
					com.tools20022.repository.choice.TransactionType2Choice.Type, com.tools20022.repository.choice.TransactionType2Choice.Proprietary, com.tools20022.repository.choice.InvestmentFundTransactionInType1Choice.Code,
					com.tools20022.repository.choice.InvestmentFundTransactionInType1Choice.Proprietary, com.tools20022.repository.choice.InvestmentFundTransactionOutType1Choice.Code,
					com.tools20022.repository.choice.InvestmentFundTransactionOutType1Choice.Proprietary, com.tools20022.repository.choice.TransactionType1Choice.TransactionType);
			elementContext_lazy = () -> InvestmentFundTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of investment fund transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
		}
	};
	/**
	 * Charge for the placement of an order and/or for its execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#InvestmentFundTransaction
	 * Charges.InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown2#ChargeDetails
	 * FundCashInBreakdown2.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#ChargeDetails
	 * FundCashOutBreakdown2.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#ChargeDetails
	 * RedemptionOrder3.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#ChargeDetails
	 * RedemptionOrder5.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#ChargeGeneralDetails
	 * RedemptionExecution3.ChargeGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#ChargeGeneralDetails
	 * RedemptionExecution5.ChargeGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#ChargeDetails
	 * RedemptionOrder7.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#ChargeDetails
	 * RedemptionOrder4.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#ChargeDetails
	 * RedemptionOrder6.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#ChargeGeneralDetails
	 * RedemptionExecution4.ChargeGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#ChargeGeneralDetails
	 * RedemptionExecution6.ChargeGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#ChargeDetails
	 * RedemptionOrder8.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#ChargeDetails
	 * SubscriptionOrder3.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#ChargeDetails
	 * SubscriptionOrder5.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#ChargeGeneralDetails
	 * SubscriptionExecution3.ChargeGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#ChargeGeneralDetails
	 * SubscriptionExecution5.ChargeGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#ChargeDetails
	 * SubscriptionOrder7.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#ChargeDetails
	 * SubscriptionOrder4.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#ChargeDetails
	 * SubscriptionOrder6.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#ChargeGeneralDetails
	 * SubscriptionExecution4.ChargeGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#ChargeGeneralDetails
	 * SubscriptionExecution6.ChargeGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#ChargeDetails
	 * SubscriptionOrder8.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder2#ChargeDetails
	 * SwitchRedemptionLegOrder2.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#ChargeDetails
	 * SwitchSubscriptionLegOrder2.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#ChargeDetails
	 * SwitchRedemptionLegOrder3.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#ChargeDetails
	 * SwitchSubscriptionLegOrder3.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#ChargeGeneralDetails
	 * SwitchRedemptionLegExecution2.ChargeGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#ChargeGeneralDetails
	 * SwitchSubscriptionLegExecution2.ChargeGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#ChargeGeneralDetails
	 * SwitchRedemptionLegExecution3.ChargeGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#ChargeGeneralDetails
	 * SwitchSubscriptionLegExecution3.ChargeGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#TotalCharges
	 * RedemptionExecution10.TotalCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#ChargeDetails
	 * RedemptionOrder9.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#TotalCharges
	 * SubscriptionExecution7.TotalCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#ChargeDetails
	 * SubscriptionOrder9.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#ChargeDetails
	 * RedemptionOrder11.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#ChargeGeneralDetails
	 * RedemptionExecution12.ChargeGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#ChargeDetails
	 * SubscriptionOrder11.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#ChargeGeneralDetails
	 * SubscriptionExecution9.ChargeGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#ChargeDetails
	 * FundCashOutBreakdown3.ChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#ChargeDetails
	 * FundCashInBreakdown3.ChargeDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FeeAndTax1#IndividualFee
	 * FeeAndTax1.IndividualFee}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Charge for the placement of an order and/or for its execution."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TransactionCharge = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashInBreakdown2.ChargeDetails, com.tools20022.repository.msg.FundCashOutBreakdown2.ChargeDetails,
					com.tools20022.repository.msg.RedemptionOrder3.ChargeDetails, com.tools20022.repository.msg.RedemptionOrder5.ChargeDetails, com.tools20022.repository.msg.RedemptionExecution3.ChargeGeneralDetails,
					com.tools20022.repository.msg.RedemptionExecution5.ChargeGeneralDetails, com.tools20022.repository.msg.RedemptionOrder7.ChargeDetails, com.tools20022.repository.msg.RedemptionOrder4.ChargeDetails,
					com.tools20022.repository.msg.RedemptionOrder6.ChargeDetails, com.tools20022.repository.msg.RedemptionExecution4.ChargeGeneralDetails, com.tools20022.repository.msg.RedemptionExecution6.ChargeGeneralDetails,
					com.tools20022.repository.msg.RedemptionOrder8.ChargeDetails, com.tools20022.repository.msg.SubscriptionOrder3.ChargeDetails, com.tools20022.repository.msg.SubscriptionOrder5.ChargeDetails,
					com.tools20022.repository.msg.SubscriptionExecution3.ChargeGeneralDetails, com.tools20022.repository.msg.SubscriptionExecution5.ChargeGeneralDetails, com.tools20022.repository.msg.SubscriptionOrder7.ChargeDetails,
					com.tools20022.repository.msg.SubscriptionOrder4.ChargeDetails, com.tools20022.repository.msg.SubscriptionOrder6.ChargeDetails, com.tools20022.repository.msg.SubscriptionExecution4.ChargeGeneralDetails,
					com.tools20022.repository.msg.SubscriptionExecution6.ChargeGeneralDetails, com.tools20022.repository.msg.SubscriptionOrder8.ChargeDetails, com.tools20022.repository.msg.SwitchRedemptionLegOrder2.ChargeDetails,
					com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.ChargeDetails, com.tools20022.repository.msg.SwitchRedemptionLegOrder3.ChargeDetails, com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.ChargeDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution2.ChargeGeneralDetails, com.tools20022.repository.msg.SwitchSubscriptionLegExecution2.ChargeGeneralDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution3.ChargeGeneralDetails, com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.ChargeGeneralDetails,
					com.tools20022.repository.msg.RedemptionExecution10.TotalCharges, com.tools20022.repository.msg.RedemptionOrder9.ChargeDetails, com.tools20022.repository.msg.SubscriptionExecution7.TotalCharges,
					com.tools20022.repository.msg.SubscriptionOrder9.ChargeDetails, com.tools20022.repository.msg.RedemptionOrder11.ChargeDetails, com.tools20022.repository.msg.RedemptionExecution12.ChargeGeneralDetails,
					com.tools20022.repository.msg.SubscriptionOrder11.ChargeDetails, com.tools20022.repository.msg.SubscriptionExecution9.ChargeGeneralDetails, com.tools20022.repository.msg.FundCashOutBreakdown3.ChargeDetails,
					com.tools20022.repository.msg.FundCashInBreakdown3.ChargeDetails, com.tools20022.repository.msg.FeeAndTax1.IndividualFee);
			elementContext_lazy = () -> InvestmentFundTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionCharge";
			definition = "Charge for the placement of an order and/or for its execution.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Charges.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.InvestmentFundTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account related to an investment fund transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#InvestmentFundTransaction
	 * InvestmentAccount.InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason4#InvestmentAccountDetails
	 * IndividualOrderStatusAndReason4.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#InvestmentAccountDetails
	 * IndividualOrderConfirmationStatusAndReason1.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentAccountOrFinancialInstrument1Choice#InvestmentAccount
	 * InvestmentAccountOrFinancialInstrument1Choice.InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1#InvestmentAccountDetails
	 * FundOrderData1.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences1#InvestmentAccountDetails
	 * SwitchLegReferences1.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument7Choice#AccountDetails
	 * PaymentInstrument7Choice.AccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#InvestmentAccountDetails
	 * RedemptionOrder3.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#InvestmentAccountDetails
	 * RedemptionOrder5.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#InvestmentAccountDetails
	 * RedemptionExecution3.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#InvestmentAccountDetails
	 * RedemptionExecution5.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#InvestmentAccountDetails
	 * RedemptionOrder7.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder2#InvestmentAccountDetails
	 * RedemptionMultipleOrder2.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3#InvestmentAccountDetails
	 * RedemptionMultipleOrder3.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution2#InvestmentAccountDetails
	 * RedemptionMultipleExecution2.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#InvestmentAccountDetails
	 * RedemptionMultipleExecution3.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4#InvestmentAccountDetails
	 * RedemptionMultipleOrder4.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder3#InvestmentAccountDetails
	 * InvestmentFundOrder3.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference2#InvestmentAccount
	 * MessageAndBusinessReference2.InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder2#InvestmentAccountDetails
	 * InvestmentFundOrder2.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument9Choice#AccountDetails
	 * PaymentInstrument9Choice.AccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#InvestmentAccountDetails
	 * SubscriptionOrder3.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument10Choice#AccountDetails
	 * PaymentInstrument10Choice.AccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument6Choice#AccountDetails
	 * PaymentInstrument6Choice.AccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument8Choice#AccountDetails
	 * PaymentInstrument8Choice.AccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#InvestmentAccountDetails
	 * SubscriptionOrder5.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#InvestmentAccountDetails
	 * SubscriptionExecution3.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#InvestmentAccountDetails
	 * SubscriptionExecution5.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#InvestmentAccountDetails
	 * SubscriptionOrder7.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder2#InvestmentAccountDetails
	 * SubscriptionMultipleOrder2.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder3#InvestmentAccountDetails
	 * SubscriptionMultipleOrder3.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution2#InvestmentAccountDetails
	 * SubscriptionMultipleExecution2.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution3#InvestmentAccountDetails
	 * SubscriptionMultipleExecution3.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#InvestmentAccountDetails
	 * SubscriptionMultipleOrder4.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder2#InvestmentAccountDetails
	 * SwitchOrder2.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#InvestmentAccountDetails
	 * SwitchRedemptionLegOrder3.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#InvestmentAccountDetails
	 * SwitchSubscriptionLegOrder3.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#InvestmentAccountDetails
	 * SwitchOrder3.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#InvestmentAccountDetails
	 * SwitchExecution3.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#InvestmentAccountDetails
	 * SwitchRedemptionLegExecution3.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#InvestmentAccountDetails
	 * SwitchSubscriptionLegExecution3.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#InvestmentAccountDetails
	 * SwitchExecution4.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#InvestmentAccountDetails
	 * SwitchOrder4.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference1#InvestmentAccountDetails
	 * MessageAndBusinessReference1.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference6#InvestmentAccountDetails
	 * MessageAndBusinessReference6.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData3#InvestmentAccountDetails
	 * FundOrderData3.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#InvestmentAccountDetails
	 * RedemptionExecution10.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#InvestmentAccountDetails
	 * RedemptionOrder9.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#InvestmentAccountDetails
	 * SubscriptionExecution7.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#InvestmentAccountDetails
	 * SubscriptionOrder9.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution8#InvestmentAccountDetails
	 * SubscriptionExecution8.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution11#InvestmentAccountDetails
	 * RedemptionExecution11.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecutionRedemptionLeg4#InvestmentAccountDetails
	 * SwitchExecutionRedemptionLeg4.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecutionSubscriptionLeg4#InvestmentAccountDetails
	 * SwitchExecutionSubscriptionLeg4.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution5#InvestmentAccountDetails
	 * SwitchExecution5.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder10#InvestmentAccountDetails
	 * SubscriptionOrder10.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder10#InvestmentAccountDetails
	 * RedemptionOrder10.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder4#InvestmentAccountDetails
	 * SwitchRedemptionLegOrder4.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder4#InvestmentAccountDetails
	 * SwitchSubscriptionLegOrder4.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder5#InvestmentAccountDetails
	 * SwitchOrder5.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder5#InvestmentAccountDetails
	 * RedemptionMultipleOrder5.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution4#InvestmentAccountDetails
	 * RedemptionMultipleExecution4.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder5#InvestmentAccountDetails
	 * SubscriptionMultipleOrder5.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution4#InvestmentAccountDetails
	 * SubscriptionMultipleExecution4.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference7#InvestmentAccountDetails
	 * MessageAndBusinessReference7.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference8#InvestmentAccountDetails
	 * MessageAndBusinessReference8.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#InvestmentAccountDetails
	 * IndividualOrderConfirmationStatusAndReason2.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#InvestmentAccountDetails
	 * SwitchExecution7.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#InvestmentAccountDetails
	 * RedemptionMultipleExecution5.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#InvestmentAccountDetails
	 * RedemptionMultipleOrder6.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#InvestmentAccountDetails
	 * SubscriptionMultipleOrder6.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#InvestmentAccountDetails
	 * SwitchOrder7.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5#InvestmentAccountDetails
	 * SubscriptionMultipleExecution5.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#InvestmentAccountDetails
	 * SwitchSubscriptionLegOrder6.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason8#InvestmentAccountDetails
	 * IndividualOrderStatusAndReason8.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#InvestmentAccountDetails
	 * SubscriptionExecution12.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#InvestmentAccountDetails
	 * SubscriptionOrder15.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#InvestmentAccountDetails
	 * FundOrderData5.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#InvestmentAccountDetails
	 * SwitchRedemptionLegOrder6.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#InvestmentAccountDetails
	 * RedemptionOrder15.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#InvestmentAccountDetails
	 * RedemptionExecution16.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder8#InvestmentAccountDetails
	 * InvestmentFundOrder8.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#InvestmentAccountDetails
	 * SwitchSubscriptionLegExecution4.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#InvestmentAccountDetails
	 * SwitchRedemptionLegExecution4.InvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences2#InvestmentAccountDetails
	 * SwitchLegReferences2.InvestmentAccountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account related to an investment fund transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualOrderStatusAndReason4.InvestmentAccountDetails, com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.InvestmentAccountDetails,
					com.tools20022.repository.choice.InvestmentAccountOrFinancialInstrument1Choice.InvestmentAccount, com.tools20022.repository.msg.FundOrderData1.InvestmentAccountDetails,
					com.tools20022.repository.msg.SwitchLegReferences1.InvestmentAccountDetails, com.tools20022.repository.choice.PaymentInstrument7Choice.AccountDetails,
					com.tools20022.repository.msg.RedemptionOrder3.InvestmentAccountDetails, com.tools20022.repository.msg.RedemptionOrder5.InvestmentAccountDetails,
					com.tools20022.repository.msg.RedemptionExecution3.InvestmentAccountDetails, com.tools20022.repository.msg.RedemptionExecution5.InvestmentAccountDetails,
					com.tools20022.repository.msg.RedemptionOrder7.InvestmentAccountDetails, com.tools20022.repository.msg.RedemptionMultipleOrder2.InvestmentAccountDetails,
					com.tools20022.repository.msg.RedemptionMultipleOrder3.InvestmentAccountDetails, com.tools20022.repository.msg.RedemptionMultipleExecution2.InvestmentAccountDetails,
					com.tools20022.repository.msg.RedemptionMultipleExecution3.InvestmentAccountDetails, com.tools20022.repository.msg.RedemptionMultipleOrder4.InvestmentAccountDetails,
					com.tools20022.repository.msg.InvestmentFundOrder3.InvestmentAccountDetails, com.tools20022.repository.msg.MessageAndBusinessReference2.InvestmentAccount,
					com.tools20022.repository.msg.InvestmentFundOrder2.InvestmentAccountDetails, com.tools20022.repository.choice.PaymentInstrument9Choice.AccountDetails,
					com.tools20022.repository.msg.SubscriptionOrder3.InvestmentAccountDetails, com.tools20022.repository.choice.PaymentInstrument10Choice.AccountDetails,
					com.tools20022.repository.choice.PaymentInstrument6Choice.AccountDetails, com.tools20022.repository.choice.PaymentInstrument8Choice.AccountDetails,
					com.tools20022.repository.msg.SubscriptionOrder5.InvestmentAccountDetails, com.tools20022.repository.msg.SubscriptionExecution3.InvestmentAccountDetails,
					com.tools20022.repository.msg.SubscriptionExecution5.InvestmentAccountDetails, com.tools20022.repository.msg.SubscriptionOrder7.InvestmentAccountDetails,
					com.tools20022.repository.msg.SubscriptionMultipleOrder2.InvestmentAccountDetails, com.tools20022.repository.msg.SubscriptionMultipleOrder3.InvestmentAccountDetails,
					com.tools20022.repository.msg.SubscriptionMultipleExecution2.InvestmentAccountDetails, com.tools20022.repository.msg.SubscriptionMultipleExecution3.InvestmentAccountDetails,
					com.tools20022.repository.msg.SubscriptionMultipleOrder4.InvestmentAccountDetails, com.tools20022.repository.msg.SwitchOrder2.InvestmentAccountDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegOrder3.InvestmentAccountDetails, com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.InvestmentAccountDetails,
					com.tools20022.repository.msg.SwitchOrder3.InvestmentAccountDetails, com.tools20022.repository.msg.SwitchExecution3.InvestmentAccountDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution3.InvestmentAccountDetails, com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.InvestmentAccountDetails,
					com.tools20022.repository.msg.SwitchExecution4.InvestmentAccountDetails, com.tools20022.repository.msg.SwitchOrder4.InvestmentAccountDetails,
					com.tools20022.repository.msg.MessageAndBusinessReference1.InvestmentAccountDetails, com.tools20022.repository.msg.MessageAndBusinessReference6.InvestmentAccountDetails,
					com.tools20022.repository.msg.FundOrderData3.InvestmentAccountDetails, com.tools20022.repository.msg.RedemptionExecution10.InvestmentAccountDetails,
					com.tools20022.repository.msg.RedemptionOrder9.InvestmentAccountDetails, com.tools20022.repository.msg.SubscriptionExecution7.InvestmentAccountDetails,
					com.tools20022.repository.msg.SubscriptionOrder9.InvestmentAccountDetails, com.tools20022.repository.msg.SubscriptionExecution8.InvestmentAccountDetails,
					com.tools20022.repository.msg.RedemptionExecution11.InvestmentAccountDetails, com.tools20022.repository.msg.SwitchExecutionRedemptionLeg4.InvestmentAccountDetails,
					com.tools20022.repository.msg.SwitchExecutionSubscriptionLeg4.InvestmentAccountDetails, com.tools20022.repository.msg.SwitchExecution5.InvestmentAccountDetails,
					com.tools20022.repository.msg.SubscriptionOrder10.InvestmentAccountDetails, com.tools20022.repository.msg.RedemptionOrder10.InvestmentAccountDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegOrder4.InvestmentAccountDetails, com.tools20022.repository.msg.SwitchSubscriptionLegOrder4.InvestmentAccountDetails,
					com.tools20022.repository.msg.SwitchOrder5.InvestmentAccountDetails, com.tools20022.repository.msg.RedemptionMultipleOrder5.InvestmentAccountDetails,
					com.tools20022.repository.msg.RedemptionMultipleExecution4.InvestmentAccountDetails, com.tools20022.repository.msg.SubscriptionMultipleOrder5.InvestmentAccountDetails,
					com.tools20022.repository.msg.SubscriptionMultipleExecution4.InvestmentAccountDetails, com.tools20022.repository.msg.MessageAndBusinessReference7.InvestmentAccountDetails,
					com.tools20022.repository.msg.MessageAndBusinessReference8.InvestmentAccountDetails, com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2.InvestmentAccountDetails,
					com.tools20022.repository.msg.SwitchExecution7.InvestmentAccountDetails, com.tools20022.repository.msg.RedemptionMultipleExecution5.InvestmentAccountDetails,
					com.tools20022.repository.msg.RedemptionMultipleOrder6.InvestmentAccountDetails, com.tools20022.repository.msg.SubscriptionMultipleOrder6.InvestmentAccountDetails,
					com.tools20022.repository.msg.SwitchOrder7.InvestmentAccountDetails, com.tools20022.repository.msg.SubscriptionMultipleExecution5.InvestmentAccountDetails,
					com.tools20022.repository.msg.SwitchSubscriptionLegOrder6.InvestmentAccountDetails, com.tools20022.repository.msg.IndividualOrderStatusAndReason8.InvestmentAccountDetails,
					com.tools20022.repository.msg.SubscriptionExecution12.InvestmentAccountDetails, com.tools20022.repository.msg.SubscriptionOrder15.InvestmentAccountDetails,
					com.tools20022.repository.msg.FundOrderData5.InvestmentAccountDetails, com.tools20022.repository.msg.SwitchRedemptionLegOrder6.InvestmentAccountDetails,
					com.tools20022.repository.msg.RedemptionOrder15.InvestmentAccountDetails, com.tools20022.repository.msg.RedemptionExecution16.InvestmentAccountDetails,
					com.tools20022.repository.msg.InvestmentFundOrder8.InvestmentAccountDetails, com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.InvestmentAccountDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution4.InvestmentAccountDetails, com.tools20022.repository.msg.SwitchLegReferences2.InvestmentAccountDetails);
			elementContext_lazy = () -> InvestmentFundTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccount";
			definition = "Account related to an investment fund transaction.";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.InvestmentFundTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Investment fund class to which an investment fund order and its execution
	 * are related.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#InvestmentFundTransaction
	 * InvestmentFundClass.InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason4#FinancialInstrumentDetails
	 * IndividualOrderStatusAndReason4.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#FinancialInstrumentDetails
	 * IndividualOrderConfirmationStatusAndReason1.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentAccountOrFinancialInstrument1Choice#FinancialInstrument
	 * InvestmentAccountOrFinancialInstrument1Choice.FinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1#FinancialInstrumentDetails
	 * FundOrderData1.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences1#FinancialInstrumentDetails
	 * SwitchLegReferences1.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder2#FinancialInstrumentDetails
	 * RedemptionBulkOrder2.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3#FinancialInstrumentDetails
	 * RedemptionBulkOrder3.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution2#FinancialInstrumentDetails
	 * RedemptionBulkExecution2.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#FinancialInstrumentDetails
	 * RedemptionBulkExecution3.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4#FinancialInstrumentDetails
	 * RedemptionBulkOrder4.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#FinancialInstrumentDetails
	 * RedemptionOrder4.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#FinancialInstrumentDetails
	 * RedemptionOrder6.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#FinancialInstrumentDetails
	 * RedemptionExecution4.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#FinancialInstrumentDetails
	 * RedemptionExecution6.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#FinancialInstrumentDetails
	 * RedemptionOrder8.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder3#FinancialInstrumentDetails
	 * InvestmentFundOrder3.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder2#FinancialInstrumentDetails
	 * InvestmentFundOrder2.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder2#FinancialInstrumentDetails
	 * SubscriptionBulkOrder2.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3#FinancialInstrumentDetails
	 * SubscriptionBulkOrder3.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution2#FinancialInstrumentDetails
	 * SubscriptionBulkExecution2.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3#FinancialInstrumentDetails
	 * SubscriptionBulkExecution3.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4#FinancialInstrumentDetails
	 * SubscriptionBulkOrder4.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#FinancialInstrumentDetails
	 * SubscriptionOrder4.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#FinancialInstrumentDetails
	 * SubscriptionOrder6.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#FinancialInstrumentDetails
	 * SubscriptionExecution4.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#FinancialInstrumentDetails
	 * SubscriptionExecution6.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#FinancialInstrumentDetails
	 * SubscriptionOrder8.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder2#FinancialInstrumentDetails
	 * SwitchRedemptionLegOrder2.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#FinancialInstrumentDetails
	 * SwitchSubscriptionLegOrder2.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#FinancialInstrumentDetails
	 * SwitchRedemptionLegOrder3.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#FinancialInstrumentDetails
	 * SwitchSubscriptionLegOrder3.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#FinancialInstrumentDetails
	 * SwitchSubscriptionLegExecution2.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#FinancialInstrumentDetails
	 * SwitchSubscriptionLegExecution3.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData3#FinancialInstrumentDetails
	 * FundOrderData3.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3#HoldBackDetails
	 * ExpectedExecutionDetails3.HoldBackDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#FinancialInstrumentDetails
	 * RedemptionExecution10.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#HoldBackDetails
	 * RedemptionExecution10.HoldBackDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#FinancialInstrumentDetails
	 * RedemptionOrder9.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#FinancialInstrumentDetails
	 * SubscriptionExecution7.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#FinancialInstrumentDetails
	 * SubscriptionOrder9.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution8#FinancialInstrumentDetails
	 * SubscriptionExecution8.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution11#FinancialInstrumentDetails
	 * RedemptionExecution11.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecutionRedemptionLeg4#FinancialInstrumentDetails
	 * SwitchExecutionRedemptionLeg4.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecutionSubscriptionLeg4#FinancialInstrumentDetails
	 * SwitchExecutionSubscriptionLeg4.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder10#FinancialInstrumentDetails
	 * SubscriptionOrder10.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder10#FinancialInstrumentDetails
	 * RedemptionOrder10.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder4#FinancialInstrumentDetails
	 * SwitchRedemptionLegOrder4.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder4#FinancialInstrumentDetails
	 * SwitchSubscriptionLegOrder4.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#FinancialInstrumentDetails
	 * RedemptionOrder11.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#FinancialInstrumentDetails
	 * RedemptionExecution12.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#FinancialInstrumentDetails
	 * SubscriptionOrder11.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#FinancialInstrumentDetails
	 * SubscriptionExecution9.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3#FundOrSubFundDetails
	 * FundDetailedConfirmedCashForecastReport3.FundOrSubFundDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#FinancialInstrumentDetails
	 * IndividualOrderConfirmationStatusAndReason2.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#FinancialInstrumentDetails
	 * SubscriptionBulkOrder5.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#FinancialInstrumentDetails
	 * RedemptionBulkExecution5.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#FinancialInstrumentDetails
	 * SubscriptionBulkExecution4.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#FinancialInstrumentDetails
	 * RedemptionBulkOrder6.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#FinancialInstrumentDetails
	 * RedemptionOrder14.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#GatingOrHoldBackDetails
	 * IndividualOrderStatusAndReason7.GatingOrHoldBackDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#FinancialInstrumentDetails
	 * SwitchSubscriptionLegOrder6.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason8#FinancialInstrumentDetails
	 * IndividualOrderStatusAndReason8.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#FinancialInstrumentDetails
	 * SubscriptionExecution13.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2#FinancialInstrumentIdentification
	 * HoldBackInformation2.FinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#FinancialInstrumentDetails
	 * FundOrderData5.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#FinancialInstrumentDetails
	 * SwitchRedemptionLegOrder6.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#GatingOrHoldBackDetails
	 * RedemptionExecution16.GatingOrHoldBackDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#FinancialInstrumentDetails
	 * SubscriptionOrder14.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder8#FinancialInstrumentDetails
	 * InvestmentFundOrder8.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#FinancialInstrumentDetails
	 * SwitchSubscriptionLegExecution4.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#FinancialInstrumentDetails
	 * RedemptionExecution15.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#GatingOrHoldBackDetails
	 * RedemptionExecution15.GatingOrHoldBackDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#GatingOrHoldBackDetails
	 * SwitchRedemptionLegExecution4.GatingOrHoldBackDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences2#FinancialInstrumentDetails
	 * SwitchLegReferences2.FinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation3#FinancialInstrumentIdentification
	 * HoldBackInformation3.FinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundClass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund class to which an investment fund order and its execution are related."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentFundClass = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualOrderStatusAndReason4.FinancialInstrumentDetails,
					com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.FinancialInstrumentDetails, com.tools20022.repository.choice.InvestmentAccountOrFinancialInstrument1Choice.FinancialInstrument,
					com.tools20022.repository.msg.FundOrderData1.FinancialInstrumentDetails, com.tools20022.repository.msg.SwitchLegReferences1.FinancialInstrumentDetails,
					com.tools20022.repository.msg.RedemptionBulkOrder2.FinancialInstrumentDetails, com.tools20022.repository.msg.RedemptionBulkOrder3.FinancialInstrumentDetails,
					com.tools20022.repository.msg.RedemptionBulkExecution2.FinancialInstrumentDetails, com.tools20022.repository.msg.RedemptionBulkExecution3.FinancialInstrumentDetails,
					com.tools20022.repository.msg.RedemptionBulkOrder4.FinancialInstrumentDetails, com.tools20022.repository.msg.RedemptionOrder4.FinancialInstrumentDetails,
					com.tools20022.repository.msg.RedemptionOrder6.FinancialInstrumentDetails, com.tools20022.repository.msg.RedemptionExecution4.FinancialInstrumentDetails,
					com.tools20022.repository.msg.RedemptionExecution6.FinancialInstrumentDetails, com.tools20022.repository.msg.RedemptionOrder8.FinancialInstrumentDetails,
					com.tools20022.repository.msg.InvestmentFundOrder3.FinancialInstrumentDetails, com.tools20022.repository.msg.InvestmentFundOrder2.FinancialInstrumentDetails,
					com.tools20022.repository.msg.SubscriptionBulkOrder2.FinancialInstrumentDetails, com.tools20022.repository.msg.SubscriptionBulkOrder3.FinancialInstrumentDetails,
					com.tools20022.repository.msg.SubscriptionBulkExecution2.FinancialInstrumentDetails, com.tools20022.repository.msg.SubscriptionBulkExecution3.FinancialInstrumentDetails,
					com.tools20022.repository.msg.SubscriptionBulkOrder4.FinancialInstrumentDetails, com.tools20022.repository.msg.SubscriptionOrder4.FinancialInstrumentDetails,
					com.tools20022.repository.msg.SubscriptionOrder6.FinancialInstrumentDetails, com.tools20022.repository.msg.SubscriptionExecution4.FinancialInstrumentDetails,
					com.tools20022.repository.msg.SubscriptionExecution6.FinancialInstrumentDetails, com.tools20022.repository.msg.SubscriptionOrder8.FinancialInstrumentDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegOrder2.FinancialInstrumentDetails, com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.FinancialInstrumentDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegOrder3.FinancialInstrumentDetails, com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.FinancialInstrumentDetails,
					com.tools20022.repository.msg.SwitchSubscriptionLegExecution2.FinancialInstrumentDetails, com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.FinancialInstrumentDetails,
					com.tools20022.repository.msg.FundOrderData3.FinancialInstrumentDetails, com.tools20022.repository.msg.ExpectedExecutionDetails3.HoldBackDetails,
					com.tools20022.repository.msg.RedemptionExecution10.FinancialInstrumentDetails, com.tools20022.repository.msg.RedemptionExecution10.HoldBackDetails,
					com.tools20022.repository.msg.RedemptionOrder9.FinancialInstrumentDetails, com.tools20022.repository.msg.SubscriptionExecution7.FinancialInstrumentDetails,
					com.tools20022.repository.msg.SubscriptionOrder9.FinancialInstrumentDetails, com.tools20022.repository.msg.SubscriptionExecution8.FinancialInstrumentDetails,
					com.tools20022.repository.msg.RedemptionExecution11.FinancialInstrumentDetails, com.tools20022.repository.msg.SwitchExecutionRedemptionLeg4.FinancialInstrumentDetails,
					com.tools20022.repository.msg.SwitchExecutionSubscriptionLeg4.FinancialInstrumentDetails, com.tools20022.repository.msg.SubscriptionOrder10.FinancialInstrumentDetails,
					com.tools20022.repository.msg.RedemptionOrder10.FinancialInstrumentDetails, com.tools20022.repository.msg.SwitchRedemptionLegOrder4.FinancialInstrumentDetails,
					com.tools20022.repository.msg.SwitchSubscriptionLegOrder4.FinancialInstrumentDetails, com.tools20022.repository.msg.RedemptionOrder11.FinancialInstrumentDetails,
					com.tools20022.repository.msg.RedemptionExecution12.FinancialInstrumentDetails, com.tools20022.repository.msg.SubscriptionOrder11.FinancialInstrumentDetails,
					com.tools20022.repository.msg.SubscriptionExecution9.FinancialInstrumentDetails, com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3.FundOrSubFundDetails,
					com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2.FinancialInstrumentDetails, com.tools20022.repository.msg.SubscriptionBulkOrder5.FinancialInstrumentDetails,
					com.tools20022.repository.msg.RedemptionBulkExecution5.FinancialInstrumentDetails, com.tools20022.repository.msg.SubscriptionBulkExecution4.FinancialInstrumentDetails,
					com.tools20022.repository.msg.RedemptionBulkOrder6.FinancialInstrumentDetails, com.tools20022.repository.msg.RedemptionOrder14.FinancialInstrumentDetails,
					com.tools20022.repository.msg.IndividualOrderStatusAndReason7.GatingOrHoldBackDetails, com.tools20022.repository.msg.SwitchSubscriptionLegOrder6.FinancialInstrumentDetails,
					com.tools20022.repository.msg.IndividualOrderStatusAndReason8.FinancialInstrumentDetails, com.tools20022.repository.msg.SubscriptionExecution13.FinancialInstrumentDetails,
					com.tools20022.repository.msg.HoldBackInformation2.FinancialInstrumentIdentification, com.tools20022.repository.msg.FundOrderData5.FinancialInstrumentDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegOrder6.FinancialInstrumentDetails, com.tools20022.repository.msg.RedemptionExecution16.GatingOrHoldBackDetails,
					com.tools20022.repository.msg.SubscriptionOrder14.FinancialInstrumentDetails, com.tools20022.repository.msg.InvestmentFundOrder8.FinancialInstrumentDetails,
					com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.FinancialInstrumentDetails, com.tools20022.repository.msg.RedemptionExecution15.FinancialInstrumentDetails,
					com.tools20022.repository.msg.RedemptionExecution15.GatingOrHoldBackDetails, com.tools20022.repository.msg.SwitchRedemptionLegExecution4.GatingOrHoldBackDetails,
					com.tools20022.repository.msg.SwitchLegReferences2.FinancialInstrumentDetails, com.tools20022.repository.msg.HoldBackInformation3.FinancialInstrumentIdentification);
			elementContext_lazy = () -> InvestmentFundTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundClass";
			definition = "Investment fund class to which an investment fund order and its execution are related.";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.InvestmentFundTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Tax applicable to an investment fund order and/or to its execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#Transaction
	 * InvestmentFundTax.Transaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#TaxDetails
	 * RedemptionOrder3.TaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#TaxDetails
	 * RedemptionOrder5.TaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#TaxGeneralDetails
	 * RedemptionExecution3.TaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#TaxGeneralDetails
	 * RedemptionExecution5.TaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#TaxDetails
	 * RedemptionOrder7.TaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#TaxDetails
	 * RedemptionOrder4.TaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#TaxDetails
	 * RedemptionOrder6.TaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#TaxGeneralDetails
	 * RedemptionExecution4.TaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#TaxGeneralDetails
	 * RedemptionExecution6.TaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#TaxDetails
	 * RedemptionOrder8.TaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#TaxDetails
	 * SubscriptionOrder3.TaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#TaxDetails
	 * SubscriptionOrder5.TaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#TaxGeneralDetails
	 * SubscriptionExecution3.TaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#TaxGeneralDetails
	 * SubscriptionExecution5.TaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#TaxDetails
	 * SubscriptionOrder7.TaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#TaxDetails
	 * SubscriptionOrder4.TaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#TaxDetails
	 * SubscriptionOrder6.TaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#TaxGeneralDetails
	 * SubscriptionExecution4.TaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#TaxGeneralDetails
	 * SubscriptionExecution6.TaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#TaxDetails
	 * SubscriptionOrder8.TaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder2#TaxDetails
	 * SwitchRedemptionLegOrder2.TaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#TaxDetails
	 * SwitchSubscriptionLegOrder2.TaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#TaxDetails
	 * SwitchRedemptionLegOrder3.TaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#TaxDetails
	 * SwitchSubscriptionLegOrder3.TaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#TaxGeneralDetails
	 * SwitchRedemptionLegExecution2.TaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#TaxGeneralDetails
	 * SwitchSubscriptionLegExecution2.TaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#TaxGeneralDetails
	 * SwitchRedemptionLegExecution3.TaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#TaxGeneralDetails
	 * SwitchSubscriptionLegExecution3.TaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#TaxGeneralDetails
	 * RedemptionExecution10.TaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#TaxDetails
	 * RedemptionOrder9.TaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#TaxGeneralDetails
	 * SubscriptionExecution7.TaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#TaxDetails
	 * SubscriptionOrder9.TaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#TaxGeneralDetails
	 * RedemptionExecution12.TaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#TaxGeneralDetails
	 * SubscriptionExecution9.TaxGeneralDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax applicable to an investment fund order and/or to its execution."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TransactionTax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionOrder3.TaxDetails, com.tools20022.repository.msg.RedemptionOrder5.TaxDetails, com.tools20022.repository.msg.RedemptionExecution3.TaxGeneralDetails,
					com.tools20022.repository.msg.RedemptionExecution5.TaxGeneralDetails, com.tools20022.repository.msg.RedemptionOrder7.TaxDetails, com.tools20022.repository.msg.RedemptionOrder4.TaxDetails,
					com.tools20022.repository.msg.RedemptionOrder6.TaxDetails, com.tools20022.repository.msg.RedemptionExecution4.TaxGeneralDetails, com.tools20022.repository.msg.RedemptionExecution6.TaxGeneralDetails,
					com.tools20022.repository.msg.RedemptionOrder8.TaxDetails, com.tools20022.repository.msg.SubscriptionOrder3.TaxDetails, com.tools20022.repository.msg.SubscriptionOrder5.TaxDetails,
					com.tools20022.repository.msg.SubscriptionExecution3.TaxGeneralDetails, com.tools20022.repository.msg.SubscriptionExecution5.TaxGeneralDetails, com.tools20022.repository.msg.SubscriptionOrder7.TaxDetails,
					com.tools20022.repository.msg.SubscriptionOrder4.TaxDetails, com.tools20022.repository.msg.SubscriptionOrder6.TaxDetails, com.tools20022.repository.msg.SubscriptionExecution4.TaxGeneralDetails,
					com.tools20022.repository.msg.SubscriptionExecution6.TaxGeneralDetails, com.tools20022.repository.msg.SubscriptionOrder8.TaxDetails, com.tools20022.repository.msg.SwitchRedemptionLegOrder2.TaxDetails,
					com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.TaxDetails, com.tools20022.repository.msg.SwitchRedemptionLegOrder3.TaxDetails, com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.TaxDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution2.TaxGeneralDetails, com.tools20022.repository.msg.SwitchSubscriptionLegExecution2.TaxGeneralDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution3.TaxGeneralDetails, com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.TaxGeneralDetails,
					com.tools20022.repository.msg.RedemptionExecution10.TaxGeneralDetails, com.tools20022.repository.msg.RedemptionOrder9.TaxDetails, com.tools20022.repository.msg.SubscriptionExecution7.TaxGeneralDetails,
					com.tools20022.repository.msg.SubscriptionOrder9.TaxDetails, com.tools20022.repository.msg.RedemptionExecution12.TaxGeneralDetails, com.tools20022.repository.msg.SubscriptionExecution9.TaxGeneralDetails);
			elementContext_lazy = () -> InvestmentFundTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionTax";
			definition = "Tax applicable to an investment fund order and/or to its execution.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundTax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTax.Transaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Direction of the transaction, ie, securities are received (credited) or
	 * delivered (debited).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#CreditDebit
	 * InvestmentFundTransaction2.CreditDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#CreditDebit
	 * InvestmentFundTransaction3.CreditDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#CreditDebit
	 * InvestmentFundTransaction4.CreditDebit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Direction of the transaction, ie, securities are received (credited) or delivered (debited)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentFundTransaction2.CreditDebit, com.tools20022.repository.msg.InvestmentFundTransaction3.CreditDebit,
					com.tools20022.repository.msg.InvestmentFundTransaction4.CreditDebit);
			elementContext_lazy = () -> InvestmentFundTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Direction of the transaction, ie, securities are received (credited) or delivered (debited).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	/**
	 * Creation/cancellation of investment units on the books of the fund or its
	 * designated agent, as a result of executing an investment fund order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#InvestmentFundTransaction
	 * InvestmentFundOrderExecution.InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#Assets
	 * PEPISACashTransfer2.Assets}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundOrderExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentFundOrderExecution = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PEPISACashTransfer2.Assets);
			elementContext_lazy = () -> InvestmentFundTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundOrderExecution";
			definition = "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.InvestmentFundTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundTransaction";
				definition = "Process of buying, selling, switching or transferring fund units.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.InvestmentFundTransaction, com.tools20022.repository.entity.InvestmentAccount.InvestmentFundTransaction,
						com.tools20022.repository.entity.InvestmentFundTax.Transaction, com.tools20022.repository.entity.InvestmentFundOrder.RelatedTransaction,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.InvestmentFundTransaction, com.tools20022.repository.entity.Charges.InvestmentFundTransaction);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentFundTransactionsByFund1.TransactionDetails, com.tools20022.repository.msg.InvestmentFundTransaction4.EventType);
				superType_lazy = () -> SecuritiesTrade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentFundOrder, com.tools20022.repository.entity.InvestmentFundTransaction.ClientReference,
						com.tools20022.repository.entity.InvestmentFundTransaction.Type, com.tools20022.repository.entity.InvestmentFundTransaction.TransactionCharge,
						com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentAccount, com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentFundClass,
						com.tools20022.repository.entity.InvestmentFundTransaction.TransactionTax, com.tools20022.repository.entity.InvestmentFundTransaction.CreditDebitIndicator,
						com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentFundOrderExecution);
				derivationComponent_lazy = () -> Arrays.asList(InvestmentFundTransactionInType1.mmObject(), InvestmentAccountOrFinancialInstrument1Choice.mmObject(), TransactionType1CodeChoice.mmObject(),
						InvestmentFundTransaction2.mmObject(), InvestmentFundTransactionsByFund1.mmObject(), InvestmentFundTransaction3.mmObject(), InvestmentFundTransactionsByFund2.mmObject(),
						SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.mmObject(), SubscriptionOrRedemptionOrSwitchOrderDataChoice.mmObject(), InvestmentFundTransactionsByFund3.mmObject(), InvestmentFundTransaction4.mmObject(),
						TransactionType1Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}