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
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
 * SecuritiesTrade}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundOrder
 * InvestmentFundTransaction.mmInvestmentFundOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmClientReference
 * InvestmentFundTransaction.mmClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmType
 * InvestmentFundTransaction.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionCharge
 * InvestmentFundTransaction.mmTransactionCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentAccount
 * InvestmentFundTransaction.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundClass
 * InvestmentFundTransaction.mmInvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionTax
 * InvestmentFundTransaction.mmTransactionTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmCreditDebitIndicator
 * InvestmentFundTransaction.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundOrderExecution
 * InvestmentFundTransaction.mmInvestmentFundOrderExecution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentFundTransaction
 * InvestmentFundClass.mmInvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundTransaction
 * InvestmentAccount.mmInvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmTransaction
 * InvestmentFundTax.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmRelatedTransaction
 * InvestmentFundOrder.mmRelatedTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmInvestmentFundTransaction
 * InvestmentFundOrderExecution.mmInvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#mmInvestmentFundTransaction
 * Charges.mmInvestmentFundTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1#mmTransactionDetails
 * InvestmentFundTransactionsByFund1.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmEventType
 * InvestmentFundTransaction4.mmEventType}</li>
 * </ul>
 * </li>
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
	protected List<com.tools20022.repository.entity.InvestmentFundOrder> investmentFundOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmRelatedTransaction
	 * InvestmentFundOrder.mmRelatedTransaction}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Blocked1#mmOrderType
	 * Blocked1.mmOrderType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Blocked2#mmOrderType
	 * Blocked2.mmOrderType}</li>
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
	public static final MMBusinessAssociationEnd mmInvestmentFundOrder = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Blocked1.mmOrderType, Blocked2.mmOrderType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundOrder";
			definition = "An investor's instruction to either subscribe or redeem an amount of money or its equivalent, eg, other assets, into or out of an investment fund.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmRelatedTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
		}
	};
	protected Max35Text clientReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer7#mmClientReference
	 * Transfer7.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer10#mmClientReference
	 * Transfer10.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer6#mmClientReference
	 * Transfer6.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer9#mmClientReference
	 * Transfer9.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer18#mmClientReference
	 * Transfer18.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer26#mmClientReference
	 * Transfer26.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer5#mmClientReference
	 * Transfer5.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer15#mmClientReference
	 * Transfer15.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer21#mmClientReference
	 * Transfer21.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer13#mmClientReference
	 * Transfer13.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer23#mmClientReference
	 * Transfer23.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer8#mmClientReference
	 * Transfer8.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer11#mmClientReference
	 * Transfer11.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer19#mmClientReference
	 * Transfer19.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmClientReference
	 * SwitchOrderStatusAndReason1.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder5#mmClientReference
	 * InvestmentFundOrder5.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmClientReference
	 * RedemptionOrder5.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmClientReference
	 * RedemptionExecution5.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution2#mmClientReference
	 * InvestmentFundOrderExecution2.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmClientReference
	 * RedemptionOrder7.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmClientReference
	 * RedemptionOrder6.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmClientReference
	 * RedemptionExecution6.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmClientReference
	 * RedemptionOrder8.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder3#mmClientReference
	 * InvestmentFundOrder3.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder2#mmClientReference
	 * InvestmentFundOrder2.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmClientReference
	 * InvestmentFundTransaction3.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmClientReference
	 * SubscriptionOrder5.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmClientReference
	 * SubscriptionExecution5.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmClientReference
	 * SubscriptionOrder7.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmClientReference
	 * SubscriptionOrder6.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmClientReference
	 * SubscriptionExecution6.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmClientReference
	 * SubscriptionOrder8.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#mmClientReference
	 * SwitchOrder3.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#mmClientReference
	 * SwitchExecution4.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#mmClientReference
	 * SwitchOrder4.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason2#mmClientReference
	 * CancellationStatusAndReason2.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmClientReference
	 * RedemptionExecution10.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#mmClientReference
	 * RedemptionOrder9.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmClientReference
	 * SubscriptionExecution7.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#mmClientReference
	 * SubscriptionOrder9.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution3#mmClientReference
	 * InvestmentFundOrderExecution3.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder6#mmClientReference
	 * InvestmentFundOrder6.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#mmClientReference
	 * RedemptionOrder11.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmClientReference
	 * RedemptionExecution12.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#mmClientReference
	 * SubscriptionOrder11.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmClientReference
	 * SubscriptionExecution9.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#mmClientReference
	 * ReceiveInformation13.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer27#mmClientReference
	 * Transfer27.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmClientReference
	 * Transfer28.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation12#mmClientReference
	 * ReceiveInformation12.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmClientReference
	 * Transfer29.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation12#mmClientReference
	 * DeliverInformation12.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#mmClientReference
	 * DeliverInformation13.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification1#mmClientReference
	 * InvestmentAccountModification1.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOpening1#mmClientReference
	 * InvestmentAccountOpening1.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation2#mmClientReference
	 * AccountManagementConfirmation2.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmClientReference
	 * InvestmentFundTransaction4.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#mmClientReference
	 * DeliverInformation15.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation14#mmClientReference
	 * DeliverInformation14.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#mmClientReference
	 * ReceiveInformation15.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation14#mmClientReference
	 * ReceiveInformation14.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOpening2#mmClientReference
	 * InvestmentAccountOpening2.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer26#mmClientReference
	 * ISATransfer26.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#mmClientReference
	 * ReceiveInformation17.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmClientReference
	 * Transfer31.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmClientReference
	 * Transfer30.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#mmClientReference
	 * ReceiveInformation16.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification2#mmClientReference
	 * InvestmentAccountModification2.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation3#mmClientReference
	 * AccountManagementConfirmation3.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmClientReference
	 * DeliverInformation16.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer32#mmClientReference
	 * Transfer32.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason3#mmClientReference
	 * CancellationStatusAndReason3.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#mmClientReference
	 * DeliverInformation17.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#mmClientReference
	 * Transfer33.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer22#mmClientReference
	 * ISATransfer22.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOpening3#mmClientReference
	 * InvestmentAccountOpening3.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder11#mmClientReference
	 * InvestmentFundOrder11.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmClientReference
	 * SwitchExecution7.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification3#mmClientReference
	 * InvestmentAccountModification3.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder9#mmClientReference
	 * InvestmentFundOrder9.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmClientReference
	 * SwitchOrder7.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation4#mmClientReference
	 * AccountManagementConfirmation4.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmClientReference
	 * RedemptionOrder14.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmClientReference
	 * SwitchOrderStatusAndReason2.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmClientReference
	 * SubscriptionExecution13.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmClientReference
	 * SubscriptionExecution12.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmClientReference
	 * SubscriptionOrder15.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmClientReference
	 * RedemptionOrder15.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmClientReference
	 * RedemptionExecution16.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmClientReference
	 * SubscriptionOrder14.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder8#mmClientReference
	 * InvestmentFundOrder8.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmClientReference
	 * RedemptionExecution15.mmClientReference}</li>
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
	public static final MMBusinessAttribute mmClientReference = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Transfer7.mmClientReference, Transfer10.mmClientReference, Transfer6.mmClientReference, Transfer9.mmClientReference, Transfer18.mmClientReference, Transfer26.mmClientReference,
					Transfer5.mmClientReference, Transfer15.mmClientReference, Transfer21.mmClientReference, Transfer13.mmClientReference, Transfer23.mmClientReference, Transfer8.mmClientReference, Transfer11.mmClientReference,
					Transfer19.mmClientReference, SwitchOrderStatusAndReason1.mmClientReference, InvestmentFundOrder5.mmClientReference, RedemptionOrder5.mmClientReference, RedemptionExecution5.mmClientReference,
					InvestmentFundOrderExecution2.mmClientReference, RedemptionOrder7.mmClientReference, RedemptionOrder6.mmClientReference, RedemptionExecution6.mmClientReference, RedemptionOrder8.mmClientReference,
					InvestmentFundOrder3.mmClientReference, InvestmentFundOrder2.mmClientReference, InvestmentFundTransaction3.mmClientReference, SubscriptionOrder5.mmClientReference, SubscriptionExecution5.mmClientReference,
					SubscriptionOrder7.mmClientReference, SubscriptionOrder6.mmClientReference, SubscriptionExecution6.mmClientReference, SubscriptionOrder8.mmClientReference, SwitchOrder3.mmClientReference,
					SwitchExecution4.mmClientReference, SwitchOrder4.mmClientReference, CancellationStatusAndReason2.mmClientReference, RedemptionExecution10.mmClientReference, RedemptionOrder9.mmClientReference,
					SubscriptionExecution7.mmClientReference, SubscriptionOrder9.mmClientReference, InvestmentFundOrderExecution3.mmClientReference, InvestmentFundOrder6.mmClientReference, RedemptionOrder11.mmClientReference,
					RedemptionExecution12.mmClientReference, SubscriptionOrder11.mmClientReference, SubscriptionExecution9.mmClientReference, ReceiveInformation13.mmClientReference, Transfer27.mmClientReference,
					Transfer28.mmClientReference, ReceiveInformation12.mmClientReference, Transfer29.mmClientReference, DeliverInformation12.mmClientReference, DeliverInformation13.mmClientReference,
					InvestmentAccountModification1.mmClientReference, InvestmentAccountOpening1.mmClientReference, AccountManagementConfirmation2.mmClientReference, InvestmentFundTransaction4.mmClientReference,
					DeliverInformation15.mmClientReference, DeliverInformation14.mmClientReference, ReceiveInformation15.mmClientReference, ReceiveInformation14.mmClientReference, InvestmentAccountOpening2.mmClientReference,
					ISATransfer26.mmClientReference, ReceiveInformation17.mmClientReference, Transfer31.mmClientReference, Transfer30.mmClientReference, ReceiveInformation16.mmClientReference,
					InvestmentAccountModification2.mmClientReference, AccountManagementConfirmation3.mmClientReference, DeliverInformation16.mmClientReference, Transfer32.mmClientReference, CancellationStatusAndReason3.mmClientReference,
					DeliverInformation17.mmClientReference, Transfer33.mmClientReference, ISATransfer22.mmClientReference, InvestmentAccountOpening3.mmClientReference, InvestmentFundOrder11.mmClientReference,
					SwitchExecution7.mmClientReference, InvestmentAccountModification3.mmClientReference, InvestmentFundOrder9.mmClientReference, SwitchOrder7.mmClientReference, AccountManagementConfirmation4.mmClientReference,
					RedemptionOrder14.mmClientReference, SwitchOrderStatusAndReason2.mmClientReference, SubscriptionExecution13.mmClientReference, SubscriptionExecution12.mmClientReference, SubscriptionOrder15.mmClientReference,
					RedemptionOrder15.mmClientReference, RedemptionExecution16.mmClientReference, SubscriptionOrder14.mmClientReference, InvestmentFundOrder8.mmClientReference, RedemptionExecution15.mmClientReference);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of an order assigned by a client.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundTransaction.class.getMethod("getClientReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentFundTransactionTypeCode type;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionInType1#mmStructured
	 * InvestmentFundTransactionInType1.mmStructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown1#mmInvestmentFundTransactionInTypeDetails
	 * FundCashInBreakdown1.mmInvestmentFundTransactionInTypeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown1#mmInvestmentFundTransactionOutTypeDetails
	 * FundCashOutBreakdown1.mmInvestmentFundTransactionOutTypeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown2#mmInvestmentFundTransactionInType
	 * FundCashInBreakdown2.mmInvestmentFundTransactionInType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown2#mmExtendedInvestmentFundTransactionInType
	 * FundCashInBreakdown2.mmExtendedInvestmentFundTransactionInType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#mmInvestmentFundTransactionOutType
	 * FundCashOutBreakdown2.mmInvestmentFundTransactionOutType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#mmExtendedInvestmentFundTransactionOutType
	 * FundCashOutBreakdown2.mmExtendedInvestmentFundTransactionOutType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionType1CodeChoice#mmStructured
	 * TransactionType1CodeChoice.mmStructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionType1CodeChoice#mmUnstructured
	 * TransactionType1CodeChoice.mmUnstructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#mmTransactionType
	 * InvestmentFundTransaction2.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmTransactionType
	 * InvestmentFundTransaction3.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmExtendedTransactionType
	 * InvestmentFundTransaction3.mmExtendedTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#mmInvestmentFundTransactionOutType
	 * FundCashOutBreakdown3.mmInvestmentFundTransactionOutType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#mmInvestmentFundTransactionInType
	 * FundCashInBreakdown3.mmInvestmentFundTransactionInType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionType2Choice#mmType
	 * TransactionType2Choice.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionType2Choice#mmProprietary
	 * TransactionType2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentFundTransactionInType1Choice#mmCode
	 * InvestmentFundTransactionInType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentFundTransactionInType1Choice#mmProprietary
	 * InvestmentFundTransactionInType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentFundTransactionOutType1Choice#mmCode
	 * InvestmentFundTransactionOutType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentFundTransactionOutType1Choice#mmProprietary
	 * InvestmentFundTransactionOutType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionType1Choice#mmTransactionType
	 * TransactionType1Choice.mmTransactionType}</li>
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
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentFundTransactionInType1.mmStructured, FundCashInBreakdown1.mmInvestmentFundTransactionInTypeDetails, FundCashOutBreakdown1.mmInvestmentFundTransactionOutTypeDetails,
					FundCashInBreakdown2.mmInvestmentFundTransactionInType, FundCashInBreakdown2.mmExtendedInvestmentFundTransactionInType, FundCashOutBreakdown2.mmInvestmentFundTransactionOutType,
					FundCashOutBreakdown2.mmExtendedInvestmentFundTransactionOutType, TransactionType1CodeChoice.mmStructured, TransactionType1CodeChoice.mmUnstructured, InvestmentFundTransaction2.mmTransactionType,
					InvestmentFundTransaction3.mmTransactionType, InvestmentFundTransaction3.mmExtendedTransactionType, FundCashOutBreakdown3.mmInvestmentFundTransactionOutType, FundCashInBreakdown3.mmInvestmentFundTransactionInType,
					TransactionType2Choice.mmType, TransactionType2Choice.mmProprietary, InvestmentFundTransactionInType1Choice.mmCode, InvestmentFundTransactionInType1Choice.mmProprietary, InvestmentFundTransactionOutType1Choice.mmCode,
					InvestmentFundTransactionOutType1Choice.mmProprietary, TransactionType1Choice.mmTransactionType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of investment fund transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundTransaction.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Charges transactionCharge;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmInvestmentFundTransaction
	 * Charges.mmInvestmentFundTransaction}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown2#mmChargeDetails
	 * FundCashInBreakdown2.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown2#mmChargeDetails
	 * FundCashOutBreakdown2.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#mmChargeDetails
	 * RedemptionOrder3.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmChargeDetails
	 * RedemptionOrder5.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmChargeGeneralDetails
	 * RedemptionExecution3.mmChargeGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmChargeGeneralDetails
	 * RedemptionExecution5.mmChargeGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmChargeDetails
	 * RedemptionOrder7.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#mmChargeDetails
	 * RedemptionOrder4.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmChargeDetails
	 * RedemptionOrder6.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmChargeGeneralDetails
	 * RedemptionExecution4.mmChargeGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmChargeGeneralDetails
	 * RedemptionExecution6.mmChargeGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmChargeDetails
	 * RedemptionOrder8.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmChargeDetails
	 * SubscriptionOrder3.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmChargeDetails
	 * SubscriptionOrder5.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmChargeGeneralDetails
	 * SubscriptionExecution3.mmChargeGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmChargeGeneralDetails
	 * SubscriptionExecution5.mmChargeGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmChargeDetails
	 * SubscriptionOrder7.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#mmChargeDetails
	 * SubscriptionOrder4.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmChargeDetails
	 * SubscriptionOrder6.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmChargeGeneralDetails
	 * SubscriptionExecution4.mmChargeGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmChargeGeneralDetails
	 * SubscriptionExecution6.mmChargeGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmChargeDetails
	 * SubscriptionOrder8.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder2#mmChargeDetails
	 * SwitchRedemptionLegOrder2.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#mmChargeDetails
	 * SwitchSubscriptionLegOrder2.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#mmChargeDetails
	 * SwitchRedemptionLegOrder3.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmChargeDetails
	 * SwitchSubscriptionLegOrder3.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#mmChargeGeneralDetails
	 * SwitchRedemptionLegExecution2.mmChargeGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#mmChargeGeneralDetails
	 * SwitchSubscriptionLegExecution2.mmChargeGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#mmChargeGeneralDetails
	 * SwitchRedemptionLegExecution3.mmChargeGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#mmChargeGeneralDetails
	 * SwitchSubscriptionLegExecution3.mmChargeGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmTotalCharges
	 * RedemptionExecution10.mmTotalCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#mmChargeDetails
	 * RedemptionOrder9.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmTotalCharges
	 * SubscriptionExecution7.mmTotalCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#mmChargeDetails
	 * SubscriptionOrder9.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#mmChargeDetails
	 * RedemptionOrder11.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmChargeGeneralDetails
	 * RedemptionExecution12.mmChargeGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#mmChargeDetails
	 * SubscriptionOrder11.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmChargeGeneralDetails
	 * SubscriptionExecution9.mmChargeGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3#mmChargeDetails
	 * FundCashOutBreakdown3.mmChargeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#mmChargeDetails
	 * FundCashInBreakdown3.mmChargeDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FeeAndTax1#mmIndividualFee
	 * FeeAndTax1.mmIndividualFee}</li>
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
	public static final MMBusinessAssociationEnd mmTransactionCharge = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FundCashInBreakdown2.mmChargeDetails, FundCashOutBreakdown2.mmChargeDetails, RedemptionOrder3.mmChargeDetails, RedemptionOrder5.mmChargeDetails, RedemptionExecution3.mmChargeGeneralDetails,
					RedemptionExecution5.mmChargeGeneralDetails, RedemptionOrder7.mmChargeDetails, RedemptionOrder4.mmChargeDetails, RedemptionOrder6.mmChargeDetails, RedemptionExecution4.mmChargeGeneralDetails,
					RedemptionExecution6.mmChargeGeneralDetails, RedemptionOrder8.mmChargeDetails, SubscriptionOrder3.mmChargeDetails, SubscriptionOrder5.mmChargeDetails, SubscriptionExecution3.mmChargeGeneralDetails,
					SubscriptionExecution5.mmChargeGeneralDetails, SubscriptionOrder7.mmChargeDetails, SubscriptionOrder4.mmChargeDetails, SubscriptionOrder6.mmChargeDetails, SubscriptionExecution4.mmChargeGeneralDetails,
					SubscriptionExecution6.mmChargeGeneralDetails, SubscriptionOrder8.mmChargeDetails, SwitchRedemptionLegOrder2.mmChargeDetails, SwitchSubscriptionLegOrder2.mmChargeDetails, SwitchRedemptionLegOrder3.mmChargeDetails,
					SwitchSubscriptionLegOrder3.mmChargeDetails, SwitchRedemptionLegExecution2.mmChargeGeneralDetails, SwitchSubscriptionLegExecution2.mmChargeGeneralDetails, SwitchRedemptionLegExecution3.mmChargeGeneralDetails,
					SwitchSubscriptionLegExecution3.mmChargeGeneralDetails, RedemptionExecution10.mmTotalCharges, RedemptionOrder9.mmChargeDetails, SubscriptionExecution7.mmTotalCharges, SubscriptionOrder9.mmChargeDetails,
					RedemptionOrder11.mmChargeDetails, RedemptionExecution12.mmChargeGeneralDetails, SubscriptionOrder11.mmChargeDetails, SubscriptionExecution9.mmChargeGeneralDetails, FundCashOutBreakdown3.mmChargeDetails,
					FundCashInBreakdown3.mmChargeDetails, FeeAndTax1.mmIndividualFee);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionCharge";
			definition = "Charge for the placement of an order and/or for its execution.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.mmInvestmentFundTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentAccount> investmentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundTransaction
	 * InvestmentAccount.mmInvestmentFundTransaction}</li>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason4#mmInvestmentAccountDetails
	 * IndividualOrderStatusAndReason4.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#mmInvestmentAccountDetails
	 * IndividualOrderConfirmationStatusAndReason1.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentAccountOrFinancialInstrument1Choice#mmInvestmentAccount
	 * InvestmentAccountOrFinancialInstrument1Choice.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1#mmInvestmentAccountDetails
	 * FundOrderData1.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences1#mmInvestmentAccountDetails
	 * SwitchLegReferences1.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument7Choice#mmAccountDetails
	 * PaymentInstrument7Choice.mmAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#mmInvestmentAccountDetails
	 * RedemptionOrder3.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmInvestmentAccountDetails
	 * RedemptionOrder5.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmInvestmentAccountDetails
	 * RedemptionExecution3.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmInvestmentAccountDetails
	 * RedemptionExecution5.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmInvestmentAccountDetails
	 * RedemptionOrder7.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder2#mmInvestmentAccountDetails
	 * RedemptionMultipleOrder2.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3#mmInvestmentAccountDetails
	 * RedemptionMultipleOrder3.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution2#mmInvestmentAccountDetails
	 * RedemptionMultipleExecution2.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#mmInvestmentAccountDetails
	 * RedemptionMultipleExecution3.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4#mmInvestmentAccountDetails
	 * RedemptionMultipleOrder4.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder3#mmInvestmentAccountDetails
	 * InvestmentFundOrder3.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference2#mmInvestmentAccount
	 * MessageAndBusinessReference2.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder2#mmInvestmentAccountDetails
	 * InvestmentFundOrder2.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument9Choice#mmAccountDetails
	 * PaymentInstrument9Choice.mmAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmInvestmentAccountDetails
	 * SubscriptionOrder3.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument10Choice#mmAccountDetails
	 * PaymentInstrument10Choice.mmAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument6Choice#mmAccountDetails
	 * PaymentInstrument6Choice.mmAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument8Choice#mmAccountDetails
	 * PaymentInstrument8Choice.mmAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmInvestmentAccountDetails
	 * SubscriptionOrder5.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmInvestmentAccountDetails
	 * SubscriptionExecution3.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmInvestmentAccountDetails
	 * SubscriptionExecution5.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmInvestmentAccountDetails
	 * SubscriptionOrder7.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder2#mmInvestmentAccountDetails
	 * SubscriptionMultipleOrder2.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder3#mmInvestmentAccountDetails
	 * SubscriptionMultipleOrder3.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution2#mmInvestmentAccountDetails
	 * SubscriptionMultipleExecution2.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution3#mmInvestmentAccountDetails
	 * SubscriptionMultipleExecution3.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#mmInvestmentAccountDetails
	 * SubscriptionMultipleOrder4.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder2#mmInvestmentAccountDetails
	 * SwitchOrder2.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#mmInvestmentAccountDetails
	 * SwitchRedemptionLegOrder3.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmInvestmentAccountDetails
	 * SwitchSubscriptionLegOrder3.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#mmInvestmentAccountDetails
	 * SwitchOrder3.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#mmInvestmentAccountDetails
	 * SwitchExecution3.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#mmInvestmentAccountDetails
	 * SwitchRedemptionLegExecution3.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#mmInvestmentAccountDetails
	 * SwitchSubscriptionLegExecution3.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#mmInvestmentAccountDetails
	 * SwitchExecution4.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#mmInvestmentAccountDetails
	 * SwitchOrder4.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference1#mmInvestmentAccountDetails
	 * MessageAndBusinessReference1.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference6#mmInvestmentAccountDetails
	 * MessageAndBusinessReference6.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData3#mmInvestmentAccountDetails
	 * FundOrderData3.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmInvestmentAccountDetails
	 * RedemptionExecution10.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#mmInvestmentAccountDetails
	 * RedemptionOrder9.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmInvestmentAccountDetails
	 * SubscriptionExecution7.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#mmInvestmentAccountDetails
	 * SubscriptionOrder9.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution8#mmInvestmentAccountDetails
	 * SubscriptionExecution8.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution11#mmInvestmentAccountDetails
	 * RedemptionExecution11.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecutionRedemptionLeg4#mmInvestmentAccountDetails
	 * SwitchExecutionRedemptionLeg4.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecutionSubscriptionLeg4#mmInvestmentAccountDetails
	 * SwitchExecutionSubscriptionLeg4.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution5#mmInvestmentAccountDetails
	 * SwitchExecution5.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder10#mmInvestmentAccountDetails
	 * SubscriptionOrder10.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder10#mmInvestmentAccountDetails
	 * RedemptionOrder10.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder4#mmInvestmentAccountDetails
	 * SwitchRedemptionLegOrder4.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder4#mmInvestmentAccountDetails
	 * SwitchSubscriptionLegOrder4.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder5#mmInvestmentAccountDetails
	 * SwitchOrder5.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder5#mmInvestmentAccountDetails
	 * RedemptionMultipleOrder5.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution4#mmInvestmentAccountDetails
	 * RedemptionMultipleExecution4.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder5#mmInvestmentAccountDetails
	 * SubscriptionMultipleOrder5.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution4#mmInvestmentAccountDetails
	 * SubscriptionMultipleExecution4.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference7#mmInvestmentAccountDetails
	 * MessageAndBusinessReference7.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference8#mmInvestmentAccountDetails
	 * MessageAndBusinessReference8.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#mmInvestmentAccountDetails
	 * IndividualOrderConfirmationStatusAndReason2.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmInvestmentAccountDetails
	 * SwitchExecution7.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmInvestmentAccountDetails
	 * RedemptionMultipleExecution5.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmInvestmentAccountDetails
	 * RedemptionMultipleOrder6.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmInvestmentAccountDetails
	 * SubscriptionMultipleOrder6.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmInvestmentAccountDetails
	 * SwitchOrder7.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5#mmInvestmentAccountDetails
	 * SubscriptionMultipleExecution5.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmInvestmentAccountDetails
	 * SwitchSubscriptionLegOrder6.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason8#mmInvestmentAccountDetails
	 * IndividualOrderStatusAndReason8.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmInvestmentAccountDetails
	 * SubscriptionExecution12.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmInvestmentAccountDetails
	 * SubscriptionOrder15.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmInvestmentAccountDetails
	 * FundOrderData5.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmInvestmentAccountDetails
	 * SwitchRedemptionLegOrder6.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmInvestmentAccountDetails
	 * RedemptionOrder15.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmInvestmentAccountDetails
	 * RedemptionExecution16.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder8#mmInvestmentAccountDetails
	 * InvestmentFundOrder8.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmInvestmentAccountDetails
	 * SwitchSubscriptionLegExecution4.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmInvestmentAccountDetails
	 * SwitchRedemptionLegExecution4.mmInvestmentAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences2#mmInvestmentAccountDetails
	 * SwitchLegReferences2.mmInvestmentAccountDetails}</li>
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
	public static final MMBusinessAssociationEnd mmInvestmentAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(IndividualOrderStatusAndReason4.mmInvestmentAccountDetails, IndividualOrderConfirmationStatusAndReason1.mmInvestmentAccountDetails,
					InvestmentAccountOrFinancialInstrument1Choice.mmInvestmentAccount, FundOrderData1.mmInvestmentAccountDetails, SwitchLegReferences1.mmInvestmentAccountDetails, PaymentInstrument7Choice.mmAccountDetails,
					RedemptionOrder3.mmInvestmentAccountDetails, RedemptionOrder5.mmInvestmentAccountDetails, RedemptionExecution3.mmInvestmentAccountDetails, RedemptionExecution5.mmInvestmentAccountDetails,
					RedemptionOrder7.mmInvestmentAccountDetails, RedemptionMultipleOrder2.mmInvestmentAccountDetails, RedemptionMultipleOrder3.mmInvestmentAccountDetails, RedemptionMultipleExecution2.mmInvestmentAccountDetails,
					RedemptionMultipleExecution3.mmInvestmentAccountDetails, RedemptionMultipleOrder4.mmInvestmentAccountDetails, InvestmentFundOrder3.mmInvestmentAccountDetails, MessageAndBusinessReference2.mmInvestmentAccount,
					InvestmentFundOrder2.mmInvestmentAccountDetails, PaymentInstrument9Choice.mmAccountDetails, SubscriptionOrder3.mmInvestmentAccountDetails, PaymentInstrument10Choice.mmAccountDetails,
					PaymentInstrument6Choice.mmAccountDetails, PaymentInstrument8Choice.mmAccountDetails, SubscriptionOrder5.mmInvestmentAccountDetails, SubscriptionExecution3.mmInvestmentAccountDetails,
					SubscriptionExecution5.mmInvestmentAccountDetails, SubscriptionOrder7.mmInvestmentAccountDetails, SubscriptionMultipleOrder2.mmInvestmentAccountDetails, SubscriptionMultipleOrder3.mmInvestmentAccountDetails,
					SubscriptionMultipleExecution2.mmInvestmentAccountDetails, SubscriptionMultipleExecution3.mmInvestmentAccountDetails, SubscriptionMultipleOrder4.mmInvestmentAccountDetails, SwitchOrder2.mmInvestmentAccountDetails,
					SwitchRedemptionLegOrder3.mmInvestmentAccountDetails, SwitchSubscriptionLegOrder3.mmInvestmentAccountDetails, SwitchOrder3.mmInvestmentAccountDetails, SwitchExecution3.mmInvestmentAccountDetails,
					SwitchRedemptionLegExecution3.mmInvestmentAccountDetails, SwitchSubscriptionLegExecution3.mmInvestmentAccountDetails, SwitchExecution4.mmInvestmentAccountDetails, SwitchOrder4.mmInvestmentAccountDetails,
					MessageAndBusinessReference1.mmInvestmentAccountDetails, MessageAndBusinessReference6.mmInvestmentAccountDetails, FundOrderData3.mmInvestmentAccountDetails, RedemptionExecution10.mmInvestmentAccountDetails,
					RedemptionOrder9.mmInvestmentAccountDetails, SubscriptionExecution7.mmInvestmentAccountDetails, SubscriptionOrder9.mmInvestmentAccountDetails, SubscriptionExecution8.mmInvestmentAccountDetails,
					RedemptionExecution11.mmInvestmentAccountDetails, SwitchExecutionRedemptionLeg4.mmInvestmentAccountDetails, SwitchExecutionSubscriptionLeg4.mmInvestmentAccountDetails, SwitchExecution5.mmInvestmentAccountDetails,
					SubscriptionOrder10.mmInvestmentAccountDetails, RedemptionOrder10.mmInvestmentAccountDetails, SwitchRedemptionLegOrder4.mmInvestmentAccountDetails, SwitchSubscriptionLegOrder4.mmInvestmentAccountDetails,
					SwitchOrder5.mmInvestmentAccountDetails, RedemptionMultipleOrder5.mmInvestmentAccountDetails, RedemptionMultipleExecution4.mmInvestmentAccountDetails, SubscriptionMultipleOrder5.mmInvestmentAccountDetails,
					SubscriptionMultipleExecution4.mmInvestmentAccountDetails, MessageAndBusinessReference7.mmInvestmentAccountDetails, MessageAndBusinessReference8.mmInvestmentAccountDetails,
					IndividualOrderConfirmationStatusAndReason2.mmInvestmentAccountDetails, SwitchExecution7.mmInvestmentAccountDetails, RedemptionMultipleExecution5.mmInvestmentAccountDetails,
					RedemptionMultipleOrder6.mmInvestmentAccountDetails, SubscriptionMultipleOrder6.mmInvestmentAccountDetails, SwitchOrder7.mmInvestmentAccountDetails, SubscriptionMultipleExecution5.mmInvestmentAccountDetails,
					SwitchSubscriptionLegOrder6.mmInvestmentAccountDetails, IndividualOrderStatusAndReason8.mmInvestmentAccountDetails, SubscriptionExecution12.mmInvestmentAccountDetails, SubscriptionOrder15.mmInvestmentAccountDetails,
					FundOrderData5.mmInvestmentAccountDetails, SwitchRedemptionLegOrder6.mmInvestmentAccountDetails, RedemptionOrder15.mmInvestmentAccountDetails, RedemptionExecution16.mmInvestmentAccountDetails,
					InvestmentFundOrder8.mmInvestmentAccountDetails, SwitchSubscriptionLegExecution4.mmInvestmentAccountDetails, SwitchRedemptionLegExecution4.mmInvestmentAccountDetails, SwitchLegReferences2.mmInvestmentAccountDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccount";
			definition = "Account related to an investment fund transaction.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmInvestmentFundTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentFundClass> investmentFundClass;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentFundTransaction
	 * InvestmentFundClass.mmInvestmentFundTransaction}</li>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason4#mmFinancialInstrumentDetails
	 * IndividualOrderStatusAndReason4.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#mmFinancialInstrumentDetails
	 * IndividualOrderConfirmationStatusAndReason1.mmFinancialInstrumentDetails}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestmentAccountOrFinancialInstrument1Choice#mmFinancialInstrument
	 * InvestmentAccountOrFinancialInstrument1Choice.mmFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1#mmFinancialInstrumentDetails
	 * FundOrderData1.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences1#mmFinancialInstrumentDetails
	 * SwitchLegReferences1.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder2#mmFinancialInstrumentDetails
	 * RedemptionBulkOrder2.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3#mmFinancialInstrumentDetails
	 * RedemptionBulkOrder3.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution2#mmFinancialInstrumentDetails
	 * RedemptionBulkExecution2.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#mmFinancialInstrumentDetails
	 * RedemptionBulkExecution3.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4#mmFinancialInstrumentDetails
	 * RedemptionBulkOrder4.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#mmFinancialInstrumentDetails
	 * RedemptionOrder4.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmFinancialInstrumentDetails
	 * RedemptionOrder6.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmFinancialInstrumentDetails
	 * RedemptionExecution4.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmFinancialInstrumentDetails
	 * RedemptionExecution6.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmFinancialInstrumentDetails
	 * RedemptionOrder8.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder3#mmFinancialInstrumentDetails
	 * InvestmentFundOrder3.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder2#mmFinancialInstrumentDetails
	 * InvestmentFundOrder2.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder2#mmFinancialInstrumentDetails
	 * SubscriptionBulkOrder2.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3#mmFinancialInstrumentDetails
	 * SubscriptionBulkOrder3.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution2#mmFinancialInstrumentDetails
	 * SubscriptionBulkExecution2.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3#mmFinancialInstrumentDetails
	 * SubscriptionBulkExecution3.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4#mmFinancialInstrumentDetails
	 * SubscriptionBulkOrder4.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#mmFinancialInstrumentDetails
	 * SubscriptionOrder4.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmFinancialInstrumentDetails
	 * SubscriptionOrder6.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmFinancialInstrumentDetails
	 * SubscriptionExecution4.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmFinancialInstrumentDetails
	 * SubscriptionExecution6.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmFinancialInstrumentDetails
	 * SubscriptionOrder8.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder2#mmFinancialInstrumentDetails
	 * SwitchRedemptionLegOrder2.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#mmFinancialInstrumentDetails
	 * SwitchSubscriptionLegOrder2.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#mmFinancialInstrumentDetails
	 * SwitchRedemptionLegOrder3.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmFinancialInstrumentDetails
	 * SwitchSubscriptionLegOrder3.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#mmFinancialInstrumentDetails
	 * SwitchSubscriptionLegExecution2.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#mmFinancialInstrumentDetails
	 * SwitchSubscriptionLegExecution3.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData3#mmFinancialInstrumentDetails
	 * FundOrderData3.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3#mmHoldBackDetails
	 * ExpectedExecutionDetails3.mmHoldBackDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmFinancialInstrumentDetails
	 * RedemptionExecution10.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmHoldBackDetails
	 * RedemptionExecution10.mmHoldBackDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#mmFinancialInstrumentDetails
	 * RedemptionOrder9.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmFinancialInstrumentDetails
	 * SubscriptionExecution7.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#mmFinancialInstrumentDetails
	 * SubscriptionOrder9.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution8#mmFinancialInstrumentDetails
	 * SubscriptionExecution8.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution11#mmFinancialInstrumentDetails
	 * RedemptionExecution11.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecutionRedemptionLeg4#mmFinancialInstrumentDetails
	 * SwitchExecutionRedemptionLeg4.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecutionSubscriptionLeg4#mmFinancialInstrumentDetails
	 * SwitchExecutionSubscriptionLeg4.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder10#mmFinancialInstrumentDetails
	 * SubscriptionOrder10.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder10#mmFinancialInstrumentDetails
	 * RedemptionOrder10.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder4#mmFinancialInstrumentDetails
	 * SwitchRedemptionLegOrder4.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder4#mmFinancialInstrumentDetails
	 * SwitchSubscriptionLegOrder4.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#mmFinancialInstrumentDetails
	 * RedemptionOrder11.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmFinancialInstrumentDetails
	 * RedemptionExecution12.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#mmFinancialInstrumentDetails
	 * SubscriptionOrder11.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmFinancialInstrumentDetails
	 * SubscriptionExecution9.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundDetailedConfirmedCashForecastReport3#mmFundOrSubFundDetails
	 * FundDetailedConfirmedCashForecastReport3.mmFundOrSubFundDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#mmFinancialInstrumentDetails
	 * IndividualOrderConfirmationStatusAndReason2.mmFinancialInstrumentDetails}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#mmFinancialInstrumentDetails
	 * SubscriptionBulkOrder5.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmFinancialInstrumentDetails
	 * RedemptionBulkExecution5.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#mmFinancialInstrumentDetails
	 * SubscriptionBulkExecution4.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#mmFinancialInstrumentDetails
	 * RedemptionBulkOrder6.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmFinancialInstrumentDetails
	 * RedemptionOrder14.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#mmGatingOrHoldBackDetails
	 * IndividualOrderStatusAndReason7.mmGatingOrHoldBackDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmFinancialInstrumentDetails
	 * SwitchSubscriptionLegOrder6.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason8#mmFinancialInstrumentDetails
	 * IndividualOrderStatusAndReason8.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmFinancialInstrumentDetails
	 * SubscriptionExecution13.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2#mmFinancialInstrumentIdentification
	 * HoldBackInformation2.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmFinancialInstrumentDetails
	 * FundOrderData5.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmFinancialInstrumentDetails
	 * SwitchRedemptionLegOrder6.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmGatingOrHoldBackDetails
	 * RedemptionExecution16.mmGatingOrHoldBackDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmFinancialInstrumentDetails
	 * SubscriptionOrder14.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder8#mmFinancialInstrumentDetails
	 * InvestmentFundOrder8.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmFinancialInstrumentDetails
	 * SwitchSubscriptionLegExecution4.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmFinancialInstrumentDetails
	 * RedemptionExecution15.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmGatingOrHoldBackDetails
	 * RedemptionExecution15.mmGatingOrHoldBackDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmGatingOrHoldBackDetails
	 * SwitchRedemptionLegExecution4.mmGatingOrHoldBackDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchLegReferences2#mmFinancialInstrumentDetails
	 * SwitchLegReferences2.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation3#mmFinancialInstrumentIdentification
	 * HoldBackInformation3.mmFinancialInstrumentIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmInvestmentFundClass = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(IndividualOrderStatusAndReason4.mmFinancialInstrumentDetails, IndividualOrderConfirmationStatusAndReason1.mmFinancialInstrumentDetails,
					InvestmentAccountOrFinancialInstrument1Choice.mmFinancialInstrument, FundOrderData1.mmFinancialInstrumentDetails, SwitchLegReferences1.mmFinancialInstrumentDetails, RedemptionBulkOrder2.mmFinancialInstrumentDetails,
					RedemptionBulkOrder3.mmFinancialInstrumentDetails, RedemptionBulkExecution2.mmFinancialInstrumentDetails, RedemptionBulkExecution3.mmFinancialInstrumentDetails, RedemptionBulkOrder4.mmFinancialInstrumentDetails,
					RedemptionOrder4.mmFinancialInstrumentDetails, RedemptionOrder6.mmFinancialInstrumentDetails, RedemptionExecution4.mmFinancialInstrumentDetails, RedemptionExecution6.mmFinancialInstrumentDetails,
					RedemptionOrder8.mmFinancialInstrumentDetails, InvestmentFundOrder3.mmFinancialInstrumentDetails, InvestmentFundOrder2.mmFinancialInstrumentDetails, SubscriptionBulkOrder2.mmFinancialInstrumentDetails,
					SubscriptionBulkOrder3.mmFinancialInstrumentDetails, SubscriptionBulkExecution2.mmFinancialInstrumentDetails, SubscriptionBulkExecution3.mmFinancialInstrumentDetails, SubscriptionBulkOrder4.mmFinancialInstrumentDetails,
					SubscriptionOrder4.mmFinancialInstrumentDetails, SubscriptionOrder6.mmFinancialInstrumentDetails, SubscriptionExecution4.mmFinancialInstrumentDetails, SubscriptionExecution6.mmFinancialInstrumentDetails,
					SubscriptionOrder8.mmFinancialInstrumentDetails, SwitchRedemptionLegOrder2.mmFinancialInstrumentDetails, SwitchSubscriptionLegOrder2.mmFinancialInstrumentDetails, SwitchRedemptionLegOrder3.mmFinancialInstrumentDetails,
					SwitchSubscriptionLegOrder3.mmFinancialInstrumentDetails, SwitchSubscriptionLegExecution2.mmFinancialInstrumentDetails, SwitchSubscriptionLegExecution3.mmFinancialInstrumentDetails,
					FundOrderData3.mmFinancialInstrumentDetails, ExpectedExecutionDetails3.mmHoldBackDetails, RedemptionExecution10.mmFinancialInstrumentDetails, RedemptionExecution10.mmHoldBackDetails,
					RedemptionOrder9.mmFinancialInstrumentDetails, SubscriptionExecution7.mmFinancialInstrumentDetails, SubscriptionOrder9.mmFinancialInstrumentDetails, SubscriptionExecution8.mmFinancialInstrumentDetails,
					RedemptionExecution11.mmFinancialInstrumentDetails, SwitchExecutionRedemptionLeg4.mmFinancialInstrumentDetails, SwitchExecutionSubscriptionLeg4.mmFinancialInstrumentDetails,
					SubscriptionOrder10.mmFinancialInstrumentDetails, RedemptionOrder10.mmFinancialInstrumentDetails, SwitchRedemptionLegOrder4.mmFinancialInstrumentDetails, SwitchSubscriptionLegOrder4.mmFinancialInstrumentDetails,
					RedemptionOrder11.mmFinancialInstrumentDetails, RedemptionExecution12.mmFinancialInstrumentDetails, SubscriptionOrder11.mmFinancialInstrumentDetails, SubscriptionExecution9.mmFinancialInstrumentDetails,
					FundDetailedConfirmedCashForecastReport3.mmFundOrSubFundDetails, IndividualOrderConfirmationStatusAndReason2.mmFinancialInstrumentDetails, SubscriptionBulkOrder5.mmFinancialInstrumentDetails,
					RedemptionBulkExecution5.mmFinancialInstrumentDetails, SubscriptionBulkExecution4.mmFinancialInstrumentDetails, RedemptionBulkOrder6.mmFinancialInstrumentDetails, RedemptionOrder14.mmFinancialInstrumentDetails,
					IndividualOrderStatusAndReason7.mmGatingOrHoldBackDetails, SwitchSubscriptionLegOrder6.mmFinancialInstrumentDetails, IndividualOrderStatusAndReason8.mmFinancialInstrumentDetails,
					SubscriptionExecution13.mmFinancialInstrumentDetails, HoldBackInformation2.mmFinancialInstrumentIdentification, FundOrderData5.mmFinancialInstrumentDetails, SwitchRedemptionLegOrder6.mmFinancialInstrumentDetails,
					RedemptionExecution16.mmGatingOrHoldBackDetails, SubscriptionOrder14.mmFinancialInstrumentDetails, InvestmentFundOrder8.mmFinancialInstrumentDetails, SwitchSubscriptionLegExecution4.mmFinancialInstrumentDetails,
					RedemptionExecution15.mmFinancialInstrumentDetails, RedemptionExecution15.mmGatingOrHoldBackDetails, SwitchRedemptionLegExecution4.mmGatingOrHoldBackDetails, SwitchLegReferences2.mmFinancialInstrumentDetails,
					HoldBackInformation3.mmFinancialInstrumentIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundClass";
			definition = "Investment fund class to which an investment fund order and its execution are related.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmInvestmentFundTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
		}
	};
	protected InvestmentFundTax transactionTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmTransaction
	 * InvestmentFundTax.mmTransaction}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#mmTaxDetails
	 * RedemptionOrder3.mmTaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmTaxDetails
	 * RedemptionOrder5.mmTaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmTaxGeneralDetails
	 * RedemptionExecution3.mmTaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmTaxGeneralDetails
	 * RedemptionExecution5.mmTaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmTaxDetails
	 * RedemptionOrder7.mmTaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#mmTaxDetails
	 * RedemptionOrder4.mmTaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmTaxDetails
	 * RedemptionOrder6.mmTaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmTaxGeneralDetails
	 * RedemptionExecution4.mmTaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmTaxGeneralDetails
	 * RedemptionExecution6.mmTaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmTaxDetails
	 * RedemptionOrder8.mmTaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmTaxDetails
	 * SubscriptionOrder3.mmTaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmTaxDetails
	 * SubscriptionOrder5.mmTaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmTaxGeneralDetails
	 * SubscriptionExecution3.mmTaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmTaxGeneralDetails
	 * SubscriptionExecution5.mmTaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmTaxDetails
	 * SubscriptionOrder7.mmTaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#mmTaxDetails
	 * SubscriptionOrder4.mmTaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmTaxDetails
	 * SubscriptionOrder6.mmTaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmTaxGeneralDetails
	 * SubscriptionExecution4.mmTaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmTaxGeneralDetails
	 * SubscriptionExecution6.mmTaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmTaxDetails
	 * SubscriptionOrder8.mmTaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder2#mmTaxDetails
	 * SwitchRedemptionLegOrder2.mmTaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#mmTaxDetails
	 * SwitchSubscriptionLegOrder2.mmTaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#mmTaxDetails
	 * SwitchRedemptionLegOrder3.mmTaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmTaxDetails
	 * SwitchSubscriptionLegOrder3.mmTaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#mmTaxGeneralDetails
	 * SwitchRedemptionLegExecution2.mmTaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#mmTaxGeneralDetails
	 * SwitchSubscriptionLegExecution2.mmTaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#mmTaxGeneralDetails
	 * SwitchRedemptionLegExecution3.mmTaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#mmTaxGeneralDetails
	 * SwitchSubscriptionLegExecution3.mmTaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmTaxGeneralDetails
	 * RedemptionExecution10.mmTaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#mmTaxDetails
	 * RedemptionOrder9.mmTaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmTaxGeneralDetails
	 * SubscriptionExecution7.mmTaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#mmTaxDetails
	 * SubscriptionOrder9.mmTaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmTaxGeneralDetails
	 * RedemptionExecution12.mmTaxGeneralDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmTaxGeneralDetails
	 * SubscriptionExecution9.mmTaxGeneralDetails}</li>
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
	public static final MMBusinessAssociationEnd mmTransactionTax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(RedemptionOrder3.mmTaxDetails, RedemptionOrder5.mmTaxDetails, RedemptionExecution3.mmTaxGeneralDetails, RedemptionExecution5.mmTaxGeneralDetails, RedemptionOrder7.mmTaxDetails,
					RedemptionOrder4.mmTaxDetails, RedemptionOrder6.mmTaxDetails, RedemptionExecution4.mmTaxGeneralDetails, RedemptionExecution6.mmTaxGeneralDetails, RedemptionOrder8.mmTaxDetails, SubscriptionOrder3.mmTaxDetails,
					SubscriptionOrder5.mmTaxDetails, SubscriptionExecution3.mmTaxGeneralDetails, SubscriptionExecution5.mmTaxGeneralDetails, SubscriptionOrder7.mmTaxDetails, SubscriptionOrder4.mmTaxDetails, SubscriptionOrder6.mmTaxDetails,
					SubscriptionExecution4.mmTaxGeneralDetails, SubscriptionExecution6.mmTaxGeneralDetails, SubscriptionOrder8.mmTaxDetails, SwitchRedemptionLegOrder2.mmTaxDetails, SwitchSubscriptionLegOrder2.mmTaxDetails,
					SwitchRedemptionLegOrder3.mmTaxDetails, SwitchSubscriptionLegOrder3.mmTaxDetails, SwitchRedemptionLegExecution2.mmTaxGeneralDetails, SwitchSubscriptionLegExecution2.mmTaxGeneralDetails,
					SwitchRedemptionLegExecution3.mmTaxGeneralDetails, SwitchSubscriptionLegExecution3.mmTaxGeneralDetails, RedemptionExecution10.mmTaxGeneralDetails, RedemptionOrder9.mmTaxDetails,
					SubscriptionExecution7.mmTaxGeneralDetails, SubscriptionOrder9.mmTaxDetails, RedemptionExecution12.mmTaxGeneralDetails, SubscriptionExecution9.mmTaxGeneralDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionTax";
			definition = "Tax applicable to an investment fund order and/or to its execution.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTax.mmTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTax.mmObject();
		}
	};
	protected DebitCreditCode creditDebitIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#mmCreditDebit
	 * InvestmentFundTransaction2.mmCreditDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmCreditDebit
	 * InvestmentFundTransaction3.mmCreditDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmCreditDebit
	 * InvestmentFundTransaction4.mmCreditDebit}</li>
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
	public static final MMBusinessAttribute mmCreditDebitIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentFundTransaction2.mmCreditDebit, InvestmentFundTransaction3.mmCreditDebit, InvestmentFundTransaction4.mmCreditDebit);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Direction of the transaction, ie, securities are received (credited) or delivered (debited).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundTransaction.class.getMethod("getCreditDebitIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentFundOrderExecution> investmentFundOrderExecution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmInvestmentFundTransaction
	 * InvestmentFundOrderExecution.mmInvestmentFundTransaction}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#mmAssets
	 * PEPISACashTransfer2.mmAssets}</li>
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
	public static final MMBusinessAssociationEnd mmInvestmentFundOrderExecution = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PEPISACashTransfer2.mmAssets);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundOrderExecution";
			definition = "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmInvestmentFundTransaction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundTransaction";
				definition = "Process of buying, selling, switching or transferring fund units.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.mmInvestmentFundTransaction, com.tools20022.repository.entity.InvestmentAccount.mmInvestmentFundTransaction,
						com.tools20022.repository.entity.InvestmentFundTax.mmTransaction, com.tools20022.repository.entity.InvestmentFundOrder.mmRelatedTransaction,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmInvestmentFundTransaction, com.tools20022.repository.entity.Charges.mmInvestmentFundTransaction);
				derivationElement_lazy = () -> Arrays.asList(InvestmentFundTransactionsByFund1.mmTransactionDetails, InvestmentFundTransaction4.mmEventType);
				superType_lazy = () -> SecuritiesTrade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentFundOrder, com.tools20022.repository.entity.InvestmentFundTransaction.mmClientReference,
						com.tools20022.repository.entity.InvestmentFundTransaction.mmType, com.tools20022.repository.entity.InvestmentFundTransaction.mmTransactionCharge,
						com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentAccount, com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentFundClass,
						com.tools20022.repository.entity.InvestmentFundTransaction.mmTransactionTax, com.tools20022.repository.entity.InvestmentFundTransaction.mmCreditDebitIndicator,
						com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentFundOrderExecution);
				derivationComponent_lazy = () -> Arrays.asList(InvestmentFundTransactionInType1.mmObject(), InvestmentAccountOrFinancialInstrument1Choice.mmObject(), TransactionType1CodeChoice.mmObject(),
						InvestmentFundTransaction2.mmObject(), InvestmentFundTransactionsByFund1.mmObject(), InvestmentFundTransaction3.mmObject(), InvestmentFundTransactionsByFund2.mmObject(),
						SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.mmObject(), SubscriptionOrRedemptionOrSwitchOrderDataChoice.mmObject(), InvestmentFundTransactionsByFund3.mmObject(), InvestmentFundTransaction4.mmObject(),
						TransactionType1Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvestmentFundTransaction.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<InvestmentFundOrder> getInvestmentFundOrder() {
		return investmentFundOrder == null ? investmentFundOrder = new ArrayList<>() : investmentFundOrder;
	}

	public InvestmentFundTransaction setInvestmentFundOrder(List<com.tools20022.repository.entity.InvestmentFundOrder> investmentFundOrder) {
		this.investmentFundOrder = Objects.requireNonNull(investmentFundOrder);
		return this;
	}

	public Max35Text getClientReference() {
		return clientReference;
	}

	public InvestmentFundTransaction setClientReference(Max35Text clientReference) {
		this.clientReference = Objects.requireNonNull(clientReference);
		return this;
	}

	public InvestmentFundTransactionTypeCode getType() {
		return type;
	}

	public InvestmentFundTransaction setType(InvestmentFundTransactionTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Charges getTransactionCharge() {
		return transactionCharge;
	}

	public InvestmentFundTransaction setTransactionCharge(com.tools20022.repository.entity.Charges transactionCharge) {
		this.transactionCharge = Objects.requireNonNull(transactionCharge);
		return this;
	}

	public List<InvestmentAccount> getInvestmentAccount() {
		return investmentAccount == null ? investmentAccount = new ArrayList<>() : investmentAccount;
	}

	public InvestmentFundTransaction setInvestmentAccount(List<com.tools20022.repository.entity.InvestmentAccount> investmentAccount) {
		this.investmentAccount = Objects.requireNonNull(investmentAccount);
		return this;
	}

	public List<InvestmentFundClass> getInvestmentFundClass() {
		return investmentFundClass == null ? investmentFundClass = new ArrayList<>() : investmentFundClass;
	}

	public InvestmentFundTransaction setInvestmentFundClass(List<com.tools20022.repository.entity.InvestmentFundClass> investmentFundClass) {
		this.investmentFundClass = Objects.requireNonNull(investmentFundClass);
		return this;
	}

	public InvestmentFundTax getTransactionTax() {
		return transactionTax;
	}

	public InvestmentFundTransaction setTransactionTax(com.tools20022.repository.entity.InvestmentFundTax transactionTax) {
		this.transactionTax = Objects.requireNonNull(transactionTax);
		return this;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public InvestmentFundTransaction setCreditDebitIndicator(DebitCreditCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public List<InvestmentFundOrderExecution> getInvestmentFundOrderExecution() {
		return investmentFundOrderExecution == null ? investmentFundOrderExecution = new ArrayList<>() : investmentFundOrderExecution;
	}

	public InvestmentFundTransaction setInvestmentFundOrderExecution(List<com.tools20022.repository.entity.InvestmentFundOrderExecution> investmentFundOrderExecution) {
		this.investmentFundOrderExecution = Objects.requireNonNull(investmentFundOrderExecution);
		return this;
	}
}