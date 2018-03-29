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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ClosingType1Code;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.DeliveryType2Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Agreement;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.SecuritiesFinancingAgreement;
import com.tools20022.repository.GeneratedRepository;
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
 * Contractual details related to the agreement between parties.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Agreement3#mmDescription
 * Agreement3.mmDescription}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Agreement3#mmDate
 * Agreement3.mmDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Agreement3#mmCurrency
 * Agreement3.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Agreement3#mmClosingType
 * Agreement3.mmClosingType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Agreement3#mmStartDate
 * Agreement3.mmStartDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Agreement3#mmDeliveryType
 * Agreement3.mmDeliveryType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Agreement3#mmMarginRatio
 * Agreement3.mmMarginRatio}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement
 * SecuritiesFinancingAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = FIXSynonym: FinDetls</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Agreement3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Contractual details related to the agreement between parties."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Agreement3", propOrder = {"description", "date", "currency", "closingType", "startDate", "deliveryType", "marginRatio"})
public class Agreement3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Desc")
	protected Max350Text description;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmDescription
	 * Agreement.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Agreement3
	 * Agreement3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 913</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Full name of the base standard agreement, annexes and amendments in place between the principals and applicable to this deal."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Agreement3, Optional<Max350Text>> mmDescription = new MMMessageAttribute<Agreement3, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> Agreement.mmDescription;
			componentContext_lazy = () -> com.tools20022.repository.msg.Agreement3.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "913"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Full name of the base standard agreement, annexes and amendments in place between the principals and applicable to this deal.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(Agreement3 obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(Agreement3 obj, Optional<Max350Text> value) {
			obj.setDescription(value.orElse(null));
		}
	};
	@XmlElement(name = "Dt")
	protected ISODateTime date;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmDateSigned
	 * Agreement.mmDateSigned}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Agreement3
	 * Agreement3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 915</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Numeric representation of the day of the month and year."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Agreement3, Optional<ISODateTime>> mmDate = new MMMessageAttribute<Agreement3, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Agreement.mmDateSigned;
			componentContext_lazy = () -> com.tools20022.repository.msg.Agreement3.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "915"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Numeric representation of the day of the month and year.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Agreement3 obj) {
			return obj.getDate();
		}

		@Override
		public void setValue(Agreement3 obj, Optional<ISODateTime> value) {
			obj.setDate(value.orElse(null));
		}
	};
	@XmlElement(name = "Ccy")
	protected CurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement#mmCurrency
	 * SecuritiesFinancingAgreement.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Agreement3
	 * Agreement3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 918</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contractual currency forming the basis of a financing agreement and associated transactions. Usually, but not always, the same as the trade currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Agreement3, Optional<CurrencyCode>> mmCurrency = new MMMessageAttribute<Agreement3, Optional<CurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancingAgreement.mmCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.Agreement3.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "918"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Contractual currency forming the basis of a financing agreement and associated transactions. Usually, but not always, the same as the trade currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public Optional<CurrencyCode> getValue(Agreement3 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(Agreement3 obj, Optional<CurrencyCode> value) {
			obj.setCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "ClsgTp")
	protected ClosingType1Code closingType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ClosingType1Code
	 * ClosingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement#mmTerminationType
	 * SecuritiesFinancingAgreement.mmTerminationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Agreement3
	 * Agreement3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 788</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of financing closing."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Agreement3, Optional<ClosingType1Code>> mmClosingType = new MMMessageAttribute<Agreement3, Optional<ClosingType1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancingAgreement.mmTerminationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Agreement3.mmObject();
			isDerived = false;
			xmlTag = "ClsgTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "788"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingType";
			definition = "Type of financing closing.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ClosingType1Code.mmObject();
		}

		@Override
		public Optional<ClosingType1Code> getValue(Agreement3 obj) {
			return obj.getClosingType();
		}

		@Override
		public void setValue(Agreement3 obj, Optional<ClosingType1Code> value) {
			obj.setClosingType(value.orElse(null));
		}
	};
	@XmlElement(name = "StartDt")
	protected ISODateTime startDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmFromDateTime
	 * DateTimePeriod.mmFromDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Agreement3
	 * Agreement3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StartDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 916</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Start date of a financing deal that is the date the buyer pays the seller cash and takes control of the collateral."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Agreement3, Optional<ISODateTime>> mmStartDate = new MMMessageAttribute<Agreement3, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmFromDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.Agreement3.mmObject();
			isDerived = false;
			xmlTag = "StartDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "916"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StartDate";
			definition = "Start date of a financing deal that is the date the buyer pays the seller cash and takes control of the collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Agreement3 obj) {
			return obj.getStartDate();
		}

		@Override
		public void setValue(Agreement3 obj, Optional<ISODateTime> value) {
			obj.setStartDate(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvryTp")
	protected DeliveryType2Code deliveryType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryType2Code
	 * DeliveryType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement#mmDeliveryType
	 * SecuritiesFinancingAgreement.mmDeliveryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Agreement3
	 * Agreement3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 919</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies type of settlement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Agreement3, Optional<DeliveryType2Code>> mmDeliveryType = new MMMessageAttribute<Agreement3, Optional<DeliveryType2Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancingAgreement.mmDeliveryType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Agreement3.mmObject();
			isDerived = false;
			xmlTag = "DlvryTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "919"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryType";
			definition = "Identifies type of settlement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DeliveryType2Code.mmObject();
		}

		@Override
		public Optional<DeliveryType2Code> getValue(Agreement3 obj) {
			return obj.getDeliveryType();
		}

		@Override
		public void setValue(Agreement3 obj, Optional<DeliveryType2Code> value) {
			obj.setDeliveryType(value.orElse(null));
		}
	};
	@XmlElement(name = "MrgnRatio")
	protected PercentageRate marginRatio;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement#mmMarginRatio
	 * SecuritiesFinancingAgreement.mmMarginRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Agreement3
	 * Agreement3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 898</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fraction of the cash consideration that must be collateralized, expressed as a percent. A margin ratio of 02% indicates that the value of the collateral (after deducting for \"haircut\") must exceed the cash consideration by 2%."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Agreement3, Optional<PercentageRate>> mmMarginRatio = new MMMessageAttribute<Agreement3, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancingAgreement.mmMarginRatio;
			componentContext_lazy = () -> com.tools20022.repository.msg.Agreement3.mmObject();
			isDerived = false;
			xmlTag = "MrgnRatio";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "898"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginRatio";
			definition = "Fraction of the cash consideration that must be collateralized, expressed as a percent. A margin ratio of 02% indicates that the value of the collateral (after deducting for \"haircut\") must exceed the cash consideration by 2%.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(Agreement3 obj) {
			return obj.getMarginRatio();
		}

		@Override
		public void setValue(Agreement3 obj, Optional<PercentageRate> value) {
			obj.setMarginRatio(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Agreement3.mmDescription, com.tools20022.repository.msg.Agreement3.mmDate, com.tools20022.repository.msg.Agreement3.mmCurrency,
						com.tools20022.repository.msg.Agreement3.mmClosingType, com.tools20022.repository.msg.Agreement3.mmStartDate, com.tools20022.repository.msg.Agreement3.mmDeliveryType,
						com.tools20022.repository.msg.Agreement3.mmMarginRatio);
				trace_lazy = () -> SecuritiesFinancingAgreement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "FinDetls"));
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "Agreement3";
				definition = "Contractual details related to the agreement between parties.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getDescription() {
		return description == null ? Optional.empty() : Optional.of(description);
	}

	public Agreement3 setDescription(Max350Text description) {
		this.description = description;
		return this;
	}

	public Optional<ISODateTime> getDate() {
		return date == null ? Optional.empty() : Optional.of(date);
	}

	public Agreement3 setDate(ISODateTime date) {
		this.date = date;
		return this;
	}

	public Optional<CurrencyCode> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public Agreement3 setCurrency(CurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public Optional<ClosingType1Code> getClosingType() {
		return closingType == null ? Optional.empty() : Optional.of(closingType);
	}

	public Agreement3 setClosingType(ClosingType1Code closingType) {
		this.closingType = closingType;
		return this;
	}

	public Optional<ISODateTime> getStartDate() {
		return startDate == null ? Optional.empty() : Optional.of(startDate);
	}

	public Agreement3 setStartDate(ISODateTime startDate) {
		this.startDate = startDate;
		return this;
	}

	public Optional<DeliveryType2Code> getDeliveryType() {
		return deliveryType == null ? Optional.empty() : Optional.of(deliveryType);
	}

	public Agreement3 setDeliveryType(DeliveryType2Code deliveryType) {
		this.deliveryType = deliveryType;
		return this;
	}

	public Optional<PercentageRate> getMarginRatio() {
		return marginRatio == null ? Optional.empty() : Optional.of(marginRatio);
	}

	public Agreement3 setMarginRatio(PercentageRate marginRatio) {
		this.marginRatio = marginRatio;
		return this;
	}
}