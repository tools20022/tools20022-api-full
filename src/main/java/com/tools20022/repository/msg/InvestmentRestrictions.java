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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Security that is a sub-set of an investment fund, and is governed by the same
 * investment fund policy, eg, dividend option or valuation currency.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions#mmMinimumInitialSubscriptionAmount
 * InvestmentRestrictions.mmMinimumInitialSubscriptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions#mmMinimumInitialSubscriptionUnits
 * InvestmentRestrictions.mmMinimumInitialSubscriptionUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions#mmMinimumSubsequentSubscriptionAmount
 * InvestmentRestrictions.mmMinimumSubsequentSubscriptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions#mmMinimumSubsequentSubscriptionUnits
 * InvestmentRestrictions.mmMinimumSubsequentSubscriptionUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions#mmMaximumRedemptionAmount
 * InvestmentRestrictions.mmMaximumRedemptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions#mmMaximumRedemptionUnits
 * InvestmentRestrictions.mmMaximumRedemptionUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions#mmOtherRedemptionRestrictions
 * InvestmentRestrictions.mmOtherRedemptionRestrictions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions#mmMinimumHoldingAmount
 * InvestmentRestrictions.mmMinimumHoldingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions#mmMinimumHoldingUnits
 * InvestmentRestrictions.mmMinimumHoldingUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions#mmMinimumHoldingPeriod
 * InvestmentRestrictions.mmMinimumHoldingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions#mmHoldingTransferableIndicator
 * InvestmentRestrictions.mmHoldingTransferableIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
 * InvestmentFundClassProcessingCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentRestrictions"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, eg, dividend option or valuation currency."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestmentRestrictions", propOrder = {"minimumInitialSubscriptionAmount", "minimumInitialSubscriptionUnits", "minimumSubsequentSubscriptionAmount", "minimumSubsequentSubscriptionUnits", "maximumRedemptionAmount",
		"maximumRedemptionUnits", "otherRedemptionRestrictions", "minimumHoldingAmount", "minimumHoldingUnits", "minimumHoldingPeriod", "holdingTransferableIndicator"})
