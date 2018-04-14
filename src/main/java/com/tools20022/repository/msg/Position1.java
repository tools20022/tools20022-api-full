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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumberFraction5;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.NonNegativeDecimalNumberFraction5;
import com.tools20022.repository.entity.Derivative;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection6;
import com.tools20022.repository.msg.EndOfDayRequirement1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Attributes of a position in a financial instrument or financial product.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Position1#mmProductIdentification
 * Position1.mmProductIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Position1#mmRiskRequirement
 * Position1.mmRiskRequirement}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Position1#mmGrossNotional
 * Position1.mmGrossNotional}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Position1#mmNetNotional
 * Position1.mmNetNotional}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Position1#mmGrossDeltaEquivalentValue
 * Position1.mmGrossDeltaEquivalentValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Position1#mmNetDeltaEquivalentValue
 * Position1.mmNetDeltaEquivalentValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Position1#mmGrossDeltaEquivalentQuantity
 * Position1.mmGrossDeltaEquivalentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Position1#mmNetDeltaEquivalentQuantity
 * Position1.mmNetDeltaEquivalentQuantity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Position1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Attributes of a position in a financial instrument or financial product."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Position1", propOrder = {"productIdentification", "riskRequirement", "grossNotional", "netNotional", "grossDeltaEquivalentValue", "netDeltaEquivalentValue", "grossDeltaEquivalentQuantity", "netDeltaEquivalentQuantity"})
