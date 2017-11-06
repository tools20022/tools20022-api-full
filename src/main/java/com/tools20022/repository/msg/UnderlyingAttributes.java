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
import com.tools20022.repository.choice.UnitOrFaceAmountChoice;
import com.tools20022.repository.codeset.SettlementType1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Asset;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnderlyingAttributes"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional details on the underlying. In securities financing deals, it is used to identify and provide information on the collateral."
 * </li>
 * </ul>
 */
public class UnderlyingAttributes {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PercentageRate allocationPercent;
	/**
	 * Percent of the Strike Price that this underlying represents.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationPercent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percent of the Strike Price that this underlying represents."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAllocationPercent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Allocation.mmPercentage;
			componentContext_lazy = () -> UnderlyingAttributes.mmObject();
			isDerived = false;
			xmlTag = "AllcnPct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationPercent";
			definition = "Percent of the Strike Price that this underlying represents.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected UnitOrFaceAmountChoice quantity;
	/**
	 * Unit amount of the underlying security.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unit amount of the underlying security."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Security.mmSecuritiesQuantity;
			componentContext_lazy = () -> UnderlyingAttributes.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Unit amount of the underlying security.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UnitOrFaceAmountChoice.mmObject();
		}
	};
	protected SettlementType1Code settlementType;
	/**
	 * Indicates order settlement period for the underlying instrument.
	 * Represents the number of days until settlement; e.g., 2 means T+1
	 * settlement, 4 means T+3 settlement, 5 means T+4 settlement.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates order settlement period for the underlying instrument. Represents the number of days until settlement; e.g., 2 means T+1 settlement, 4 means T+3 settlement, 5 means T+4 settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Option.mmSettlementType;
			componentContext_lazy = () -> UnderlyingAttributes.mmObject();
			isDerived = false;
			xmlTag = "SttlmTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementType";
			definition = "Indicates order settlement period for the underlying instrument. Represents the number of days until settlement; e.g., 2 means T+1 settlement, 4 means T+3 settlement, 5 means T+4 settlement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SettlementType1Code.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount cashAmount;
	/**
	 * Cash amount associated with the underlying component. Necessary for
	 * derivatives that deliver into more than one underlying instrument and one
	 * of the underlying's is a fixed cash value.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash amount associated with the underlying component. Necessary for derivatives that deliver into more than one underlying instrument and one of the underlying's is a fixed cash value."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Derivative.mmNotionalCurrencyAndAmount;
			componentContext_lazy = () -> UnderlyingAttributes.mmObject();
			isDerived = false;
			xmlTag = "CshAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAmount";
			definition = "Cash amount associated with the underlying component. Necessary for derivatives that deliver into more than one underlying instrument and one of the underlying's is a fixed cash value.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected Max35Text cashType;
	/**
	 * Represents how the cash will be calculated. Indicates that the cash is
	 * either fixed or a difference value (difference between strike and current
	 * underlying price).
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Represents how the cash will be calculated. Indicates that the cash is either fixed or a difference value (difference between strike and current underlying price)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UnderlyingAttributes.mmObject();
			isDerived = false;
			xmlTag = "CshTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashType";
			definition = "Represents how the cash will be calculated. Indicates that the cash is either fixed or a difference value (difference between strike and current underlying price).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Price1 price;
	/**
	 * In a financing deal, clean price (percent-of-par or per unit) of the
	 * underlying security or basket.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a financing deal, clean price (percent-of-par or per unit) of the underlying security or basket."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Security.mmPricing;
			componentContext_lazy = () -> UnderlyingAttributes.mmObject();
			isDerived = false;
			xmlTag = "Pric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Price";
			definition = "In a financing deal, clean price (percent-of-par or per unit) of the underlying security or basket.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price1.mmObject();
		}
	};
	protected Price1 dirtyPrice;
	/**
	 * In a financing deal, price (percent-of-par or per unit) of the underlying
	 * security or basket. "Dirty" means it includes accrued interest.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirtyPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a financing deal, price (percent-of-par or per unit) of the underlying security or basket. \"Dirty\" means it includes accrued interest."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDirtyPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Debt.mmDirtyPrice;
			componentContext_lazy = () -> UnderlyingAttributes.mmObject();
			isDerived = false;
			xmlTag = "DrtyPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirtyPrice";
			definition = "In a financing deal, price (percent-of-par or per unit) of the underlying security or basket. \"Dirty\" means it includes accrued interest.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price1.mmObject();
		}
	};
	protected Price1 endPrice;
	/**
	 * In a financing deal, price (percent-of-par or per unit) of the underlying
	 * security or basket at the end of the agreement.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a financing deal, price (percent-of-par or per unit) of the underlying security or basket at the end of the agreement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEndPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Security.mmPricing;
			componentContext_lazy = () -> UnderlyingAttributes.mmObject();
			isDerived = false;
			xmlTag = "EndPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndPrice";
			definition = "In a financing deal, price (percent-of-par or per unit) of the underlying security or basket at the end of the agreement.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price1.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount startValue;
	/**
	 * Currency value attributed to this collateral at the start of the
	 * agreement.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency value attributed to this collateral at the start of the agreement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStartValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Collateral.mmValuation;
			componentContext_lazy = () -> UnderlyingAttributes.mmObject();
			isDerived = false;
			xmlTag = "StartVal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StartValue";
			definition = "Currency value attributed to this collateral at the start of the agreement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount currentValue;
	/**
	 * Currency value currently attributed to this collateral.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency value currently attributed to this collateral."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Collateral.mmValuation;
			componentContext_lazy = () -> UnderlyingAttributes.mmObject();
			isDerived = false;
			xmlTag = "CurVal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentValue";
			definition = "Currency value currently attributed to this collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount endValue;
	/**
	 * Currency value attributed to this collateral at the end of the agreement.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency value attributed to this collateral at the end of the agreement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEndValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Collateral.mmValuation;
			componentContext_lazy = () -> UnderlyingAttributes.mmObject();
			isDerived = false;
			xmlTag = "EndVal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndValue";
			definition = "Currency value attributed to this collateral at the end of the agreement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected UnitOrFaceAmountChoice adjustedQuantity;
	/**
	 * Unit amount of the underlying security (shares) adjusted for pending
	 * corporate action not yet allocated.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit amount of the underlying security (shares) adjusted for pending corporate action not yet allocated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdjustedQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Security.mmSecuritiesQuantity;
			componentContext_lazy = () -> UnderlyingAttributes.mmObject();
			isDerived = false;
			xmlTag = "AdjstdQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustedQuantity";
			definition = "Unit amount of the underlying security (shares) adjusted for pending corporate action not yet allocated.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UnitOrFaceAmountChoice.mmObject();
		}
	};
	protected PercentageRate exchangeRate;
	/**
	 * Foreign exchange rate used to compute the current value.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Foreign exchange rate used to compute the current value."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangeRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmExchangeRate;
			componentContext_lazy = () -> UnderlyingAttributes.mmObject();
			isDerived = false;
			xmlTag = "XchgRate";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRate";
			definition = "Foreign exchange rate used to compute the current value.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount capValue;
	/**
	 * Maximum notional value for a capped financial instrument.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum notional value for a capped financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCapValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmCapValue;
			componentContext_lazy = () -> UnderlyingAttributes.mmObject();
			isDerived = false;
			xmlTag = "CapVal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapValue";
			definition = "Maximum notional value for a capped financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
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
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "UnderlyingAttributes";
				definition = "Provides additional details on the underlying. In securities financing deals, it is used to identify and provide information on the collateral.";
			}
		});
		return mmObject_lazy.get();
	}

	public PercentageRate getAllocationPercent() {
		return allocationPercent;
	}

	public void setAllocationPercent(PercentageRate allocationPercent) {
		this.allocationPercent = allocationPercent;
	}

	public UnitOrFaceAmountChoice getQuantity() {
		return quantity;
	}

	public void setQuantity(UnitOrFaceAmountChoice quantity) {
		this.quantity = quantity;
	}

	public SettlementType1Code getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(SettlementType1Code settlementType) {
		this.settlementType = settlementType;
	}

	public ActiveCurrencyAndAmount getCashAmount() {
		return cashAmount;
	}

	public void setCashAmount(ActiveCurrencyAndAmount cashAmount) {
		this.cashAmount = cashAmount;
	}

	public Max35Text getCashType() {
		return cashType;
	}

	public void setCashType(Max35Text cashType) {
		this.cashType = cashType;
	}

	public Price1 getPrice() {
		return price;
	}

	public void setPrice(com.tools20022.repository.msg.Price1 price) {
		this.price = price;
	}

	public Price1 getDirtyPrice() {
		return dirtyPrice;
	}

	public void setDirtyPrice(com.tools20022.repository.msg.Price1 dirtyPrice) {
		this.dirtyPrice = dirtyPrice;
	}

	public Price1 getEndPrice() {
		return endPrice;
	}

	public void setEndPrice(com.tools20022.repository.msg.Price1 endPrice) {
		this.endPrice = endPrice;
	}

	public ActiveCurrencyAndAmount getStartValue() {
		return startValue;
	}

	public void setStartValue(ActiveCurrencyAndAmount startValue) {
		this.startValue = startValue;
	}

	public ActiveCurrencyAndAmount getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(ActiveCurrencyAndAmount currentValue) {
		this.currentValue = currentValue;
	}

	public ActiveCurrencyAndAmount getEndValue() {
		return endValue;
	}

	public void setEndValue(ActiveCurrencyAndAmount endValue) {
		this.endValue = endValue;
	}

	public UnitOrFaceAmountChoice getAdjustedQuantity() {
		return adjustedQuantity;
	}

	public void setAdjustedQuantity(UnitOrFaceAmountChoice adjustedQuantity) {
		this.adjustedQuantity = adjustedQuantity;
	}

	public PercentageRate getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(PercentageRate exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public ActiveCurrencyAndAmount getCapValue() {
		return capValue;
	}

	public void setCapValue(ActiveCurrencyAndAmount capValue) {
		this.capValue = capValue;
	}
}