public class InvestmentRestrictions {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MinInitlSbcptAmt")
	protected ActiveCurrencyAndAmount minimumInitialSubscriptionAmount;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMinimumInitialSubscriptionAmount
	 * InvestmentFundClassProcessingCharacteristics.
	 * mmMinimumInitialSubscriptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions
	 * InvestmentRestrictions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinInitlSbcptAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumInitialSubscriptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum initial quantity of securities, expressed as an amount that must be purchased at subscription."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumInitialSubscriptionAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmMinimumInitialSubscriptionAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentRestrictions.mmObject();
			isDerived = false;
			xmlTag = "MinInitlSbcptAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumInitialSubscriptionAmount";
			definition = "Minimum initial quantity of securities, expressed as an amount that must be purchased at subscription.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "MinInitlSbcptUnits")
	protected Number minimumInitialSubscriptionUnits;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMinimumInitialSubscriptionUnits
	 * InvestmentFundClassProcessingCharacteristics.
	 * mmMinimumInitialSubscriptionUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions
	 * InvestmentRestrictions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinInitlSbcptUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumInitialSubscriptionUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum initial number of units/shares that must be purchased."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumInitialSubscriptionUnits = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmMinimumInitialSubscriptionUnits;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentRestrictions.mmObject();
			isDerived = false;
			xmlTag = "MinInitlSbcptUnits";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumInitialSubscriptionUnits";
			definition = "Minimum initial number of units/shares that must be purchased.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "MinSbsqntSbcptAmt")
	protected ActiveCurrencyAndAmount minimumSubsequentSubscriptionAmount;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMinimumSubscriptionAmount
	 * InvestmentFundClassProcessingCharacteristics.mmMinimumSubscriptionAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions
	 * InvestmentRestrictions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinSbsqntSbcptAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSubsequentSubscriptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities, expressed as an amount that must be purchased."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumSubsequentSubscriptionAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmMinimumSubscriptionAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentRestrictions.mmObject();
			isDerived = false;
			xmlTag = "MinSbsqntSbcptAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSubsequentSubscriptionAmount";
			definition = "Minimum quantity of securities, expressed as an amount that must be purchased.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "MinSbsqntSbcptUnits")
	protected Number minimumSubsequentSubscriptionUnits;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMinimumSubscriptionUnits
	 * InvestmentFundClassProcessingCharacteristics.mmMinimumSubscriptionUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions
	 * InvestmentRestrictions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinSbsqntSbcptUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSubsequentSubscriptionUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities, expressed as number of units/shares that must be purchased."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumSubsequentSubscriptionUnits = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmMinimumSubscriptionUnits;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentRestrictions.mmObject();
			isDerived = false;
			xmlTag = "MinSbsqntSbcptUnits";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSubsequentSubscriptionUnits";
			definition = "Minimum quantity of securities, expressed as number of units/shares that must be purchased.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "MaxRedAmt")
	protected ActiveCurrencyAndAmount maximumRedemptionAmount;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMaximumRedemptionAmount
	 * InvestmentFundClassProcessingCharacteristics.mmMaximumRedemptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions
	 * InvestmentRestrictions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxRedAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumRedemptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum quantity of securities, expressed as an amount that can be sold."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumRedemptionAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmMaximumRedemptionAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentRestrictions.mmObject();
			isDerived = false;
			xmlTag = "MaxRedAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumRedemptionAmount";
			definition = "Maximum quantity of securities, expressed as an amount that can be sold.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "MaxRedUnits")
	protected Number maximumRedemptionUnits;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMaximumRedemptionUnits
	 * InvestmentFundClassProcessingCharacteristics.mmMaximumRedemptionUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions
	 * InvestmentRestrictions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxRedUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumRedemptionUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum number of shares/units that may be redeemed on a single dealing day."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumRedemptionUnits = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmMaximumRedemptionUnits;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentRestrictions.mmObject();
			isDerived = false;
			xmlTag = "MaxRedUnits";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumRedemptionUnits";
			definition = "Maximum number of shares/units that may be redeemed on a single dealing day.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "OthrRedRstrctns")
	protected Max350Text otherRedemptionRestrictions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions
	 * InvestmentRestrictions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrRedRstrctns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherRedemptionRestrictions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies any other restrictions that may limit an investor's ability to redeem."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOtherRedemptionRestrictions = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentRestrictions.mmObject();
			isDerived = false;
			xmlTag = "OthrRedRstrctns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherRedemptionRestrictions";
			definition = "Specifies any other restrictions that may limit an investor's ability to redeem.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "MinHldgAmt")
	protected ActiveCurrencyAndAmount minimumHoldingAmount;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMinimumHoldingAmount
	 * InvestmentFundClassProcessingCharacteristics.mmMinimumHoldingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions
	 * InvestmentRestrictions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinHldgAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumHoldingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum value of units that must be maintained to avoid automatic redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumHoldingAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmMinimumHoldingAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentRestrictions.mmObject();
			isDerived = false;
			xmlTag = "MinHldgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumHoldingAmount";
			definition = "Minimum value of units that must be maintained to avoid automatic redemption.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "MinHldgUnits")
	protected DecimalNumber minimumHoldingUnits;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMinimumHoldingUnits
	 * InvestmentFundClassProcessingCharacteristics.mmMinimumHoldingUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions
	 * InvestmentRestrictions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinHldgUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumHoldingUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum number of units that must be maintained to avoid automatic redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumHoldingUnits = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmMinimumHoldingUnits;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentRestrictions.mmObject();
			isDerived = false;
			xmlTag = "MinHldgUnits";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumHoldingUnits";
			definition = "Minimum number of units that must be maintained to avoid automatic redemption.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	@XmlElement(name = "MinHldgPrd")
	protected Max70Text minimumHoldingPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMinimumHoldingPeriod
	 * InvestmentFundClassProcessingCharacteristics.mmMinimumHoldingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions
	 * InvestmentRestrictions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinHldgPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumHoldingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Description of a period, that may be a number of days, weeks or descriptive period during which the units/shares must be held following their issue before redemption will be permitted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumHoldingPeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmMinimumHoldingPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentRestrictions.mmObject();
			isDerived = false;
			xmlTag = "MinHldgPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumHoldingPeriod";
			definition = "Description of a period, that may be a number of days, weeks or descriptive period during which the units/shares must be held following their issue before redemption will be permitted.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	@XmlElement(name = "HldgTrfblInd", required = true)
	protected YesNoIndicator holdingTransferableIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmHoldingTransferableIndicator
	 * InvestmentFundClassProcessingCharacteristics.
	 * mmHoldingTransferableIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentRestrictions
	 * InvestmentRestrictions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldgTrfblInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingTransferableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether registered investors are able to transfer some or all of their holdings to third parties."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHoldingTransferableIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmHoldingTransferableIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentRestrictions.mmObject();
			isDerived = false;
			xmlTag = "HldgTrfblInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingTransferableIndicator";
			definition = "Indicates whether registered investors are able to transfer some or all of their holdings to third parties.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentRestrictions.mmMinimumInitialSubscriptionAmount, com.tools20022.repository.msg.InvestmentRestrictions.mmMinimumInitialSubscriptionUnits,
						com.tools20022.repository.msg.InvestmentRestrictions.mmMinimumSubsequentSubscriptionAmount, com.tools20022.repository.msg.InvestmentRestrictions.mmMinimumSubsequentSubscriptionUnits,
						com.tools20022.repository.msg.InvestmentRestrictions.mmMaximumRedemptionAmount, com.tools20022.repository.msg.InvestmentRestrictions.mmMaximumRedemptionUnits,
						com.tools20022.repository.msg.InvestmentRestrictions.mmOtherRedemptionRestrictions, com.tools20022.repository.msg.InvestmentRestrictions.mmMinimumHoldingAmount,
						com.tools20022.repository.msg.InvestmentRestrictions.mmMinimumHoldingUnits, com.tools20022.repository.msg.InvestmentRestrictions.mmMinimumHoldingPeriod,
						com.tools20022.repository.msg.InvestmentRestrictions.mmHoldingTransferableIndicator);
				trace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "InvestmentRestrictions";
				definition = "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, eg, dividend option or valuation currency.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ActiveCurrencyAndAmount> getMinimumInitialSubscriptionAmount() {
		return minimumInitialSubscriptionAmount == null ? Optional.empty() : Optional.of(minimumInitialSubscriptionAmount);
	}

	public InvestmentRestrictions setMinimumInitialSubscriptionAmount(ActiveCurrencyAndAmount minimumInitialSubscriptionAmount) {
		this.minimumInitialSubscriptionAmount = minimumInitialSubscriptionAmount;
		return this;
	}

	public Optional<Number> getMinimumInitialSubscriptionUnits() {
		return minimumInitialSubscriptionUnits == null ? Optional.empty() : Optional.of(minimumInitialSubscriptionUnits);
	}

	public InvestmentRestrictions setMinimumInitialSubscriptionUnits(Number minimumInitialSubscriptionUnits) {
		this.minimumInitialSubscriptionUnits = minimumInitialSubscriptionUnits;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getMinimumSubsequentSubscriptionAmount() {
		return minimumSubsequentSubscriptionAmount == null ? Optional.empty() : Optional.of(minimumSubsequentSubscriptionAmount);
	}

	public InvestmentRestrictions setMinimumSubsequentSubscriptionAmount(ActiveCurrencyAndAmount minimumSubsequentSubscriptionAmount) {
		this.minimumSubsequentSubscriptionAmount = minimumSubsequentSubscriptionAmount;
		return this;
	}

	public Optional<Number> getMinimumSubsequentSubscriptionUnits() {
		return minimumSubsequentSubscriptionUnits == null ? Optional.empty() : Optional.of(minimumSubsequentSubscriptionUnits);
	}

	public InvestmentRestrictions setMinimumSubsequentSubscriptionUnits(Number minimumSubsequentSubscriptionUnits) {
		this.minimumSubsequentSubscriptionUnits = minimumSubsequentSubscriptionUnits;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getMaximumRedemptionAmount() {
		return maximumRedemptionAmount == null ? Optional.empty() : Optional.of(maximumRedemptionAmount);
	}

	public InvestmentRestrictions setMaximumRedemptionAmount(ActiveCurrencyAndAmount maximumRedemptionAmount) {
		this.maximumRedemptionAmount = maximumRedemptionAmount;
		return this;
	}

	public Optional<Number> getMaximumRedemptionUnits() {
		return maximumRedemptionUnits == null ? Optional.empty() : Optional.of(maximumRedemptionUnits);
	}

	public InvestmentRestrictions setMaximumRedemptionUnits(Number maximumRedemptionUnits) {
		this.maximumRedemptionUnits = maximumRedemptionUnits;
		return this;
	}

	public Optional<Max350Text> getOtherRedemptionRestrictions() {
		return otherRedemptionRestrictions == null ? Optional.empty() : Optional.of(otherRedemptionRestrictions);
	}

	public InvestmentRestrictions setOtherRedemptionRestrictions(Max350Text otherRedemptionRestrictions) {
		this.otherRedemptionRestrictions = otherRedemptionRestrictions;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getMinimumHoldingAmount() {
		return minimumHoldingAmount == null ? Optional.empty() : Optional.of(minimumHoldingAmount);
	}

	public InvestmentRestrictions setMinimumHoldingAmount(ActiveCurrencyAndAmount minimumHoldingAmount) {
		this.minimumHoldingAmount = minimumHoldingAmount;
		return this;
	}

	public Optional<DecimalNumber> getMinimumHoldingUnits() {
		return minimumHoldingUnits == null ? Optional.empty() : Optional.of(minimumHoldingUnits);
	}

	public InvestmentRestrictions setMinimumHoldingUnits(DecimalNumber minimumHoldingUnits) {
		this.minimumHoldingUnits = minimumHoldingUnits;
		return this;
	}

	public Optional<Max70Text> getMinimumHoldingPeriod() {
		return minimumHoldingPeriod == null ? Optional.empty() : Optional.of(minimumHoldingPeriod);
	}

	public InvestmentRestrictions setMinimumHoldingPeriod(Max70Text minimumHoldingPeriod) {
		this.minimumHoldingPeriod = minimumHoldingPeriod;
		return this;
	}

	public YesNoIndicator getHoldingTransferableIndicator() {
		return holdingTransferableIndicator;
	}

	public InvestmentRestrictions setHoldingTransferableIndicator(YesNoIndicator holdingTransferableIndicator) {
		this.holdingTransferableIndicator = Objects.requireNonNull(holdingTransferableIndicator);
		return this;
	}
}