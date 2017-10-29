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
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Order placed by an investor to buy or sell an asset at a price specified or
 * not.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Order" src="doc-files/Order.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Order#Trade Order.Trade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Order#MasterIdentification
 * Order.MasterIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#Order Trade.Order}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder
 * SecuritiesOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PurchaseOrder PurchaseOrder}
 * </li>
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
 * "Order"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Order placed by an investor to buy or sell an asset at a price specified or not."
 * </li>
 * </ul>
 */
public class Order {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Agreement between two parties to buy and sell assets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Trade#Order
	 * Trade.Order}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Order
	 * Order}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agreement between two parties to buy and sell assets."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Trade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Order.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Agreement between two parties to buy and sell assets.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.Order;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Unique and unambiguous identifier for a group of individual orders, as
	 * assigned by the instructing party. This identifier links the individual
	 * orders together.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder4#MasterReference
	 * InvestmentFundOrder4.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer6#MasterReference
	 * PEPISATransfer6.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer4#MasterReference
	 * ISATransfer4.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer6#MasterReference
	 * ISATransfer6.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer8#MasterReference
	 * PEPISATransfer8.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference3#MasterReference
	 * TransferReference3.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer3#MasterReference
	 * ISATransfer3.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer8#MasterReference
	 * ISATransfer8.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer4#MasterReference
	 * PEPISATransfer4.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer2#MasterReference
	 * ISATransfer2.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer10#MasterReference
	 * ISATransfer10.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer3#MasterReference
	 * PEPISATransfer3.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer1#MasterReference
	 * ISATransfer1.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer7#MasterReference
	 * ISATransfer7.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference2#MasterReference
	 * TransferReference2.MasterReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer7#MasterReference
	 * Transfer7.MasterReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer10#MasterReference
	 * Transfer10.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference1#MasterReference
	 * TransferReference1.MasterReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer6#MasterReference
	 * Transfer6.MasterReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer9#MasterReference
	 * Transfer9.MasterReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer5#MasterReference
	 * Transfer5.MasterReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer8#MasterReference
	 * Transfer8.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification2#MasterIdentification
	 * Identification2.MasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason8#MasterReference
	 * OrderStatusAndReason8.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason4#MasterReference
	 * IndividualOrderStatusAndReason4.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#MasterReference
	 * IndividualOrderConfirmationStatusAndReason1.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#MasterReference
	 * OrderStatusAndReason7.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#MasterReference
	 * IndividualOrderStatusAndReason2.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#MasterReference
	 * SwitchOrderStatusAndReason1.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder1#MasterReference
	 * InvestmentFundOrder1.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3#MasterReference
	 * RedemptionBulkOrder3.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#MasterReference
	 * RedemptionBulkExecution3.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution1#MasterReference
	 * InvestmentFundOrderExecution1.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4#MasterReference
	 * RedemptionBulkOrder4.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3#MasterReference
	 * RedemptionMultipleOrder3.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#MasterReference
	 * RedemptionMultipleExecution3.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4#MasterReference
	 * RedemptionMultipleOrder4.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder3#MasterReference
	 * InvestmentFundOrder3.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder2#MasterReference
	 * InvestmentFundOrder2.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#MasterReference
	 * InvestmentFundTransaction2.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#MasterReference
	 * InvestmentFundTransaction3.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3#MasterReference
	 * SubscriptionBulkOrder3.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3#MasterReference
	 * SubscriptionBulkExecution3.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4#MasterReference
	 * SubscriptionBulkOrder4.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder3#MasterReference
	 * SubscriptionMultipleOrder3.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution3#MasterReference
	 * SubscriptionMultipleExecution3.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#MasterReference
	 * SubscriptionMultipleOrder4.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#MasterReference
	 * SwitchOrder3.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#MasterReference
	 * SwitchExecution4.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#MasterReference
	 * SwitchOrder4.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference6#MasterReference
	 * MessageAndBusinessReference6.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason2#MasterReference
	 * CancellationStatusAndReason2.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#MasterReference
	 * TransferStatusAndReason2.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer5#MasterReference
	 * PEPISATransfer5.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer5#MasterReference
	 * ISATransfer5.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification7#MasterIdentification
	 * Identification7.MasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification6#MasterIdentification
	 * Identification6.MasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification5#MasterIdentification
	 * Identification5.MasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification8#MasterIdentification
	 * Identification8.MasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification11#MasterIdentification
	 * Identification11.MasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification13#MasterIdentification
	 * Identification13.MasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification9#MasterIdentification
	 * Identification9.MasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3#MasterReference
	 * IndividualOrderStatusAndReason3.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#MasterReference
	 * RedemptionExecution10.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#MasterReference
	 * RedemptionOrder9.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#MasterReference
	 * SubscriptionExecution7.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#MasterReference
	 * SubscriptionOrder9.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution3#MasterReference
	 * InvestmentFundOrderExecution3.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder6#MasterReference
	 * InvestmentFundOrder6.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason5#MasterReference
	 * IndividualOrderStatusAndReason5.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder5#MasterReference
	 * RedemptionMultipleOrder5.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution4#MasterReference
	 * RedemptionMultipleExecution4.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder5#MasterReference
	 * SubscriptionMultipleOrder5.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution4#MasterReference
	 * SubscriptionMultipleExecution4.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification3#MasterIdentification
	 * Identification3.MasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn10#MasterReference
	 * TransferIn10.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn9#MasterReference
	 * TransferIn9.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut11#MasterReference
	 * TransferOut11.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut12#MasterReference
	 * TransferOut12.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference7#MasterReference
	 * MessageAndBusinessReference7.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer16#MasterReference
	 * ISATransfer16.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer13#MasterReference
	 * ISATransfer13.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason3#MasterReference
	 * TransferStatusAndReason3.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference5#MasterReference
	 * TransferReference5.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference6#MasterReference
	 * TransferReference6.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference7#MasterReference
	 * TransferReference7.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#MasterReference
	 * InvestmentFundTransaction4.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn13#MasterReference
	 * TransferIn13.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut14#MasterReference
	 * TransferOut14.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn12#MasterReference
	 * TransferIn12.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut15#MasterReference
	 * TransferOut15.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#MasterIdentification
	 * Identification15.MasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason3#MasterReference
	 * CancellationStatusAndReason3.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference8#MasterReference
	 * MessageAndBusinessReference8.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason4#MasterReference
	 * TransferStatusAndReason4.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut17#MasterReference
	 * TransferOut17.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference9#MasterReference
	 * TransferReference9.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn14#MasterReference
	 * TransferIn14.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference10#MasterReference
	 * TransferReference10.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn15#MasterReference
	 * TransferIn15.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut16#MasterReference
	 * TransferOut16.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification24#MasterIdentification
	 * Identification24.MasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#MasterReference
	 * IndividualOrderConfirmationStatusAndReason2.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#MasterReference
	 * SwitchExecution7.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#MasterReference
	 * SubscriptionBulkOrder5.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#MasterReference
	 * RedemptionBulkExecution5.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#MasterReference
	 * RedemptionMultipleExecution5.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#MasterReference
	 * RedemptionMultipleOrder6.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#MasterReference
	 * SubscriptionMultipleOrder6.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#MasterReference
	 * SubscriptionBulkExecution4.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#MasterReference
	 * SwitchOrder7.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#MasterReference
	 * RedemptionBulkOrder6.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5#MasterReference
	 * SubscriptionMultipleExecution5.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#MasterReference
	 * IndividualOrderStatusAndReason7.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#MasterReference
	 * SwitchOrderStatusAndReason2.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason10#MasterReference
	 * OrderStatusAndReason10.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason9#MasterReference
	 * OrderStatusAndReason9.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason8#MasterReference
	 * IndividualOrderStatusAndReason8.MasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder8#MasterReference
	 * InvestmentFundOrder8.MasterReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Order
	 * Order}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a group of individual orders, as assigned by the instructing party. This identifier links the individual orders together."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MasterIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentFundOrder4.MasterReference, com.tools20022.repository.msg.PEPISATransfer6.MasterReference,
					com.tools20022.repository.msg.ISATransfer4.MasterReference, com.tools20022.repository.msg.ISATransfer6.MasterReference, com.tools20022.repository.msg.PEPISATransfer8.MasterReference,
					com.tools20022.repository.msg.TransferReference3.MasterReference, com.tools20022.repository.msg.ISATransfer3.MasterReference, com.tools20022.repository.msg.ISATransfer8.MasterReference,
					com.tools20022.repository.msg.PEPISATransfer4.MasterReference, com.tools20022.repository.msg.ISATransfer2.MasterReference, com.tools20022.repository.msg.ISATransfer10.MasterReference,
					com.tools20022.repository.msg.PEPISATransfer3.MasterReference, com.tools20022.repository.msg.ISATransfer1.MasterReference, com.tools20022.repository.msg.ISATransfer7.MasterReference,
					com.tools20022.repository.msg.TransferReference2.MasterReference, com.tools20022.repository.msg.Transfer7.MasterReference, com.tools20022.repository.msg.Transfer10.MasterReference,
					com.tools20022.repository.msg.TransferReference1.MasterReference, com.tools20022.repository.msg.Transfer6.MasterReference, com.tools20022.repository.msg.Transfer9.MasterReference,
					com.tools20022.repository.msg.Transfer5.MasterReference, com.tools20022.repository.msg.Transfer8.MasterReference, com.tools20022.repository.msg.Identification2.MasterIdentification,
					com.tools20022.repository.msg.OrderStatusAndReason8.MasterReference, com.tools20022.repository.msg.IndividualOrderStatusAndReason4.MasterReference,
					com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.MasterReference, com.tools20022.repository.msg.OrderStatusAndReason7.MasterReference,
					com.tools20022.repository.msg.IndividualOrderStatusAndReason2.MasterReference, com.tools20022.repository.msg.SwitchOrderStatusAndReason1.MasterReference,
					com.tools20022.repository.msg.InvestmentFundOrder1.MasterReference, com.tools20022.repository.msg.RedemptionBulkOrder3.MasterReference, com.tools20022.repository.msg.RedemptionBulkExecution3.MasterReference,
					com.tools20022.repository.msg.InvestmentFundOrderExecution1.MasterReference, com.tools20022.repository.msg.RedemptionBulkOrder4.MasterReference, com.tools20022.repository.msg.RedemptionMultipleOrder3.MasterReference,
					com.tools20022.repository.msg.RedemptionMultipleExecution3.MasterReference, com.tools20022.repository.msg.RedemptionMultipleOrder4.MasterReference, com.tools20022.repository.msg.InvestmentFundOrder3.MasterReference,
					com.tools20022.repository.msg.InvestmentFundOrder2.MasterReference, com.tools20022.repository.msg.InvestmentFundTransaction2.MasterReference, com.tools20022.repository.msg.InvestmentFundTransaction3.MasterReference,
					com.tools20022.repository.msg.SubscriptionBulkOrder3.MasterReference, com.tools20022.repository.msg.SubscriptionBulkExecution3.MasterReference, com.tools20022.repository.msg.SubscriptionBulkOrder4.MasterReference,
					com.tools20022.repository.msg.SubscriptionMultipleOrder3.MasterReference, com.tools20022.repository.msg.SubscriptionMultipleExecution3.MasterReference,
					com.tools20022.repository.msg.SubscriptionMultipleOrder4.MasterReference, com.tools20022.repository.msg.SwitchOrder3.MasterReference, com.tools20022.repository.msg.SwitchExecution4.MasterReference,
					com.tools20022.repository.msg.SwitchOrder4.MasterReference, com.tools20022.repository.msg.MessageAndBusinessReference6.MasterReference, com.tools20022.repository.msg.CancellationStatusAndReason2.MasterReference,
					com.tools20022.repository.msg.TransferStatusAndReason2.MasterReference, com.tools20022.repository.msg.PEPISATransfer5.MasterReference, com.tools20022.repository.msg.ISATransfer5.MasterReference,
					com.tools20022.repository.msg.Identification7.MasterIdentification, com.tools20022.repository.msg.Identification6.MasterIdentification, com.tools20022.repository.msg.Identification5.MasterIdentification,
					com.tools20022.repository.msg.Identification8.MasterIdentification, com.tools20022.repository.msg.Identification11.MasterIdentification, com.tools20022.repository.msg.Identification13.MasterIdentification,
					com.tools20022.repository.msg.Identification9.MasterIdentification, com.tools20022.repository.msg.IndividualOrderStatusAndReason3.MasterReference, com.tools20022.repository.msg.RedemptionExecution10.MasterReference,
					com.tools20022.repository.msg.RedemptionOrder9.MasterReference, com.tools20022.repository.msg.SubscriptionExecution7.MasterReference, com.tools20022.repository.msg.SubscriptionOrder9.MasterReference,
					com.tools20022.repository.msg.InvestmentFundOrderExecution3.MasterReference, com.tools20022.repository.msg.InvestmentFundOrder6.MasterReference,
					com.tools20022.repository.msg.IndividualOrderStatusAndReason5.MasterReference, com.tools20022.repository.msg.RedemptionMultipleOrder5.MasterReference,
					com.tools20022.repository.msg.RedemptionMultipleExecution4.MasterReference, com.tools20022.repository.msg.SubscriptionMultipleOrder5.MasterReference,
					com.tools20022.repository.msg.SubscriptionMultipleExecution4.MasterReference, com.tools20022.repository.msg.Identification3.MasterIdentification, com.tools20022.repository.msg.TransferIn10.MasterReference,
					com.tools20022.repository.msg.TransferIn9.MasterReference, com.tools20022.repository.msg.TransferOut11.MasterReference, com.tools20022.repository.msg.TransferOut12.MasterReference,
					com.tools20022.repository.msg.MessageAndBusinessReference7.MasterReference, com.tools20022.repository.msg.ISATransfer16.MasterReference, com.tools20022.repository.msg.ISATransfer13.MasterReference,
					com.tools20022.repository.msg.TransferStatusAndReason3.MasterReference, com.tools20022.repository.msg.TransferReference5.MasterReference, com.tools20022.repository.msg.TransferReference6.MasterReference,
					com.tools20022.repository.msg.TransferReference7.MasterReference, com.tools20022.repository.msg.InvestmentFundTransaction4.MasterReference, com.tools20022.repository.msg.TransferIn13.MasterReference,
					com.tools20022.repository.msg.TransferOut14.MasterReference, com.tools20022.repository.msg.TransferIn12.MasterReference, com.tools20022.repository.msg.TransferOut15.MasterReference,
					com.tools20022.repository.msg.Identification15.MasterIdentification, com.tools20022.repository.msg.CancellationStatusAndReason3.MasterReference,
					com.tools20022.repository.msg.MessageAndBusinessReference8.MasterReference, com.tools20022.repository.msg.TransferStatusAndReason4.MasterReference, com.tools20022.repository.msg.TransferOut17.MasterReference,
					com.tools20022.repository.msg.TransferReference9.MasterReference, com.tools20022.repository.msg.TransferIn14.MasterReference, com.tools20022.repository.msg.TransferReference10.MasterReference,
					com.tools20022.repository.msg.TransferIn15.MasterReference, com.tools20022.repository.msg.TransferOut16.MasterReference, com.tools20022.repository.msg.Identification24.MasterIdentification,
					com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2.MasterReference, com.tools20022.repository.msg.SwitchExecution7.MasterReference,
					com.tools20022.repository.msg.SubscriptionBulkOrder5.MasterReference, com.tools20022.repository.msg.RedemptionBulkExecution5.MasterReference, com.tools20022.repository.msg.RedemptionMultipleExecution5.MasterReference,
					com.tools20022.repository.msg.RedemptionMultipleOrder6.MasterReference, com.tools20022.repository.msg.SubscriptionMultipleOrder6.MasterReference, com.tools20022.repository.msg.SubscriptionBulkExecution4.MasterReference,
					com.tools20022.repository.msg.SwitchOrder7.MasterReference, com.tools20022.repository.msg.RedemptionBulkOrder6.MasterReference, com.tools20022.repository.msg.SubscriptionMultipleExecution5.MasterReference,
					com.tools20022.repository.msg.IndividualOrderStatusAndReason7.MasterReference, com.tools20022.repository.msg.SwitchOrderStatusAndReason2.MasterReference,
					com.tools20022.repository.msg.OrderStatusAndReason10.MasterReference, com.tools20022.repository.msg.OrderStatusAndReason9.MasterReference, com.tools20022.repository.msg.IndividualOrderStatusAndReason8.MasterReference,
					com.tools20022.repository.msg.InvestmentFundOrder8.MasterReference);
			elementContext_lazy = () -> Order.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MasterIdentification";
			definition = "Unique and unambiguous identifier for a group of individual orders, as assigned by the instructing party. This identifier links the individual orders together.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Order";
				definition = "Order placed by an investor to buy or sell an asset at a price specified or not.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.Order);
				subType_lazy = () -> Arrays.asList(SecuritiesOrder.mmObject(), PurchaseOrder.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Order.Trade, com.tools20022.repository.entity.Order.MasterIdentification);
			}
		});
		return mmObject_lazy.get();
	}
}