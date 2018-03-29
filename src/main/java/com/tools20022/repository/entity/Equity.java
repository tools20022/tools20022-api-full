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

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.FinancialInstrumentProperties1Choice;
import com.tools20022.repository.choice.PreferenceToIncome1Choice;
import com.tools20022.repository.choice.PreferenceToIncome2Choice;
import com.tools20022.repository.choice.PreferenceToIncome3Choice;
import com.tools20022.repository.codeset.PreferenceToIncomeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Financial instrument that represents a title of ownership in a company. That
 * is, the shareholder is entitled to a part of the company's profit - usually
 * by payment of a dividend - and to voting rights, if any. Each company issues
 * generally different classes of shares, for example, ordinary or common
 * shares, which have no guaranteed amount of dividend but carry voting rights,
 * or preferred shares, which receive dividends before ordinary shares but have
 * no voting right.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Equity" src="doc-files/Equity.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Equity#mmPreferenceToIncome
 * Equity.mmPreferenceToIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Equity#mmConvertibleIndicator
 * Equity.mmConvertibleIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Equity#mmNonPaidAmount
 * Equity.mmNonPaidAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Equity#mmParValue
 * Equity.mmParValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Equity#mmVotingRightsPerShare
 * Equity.mmVotingRightsPerShare}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentProperties1Choice#mmEquity
 * FinancialInstrumentProperties1Choice.mmEquity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument28#mmEquity
 * FinancialInstrument28.mmEquity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument54#mmEquity
 * FinancialInstrument54.mmEquity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Equity1 Equity1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Equity"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Financial instrument that represents a title of ownership in a company. That is, the shareholder is entitled to a part of the company's profit - usually by payment of a dividend - and to voting rights, if any. Each company issues generally different classes of shares, for example, ordinary or common shares, which have no guaranteed amount of dividend but carry voting rights, or preferred shares, which receive dividends before ordinary shares but have no voting right."
 * </li>
 * </ul>
 */
