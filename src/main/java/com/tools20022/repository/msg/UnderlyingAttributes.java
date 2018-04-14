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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.UnitOrFaceAmountChoice;
import com.tools20022.repository.codeset.SettlementType1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Price1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional details on the underlying. In securities financing deals,
 * it is used to identify and provide information on the collateral.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#mmAllocationPercent
 * UnderlyingAttributes.mmAllocationPercent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#mmQuantity
 * UnderlyingAttributes.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#mmSettlementType
 * UnderlyingAttributes.mmSettlementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#mmCashAmount
 * UnderlyingAttributes.mmCashAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#mmCashType
 * UnderlyingAttributes.mmCashType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingAttributes#mmPrice
 * UnderlyingAttributes.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#mmDirtyPrice
 * UnderlyingAttributes.mmDirtyPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#mmEndPrice
 * UnderlyingAttributes.mmEndPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#mmStartValue
 * UnderlyingAttributes.mmStartValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#mmCurrentValue
 * UnderlyingAttributes.mmCurrentValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#mmEndValue
 * UnderlyingAttributes.mmEndValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#mmAdjustedQuantity
 * UnderlyingAttributes.mmAdjustedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#mmExchangeRate
 * UnderlyingAttributes.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#mmCapValue
 * UnderlyingAttributes.mmCapValue}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnderlyingAttributes"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional details on the underlying. In securities financing deals, it is used to identify and provide information on the collateral."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UnderlyingAttributes", propOrder = {"allocationPercent", "quantity", "settlementType", "cashAmount", "cashType", "price", "dirtyPrice", "endPrice", "startValue", "currentValue", "endValue", "adjustedQuantity",
		"exchangeRate", "capValue"})
