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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.codeset.CommissionType6Code;
import com.tools20022.repository.codeset.TaxationBasis4Code;
import com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.entity.Commission;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CommissionWaiver3;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Amount of money due to a party as compensation for a service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Commission10#TypeOrExtendedTypeRule
 * Commission10.TypeOrExtendedTypeRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Commission10#BasisOrExtendedBasisRule
 * Commission10.BasisOrExtendedBasisRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Commission10#mmType
 * Commission10.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission10#mmExtendedType
 * Commission10.mmExtendedType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission10#mmBasis
 * Commission10.mmBasis}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission10#mmExtendedBasis
 * Commission10.mmExtendedBasis}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission10#mmAmount
 * Commission10.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission10#mmRate
 * Commission10.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Commission10#mmRecipientIdentification
 * Commission10.mmRecipientIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Commission10#mmCommercialAgreementReference
 * Commission10.mmCommercialAgreementReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission10#mmWaivingDetails
 * Commission10.mmWaivingDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Commission10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Amount of money due to a party as compensation for a service."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Commission18 Commission18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission19 Commission19}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Commission10", propOrder = {"type", "extendedType", "basis", "extendedBasis", "amount", "rate", "recipientIdentification", "commercialAgreementReference", "waivingDetails"})