public class Equity extends Security {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PreferenceToIncomeCode preferenceToIncome;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PreferenceToIncomeCode
	 * PreferenceToIncomeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PreferenceToIncome1Choice#mmCode
	 * PreferenceToIncome1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PreferenceToIncome1Choice#mmProprietary
	 * PreferenceToIncome1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PreferenceToIncome2Choice#mmCode
	 * PreferenceToIncome2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PreferenceToIncome2Choice#mmProprietary
	 * PreferenceToIncome2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmPreferenceToIncome
	 * FinancialInstrumentAttributes8.mmPreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmPreferenceToIncome
	 * FinancialInstrumentAttributes20.mmPreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmPreferenceToIncome
	 * FinancialInstrumentAttributes4.mmPreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PreferenceToIncome3Choice#mmCode
	 * PreferenceToIncome3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PreferenceToIncome3Choice#mmProprietary
	 * PreferenceToIncome3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmPreferenceToIncome
	 * FinancialInstrumentAttributes13.mmPreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmPreferenceToIncome
	 * FinancialInstrumentAttributes21.mmPreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmPreferenceToIncome
	 * FinancialInstrumentAttributes26.mmPreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmPreferenceToIncome
	 * FinancialInstrumentAttributes27.mmPreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmPreferenceToIncome
	 * FinancialInstrumentAttributes14.mmPreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmPreferenceToIncome
	 * FinancialInstrumentAttributes30.mmPreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmPreferenceToIncome
	 * FinancialInstrumentAttributes28.mmPreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Equity1#mmPreferenceToIncome
	 * Equity1.mmPreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmPreferenceToIncome
	 * FinancialInstrumentAttributes15.mmPreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmPreferenceToIncome
	 * FinancialInstrumentAttributes29.mmPreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Equity2#mmPreferenceToIncome
	 * Equity2.mmPreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmPreferenceToIncome
	 * FinancialInstrumentAttributes2.mmPreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Equity3#mmPreferenceToIncome
	 * Equity3.mmPreferenceToIncome}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Equity
	 * Equity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreferenceToIncome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the  level of priority to claim on income and assets of the company in case of the payment of dividends and in the event of a bankruptcy, for example, ordinary/common stocks, preferred stocks, subordinated debt, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Equity, PreferenceToIncomeCode> mmPreferenceToIncome = new MMBusinessAttribute<Equity, PreferenceToIncomeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(PreferenceToIncome1Choice.mmCode, PreferenceToIncome1Choice.mmProprietary, PreferenceToIncome2Choice.mmCode, PreferenceToIncome2Choice.mmProprietary,
					FinancialInstrumentAttributes8.mmPreferenceToIncome, FinancialInstrumentAttributes20.mmPreferenceToIncome, FinancialInstrumentAttributes4.mmPreferenceToIncome, PreferenceToIncome3Choice.mmCode,
					PreferenceToIncome3Choice.mmProprietary, FinancialInstrumentAttributes13.mmPreferenceToIncome, FinancialInstrumentAttributes21.mmPreferenceToIncome, FinancialInstrumentAttributes26.mmPreferenceToIncome,
					FinancialInstrumentAttributes27.mmPreferenceToIncome, FinancialInstrumentAttributes14.mmPreferenceToIncome, FinancialInstrumentAttributes30.mmPreferenceToIncome, FinancialInstrumentAttributes28.mmPreferenceToIncome,
					Equity1.mmPreferenceToIncome, FinancialInstrumentAttributes15.mmPreferenceToIncome, FinancialInstrumentAttributes29.mmPreferenceToIncome, Equity2.mmPreferenceToIncome,
					FinancialInstrumentAttributes2.mmPreferenceToIncome, Equity3.mmPreferenceToIncome);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Equity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreferenceToIncome";
			definition = "Indicates the  level of priority to claim on income and assets of the company in case of the payment of dividends and in the event of a bankruptcy, for example, ordinary/common stocks, preferred stocks, subordinated debt, etc.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PreferenceToIncomeCode.mmObject();
		}

		@Override
		public PreferenceToIncomeCode getValue(Equity obj) {
			return obj.getPreferenceToIncome();
		}

		@Override
		public void setValue(Equity obj, PreferenceToIncomeCode value) {
			obj.setPreferenceToIncome(value);
		}
	};
	protected YesNoIndicator convertibleIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.Equity1#mmConvertibleIndicator
	 * Equity1.mmConvertibleIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Equity
	 * Equity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertibleIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the investor or the issuer has a conversion option."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Equity, YesNoIndicator> mmConvertibleIndicator = new MMBusinessAttribute<Equity, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(Equity1.mmConvertibleIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Equity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConvertibleIndicator";
			definition = "Indicates whether the investor or the issuer has a conversion option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Equity obj) {
			return obj.getConvertibleIndicator();
		}

		@Override
		public void setValue(Equity obj, YesNoIndicator value) {
			obj.setConvertibleIndicator(value);
		}
	};
	protected CurrencyAndAmount nonPaidAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Equity1#mmNonPaidAmount
	 * Equity1.mmNonPaidAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Equity2#mmNonPaidAmount
	 * Equity2.mmNonPaidAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Equity3#mmNonPaidAmount
	 * Equity3.mmNonPaidAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Equity
	 * Equity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonPaidAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nominal amount which is not paid yet."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Equity, CurrencyAndAmount> mmNonPaidAmount = new MMBusinessAttribute<Equity, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(Equity1.mmNonPaidAmount, Equity2.mmNonPaidAmount, Equity3.mmNonPaidAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Equity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonPaidAmount";
			definition = "Nominal amount which is not paid yet.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Equity obj) {
			return obj.getNonPaidAmount();
		}

		@Override
		public void setValue(Equity obj, CurrencyAndAmount value) {
			obj.setNonPaidAmount(value);
		}
	};
	protected CurrencyAndAmount parValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Equity1#mmParValue
	 * Equity1.mmParValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Equity2#mmParValue
	 * Equity2.mmParValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Equity3#mmParValue
	 * Equity3.mmParValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Equity
	 * Equity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nominal value of an equity security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Equity, CurrencyAndAmount> mmParValue = new MMBusinessAttribute<Equity, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(Equity1.mmParValue, Equity2.mmParValue, Equity3.mmParValue);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Equity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ParValue";
			definition = "Nominal value of an equity security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Equity obj) {
			return obj.getParValue();
		}

		@Override
		public void setValue(Equity obj, CurrencyAndAmount value) {
			obj.setParValue(value);
		}
	};
	protected Number votingRightsPerShare;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Equity1#mmVotingRightsPerShare
	 * Equity1.mmVotingRightsPerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Equity2#mmVotingRightsPerShare
	 * Equity2.mmVotingRightsPerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Equity3#mmVotingRightsPerShare
	 * Equity3.mmVotingRightsPerShare}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Equity
	 * Equity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VotingRightsPerShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of voting rights per share."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Equity, Number> mmVotingRightsPerShare = new MMBusinessAttribute<Equity, Number>() {
		{
			derivation_lazy = () -> Arrays.asList(Equity1.mmVotingRightsPerShare, Equity2.mmVotingRightsPerShare, Equity3.mmVotingRightsPerShare);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Equity.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VotingRightsPerShare";
			definition = "Number of voting rights per share.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Equity obj) {
			return obj.getVotingRightsPerShare();
		}

		@Override
		public void setValue(Equity obj, Number value) {
			obj.setVotingRightsPerShare(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Equity";
				definition = "Financial instrument that represents a title of ownership in a company. That is, the shareholder is entitled to a part of the company's profit - usually by payment of a dividend - and to voting rights, if any. Each company issues generally different classes of shares, for example, ordinary or common shares, which have no guaranteed amount of dividend but carry voting rights, or preferred shares, which receive dividends before ordinary shares but have no voting right.";
				derivationElement_lazy = () -> Arrays.asList(FinancialInstrumentProperties1Choice.mmEquity, FinancialInstrument28.mmEquity, FinancialInstrument54.mmEquity);
				superType_lazy = () -> Security.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Equity.mmPreferenceToIncome, com.tools20022.repository.entity.Equity.mmConvertibleIndicator, com.tools20022.repository.entity.Equity.mmNonPaidAmount,
						com.tools20022.repository.entity.Equity.mmParValue, com.tools20022.repository.entity.Equity.mmVotingRightsPerShare);
				derivationComponent_lazy = () -> Arrays.asList(Equity1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Equity.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PreferenceToIncomeCode getPreferenceToIncome() {
		return preferenceToIncome;
	}

	public Equity setPreferenceToIncome(PreferenceToIncomeCode preferenceToIncome) {
		this.preferenceToIncome = Objects.requireNonNull(preferenceToIncome);
		return this;
	}

	public YesNoIndicator getConvertibleIndicator() {
		return convertibleIndicator;
	}

	public Equity setConvertibleIndicator(YesNoIndicator convertibleIndicator) {
		this.convertibleIndicator = Objects.requireNonNull(convertibleIndicator);
		return this;
	}

	public CurrencyAndAmount getNonPaidAmount() {
		return nonPaidAmount;
	}

	public Equity setNonPaidAmount(CurrencyAndAmount nonPaidAmount) {
		this.nonPaidAmount = Objects.requireNonNull(nonPaidAmount);
		return this;
	}

	public CurrencyAndAmount getParValue() {
		return parValue;
	}

	public Equity setParValue(CurrencyAndAmount parValue) {
		this.parValue = Objects.requireNonNull(parValue);
		return this;
	}

	public Number getVotingRightsPerShare() {
		return votingRightsPerShare;
	}

	public Equity setVotingRightsPerShare(Number votingRightsPerShare) {
		this.votingRightsPerShare = Objects.requireNonNull(votingRightsPerShare);
		return this;
	}
}