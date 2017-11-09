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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Equity1 Equity1}</li>
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
 * </ul>
 * </li>
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
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	 * Indicates the level of priority to claim on income and assets of the
	 * company in case of the payment of dividends and in the event of a
	 * bankruptcy, for example, ordinary/common stocks, preferred stocks,
	 * subordinated debt, etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PreferenceToIncomeCode
	 * PreferenceToIncomeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Equity
	 * Equity}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmPreferenceToIncome = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays
					.asList(PreferenceToIncome1Choice.mmCode, PreferenceToIncome1Choice.mmProprietary, PreferenceToIncome2Choice.mmCode, PreferenceToIncome2Choice.mmProprietary, FinancialInstrumentAttributes8.mmPreferenceToIncome,
							FinancialInstrumentAttributes20.mmPreferenceToIncome, FinancialInstrumentAttributes4.mmPreferenceToIncome, PreferenceToIncome3Choice.mmCode, PreferenceToIncome3Choice.mmProprietary,
							FinancialInstrumentAttributes13.mmPreferenceToIncome, FinancialInstrumentAttributes21.mmPreferenceToIncome, FinancialInstrumentAttributes26.mmPreferenceToIncome,
							FinancialInstrumentAttributes27.mmPreferenceToIncome, FinancialInstrumentAttributes14.mmPreferenceToIncome, FinancialInstrumentAttributes30.mmPreferenceToIncome,
							FinancialInstrumentAttributes28.mmPreferenceToIncome, Equity1.mmPreferenceToIncome, FinancialInstrumentAttributes15.mmPreferenceToIncome, FinancialInstrumentAttributes29.mmPreferenceToIncome,
							Equity2.mmPreferenceToIncome, FinancialInstrumentAttributes2.mmPreferenceToIncome);
			elementContext_lazy = () -> Equity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreferenceToIncome";
			definition = "Indicates the  level of priority to claim on income and assets of the company in case of the payment of dividends and in the event of a bankruptcy, for example, ordinary/common stocks, preferred stocks, subordinated debt, etc.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PreferenceToIncomeCode.mmObject();
		}
	};
	protected YesNoIndicator convertibleIndicator;
	/**
	 * Indicates whether the investor or the issuer has a conversion option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Equity
	 * Equity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Equity1#mmConvertibleIndicator
	 * Equity1.mmConvertibleIndicator}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmConvertibleIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Equity1.mmConvertibleIndicator);
			elementContext_lazy = () -> Equity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConvertibleIndicator";
			definition = "Indicates whether the investor or the issuer has a conversion option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected CurrencyAndAmount nonPaidAmount;
	/**
	 * Nominal amount which is not paid yet.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Equity
	 * Equity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Equity1#mmNonPaidAmount
	 * Equity1.mmNonPaidAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Equity2#mmNonPaidAmount
	 * Equity2.mmNonPaidAmount}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmNonPaidAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Equity1.mmNonPaidAmount, Equity2.mmNonPaidAmount);
			elementContext_lazy = () -> Equity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonPaidAmount";
			definition = "Nominal amount which is not paid yet.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyAndAmount parValue;
	/**
	 * Nominal value of an equity security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Equity
	 * Equity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Equity1#mmParValue
	 * Equity1.mmParValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Equity2#mmParValue
	 * Equity2.mmParValue}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmParValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Equity1.mmParValue, Equity2.mmParValue);
			elementContext_lazy = () -> Equity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ParValue";
			definition = "Nominal value of an equity security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected Number votingRightsPerShare;
	/**
	 * Number of voting rights per share.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Equity
	 * Equity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Equity1#mmVotingRightsPerShare
	 * Equity1.mmVotingRightsPerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Equity2#mmVotingRightsPerShare
	 * Equity2.mmVotingRightsPerShare}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmVotingRightsPerShare = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Equity1.mmVotingRightsPerShare, Equity2.mmVotingRightsPerShare);
			elementContext_lazy = () -> Equity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VotingRightsPerShare";
			definition = "Number of voting rights per share.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Equity";
				definition = "Financial instrument that represents a title of ownership in a company. That is, the shareholder is entitled to a part of the company's profit - usually by payment of a dividend - and to voting rights, if any. Each company issues generally different classes of shares, for example, ordinary or common shares, which have no guaranteed amount of dividend but carry voting rights, or preferred shares, which receive dividends before ordinary shares but have no voting right.";
				derivationElement_lazy = () -> Arrays.asList(FinancialInstrumentProperties1Choice.mmEquity, FinancialInstrument28.mmEquity);
				superType_lazy = () -> Security.mmObject();
				element_lazy = () -> Arrays.asList(Equity.mmPreferenceToIncome, Equity.mmConvertibleIndicator, Equity.mmNonPaidAmount, Equity.mmParValue, Equity.mmVotingRightsPerShare);
				derivationComponent_lazy = () -> Arrays.asList(Equity1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public PreferenceToIncomeCode getPreferenceToIncome() {
		return preferenceToIncome;
	}

	public void setPreferenceToIncome(PreferenceToIncomeCode preferenceToIncome) {
		this.preferenceToIncome = preferenceToIncome;
	}

	public YesNoIndicator getConvertibleIndicator() {
		return convertibleIndicator;
	}

	public void setConvertibleIndicator(YesNoIndicator convertibleIndicator) {
		this.convertibleIndicator = convertibleIndicator;
	}

	public CurrencyAndAmount getNonPaidAmount() {
		return nonPaidAmount;
	}

	public void setNonPaidAmount(CurrencyAndAmount nonPaidAmount) {
		this.nonPaidAmount = nonPaidAmount;
	}

	public CurrencyAndAmount getParValue() {
		return parValue;
	}

	public void setParValue(CurrencyAndAmount parValue) {
		this.parValue = parValue;
	}

	public Number getVotingRightsPerShare() {
		return votingRightsPerShare;
	}

	public void setVotingRightsPerShare(Number votingRightsPerShare) {
		this.votingRightsPerShare = votingRightsPerShare;
	}
}