public class UnderlyingAttributes {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AllcnPct")
	protected PercentageRate allocationPercent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#mmPercentage
	 * Allocation.mmPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes
	 * UnderlyingAttributes}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllcnPct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationPercent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percent of the Strike Price that this underlying represents."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 972</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnderlyingAttributes, Optional<PercentageRate>> mmAllocationPercent = new MMMessageAttribute<UnderlyingAttributes, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Allocation.mmPercentage;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingAttributes.mmObject();
			isDerived = false;
			xmlTag = "AllcnPct";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "972"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationPercent";
			definition = "Percent of the Strike Price that this underlying represents.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(UnderlyingAttributes obj) {
			return obj.getAllocationPercent();
		}

		@Override
		public void setValue(UnderlyingAttributes obj, Optional<PercentageRate> value) {
			obj.setAllocationPercent(value.orElse(null));
		}
	};
	@XmlElement(name = "Qty")
	protected UnitOrFaceAmountChoice quantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmountChoice
	 * UnitOrFaceAmountChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesQuantity
	 * Security.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes
	 * UnderlyingAttributes}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit amount of the underlying security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnderlyingAttributes, Optional<UnitOrFaceAmountChoice>> mmQuantity = new MMMessageAssociationEnd<UnderlyingAttributes, Optional<UnitOrFaceAmountChoice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingAttributes.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Unit amount of the underlying security.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UnitOrFaceAmountChoice.mmObject();
		}

		@Override
		public Optional<UnitOrFaceAmountChoice> getValue(UnderlyingAttributes obj) {
			return obj.getQuantity();
		}

		@Override
		public void setValue(UnderlyingAttributes obj, Optional<UnitOrFaceAmountChoice> value) {
			obj.setQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmTp")
	protected SettlementType1Code settlementType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementType1Code
	 * SettlementType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmSettlementType
	 * Option.mmSettlementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes
	 * UnderlyingAttributes}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates order settlement period for the underlying instrument. Represents the number of days until settlement; e.g., 2 means T+1 settlement, 4 means T+3 settlement, 5 means T+4 settlement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 975</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnderlyingAttributes, Optional<SettlementType1Code>> mmSettlementType = new MMMessageAttribute<UnderlyingAttributes, Optional<SettlementType1Code>>() {
		{
			businessElementTrace_lazy = () -> Option.mmSettlementType;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingAttributes.mmObject();
			isDerived = false;
			xmlTag = "SttlmTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "975"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementType";
			definition = "Indicates order settlement period for the underlying instrument. Represents the number of days until settlement; e.g., 2 means T+1 settlement, 4 means T+3 settlement, 5 means T+4 settlement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SettlementType1Code.mmObject();
		}

		@Override
		public Optional<SettlementType1Code> getValue(UnderlyingAttributes obj) {
			return obj.getSettlementType();
		}

		@Override
		public void setValue(UnderlyingAttributes obj, Optional<SettlementType1Code> value) {
			obj.setSettlementType(value.orElse(null));
		}
	};
	@XmlElement(name = "CshAmt")
	protected ActiveCurrencyAndAmount cashAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmNotionalCurrencyAndAmount
	 * Derivative.mmNotionalCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes
	 * UnderlyingAttributes}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash amount associated with the underlying component. Necessary for derivatives that deliver into more than one underlying instrument and one of the underlying's is a fixed cash value."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 973</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnderlyingAttributes, Optional<ActiveCurrencyAndAmount>> mmCashAmount = new MMMessageAttribute<UnderlyingAttributes, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Derivative.mmNotionalCurrencyAndAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingAttributes.mmObject();
			isDerived = false;
			xmlTag = "CshAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "973"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAmount";
			definition = "Cash amount associated with the underlying component. Necessary for derivatives that deliver into more than one underlying instrument and one of the underlying's is a fixed cash value.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(UnderlyingAttributes obj) {
			return obj.getCashAmount();
		}

		@Override
		public void setValue(UnderlyingAttributes obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setCashAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "CshTp")
	protected Max35Text cashType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes
	 * UnderlyingAttributes}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Represents how the cash will be calculated. Indicates that the cash is either fixed or a difference value (difference between strike and current underlying price)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 974</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnderlyingAttributes, Optional<Max35Text>> mmCashType = new MMMessageAttribute<UnderlyingAttributes, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingAttributes.mmObject();
			isDerived = false;
			xmlTag = "CshTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "974"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashType";
			definition = "Represents how the cash will be calculated. Indicates that the cash is either fixed or a difference value (difference between strike and current underlying price).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(UnderlyingAttributes obj) {
			return obj.getCashType();
		}

		@Override
		public void setValue(UnderlyingAttributes obj, Optional<Max35Text> value) {
			obj.setCashType(value.orElse(null));
		}
	};
	@XmlElement(name = "Pric")
	protected Price1 price;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price1 Price1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPricing
	 * Security.mmPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes
	 * UnderlyingAttributes}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a financing deal, clean price (percent-of-par or per unit) of the underlying security or basket."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 975</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnderlyingAttributes, Optional<Price1>> mmPrice = new MMMessageAttribute<UnderlyingAttributes, Optional<Price1>>() {
		{
			businessElementTrace_lazy = () -> Security.mmPricing;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingAttributes.mmObject();
			isDerived = false;
			xmlTag = "Pric";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "975"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Price";
			definition = "In a financing deal, clean price (percent-of-par or per unit) of the underlying security or basket.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Price1.mmObject();
		}

		@Override
		public Optional<Price1> getValue(UnderlyingAttributes obj) {
			return obj.getPrice();
		}

		@Override
		public void setValue(UnderlyingAttributes obj, Optional<Price1> value) {
			obj.setPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "DrtyPric")
	protected Price1 dirtyPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price1 Price1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmDirtyPrice
	 * Debt.mmDirtyPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes
	 * UnderlyingAttributes}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrtyPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirtyPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a financing deal, price (percent-of-par or per unit) of the underlying security or basket. \"Dirty\" means it includes accrued interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 882</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnderlyingAttributes, Optional<Price1>> mmDirtyPrice = new MMMessageAttribute<UnderlyingAttributes, Optional<Price1>>() {
		{
			businessElementTrace_lazy = () -> Debt.mmDirtyPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingAttributes.mmObject();
			isDerived = false;
			xmlTag = "DrtyPric";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "882"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirtyPrice";
			definition = "In a financing deal, price (percent-of-par or per unit) of the underlying security or basket. \"Dirty\" means it includes accrued interest.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Price1.mmObject();
		}

		@Override
		public Optional<Price1> getValue(UnderlyingAttributes obj) {
			return obj.getDirtyPrice();
		}

		@Override
		public void setValue(UnderlyingAttributes obj, Optional<Price1> value) {
			obj.setDirtyPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "EndPric")
	protected Price1 endPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price1 Price1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPricing
	 * Security.mmPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes
	 * UnderlyingAttributes}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a financing deal, price (percent-of-par or per unit) of the underlying security or basket at the end of the agreement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 883</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnderlyingAttributes, Optional<Price1>> mmEndPrice = new MMMessageAttribute<UnderlyingAttributes, Optional<Price1>>() {
		{
			businessElementTrace_lazy = () -> Security.mmPricing;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingAttributes.mmObject();
			isDerived = false;
			xmlTag = "EndPric";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "883"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndPrice";
			definition = "In a financing deal, price (percent-of-par or per unit) of the underlying security or basket at the end of the agreement.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Price1.mmObject();
		}

		@Override
		public Optional<Price1> getValue(UnderlyingAttributes obj) {
			return obj.getEndPrice();
		}

		@Override
		public void setValue(UnderlyingAttributes obj, Optional<Price1> value) {
			obj.setEndPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "StartVal")
	protected ActiveCurrencyAndAmount startValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmValuation
	 * Collateral.mmValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes
	 * UnderlyingAttributes}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StartVal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency value attributed to this collateral at the start of the agreement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 884</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnderlyingAttributes, Optional<ActiveCurrencyAndAmount>> mmStartValue = new MMMessageAttribute<UnderlyingAttributes, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Collateral.mmValuation;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingAttributes.mmObject();
			isDerived = false;
			xmlTag = "StartVal";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "884"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StartValue";
			definition = "Currency value attributed to this collateral at the start of the agreement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(UnderlyingAttributes obj) {
			return obj.getStartValue();
		}

		@Override
		public void setValue(UnderlyingAttributes obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setStartValue(value.orElse(null));
		}
	};
	@XmlElement(name = "CurVal")
	protected ActiveCurrencyAndAmount currentValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmValuation
	 * Collateral.mmValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes
	 * UnderlyingAttributes}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurVal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency value currently attributed to this collateral."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 885</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnderlyingAttributes, Optional<ActiveCurrencyAndAmount>> mmCurrentValue = new MMMessageAttribute<UnderlyingAttributes, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Collateral.mmValuation;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingAttributes.mmObject();
			isDerived = false;
			xmlTag = "CurVal";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "885"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentValue";
			definition = "Currency value currently attributed to this collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(UnderlyingAttributes obj) {
			return obj.getCurrentValue();
		}

		@Override
		public void setValue(UnderlyingAttributes obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setCurrentValue(value.orElse(null));
		}
	};
	@XmlElement(name = "EndVal")
	protected ActiveCurrencyAndAmount endValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmValuation
	 * Collateral.mmValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes
	 * UnderlyingAttributes}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndVal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency value attributed to this collateral at the end of the agreement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 886</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnderlyingAttributes, Optional<ActiveCurrencyAndAmount>> mmEndValue = new MMMessageAttribute<UnderlyingAttributes, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Collateral.mmValuation;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingAttributes.mmObject();
			isDerived = false;
			xmlTag = "EndVal";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "886"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndValue";
			definition = "Currency value attributed to this collateral at the end of the agreement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(UnderlyingAttributes obj) {
			return obj.getEndValue();
		}

		@Override
		public void setValue(UnderlyingAttributes obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setEndValue(value.orElse(null));
		}
	};
	@XmlElement(name = "AdjstdQty")
	protected UnitOrFaceAmountChoice adjustedQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmountChoice
	 * UnitOrFaceAmountChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesQuantity
	 * Security.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes
	 * UnderlyingAttributes}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdjstdQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit amount of the underlying security (shares) adjusted for pending corporate action not yet allocated."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnderlyingAttributes, Optional<UnitOrFaceAmountChoice>> mmAdjustedQuantity = new MMMessageAssociationEnd<UnderlyingAttributes, Optional<UnitOrFaceAmountChoice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingAttributes.mmObject();
			isDerived = false;
			xmlTag = "AdjstdQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustedQuantity";
			definition = "Unit amount of the underlying security (shares) adjusted for pending corporate action not yet allocated.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UnitOrFaceAmountChoice.mmObject();
		}

		@Override
		public Optional<UnitOrFaceAmountChoice> getValue(UnderlyingAttributes obj) {
			return obj.getAdjustedQuantity();
		}

		@Override
		public void setValue(UnderlyingAttributes obj, Optional<UnitOrFaceAmountChoice> value) {
			obj.setAdjustedQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "XchgRate")
	protected PercentageRate exchangeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmExchangeRate
	 * AssetHolding.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes
	 * UnderlyingAttributes}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Foreign exchange rate used to compute the current value."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1045</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnderlyingAttributes, Optional<PercentageRate>> mmExchangeRate = new MMMessageAttribute<UnderlyingAttributes, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingAttributes.mmObject();
			isDerived = false;
			xmlTag = "XchgRate";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1045"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRate";
			definition = "Foreign exchange rate used to compute the current value.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(UnderlyingAttributes obj) {
			return obj.getExchangeRate();
		}

		@Override
		public void setValue(UnderlyingAttributes obj, Optional<PercentageRate> value) {
			obj.setExchangeRate(value.orElse(null));
		}
	};
	@XmlElement(name = "CapVal")
	protected ActiveCurrencyAndAmount capValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmCapValue
	 * AssetHolding.mmCapValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes
	 * UnderlyingAttributes}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CapVal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum notional value for a capped financial instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1038</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnderlyingAttributes, Optional<ActiveCurrencyAndAmount>> mmCapValue = new MMMessageAttribute<UnderlyingAttributes, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmCapValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingAttributes.mmObject();
			isDerived = false;
			xmlTag = "CapVal";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1038"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapValue";
			definition = "Maximum notional value for a capped financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(UnderlyingAttributes obj) {
			return obj.getCapValue();
		}

		@Override
		public void setValue(UnderlyingAttributes obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setCapValue(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnderlyingAttributes.mmAllocationPercent, com.tools20022.repository.msg.UnderlyingAttributes.mmQuantity,
						com.tools20022.repository.msg.UnderlyingAttributes.mmSettlementType, com.tools20022.repository.msg.UnderlyingAttributes.mmCashAmount, com.tools20022.repository.msg.UnderlyingAttributes.mmCashType,
						com.tools20022.repository.msg.UnderlyingAttributes.mmPrice, com.tools20022.repository.msg.UnderlyingAttributes.mmDirtyPrice, com.tools20022.repository.msg.UnderlyingAttributes.mmEndPrice,
						com.tools20022.repository.msg.UnderlyingAttributes.mmStartValue, com.tools20022.repository.msg.UnderlyingAttributes.mmCurrentValue, com.tools20022.repository.msg.UnderlyingAttributes.mmEndValue,
						com.tools20022.repository.msg.UnderlyingAttributes.mmAdjustedQuantity, com.tools20022.repository.msg.UnderlyingAttributes.mmExchangeRate, com.tools20022.repository.msg.UnderlyingAttributes.mmCapValue);
				trace_lazy = () -> Asset.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "UnderlyingAttributes";
				definition = "Provides additional details on the underlying. In securities financing deals, it is used to identify and provide information on the collateral.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PercentageRate> getAllocationPercent() {
		return allocationPercent == null ? Optional.empty() : Optional.of(allocationPercent);
	}

	public UnderlyingAttributes setAllocationPercent(PercentageRate allocationPercent) {
		this.allocationPercent = allocationPercent;
		return this;
	}

	public Optional<UnitOrFaceAmountChoice> getQuantity() {
		return quantity == null ? Optional.empty() : Optional.of(quantity);
	}

	public UnderlyingAttributes setQuantity(UnitOrFaceAmountChoice quantity) {
		this.quantity = quantity;
		return this;
	}

	public Optional<SettlementType1Code> getSettlementType() {
		return settlementType == null ? Optional.empty() : Optional.of(settlementType);
	}

	public UnderlyingAttributes setSettlementType(SettlementType1Code settlementType) {
		this.settlementType = settlementType;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getCashAmount() {
		return cashAmount == null ? Optional.empty() : Optional.of(cashAmount);
	}

	public UnderlyingAttributes setCashAmount(ActiveCurrencyAndAmount cashAmount) {
		this.cashAmount = cashAmount;
		return this;
	}

	public Optional<Max35Text> getCashType() {
		return cashType == null ? Optional.empty() : Optional.of(cashType);
	}

	public UnderlyingAttributes setCashType(Max35Text cashType) {
		this.cashType = cashType;
		return this;
	}

	public Optional<Price1> getPrice() {
		return price == null ? Optional.empty() : Optional.of(price);
	}

	public UnderlyingAttributes setPrice(Price1 price) {
		this.price = price;
		return this;
	}

	public Optional<Price1> getDirtyPrice() {
		return dirtyPrice == null ? Optional.empty() : Optional.of(dirtyPrice);
	}

	public UnderlyingAttributes setDirtyPrice(Price1 dirtyPrice) {
		this.dirtyPrice = dirtyPrice;
		return this;
	}

	public Optional<Price1> getEndPrice() {
		return endPrice == null ? Optional.empty() : Optional.of(endPrice);
	}

	public UnderlyingAttributes setEndPrice(Price1 endPrice) {
		this.endPrice = endPrice;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getStartValue() {
		return startValue == null ? Optional.empty() : Optional.of(startValue);
	}

	public UnderlyingAttributes setStartValue(ActiveCurrencyAndAmount startValue) {
		this.startValue = startValue;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getCurrentValue() {
		return currentValue == null ? Optional.empty() : Optional.of(currentValue);
	}

	public UnderlyingAttributes setCurrentValue(ActiveCurrencyAndAmount currentValue) {
		this.currentValue = currentValue;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getEndValue() {
		return endValue == null ? Optional.empty() : Optional.of(endValue);
	}

	public UnderlyingAttributes setEndValue(ActiveCurrencyAndAmount endValue) {
		this.endValue = endValue;
		return this;
	}

	public Optional<UnitOrFaceAmountChoice> getAdjustedQuantity() {
		return adjustedQuantity == null ? Optional.empty() : Optional.of(adjustedQuantity);
	}

	public UnderlyingAttributes setAdjustedQuantity(UnitOrFaceAmountChoice adjustedQuantity) {
		this.adjustedQuantity = adjustedQuantity;
		return this;
	}

	public Optional<PercentageRate> getExchangeRate() {
		return exchangeRate == null ? Optional.empty() : Optional.of(exchangeRate);
	}

	public UnderlyingAttributes setExchangeRate(PercentageRate exchangeRate) {
		this.exchangeRate = exchangeRate;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getCapValue() {
		return capValue == null ? Optional.empty() : Optional.of(capValue);
	}

	public UnderlyingAttributes setCapValue(ActiveCurrencyAndAmount capValue) {
		this.capValue = capValue;
		return this;
	}
}