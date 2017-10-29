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
import com.tools20022.repository.choice.BasisPriceType1Choice;
import com.tools20022.repository.codeset.BasisPriceTypeCode;
import com.tools20022.repository.codeset.BidTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides the details for negotiating and trading a large number of securities
 * contained in or comprising a portfolio. One example is index arbitrage, which
 * consists in the purchase or sale of a basket of stocks in conjunction with
 * the sale or purchase of a derivative product (for example index futures) to
 * profit from price differences between the basket and the derivative product.
 * Other examples include liquidation of EFP (Exchange for Physical) stock
 * positions, portfolio realignment and portfolio liquidation.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ListTrading" src="doc-files/ListTrading.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#ListIdentification
 * ListTrading.ListIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#SecuritiesListOrder
 * ListTrading.SecuritiesListOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#ListTradingSession
 * ListTrading.ListTradingSession}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ListTrading#ListName
 * ListTrading.ListName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ListTrading#BasisPriceType
 * ListTrading.BasisPriceType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ListTrading#StrikeTime
 * ListTrading.StrikeTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#GrossAmountIndicator
 * ListTrading.GrossAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#SellSideIdentification
 * ListTrading.SellSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#BuySideIdentification
 * ListTrading.BuySideIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ListTrading#Liquidity
 * ListTrading.Liquidity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ListTrading#BidType
 * ListTrading.BidType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#ListTrading
 * SecuritiesOrder.ListTrading}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingSession#ListTrading
 * TradingSession.ListTrading}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Liquidity#ListTrading
 * Liquidity.ListTrading}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.List3#StrikePriceDetails
 * List3.StrikePriceDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.DisclosedListTrading
 * DisclosedListTrading}</li>
 * <li>{@linkplain com.tools20022.repository.entity.NonDisclosedListTrading
 * NonDisclosedListTrading}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.BasisPriceType1Choice
 * BasisPriceType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.List1 List1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.List2 List2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1
 * ListStrikePriceDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.List3 List3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ListExecution1 ListExecution1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ListIdentification1
 * ListIdentification1}</li>
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
 * "ListTrading"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the details for negotiating and trading a large number of securities contained in or comprising a portfolio. One example is index arbitrage, which consists in the purchase or sale of a basket of stocks in conjunction with the sale or purchase of a derivative product (for example index futures) to profit from price differences between the basket and the derivative product. Other examples include liquidation of EFP (Exchange for Physical) stock positions, portfolio realignment and portfolio liquidation."
 * </li>
 * </ul>
 */
