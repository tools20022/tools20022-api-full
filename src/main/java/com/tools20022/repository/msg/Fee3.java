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
import com.tools20022.repository.choice.ChargeType5Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.entity.Charges;
import com.tools20022.repository.entity.Commission;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Amount of money associated with a service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Fee3#mmType Fee3.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fee3#mmRepairedStandardAmount
 * Fee3.mmRepairedStandardAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fee3#mmRepairedStandardRate
 * Fee3.mmRepairedStandardRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fee3#mmRepairedDiscountAmount
 * Fee3.mmRepairedDiscountAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fee3#mmRepairedDiscountRate
 * Fee3.mmRepairedDiscountRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fee3#mmRepairedRequestedAmount
 * Fee3.mmRepairedRequestedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fee3#mmRepairedRequestedRate
 * Fee3.mmRepairedRequestedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Fee3#mmCommercialAgreementReference
 * Fee3.mmCommercialAgreementReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Fee3#mmNewCommercialAgreementReferenceIndicator
 * Fee3.mmNewCommercialAgreementReferenceIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCommercialAgreementRule#forFee3
 * ConstraintCommercialAgreementRule.forFee3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintFeeElementRule#forFee3
 * ConstraintFeeElementRule.forFee3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Fee3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Amount of money associated with a service."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Charge19
 * Charge19}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Fee3", propOrder = {"type", "repairedStandardAmount", "repairedStandardRate", "repairedDiscountAmount", "repairedDiscountRate", "repairedRequestedAmount", "repairedRequestedRate", "commercialAgreementReference",
		"newCommercialAgreementReferenceIndicator"})
