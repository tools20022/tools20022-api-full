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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

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
 * <li>{@linkplain com.tools20022.repository.entity.Equalisation#mmAmount
 * Equalisation.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Equalisation#mmDate
 * Equalisation.mmDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Equalisation#mmRate
 * Equalisation.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Equalisation#mmRelatedInvestmentFundTransaction
 * Equalisation.mmRelatedInvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Equalisation#mmCreditDebitIndicator
 * Equalisation.mmCreditDebitIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmEqualisation
 * InvestmentFundClass.mmEqualisation}</li>
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
	protected CurrencyAndAmount amount;
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmEqualisationAmount
	 * CorporateActionAmounts23.mmEqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#mmEqualisationRate
	 * RateDetails11.mmEqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmEqualisationAmount
	 * CorporateActionAmounts24.mmEqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#mmEqualisationRate
	 * RateDetails12.mmEqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmEqualisationAmount
	 * CorporateActionAmounts22.mmEqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#mmEqualisationAmount
	 * CorporateActionAmounts25.mmEqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#mmEqualisationAmount
	 * CorporateActionAmounts21.mmEqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#mmEqualisationAmount
	 * CorporateActionAmounts26.mmEqualisationAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Equalisation1#mmAmount
	 * Equalisation1.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Equalisation2#mmAmount
	 * Equalisation2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmEqualisationAmount
	 * CorporateActionAmounts29.mmEqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#mmEqualisationRate
	 * RateDetails15.mmEqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#mmEqualisationAmount
	 * CorporateActionAmounts27.mmEqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmEqualisationAmount
	 * CorporateActionAmounts28.mmEqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#mmEqualisationAmount
	 * CorporateActionAmounts33.mmEqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#mmEqualisationAmount
	 * CorporateActionAmounts32.mmEqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#mmEqualisationRate
	 * RateDetails21.mmEqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmEqualisationAmount
	 * CorporateActionAmounts35.mmEqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmEqualisationAmount
	 * CorporateActionAmounts37.mmEqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#mmEqualisationRate
	 * RateDetails23.mmEqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmEqualisationAmount
	 * CorporateActionAmounts36.mmEqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmEqualisationAmount
	 * CorporateActionAmounts38.mmEqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#mmEqualisationRate
	 * RateDetails24.mmEqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmEqualisationAmount
	 * CorporateActionAmounts39.mmEqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#mmEqualisationAmount
	 * CorporateActionAmounts41.mmEqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#mmEqualisationAmount
	 * CorporateActionAmounts40.mmEqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#mmEqualisationRate
	 * RateDetails27.mmEqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#mmEqualisationRate
	 * RateDetails30.mmEqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts42#mmEqualisationAmount
	 * CorporateActionAmounts42.mmEqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts43#mmEqualisationAmount
	 * CorporateActionAmounts43.mmEqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails32#mmEqualisationRate
	 * RateDetails32.mmEqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmEqualisationAmount
	 * CorporateActionAmounts44.mmEqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmEqualisationAmount
	 * CorporateActionAmounts45.mmEqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails33#mmEqualisationRate
	 * RateDetails33.mmEqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts46#mmEqualisationAmount
	 * CorporateActionAmounts46.mmEqualisationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts47#mmEqualisationAmount
	 * CorporateActionAmounts47.mmEqualisationAmount}</li>
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
	public static final MMBusinessAttribute<Equalisation, CurrencyAndAmount> mmAmount = new MMBusinessAttribute<Equalisation, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionAmounts23.mmEqualisationAmount, RateDetails11.mmEqualisationRate, CorporateActionAmounts24.mmEqualisationAmount, RateDetails12.mmEqualisationRate,
					CorporateActionAmounts22.mmEqualisationAmount, CorporateActionAmounts25.mmEqualisationAmount, CorporateActionAmounts21.mmEqualisationAmount, CorporateActionAmounts26.mmEqualisationAmount, Equalisation1.mmAmount,
					Equalisation2.mmAmount, CorporateActionAmounts29.mmEqualisationAmount, RateDetails15.mmEqualisationRate, CorporateActionAmounts27.mmEqualisationAmount, CorporateActionAmounts28.mmEqualisationAmount,
					CorporateActionAmounts33.mmEqualisationAmount, CorporateActionAmounts32.mmEqualisationAmount, RateDetails21.mmEqualisationRate, CorporateActionAmounts35.mmEqualisationAmount,
					CorporateActionAmounts37.mmEqualisationAmount, RateDetails23.mmEqualisationRate, CorporateActionAmounts36.mmEqualisationAmount, CorporateActionAmounts38.mmEqualisationAmount, RateDetails24.mmEqualisationRate,
					CorporateActionAmounts39.mmEqualisationAmount, CorporateActionAmounts41.mmEqualisationAmount, CorporateActionAmounts40.mmEqualisationAmount, RateDetails27.mmEqualisationRate, RateDetails30.mmEqualisationRate,
					CorporateActionAmounts42.mmEqualisationAmount, CorporateActionAmounts43.mmEqualisationAmount, RateDetails32.mmEqualisationRate, CorporateActionAmounts44.mmEqualisationAmount,
					CorporateActionAmounts45.mmEqualisationAmount, RateDetails33.mmEqualisationRate, CorporateActionAmounts46.mmEqualisationAmount, CorporateActionAmounts47.mmEqualisationAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Equalisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money resulting from the calculation of the equalisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Equalisation obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(Equalisation obj, CurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	protected ISODateTime date;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmEqualisationDate
	 * CorporateActionDate1.mmEqualisationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmEqualisationDate
	 * CorporateActionDate13.mmEqualisationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmEqualisationDate
	 * CorporateActionDate14.mmEqualisationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmEqualisationDate
	 * CorporateActionDate21.mmEqualisationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmEqualisationDate
	 * CorporateActionDate22.mmEqualisationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmEqualisationDate
	 * CorporateActionDate25.mmEqualisationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmEqualisationDate
	 * CorporateActionDate27.mmEqualisationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmEqualisationDate
	 * CorporateActionDate28.mmEqualisationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmEqualisationDate
	 * CorporateActionDate2.mmEqualisationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmEqualisationDate
	 * CorporateActionDate44.mmEqualisationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmEqualisationDate
	 * CorporateActionDate58.mmEqualisationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmEqualisationDate
	 * CorporateActionDate61.mmEqualisationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmEqualisationDate
	 * CorporateActionDate74.mmEqualisationDate}</li>
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
	public static final MMBusinessAttribute<Equalisation, ISODateTime> mmDate = new MMBusinessAttribute<Equalisation, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate1.mmEqualisationDate, CorporateActionDate13.mmEqualisationDate, CorporateActionDate14.mmEqualisationDate, CorporateActionDate21.mmEqualisationDate,
					CorporateActionDate22.mmEqualisationDate, CorporateActionDate25.mmEqualisationDate, CorporateActionDate27.mmEqualisationDate, CorporateActionDate28.mmEqualisationDate, CorporateActionDate2.mmEqualisationDate,
					CorporateActionDate44.mmEqualisationDate, CorporateActionDate58.mmEqualisationDate, CorporateActionDate61.mmEqualisationDate, CorporateActionDate74.mmEqualisationDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Equalisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Date";
			definition = "Date on which all or part of any holding bought in a unit trust is subject to being treated as capital rather than income. This is normally one day after the previous distribution's ex date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Equalisation obj) {
			return obj.getDate();
		}

		@Override
		public void setValue(Equalisation obj, ISODateTime value) {
			obj.setDate(value);
		}
	};
	protected PercentageRate rate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmEqualisationRate
	 * RateDetails10.mmEqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#mmEqualisationRate
	 * RateDetails13.mmEqualisationRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Equalisation1#mmRate
	 * Equalisation1.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Equalisation2#mmRate
	 * Equalisation2.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmEqualisationRate
	 * RateDetails14.mmEqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#mmEqualisationRate
	 * RateDetails18.mmEqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmEqualisationRate
	 * RateDetails22.mmEqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#mmEqualisationRate
	 * RateDetails25.mmEqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#mmEqualisationRate
	 * RateDetails26.mmEqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#mmEqualisationRate
	 * RateDetails28.mmEqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails31#mmEqualisationRate
	 * RateDetails31.mmEqualisationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails34#mmEqualisationRate
	 * RateDetails34.mmEqualisationRate}</li>
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
	public static final MMBusinessAttribute<Equalisation, PercentageRate> mmRate = new MMBusinessAttribute<Equalisation, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(RateDetails10.mmEqualisationRate, RateDetails13.mmEqualisationRate, Equalisation1.mmRate, Equalisation2.mmRate, RateDetails14.mmEqualisationRate, RateDetails18.mmEqualisationRate,
					RateDetails22.mmEqualisationRate, RateDetails25.mmEqualisationRate, RateDetails26.mmEqualisationRate, RateDetails28.mmEqualisationRate, RateDetails31.mmEqualisationRate, RateDetails34.mmEqualisationRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Equalisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Rate used for calculation of the equalisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Equalisation obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(Equalisation obj, PercentageRate value) {
			obj.setRate(value);
		}
	};
	protected InvestmentFundClass relatedInvestmentFundTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmEqualisation
	 * InvestmentFundClass.mmEqualisation}</li>
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
	public static final MMBusinessAssociationEnd<Equalisation, Optional<InvestmentFundClass>> mmRelatedInvestmentFundTransaction = new MMBusinessAssociationEnd<Equalisation, Optional<InvestmentFundClass>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Equalisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestmentFundTransaction";
			definition = "Investment fund transaction for which equalisation is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> InvestmentFundClass.mmEqualisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentFundClass.mmObject();
		}

		@Override
		public Optional<InvestmentFundClass> getValue(Equalisation obj) {
			return obj.getRelatedInvestmentFundTransaction();
		}

		@Override
		public void setValue(Equalisation obj, Optional<InvestmentFundClass> value) {
			obj.setRelatedInvestmentFundTransaction(value.orElse(null));
		}
	};
	protected DebitCreditCode creditDebitIndicator;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Equalisation, DebitCreditCode> mmCreditDebitIndicator = new MMBusinessAttribute<Equalisation, DebitCreditCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Equalisation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Debit for a negative amount or credit for a positive amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}

		@Override
		public DebitCreditCode getValue(Equalisation obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(Equalisation obj, DebitCreditCode value) {
			obj.setCreditDebitIndicator(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Equalisation";
				definition = "Part of an investor's subscription amount that is held by the fund in order to pay incentive / performance fees at the end of the fiscal year.";
				associationDomain_lazy = () -> Arrays.asList(InvestmentFundClass.mmEqualisation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Equalisation.mmAmount, com.tools20022.repository.entity.Equalisation.mmDate, com.tools20022.repository.entity.Equalisation.mmRate,
						com.tools20022.repository.entity.Equalisation.mmRelatedInvestmentFundTransaction, com.tools20022.repository.entity.Equalisation.mmCreditDebitIndicator);
				derivationComponent_lazy = () -> Arrays.asList(Equalisation1.mmObject(), Equalisation2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Equalisation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public Equalisation setAmount(CurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public ISODateTime getDate() {
		return date;
	}

	public Equalisation setDate(ISODateTime date) {
		this.date = Objects.requireNonNull(date);
		return this;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public Equalisation setRate(PercentageRate rate) {
		this.rate = Objects.requireNonNull(rate);
		return this;
	}

	public Optional<InvestmentFundClass> getRelatedInvestmentFundTransaction() {
		return relatedInvestmentFundTransaction == null ? Optional.empty() : Optional.of(relatedInvestmentFundTransaction);
	}

	public Equalisation setRelatedInvestmentFundTransaction(InvestmentFundClass relatedInvestmentFundTransaction) {
		this.relatedInvestmentFundTransaction = relatedInvestmentFundTransaction;
		return this;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public Equalisation setCreditDebitIndicator(DebitCreditCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}
}