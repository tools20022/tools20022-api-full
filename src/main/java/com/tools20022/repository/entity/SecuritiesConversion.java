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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Conversion exchange of securities, generally convertible bonds or preferred
 * equities, into another form of securities, usually common equities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesConversion" src="doc-files/SecuritiesConversion.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionPrice
 * SecuritiesConversion.ConversionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionDate
 * SecuritiesConversion.ConversionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#MinimumExercisableQuantity
 * SecuritiesConversion.MinimumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#MinimumExercisableMultipleQuantity
 * SecuritiesConversion.MinimumExercisableMultipleQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#MaximumExercisableQuantity
 * SecuritiesConversion.MaximumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionType
 * SecuritiesConversion.ConversionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionPeriod
 * SecuritiesConversion.ConversionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionRatioDenominator
 * SecuritiesConversion.ConversionRatioDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionRatioNumerator
 * SecuritiesConversion.ConversionRatioNumerator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesConversion#Ratio
 * SecuritiesConversion.Ratio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionUnitCurrency
 * SecuritiesConversion.ConversionUnitCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#RelatedOption
 * SecuritiesConversion.RelatedOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#BusinessDayConvention
 * SecuritiesConversion.BusinessDayConvention}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionChoice
 * SecuritiesConversion.ConversionChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionFixedExchangeRate
 * SecuritiesConversion.ConversionFixedExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionMarginAmount
 * SecuritiesConversion.ConversionMarginAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionOption
 * SecuritiesConversion.ConversionOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionQuotedCurrency
 * SecuritiesConversion.ConversionQuotedCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#FinancialCenter
 * SecuritiesConversion.FinancialCenter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#MinimumNoticeDays
 * SecuritiesConversion.MinimumNoticeDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#NoticePeriodType
 * SecuritiesConversion.NoticePeriodType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ProtectionAgainstDilutionIndicator
 * SecuritiesConversion.ProtectionAgainstDilutionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ReverseConversionIndicator
 * SecuritiesConversion.ReverseConversionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#SecurityIdentification
 * SecuritiesConversion.SecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#PartyType
 * SecuritiesConversion.PartyType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ContractSize
 * SecuritiesConversion.ContractSize}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Conversion
 * Security.Conversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedSecuritiesConversion
 * SecuritiesPricing.RelatedSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#SecuritiesConversion
 * DateTimePeriod.SecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumExercisableQuantitySecuritiesConversion
 * SecuritiesQuantity.MinimumExercisableQuantitySecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumExercisableMultipleQuantitySecuritiesConversion
 * SecuritiesQuantity.MinimumExercisableMultipleQuantitySecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumExercisableQuantitySecuritiesConversion
 * SecuritiesQuantity.MaximumExercisableQuantitySecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RatioDenominatorSecuritiesConversion
 * SecuritiesQuantity.RatioDenominatorSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RatioNumeratorSecuritiesConversion
 * SecuritiesQuantity.RatioNumeratorSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForSecuritiesConversion
 * CurrencyExchange.CurrencyExchangeForSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Option#OptionConversionInformation
 * Option.OptionConversionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#SecuritiesConversion
 * UnderlyingRatio.SecuritiesConversion}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.ConversionTypeFormat1Choice
 * ConversionTypeFormat1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ConversionTypeFormat2Choice
 * ConversionTypeFormat2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ConversionType1FormatChoice
 * ConversionType1FormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ConversionTypeFormat3Choice
 * ConversionTypeFormat3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ConversionTypeFormat4Choice
 * ConversionTypeFormat4Choice}</li>
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
 * "SecuritiesConversion"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Conversion exchange of securities, generally convertible bonds or preferred equities, into another form of securities, usually common equities."
 * </li>
 * </ul>
 */
