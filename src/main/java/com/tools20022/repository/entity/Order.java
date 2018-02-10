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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

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
 * <li>{@linkplain com.tools20022.repository.entity.Order#mmTrade Order.mmTrade}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Order#mmMasterIdentification
 * Order.mmMasterIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmOrder Trade.mmOrder}
 * </li>
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
	protected Trade trade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Trade#mmOrder
	 * Trade.mmOrder}</li>
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
	public static final MMBusinessAssociationEnd mmTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Order.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Agreement between two parties to buy and sell assets.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.mmOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};
	protected Max35Text masterIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder4#mmMasterReference
	 * InvestmentFundOrder4.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer6#mmMasterReference
	 * PEPISATransfer6.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer4#mmMasterReference
	 * ISATransfer4.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer6#mmMasterReference
	 * ISATransfer6.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer8#mmMasterReference
	 * PEPISATransfer8.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference3#mmMasterReference
	 * TransferReference3.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer3#mmMasterReference
	 * ISATransfer3.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer8#mmMasterReference
	 * ISATransfer8.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer4#mmMasterReference
	 * PEPISATransfer4.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer2#mmMasterReference
	 * ISATransfer2.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer10#mmMasterReference
	 * ISATransfer10.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer3#mmMasterReference
	 * PEPISATransfer3.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer1#mmMasterReference
	 * ISATransfer1.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer7#mmMasterReference
	 * ISATransfer7.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference2#mmMasterReference
	 * TransferReference2.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer7#mmMasterReference
	 * Transfer7.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer10#mmMasterReference
	 * Transfer10.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference1#mmMasterReference
	 * TransferReference1.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer6#mmMasterReference
	 * Transfer6.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer9#mmMasterReference
	 * Transfer9.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer5#mmMasterReference
	 * Transfer5.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer8#mmMasterReference
	 * Transfer8.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification2#mmMasterIdentification
	 * Identification2.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason8#mmMasterReference
	 * OrderStatusAndReason8.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason4#mmMasterReference
	 * IndividualOrderStatusAndReason4.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#mmMasterReference
	 * IndividualOrderConfirmationStatusAndReason1.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7#mmMasterReference
	 * OrderStatusAndReason7.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#mmMasterReference
	 * IndividualOrderStatusAndReason2.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmMasterReference
	 * SwitchOrderStatusAndReason1.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder1#mmMasterReference
	 * InvestmentFundOrder1.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3#mmMasterReference
	 * RedemptionBulkOrder3.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#mmMasterReference
	 * RedemptionBulkExecution3.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution1#mmMasterReference
	 * InvestmentFundOrderExecution1.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4#mmMasterReference
	 * RedemptionBulkOrder4.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3#mmMasterReference
	 * RedemptionMultipleOrder3.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#mmMasterReference
	 * RedemptionMultipleExecution3.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4#mmMasterReference
	 * RedemptionMultipleOrder4.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder3#mmMasterReference
	 * InvestmentFundOrder3.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder2#mmMasterReference
	 * InvestmentFundOrder2.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#mmMasterReference
	 * InvestmentFundTransaction2.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmMasterReference
	 * InvestmentFundTransaction3.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3#mmMasterReference
	 * SubscriptionBulkOrder3.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3#mmMasterReference
	 * SubscriptionBulkExecution3.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4#mmMasterReference
	 * SubscriptionBulkOrder4.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder3#mmMasterReference
	 * SubscriptionMultipleOrder3.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution3#mmMasterReference
	 * SubscriptionMultipleExecution3.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#mmMasterReference
	 * SubscriptionMultipleOrder4.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#mmMasterReference
	 * SwitchOrder3.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#mmMasterReference
	 * SwitchExecution4.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#mmMasterReference
	 * SwitchOrder4.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference6#mmMasterReference
	 * MessageAndBusinessReference6.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason2#mmMasterReference
	 * CancellationStatusAndReason2.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmMasterReference
	 * TransferStatusAndReason2.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer5#mmMasterReference
	 * PEPISATransfer5.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer5#mmMasterReference
	 * ISATransfer5.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification7#mmMasterIdentification
	 * Identification7.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification6#mmMasterIdentification
	 * Identification6.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification5#mmMasterIdentification
	 * Identification5.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification8#mmMasterIdentification
	 * Identification8.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification11#mmMasterIdentification
	 * Identification11.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification13#mmMasterIdentification
	 * Identification13.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification9#mmMasterIdentification
	 * Identification9.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3#mmMasterReference
	 * IndividualOrderStatusAndReason3.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmMasterReference
	 * RedemptionExecution10.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#mmMasterReference
	 * RedemptionOrder9.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmMasterReference
	 * SubscriptionExecution7.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#mmMasterReference
	 * SubscriptionOrder9.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution3#mmMasterReference
	 * InvestmentFundOrderExecution3.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder6#mmMasterReference
	 * InvestmentFundOrder6.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason5#mmMasterReference
	 * IndividualOrderStatusAndReason5.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder5#mmMasterReference
	 * RedemptionMultipleOrder5.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution4#mmMasterReference
	 * RedemptionMultipleExecution4.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder5#mmMasterReference
	 * SubscriptionMultipleOrder5.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution4#mmMasterReference
	 * SubscriptionMultipleExecution4.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification3#mmMasterIdentification
	 * Identification3.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn10#mmMasterReference
	 * TransferIn10.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn9#mmMasterReference
	 * TransferIn9.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut11#mmMasterReference
	 * TransferOut11.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut12#mmMasterReference
	 * TransferOut12.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference7#mmMasterReference
	 * MessageAndBusinessReference7.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer16#mmMasterReference
	 * ISATransfer16.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer13#mmMasterReference
	 * ISATransfer13.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason3#mmMasterReference
	 * TransferStatusAndReason3.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference5#mmMasterReference
	 * TransferReference5.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference6#mmMasterReference
	 * TransferReference6.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference7#mmMasterReference
	 * TransferReference7.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmMasterReference
	 * InvestmentFundTransaction4.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn13#mmMasterReference
	 * TransferIn13.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut14#mmMasterReference
	 * TransferOut14.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn12#mmMasterReference
	 * TransferIn12.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut15#mmMasterReference
	 * TransferOut15.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#mmMasterIdentification
	 * Identification15.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason3#mmMasterReference
	 * CancellationStatusAndReason3.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference8#mmMasterReference
	 * MessageAndBusinessReference8.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason4#mmMasterReference
	 * TransferStatusAndReason4.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut17#mmMasterReference
	 * TransferOut17.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference9#mmMasterReference
	 * TransferReference9.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn14#mmMasterReference
	 * TransferIn14.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferReference10#mmMasterReference
	 * TransferReference10.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferIn15#mmMasterReference
	 * TransferIn15.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferOut16#mmMasterReference
	 * TransferOut16.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification24#mmMasterIdentification
	 * Identification24.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#mmMasterReference
	 * IndividualOrderConfirmationStatusAndReason2.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmMasterReference
	 * SwitchExecution7.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#mmMasterReference
	 * SubscriptionBulkOrder5.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmMasterReference
	 * RedemptionBulkExecution5.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmMasterReference
	 * RedemptionMultipleExecution5.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmMasterReference
	 * RedemptionMultipleOrder6.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmMasterReference
	 * SubscriptionMultipleOrder6.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#mmMasterReference
	 * SubscriptionBulkExecution4.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmMasterReference
	 * SwitchOrder7.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#mmMasterReference
	 * RedemptionBulkOrder6.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5#mmMasterReference
	 * SubscriptionMultipleExecution5.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#mmMasterReference
	 * IndividualOrderStatusAndReason7.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmMasterReference
	 * SwitchOrderStatusAndReason2.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason10#mmMasterReference
	 * OrderStatusAndReason10.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason9#mmMasterReference
	 * OrderStatusAndReason9.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason8#mmMasterReference
	 * IndividualOrderStatusAndReason8.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder8#mmMasterReference
	 * InvestmentFundOrder8.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5#mmMasterReference
	 * TransferStatusAndReason5.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason4#mmMasterReference
	 * CancellationStatusAndReason4.mmMasterReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference11#mmMasterReference
	 * MessageAndBusinessReference11.mmMasterReference}</li>
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
	public static final MMBusinessAttribute mmMasterIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentFundOrder4.mmMasterReference, PEPISATransfer6.mmMasterReference, ISATransfer4.mmMasterReference, ISATransfer6.mmMasterReference, PEPISATransfer8.mmMasterReference,
					TransferReference3.mmMasterReference, ISATransfer3.mmMasterReference, ISATransfer8.mmMasterReference, PEPISATransfer4.mmMasterReference, ISATransfer2.mmMasterReference, ISATransfer10.mmMasterReference,
					PEPISATransfer3.mmMasterReference, ISATransfer1.mmMasterReference, ISATransfer7.mmMasterReference, TransferReference2.mmMasterReference, Transfer7.mmMasterReference, Transfer10.mmMasterReference,
					TransferReference1.mmMasterReference, Transfer6.mmMasterReference, Transfer9.mmMasterReference, Transfer5.mmMasterReference, Transfer8.mmMasterReference, Identification2.mmMasterIdentification,
					OrderStatusAndReason8.mmMasterReference, IndividualOrderStatusAndReason4.mmMasterReference, IndividualOrderConfirmationStatusAndReason1.mmMasterReference, OrderStatusAndReason7.mmMasterReference,
					IndividualOrderStatusAndReason2.mmMasterReference, SwitchOrderStatusAndReason1.mmMasterReference, InvestmentFundOrder1.mmMasterReference, RedemptionBulkOrder3.mmMasterReference,
					RedemptionBulkExecution3.mmMasterReference, InvestmentFundOrderExecution1.mmMasterReference, RedemptionBulkOrder4.mmMasterReference, RedemptionMultipleOrder3.mmMasterReference,
					RedemptionMultipleExecution3.mmMasterReference, RedemptionMultipleOrder4.mmMasterReference, InvestmentFundOrder3.mmMasterReference, InvestmentFundOrder2.mmMasterReference, InvestmentFundTransaction2.mmMasterReference,
					InvestmentFundTransaction3.mmMasterReference, SubscriptionBulkOrder3.mmMasterReference, SubscriptionBulkExecution3.mmMasterReference, SubscriptionBulkOrder4.mmMasterReference,
					SubscriptionMultipleOrder3.mmMasterReference, SubscriptionMultipleExecution3.mmMasterReference, SubscriptionMultipleOrder4.mmMasterReference, SwitchOrder3.mmMasterReference, SwitchExecution4.mmMasterReference,
					SwitchOrder4.mmMasterReference, MessageAndBusinessReference6.mmMasterReference, CancellationStatusAndReason2.mmMasterReference, TransferStatusAndReason2.mmMasterReference, PEPISATransfer5.mmMasterReference,
					ISATransfer5.mmMasterReference, Identification7.mmMasterIdentification, Identification6.mmMasterIdentification, Identification5.mmMasterIdentification, Identification8.mmMasterIdentification,
					Identification11.mmMasterIdentification, Identification13.mmMasterIdentification, Identification9.mmMasterIdentification, IndividualOrderStatusAndReason3.mmMasterReference, RedemptionExecution10.mmMasterReference,
					RedemptionOrder9.mmMasterReference, SubscriptionExecution7.mmMasterReference, SubscriptionOrder9.mmMasterReference, InvestmentFundOrderExecution3.mmMasterReference, InvestmentFundOrder6.mmMasterReference,
					IndividualOrderStatusAndReason5.mmMasterReference, RedemptionMultipleOrder5.mmMasterReference, RedemptionMultipleExecution4.mmMasterReference, SubscriptionMultipleOrder5.mmMasterReference,
					SubscriptionMultipleExecution4.mmMasterReference, Identification3.mmMasterIdentification, TransferIn10.mmMasterReference, TransferIn9.mmMasterReference, TransferOut11.mmMasterReference, TransferOut12.mmMasterReference,
					MessageAndBusinessReference7.mmMasterReference, ISATransfer16.mmMasterReference, ISATransfer13.mmMasterReference, TransferStatusAndReason3.mmMasterReference, TransferReference5.mmMasterReference,
					TransferReference6.mmMasterReference, TransferReference7.mmMasterReference, InvestmentFundTransaction4.mmMasterReference, TransferIn13.mmMasterReference, TransferOut14.mmMasterReference, TransferIn12.mmMasterReference,
					TransferOut15.mmMasterReference, Identification15.mmMasterIdentification, CancellationStatusAndReason3.mmMasterReference, MessageAndBusinessReference8.mmMasterReference, TransferStatusAndReason4.mmMasterReference,
					TransferOut17.mmMasterReference, TransferReference9.mmMasterReference, TransferIn14.mmMasterReference, TransferReference10.mmMasterReference, TransferIn15.mmMasterReference, TransferOut16.mmMasterReference,
					Identification24.mmMasterIdentification, IndividualOrderConfirmationStatusAndReason2.mmMasterReference, SwitchExecution7.mmMasterReference, SubscriptionBulkOrder5.mmMasterReference,
					RedemptionBulkExecution5.mmMasterReference, RedemptionMultipleExecution5.mmMasterReference, RedemptionMultipleOrder6.mmMasterReference, SubscriptionMultipleOrder6.mmMasterReference,
					SubscriptionBulkExecution4.mmMasterReference, SwitchOrder7.mmMasterReference, RedemptionBulkOrder6.mmMasterReference, SubscriptionMultipleExecution5.mmMasterReference, IndividualOrderStatusAndReason7.mmMasterReference,
					SwitchOrderStatusAndReason2.mmMasterReference, OrderStatusAndReason10.mmMasterReference, OrderStatusAndReason9.mmMasterReference, IndividualOrderStatusAndReason8.mmMasterReference,
					InvestmentFundOrder8.mmMasterReference, TransferStatusAndReason5.mmMasterReference, CancellationStatusAndReason4.mmMasterReference, MessageAndBusinessReference11.mmMasterReference);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Order.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MasterIdentification";
			definition = "Unique and unambiguous identifier for a group of individual orders, as assigned by the instructing party. This identifier links the individual orders together.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Order.class.getMethod("getMasterIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Order";
				definition = "Order placed by an investor to buy or sell an asset at a price specified or not.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.mmOrder);
				subType_lazy = () -> Arrays.asList(SecuritiesOrder.mmObject(), PurchaseOrder.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Order.mmTrade, com.tools20022.repository.entity.Order.mmMasterIdentification);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Order.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Trade getTrade() {
		return trade;
	}

	public Order setTrade(com.tools20022.repository.entity.Trade trade) {
		this.trade = Objects.requireNonNull(trade);
		return this;
	}

	public Max35Text getMasterIdentification() {
		return masterIdentification;
	}

	public Order setMasterIdentification(Max35Text masterIdentification) {
		this.masterIdentification = Objects.requireNonNull(masterIdentification);
		return this;
	}
}