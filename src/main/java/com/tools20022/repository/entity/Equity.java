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
import com.tools20022.repository.codeset.PreferenceToIncomeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.msg.Equity1;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Equity#PreferenceToIncome
 * Equity.PreferenceToIncome}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Equity#ConvertibleIndicator
 * Equity.ConvertibleIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Equity#NonPaidAmount
 * Equity.NonPaidAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Equity#ParValue
 * Equity.ParValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Equity#VotingRightsPerShare
 * Equity.VotingRightsPerShare}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentProperties1Choice#Equity
 * FinancialInstrumentProperties1Choice.Equity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument28#Equity
 * FinancialInstrument28.Equity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PreferenceToIncome1Choice#Code
	 * PreferenceToIncome1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PreferenceToIncome1Choice#Proprietary
	 * PreferenceToIncome1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PreferenceToIncome2Choice#Code
	 * PreferenceToIncome2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PreferenceToIncome2Choice#Proprietary
	 * PreferenceToIncome2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#PreferenceToIncome
	 * FinancialInstrumentAttributes8.PreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#PreferenceToIncome
	 * FinancialInstrumentAttributes20.PreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#PreferenceToIncome
	 * FinancialInstrumentAttributes4.PreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PreferenceToIncome3Choice#Code
	 * PreferenceToIncome3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PreferenceToIncome3Choice#Proprietary
	 * PreferenceToIncome3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#PreferenceToIncome
	 * FinancialInstrumentAttributes13.PreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#PreferenceToIncome
	 * FinancialInstrumentAttributes21.PreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#PreferenceToIncome
	 * FinancialInstrumentAttributes26.PreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#PreferenceToIncome
	 * FinancialInstrumentAttributes27.PreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#PreferenceToIncome
	 * FinancialInstrumentAttributes14.PreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#PreferenceToIncome
	 * FinancialInstrumentAttributes30.PreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#PreferenceToIncome
	 * FinancialInstrumentAttributes28.PreferenceToIncome}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Equity1#PreferenceToIncome
	 * Equity1.PreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#PreferenceToIncome
	 * FinancialInstrumentAttributes15.PreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#PreferenceToIncome
	 * FinancialInstrumentAttributes29.PreferenceToIncome}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Equity2#PreferenceToIncome
	 * Equity2.PreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#PreferenceToIncome
	 * FinancialInstrumentAttributes2.PreferenceToIncome}</li>
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
	public static final MMBusinessAttribute PreferenceToIncome = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays
					.asList(com.tools20022.repository.choice.PreferenceToIncome1Choice.Code, com.tools20022.repository.choice.PreferenceToIncome1Choice.Proprietary, com.tools20022.repository.choice.PreferenceToIncome2Choice.Code,
							com.tools20022.repository.choice.PreferenceToIncome2Choice.Proprietary, com.tools20022.repository.msg.FinancialInstrumentAttributes8.PreferenceToIncome,
							com.tools20022.repository.msg.FinancialInstrumentAttributes20.PreferenceToIncome, com.tools20022.repository.msg.FinancialInstrumentAttributes4.PreferenceToIncome,
							com.tools20022.repository.choice.PreferenceToIncome3Choice.Code, com.tools20022.repository.choice.PreferenceToIncome3Choice.Proprietary,
							com.tools20022.repository.msg.FinancialInstrumentAttributes13.PreferenceToIncome, com.tools20022.repository.msg.FinancialInstrumentAttributes21.PreferenceToIncome,
							com.tools20022.repository.msg.FinancialInstrumentAttributes26.PreferenceToIncome, com.tools20022.repository.msg.FinancialInstrumentAttributes27.PreferenceToIncome,
							com.tools20022.repository.msg.FinancialInstrumentAttributes14.PreferenceToIncome, com.tools20022.repository.msg.FinancialInstrumentAttributes30.PreferenceToIncome,
							com.tools20022.repository.msg.FinancialInstrumentAttributes28.PreferenceToIncome, com.tools20022.repository.msg.Equity1.PreferenceToIncome,
							com.tools20022.repository.msg.FinancialInstrumentAttributes15.PreferenceToIncome, com.tools20022.repository.msg.FinancialInstrumentAttributes29.PreferenceToIncome,
							com.tools20022.repository.msg.Equity2.PreferenceToIncome, com.tools20022.repository.msg.FinancialInstrumentAttributes2.PreferenceToIncome);
			elementContext_lazy = () -> Equity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreferenceToIncome";
			definition = "Indicates the  level of priority to claim on income and assets of the company in case of the payment of dividends and in the event of a bankruptcy, for example, ordinary/common stocks, preferred stocks, subordinated debt, etc.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PreferenceToIncomeCode.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Equity1#ConvertibleIndicator
	 * Equity1.ConvertibleIndicator}</li>
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
	public static final MMBusinessAttribute ConvertibleIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Equity1.ConvertibleIndicator);
			elementContext_lazy = () -> Equity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConvertibleIndicator";
			definition = "Indicates whether the investor or the issuer has a conversion option.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Equity1#NonPaidAmount
	 * Equity1.NonPaidAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Equity2#NonPaidAmount
	 * Equity2.NonPaidAmount}</li>
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
	public static final MMBusinessAttribute NonPaidAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Equity1.NonPaidAmount, com.tools20022.repository.msg.Equity2.NonPaidAmount);
			elementContext_lazy = () -> Equity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonPaidAmount";
			definition = "Nominal amount which is not paid yet.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Equity1#ParValue
	 * Equity1.ParValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Equity2#ParValue
	 * Equity2.ParValue}</li>
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
	public static final MMBusinessAttribute ParValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Equity1.ParValue, com.tools20022.repository.msg.Equity2.ParValue);
			elementContext_lazy = () -> Equity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ParValue";
			definition = "Nominal value of an equity security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Number of voting rights per share.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.Equity1#VotingRightsPerShare
	 * Equity1.VotingRightsPerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Equity2#VotingRightsPerShare
	 * Equity2.VotingRightsPerShare}</li>
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
	public static final MMBusinessAttribute VotingRightsPerShare = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Equity1.VotingRightsPerShare, com.tools20022.repository.msg.Equity2.VotingRightsPerShare);
			elementContext_lazy = () -> Equity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VotingRightsPerShare";
			definition = "Number of voting rights per share.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Equity";
				definition = "Financial instrument that represents a title of ownership in a company. That is, the shareholder is entitled to a part of the company's profit - usually by payment of a dividend - and to voting rights, if any. Each company issues generally different classes of shares, for example, ordinary or common shares, which have no guaranteed amount of dividend but carry voting rights, or preferred shares, which receive dividends before ordinary shares but have no voting right.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FinancialInstrumentProperties1Choice.Equity, com.tools20022.repository.msg.FinancialInstrument28.Equity);
				superType_lazy = () -> Security.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Equity.PreferenceToIncome, com.tools20022.repository.entity.Equity.ConvertibleIndicator, com.tools20022.repository.entity.Equity.NonPaidAmount,
						com.tools20022.repository.entity.Equity.ParValue, com.tools20022.repository.entity.Equity.VotingRightsPerShare);
				derivationComponent_lazy = () -> Arrays.asList(Equity1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}