public class SecuritiesConversion {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Price of one target security in the conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedSecuritiesConversion
	 * SecuritiesPricing.RelatedSecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#ConversionPrice
	 * FinancialInstrumentAttributes8.ConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#ConversionPrice
	 * FinancialInstrumentAttributes20.ConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#ConversionPrice
	 * FinancialInstrumentAttributes35.ConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#ConversionPrice
	 * FinancialInstrumentAttributes41.ConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#ConversionPrice
	 * FinancialInstrumentAttributes4.ConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#ConversionPrice
	 * FinancialInstrumentAttributes13.ConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#ConversionPrice
	 * FinancialInstrumentAttributes21.ConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#ConversionPrice
	 * FinancialInstrumentAttributes26.ConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#ConversionPrice
	 * FinancialInstrumentAttributes36.ConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#ConversionPrice
	 * FinancialInstrumentAttributes42.ConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#ConversionPrice
	 * FinancialInstrumentAttributes27.ConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#ConversionPrice
	 * FinancialInstrumentAttributes14.ConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#ConversionPrice
	 * FinancialInstrumentAttributes30.ConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#ConversionPrice
	 * FinancialInstrumentAttributes28.ConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#ConversionPrice
	 * FinancialInstrumentAttributes31.ConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#ConversionPrice
	 * FinancialInstrumentAttributes44.ConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#ConversionPrice
	 * FinancialInstrumentAttributes15.ConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#ConversionPrice
	 * FinancialInstrumentAttributes29.ConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#ConversionPrice
	 * FinancialInstrumentAttributes2.ConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#ConversionPrice
	 * FinancialInstrumentAttributes63.ConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#ConversionPrice
	 * FinancialInstrumentAttributes64.ConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#ConversionPrice
	 * FinancialInstrumentAttributes75.ConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#ConversionPrice
	 * FinancialInstrumentAttributes78.ConversionPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price of one target security in the conversion."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ConversionPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes8.ConversionPrice, com.tools20022.repository.msg.FinancialInstrumentAttributes20.ConversionPrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.ConversionPrice, com.tools20022.repository.msg.FinancialInstrumentAttributes41.ConversionPrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.ConversionPrice, com.tools20022.repository.msg.FinancialInstrumentAttributes13.ConversionPrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.ConversionPrice, com.tools20022.repository.msg.FinancialInstrumentAttributes26.ConversionPrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.ConversionPrice, com.tools20022.repository.msg.FinancialInstrumentAttributes42.ConversionPrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.ConversionPrice, com.tools20022.repository.msg.FinancialInstrumentAttributes14.ConversionPrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.ConversionPrice, com.tools20022.repository.msg.FinancialInstrumentAttributes28.ConversionPrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes31.ConversionPrice, com.tools20022.repository.msg.FinancialInstrumentAttributes44.ConversionPrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes15.ConversionPrice, com.tools20022.repository.msg.FinancialInstrumentAttributes29.ConversionPrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.ConversionPrice, com.tools20022.repository.msg.FinancialInstrumentAttributes63.ConversionPrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes64.ConversionPrice, com.tools20022.repository.msg.FinancialInstrumentAttributes75.ConversionPrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes78.ConversionPrice);
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionPrice";
			definition = "Price of one target security in the conversion.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.RelatedSecuritiesConversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Deadline by which a convertible security must be converted according to
	 * the terms of the issue.
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#ConversionDate
	 * FinancialInstrumentAttributes6.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#ConversionDate
	 * FinancialInstrumentAttributes9.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#ConversionDate
	 * FinancialInstrumentAttributes18.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#ConversionDate
	 * FinancialInstrumentAttributes22.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#ConversionDate
	 * FinancialInstrumentAttributes32.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#ConversionDate
	 * FinancialInstrumentAttributes38.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#ConversionDate
	 * FinancialInstrumentAttributes7.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#ConversionDate
	 * FinancialInstrumentAttributes5.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#ConversionDate
	 * FinancialInstrumentAttributes11.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#ConversionDate
	 * FinancialInstrumentAttributes10.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#ConversionDate
	 * FinancialInstrumentAttributes19.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#ConversionDate
	 * FinancialInstrumentAttributes16.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#ConversionDate
	 * FinancialInstrumentAttributes23.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#ConversionDate
	 * FinancialInstrumentAttributes24.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#ConversionDate
	 * FinancialInstrumentAttributes33.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#ConversionDate
	 * FinancialInstrumentAttributes34.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#ConversionDate
	 * FinancialInstrumentAttributes39.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#ConversionDate
	 * FinancialInstrumentAttributes40.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#ConversionDate
	 * FinancialInstrumentAttributes43.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#ConversionDate
	 * FinancialInstrumentAttributes45.ConversionDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#ConversionDate
	 * Option1.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#ConversionDate
	 * FinancialInstrumentAttributes31.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#ConversionDate
	 * FinancialInstrumentAttributes44.ConversionDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option7#ConversionDate
	 * Option7.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#ConversionDate
	 * FinancialInstrumentAttributes2.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#ConversionDate
	 * FinancialInstrumentAttributes48.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#ConversionDate
	 * FinancialInstrumentAttributes50.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#ConversionDate
	 * FinancialInstrumentAttributes49.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#ConversionDate
	 * FinancialInstrumentAttributes55.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#ConversionDate
	 * FinancialInstrumentAttributes57.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#ConversionDate
	 * FinancialInstrumentAttributes56.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#ConversionDate
	 * FinancialInstrumentAttributes66.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#ConversionDate
	 * FinancialInstrumentAttributes65.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#ConversionDate
	 * FinancialInstrumentAttributes67.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#ConversionDate
	 * FinancialInstrumentAttributes70.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#ConversionDate
	 * FinancialInstrumentAttributes69.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#ConversionDate
	 * FinancialInstrumentAttributes71.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#ConversionDate
	 * FinancialInstrumentAttributes79.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#ConversionDate
	 * FinancialInstrumentAttributes81.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#ConversionDate
	 * FinancialInstrumentAttributes80.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#ConversionDate
	 * FinancialInstrumentAttributes85.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#ConversionDate
	 * FinancialInstrumentAttributes84.ConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#ConversionDate
	 * FinancialInstrumentAttributes83.ConversionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deadline by which a convertible security must be converted according to the terms of the issue."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ConversionDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes6.ConversionDate, com.tools20022.repository.msg.FinancialInstrumentAttributes9.ConversionDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes18.ConversionDate, com.tools20022.repository.msg.FinancialInstrumentAttributes22.ConversionDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes32.ConversionDate, com.tools20022.repository.msg.FinancialInstrumentAttributes38.ConversionDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes7.ConversionDate, com.tools20022.repository.msg.FinancialInstrumentAttributes5.ConversionDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes11.ConversionDate, com.tools20022.repository.msg.FinancialInstrumentAttributes10.ConversionDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes19.ConversionDate, com.tools20022.repository.msg.FinancialInstrumentAttributes16.ConversionDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes23.ConversionDate, com.tools20022.repository.msg.FinancialInstrumentAttributes24.ConversionDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes33.ConversionDate, com.tools20022.repository.msg.FinancialInstrumentAttributes34.ConversionDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes39.ConversionDate, com.tools20022.repository.msg.FinancialInstrumentAttributes40.ConversionDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes43.ConversionDate, com.tools20022.repository.msg.FinancialInstrumentAttributes45.ConversionDate, com.tools20022.repository.msg.Option1.ConversionDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes31.ConversionDate, com.tools20022.repository.msg.FinancialInstrumentAttributes44.ConversionDate, com.tools20022.repository.msg.Option7.ConversionDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.ConversionDate, com.tools20022.repository.msg.FinancialInstrumentAttributes48.ConversionDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes50.ConversionDate, com.tools20022.repository.msg.FinancialInstrumentAttributes49.ConversionDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes55.ConversionDate, com.tools20022.repository.msg.FinancialInstrumentAttributes57.ConversionDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes56.ConversionDate, com.tools20022.repository.msg.FinancialInstrumentAttributes66.ConversionDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes65.ConversionDate, com.tools20022.repository.msg.FinancialInstrumentAttributes67.ConversionDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes70.ConversionDate, com.tools20022.repository.msg.FinancialInstrumentAttributes69.ConversionDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes71.ConversionDate, com.tools20022.repository.msg.FinancialInstrumentAttributes79.ConversionDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes81.ConversionDate, com.tools20022.repository.msg.FinancialInstrumentAttributes80.ConversionDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes85.ConversionDate, com.tools20022.repository.msg.FinancialInstrumentAttributes84.ConversionDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes83.ConversionDate);
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionDate";
			definition = "Deadline by which a convertible security must be converted according to the terms of the issue.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Minimum quantity of financial instrument or lot of rights/warrants that
	 * must be exercised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumExercisableQuantitySecuritiesConversion
	 * SecuritiesQuantity.MinimumExercisableQuantitySecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes6.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes9.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes18.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes22.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes32.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes38.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes7.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption1#MinimumExercisableQuantity
	 * SecuritiesOption1.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes5.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes11.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption9#MinimumExercisableQuantity
	 * SecuritiesOption9.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes10.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes19.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption15#MinimumExercisableQuantity
	 * SecuritiesOption15.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes16.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes23.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption16#MinimumExercisableQuantity
	 * SecuritiesOption16.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes24.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes33.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23#MinimumExercisableQuantity
	 * SecuritiesOption23.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes34.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes39.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28#MinimumExercisableQuantity
	 * SecuritiesOption28.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes40.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes43.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes45.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity1#MinimumExercisableQuantity
	 * CorporateActionQuantity1.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity2#MinimumExercisableQuantity
	 * CorporateActionQuantity2.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity3#MinimumExercisableQuantity
	 * CorporateActionQuantity3.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4#MinimumExercisableQuantity
	 * CorporateActionQuantity4.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity5#MinimumExercisableQuantity
	 * CorporateActionQuantity5.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6#MinimumExercisableQuantity
	 * CorporateActionQuantity6.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option1#MinimumExercisableQuantity
	 * Option1.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes31.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes44.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#MinimumExercisableSecuritiesQuantity
	 * CorporateAction2.MinimumExercisableSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#MinimumExercisableSecuritiesQuantity
	 * SecurityOption1.MinimumExercisableSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes2.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes48.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes50.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes49.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes55.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes57.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#MinimumExercisableQuantity
	 * FinancialInstrumentAttributes56.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51#MinimumQuantityToInstruct
	 * SecuritiesOption51.MinimumQuantityToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#MinimumQuantityToInstruct
	 * FinancialInstrumentAttributes67.MinimumQuantityToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption56#MinimumQuantityToInstruct
	 * SecuritiesOption56.MinimumQuantityToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#MinimumQuantityToInstruct
	 * FinancialInstrumentAttributes71.MinimumQuantityToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#MinimumQuantityToInstruct
	 * FinancialInstrumentAttributes80.MinimumQuantityToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#MinimumQuantityToInstruct
	 * FinancialInstrumentAttributes83.MinimumQuantityToInstruct}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of financial instrument or lot of rights/warrants that must be exercised."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumExercisableQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes6.MinimumExercisableQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes9.MinimumExercisableQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes18.MinimumExercisableQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes22.MinimumExercisableQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes32.MinimumExercisableQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes38.MinimumExercisableQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes7.MinimumExercisableQuantity, com.tools20022.repository.msg.SecuritiesOption1.MinimumExercisableQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes5.MinimumExercisableQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes11.MinimumExercisableQuantity,
					com.tools20022.repository.msg.SecuritiesOption9.MinimumExercisableQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes10.MinimumExercisableQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes19.MinimumExercisableQuantity, com.tools20022.repository.msg.SecuritiesOption15.MinimumExercisableQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes16.MinimumExercisableQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes23.MinimumExercisableQuantity,
					com.tools20022.repository.msg.SecuritiesOption16.MinimumExercisableQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes24.MinimumExercisableQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes33.MinimumExercisableQuantity, com.tools20022.repository.msg.SecuritiesOption23.MinimumExercisableQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes34.MinimumExercisableQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes39.MinimumExercisableQuantity,
					com.tools20022.repository.msg.SecuritiesOption28.MinimumExercisableQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes40.MinimumExercisableQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes43.MinimumExercisableQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes45.MinimumExercisableQuantity,
					com.tools20022.repository.msg.CorporateActionQuantity1.MinimumExercisableQuantity, com.tools20022.repository.msg.CorporateActionQuantity2.MinimumExercisableQuantity,
					com.tools20022.repository.msg.CorporateActionQuantity3.MinimumExercisableQuantity, com.tools20022.repository.msg.CorporateActionQuantity4.MinimumExercisableQuantity,
					com.tools20022.repository.msg.CorporateActionQuantity5.MinimumExercisableQuantity, com.tools20022.repository.msg.CorporateActionQuantity6.MinimumExercisableQuantity,
					com.tools20022.repository.msg.Option1.MinimumExercisableQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes31.MinimumExercisableQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes44.MinimumExercisableQuantity, com.tools20022.repository.msg.CorporateAction2.MinimumExercisableSecuritiesQuantity,
					com.tools20022.repository.msg.SecurityOption1.MinimumExercisableSecuritiesQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes2.MinimumExercisableQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes48.MinimumExercisableQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes50.MinimumExercisableQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes49.MinimumExercisableQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes55.MinimumExercisableQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes57.MinimumExercisableQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes56.MinimumExercisableQuantity,
					com.tools20022.repository.msg.SecuritiesOption51.MinimumQuantityToInstruct, com.tools20022.repository.msg.FinancialInstrumentAttributes67.MinimumQuantityToInstruct,
					com.tools20022.repository.msg.SecuritiesOption56.MinimumQuantityToInstruct, com.tools20022.repository.msg.FinancialInstrumentAttributes71.MinimumQuantityToInstruct,
					com.tools20022.repository.msg.FinancialInstrumentAttributes80.MinimumQuantityToInstruct, com.tools20022.repository.msg.FinancialInstrumentAttributes83.MinimumQuantityToInstruct);
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableQuantity";
			definition = "Minimum quantity of financial instrument or lot of rights/warrants that must be exercised.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumExercisableQuantitySecuritiesConversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Minimum multiple quantity of financial instrument or lot of
	 * rights/warrants that must be exercised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumExercisableMultipleQuantitySecuritiesConversion
	 * SecuritiesQuantity.MinimumExercisableMultipleQuantitySecuritiesConversion
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes6.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes9.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes18.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes22.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes32.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes38.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes7.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption1#MinimumExercisableMultipleQuantity
	 * SecuritiesOption1.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes5.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes11.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption9#MinimumExercisableMultipleQuantity
	 * SecuritiesOption9.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes10.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes19.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption15#MinimumExercisableMultipleQuantity
	 * SecuritiesOption15.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes16.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes23.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption16#MinimumExercisableMultipleQuantity
	 * SecuritiesOption16.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes24.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes33.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23#MinimumExercisableMultipleQuantity
	 * SecuritiesOption23.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes34.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes39.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28#MinimumExercisableMultipleQuantity
	 * SecuritiesOption28.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes40.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes43.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes45.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity1#MinimumExercisableMultipleQuantity
	 * CorporateActionQuantity1.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity2#MinimumExercisableMultipleQuantity
	 * CorporateActionQuantity2.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity3#MinimumExercisableMultipleQuantity
	 * CorporateActionQuantity3.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4#MinimumExercisableMultipleQuantity
	 * CorporateActionQuantity4.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity5#MinimumExercisableMultipleQuantity
	 * CorporateActionQuantity5.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6#MinimumExercisableMultipleQuantity
	 * CorporateActionQuantity6.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option1#MinimumExercisableMultipleQuantity
	 * Option1.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes31.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes44.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#MinimumExercisableMultipleSecuritiesQuantity
	 * CorporateAction2.MinimumExercisableMultipleSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#MinimumExercisableMultipleSecuritiesQuantity
	 * SecurityOption1.MinimumExercisableMultipleSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes2.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes48.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes50.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes49.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes55.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes57.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#MinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes56.MinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51#MinimumMultipleQuantityToInstruct
	 * SecuritiesOption51.MinimumMultipleQuantityToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#MinimumMultipleQuantityToInstruct
	 * FinancialInstrumentAttributes67.MinimumMultipleQuantityToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption56#MinimumMultipleQuantityToInstruct
	 * SecuritiesOption56.MinimumMultipleQuantityToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#MinimumMultipleQuantityToInstruct
	 * FinancialInstrumentAttributes71.MinimumMultipleQuantityToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#MinimumMultipleQuantityToInstruct
	 * FinancialInstrumentAttributes80.MinimumMultipleQuantityToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#MinimumMultipleQuantityToInstruct
	 * FinancialInstrumentAttributes83.MinimumMultipleQuantityToInstruct}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableMultipleQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum multiple quantity of financial instrument or lot of rights/warrants that must be exercised."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumExercisableMultipleQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes6.MinimumExercisableMultipleQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes9.MinimumExercisableMultipleQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes18.MinimumExercisableMultipleQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes22.MinimumExercisableMultipleQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes32.MinimumExercisableMultipleQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes38.MinimumExercisableMultipleQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes7.MinimumExercisableMultipleQuantity,
					com.tools20022.repository.msg.SecuritiesOption1.MinimumExercisableMultipleQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes5.MinimumExercisableMultipleQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes11.MinimumExercisableMultipleQuantity, com.tools20022.repository.msg.SecuritiesOption9.MinimumExercisableMultipleQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes10.MinimumExercisableMultipleQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes19.MinimumExercisableMultipleQuantity,
					com.tools20022.repository.msg.SecuritiesOption15.MinimumExercisableMultipleQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes16.MinimumExercisableMultipleQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes23.MinimumExercisableMultipleQuantity, com.tools20022.repository.msg.SecuritiesOption16.MinimumExercisableMultipleQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes24.MinimumExercisableMultipleQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes33.MinimumExercisableMultipleQuantity,
					com.tools20022.repository.msg.SecuritiesOption23.MinimumExercisableMultipleQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes34.MinimumExercisableMultipleQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes39.MinimumExercisableMultipleQuantity, com.tools20022.repository.msg.SecuritiesOption28.MinimumExercisableMultipleQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes40.MinimumExercisableMultipleQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes43.MinimumExercisableMultipleQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes45.MinimumExercisableMultipleQuantity, com.tools20022.repository.msg.CorporateActionQuantity1.MinimumExercisableMultipleQuantity,
					com.tools20022.repository.msg.CorporateActionQuantity2.MinimumExercisableMultipleQuantity, com.tools20022.repository.msg.CorporateActionQuantity3.MinimumExercisableMultipleQuantity,
					com.tools20022.repository.msg.CorporateActionQuantity4.MinimumExercisableMultipleQuantity, com.tools20022.repository.msg.CorporateActionQuantity5.MinimumExercisableMultipleQuantity,
					com.tools20022.repository.msg.CorporateActionQuantity6.MinimumExercisableMultipleQuantity, com.tools20022.repository.msg.Option1.MinimumExercisableMultipleQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes31.MinimumExercisableMultipleQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes44.MinimumExercisableMultipleQuantity,
					com.tools20022.repository.msg.CorporateAction2.MinimumExercisableMultipleSecuritiesQuantity, com.tools20022.repository.msg.SecurityOption1.MinimumExercisableMultipleSecuritiesQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.MinimumExercisableMultipleQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes48.MinimumExercisableMultipleQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes50.MinimumExercisableMultipleQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes49.MinimumExercisableMultipleQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes55.MinimumExercisableMultipleQuantity, com.tools20022.repository.msg.FinancialInstrumentAttributes57.MinimumExercisableMultipleQuantity,
					com.tools20022.repository.msg.FinancialInstrumentAttributes56.MinimumExercisableMultipleQuantity, com.tools20022.repository.msg.SecuritiesOption51.MinimumMultipleQuantityToInstruct,
					com.tools20022.repository.msg.FinancialInstrumentAttributes67.MinimumMultipleQuantityToInstruct, com.tools20022.repository.msg.SecuritiesOption56.MinimumMultipleQuantityToInstruct,
					com.tools20022.repository.msg.FinancialInstrumentAttributes71.MinimumMultipleQuantityToInstruct, com.tools20022.repository.msg.FinancialInstrumentAttributes80.MinimumMultipleQuantityToInstruct,
					com.tools20022.repository.msg.FinancialInstrumentAttributes83.MinimumMultipleQuantityToInstruct);
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableMultipleQuantity";
			definition = "Minimum multiple quantity of financial instrument or lot of rights/warrants that must be exercised.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumExercisableMultipleQuantitySecuritiesConversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates the maximum quantity of financial instrument that may be
	 * exercised in the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumExercisableQuantitySecuritiesConversion
	 * SecuritiesQuantity.MaximumExercisableQuantitySecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption1#MaximumExercisableQuantity
	 * SecuritiesOption1.MaximumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption9#MaximumExercisableQuantity
	 * SecuritiesOption9.MaximumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption15#MaximumExercisableQuantity
	 * SecuritiesOption15.MaximumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption16#MaximumExercisableQuantity
	 * SecuritiesOption16.MaximumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23#MaximumExercisableQuantity
	 * SecuritiesOption23.MaximumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28#MaximumExercisableQuantity
	 * SecuritiesOption28.MaximumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option7#MinimumExercisableQuantity
	 * Option7.MinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51#MaximumQuantityToInstruct
	 * SecuritiesOption51.MaximumQuantityToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption56#MaximumQuantityToInstruct
	 * SecuritiesOption56.MaximumQuantityToInstruct}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumExercisableQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the maximum quantity of financial instrument that may be exercised in the event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MaximumExercisableQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesOption1.MaximumExercisableQuantity, com.tools20022.repository.msg.SecuritiesOption9.MaximumExercisableQuantity,
					com.tools20022.repository.msg.SecuritiesOption15.MaximumExercisableQuantity, com.tools20022.repository.msg.SecuritiesOption16.MaximumExercisableQuantity,
					com.tools20022.repository.msg.SecuritiesOption23.MaximumExercisableQuantity, com.tools20022.repository.msg.SecuritiesOption28.MaximumExercisableQuantity, com.tools20022.repository.msg.Option7.MinimumExercisableQuantity,
					com.tools20022.repository.msg.SecuritiesOption51.MaximumQuantityToInstruct, com.tools20022.repository.msg.SecuritiesOption56.MaximumQuantityToInstruct);
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumExercisableQuantity";
			definition = "Indicates the maximum quantity of financial instrument that may be exercised in the event.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MaximumExercisableQuantitySecuritiesConversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the conversion type of an instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ConversionTypeCode
	 * ConversionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConversionTypeFormat1Choice#Code
	 * ConversionTypeFormat1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConversionTypeFormat1Choice#Proprietary
	 * ConversionTypeFormat1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#ConversionType
	 * CorporateAction3.ConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConversionTypeFormat2Choice#Code
	 * ConversionTypeFormat2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConversionTypeFormat2Choice#Proprietary
	 * ConversionTypeFormat2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#ConversionType
	 * CorporateAction4.ConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#ConversionType
	 * CorporateAction5.ConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#ConversionType
	 * CorporateAction6.ConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#ConversionType
	 * CorporateAction7.ConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#ConversionType
	 * CorporateAction8.ConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#ConversionType
	 * CorporateAction10.ConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#ConversionType
	 * CorporateAction11.ConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConversionType1FormatChoice#Code
	 * ConversionType1FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConversionType1FormatChoice#Proprietary
	 * ConversionType1FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#ConversionType
	 * CorporateAction2.ConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#ConversionType
	 * CorporateAction12.ConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#ConversionType
	 * CorporateAction17.ConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#ConversionType
	 * CorporateAction31.ConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConversionTypeFormat3Choice#Code
	 * ConversionTypeFormat3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConversionTypeFormat3Choice#Proprietary
	 * ConversionTypeFormat3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#ConversionType
	 * CorporateAction40.ConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConversionTypeFormat4Choice#Code
	 * ConversionTypeFormat4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConversionTypeFormat4Choice#Proprietary
	 * ConversionTypeFormat4Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the conversion type of an instrument."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ConversionType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ConversionTypeFormat1Choice.Code, com.tools20022.repository.choice.ConversionTypeFormat1Choice.Proprietary,
					com.tools20022.repository.msg.CorporateAction3.ConversionType, com.tools20022.repository.choice.ConversionTypeFormat2Choice.Code, com.tools20022.repository.choice.ConversionTypeFormat2Choice.Proprietary,
					com.tools20022.repository.msg.CorporateAction4.ConversionType, com.tools20022.repository.msg.CorporateAction5.ConversionType, com.tools20022.repository.msg.CorporateAction6.ConversionType,
					com.tools20022.repository.msg.CorporateAction7.ConversionType, com.tools20022.repository.msg.CorporateAction8.ConversionType, com.tools20022.repository.msg.CorporateAction10.ConversionType,
					com.tools20022.repository.msg.CorporateAction11.ConversionType, com.tools20022.repository.choice.ConversionType1FormatChoice.Code, com.tools20022.repository.choice.ConversionType1FormatChoice.Proprietary,
					com.tools20022.repository.msg.CorporateAction2.ConversionType, com.tools20022.repository.msg.CorporateAction12.ConversionType, com.tools20022.repository.msg.CorporateAction17.ConversionType,
					com.tools20022.repository.msg.CorporateAction31.ConversionType, com.tools20022.repository.choice.ConversionTypeFormat3Choice.Code, com.tools20022.repository.choice.ConversionTypeFormat3Choice.Proprietary,
					com.tools20022.repository.msg.CorporateAction40.ConversionType, com.tools20022.repository.choice.ConversionTypeFormat4Choice.Code, com.tools20022.repository.choice.ConversionTypeFormat4Choice.Proprietary);
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionType";
			definition = "Specifies the conversion type of an instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ConversionTypeCode.mmObject();
		}
	};
	/**
	 * Period during which a convertible security may be converted according to
	 * the terms of the issue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#SecuritiesConversion
	 * DateTimePeriod.SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#ConversionPeriod
	 * Debt1.ConversionPeriod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#ConversionPeriod
	 * Option1.ConversionPeriod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option7#ConversionPeriod
	 * Option7.ConversionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionDateOrPeriod1Choice#NoticePeriod
	 * OptionDateOrPeriod1Choice.NoticePeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which a convertible security may be converted according to the terms of the issue."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ConversionPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.ConversionPeriod, com.tools20022.repository.msg.Option1.ConversionPeriod, com.tools20022.repository.msg.Option7.ConversionPeriod,
					com.tools20022.repository.choice.OptionDateOrPeriod1Choice.NoticePeriod);
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionPeriod";
			definition = "Period during which a convertible security may be converted according to the terms of the issue.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.SecuritiesConversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Number of held securities for the conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RatioDenominatorSecuritiesConversion
	 * SecuritiesQuantity.RatioDenominatorSecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt1#ConversionRatioDenominator
	 * Debt1.ConversionRatioDenominator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionRatioDenominator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of held securities for the conversion."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ConversionRatioDenominator = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.ConversionRatioDenominator);
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionRatioDenominator";
			definition = "Number of held securities for the conversion.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RatioDenominatorSecuritiesConversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Number of target securities for the conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RatioNumeratorSecuritiesConversion
	 * SecuritiesQuantity.RatioNumeratorSecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt1#ConversionRatioNumerator
	 * Debt1.ConversionRatioNumerator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionRatioNumerator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of target securities for the conversion."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ConversionRatioNumerator = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.ConversionRatioNumerator);
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionRatioNumerator";
			definition = "Number of target securities for the conversion.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RatioNumeratorSecuritiesConversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Ratio applied to convert the related security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#SecuritiesConversion
	 * UnderlyingRatio.SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.UnderlyingRatio
	 * UnderlyingRatio}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#Ratio
	 * FutureOrOptionDetails1.Ratio}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ratio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ratio applied to convert the related security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Ratio = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FutureOrOptionDetails1.Ratio);
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Ratio";
			definition = "Ratio applied to convert the related security.";
			minOccurs = 0;
			type_lazy = () -> UnderlyingRatio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.UnderlyingRatio.SecuritiesConversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Currency in which the rate of exchange is expressed in a currency
	 * exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForSecuritiesConversion
	 * CurrencyExchange.CurrencyExchangeForSecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionUnitCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ConversionUnitCurrency = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionUnitCurrency";
			definition = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForSecuritiesConversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Option for which securities conversion information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Option#OptionConversionInformation
	 * Option.OptionConversionInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Option Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Option for which securities conversion information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedOption = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOption";
			definition = "Option for which securities conversion information is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Option.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Option.OptionConversionInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Convention used for adjusting a date when it is not a business day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessDayConventionCode
	 * BusinessDayConventionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessDayConvention"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Convention used for adjusting a date when it is not a business day."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BusinessDayConvention = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BusinessDayConvention";
			definition = "Convention used for adjusting a date when it is not a business day.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BusinessDayConventionCode.mmObject();
		}
	};
	/**
	 * Specifies whether the conversion is mandatory or optional.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.ChoiceCode
	 * ChoiceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionChoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the conversion is mandatory or optional."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ConversionChoice = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionChoice";
			definition = "Specifies whether the conversion is mandatory or optional.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ChoiceCode.mmObject();
		}
	};
	/**
	 * Currency exchange rate between the bond currency and the underlying
	 * equity currency used to calculate the convertion ratio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionFixedExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency exchange rate between the bond currency and the underlying equity currency used to calculate the convertion ratio."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ConversionFixedExchangeRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionFixedExchangeRate";
			definition = "Currency exchange rate between the bond currency and the underlying equity currency used to calculate the convertion ratio.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	/**
	 * Amount of cash needed for the conversion.
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionMarginAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of cash needed for the conversion."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ConversionMarginAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionMarginAmount";
			definition = "Amount of cash needed for the conversion.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies information about the choices offered to the holder of a
	 * conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies information about the choices offered to the holder of a conversion."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ConversionOption = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionOption";
			definition = "Specifies information about the choices offered to the holder of a conversion.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionOptionCode.mmObject();
		}
	};
	/**
	 * Currency into which the base currency is converted, in a currency
	 * exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LoanContract1#SettlementCurrency
	 * LoanContract1.SettlementCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionQuotedCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency into which the base currency is converted, in a currency exchange."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ConversionQuotedCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LoanContract1.SettlementCurrency);
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionQuotedCurrency";
			definition = "Currency into which the base currency is converted, in a currency exchange.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Financial place taken into account to adjust the date and time, as
	 * defined within the business day convention.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialCenter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial place  taken into account to adjust the date and time, as defined within the business day convention."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FinancialCenter = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialCenter";
			definition = "Financial place  taken into account to adjust the date and time, as defined within the business day convention.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FinancialCenterCode.mmObject();
		}
	};
	/**
	 * Minimum number of days that must be given by either the issuer or the
	 * holder before conversion can take place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumNoticeDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum number of days that must be given by either the issuer or the holder before conversion can take place."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MinimumNoticeDays = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumNoticeDays";
			definition = "Minimum number of days that must be given by either the issuer or the holder before conversion can take place.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Specifies the type of notice period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NoticePeriodTypeCode
	 * NoticePeriodTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoticePeriodType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of notice period."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NoticePeriodType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoticePeriodType";
			definition = "Specifies the type of notice period.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> NoticePeriodTypeCode.mmObject();
		}
	};
	/**
	 * Indicates whether the security is protected against dilution with regards
	 * to capital events.
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectionAgainstDilutionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the security is protected against dilution with regards to capital events."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ProtectionAgainstDilutionIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProtectionAgainstDilutionIndicator";
			definition = "Indicates whether the security is protected against dilution with regards to capital events.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the bond is convertible into an equity and back to the
	 * bond.
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseConversionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the bond is convertible into an equity and back to the bond."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReverseConversionIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReverseConversionIndicator";
			definition = "Indicates whether the bond is convertible into an equity and back to the bond.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * ISIN identification of the related financial instrument into which this
	 * security can be converted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#Conversion
	 * Security.Conversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISIN identification of the related financial instrument into which this security can be converted."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecurityIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecurityIdentification";
			definition = "ISIN identification of the related financial instrument into which this security can be converted.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.Conversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies if the issuer or the holder are allowed to convert the security
	 * into another one.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the issuer or the holder are allowed to convert the security into another one."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PartyType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyType";
			definition = "Specifies if the issuer or the holder are allowed to convert the security into another one.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PartyTypeCode.mmObject();
		}
	};
	/**
	 * Ratio or multiplying factor used to convert one contract into a quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#ContractSize
	 * FinancialInstrumentAttributes8.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#ContractSize
	 * FinancialInstrumentAttributes20.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#ContractSize
	 * FinancialInstrumentAttributes35.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#ContractSize
	 * FinancialInstrumentAttributes41.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#ContractSize
	 * FinancialInstrumentAttributes6.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#ContractSize
	 * FinancialInstrumentAttributes9.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#ContractSize
	 * FinancialInstrumentAttributes18.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#ContractSize
	 * FinancialInstrumentAttributes22.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#ContractSize
	 * FinancialInstrumentAttributes32.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#ContractSize
	 * FinancialInstrumentAttributes38.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#ContractSize
	 * FinancialInstrumentAttributes7.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#ContractSize
	 * FinancialInstrumentAttributes5.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#ContractSize
	 * FinancialInstrumentAttributes11.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#ContractSize
	 * FinancialInstrumentAttributes10.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#ContractSize
	 * FinancialInstrumentAttributes19.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#ContractSize
	 * FinancialInstrumentAttributes16.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#ContractSize
	 * FinancialInstrumentAttributes23.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#ContractSize
	 * FinancialInstrumentAttributes24.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#ContractSize
	 * FinancialInstrumentAttributes33.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#ContractSize
	 * FinancialInstrumentAttributes34.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#ContractSize
	 * FinancialInstrumentAttributes39.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#ContractSize
	 * FinancialInstrumentAttributes40.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#ContractSize
	 * FinancialInstrumentAttributes43.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#ContractSize
	 * FinancialInstrumentAttributes45.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#ContractSize
	 * FinancialInstrumentAttributes4.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#ContractSize
	 * FinancialInstrumentAttributes13.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#ContractSize
	 * FinancialInstrumentAttributes21.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#ContractSize
	 * FinancialInstrumentAttributes26.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#ContractSize
	 * FinancialInstrumentAttributes36.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#ContractSize
	 * FinancialInstrumentAttributes42.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#ContractSize
	 * FinancialInstrumentAttributes27.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#ContractSize
	 * FinancialInstrumentAttributes14.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#ContractSize
	 * FinancialInstrumentAttributes30.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#ContractSize
	 * FinancialInstrumentAttributes28.ContractSize}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#ContractSize
	 * Option1.ContractSize}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Future1#ContractSize
	 * Future1.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#ContractSize
	 * FinancialInstrumentAttributes31.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#ContractSize
	 * FinancialInstrumentAttributes44.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#ContractSize
	 * FinancialInstrumentAttributes15.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#ContractSize
	 * FinancialInstrumentAttributes29.ContractSize}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Future2#ContractSize
	 * Future2.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#ContractSize
	 * FinancialInstrumentAttributes2.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#ContractSize
	 * FinancialInstrumentAttributes48.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#ContractSize
	 * FinancialInstrumentAttributes50.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#ContractSize
	 * FinancialInstrumentAttributes49.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#ContractSize
	 * FinancialInstrumentAttributes55.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#ContractSize
	 * FinancialInstrumentAttributes57.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#ContractSize
	 * FinancialInstrumentAttributes56.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#ContractSize
	 * FinancialInstrumentAttributes63.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#ContractSize
	 * FinancialInstrumentAttributes64.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#ContractSize
	 * FinancialInstrumentAttributes66.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#ContractSize
	 * FinancialInstrumentAttributes65.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#ContractSize
	 * FinancialInstrumentAttributes67.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#ContractSize
	 * FinancialInstrumentAttributes70.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#ContractSize
	 * FinancialInstrumentAttributes69.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#ContractSize
	 * FinancialInstrumentAttributes71.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#ContractSize
	 * FinancialInstrumentAttributes75.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#ContractSize
	 * FinancialInstrumentAttributes78.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#ContractSize
	 * FinancialInstrumentAttributes79.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#ContractSize
	 * FinancialInstrumentAttributes81.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#ContractSize
	 * FinancialInstrumentAttributes80.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#ContractSize
	 * FinancialInstrumentAttributes85.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#ContractSize
	 * FinancialInstrumentAttributes84.ContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#ContractSize
	 * FinancialInstrumentAttributes83.ContractSize}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ratio or multiplying factor used to convert one contract into a quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ContractSize = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes8.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes20.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes41.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes6.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes9.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes18.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes22.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes32.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes38.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes7.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes5.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes11.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes10.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes19.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes16.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes23.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes24.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes33.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes34.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes39.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes40.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes43.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes45.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes13.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes26.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes42.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes14.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes28.ContractSize, com.tools20022.repository.msg.Option1.ContractSize,
					com.tools20022.repository.msg.Future1.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes31.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes44.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes15.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes29.ContractSize, com.tools20022.repository.msg.Future2.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes48.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes50.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes49.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes55.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes57.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes56.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes63.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes64.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes66.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes65.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes67.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes70.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes69.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes71.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes75.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes78.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes79.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes81.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes80.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes85.ContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes84.ContractSize,
					com.tools20022.repository.msg.FinancialInstrumentAttributes83.ContractSize);
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContractSize";
			definition = "Ratio or multiplying factor used to convert one contract into a quantity.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesConversion";
				definition = "Conversion exchange of securities, generally convertible bonds or preferred equities, into another form of securities, usually common equities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Conversion, com.tools20022.repository.entity.SecuritiesPricing.RelatedSecuritiesConversion,
						com.tools20022.repository.entity.DateTimePeriod.SecuritiesConversion, com.tools20022.repository.entity.SecuritiesQuantity.MinimumExercisableQuantitySecuritiesConversion,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumExercisableMultipleQuantitySecuritiesConversion, com.tools20022.repository.entity.SecuritiesQuantity.MaximumExercisableQuantitySecuritiesConversion,
						com.tools20022.repository.entity.SecuritiesQuantity.RatioDenominatorSecuritiesConversion, com.tools20022.repository.entity.SecuritiesQuantity.RatioNumeratorSecuritiesConversion,
						com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForSecuritiesConversion, com.tools20022.repository.entity.Option.OptionConversionInformation,
						com.tools20022.repository.entity.UnderlyingRatio.SecuritiesConversion);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesConversion.ConversionPrice, com.tools20022.repository.entity.SecuritiesConversion.ConversionDate,
						com.tools20022.repository.entity.SecuritiesConversion.MinimumExercisableQuantity, com.tools20022.repository.entity.SecuritiesConversion.MinimumExercisableMultipleQuantity,
						com.tools20022.repository.entity.SecuritiesConversion.MaximumExercisableQuantity, com.tools20022.repository.entity.SecuritiesConversion.ConversionType,
						com.tools20022.repository.entity.SecuritiesConversion.ConversionPeriod, com.tools20022.repository.entity.SecuritiesConversion.ConversionRatioDenominator,
						com.tools20022.repository.entity.SecuritiesConversion.ConversionRatioNumerator, com.tools20022.repository.entity.SecuritiesConversion.Ratio,
						com.tools20022.repository.entity.SecuritiesConversion.ConversionUnitCurrency, com.tools20022.repository.entity.SecuritiesConversion.RelatedOption,
						com.tools20022.repository.entity.SecuritiesConversion.BusinessDayConvention, com.tools20022.repository.entity.SecuritiesConversion.ConversionChoice,
						com.tools20022.repository.entity.SecuritiesConversion.ConversionFixedExchangeRate, com.tools20022.repository.entity.SecuritiesConversion.ConversionMarginAmount,
						com.tools20022.repository.entity.SecuritiesConversion.ConversionOption, com.tools20022.repository.entity.SecuritiesConversion.ConversionQuotedCurrency,
						com.tools20022.repository.entity.SecuritiesConversion.FinancialCenter, com.tools20022.repository.entity.SecuritiesConversion.MinimumNoticeDays, com.tools20022.repository.entity.SecuritiesConversion.NoticePeriodType,
						com.tools20022.repository.entity.SecuritiesConversion.ProtectionAgainstDilutionIndicator, com.tools20022.repository.entity.SecuritiesConversion.ReverseConversionIndicator,
						com.tools20022.repository.entity.SecuritiesConversion.SecurityIdentification, com.tools20022.repository.entity.SecuritiesConversion.PartyType, com.tools20022.repository.entity.SecuritiesConversion.ContractSize);
				derivationComponent_lazy = () -> Arrays.asList(ConversionTypeFormat1Choice.mmObject(), ConversionTypeFormat2Choice.mmObject(), ConversionType1FormatChoice.mmObject(), ConversionTypeFormat3Choice.mmObject(),
						ConversionTypeFormat4Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}