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
import com.tools20022.repository.codeset.PreferenceToIncome1Code;
import com.tools20022.repository.codeset.SecuritiesPaymentStatus1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.entity.Equity;
import com.tools20022.repository.entity.SecuritiesStatus;
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
 * Financial instrument which represents a title of ownership in a company, ie,
 * the shareholder is entitled to a part of the company's profit - usually by
 * payment of a dividend - and to voting rights, if any. Each company issues
 * generally different classes of shares, eg, ordinary or common shares, which
 * have no guaranteed amount of dividend but carry voting rights, or preferred
 * shares, which receive dividends before ordinary shares but have no voting
 * right.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Equity1#mmPreferenceToIncome
 * Equity1.mmPreferenceToIncome}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Equity1#mmPaymentStatus
 * Equity1.mmPaymentStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Equity1#mmConvertibleIndicator
 * Equity1.mmConvertibleIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Equity1#mmMaturityDate
 * Equity1.mmMaturityDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Equity1#mmNonPaidAmount
 * Equity1.mmNonPaidAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Equity1#mmParValue
 * Equity1.mmParValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Equity1#mmVotingRightsPerShare
 * Equity1.mmVotingRightsPerShare}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Equity Equity}</li>
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
 * "Equity1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Financial instrument which represents a title of ownership in a company, ie, the shareholder is entitled to a part of the company's profit - usually by payment of a dividend - and to voting rights, if any. Each company issues generally different classes of shares, eg, ordinary or common shares, which have no guaranteed amount of dividend but carry voting rights, or preferred shares, which receive dividends before ordinary shares but have no voting right."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Equity1", propOrder = {"preferenceToIncome", "paymentStatus", "convertibleIndicator", "maturityDate", "nonPaidAmount", "parValue", "votingRightsPerShare"})
