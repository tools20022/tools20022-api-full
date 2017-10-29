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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.msg.Equalisation1;
import com.tools20022.repository.msg.Equalisation2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Part of an investor's subscription amount that is held by the fund in order
 * to pay incentive / performance fees at the end of the fiscal year.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Equalisation" src="doc-files/Equalisation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Equalisation#Amount
 * Equalisation.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Equalisation#Date
 * Equalisation.Date}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Equalisation#Rate
 * Equalisation.Rate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Equalisation#RelatedInvestmentFundTransaction
 * Equalisation.RelatedInvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Equalisation#CreditDebitIndicator
 * Equalisation.CreditDebitIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#Equalisation
 * InvestmentFundClass.Equalisation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Equalisation1 Equalisation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Equalisation2 Equalisation2}</li>
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
 * "Equalisation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Part of an investor's subscription amount that is held by the fund in order to pay incentive / performance fees at the end of the fiscal year."
 * </li>
 * </ul>
 */
public class Equalisation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount of money resulting from the calculation of the equalisation.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#EqualisationAmount
	 * CorporateActionAmounts23.EqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#EqualisationRate
	 * RateDetails11.EqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#EqualisationAmount
	 * CorporateActionAmounts24.EqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#EqualisationRate
	 * RateDetails12.EqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#EqualisationAmount
	 * CorporateActionAmounts22.EqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#EqualisationAmount
	 * CorporateActionAmounts25.EqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#EqualisationAmount
	 * CorporateActionAmounts21.EqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#EqualisationAmount
	 * CorporateActionAmounts26.EqualisationAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Equalisation1#Amount
	 * Equalisation1.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Equalisation2#Amount
	 * Equalisation2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#EqualisationAmount
	 * CorporateActionAmounts29.EqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#EqualisationRate
	 * RateDetails15.EqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#EqualisationAmount
	 * CorporateActionAmounts27.EqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#EqualisationAmount
	 * CorporateActionAmounts28.EqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#EqualisationAmount
	 * CorporateActionAmounts33.EqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#EqualisationAmount
	 * CorporateActionAmounts32.EqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#EqualisationRate
	 * RateDetails21.EqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#EqualisationAmount
	 * CorporateActionAmounts35.EqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#EqualisationAmount
	 * CorporateActionAmounts37.EqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#EqualisationRate
	 * RateDetails23.EqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#EqualisationAmount
	 * CorporateActionAmounts36.EqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#EqualisationAmount
	 * CorporateActionAmounts38.EqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#EqualisationRate
	 * RateDetails24.EqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#EqualisationAmount
	 * CorporateActionAmounts39.EqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#EqualisationAmount
	 * CorporateActionAmounts41.EqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#EqualisationAmount
	 * CorporateActionAmounts40.EqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#EqualisationRate
	 * RateDetails27.EqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#EqualisationRate
	 * RateDetails30.EqualisationRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Equalisation Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money resulting from the calculation of the equalisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionAmounts23.EqualisationAmount, com.tools20022.repository.msg.RateDetails11.EqualisationRate,
					com.tools20022.repository.msg.CorporateActionAmounts24.EqualisationAmount, com.tools20022.repository.msg.RateDetails12.EqualisationRate, com.tools20022.repository.msg.CorporateActionAmounts22.EqualisationAmount,
					com.tools20022.repository.msg.CorporateActionAmounts25.EqualisationAmount, com.tools20022.repository.msg.CorporateActionAmounts21.EqualisationAmount,
					com.tools20022.repository.msg.CorporateActionAmounts26.EqualisationAmount, com.tools20022.repository.msg.Equalisation1.Amount, com.tools20022.repository.msg.Equalisation2.Amount,
					com.tools20022.repository.msg.CorporateActionAmounts29.EqualisationAmount, com.tools20022.repository.msg.RateDetails15.EqualisationRate, com.tools20022.repository.msg.CorporateActionAmounts27.EqualisationAmount,
					com.tools20022.repository.msg.CorporateActionAmounts28.EqualisationAmount, com.tools20022.repository.msg.CorporateActionAmounts33.EqualisationAmount,
					com.tools20022.repository.msg.CorporateActionAmounts32.EqualisationAmount, com.tools20022.repository.msg.RateDetails21.EqualisationRate, com.tools20022.repository.msg.CorporateActionAmounts35.EqualisationAmount,
					com.tools20022.repository.msg.CorporateActionAmounts37.EqualisationAmount, com.tools20022.repository.msg.RateDetails23.EqualisationRate, com.tools20022.repository.msg.CorporateActionAmounts36.EqualisationAmount,
					com.tools20022.repository.msg.CorporateActionAmounts38.EqualisationAmount, com.tools20022.repository.msg.RateDetails24.EqualisationRate, com.tools20022.repository.msg.CorporateActionAmounts39.EqualisationAmount,
					com.tools20022.repository.msg.CorporateActionAmounts41.EqualisationAmount, com.tools20022.repository.msg.CorporateActionAmounts40.EqualisationAmount, com.tools20022.repository.msg.RateDetails27.EqualisationRate,
					com.tools20022.repository.msg.RateDetails30.EqualisationRate);
			elementContext_lazy = () -> Equalisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money resulting from the calculation of the equalisation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Date on which all or part of any holding bought in a unit trust is
	 * subject to being treated as capital rather than income. This is normally
	 * one day after the previous distribution's ex date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#EqualisationDate
	 * CorporateActionDate1.EqualisationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#EqualisationDate
	 * CorporateActionDate13.EqualisationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#EqualisationDate
	 * CorporateActionDate14.EqualisationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#EqualisationDate
	 * CorporateActionDate21.EqualisationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#EqualisationDate
	 * CorporateActionDate22.EqualisationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#EqualisationDate
	 * CorporateActionDate25.EqualisationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#EqualisationDate
	 * CorporateActionDate27.EqualisationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#EqualisationDate
	 * CorporateActionDate28.EqualisationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#EqualisationDate
	 * CorporateActionDate2.EqualisationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#EqualisationDate
	 * CorporateActionDate44.EqualisationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#EqualisationDate
	 * CorporateActionDate58.EqualisationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Equalisation Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which all or part of any holding bought in a unit trust is subject to being treated as capital rather than income. This is normally one day after the previous distribution's ex date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Date = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.EqualisationDate, com.tools20022.repository.msg.CorporateActionDate13.EqualisationDate,
					com.tools20022.repository.msg.CorporateActionDate14.EqualisationDate, com.tools20022.repository.msg.CorporateActionDate21.EqualisationDate, com.tools20022.repository.msg.CorporateActionDate22.EqualisationDate,
					com.tools20022.repository.msg.CorporateActionDate25.EqualisationDate, com.tools20022.repository.msg.CorporateActionDate27.EqualisationDate, com.tools20022.repository.msg.CorporateActionDate28.EqualisationDate,
					com.tools20022.repository.msg.CorporateActionDate2.EqualisationDate, com.tools20022.repository.msg.CorporateActionDate44.EqualisationDate, com.tools20022.repository.msg.CorporateActionDate58.EqualisationDate);
			elementContext_lazy = () -> Equalisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Date";
			definition = "Date on which all or part of any holding bought in a unit trust is subject to being treated as capital rather than income. This is normally one day after the previous distribution's ex date.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Rate used for calculation of the equalisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#EqualisationRate
	 * RateDetails10.EqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#EqualisationRate
	 * RateDetails13.EqualisationRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Equalisation1#Rate
	 * Equalisation1.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Equalisation2#Rate
	 * Equalisation2.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#EqualisationRate
	 * RateDetails14.EqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#EqualisationRate
	 * RateDetails18.EqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#EqualisationRate
	 * RateDetails22.EqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#EqualisationRate
	 * RateDetails25.EqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#EqualisationRate
	 * RateDetails26.EqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#EqualisationRate
	 * RateDetails28.EqualisationRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Equalisation Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate used for calculation of the equalisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RateDetails10.EqualisationRate, com.tools20022.repository.msg.RateDetails13.EqualisationRate, com.tools20022.repository.msg.Equalisation1.Rate,
					com.tools20022.repository.msg.Equalisation2.Rate, com.tools20022.repository.msg.RateDetails14.EqualisationRate, com.tools20022.repository.msg.RateDetails18.EqualisationRate,
					com.tools20022.repository.msg.RateDetails22.EqualisationRate, com.tools20022.repository.msg.RateDetails25.EqualisationRate, com.tools20022.repository.msg.RateDetails26.EqualisationRate,
					com.tools20022.repository.msg.RateDetails28.EqualisationRate);
			elementContext_lazy = () -> Equalisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Rate used for calculation of the equalisation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Investment fund transaction for which equalisation is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#Equalisation
	 * InvestmentFundClass.Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Equalisation Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestmentFundTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund transaction for which equalisation is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedInvestmentFundTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Equalisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestmentFundTransaction";
			definition = "Investment fund transaction for which equalisation is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundClass.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.Equalisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Debit for a negative amount or credit for a positive amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Equalisation Equalisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Debit for a negative amount or credit for a positive amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Equalisation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Debit for a negative amount or credit for a positive amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Equalisation";
				definition = "Part of an investor's subscription amount that is held by the fund in order to pay incentive / performance fees at the end of the fiscal year.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.Equalisation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Equalisation.Amount, com.tools20022.repository.entity.Equalisation.Date, com.tools20022.repository.entity.Equalisation.Rate,
						com.tools20022.repository.entity.Equalisation.RelatedInvestmentFundTransaction, com.tools20022.repository.entity.Equalisation.CreditDebitIndicator);
				derivationComponent_lazy = () -> Arrays.asList(Equalisation1.mmObject(), Equalisation2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}