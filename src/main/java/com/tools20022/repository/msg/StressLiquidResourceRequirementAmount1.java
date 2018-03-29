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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.CollateralMovement;
import com.tools20022.repository.entity.ExposureCalculation;
import com.tools20022.repository.entity.MarginAmountRequirement;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Assumed obligations that are required to be met in cash under a hypothetical
 * stress scenario.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StressLiquidResourceRequirementAmount1#mmOperationalOutflowAmount
 * StressLiquidResourceRequirementAmount1.mmOperationalOutflowAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StressLiquidResourceRequirementAmount1#mmVariationMarginPaymentObligationAmount
 * StressLiquidResourceRequirementAmount1.
 * mmVariationMarginPaymentObligationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StressLiquidResourceRequirementAmount1#mmSettlementOrDeliveryAmount
 * StressLiquidResourceRequirementAmount1.mmSettlementOrDeliveryAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StressLiquidResourceRequirementAmount1#mmOtherAmount
 * StressLiquidResourceRequirementAmount1.mmOtherAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement
 * MarginAmountRequirement}</li>
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
 * "StressLiquidResourceRequirementAmount1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Assumed obligations that are required to be met in cash under a hypothetical stress scenario."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StressLiquidResourceRequirementAmount1", propOrder = {"operationalOutflowAmount", "variationMarginPaymentObligationAmount", "settlementOrDeliveryAmount", "otherAmount"})