public class Position1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PdctId", required = true)
	protected Max35Text productIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Position1
	 * Position1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CCP’s unique internal identifier for product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Position1, Max35Text> mmProductIdentification = new MMMessageAttribute<Position1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Position1.mmObject();
			isDerived = false;
			xmlTag = "PdctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductIdentification";
			definition = "CCP’s unique internal identifier for product.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Position1 obj) {
			return obj.getProductIdentification();
		}

		@Override
		public void setValue(Position1 obj, Max35Text value) {
			obj.setProductIdentification(value);
		}
	};
	@XmlElement(name = "RskRqrmnt")
	protected EndOfDayRequirement1 riskRequirement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EndOfDayRequirement1
	 * EndOfDayRequirement1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRelatedMarginCall
	 * Security.mmRelatedMarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Position1
	 * Position1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RskRqrmnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RiskRequirement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Obligations of a clearing member with respect to a central counterparty based on the position at end of day."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Position1, Optional<EndOfDayRequirement1>> mmRiskRequirement = new MMMessageAssociationEnd<Position1, Optional<EndOfDayRequirement1>>() {
		{
			businessElementTrace_lazy = () -> Security.mmRelatedMarginCall;
			componentContext_lazy = () -> com.tools20022.repository.msg.Position1.mmObject();
			isDerived = false;
			xmlTag = "RskRqrmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RiskRequirement";
			definition = "Obligations of a clearing member with respect to a central counterparty based on the position at end of day.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> EndOfDayRequirement1.mmObject();
		}

		@Override
		public Optional<EndOfDayRequirement1> getValue(Position1 obj) {
			return obj.getRiskRequirement();
		}

		@Override
		public void setValue(Position1 obj, Optional<EndOfDayRequirement1> value) {
			obj.setRiskRequirement(value.orElse(null));
		}
	};
	@XmlElement(name = "GrssNtnl", required = true)
	protected ActiveCurrencyAndAmount grossNotional;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Position1
	 * Position1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrssNtnl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossNotional"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Gross notional of positions of the product without netting of long/short positions, or delta equivalent notional for options.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Position1, ActiveCurrencyAndAmount> mmGrossNotional = new MMMessageAttribute<Position1, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> Derivative.mmNotionalCurrencyAndAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Position1.mmObject();
			isDerived = false;
			xmlTag = "GrssNtnl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossNotional";
			definition = "Gross notional of positions of the product without netting of long/short positions, or delta equivalent notional for options.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(Position1 obj) {
			return obj.getGrossNotional();
		}

		@Override
		public void setValue(Position1 obj, ActiveCurrencyAndAmount value) {
			obj.setGrossNotional(value);
		}
	};
	@XmlElement(name = "NetNtnl", required = true)
	protected AmountAndDirection6 netNotional;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmNotionalCurrencyAndAmount
	 * Derivative.mmNotionalCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Position1
	 * Position1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetNtnl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetNotional"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net notional of positions of the product with netting between long and short positions, or delta equivalent notional for options. Indicates whether net long position is positive."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Position1, AmountAndDirection6> mmNetNotional = new MMMessageAssociationEnd<Position1, AmountAndDirection6>() {
		{
			businessElementTrace_lazy = () -> Derivative.mmNotionalCurrencyAndAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Position1.mmObject();
			isDerived = false;
			xmlTag = "NetNtnl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetNotional";
			definition = "Net notional of positions of the product with netting between long and short positions, or delta equivalent notional for options. Indicates whether net long position is positive.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection6.mmObject();
		}

		@Override
		public AmountAndDirection6 getValue(Position1 obj) {
			return obj.getNetNotional();
		}

		@Override
		public void setValue(Position1 obj, AmountAndDirection6 value) {
			obj.setNetNotional(value);
		}
	};
	@XmlElement(name = "GrssDltaEqvtVal")
	protected ActiveCurrencyAndAmount grossDeltaEquivalentValue;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Position1
	 * Position1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrssDltaEqvtVal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDeltaEquivalentValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Change in value of position for a unit change in the index. Usage: for interest rate swaps the PV01 of the gross position, for credit default swaps the DV01 of the gross position, for index products with a fixed value per unit move, the total weighted value of a one unit move in the index for the gross contracts in the position, weighted by the delta of the contracts in the position.\r\n\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Position1, Optional<ActiveCurrencyAndAmount>> mmGrossDeltaEquivalentValue = new MMMessageAttribute<Position1, Optional<ActiveCurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Position1.mmObject();
			isDerived = false;
			xmlTag = "GrssDltaEqvtVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDeltaEquivalentValue";
			definition = "Change in value of position for a unit change in the index. Usage: for interest rate swaps the PV01 of the gross position, for credit default swaps the DV01 of the gross position, for index products with a fixed value per unit move, the total weighted value of a one unit move in the index for the gross contracts in the position, weighted by the delta of the contracts in the position.\r\n\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(Position1 obj) {
			return obj.getGrossDeltaEquivalentValue();
		}

		@Override
		public void setValue(Position1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setGrossDeltaEquivalentValue(value.orElse(null));
		}
	};
	@XmlElement(name = "NetDltaEqvtVal")
	protected AmountAndDirection6 netDeltaEquivalentValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Position1
	 * Position1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetDltaEqvtVal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetDeltaEquivalentValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Change in value of position for a unit change in the index. Usage: for interest rate swaps the PV01 of the net position, for credit default swaps the DV01 of the net position, for index products with a fixed value per unit move, the total weighted value of a one unit move in the index for the net contracts in the position, weighted by the delta of the contracts in the position. Indicates whether net long position is positive."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Position1, Optional<AmountAndDirection6>> mmNetDeltaEquivalentValue = new MMMessageAssociationEnd<Position1, Optional<AmountAndDirection6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Position1.mmObject();
			isDerived = false;
			xmlTag = "NetDltaEqvtVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDeltaEquivalentValue";
			definition = "Change in value of position for a unit change in the index. Usage: for interest rate swaps the PV01 of the net position, for credit default swaps the DV01 of the net position, for index products with a fixed value per unit move, the total weighted value of a one unit move in the index for the net contracts in the position, weighted by the delta of the contracts in the position. Indicates whether net long position is positive.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection6.mmObject();
		}

		@Override
		public Optional<AmountAndDirection6> getValue(Position1 obj) {
			return obj.getNetDeltaEquivalentValue();
		}

		@Override
		public void setValue(Position1 obj, Optional<AmountAndDirection6> value) {
			obj.setNetDeltaEquivalentValue(value.orElse(null));
		}
	};
	@XmlElement(name = "GrssDltaEqvtQty")
	protected NonNegativeDecimalNumberFraction5 grossDeltaEquivalentQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.NonNegativeDecimalNumberFraction5
	 * NonNegativeDecimalNumberFraction5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Position1
	 * Position1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrssDltaEqvtQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDeltaEquivalentQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Gross weighted quantity of the lots in the position weighted by the delta of the contracts in the position.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Position1, Optional<NonNegativeDecimalNumberFraction5>> mmGrossDeltaEquivalentQuantity = new MMMessageAttribute<Position1, Optional<NonNegativeDecimalNumberFraction5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Position1.mmObject();
			isDerived = false;
			xmlTag = "GrssDltaEqvtQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDeltaEquivalentQuantity";
			definition = "Gross weighted quantity of the lots in the position weighted by the delta of the contracts in the position.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NonNegativeDecimalNumberFraction5.mmObject();
		}

		@Override
		public Optional<NonNegativeDecimalNumberFraction5> getValue(Position1 obj) {
			return obj.getGrossDeltaEquivalentQuantity();
		}

		@Override
		public void setValue(Position1 obj, Optional<NonNegativeDecimalNumberFraction5> value) {
			obj.setGrossDeltaEquivalentQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "NetDltaEqvtQty")
	protected DecimalNumberFraction5 netDeltaEquivalentQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumberFraction5
	 * DecimalNumberFraction5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Position1
	 * Position1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetDltaEqvtQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetDeltaEquivalentQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net weighted quantity of the lots in the position weighted by the delta of the contracts in the position.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Position1, Optional<DecimalNumberFraction5>> mmNetDeltaEquivalentQuantity = new MMMessageAttribute<Position1, Optional<DecimalNumberFraction5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Position1.mmObject();
			isDerived = false;
			xmlTag = "NetDltaEqvtQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDeltaEquivalentQuantity";
			definition = "Net weighted quantity of the lots in the position weighted by the delta of the contracts in the position.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumberFraction5.mmObject();
		}

		@Override
		public Optional<DecimalNumberFraction5> getValue(Position1 obj) {
			return obj.getNetDeltaEquivalentQuantity();
		}

		@Override
		public void setValue(Position1 obj, Optional<DecimalNumberFraction5> value) {
			obj.setNetDeltaEquivalentQuantity(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Position1.mmProductIdentification, com.tools20022.repository.msg.Position1.mmRiskRequirement, com.tools20022.repository.msg.Position1.mmGrossNotional,
						com.tools20022.repository.msg.Position1.mmNetNotional, com.tools20022.repository.msg.Position1.mmGrossDeltaEquivalentValue, com.tools20022.repository.msg.Position1.mmNetDeltaEquivalentValue,
						com.tools20022.repository.msg.Position1.mmGrossDeltaEquivalentQuantity, com.tools20022.repository.msg.Position1.mmNetDeltaEquivalentQuantity);
				trace_lazy = () -> Security.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Position1";
				definition = "Attributes of a position in a financial instrument or financial product.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getProductIdentification() {
		return productIdentification;
	}

	public Position1 setProductIdentification(Max35Text productIdentification) {
		this.productIdentification = Objects.requireNonNull(productIdentification);
		return this;
	}

	public Optional<EndOfDayRequirement1> getRiskRequirement() {
		return riskRequirement == null ? Optional.empty() : Optional.of(riskRequirement);
	}

	public Position1 setRiskRequirement(EndOfDayRequirement1 riskRequirement) {
		this.riskRequirement = riskRequirement;
		return this;
	}

	public ActiveCurrencyAndAmount getGrossNotional() {
		return grossNotional;
	}

	public Position1 setGrossNotional(ActiveCurrencyAndAmount grossNotional) {
		this.grossNotional = Objects.requireNonNull(grossNotional);
		return this;
	}

	public AmountAndDirection6 getNetNotional() {
		return netNotional;
	}

	public Position1 setNetNotional(AmountAndDirection6 netNotional) {
		this.netNotional = Objects.requireNonNull(netNotional);
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getGrossDeltaEquivalentValue() {
		return grossDeltaEquivalentValue == null ? Optional.empty() : Optional.of(grossDeltaEquivalentValue);
	}

	public Position1 setGrossDeltaEquivalentValue(ActiveCurrencyAndAmount grossDeltaEquivalentValue) {
		this.grossDeltaEquivalentValue = grossDeltaEquivalentValue;
		return this;
	}

	public Optional<AmountAndDirection6> getNetDeltaEquivalentValue() {
		return netDeltaEquivalentValue == null ? Optional.empty() : Optional.of(netDeltaEquivalentValue);
	}

	public Position1 setNetDeltaEquivalentValue(AmountAndDirection6 netDeltaEquivalentValue) {
		this.netDeltaEquivalentValue = netDeltaEquivalentValue;
		return this;
	}

	public Optional<NonNegativeDecimalNumberFraction5> getGrossDeltaEquivalentQuantity() {
		return grossDeltaEquivalentQuantity == null ? Optional.empty() : Optional.of(grossDeltaEquivalentQuantity);
	}

	public Position1 setGrossDeltaEquivalentQuantity(NonNegativeDecimalNumberFraction5 grossDeltaEquivalentQuantity) {
		this.grossDeltaEquivalentQuantity = grossDeltaEquivalentQuantity;
		return this;
	}

	public Optional<DecimalNumberFraction5> getNetDeltaEquivalentQuantity() {
		return netDeltaEquivalentQuantity == null ? Optional.empty() : Optional.of(netDeltaEquivalentQuantity);
	}

	public Position1 setNetDeltaEquivalentQuantity(DecimalNumberFraction5 netDeltaEquivalentQuantity) {
		this.netDeltaEquivalentQuantity = netDeltaEquivalentQuantity;
		return this;
	}
}