public class ListTrading {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique identifier for a list, as assigned by the trading party. The
	 * identifier must be unique within a single trading day.
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
	 * {@linkplain com.tools20022.repository.msg.Identification2#ListIdentification
	 * Identification2.ListIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#ListIdentification
	 * Order16.ListIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#ListIdentification
	 * Order14.ListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification7#ListIdentification
	 * Identification7.ListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification6#ListIdentification
	 * Identification6.ListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification5#ListIdentification
	 * Identification5.ListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification8#ListIdentification
	 * Identification8.ListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification11#ListIdentification
	 * Identification11.ListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification13#ListIdentification
	 * Identification13.ListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification9#ListIdentification
	 * Identification9.ListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatus2#ListIdentification
	 * OrderStatus2.ListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DisclosedBid1#ListIdentification
	 * DisclosedBid1.ListIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Bid2#ListIdentification
	 * Bid2.ListIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.List1#ListIdentification
	 * List1.ListIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.List2#ListIdentification
	 * List2.ListIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.List3#ListIdentification
	 * List3.ListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ListExecution1#ListIdentification
	 * ListExecution1.ListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ListIdentification1#ListIdentification
	 * ListIdentification1.ListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification3#ListIdentification
	 * Identification3.ListIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#ListIdentification
	 * Order17.ListIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#ListIdentification
	 * Order18.ListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#ListIdentification
	 * Identification15.ListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification24#ListIdentification
	 * Identification24.ListIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for a list, as assigned by the trading party. The identifier must be unique within a single trading day."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ListIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Identification2.ListIdentification, com.tools20022.repository.msg.Order16.ListIdentification, com.tools20022.repository.msg.Order14.ListIdentification,
					com.tools20022.repository.msg.Identification7.ListIdentification, com.tools20022.repository.msg.Identification6.ListIdentification, com.tools20022.repository.msg.Identification5.ListIdentification,
					com.tools20022.repository.msg.Identification8.ListIdentification, com.tools20022.repository.msg.Identification11.ListIdentification, com.tools20022.repository.msg.Identification13.ListIdentification,
					com.tools20022.repository.msg.Identification9.ListIdentification, com.tools20022.repository.msg.OrderStatus2.ListIdentification, com.tools20022.repository.msg.DisclosedBid1.ListIdentification,
					com.tools20022.repository.msg.Bid2.ListIdentification, com.tools20022.repository.msg.List1.ListIdentification, com.tools20022.repository.msg.List2.ListIdentification,
					com.tools20022.repository.msg.List3.ListIdentification, com.tools20022.repository.msg.ListExecution1.ListIdentification, com.tools20022.repository.msg.ListIdentification1.ListIdentification,
					com.tools20022.repository.msg.Identification3.ListIdentification, com.tools20022.repository.msg.Order17.ListIdentification, com.tools20022.repository.msg.Order18.ListIdentification,
					com.tools20022.repository.msg.Identification15.ListIdentification, com.tools20022.repository.msg.Identification24.ListIdentification);
			elementContext_lazy = () -> ListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ListIdentification";
			definition = "Unique identifier for a list, as assigned by the trading party. The identifier must be unique within a single trading day.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Order list containing the details of the individual orders within the
	 * program.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#ListTrading
	 * SecuritiesOrder.ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.List1#OrderDetails
	 * List1.OrderDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesListOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order list containing the details of the individual orders within the program."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesListOrder = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.List1.OrderDetails);
			elementContext_lazy = () -> ListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesListOrder";
			definition = "Order list containing the details of the individual orders within the program.";
			minOccurs = 1;
			type_lazy = () -> SecuritiesOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.ListTrading;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Details of a specific trading session for a list trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession#ListTrading
	 * TradingSession.ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingSession
	 * TradingSession}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order3#TradingSessionDetails
	 * Order3.TradingSessionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DisclosedBid1#TradingSession
	 * DisclosedBid1.TradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order6#TradingSessionDetails
	 * Order6.TradingSessionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListTradingSession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of a specific trading session for a list trading."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ListTradingSession = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order3.TradingSessionDetails, com.tools20022.repository.msg.DisclosedBid1.TradingSession, com.tools20022.repository.msg.Order6.TradingSessionDetails);
			elementContext_lazy = () -> ListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ListTradingSession";
			definition = "Details of a specific trading session for a list trading.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TradingSession.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradingSession.ListTrading;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Provides the name of the order list.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Bid1#ListName
	 * Bid1.ListName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the name of the order list."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ListName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Bid1.ListName);
			elementContext_lazy = () -> ListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ListName";
			definition = "Provides the name of the order list.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Represents the basis price type in a bid order (list trading).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BasisPriceTypeCode
	 * BasisPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BasisPriceType1Choice#Code
	 * BasisPriceType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BasisPriceType1Choice#Proprietary
	 * BasisPriceType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Bid1#BasisPriceType
	 * Bid1.BasisPriceType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasisPriceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Represents the basis price type in a bid order (list trading)."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BasisPriceType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.BasisPriceType1Choice.Code, com.tools20022.repository.choice.BasisPriceType1Choice.Proprietary, com.tools20022.repository.msg.Bid1.BasisPriceType);
			elementContext_lazy = () -> ListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BasisPriceType";
			definition = "Represents the basis price type in a bid order (list trading).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BasisPriceTypeCode.mmObject();
		}
	};
	/**
	 * Time at which current market prices are used to determine the value of a
	 * basket.
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
	 * <li>{@linkplain com.tools20022.repository.msg.Bid1#StrikeTime
	 * Bid1.StrikeTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikeTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Time at which current market prices are used to determine the value of a basket."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StrikeTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Bid1.StrikeTime);
			elementContext_lazy = () -> ListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StrikeTime";
			definition = "Time at which current market prices are used to determine the value of a basket.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Indicates whether an amount is a gross amount (including all charges,
	 * commissions and tax), or a net amount.
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
	 * {@linkplain com.tools20022.repository.msg.LiquidityAndStatistics1#GrossIndicator
	 * LiquidityAndStatistics1.GrossIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DisclosedBid1#GrossIndicator
	 * DisclosedBid1.GrossIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BidResponsePrice1#GrossIndicator
	 * BidResponsePrice1.GrossIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BidResponsePrice2#GrossIndicator
	 * BidResponsePrice2.GrossIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an amount is a gross amount (including all charges, commissions and tax), or a net amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute GrossAmountIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LiquidityAndStatistics1.GrossIndicator, com.tools20022.repository.msg.DisclosedBid1.GrossIndicator,
					com.tools20022.repository.msg.BidResponsePrice1.GrossIndicator, com.tools20022.repository.msg.BidResponsePrice2.GrossIndicator);
			elementContext_lazy = () -> ListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossAmountIndicator";
			definition = "Indicates whether an amount is a gross amount (including all charges, commissions and tax), or a net amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Unique identifier for a bid, as assigned by the the sell-side (broker,
	 * exchange, electronic communication network (ECN)). The identifier must be
	 * unique within a single trading day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellSideIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for a bid, as assigned by the the sell-side (broker, exchange, electronic communication network (ECN)). The identifier must be unique within a single trading day."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SellSideIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SellSideIdentification";
			definition = "Unique identifier for a bid, as assigned by the the sell-side (broker, exchange, electronic communication network (ECN)). The identifier must be unique within a single trading day.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique identifier for a bid, as assigned by the buy-side institution. The
	 * identifier must be unique within a single trading day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuySideIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for a bid, as assigned by the buy-side institution. The identifier must be unique within a single trading day."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BuySideIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuySideIdentification";
			definition = "Unique identifier for a bid, as assigned by the buy-side institution. The identifier must be unique within a single trading day.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Information on the liquidity of a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Liquidity#ListTrading
	 * Liquidity.ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Liquidity Liquidity}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Bid1#LiquidityAndStatistics
	 * Bid1.LiquidityAndStatistics}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NonDisclosedBid1#Liquidity
	 * NonDisclosedBid1.Liquidity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Liquidity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information on the liquidity of a financial instrument."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Liquidity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Bid1.LiquidityAndStatistics, com.tools20022.repository.msg.NonDisclosedBid1.Liquidity);
			elementContext_lazy = () -> ListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Liquidity";
			definition = "Information on the liquidity of a financial instrument.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Liquidity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Liquidity.ListTrading;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates the type of bid for a list order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.BidTypeCode
	 * BidTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.List1#BidType
	 * List1.BidType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the type of bid for a list order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BidType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.List1.BidType);
			elementContext_lazy = () -> ListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidType";
			definition = "Indicates the type of bid for a list order.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BidTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ListTrading";
				definition = "Provides the details for negotiating and trading a large number of securities contained in or comprising a portfolio. One example is index arbitrage, which consists in the purchase or sale of a basket of stocks in conjunction with the sale or purchase of a derivative product (for example index futures) to profit from price differences between the basket and the derivative product. Other examples include liquidation of EFP (Exchange for Physical) stock positions, portfolio realignment and portfolio liquidation.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrder.ListTrading, com.tools20022.repository.entity.TradingSession.ListTrading, com.tools20022.repository.entity.Liquidity.ListTrading);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.List3.StrikePriceDetails);
				subType_lazy = () -> Arrays.asList(DisclosedListTrading.mmObject(), NonDisclosedListTrading.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ListTrading.ListIdentification, com.tools20022.repository.entity.ListTrading.SecuritiesListOrder,
						com.tools20022.repository.entity.ListTrading.ListTradingSession, com.tools20022.repository.entity.ListTrading.ListName, com.tools20022.repository.entity.ListTrading.BasisPriceType,
						com.tools20022.repository.entity.ListTrading.StrikeTime, com.tools20022.repository.entity.ListTrading.GrossAmountIndicator, com.tools20022.repository.entity.ListTrading.SellSideIdentification,
						com.tools20022.repository.entity.ListTrading.BuySideIdentification, com.tools20022.repository.entity.ListTrading.Liquidity, com.tools20022.repository.entity.ListTrading.BidType);
				derivationComponent_lazy = () -> Arrays.asList(BasisPriceType1Choice.mmObject(), List1.mmObject(), List2.mmObject(), ListStrikePriceDetails1.mmObject(), List3.mmObject(), ListExecution1.mmObject(),
						ListIdentification1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}