public class StressLiquidResourceRequirementAmount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OprlOutflwAmt", required = true)
	protected ActiveCurrencyAndAmount operationalOutflowAmount;
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
	 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement#mmDeliverMarginAmount
	 * MarginAmountRequirement.mmDeliverMarginAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StressLiquidResourceRequirementAmount1
	 * StressLiquidResourceRequirementAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OprlOutflwAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperationalOutflowAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Liquidity needs arising from ‘operational’ procedures over the stress horizon. This includes (but is not necessarily limited to) repayment of excess cash collateral to members, cash to non‐cash collateral substitutions by members, reductions in margin requirements and related cash collateral and provision of liquidity to facilitate settlement / delivery for non‐defaulting members."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StressLiquidResourceRequirementAmount1, ActiveCurrencyAndAmount> mmOperationalOutflowAmount = new MMMessageAttribute<StressLiquidResourceRequirementAmount1, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> MarginAmountRequirement.mmDeliverMarginAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.StressLiquidResourceRequirementAmount1.mmObject();
			isDerived = false;
			xmlTag = "OprlOutflwAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperationalOutflowAmount";
			definition = "Liquidity needs arising from ‘operational’ procedures over the stress horizon. This includes (but is not necessarily limited to) repayment of excess cash collateral to members, cash to non‐cash collateral substitutions by members, reductions in margin requirements and related cash collateral and provision of liquidity to facilitate settlement / delivery for non‐defaulting members.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(StressLiquidResourceRequirementAmount1 obj) {
			return obj.getOperationalOutflowAmount();
		}

		@Override
		public void setValue(StressLiquidResourceRequirementAmount1 obj, ActiveCurrencyAndAmount value) {
			obj.setOperationalOutflowAmount(value);
		}
	};
	@XmlElement(name = "VartnMrgnPmtOblgtnAmt", required = true)
	protected ActiveCurrencyAndAmount variationMarginPaymentObligationAmount;
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
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmCurrentVariationMargin
	 * ExposureCalculation.mmCurrentVariationMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StressLiquidResourceRequirementAmount1
	 * StressLiquidResourceRequirementAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VartnMrgnPmtOblgtnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMarginPaymentObligationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Variation margin payment obligation of the CCP that is modelled to arise due to the default of CM1 and CM2 over the stress horizon.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StressLiquidResourceRequirementAmount1, ActiveCurrencyAndAmount> mmVariationMarginPaymentObligationAmount = new MMMessageAttribute<StressLiquidResourceRequirementAmount1, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmCurrentVariationMargin;
			componentContext_lazy = () -> com.tools20022.repository.msg.StressLiquidResourceRequirementAmount1.mmObject();
			isDerived = false;
			xmlTag = "VartnMrgnPmtOblgtnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginPaymentObligationAmount";
			definition = "Variation margin payment obligation of the CCP that is modelled to arise due to the default of CM1 and CM2 over the stress horizon.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(StressLiquidResourceRequirementAmount1 obj) {
			return obj.getVariationMarginPaymentObligationAmount();
		}

		@Override
		public void setValue(StressLiquidResourceRequirementAmount1 obj, ActiveCurrencyAndAmount value) {
			obj.setVariationMarginPaymentObligationAmount(value);
		}
	};
	@XmlElement(name = "SttlmOrDlvryAmt", required = true)
	protected ActiveCurrencyAndAmount settlementOrDeliveryAmount;
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
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmSegregatedIndependentAmount
	 * CollateralMovement.mmSegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StressLiquidResourceRequirementAmount1
	 * StressLiquidResourceRequirementAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmOrDlvryAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementOrDeliveryAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Liquidity needed by the CCP to fulfil the settlement/delivery obligations arising from the cleared trades of defaulting CM1 and CM2.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StressLiquidResourceRequirementAmount1, ActiveCurrencyAndAmount> mmSettlementOrDeliveryAmount = new MMMessageAttribute<StressLiquidResourceRequirementAmount1, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> CollateralMovement.mmSegregatedIndependentAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.StressLiquidResourceRequirementAmount1.mmObject();
			isDerived = false;
			xmlTag = "SttlmOrDlvryAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementOrDeliveryAmount";
			definition = "Liquidity needed by the CCP to fulfil the settlement/delivery obligations arising from the cleared trades of defaulting CM1 and CM2.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(StressLiquidResourceRequirementAmount1 obj) {
			return obj.getSettlementOrDeliveryAmount();
		}

		@Override
		public void setValue(StressLiquidResourceRequirementAmount1 obj, ActiveCurrencyAndAmount value) {
			obj.setSettlementOrDeliveryAmount(value);
		}
	};
	@XmlElement(name = "OthrAmt", required = true)
	protected ActiveCurrencyAndAmount otherAmount;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StressLiquidResourceRequirementAmount1
	 * StressLiquidResourceRequirementAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the other liquidity requirements not captured elsewhere. \r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StressLiquidResourceRequirementAmount1, ActiveCurrencyAndAmount> mmOtherAmount = new MMMessageAttribute<StressLiquidResourceRequirementAmount1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StressLiquidResourceRequirementAmount1.mmObject();
			isDerived = false;
			xmlTag = "OthrAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAmount";
			definition = "Specifies the other liquidity requirements not captured elsewhere. \r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(StressLiquidResourceRequirementAmount1 obj) {
			return obj.getOtherAmount();
		}

		@Override
		public void setValue(StressLiquidResourceRequirementAmount1 obj, ActiveCurrencyAndAmount value) {
			obj.setOtherAmount(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StressLiquidResourceRequirementAmount1.mmOperationalOutflowAmount,
						com.tools20022.repository.msg.StressLiquidResourceRequirementAmount1.mmVariationMarginPaymentObligationAmount, com.tools20022.repository.msg.StressLiquidResourceRequirementAmount1.mmSettlementOrDeliveryAmount,
						com.tools20022.repository.msg.StressLiquidResourceRequirementAmount1.mmOtherAmount);
				trace_lazy = () -> MarginAmountRequirement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "StressLiquidResourceRequirementAmount1";
				definition = "Assumed obligations that are required to be met in cash under a hypothetical stress scenario.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getOperationalOutflowAmount() {
		return operationalOutflowAmount;
	}

	public StressLiquidResourceRequirementAmount1 setOperationalOutflowAmount(ActiveCurrencyAndAmount operationalOutflowAmount) {
		this.operationalOutflowAmount = Objects.requireNonNull(operationalOutflowAmount);
		return this;
	}

	public ActiveCurrencyAndAmount getVariationMarginPaymentObligationAmount() {
		return variationMarginPaymentObligationAmount;
	}

	public StressLiquidResourceRequirementAmount1 setVariationMarginPaymentObligationAmount(ActiveCurrencyAndAmount variationMarginPaymentObligationAmount) {
		this.variationMarginPaymentObligationAmount = Objects.requireNonNull(variationMarginPaymentObligationAmount);
		return this;
	}

	public ActiveCurrencyAndAmount getSettlementOrDeliveryAmount() {
		return settlementOrDeliveryAmount;
	}

	public StressLiquidResourceRequirementAmount1 setSettlementOrDeliveryAmount(ActiveCurrencyAndAmount settlementOrDeliveryAmount) {
		this.settlementOrDeliveryAmount = Objects.requireNonNull(settlementOrDeliveryAmount);
		return this;
	}

	public ActiveCurrencyAndAmount getOtherAmount() {
		return otherAmount;
	}

	public StressLiquidResourceRequirementAmount1 setOtherAmount(ActiveCurrencyAndAmount otherAmount) {
		this.otherAmount = Objects.requireNonNull(otherAmount);
		return this;
	}
}