public class Fee3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp")
	protected ChargeType5Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ChargeType5Choice
	 * ChargeType5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmChargeType
	 * Charges.mmChargeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fee3 Fee3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of fee (charge/commission)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Fee3, Optional<ChargeType5Choice>> mmType = new MMMessageAttribute<Fee3, Optional<ChargeType5Choice>>() {
		{
			businessElementTrace_lazy = () -> Charges.mmChargeType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Fee3.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of fee (charge/commission).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ChargeType5Choice.mmObject();
		}

		@Override
		public Optional<ChargeType5Choice> getValue(Fee3 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Fee3 obj, Optional<ChargeType5Choice> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "RprdStdAmt")
	protected ActiveCurrencyAndAmount repairedStandardAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fee3 Fee3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RprdStdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepairedStandardAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modified value of the standard fee (charge/commission) amount applied on the order (the standard fee (charge/commission) amount in the original individual order that has been repaired so that the order can be accepted)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Fee3, Optional<ActiveCurrencyAndAmount>> mmRepairedStandardAmount = new MMMessageAttribute<Fee3, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Fee3.mmObject();
			isDerived = false;
			xmlTag = "RprdStdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepairedStandardAmount";
			definition = "Modified value of the standard fee (charge/commission) amount applied on the order (the standard fee (charge/commission) amount in the original individual order that has been repaired so that the order can be accepted).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(Fee3 obj) {
			return obj.getRepairedStandardAmount();
		}

		@Override
		public void setValue(Fee3 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setRepairedStandardAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "RprdStdRate")
	protected PercentageRate repairedStandardRate;
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
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmChargeRate
	 * Adjustment.mmChargeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fee3 Fee3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RprdStdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepairedStandardRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modified value of the standard fee (charge/commission) rate applied on the order (the standard fee (charge/commission) rate in the original individual order that has been repaired so that the order can be accepted)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Fee3, Optional<PercentageRate>> mmRepairedStandardRate = new MMMessageAttribute<Fee3, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmChargeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Fee3.mmObject();
			isDerived = false;
			xmlTag = "RprdStdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepairedStandardRate";
			definition = "Modified value of the standard fee (charge/commission) rate applied on the order (the standard fee (charge/commission) rate in the original individual order that has been repaired so that the order can be accepted).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(Fee3 obj) {
			return obj.getRepairedStandardRate();
		}

		@Override
		public void setValue(Fee3 obj, Optional<PercentageRate> value) {
			obj.setRepairedStandardRate(value.orElse(null));
		}
	};
	@XmlElement(name = "RprdDscntAmt")
	protected ActiveCurrencyAndAmount repairedDiscountAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fee3 Fee3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RprdDscntAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepairedDiscountAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modified value of the discount amount applied on the order (the discount amount in the original individual order that has been repaired so that the order can be accepted)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Fee3, Optional<ActiveCurrencyAndAmount>> mmRepairedDiscountAmount = new MMMessageAttribute<Fee3, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Fee3.mmObject();
			isDerived = false;
			xmlTag = "RprdDscntAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepairedDiscountAmount";
			definition = "Modified value of the discount amount applied on the order (the discount amount in the original individual order that has been repaired so that the order can be accepted).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(Fee3 obj) {
			return obj.getRepairedDiscountAmount();
		}

		@Override
		public void setValue(Fee3 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setRepairedDiscountAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "RprdDscntRate")
	protected PercentageRate repairedDiscountRate;
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
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmChargeRate
	 * Adjustment.mmChargeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fee3 Fee3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RprdDscntRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepairedDiscountRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modified value of the discount rate applied on the order (the discount rate in the original individual order that has been repaired so that the order can be accepted)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Fee3, Optional<PercentageRate>> mmRepairedDiscountRate = new MMMessageAttribute<Fee3, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmChargeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Fee3.mmObject();
			isDerived = false;
			xmlTag = "RprdDscntRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepairedDiscountRate";
			definition = "Modified value of the discount rate applied on the order (the discount rate in the original individual order that has been repaired so that the order can be accepted).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(Fee3 obj) {
			return obj.getRepairedDiscountRate();
		}

		@Override
		public void setValue(Fee3 obj, Optional<PercentageRate> value) {
			obj.setRepairedDiscountRate(value.orElse(null));
		}
	};
	@XmlElement(name = "RprdReqdAmt")
	protected ActiveCurrencyAndAmount repairedRequestedAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fee3 Fee3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RprdReqdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepairedRequestedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modified value of the requested fee (charge/commission) amount applied on the order (the requested fee (charge/commission) amount in the original individual order that has been repaired so that the order can be accepted)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Fee3, Optional<ActiveCurrencyAndAmount>> mmRepairedRequestedAmount = new MMMessageAttribute<Fee3, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Fee3.mmObject();
			isDerived = false;
			xmlTag = "RprdReqdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepairedRequestedAmount";
			definition = "Modified value of the requested fee (charge/commission) amount applied on the order (the requested fee (charge/commission) amount in the original individual order that has been repaired so that the order can be accepted).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(Fee3 obj) {
			return obj.getRepairedRequestedAmount();
		}

		@Override
		public void setValue(Fee3 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setRepairedRequestedAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "RprdReqdRate")
	protected PercentageRate repairedRequestedRate;
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
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmChargeRate
	 * Adjustment.mmChargeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fee3 Fee3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RprdReqdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepairedRequestedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modified value of the requested fee (charge/commission) rate applied on the order (the requested fee (charge/commission) rate in the original individual order that has been repaired so that the order can be accepted)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Fee3, Optional<PercentageRate>> mmRepairedRequestedRate = new MMMessageAttribute<Fee3, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmChargeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Fee3.mmObject();
			isDerived = false;
			xmlTag = "RprdReqdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepairedRequestedRate";
			definition = "Modified value of the requested fee (charge/commission) rate applied on the order (the requested fee (charge/commission) rate in the original individual order that has been repaired so that the order can be accepted).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(Fee3 obj) {
			return obj.getRepairedRequestedRate();
		}

		@Override
		public void setValue(Fee3 obj, Optional<PercentageRate> value) {
			obj.setRepairedRequestedRate(value.orElse(null));
		}
	};
	@XmlElement(name = "ComrclAgrmtRef")
	protected Max35Text commercialAgreementReference;
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
	 * {@linkplain com.tools20022.repository.entity.Commission#mmCommercialAgreementReference
	 * Commission.mmCommercialAgreementReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fee3 Fee3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComrclAgrmtRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialAgreementReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the agreement established between the fund and another party. This element, amongst others, defines the conditions of the commissions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Fee3, Optional<Max35Text>> mmCommercialAgreementReference = new MMMessageAttribute<Fee3, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Commission.mmCommercialAgreementReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.Fee3.mmObject();
			isDerived = false;
			xmlTag = "ComrclAgrmtRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialAgreementReference";
			definition = "Reference to the agreement established between the fund and another party. This element, amongst others, defines the conditions of the commissions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Fee3 obj) {
			return obj.getCommercialAgreementReference();
		}

		@Override
		public void setValue(Fee3 obj, Optional<Max35Text> value) {
			obj.setCommercialAgreementReference(value.orElse(null));
		}
	};
	@XmlElement(name = "NewComrclAgrmtRefInd")
	protected YesNoIndicator newCommercialAgreementReferenceIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fee3 Fee3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewComrclAgrmtRefInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewCommercialAgreementReferenceIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the CommercialAgreementReference is a new reference or not."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Fee3, Optional<YesNoIndicator>> mmNewCommercialAgreementReferenceIndicator = new MMMessageAttribute<Fee3, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Fee3.mmObject();
			isDerived = false;
			xmlTag = "NewComrclAgrmtRefInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewCommercialAgreementReferenceIndicator";
			definition = "Indicates if the CommercialAgreementReference is a new reference or not.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Fee3 obj) {
			return obj.getNewCommercialAgreementReferenceIndicator();
		}

		@Override
		public void setValue(Fee3 obj, Optional<YesNoIndicator> value) {
			obj.setNewCommercialAgreementReferenceIndicator(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Fee3.mmType, com.tools20022.repository.msg.Fee3.mmRepairedStandardAmount, com.tools20022.repository.msg.Fee3.mmRepairedStandardRate,
						com.tools20022.repository.msg.Fee3.mmRepairedDiscountAmount, com.tools20022.repository.msg.Fee3.mmRepairedDiscountRate, com.tools20022.repository.msg.Fee3.mmRepairedRequestedAmount,
						com.tools20022.repository.msg.Fee3.mmRepairedRequestedRate, com.tools20022.repository.msg.Fee3.mmCommercialAgreementReference, com.tools20022.repository.msg.Fee3.mmNewCommercialAgreementReferenceIndicator);
				trace_lazy = () -> Charges.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCommercialAgreementRule.forFee3, com.tools20022.repository.constraints.ConstraintFeeElementRule.forFee3);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Fee3";
				definition = "Amount of money associated with a service.";
				previousVersion_lazy = () -> Charge19.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ChargeType5Choice> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public Fee3 setType(ChargeType5Choice type) {
		this.type = type;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getRepairedStandardAmount() {
		return repairedStandardAmount == null ? Optional.empty() : Optional.of(repairedStandardAmount);
	}

	public Fee3 setRepairedStandardAmount(ActiveCurrencyAndAmount repairedStandardAmount) {
		this.repairedStandardAmount = repairedStandardAmount;
		return this;
	}

	public Optional<PercentageRate> getRepairedStandardRate() {
		return repairedStandardRate == null ? Optional.empty() : Optional.of(repairedStandardRate);
	}

	public Fee3 setRepairedStandardRate(PercentageRate repairedStandardRate) {
		this.repairedStandardRate = repairedStandardRate;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getRepairedDiscountAmount() {
		return repairedDiscountAmount == null ? Optional.empty() : Optional.of(repairedDiscountAmount);
	}

	public Fee3 setRepairedDiscountAmount(ActiveCurrencyAndAmount repairedDiscountAmount) {
		this.repairedDiscountAmount = repairedDiscountAmount;
		return this;
	}

	public Optional<PercentageRate> getRepairedDiscountRate() {
		return repairedDiscountRate == null ? Optional.empty() : Optional.of(repairedDiscountRate);
	}

	public Fee3 setRepairedDiscountRate(PercentageRate repairedDiscountRate) {
		this.repairedDiscountRate = repairedDiscountRate;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getRepairedRequestedAmount() {
		return repairedRequestedAmount == null ? Optional.empty() : Optional.of(repairedRequestedAmount);
	}

	public Fee3 setRepairedRequestedAmount(ActiveCurrencyAndAmount repairedRequestedAmount) {
		this.repairedRequestedAmount = repairedRequestedAmount;
		return this;
	}

	public Optional<PercentageRate> getRepairedRequestedRate() {
		return repairedRequestedRate == null ? Optional.empty() : Optional.of(repairedRequestedRate);
	}

	public Fee3 setRepairedRequestedRate(PercentageRate repairedRequestedRate) {
		this.repairedRequestedRate = repairedRequestedRate;
		return this;
	}

	public Optional<Max35Text> getCommercialAgreementReference() {
		return commercialAgreementReference == null ? Optional.empty() : Optional.of(commercialAgreementReference);
	}

	public Fee3 setCommercialAgreementReference(Max35Text commercialAgreementReference) {
		this.commercialAgreementReference = commercialAgreementReference;
		return this;
	}

	public Optional<YesNoIndicator> getNewCommercialAgreementReferenceIndicator() {
		return newCommercialAgreementReferenceIndicator == null ? Optional.empty() : Optional.of(newCommercialAgreementReferenceIndicator);
	}

	public Fee3 setNewCommercialAgreementReferenceIndicator(YesNoIndicator newCommercialAgreementReferenceIndicator) {
		this.newCommercialAgreementReferenceIndicator = newCommercialAgreementReferenceIndicator;
		return this;
	}
}