public class Equity1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrefToIncm", required = true)
	protected PreferenceToIncome1Code preferenceToIncome;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PreferenceToIncome1Code
	 * PreferenceToIncome1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Equity#mmPreferenceToIncome
	 * Equity.mmPreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Equity1
	 * Equity1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrefToIncm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreferenceToIncome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the level of priority to claim on income and assets of the company in case of the payment of dividends and in the event of a bankruptcy, for example, ordinary/common stocks, preferred stocks, subordinated debt, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Equity1, PreferenceToIncome1Code> mmPreferenceToIncome = new MMMessageAttribute<Equity1, PreferenceToIncome1Code>() {
		{
			businessElementTrace_lazy = () -> Equity.mmPreferenceToIncome;
			componentContext_lazy = () -> com.tools20022.repository.msg.Equity1.mmObject();
			isDerived = false;
			xmlTag = "PrefToIncm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreferenceToIncome";
			definition = "Indicates the level of priority to claim on income and assets of the company in case of the payment of dividends and in the event of a bankruptcy, for example, ordinary/common stocks, preferred stocks, subordinated debt, etc.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PreferenceToIncome1Code.mmObject();
		}

		@Override
		public PreferenceToIncome1Code getValue(Equity1 obj) {
			return obj.getPreferenceToIncome();
		}

		@Override
		public void setValue(Equity1 obj, PreferenceToIncome1Code value) {
			obj.setPreferenceToIncome(value);
		}
	};
	@XmlElement(name = "PmtSts")
	protected SecuritiesPaymentStatus1Code paymentStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesPaymentStatus1Code
	 * SecuritiesPaymentStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus#mmPaymentStatus
	 * SecuritiesStatus.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Equity1
	 * Equity1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of payment of a security at a particular time."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Equity1, Optional<SecuritiesPaymentStatus1Code>> mmPaymentStatus = new MMMessageAttribute<Equity1, Optional<SecuritiesPaymentStatus1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesStatus.mmPaymentStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.Equity1.mmObject();
			isDerived = false;
			xmlTag = "PmtSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentStatus";
			definition = "Status of payment of a security at a particular time.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SecuritiesPaymentStatus1Code.mmObject();
		}

		@Override
		public Optional<SecuritiesPaymentStatus1Code> getValue(Equity1 obj) {
			return obj.getPaymentStatus();
		}

		@Override
		public void setValue(Equity1 obj, Optional<SecuritiesPaymentStatus1Code> value) {
			obj.setPaymentStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "ConvtblInd")
	protected YesNoIndicator convertibleIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.Equity#mmConvertibleIndicator
	 * Equity.mmConvertibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Equity1
	 * Equity1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvtblInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertibleIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the investor or the issuer has a conversion option."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Equity1, Optional<YesNoIndicator>> mmConvertibleIndicator = new MMMessageAttribute<Equity1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Equity.mmConvertibleIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Equity1.mmObject();
			isDerived = false;
			xmlTag = "ConvtblInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertibleIndicator";
			definition = "Indicates whether the investor or the issuer has a conversion option.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Equity1 obj) {
			return obj.getConvertibleIndicator();
		}

		@Override
		public void setValue(Equity1 obj, Optional<YesNoIndicator> value) {
			obj.setConvertibleIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "MtrtyDt")
	protected ISODateTime maturityDate;
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
	 * {@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
	 * Asset.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Equity1
	 * Equity1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the security will no longer exist, for example, redeemable preference shares."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Equity1, Optional<ISODateTime>> mmMaturityDate = new MMMessageAttribute<Equity1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Equity1.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Date/time at which the security will no longer exist, for example, redeemable preference shares.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Equity1 obj) {
			return obj.getMaturityDate();
		}

		@Override
		public void setValue(Equity1 obj, Optional<ISODateTime> value) {
			obj.setMaturityDate(value.orElse(null));
		}
	};
	@XmlElement(name = "NonPdAmt")
	protected ActiveCurrencyAndAmount nonPaidAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Equity#mmNonPaidAmount
	 * Equity.mmNonPaidAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Equity1
	 * Equity1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonPdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonPaidAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nominal amount which is not paid yet."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Equity1, Optional<ActiveCurrencyAndAmount>> mmNonPaidAmount = new MMMessageAttribute<Equity1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Equity.mmNonPaidAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Equity1.mmObject();
			isDerived = false;
			xmlTag = "NonPdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonPaidAmount";
			definition = "Nominal amount which is not paid yet.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(Equity1 obj) {
			return obj.getNonPaidAmount();
		}

		@Override
		public void setValue(Equity1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setNonPaidAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ParVal")
	protected ActiveCurrencyAndAmount parValue;
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
	 * {@linkplain com.tools20022.repository.entity.Equity#mmParValue
	 * Equity.mmParValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Equity1
	 * Equity1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ParVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nominal value of an equity security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Equity1, Optional<ActiveCurrencyAndAmount>> mmParValue = new MMMessageAttribute<Equity1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Equity.mmParValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.Equity1.mmObject();
			isDerived = false;
			xmlTag = "ParVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParValue";
			definition = "Nominal value of an equity security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(Equity1 obj) {
			return obj.getParValue();
		}

		@Override
		public void setValue(Equity1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setParValue(value.orElse(null));
		}
	};
	@XmlElement(name = "VtngRghtsPerShr")
	protected Number votingRightsPerShare;
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
	 * {@linkplain com.tools20022.repository.entity.Equity#mmVotingRightsPerShare
	 * Equity.mmVotingRightsPerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Equity1
	 * Equity1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VtngRghtsPerShr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VotingRightsPerShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of voting rights per share."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Equity1, Optional<Number>> mmVotingRightsPerShare = new MMMessageAttribute<Equity1, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Equity.mmVotingRightsPerShare;
			componentContext_lazy = () -> com.tools20022.repository.msg.Equity1.mmObject();
			isDerived = false;
			xmlTag = "VtngRghtsPerShr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VotingRightsPerShare";
			definition = "Number of voting rights per share.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Equity1 obj) {
			return obj.getVotingRightsPerShare();
		}

		@Override
		public void setValue(Equity1 obj, Optional<Number> value) {
			obj.setVotingRightsPerShare(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Equity1.mmPreferenceToIncome, com.tools20022.repository.msg.Equity1.mmPaymentStatus, com.tools20022.repository.msg.Equity1.mmConvertibleIndicator,
						com.tools20022.repository.msg.Equity1.mmMaturityDate, com.tools20022.repository.msg.Equity1.mmNonPaidAmount, com.tools20022.repository.msg.Equity1.mmParValue,
						com.tools20022.repository.msg.Equity1.mmVotingRightsPerShare);
				trace_lazy = () -> Equity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Equity1";
				definition = "Financial instrument which represents a title of ownership in a company, ie, the shareholder is entitled to a part of the company's profit - usually by payment of a dividend - and to voting rights, if any. Each company issues generally different classes of shares, eg, ordinary or common shares, which have no guaranteed amount of dividend but carry voting rights, or preferred shares, which receive dividends before ordinary shares but have no voting right.";
			}
		});
		return mmObject_lazy.get();
	}

	public PreferenceToIncome1Code getPreferenceToIncome() {
		return preferenceToIncome;
	}

	public Equity1 setPreferenceToIncome(PreferenceToIncome1Code preferenceToIncome) {
		this.preferenceToIncome = Objects.requireNonNull(preferenceToIncome);
		return this;
	}

	public Optional<SecuritiesPaymentStatus1Code> getPaymentStatus() {
		return paymentStatus == null ? Optional.empty() : Optional.of(paymentStatus);
	}

	public Equity1 setPaymentStatus(SecuritiesPaymentStatus1Code paymentStatus) {
		this.paymentStatus = paymentStatus;
		return this;
	}

	public Optional<YesNoIndicator> getConvertibleIndicator() {
		return convertibleIndicator == null ? Optional.empty() : Optional.of(convertibleIndicator);
	}

	public Equity1 setConvertibleIndicator(YesNoIndicator convertibleIndicator) {
		this.convertibleIndicator = convertibleIndicator;
		return this;
	}

	public Optional<ISODateTime> getMaturityDate() {
		return maturityDate == null ? Optional.empty() : Optional.of(maturityDate);
	}

	public Equity1 setMaturityDate(ISODateTime maturityDate) {
		this.maturityDate = maturityDate;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getNonPaidAmount() {
		return nonPaidAmount == null ? Optional.empty() : Optional.of(nonPaidAmount);
	}

	public Equity1 setNonPaidAmount(ActiveCurrencyAndAmount nonPaidAmount) {
		this.nonPaidAmount = nonPaidAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getParValue() {
		return parValue == null ? Optional.empty() : Optional.of(parValue);
	}

	public Equity1 setParValue(ActiveCurrencyAndAmount parValue) {
		this.parValue = parValue;
		return this;
	}

	public Optional<Number> getVotingRightsPerShare() {
		return votingRightsPerShare == null ? Optional.empty() : Optional.of(votingRightsPerShare);
	}

	public Equity1 setVotingRightsPerShare(Number votingRightsPerShare) {
		this.votingRightsPerShare = votingRightsPerShare;
		return this;
	}
}