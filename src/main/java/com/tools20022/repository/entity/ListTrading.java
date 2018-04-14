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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.BasisPriceType1Choice;
import com.tools20022.repository.codeset.BasisPriceTypeCode;
import com.tools20022.repository.codeset.BidTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Liquidity;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.entity.TradingSession;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
 * {@linkplain com.tools20022.repository.entity.ListTrading#mmListIdentification
 * ListTrading.mmListIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#mmSecuritiesListOrder
 * ListTrading.mmSecuritiesListOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#mmListTradingSession
 * ListTrading.mmListTradingSession}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ListTrading#mmListName
 * ListTrading.mmListName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#mmBasisPriceType
 * ListTrading.mmBasisPriceType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ListTrading#mmStrikeTime
 * ListTrading.mmStrikeTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#mmGrossAmountIndicator
 * ListTrading.mmGrossAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#mmSellSideIdentification
 * ListTrading.mmSellSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ListTrading#mmBuySideIdentification
 * ListTrading.mmBuySideIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ListTrading#mmLiquidity
 * ListTrading.mmLiquidity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ListTrading#mmBidType
 * ListTrading.mmBidType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmListTrading
 * SecuritiesOrder.mmListTrading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingSession#mmListTrading
 * TradingSession.mmListTrading}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Liquidity#mmListTrading
 * Liquidity.mmListTrading}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.List3#mmStrikePriceDetails
 * List3.mmStrikePriceDetails}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ListTrading"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the details for negotiating and trading a large number of securities contained in or comprising a portfolio. One example is index arbitrage, which consists in the purchase or sale of a basket of stocks in conjunction with the sale or purchase of a derivative product (for example index futures) to profit from price differences between the basket and the derivative product. Other examples include liquidation of EFP (Exchange for Physical) stock positions, portfolio realignment and portfolio liquidation."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class ListTrading {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text listIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.Identification2#mmListIdentification
	 * Identification2.mmListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#mmListIdentification
	 * Order16.mmListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#mmListIdentification
	 * Order14.mmListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification7#mmListIdentification
	 * Identification7.mmListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification6#mmListIdentification
	 * Identification6.mmListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification5#mmListIdentification
	 * Identification5.mmListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification8#mmListIdentification
	 * Identification8.mmListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification11#mmListIdentification
	 * Identification11.mmListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification13#mmListIdentification
	 * Identification13.mmListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification9#mmListIdentification
	 * Identification9.mmListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatus2#mmListIdentification
	 * OrderStatus2.mmListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DisclosedBid1#mmListIdentification
	 * DisclosedBid1.mmListIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Bid2#mmListIdentification
	 * Bid2.mmListIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.List1#mmListIdentification
	 * List1.mmListIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.List2#mmListIdentification
	 * List2.mmListIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.List3#mmListIdentification
	 * List3.mmListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ListExecution1#mmListIdentification
	 * ListExecution1.mmListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ListIdentification1#mmListIdentification
	 * ListIdentification1.mmListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification3#mmListIdentification
	 * Identification3.mmListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmListIdentification
	 * Order17.mmListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmListIdentification
	 * Order18.mmListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#mmListIdentification
	 * Identification15.mmListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification24#mmListIdentification
	 * Identification24.mmListIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for a list, as assigned by the trading party. The identifier must be unique within a single trading day."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ListTrading, Max35Text> mmListIdentification = new MMBusinessAttribute<ListTrading, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(Identification2.mmListIdentification, Order16.mmListIdentification, Order14.mmListIdentification, Identification7.mmListIdentification, Identification6.mmListIdentification,
					Identification5.mmListIdentification, Identification8.mmListIdentification, Identification11.mmListIdentification, Identification13.mmListIdentification, Identification9.mmListIdentification,
					OrderStatus2.mmListIdentification, DisclosedBid1.mmListIdentification, Bid2.mmListIdentification, List1.mmListIdentification, List2.mmListIdentification, List3.mmListIdentification, ListExecution1.mmListIdentification,
					ListIdentification1.mmListIdentification, Identification3.mmListIdentification, Order17.mmListIdentification, Order18.mmListIdentification, Identification15.mmListIdentification, Identification24.mmListIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ListIdentification";
			definition = "Unique identifier for a list, as assigned by the trading party. The identifier must be unique within a single trading day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ListTrading obj) {
			return obj.getListIdentification();
		}

		@Override
		public void setValue(ListTrading obj, Max35Text value) {
			obj.setListIdentification(value);
		}
	};
	protected List<SecuritiesOrder> securitiesListOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmListTrading
	 * SecuritiesOrder.mmListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.List1#mmOrderDetails
	 * List1.mmOrderDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesListOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order list containing the details of the individual orders within the program."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ListTrading, List<SecuritiesOrder>> mmSecuritiesListOrder = new MMBusinessAssociationEnd<ListTrading, List<SecuritiesOrder>>() {
		{
			derivation_lazy = () -> Arrays.asList(List1.mmOrderDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesListOrder";
			definition = "Order list containing the details of the individual orders within the program.";
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesOrder.mmListTrading;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}

		@Override
		public List<SecuritiesOrder> getValue(ListTrading obj) {
			return obj.getSecuritiesListOrder();
		}

		@Override
		public void setValue(ListTrading obj, List<SecuritiesOrder> value) {
			obj.setSecuritiesListOrder(value);
		}
	};
	protected TradingSession listTradingSession;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingSession
	 * TradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession#mmListTrading
	 * TradingSession.mmListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order3#mmTradingSessionDetails
	 * Order3.mmTradingSessionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DisclosedBid1#mmTradingSession
	 * DisclosedBid1.mmTradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order6#mmTradingSessionDetails
	 * Order6.mmTradingSessionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListTradingSession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of a specific trading session for a list trading."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ListTrading, TradingSession> mmListTradingSession = new MMBusinessAssociationEnd<ListTrading, TradingSession>() {
		{
			derivation_lazy = () -> Arrays.asList(Order3.mmTradingSessionDetails, DisclosedBid1.mmTradingSession, Order6.mmTradingSessionDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ListTradingSession";
			definition = "Details of a specific trading session for a list trading.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> TradingSession.mmListTrading;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TradingSession.mmObject();
		}

		@Override
		public TradingSession getValue(ListTrading obj) {
			return obj.getListTradingSession();
		}

		@Override
		public void setValue(ListTrading obj, TradingSession value) {
			obj.setListTradingSession(value);
		}
	};
	protected Max140Text listName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Bid1#mmListName
	 * Bid1.mmListName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the name of the order list."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 392</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ListTrading, Max140Text> mmListName = new MMBusinessAttribute<ListTrading, Max140Text>() {
		{
			derivation_lazy = () -> Arrays.asList(Bid1.mmListName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "392"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ListName";
			definition = "Provides the name of the order list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(ListTrading obj) {
			return obj.getListName();
		}

		@Override
		public void setValue(ListTrading obj, Max140Text value) {
			obj.setListName(value);
		}
	};
	protected BasisPriceTypeCode basisPriceType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.BasisPriceType1Choice#mmCode
	 * BasisPriceType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BasisPriceType1Choice#mmProprietary
	 * BasisPriceType1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Bid1#mmBasisPriceType
	 * Bid1.mmBasisPriceType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasisPriceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Represents the basis price type in a bid order (list trading)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 419</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ListTrading, BasisPriceTypeCode> mmBasisPriceType = new MMBusinessAttribute<ListTrading, BasisPriceTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(BasisPriceType1Choice.mmCode, BasisPriceType1Choice.mmProprietary, Bid1.mmBasisPriceType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "419"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BasisPriceType";
			definition = "Represents the basis price type in a bid order (list trading).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BasisPriceTypeCode.mmObject();
		}

		@Override
		public BasisPriceTypeCode getValue(ListTrading obj) {
			return obj.getBasisPriceType();
		}

		@Override
		public void setValue(ListTrading obj, BasisPriceTypeCode value) {
			obj.setBasisPriceType(value);
		}
	};
	protected ISODateTime strikeTime;
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
	 * <li>{@linkplain com.tools20022.repository.msg.Bid1#mmStrikeTime
	 * Bid1.mmStrikeTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikeTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Time at which current market prices are used to determine the value of a basket."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 443</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ListTrading, ISODateTime> mmStrikeTime = new MMBusinessAttribute<ListTrading, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(Bid1.mmStrikeTime);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "443"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StrikeTime";
			definition = "Time at which current market prices are used to determine the value of a basket.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(ListTrading obj) {
			return obj.getStrikeTime();
		}

		@Override
		public void setValue(ListTrading obj, ISODateTime value) {
			obj.setStrikeTime(value);
		}
	};
	protected YesNoIndicator grossAmountIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.LiquidityAndStatistics1#mmGrossIndicator
	 * LiquidityAndStatistics1.mmGrossIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DisclosedBid1#mmGrossIndicator
	 * DisclosedBid1.mmGrossIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BidResponsePrice1#mmGrossIndicator
	 * BidResponsePrice1.mmGrossIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BidResponsePrice2#mmGrossIndicator
	 * BidResponsePrice2.mmGrossIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an amount is a gross amount (including all charges, commissions and tax), or a net amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 416</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ListTrading, YesNoIndicator> mmGrossAmountIndicator = new MMBusinessAttribute<ListTrading, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(LiquidityAndStatistics1.mmGrossIndicator, DisclosedBid1.mmGrossIndicator, BidResponsePrice1.mmGrossIndicator, BidResponsePrice2.mmGrossIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "416"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossAmountIndicator";
			definition = "Indicates whether an amount is a gross amount (including all charges, commissions and tax), or a net amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(ListTrading obj) {
			return obj.getGrossAmountIndicator();
		}

		@Override
		public void setValue(ListTrading obj, YesNoIndicator value) {
			obj.setGrossAmountIndicator(value);
		}
	};
	protected Max35Text sellSideIdentification;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellSideIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for a bid, as assigned by the the sell-side (broker, exchange, electronic communication network (ECN)). The identifier must be unique within a single trading day."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ListTrading, Max35Text> mmSellSideIdentification = new MMBusinessAttribute<ListTrading, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SellSideIdentification";
			definition = "Unique identifier for a bid, as assigned by the the sell-side (broker, exchange, electronic communication network (ECN)). The identifier must be unique within a single trading day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ListTrading obj) {
			return obj.getSellSideIdentification();
		}

		@Override
		public void setValue(ListTrading obj, Max35Text value) {
			obj.setSellSideIdentification(value);
		}
	};
	protected Max35Text buySideIdentification;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuySideIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for a bid, as assigned by the buy-side institution. The identifier must be unique within a single trading day."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ListTrading, Max35Text> mmBuySideIdentification = new MMBusinessAttribute<ListTrading, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuySideIdentification";
			definition = "Unique identifier for a bid, as assigned by the buy-side institution. The identifier must be unique within a single trading day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ListTrading obj) {
			return obj.getBuySideIdentification();
		}

		@Override
		public void setValue(ListTrading obj, Max35Text value) {
			obj.setBuySideIdentification(value);
		}
	};
	protected List<Liquidity> liquidity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Liquidity Liquidity}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Liquidity#mmListTrading
	 * Liquidity.mmListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Bid1#mmLiquidityAndStatistics
	 * Bid1.mmLiquidityAndStatistics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid1#mmLiquidity
	 * NonDisclosedBid1.mmLiquidity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Liquidity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information on the liquidity of a financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ListTrading, List<Liquidity>> mmLiquidity = new MMBusinessAssociationEnd<ListTrading, List<Liquidity>>() {
		{
			derivation_lazy = () -> Arrays.asList(Bid1.mmLiquidityAndStatistics, NonDisclosedBid1.mmLiquidity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Liquidity";
			definition = "Information on the liquidity of a financial instrument.";
			minOccurs = 0;
			opposite_lazy = () -> Liquidity.mmListTrading;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Liquidity.mmObject();
		}

		@Override
		public List<Liquidity> getValue(ListTrading obj) {
			return obj.getLiquidity();
		}

		@Override
		public void setValue(ListTrading obj, List<Liquidity> value) {
			obj.setLiquidity(value);
		}
	};
	protected BidTypeCode bidType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.BidTypeCode
	 * BidTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.List1#mmBidType
	 * List1.mmBidType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading ListTrading}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the type of bid for a list order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ListTrading, BidTypeCode> mmBidType = new MMBusinessAttribute<ListTrading, BidTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(List1.mmBidType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ListTrading.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidType";
			definition = "Indicates the type of bid for a list order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BidTypeCode.mmObject();
		}

		@Override
		public BidTypeCode getValue(ListTrading obj) {
			return obj.getBidType();
		}

		@Override
		public void setValue(ListTrading obj, BidTypeCode value) {
			obj.setBidType(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ListTrading";
				definition = "Provides the details for negotiating and trading a large number of securities contained in or comprising a portfolio. One example is index arbitrage, which consists in the purchase or sale of a basket of stocks in conjunction with the sale or purchase of a derivative product (for example index futures) to profit from price differences between the basket and the derivative product. Other examples include liquidation of EFP (Exchange for Physical) stock positions, portfolio realignment and portfolio liquidation.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesOrder.mmListTrading, TradingSession.mmListTrading, Liquidity.mmListTrading);
				derivationElement_lazy = () -> Arrays.asList(List3.mmStrikePriceDetails);
				subType_lazy = () -> Arrays.asList(DisclosedListTrading.mmObject(), NonDisclosedListTrading.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ListTrading.mmListIdentification, com.tools20022.repository.entity.ListTrading.mmSecuritiesListOrder,
						com.tools20022.repository.entity.ListTrading.mmListTradingSession, com.tools20022.repository.entity.ListTrading.mmListName, com.tools20022.repository.entity.ListTrading.mmBasisPriceType,
						com.tools20022.repository.entity.ListTrading.mmStrikeTime, com.tools20022.repository.entity.ListTrading.mmGrossAmountIndicator, com.tools20022.repository.entity.ListTrading.mmSellSideIdentification,
						com.tools20022.repository.entity.ListTrading.mmBuySideIdentification, com.tools20022.repository.entity.ListTrading.mmLiquidity, com.tools20022.repository.entity.ListTrading.mmBidType);
				derivationComponent_lazy = () -> Arrays.asList(BasisPriceType1Choice.mmObject(), List1.mmObject(), List2.mmObject(), ListStrikePriceDetails1.mmObject(), List3.mmObject(), ListExecution1.mmObject(),
						ListIdentification1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return ListTrading.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getListIdentification() {
		return listIdentification;
	}

	public ListTrading setListIdentification(Max35Text listIdentification) {
		this.listIdentification = Objects.requireNonNull(listIdentification);
		return this;
	}

	public List<SecuritiesOrder> getSecuritiesListOrder() {
		return securitiesListOrder == null ? securitiesListOrder = new ArrayList<>() : securitiesListOrder;
	}

	public ListTrading setSecuritiesListOrder(List<SecuritiesOrder> securitiesListOrder) {
		this.securitiesListOrder = Objects.requireNonNull(securitiesListOrder);
		return this;
	}

	public TradingSession getListTradingSession() {
		return listTradingSession;
	}

	public ListTrading setListTradingSession(TradingSession listTradingSession) {
		this.listTradingSession = Objects.requireNonNull(listTradingSession);
		return this;
	}

	public Max140Text getListName() {
		return listName;
	}

	public ListTrading setListName(Max140Text listName) {
		this.listName = Objects.requireNonNull(listName);
		return this;
	}

	public BasisPriceTypeCode getBasisPriceType() {
		return basisPriceType;
	}

	public ListTrading setBasisPriceType(BasisPriceTypeCode basisPriceType) {
		this.basisPriceType = Objects.requireNonNull(basisPriceType);
		return this;
	}

	public ISODateTime getStrikeTime() {
		return strikeTime;
	}

	public ListTrading setStrikeTime(ISODateTime strikeTime) {
		this.strikeTime = Objects.requireNonNull(strikeTime);
		return this;
	}

	public YesNoIndicator getGrossAmountIndicator() {
		return grossAmountIndicator;
	}

	public ListTrading setGrossAmountIndicator(YesNoIndicator grossAmountIndicator) {
		this.grossAmountIndicator = Objects.requireNonNull(grossAmountIndicator);
		return this;
	}

	public Max35Text getSellSideIdentification() {
		return sellSideIdentification;
	}

	public ListTrading setSellSideIdentification(Max35Text sellSideIdentification) {
		this.sellSideIdentification = Objects.requireNonNull(sellSideIdentification);
		return this;
	}

	public Max35Text getBuySideIdentification() {
		return buySideIdentification;
	}

	public ListTrading setBuySideIdentification(Max35Text buySideIdentification) {
		this.buySideIdentification = Objects.requireNonNull(buySideIdentification);
		return this;
	}

	public List<Liquidity> getLiquidity() {
		return liquidity == null ? liquidity = new ArrayList<>() : liquidity;
	}

	public ListTrading setLiquidity(List<Liquidity> liquidity) {
		this.liquidity = Objects.requireNonNull(liquidity);
		return this;
	}

	public BidTypeCode getBidType() {
		return bidType;
	}

	public ListTrading setBidType(BidTypeCode bidType) {
		this.bidType = Objects.requireNonNull(bidType);
		return this;
	}
}