public class Commission10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp")
	protected CommissionType6Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionType6Code
	 * CommissionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commission#mmCommissionType
	 * Commission.mmCommissionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Commission10 Commission10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Service for which the commission is asked or paid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Commission10, Optional<CommissionType6Code>> mmType = new MMMessageAttribute<Commission10, Optional<CommissionType6Code>>() {
		{
			businessElementTrace_lazy = () -> Commission.mmCommissionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Commission10.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Service for which the commission is asked or paid.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CommissionType6Code.mmObject();
		}

		@Override
		public Optional<CommissionType6Code> getValue(Commission10 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Commission10 obj, Optional<CommissionType6Code> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "XtndedTp")
	protected Extended350Code extendedType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commission#mmCommissionType
	 * Commission.mmCommissionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Commission10 Commission10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Service for which the commission is asked or paid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Commission10, Optional<Extended350Code>> mmExtendedType = new MMMessageAttribute<Commission10, Optional<Extended350Code>>() {
		{
			businessElementTrace_lazy = () -> Commission.mmCommissionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Commission10.mmObject();
			isDerived = false;
			xmlTag = "XtndedTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedType";
			definition = "Service for which the commission is asked or paid.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}

		@Override
		public Optional<Extended350Code> getValue(Commission10 obj) {
			return obj.getExtendedType();
		}

		@Override
		public void setValue(Commission10 obj, Optional<Extended350Code> value) {
			obj.setExtendedType(value.orElse(null));
		}
	};
	@XmlElement(name = "Bsis")
	protected TaxationBasis4Code basis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasis4Code
	 * TaxationBasis4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commission#mmBasis
	 * Commission.mmBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Commission10 Commission10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bsis"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Basis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Basis upon which a commission is charged, eg, flat fee."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Commission10, Optional<TaxationBasis4Code>> mmBasis = new MMMessageAttribute<Commission10, Optional<TaxationBasis4Code>>() {
		{
			businessElementTrace_lazy = () -> Commission.mmBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.Commission10.mmObject();
			isDerived = false;
			xmlTag = "Bsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Basis";
			definition = "Basis upon which a commission is charged, eg, flat fee.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TaxationBasis4Code.mmObject();
		}

		@Override
		public Optional<TaxationBasis4Code> getValue(Commission10 obj) {
			return obj.getBasis();
		}

		@Override
		public void setValue(Commission10 obj, Optional<TaxationBasis4Code> value) {
			obj.setBasis(value.orElse(null));
		}
	};
	@XmlElement(name = "XtndedBsis")
	protected Extended350Code extendedBasis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commission#mmBasis
	 * Commission.mmBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Commission10 Commission10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedBsis"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Basis upon which a commission is charged, eg, flat fee."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Commission10, Optional<Extended350Code>> mmExtendedBasis = new MMMessageAttribute<Commission10, Optional<Extended350Code>>() {
		{
			businessElementTrace_lazy = () -> Commission.mmBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.Commission10.mmObject();
			isDerived = false;
			xmlTag = "XtndedBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedBasis";
			definition = "Basis upon which a commission is charged, eg, flat fee.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}

		@Override
		public Optional<Extended350Code> getValue(Commission10 obj) {
			return obj.getExtendedBasis();
		}

		@Override
		public void setValue(Commission10 obj, Optional<Extended350Code> value) {
			obj.setExtendedBasis(value.orElse(null));
		}
	};
	@XmlElement(name = "Amt")
	protected ActiveCurrencyAnd13DecimalAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount
	 * ActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Commission10 Commission10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission expressed as an amount of money."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission19#mmAmount
	 * Commission19.mmAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Commission10, Optional<ActiveCurrencyAnd13DecimalAmount>> mmAmount = new MMMessageAttribute<Commission10, Optional<ActiveCurrencyAnd13DecimalAmount>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Commission10.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Commission expressed as an amount of money.";
			nextVersions_lazy = () -> Arrays.asList(Commission19.mmAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAnd13DecimalAmount> getValue(Commission10 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(Commission10 obj, Optional<ActiveCurrencyAnd13DecimalAmount> value) {
			obj.setAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "Rate")
	protected PercentageRate rate;
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
	 * {@linkplain com.tools20022.repository.entity.Commission#mmRate
	 * Commission.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Commission10 Commission10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission expressed as a percentage."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission18#mmRate
	 * Commission18.mmRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Commission10, Optional<PercentageRate>> mmRate = new MMMessageAttribute<Commission10, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Commission.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Commission10.mmObject();
			isDerived = false;
			xmlTag = "Rate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rate";
			definition = "Commission expressed as a percentage.";
			nextVersions_lazy = () -> Arrays.asList(Commission18.mmRate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(Commission10 obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(Commission10 obj, Optional<PercentageRate> value) {
			obj.setRate(value.orElse(null));
		}
	};
	@XmlElement(name = "RcptId")
	protected PartyIdentification2Choice recipientIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Commission10 Commission10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcptId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecipientIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party entitled to the amount of money resulting from a commission."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Commission10, Optional<PartyIdentification2Choice>> mmRecipientIdentification = new MMMessageAttribute<Commission10, Optional<PartyIdentification2Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Commission10.mmObject();
			isDerived = false;
			xmlTag = "RcptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientIdentification";
			definition = "Party entitled to the amount of money resulting from a commission.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification2Choice> getValue(Commission10 obj) {
			return obj.getRecipientIdentification();
		}

		@Override
		public void setValue(Commission10 obj, Optional<PartyIdentification2Choice> value) {
			obj.setRecipientIdentification(value.orElse(null));
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Commission10 Commission10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComrclAgrmtRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialAgreementReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the agreement established between the fund and another party. This element, amongst others, defines the conditions of the commissions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Commission10, Optional<Max35Text>> mmCommercialAgreementReference = new MMMessageAttribute<Commission10, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Commission.mmCommercialAgreementReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.Commission10.mmObject();
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
		public Optional<Max35Text> getValue(Commission10 obj) {
			return obj.getCommercialAgreementReference();
		}

		@Override
		public void setValue(Commission10 obj, Optional<Max35Text> value) {
			obj.setCommercialAgreementReference(value.orElse(null));
		}
	};
	@XmlElement(name = "WvgDtls")
	protected CommissionWaiver3 waivingDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CommissionWaiver3
	 * CommissionWaiver3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commission#mmCommissionWaiving
	 * Commission.mmCommissionWaiving}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Commission10 Commission10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WvgDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaivingDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Voluntary non-enforcement of the right to all or part of a commission."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Commission10, Optional<CommissionWaiver3>> mmWaivingDetails = new MMMessageAssociationEnd<Commission10, Optional<CommissionWaiver3>>() {
		{
			businessElementTrace_lazy = () -> Commission.mmCommissionWaiving;
			componentContext_lazy = () -> com.tools20022.repository.msg.Commission10.mmObject();
			isDerived = false;
			xmlTag = "WvgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaivingDetails";
			definition = "Voluntary non-enforcement of the right to all or part of a commission.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CommissionWaiver3.mmObject();
		}

		@Override
		public Optional<CommissionWaiver3> getValue(Commission10 obj) {
			return obj.getWaivingDetails();
		}

		@Override
		public void setValue(Commission10 obj, Optional<CommissionWaiver3> value) {
			obj.setWaivingDetails(value.orElse(null));
		}
	};
	/**
	 * Either Type or ExtendedType may be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.Commission10 Commission10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission10#mmType
	 * Commission10.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission10#mmExtendedType
	 * Commission10.mmExtendedType}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOrExtendedTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Either Type or ExtendedType may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor TypeOrExtendedTypeRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOrExtendedTypeRule";
			definition = "Either Type or ExtendedType may be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.Commission10.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Commission10.mmType, com.tools20022.repository.msg.Commission10.mmExtendedType);
		}
	};
	/**
	 * Either Basis oe ExtendedBasis may be present but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.Commission10 Commission10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission10#mmBasis
	 * Commission10.mmBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission10#mmExtendedBasis
	 * Commission10.mmExtendedBasis}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasisOrExtendedBasisRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either Basis oe ExtendedBasis may be present but not both."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor BasisOrExtendedBasisRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasisOrExtendedBasisRule";
			definition = "Either Basis oe ExtendedBasis may be present but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.Commission10.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Commission10.mmBasis, com.tools20022.repository.msg.Commission10.mmExtendedBasis);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Commission10.mmType, com.tools20022.repository.msg.Commission10.mmExtendedType, com.tools20022.repository.msg.Commission10.mmBasis,
						com.tools20022.repository.msg.Commission10.mmExtendedBasis, com.tools20022.repository.msg.Commission10.mmAmount, com.tools20022.repository.msg.Commission10.mmRate,
						com.tools20022.repository.msg.Commission10.mmRecipientIdentification, com.tools20022.repository.msg.Commission10.mmCommercialAgreementReference, com.tools20022.repository.msg.Commission10.mmWaivingDetails);
				trace_lazy = () -> Commission.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "Commission10";
				definition = "Amount of money due to a party as compensation for a service.";
				nextVersions_lazy = () -> Arrays.asList(Commission18.mmObject(), Commission19.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Commission10.TypeOrExtendedTypeRule, com.tools20022.repository.msg.Commission10.BasisOrExtendedBasisRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CommissionType6Code> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public Commission10 setType(CommissionType6Code type) {
		this.type = type;
		return this;
	}

	public Optional<Extended350Code> getExtendedType() {
		return extendedType == null ? Optional.empty() : Optional.of(extendedType);
	}

	public Commission10 setExtendedType(Extended350Code extendedType) {
		this.extendedType = extendedType;
		return this;
	}

	public Optional<TaxationBasis4Code> getBasis() {
		return basis == null ? Optional.empty() : Optional.of(basis);
	}

	public Commission10 setBasis(TaxationBasis4Code basis) {
		this.basis = basis;
		return this;
	}

	public Optional<Extended350Code> getExtendedBasis() {
		return extendedBasis == null ? Optional.empty() : Optional.of(extendedBasis);
	}

	public Commission10 setExtendedBasis(Extended350Code extendedBasis) {
		this.extendedBasis = extendedBasis;
		return this;
	}

	public Optional<ActiveCurrencyAnd13DecimalAmount> getAmount() {
		return amount == null ? Optional.empty() : Optional.of(amount);
	}

	public Commission10 setAmount(ActiveCurrencyAnd13DecimalAmount amount) {
		this.amount = amount;
		return this;
	}

	public Optional<PercentageRate> getRate() {
		return rate == null ? Optional.empty() : Optional.of(rate);
	}

	public Commission10 setRate(PercentageRate rate) {
		this.rate = rate;
		return this;
	}

	public Optional<PartyIdentification2Choice> getRecipientIdentification() {
		return recipientIdentification == null ? Optional.empty() : Optional.of(recipientIdentification);
	}

	public Commission10 setRecipientIdentification(PartyIdentification2Choice recipientIdentification) {
		this.recipientIdentification = recipientIdentification;
		return this;
	}

	public Optional<Max35Text> getCommercialAgreementReference() {
		return commercialAgreementReference == null ? Optional.empty() : Optional.of(commercialAgreementReference);
	}

	public Commission10 setCommercialAgreementReference(Max35Text commercialAgreementReference) {
		this.commercialAgreementReference = commercialAgreementReference;
		return this;
	}

	public Optional<CommissionWaiver3> getWaivingDetails() {
		return waivingDetails == null ? Optional.empty() : Optional.of(waivingDetails);
	}

	public Commission10 setWaivingDetails(CommissionWaiver3 waivingDetails) {
		this.waivingDetails = waivingDetails;
		return this;
	}
}