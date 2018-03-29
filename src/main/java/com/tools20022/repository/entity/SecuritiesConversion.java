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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
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
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionPrice
 * SecuritiesConversion.mmConversionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionDate
 * SecuritiesConversion.mmConversionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMinimumExercisableQuantity
 * SecuritiesConversion.mmMinimumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMinimumExercisableMultipleQuantity
 * SecuritiesConversion.mmMinimumExercisableMultipleQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMaximumExercisableQuantity
 * SecuritiesConversion.mmMaximumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionType
 * SecuritiesConversion.mmConversionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionPeriod
 * SecuritiesConversion.mmConversionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionRatioDenominator
 * SecuritiesConversion.mmConversionRatioDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionRatioNumerator
 * SecuritiesConversion.mmConversionRatioNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmRatio
 * SecuritiesConversion.mmRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionUnitCurrency
 * SecuritiesConversion.mmConversionUnitCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmRelatedOption
 * SecuritiesConversion.mmRelatedOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmBusinessDayConvention
 * SecuritiesConversion.mmBusinessDayConvention}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionChoice
 * SecuritiesConversion.mmConversionChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionFixedExchangeRate
 * SecuritiesConversion.mmConversionFixedExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionMarginAmount
 * SecuritiesConversion.mmConversionMarginAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionOption
 * SecuritiesConversion.mmConversionOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionQuotedCurrency
 * SecuritiesConversion.mmConversionQuotedCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmFinancialCenter
 * SecuritiesConversion.mmFinancialCenter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMinimumNoticeDays
 * SecuritiesConversion.mmMinimumNoticeDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmNoticePeriodType
 * SecuritiesConversion.mmNoticePeriodType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmProtectionAgainstDilutionIndicator
 * SecuritiesConversion.mmProtectionAgainstDilutionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmReverseConversionIndicator
 * SecuritiesConversion.mmReverseConversionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmSecurityIdentification
 * SecuritiesConversion.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmPartyType
 * SecuritiesConversion.mmPartyType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmContractSize
 * SecuritiesConversion.mmContractSize}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmConversion
 * Security.mmConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedSecuritiesConversion
 * SecuritiesPricing.mmRelatedSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmSecuritiesConversion
 * DateTimePeriod.mmSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumExercisableQuantitySecuritiesConversion
 * SecuritiesQuantity.mmMinimumExercisableQuantitySecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumExercisableMultipleQuantitySecuritiesConversion
 * SecuritiesQuantity.mmMinimumExercisableMultipleQuantitySecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumExercisableQuantitySecuritiesConversion
 * SecuritiesQuantity.mmMaximumExercisableQuantitySecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRatioDenominatorSecuritiesConversion
 * SecuritiesQuantity.mmRatioDenominatorSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRatioNumeratorSecuritiesConversion
 * SecuritiesQuantity.mmRatioNumeratorSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForSecuritiesConversion
 * CurrencyExchange.mmCurrencyExchangeForSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Option#mmOptionConversionInformation
 * Option.mmOptionConversionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#mmSecuritiesConversion
 * UnderlyingRatio.mmSecuritiesConversion}</li>
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
	protected SecuritiesPricing conversionPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedSecuritiesConversion
	 * SecuritiesPricing.mmRelatedSecuritiesConversion}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmConversionPrice
	 * FinancialInstrumentAttributes8.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmConversionPrice
	 * FinancialInstrumentAttributes20.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmConversionPrice
	 * FinancialInstrumentAttributes35.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmConversionPrice
	 * FinancialInstrumentAttributes41.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmConversionPrice
	 * FinancialInstrumentAttributes4.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmConversionPrice
	 * FinancialInstrumentAttributes13.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmConversionPrice
	 * FinancialInstrumentAttributes21.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmConversionPrice
	 * FinancialInstrumentAttributes26.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmConversionPrice
	 * FinancialInstrumentAttributes36.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmConversionPrice
	 * FinancialInstrumentAttributes42.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmConversionPrice
	 * FinancialInstrumentAttributes27.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmConversionPrice
	 * FinancialInstrumentAttributes14.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmConversionPrice
	 * FinancialInstrumentAttributes30.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmConversionPrice
	 * FinancialInstrumentAttributes28.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmConversionPrice
	 * FinancialInstrumentAttributes31.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmConversionPrice
	 * FinancialInstrumentAttributes44.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmConversionPrice
	 * FinancialInstrumentAttributes15.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmConversionPrice
	 * FinancialInstrumentAttributes29.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmConversionPrice
	 * FinancialInstrumentAttributes2.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmConversionPrice
	 * FinancialInstrumentAttributes63.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmConversionPrice
	 * FinancialInstrumentAttributes64.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmConversionPrice
	 * FinancialInstrumentAttributes75.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmConversionPrice
	 * FinancialInstrumentAttributes78.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmConversionPrice
	 * FinancialInstrumentAttributes91.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmConversionPrice
	 * FinancialInstrumentAttributes92.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes95#mmConversionPrice
	 * FinancialInstrumentAttributes95.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmConversionPrice
	 * FinancialInstrumentAttributes97.mmConversionPrice}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesConversion, SecuritiesPricing> mmConversionPrice = new MMBusinessAssociationEnd<SecuritiesConversion, SecuritiesPricing>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes8.mmConversionPrice, FinancialInstrumentAttributes20.mmConversionPrice, FinancialInstrumentAttributes35.mmConversionPrice,
					FinancialInstrumentAttributes41.mmConversionPrice, FinancialInstrumentAttributes4.mmConversionPrice, FinancialInstrumentAttributes13.mmConversionPrice, FinancialInstrumentAttributes21.mmConversionPrice,
					FinancialInstrumentAttributes26.mmConversionPrice, FinancialInstrumentAttributes36.mmConversionPrice, FinancialInstrumentAttributes42.mmConversionPrice, FinancialInstrumentAttributes27.mmConversionPrice,
					FinancialInstrumentAttributes14.mmConversionPrice, FinancialInstrumentAttributes30.mmConversionPrice, FinancialInstrumentAttributes28.mmConversionPrice, FinancialInstrumentAttributes31.mmConversionPrice,
					FinancialInstrumentAttributes44.mmConversionPrice, FinancialInstrumentAttributes15.mmConversionPrice, FinancialInstrumentAttributes29.mmConversionPrice, FinancialInstrumentAttributes2.mmConversionPrice,
					FinancialInstrumentAttributes63.mmConversionPrice, FinancialInstrumentAttributes64.mmConversionPrice, FinancialInstrumentAttributes75.mmConversionPrice, FinancialInstrumentAttributes78.mmConversionPrice,
					FinancialInstrumentAttributes91.mmConversionPrice, FinancialInstrumentAttributes92.mmConversionPrice, FinancialInstrumentAttributes95.mmConversionPrice, FinancialInstrumentAttributes97.mmConversionPrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConversionPrice";
			definition = "Price of one target security in the conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesPricing.mmRelatedSecuritiesConversion;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public SecuritiesPricing getValue(SecuritiesConversion obj) {
			return obj.getConversionPrice();
		}

		@Override
		public void setValue(SecuritiesConversion obj, SecuritiesPricing value) {
			obj.setConversionPrice(value);
		}
	};
	protected ISODateTime conversionDate;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#mmConversionDate
	 * FinancialInstrumentAttributes6.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#mmConversionDate
	 * FinancialInstrumentAttributes9.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#mmConversionDate
	 * FinancialInstrumentAttributes18.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#mmConversionDate
	 * FinancialInstrumentAttributes22.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#mmConversionDate
	 * FinancialInstrumentAttributes32.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#mmConversionDate
	 * FinancialInstrumentAttributes38.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#mmConversionDate
	 * FinancialInstrumentAttributes7.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#mmConversionDate
	 * FinancialInstrumentAttributes5.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#mmConversionDate
	 * FinancialInstrumentAttributes11.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#mmConversionDate
	 * FinancialInstrumentAttributes10.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#mmConversionDate
	 * FinancialInstrumentAttributes19.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#mmConversionDate
	 * FinancialInstrumentAttributes16.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#mmConversionDate
	 * FinancialInstrumentAttributes23.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#mmConversionDate
	 * FinancialInstrumentAttributes24.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#mmConversionDate
	 * FinancialInstrumentAttributes33.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#mmConversionDate
	 * FinancialInstrumentAttributes34.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#mmConversionDate
	 * FinancialInstrumentAttributes39.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#mmConversionDate
	 * FinancialInstrumentAttributes40.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#mmConversionDate
	 * FinancialInstrumentAttributes43.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#mmConversionDate
	 * FinancialInstrumentAttributes45.mmConversionDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmConversionDate
	 * Option1.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmConversionDate
	 * FinancialInstrumentAttributes31.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmConversionDate
	 * FinancialInstrumentAttributes44.mmConversionDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option7#mmConversionDate
	 * Option7.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmConversionDate
	 * FinancialInstrumentAttributes2.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmConversionDate
	 * FinancialInstrumentAttributes48.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#mmConversionDate
	 * FinancialInstrumentAttributes50.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmConversionDate
	 * FinancialInstrumentAttributes49.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#mmConversionDate
	 * FinancialInstrumentAttributes55.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#mmConversionDate
	 * FinancialInstrumentAttributes57.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#mmConversionDate
	 * FinancialInstrumentAttributes56.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmConversionDate
	 * FinancialInstrumentAttributes66.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#mmConversionDate
	 * FinancialInstrumentAttributes65.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmConversionDate
	 * FinancialInstrumentAttributes67.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#mmConversionDate
	 * FinancialInstrumentAttributes70.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#mmConversionDate
	 * FinancialInstrumentAttributes69.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#mmConversionDate
	 * FinancialInstrumentAttributes71.mmConversionDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option13#mmConversionDate
	 * Option13.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmConversionDate
	 * FinancialInstrumentAttributes79.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmConversionDate
	 * FinancialInstrumentAttributes81.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmConversionDate
	 * FinancialInstrumentAttributes80.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#mmConversionDate
	 * FinancialInstrumentAttributes85.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#mmConversionDate
	 * FinancialInstrumentAttributes84.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#mmConversionDate
	 * FinancialInstrumentAttributes83.mmConversionDate}</li>
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
	public static final MMBusinessAttribute<SecuritiesConversion, ISODateTime> mmConversionDate = new MMBusinessAttribute<SecuritiesConversion, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes6.mmConversionDate, FinancialInstrumentAttributes9.mmConversionDate, FinancialInstrumentAttributes18.mmConversionDate,
					FinancialInstrumentAttributes22.mmConversionDate, FinancialInstrumentAttributes32.mmConversionDate, FinancialInstrumentAttributes38.mmConversionDate, FinancialInstrumentAttributes7.mmConversionDate,
					FinancialInstrumentAttributes5.mmConversionDate, FinancialInstrumentAttributes11.mmConversionDate, FinancialInstrumentAttributes10.mmConversionDate, FinancialInstrumentAttributes19.mmConversionDate,
					FinancialInstrumentAttributes16.mmConversionDate, FinancialInstrumentAttributes23.mmConversionDate, FinancialInstrumentAttributes24.mmConversionDate, FinancialInstrumentAttributes33.mmConversionDate,
					FinancialInstrumentAttributes34.mmConversionDate, FinancialInstrumentAttributes39.mmConversionDate, FinancialInstrumentAttributes40.mmConversionDate, FinancialInstrumentAttributes43.mmConversionDate,
					FinancialInstrumentAttributes45.mmConversionDate, Option1.mmConversionDate, FinancialInstrumentAttributes31.mmConversionDate, FinancialInstrumentAttributes44.mmConversionDate, Option7.mmConversionDate,
					FinancialInstrumentAttributes2.mmConversionDate, FinancialInstrumentAttributes48.mmConversionDate, FinancialInstrumentAttributes50.mmConversionDate, FinancialInstrumentAttributes49.mmConversionDate,
					FinancialInstrumentAttributes55.mmConversionDate, FinancialInstrumentAttributes57.mmConversionDate, FinancialInstrumentAttributes56.mmConversionDate, FinancialInstrumentAttributes66.mmConversionDate,
					FinancialInstrumentAttributes65.mmConversionDate, FinancialInstrumentAttributes67.mmConversionDate, FinancialInstrumentAttributes70.mmConversionDate, FinancialInstrumentAttributes69.mmConversionDate,
					FinancialInstrumentAttributes71.mmConversionDate, Option13.mmConversionDate, FinancialInstrumentAttributes79.mmConversionDate, FinancialInstrumentAttributes81.mmConversionDate,
					FinancialInstrumentAttributes80.mmConversionDate, FinancialInstrumentAttributes85.mmConversionDate, FinancialInstrumentAttributes84.mmConversionDate, FinancialInstrumentAttributes83.mmConversionDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConversionDate";
			definition = "Deadline by which a convertible security must be converted according to the terms of the issue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(SecuritiesConversion obj) {
			return obj.getConversionDate();
		}

		@Override
		public void setValue(SecuritiesConversion obj, ISODateTime value) {
			obj.setConversionDate(value);
		}
	};
	protected SecuritiesQuantity minimumExercisableQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumExercisableQuantitySecuritiesConversion
	 * SecuritiesQuantity.mmMinimumExercisableQuantitySecuritiesConversion}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes6.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes9.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes18.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes22.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes32.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes38.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes7.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption1#mmMinimumExercisableQuantity
	 * SecuritiesOption1.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes5.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes11.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption9#mmMinimumExercisableQuantity
	 * SecuritiesOption9.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes10.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes19.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption15#mmMinimumExercisableQuantity
	 * SecuritiesOption15.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes16.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes23.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption16#mmMinimumExercisableQuantity
	 * SecuritiesOption16.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes24.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes33.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23#mmMinimumExercisableQuantity
	 * SecuritiesOption23.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes34.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes39.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28#mmMinimumExercisableQuantity
	 * SecuritiesOption28.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes40.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes43.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes45.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity1#mmMinimumExercisableQuantity
	 * CorporateActionQuantity1.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity2#mmMinimumExercisableQuantity
	 * CorporateActionQuantity2.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity3#mmMinimumExercisableQuantity
	 * CorporateActionQuantity3.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4#mmMinimumExercisableQuantity
	 * CorporateActionQuantity4.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity5#mmMinimumExercisableQuantity
	 * CorporateActionQuantity5.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6#mmMinimumExercisableQuantity
	 * CorporateActionQuantity6.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option1#mmMinimumExercisableQuantity
	 * Option1.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes31.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes44.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmMinimumExercisableSecuritiesQuantity
	 * CorporateAction2.mmMinimumExercisableSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmMinimumExercisableSecuritiesQuantity
	 * SecurityOption1.mmMinimumExercisableSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes2.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes48.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes50.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes49.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes55.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes57.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes56.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51#mmMinimumQuantityToInstruct
	 * SecuritiesOption51.mmMinimumQuantityToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmMinimumQuantityToInstruct
	 * FinancialInstrumentAttributes67.mmMinimumQuantityToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption56#mmMinimumQuantityToInstruct
	 * SecuritiesOption56.mmMinimumQuantityToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#mmMinimumQuantityToInstruct
	 * FinancialInstrumentAttributes71.mmMinimumQuantityToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmMinimumQuantityToInstruct
	 * FinancialInstrumentAttributes80.mmMinimumQuantityToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#mmMinimumQuantityToInstruct
	 * FinancialInstrumentAttributes83.mmMinimumQuantityToInstruct}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesConversion, SecuritiesQuantity> mmMinimumExercisableQuantity = new MMBusinessAssociationEnd<SecuritiesConversion, SecuritiesQuantity>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes6.mmMinimumExercisableQuantity, FinancialInstrumentAttributes9.mmMinimumExercisableQuantity, FinancialInstrumentAttributes18.mmMinimumExercisableQuantity,
					FinancialInstrumentAttributes22.mmMinimumExercisableQuantity, FinancialInstrumentAttributes32.mmMinimumExercisableQuantity, FinancialInstrumentAttributes38.mmMinimumExercisableQuantity,
					FinancialInstrumentAttributes7.mmMinimumExercisableQuantity, SecuritiesOption1.mmMinimumExercisableQuantity, FinancialInstrumentAttributes5.mmMinimumExercisableQuantity,
					FinancialInstrumentAttributes11.mmMinimumExercisableQuantity, SecuritiesOption9.mmMinimumExercisableQuantity, FinancialInstrumentAttributes10.mmMinimumExercisableQuantity,
					FinancialInstrumentAttributes19.mmMinimumExercisableQuantity, SecuritiesOption15.mmMinimumExercisableQuantity, FinancialInstrumentAttributes16.mmMinimumExercisableQuantity,
					FinancialInstrumentAttributes23.mmMinimumExercisableQuantity, SecuritiesOption16.mmMinimumExercisableQuantity, FinancialInstrumentAttributes24.mmMinimumExercisableQuantity,
					FinancialInstrumentAttributes33.mmMinimumExercisableQuantity, SecuritiesOption23.mmMinimumExercisableQuantity, FinancialInstrumentAttributes34.mmMinimumExercisableQuantity,
					FinancialInstrumentAttributes39.mmMinimumExercisableQuantity, SecuritiesOption28.mmMinimumExercisableQuantity, FinancialInstrumentAttributes40.mmMinimumExercisableQuantity,
					FinancialInstrumentAttributes43.mmMinimumExercisableQuantity, FinancialInstrumentAttributes45.mmMinimumExercisableQuantity, CorporateActionQuantity1.mmMinimumExercisableQuantity,
					CorporateActionQuantity2.mmMinimumExercisableQuantity, CorporateActionQuantity3.mmMinimumExercisableQuantity, CorporateActionQuantity4.mmMinimumExercisableQuantity, CorporateActionQuantity5.mmMinimumExercisableQuantity,
					CorporateActionQuantity6.mmMinimumExercisableQuantity, Option1.mmMinimumExercisableQuantity, FinancialInstrumentAttributes31.mmMinimumExercisableQuantity, FinancialInstrumentAttributes44.mmMinimumExercisableQuantity,
					CorporateAction2.mmMinimumExercisableSecuritiesQuantity, SecurityOption1.mmMinimumExercisableSecuritiesQuantity, FinancialInstrumentAttributes2.mmMinimumExercisableQuantity,
					FinancialInstrumentAttributes48.mmMinimumExercisableQuantity, FinancialInstrumentAttributes50.mmMinimumExercisableQuantity, FinancialInstrumentAttributes49.mmMinimumExercisableQuantity,
					FinancialInstrumentAttributes55.mmMinimumExercisableQuantity, FinancialInstrumentAttributes57.mmMinimumExercisableQuantity, FinancialInstrumentAttributes56.mmMinimumExercisableQuantity,
					SecuritiesOption51.mmMinimumQuantityToInstruct, FinancialInstrumentAttributes67.mmMinimumQuantityToInstruct, SecuritiesOption56.mmMinimumQuantityToInstruct, FinancialInstrumentAttributes71.mmMinimumQuantityToInstruct,
					FinancialInstrumentAttributes80.mmMinimumQuantityToInstruct, FinancialInstrumentAttributes83.mmMinimumQuantityToInstruct);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableQuantity";
			definition = "Minimum quantity of financial instrument or lot of rights/warrants that must be exercised.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmMinimumExercisableQuantitySecuritiesConversion;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(SecuritiesConversion obj) {
			return obj.getMinimumExercisableQuantity();
		}

		@Override
		public void setValue(SecuritiesConversion obj, SecuritiesQuantity value) {
			obj.setMinimumExercisableQuantity(value);
		}
	};
	protected SecuritiesQuantity minimumExercisableMultipleQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumExercisableMultipleQuantitySecuritiesConversion
	 * SecuritiesQuantity.
	 * mmMinimumExercisableMultipleQuantitySecuritiesConversion}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes6.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes9.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes18.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes22.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes32.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes38.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes7.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption1#mmMinimumExercisableMultipleQuantity
	 * SecuritiesOption1.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes5.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes11.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption9#mmMinimumExercisableMultipleQuantity
	 * SecuritiesOption9.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes10.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes19.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption15#mmMinimumExercisableMultipleQuantity
	 * SecuritiesOption15.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes16.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes23.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption16#mmMinimumExercisableMultipleQuantity
	 * SecuritiesOption16.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes24.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes33.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23#mmMinimumExercisableMultipleQuantity
	 * SecuritiesOption23.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes34.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes39.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28#mmMinimumExercisableMultipleQuantity
	 * SecuritiesOption28.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes40.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes43.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes45.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity1#mmMinimumExercisableMultipleQuantity
	 * CorporateActionQuantity1.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity2#mmMinimumExercisableMultipleQuantity
	 * CorporateActionQuantity2.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity3#mmMinimumExercisableMultipleQuantity
	 * CorporateActionQuantity3.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4#mmMinimumExercisableMultipleQuantity
	 * CorporateActionQuantity4.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity5#mmMinimumExercisableMultipleQuantity
	 * CorporateActionQuantity5.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6#mmMinimumExercisableMultipleQuantity
	 * CorporateActionQuantity6.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option1#mmMinimumExercisableMultipleQuantity
	 * Option1.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes31.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes44.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmMinimumExercisableMultipleSecuritiesQuantity
	 * CorporateAction2.mmMinimumExercisableMultipleSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmMinimumExercisableMultipleSecuritiesQuantity
	 * SecurityOption1.mmMinimumExercisableMultipleSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes2.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes48.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes50.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes49.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes55.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes57.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes56.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51#mmMinimumMultipleQuantityToInstruct
	 * SecuritiesOption51.mmMinimumMultipleQuantityToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmMinimumMultipleQuantityToInstruct
	 * FinancialInstrumentAttributes67.mmMinimumMultipleQuantityToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption56#mmMinimumMultipleQuantityToInstruct
	 * SecuritiesOption56.mmMinimumMultipleQuantityToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#mmMinimumMultipleQuantityToInstruct
	 * FinancialInstrumentAttributes71.mmMinimumMultipleQuantityToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmMinimumMultipleQuantityToInstruct
	 * FinancialInstrumentAttributes80.mmMinimumMultipleQuantityToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#mmMinimumMultipleQuantityToInstruct
	 * FinancialInstrumentAttributes83.mmMinimumMultipleQuantityToInstruct}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesConversion, SecuritiesQuantity> mmMinimumExercisableMultipleQuantity = new MMBusinessAssociationEnd<SecuritiesConversion, SecuritiesQuantity>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes6.mmMinimumExercisableMultipleQuantity, FinancialInstrumentAttributes9.mmMinimumExercisableMultipleQuantity,
					FinancialInstrumentAttributes18.mmMinimumExercisableMultipleQuantity, FinancialInstrumentAttributes22.mmMinimumExercisableMultipleQuantity, FinancialInstrumentAttributes32.mmMinimumExercisableMultipleQuantity,
					FinancialInstrumentAttributes38.mmMinimumExercisableMultipleQuantity, FinancialInstrumentAttributes7.mmMinimumExercisableMultipleQuantity, SecuritiesOption1.mmMinimumExercisableMultipleQuantity,
					FinancialInstrumentAttributes5.mmMinimumExercisableMultipleQuantity, FinancialInstrumentAttributes11.mmMinimumExercisableMultipleQuantity, SecuritiesOption9.mmMinimumExercisableMultipleQuantity,
					FinancialInstrumentAttributes10.mmMinimumExercisableMultipleQuantity, FinancialInstrumentAttributes19.mmMinimumExercisableMultipleQuantity, SecuritiesOption15.mmMinimumExercisableMultipleQuantity,
					FinancialInstrumentAttributes16.mmMinimumExercisableMultipleQuantity, FinancialInstrumentAttributes23.mmMinimumExercisableMultipleQuantity, SecuritiesOption16.mmMinimumExercisableMultipleQuantity,
					FinancialInstrumentAttributes24.mmMinimumExercisableMultipleQuantity, FinancialInstrumentAttributes33.mmMinimumExercisableMultipleQuantity, SecuritiesOption23.mmMinimumExercisableMultipleQuantity,
					FinancialInstrumentAttributes34.mmMinimumExercisableMultipleQuantity, FinancialInstrumentAttributes39.mmMinimumExercisableMultipleQuantity, SecuritiesOption28.mmMinimumExercisableMultipleQuantity,
					FinancialInstrumentAttributes40.mmMinimumExercisableMultipleQuantity, FinancialInstrumentAttributes43.mmMinimumExercisableMultipleQuantity, FinancialInstrumentAttributes45.mmMinimumExercisableMultipleQuantity,
					CorporateActionQuantity1.mmMinimumExercisableMultipleQuantity, CorporateActionQuantity2.mmMinimumExercisableMultipleQuantity, CorporateActionQuantity3.mmMinimumExercisableMultipleQuantity,
					CorporateActionQuantity4.mmMinimumExercisableMultipleQuantity, CorporateActionQuantity5.mmMinimumExercisableMultipleQuantity, CorporateActionQuantity6.mmMinimumExercisableMultipleQuantity,
					Option1.mmMinimumExercisableMultipleQuantity, FinancialInstrumentAttributes31.mmMinimumExercisableMultipleQuantity, FinancialInstrumentAttributes44.mmMinimumExercisableMultipleQuantity,
					CorporateAction2.mmMinimumExercisableMultipleSecuritiesQuantity, SecurityOption1.mmMinimumExercisableMultipleSecuritiesQuantity, FinancialInstrumentAttributes2.mmMinimumExercisableMultipleQuantity,
					FinancialInstrumentAttributes48.mmMinimumExercisableMultipleQuantity, FinancialInstrumentAttributes50.mmMinimumExercisableMultipleQuantity, FinancialInstrumentAttributes49.mmMinimumExercisableMultipleQuantity,
					FinancialInstrumentAttributes55.mmMinimumExercisableMultipleQuantity, FinancialInstrumentAttributes57.mmMinimumExercisableMultipleQuantity, FinancialInstrumentAttributes56.mmMinimumExercisableMultipleQuantity,
					SecuritiesOption51.mmMinimumMultipleQuantityToInstruct, FinancialInstrumentAttributes67.mmMinimumMultipleQuantityToInstruct, SecuritiesOption56.mmMinimumMultipleQuantityToInstruct,
					FinancialInstrumentAttributes71.mmMinimumMultipleQuantityToInstruct, FinancialInstrumentAttributes80.mmMinimumMultipleQuantityToInstruct, FinancialInstrumentAttributes83.mmMinimumMultipleQuantityToInstruct);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableMultipleQuantity";
			definition = "Minimum multiple quantity of financial instrument or lot of rights/warrants that must be exercised.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmMinimumExercisableMultipleQuantitySecuritiesConversion;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(SecuritiesConversion obj) {
			return obj.getMinimumExercisableMultipleQuantity();
		}

		@Override
		public void setValue(SecuritiesConversion obj, SecuritiesQuantity value) {
			obj.setMinimumExercisableMultipleQuantity(value);
		}
	};
	protected SecuritiesQuantity maximumExercisableQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumExercisableQuantitySecuritiesConversion
	 * SecuritiesQuantity.mmMaximumExercisableQuantitySecuritiesConversion}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption1#mmMaximumExercisableQuantity
	 * SecuritiesOption1.mmMaximumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption9#mmMaximumExercisableQuantity
	 * SecuritiesOption9.mmMaximumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption15#mmMaximumExercisableQuantity
	 * SecuritiesOption15.mmMaximumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption16#mmMaximumExercisableQuantity
	 * SecuritiesOption16.mmMaximumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23#mmMaximumExercisableQuantity
	 * SecuritiesOption23.mmMaximumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28#mmMaximumExercisableQuantity
	 * SecuritiesOption28.mmMaximumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option7#mmMinimumExercisableQuantity
	 * Option7.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51#mmMaximumQuantityToInstruct
	 * SecuritiesOption51.mmMaximumQuantityToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption56#mmMaximumQuantityToInstruct
	 * SecuritiesOption56.mmMaximumQuantityToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option13#mmMinimumExercisableQuantity
	 * Option13.mmMinimumExercisableQuantity}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesConversion, SecuritiesQuantity> mmMaximumExercisableQuantity = new MMBusinessAssociationEnd<SecuritiesConversion, SecuritiesQuantity>() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesOption1.mmMaximumExercisableQuantity, SecuritiesOption9.mmMaximumExercisableQuantity, SecuritiesOption15.mmMaximumExercisableQuantity,
					SecuritiesOption16.mmMaximumExercisableQuantity, SecuritiesOption23.mmMaximumExercisableQuantity, SecuritiesOption28.mmMaximumExercisableQuantity, Option7.mmMinimumExercisableQuantity,
					SecuritiesOption51.mmMaximumQuantityToInstruct, SecuritiesOption56.mmMaximumQuantityToInstruct, Option13.mmMinimumExercisableQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumExercisableQuantity";
			definition = "Indicates the maximum quantity of financial instrument that may be exercised in the event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmMaximumExercisableQuantitySecuritiesConversion;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(SecuritiesConversion obj) {
			return obj.getMaximumExercisableQuantity();
		}

		@Override
		public void setValue(SecuritiesConversion obj, SecuritiesQuantity value) {
			obj.setMaximumExercisableQuantity(value);
		}
	};
	protected ConversionTypeCode conversionType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.ConversionTypeFormat1Choice#mmCode
	 * ConversionTypeFormat1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConversionTypeFormat1Choice#mmProprietary
	 * ConversionTypeFormat1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#mmConversionType
	 * CorporateAction3.mmConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConversionTypeFormat2Choice#mmCode
	 * ConversionTypeFormat2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConversionTypeFormat2Choice#mmProprietary
	 * ConversionTypeFormat2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#mmConversionType
	 * CorporateAction4.mmConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmConversionType
	 * CorporateAction5.mmConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#mmConversionType
	 * CorporateAction6.mmConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#mmConversionType
	 * CorporateAction7.mmConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#mmConversionType
	 * CorporateAction8.mmConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmConversionType
	 * CorporateAction10.mmConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#mmConversionType
	 * CorporateAction11.mmConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConversionType1FormatChoice#mmCode
	 * ConversionType1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConversionType1FormatChoice#mmProprietary
	 * ConversionType1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmConversionType
	 * CorporateAction2.mmConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmConversionType
	 * CorporateAction12.mmConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#mmConversionType
	 * CorporateAction17.mmConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmConversionType
	 * CorporateAction31.mmConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConversionTypeFormat3Choice#mmCode
	 * ConversionTypeFormat3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConversionTypeFormat3Choice#mmProprietary
	 * ConversionTypeFormat3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#mmConversionType
	 * CorporateAction40.mmConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConversionTypeFormat4Choice#mmCode
	 * ConversionTypeFormat4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConversionTypeFormat4Choice#mmProprietary
	 * ConversionTypeFormat4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmConversionType
	 * CorporateAction41.mmConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmConversionType
	 * CorporateAction51.mmConversionType}</li>
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
	public static final MMBusinessAttribute<SecuritiesConversion, ConversionTypeCode> mmConversionType = new MMBusinessAttribute<SecuritiesConversion, ConversionTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ConversionTypeFormat1Choice.mmCode, ConversionTypeFormat1Choice.mmProprietary, CorporateAction3.mmConversionType, ConversionTypeFormat2Choice.mmCode,
					ConversionTypeFormat2Choice.mmProprietary, CorporateAction4.mmConversionType, CorporateAction5.mmConversionType, CorporateAction6.mmConversionType, CorporateAction7.mmConversionType, CorporateAction8.mmConversionType,
					CorporateAction10.mmConversionType, CorporateAction11.mmConversionType, ConversionType1FormatChoice.mmCode, ConversionType1FormatChoice.mmProprietary, CorporateAction2.mmConversionType,
					CorporateAction12.mmConversionType, CorporateAction17.mmConversionType, CorporateAction31.mmConversionType, ConversionTypeFormat3Choice.mmCode, ConversionTypeFormat3Choice.mmProprietary,
					CorporateAction40.mmConversionType, ConversionTypeFormat4Choice.mmCode, ConversionTypeFormat4Choice.mmProprietary, CorporateAction41.mmConversionType, CorporateAction51.mmConversionType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConversionType";
			definition = "Specifies the conversion type of an instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ConversionTypeCode.mmObject();
		}

		@Override
		public ConversionTypeCode getValue(SecuritiesConversion obj) {
			return obj.getConversionType();
		}

		@Override
		public void setValue(SecuritiesConversion obj, ConversionTypeCode value) {
			obj.setConversionType(value);
		}
	};
	protected DateTimePeriod conversionPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmSecuritiesConversion
	 * DateTimePeriod.mmSecuritiesConversion}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmConversionPeriod
	 * Debt1.mmConversionPeriod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmConversionPeriod
	 * Option1.mmConversionPeriod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option7#mmConversionPeriod
	 * Option7.mmConversionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionDateOrPeriod1Choice#mmNoticePeriod
	 * OptionDateOrPeriod1Choice.mmNoticePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option13#mmConversionPeriod
	 * Option13.mmConversionPeriod}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesConversion, DateTimePeriod> mmConversionPeriod = new MMBusinessAssociationEnd<SecuritiesConversion, DateTimePeriod>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmConversionPeriod, Option1.mmConversionPeriod, Option7.mmConversionPeriod, OptionDateOrPeriod1Choice.mmNoticePeriod, Option13.mmConversionPeriod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConversionPeriod";
			definition = "Period during which a convertible security may be converted according to the terms of the issue.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmSecuritiesConversion;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(SecuritiesConversion obj) {
			return obj.getConversionPeriod();
		}

		@Override
		public void setValue(SecuritiesConversion obj, DateTimePeriod value) {
			obj.setConversionPeriod(value);
		}
	};
	protected SecuritiesQuantity conversionRatioDenominator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRatioDenominatorSecuritiesConversion
	 * SecuritiesQuantity.mmRatioDenominatorSecuritiesConversion}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Debt1#mmConversionRatioDenominator
	 * Debt1.mmConversionRatioDenominator}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesConversion, SecuritiesQuantity> mmConversionRatioDenominator = new MMBusinessAssociationEnd<SecuritiesConversion, SecuritiesQuantity>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmConversionRatioDenominator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConversionRatioDenominator";
			definition = "Number of held securities for the conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmRatioDenominatorSecuritiesConversion;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(SecuritiesConversion obj) {
			return obj.getConversionRatioDenominator();
		}

		@Override
		public void setValue(SecuritiesConversion obj, SecuritiesQuantity value) {
			obj.setConversionRatioDenominator(value);
		}
	};
	protected SecuritiesQuantity conversionRatioNumerator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRatioNumeratorSecuritiesConversion
	 * SecuritiesQuantity.mmRatioNumeratorSecuritiesConversion}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Debt1#mmConversionRatioNumerator
	 * Debt1.mmConversionRatioNumerator}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesConversion, SecuritiesQuantity> mmConversionRatioNumerator = new MMBusinessAssociationEnd<SecuritiesConversion, SecuritiesQuantity>() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmConversionRatioNumerator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConversionRatioNumerator";
			definition = "Number of target securities for the conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmRatioNumeratorSecuritiesConversion;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(SecuritiesConversion obj) {
			return obj.getConversionRatioNumerator();
		}

		@Override
		public void setValue(SecuritiesConversion obj, SecuritiesQuantity value) {
			obj.setConversionRatioNumerator(value);
		}
	};
	protected List<UnderlyingRatio> ratio;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#mmSecuritiesConversion
	 * UnderlyingRatio.mmSecuritiesConversion}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmRatio
	 * FutureOrOptionDetails1.mmRatio}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesConversion, List<UnderlyingRatio>> mmRatio = new MMBusinessAssociationEnd<SecuritiesConversion, List<UnderlyingRatio>>() {
		{
			derivation_lazy = () -> Arrays.asList(FutureOrOptionDetails1.mmRatio);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Ratio";
			definition = "Ratio applied to convert the related security.";
			minOccurs = 0;
			opposite_lazy = () -> UnderlyingRatio.mmSecuritiesConversion;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> UnderlyingRatio.mmObject();
		}

		@Override
		public List<UnderlyingRatio> getValue(SecuritiesConversion obj) {
			return obj.getRatio();
		}

		@Override
		public void setValue(SecuritiesConversion obj, List<UnderlyingRatio> value) {
			obj.setRatio(value);
		}
	};
	protected CurrencyExchange conversionUnitCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForSecuritiesConversion
	 * CurrencyExchange.mmCurrencyExchangeForSecuritiesConversion}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesConversion, CurrencyExchange> mmConversionUnitCurrency = new MMBusinessAssociationEnd<SecuritiesConversion, CurrencyExchange>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConversionUnitCurrency";
			definition = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CurrencyExchange.mmCurrencyExchangeForSecuritiesConversion;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CurrencyExchange.mmObject();
		}

		@Override
		public CurrencyExchange getValue(SecuritiesConversion obj) {
			return obj.getConversionUnitCurrency();
		}

		@Override
		public void setValue(SecuritiesConversion obj, CurrencyExchange value) {
			obj.setConversionUnitCurrency(value);
		}
	};
	protected Option relatedOption;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmOptionConversionInformation
	 * Option.mmOptionConversionInformation}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesConversion, Optional<Option>> mmRelatedOption = new MMBusinessAssociationEnd<SecuritiesConversion, Optional<Option>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOption";
			definition = "Option for which securities conversion information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Option.mmOptionConversionInformation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Option.mmObject();
		}

		@Override
		public Optional<Option> getValue(SecuritiesConversion obj) {
			return obj.getRelatedOption();
		}

		@Override
		public void setValue(SecuritiesConversion obj, Optional<Option> value) {
			obj.setRelatedOption(value.orElse(null));
		}
	};
	protected BusinessDayConventionCode businessDayConvention;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesConversion, BusinessDayConventionCode> mmBusinessDayConvention = new MMBusinessAttribute<SecuritiesConversion, BusinessDayConventionCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BusinessDayConvention";
			definition = "Convention used for adjusting a date when it is not a business day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BusinessDayConventionCode.mmObject();
		}

		@Override
		public BusinessDayConventionCode getValue(SecuritiesConversion obj) {
			return obj.getBusinessDayConvention();
		}

		@Override
		public void setValue(SecuritiesConversion obj, BusinessDayConventionCode value) {
			obj.setBusinessDayConvention(value);
		}
	};
	protected ChoiceCode conversionChoice;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesConversion, ChoiceCode> mmConversionChoice = new MMBusinessAttribute<SecuritiesConversion, ChoiceCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConversionChoice";
			definition = "Specifies whether the conversion is mandatory or optional.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ChoiceCode.mmObject();
		}

		@Override
		public ChoiceCode getValue(SecuritiesConversion obj) {
			return obj.getConversionChoice();
		}

		@Override
		public void setValue(SecuritiesConversion obj, ChoiceCode value) {
			obj.setConversionChoice(value);
		}
	};
	protected BaseOneRate conversionFixedExchangeRate;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesConversion, BaseOneRate> mmConversionFixedExchangeRate = new MMBusinessAttribute<SecuritiesConversion, BaseOneRate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConversionFixedExchangeRate";
			definition = "Currency exchange rate between the bond currency and the underlying equity currency used to calculate the convertion ratio.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public BaseOneRate getValue(SecuritiesConversion obj) {
			return obj.getConversionFixedExchangeRate();
		}

		@Override
		public void setValue(SecuritiesConversion obj, BaseOneRate value) {
			obj.setConversionFixedExchangeRate(value);
		}
	};
	protected CurrencyAndAmount conversionMarginAmount;
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
	public static final MMBusinessAttribute<SecuritiesConversion, CurrencyAndAmount> mmConversionMarginAmount = new MMBusinessAttribute<SecuritiesConversion, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConversionMarginAmount";
			definition = "Amount of cash needed for the conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(SecuritiesConversion obj) {
			return obj.getConversionMarginAmount();
		}

		@Override
		public void setValue(SecuritiesConversion obj, CurrencyAndAmount value) {
			obj.setConversionMarginAmount(value);
		}
	};
	protected CorporateActionOptionCode conversionOption;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesConversion, CorporateActionOptionCode> mmConversionOption = new MMBusinessAttribute<SecuritiesConversion, CorporateActionOptionCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConversionOption";
			definition = "Specifies information about the choices offered to the holder of a conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionOptionCode.mmObject();
		}

		@Override
		public CorporateActionOptionCode getValue(SecuritiesConversion obj) {
			return obj.getConversionOption();
		}

		@Override
		public void setValue(SecuritiesConversion obj, CorporateActionOptionCode value) {
			obj.setConversionOption(value);
		}
	};
	protected CurrencyCode conversionQuotedCurrency;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.LoanContract1#mmSettlementCurrency
	 * LoanContract1.mmSettlementCurrency}</li>
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
	public static final MMBusinessAttribute<SecuritiesConversion, CurrencyCode> mmConversionQuotedCurrency = new MMBusinessAttribute<SecuritiesConversion, CurrencyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(LoanContract1.mmSettlementCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConversionQuotedCurrency";
			definition = "Currency into which the base currency is converted, in a currency exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(SecuritiesConversion obj) {
			return obj.getConversionQuotedCurrency();
		}

		@Override
		public void setValue(SecuritiesConversion obj, CurrencyCode value) {
			obj.setConversionQuotedCurrency(value);
		}
	};
	protected FinancialCenterCode financialCenter;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesConversion, FinancialCenterCode> mmFinancialCenter = new MMBusinessAttribute<SecuritiesConversion, FinancialCenterCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialCenter";
			definition = "Financial place  taken into account to adjust the date and time, as defined within the business day convention.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialCenterCode.mmObject();
		}

		@Override
		public FinancialCenterCode getValue(SecuritiesConversion obj) {
			return obj.getFinancialCenter();
		}

		@Override
		public void setValue(SecuritiesConversion obj, FinancialCenterCode value) {
			obj.setFinancialCenter(value);
		}
	};
	protected Number minimumNoticeDays;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesConversion, Number> mmMinimumNoticeDays = new MMBusinessAttribute<SecuritiesConversion, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumNoticeDays";
			definition = "Minimum number of days that must be given by either the issuer or the holder before conversion can take place.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(SecuritiesConversion obj) {
			return obj.getMinimumNoticeDays();
		}

		@Override
		public void setValue(SecuritiesConversion obj, Number value) {
			obj.setMinimumNoticeDays(value);
		}
	};
	protected NoticePeriodTypeCode noticePeriodType;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesConversion, NoticePeriodTypeCode> mmNoticePeriodType = new MMBusinessAttribute<SecuritiesConversion, NoticePeriodTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoticePeriodType";
			definition = "Specifies the type of notice period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NoticePeriodTypeCode.mmObject();
		}

		@Override
		public NoticePeriodTypeCode getValue(SecuritiesConversion obj) {
			return obj.getNoticePeriodType();
		}

		@Override
		public void setValue(SecuritiesConversion obj, NoticePeriodTypeCode value) {
			obj.setNoticePeriodType(value);
		}
	};
	protected YesNoIndicator protectionAgainstDilutionIndicator;
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
	public static final MMBusinessAttribute<SecuritiesConversion, YesNoIndicator> mmProtectionAgainstDilutionIndicator = new MMBusinessAttribute<SecuritiesConversion, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProtectionAgainstDilutionIndicator";
			definition = "Indicates whether the security is protected against dilution with regards to capital events.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesConversion obj) {
			return obj.getProtectionAgainstDilutionIndicator();
		}

		@Override
		public void setValue(SecuritiesConversion obj, YesNoIndicator value) {
			obj.setProtectionAgainstDilutionIndicator(value);
		}
	};
	protected YesNoIndicator reverseConversionIndicator;
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
	public static final MMBusinessAttribute<SecuritiesConversion, YesNoIndicator> mmReverseConversionIndicator = new MMBusinessAttribute<SecuritiesConversion, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReverseConversionIndicator";
			definition = "Indicates whether the bond is convertible into an equity and back to the bond.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesConversion obj) {
			return obj.getReverseConversionIndicator();
		}

		@Override
		public void setValue(SecuritiesConversion obj, YesNoIndicator value) {
			obj.setReverseConversionIndicator(value);
		}
	};
	protected Security securityIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmConversion
	 * Security.mmConversion}</li>
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
	public static final MMBusinessAssociationEnd<SecuritiesConversion, Security> mmSecurityIdentification = new MMBusinessAssociationEnd<SecuritiesConversion, Security>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecurityIdentification";
			definition = "ISIN identification of the related financial instrument into which this security can be converted.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Security.mmConversion;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}

		@Override
		public Security getValue(SecuritiesConversion obj) {
			return obj.getSecurityIdentification();
		}

		@Override
		public void setValue(SecuritiesConversion obj, Security value) {
			obj.setSecurityIdentification(value);
		}
	};
	protected PartyTypeCode partyType;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<SecuritiesConversion, PartyTypeCode> mmPartyType = new MMBusinessAttribute<SecuritiesConversion, PartyTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyType";
			definition = "Specifies if the issuer or the holder are allowed to convert the security into another one.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PartyTypeCode.mmObject();
		}

		@Override
		public PartyTypeCode getValue(SecuritiesConversion obj) {
			return obj.getPartyType();
		}

		@Override
		public void setValue(SecuritiesConversion obj, PartyTypeCode value) {
			obj.setPartyType(value);
		}
	};
	protected BaseOneRate contractSize;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmContractSize
	 * FinancialInstrumentAttributes8.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmContractSize
	 * FinancialInstrumentAttributes20.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmContractSize
	 * FinancialInstrumentAttributes35.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmContractSize
	 * FinancialInstrumentAttributes41.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#mmContractSize
	 * FinancialInstrumentAttributes6.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#mmContractSize
	 * FinancialInstrumentAttributes9.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#mmContractSize
	 * FinancialInstrumentAttributes18.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#mmContractSize
	 * FinancialInstrumentAttributes22.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#mmContractSize
	 * FinancialInstrumentAttributes32.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#mmContractSize
	 * FinancialInstrumentAttributes38.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#mmContractSize
	 * FinancialInstrumentAttributes7.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#mmContractSize
	 * FinancialInstrumentAttributes5.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#mmContractSize
	 * FinancialInstrumentAttributes11.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#mmContractSize
	 * FinancialInstrumentAttributes10.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#mmContractSize
	 * FinancialInstrumentAttributes19.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#mmContractSize
	 * FinancialInstrumentAttributes16.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#mmContractSize
	 * FinancialInstrumentAttributes23.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#mmContractSize
	 * FinancialInstrumentAttributes24.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#mmContractSize
	 * FinancialInstrumentAttributes33.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#mmContractSize
	 * FinancialInstrumentAttributes34.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#mmContractSize
	 * FinancialInstrumentAttributes39.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#mmContractSize
	 * FinancialInstrumentAttributes40.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#mmContractSize
	 * FinancialInstrumentAttributes43.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#mmContractSize
	 * FinancialInstrumentAttributes45.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmContractSize
	 * FinancialInstrumentAttributes4.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmContractSize
	 * FinancialInstrumentAttributes13.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmContractSize
	 * FinancialInstrumentAttributes21.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmContractSize
	 * FinancialInstrumentAttributes26.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmContractSize
	 * FinancialInstrumentAttributes36.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmContractSize
	 * FinancialInstrumentAttributes42.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmContractSize
	 * FinancialInstrumentAttributes27.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmContractSize
	 * FinancialInstrumentAttributes14.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmContractSize
	 * FinancialInstrumentAttributes30.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmContractSize
	 * FinancialInstrumentAttributes28.mmContractSize}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmContractSize
	 * Option1.mmContractSize}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Future1#mmContractSize
	 * Future1.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmContractSize
	 * FinancialInstrumentAttributes31.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmContractSize
	 * FinancialInstrumentAttributes44.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmContractSize
	 * FinancialInstrumentAttributes15.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmContractSize
	 * FinancialInstrumentAttributes29.mmContractSize}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Future2#mmContractSize
	 * Future2.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmContractSize
	 * FinancialInstrumentAttributes2.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmContractSize
	 * FinancialInstrumentAttributes48.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#mmContractSize
	 * FinancialInstrumentAttributes50.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmContractSize
	 * FinancialInstrumentAttributes49.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#mmContractSize
	 * FinancialInstrumentAttributes55.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#mmContractSize
	 * FinancialInstrumentAttributes57.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#mmContractSize
	 * FinancialInstrumentAttributes56.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmContractSize
	 * FinancialInstrumentAttributes63.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmContractSize
	 * FinancialInstrumentAttributes64.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmContractSize
	 * FinancialInstrumentAttributes66.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#mmContractSize
	 * FinancialInstrumentAttributes65.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmContractSize
	 * FinancialInstrumentAttributes67.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#mmContractSize
	 * FinancialInstrumentAttributes70.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#mmContractSize
	 * FinancialInstrumentAttributes69.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#mmContractSize
	 * FinancialInstrumentAttributes71.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmContractSize
	 * FinancialInstrumentAttributes75.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmContractSize
	 * FinancialInstrumentAttributes78.mmContractSize}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Future3#mmContractSize
	 * Future3.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmContractSize
	 * FinancialInstrumentAttributes79.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmContractSize
	 * FinancialInstrumentAttributes81.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmContractSize
	 * FinancialInstrumentAttributes80.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#mmContractSize
	 * FinancialInstrumentAttributes85.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#mmContractSize
	 * FinancialInstrumentAttributes84.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#mmContractSize
	 * FinancialInstrumentAttributes83.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmContractSize
	 * FinancialInstrumentAttributes91.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmContractSize
	 * FinancialInstrumentAttributes92.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes95#mmContractSize
	 * FinancialInstrumentAttributes95.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmContractSize
	 * FinancialInstrumentAttributes97.mmContractSize}</li>
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
	public static final MMBusinessAttribute<SecuritiesConversion, BaseOneRate> mmContractSize = new MMBusinessAttribute<SecuritiesConversion, BaseOneRate>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes8.mmContractSize, FinancialInstrumentAttributes20.mmContractSize, FinancialInstrumentAttributes35.mmContractSize,
					FinancialInstrumentAttributes41.mmContractSize, FinancialInstrumentAttributes6.mmContractSize, FinancialInstrumentAttributes9.mmContractSize, FinancialInstrumentAttributes18.mmContractSize,
					FinancialInstrumentAttributes22.mmContractSize, FinancialInstrumentAttributes32.mmContractSize, FinancialInstrumentAttributes38.mmContractSize, FinancialInstrumentAttributes7.mmContractSize,
					FinancialInstrumentAttributes5.mmContractSize, FinancialInstrumentAttributes11.mmContractSize, FinancialInstrumentAttributes10.mmContractSize, FinancialInstrumentAttributes19.mmContractSize,
					FinancialInstrumentAttributes16.mmContractSize, FinancialInstrumentAttributes23.mmContractSize, FinancialInstrumentAttributes24.mmContractSize, FinancialInstrumentAttributes33.mmContractSize,
					FinancialInstrumentAttributes34.mmContractSize, FinancialInstrumentAttributes39.mmContractSize, FinancialInstrumentAttributes40.mmContractSize, FinancialInstrumentAttributes43.mmContractSize,
					FinancialInstrumentAttributes45.mmContractSize, FinancialInstrumentAttributes4.mmContractSize, FinancialInstrumentAttributes13.mmContractSize, FinancialInstrumentAttributes21.mmContractSize,
					FinancialInstrumentAttributes26.mmContractSize, FinancialInstrumentAttributes36.mmContractSize, FinancialInstrumentAttributes42.mmContractSize, FinancialInstrumentAttributes27.mmContractSize,
					FinancialInstrumentAttributes14.mmContractSize, FinancialInstrumentAttributes30.mmContractSize, FinancialInstrumentAttributes28.mmContractSize, Option1.mmContractSize, Future1.mmContractSize,
					FinancialInstrumentAttributes31.mmContractSize, FinancialInstrumentAttributes44.mmContractSize, FinancialInstrumentAttributes15.mmContractSize, FinancialInstrumentAttributes29.mmContractSize, Future2.mmContractSize,
					FinancialInstrumentAttributes2.mmContractSize, FinancialInstrumentAttributes48.mmContractSize, FinancialInstrumentAttributes50.mmContractSize, FinancialInstrumentAttributes49.mmContractSize,
					FinancialInstrumentAttributes55.mmContractSize, FinancialInstrumentAttributes57.mmContractSize, FinancialInstrumentAttributes56.mmContractSize, FinancialInstrumentAttributes63.mmContractSize,
					FinancialInstrumentAttributes64.mmContractSize, FinancialInstrumentAttributes66.mmContractSize, FinancialInstrumentAttributes65.mmContractSize, FinancialInstrumentAttributes67.mmContractSize,
					FinancialInstrumentAttributes70.mmContractSize, FinancialInstrumentAttributes69.mmContractSize, FinancialInstrumentAttributes71.mmContractSize, FinancialInstrumentAttributes75.mmContractSize,
					FinancialInstrumentAttributes78.mmContractSize, Future3.mmContractSize, FinancialInstrumentAttributes79.mmContractSize, FinancialInstrumentAttributes81.mmContractSize, FinancialInstrumentAttributes80.mmContractSize,
					FinancialInstrumentAttributes85.mmContractSize, FinancialInstrumentAttributes84.mmContractSize, FinancialInstrumentAttributes83.mmContractSize, FinancialInstrumentAttributes91.mmContractSize,
					FinancialInstrumentAttributes92.mmContractSize, FinancialInstrumentAttributes95.mmContractSize, FinancialInstrumentAttributes97.mmContractSize);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ContractSize";
			definition = "Ratio or multiplying factor used to convert one contract into a quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public BaseOneRate getValue(SecuritiesConversion obj) {
			return obj.getContractSize();
		}

		@Override
		public void setValue(SecuritiesConversion obj, BaseOneRate value) {
			obj.setContractSize(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesConversion";
				definition = "Conversion exchange of securities, generally convertible bonds or preferred equities, into another form of securities, usually common equities.";
				associationDomain_lazy = () -> Arrays.asList(Security.mmConversion, SecuritiesPricing.mmRelatedSecuritiesConversion, DateTimePeriod.mmSecuritiesConversion,
						SecuritiesQuantity.mmMinimumExercisableQuantitySecuritiesConversion, SecuritiesQuantity.mmMinimumExercisableMultipleQuantitySecuritiesConversion, SecuritiesQuantity.mmMaximumExercisableQuantitySecuritiesConversion,
						SecuritiesQuantity.mmRatioDenominatorSecuritiesConversion, SecuritiesQuantity.mmRatioNumeratorSecuritiesConversion, CurrencyExchange.mmCurrencyExchangeForSecuritiesConversion, Option.mmOptionConversionInformation,
						UnderlyingRatio.mmSecuritiesConversion);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesConversion.mmConversionPrice, com.tools20022.repository.entity.SecuritiesConversion.mmConversionDate,
						com.tools20022.repository.entity.SecuritiesConversion.mmMinimumExercisableQuantity, com.tools20022.repository.entity.SecuritiesConversion.mmMinimumExercisableMultipleQuantity,
						com.tools20022.repository.entity.SecuritiesConversion.mmMaximumExercisableQuantity, com.tools20022.repository.entity.SecuritiesConversion.mmConversionType,
						com.tools20022.repository.entity.SecuritiesConversion.mmConversionPeriod, com.tools20022.repository.entity.SecuritiesConversion.mmConversionRatioDenominator,
						com.tools20022.repository.entity.SecuritiesConversion.mmConversionRatioNumerator, com.tools20022.repository.entity.SecuritiesConversion.mmRatio,
						com.tools20022.repository.entity.SecuritiesConversion.mmConversionUnitCurrency, com.tools20022.repository.entity.SecuritiesConversion.mmRelatedOption,
						com.tools20022.repository.entity.SecuritiesConversion.mmBusinessDayConvention, com.tools20022.repository.entity.SecuritiesConversion.mmConversionChoice,
						com.tools20022.repository.entity.SecuritiesConversion.mmConversionFixedExchangeRate, com.tools20022.repository.entity.SecuritiesConversion.mmConversionMarginAmount,
						com.tools20022.repository.entity.SecuritiesConversion.mmConversionOption, com.tools20022.repository.entity.SecuritiesConversion.mmConversionQuotedCurrency,
						com.tools20022.repository.entity.SecuritiesConversion.mmFinancialCenter, com.tools20022.repository.entity.SecuritiesConversion.mmMinimumNoticeDays,
						com.tools20022.repository.entity.SecuritiesConversion.mmNoticePeriodType, com.tools20022.repository.entity.SecuritiesConversion.mmProtectionAgainstDilutionIndicator,
						com.tools20022.repository.entity.SecuritiesConversion.mmReverseConversionIndicator, com.tools20022.repository.entity.SecuritiesConversion.mmSecurityIdentification,
						com.tools20022.repository.entity.SecuritiesConversion.mmPartyType, com.tools20022.repository.entity.SecuritiesConversion.mmContractSize);
				derivationComponent_lazy = () -> Arrays.asList(ConversionTypeFormat1Choice.mmObject(), ConversionTypeFormat2Choice.mmObject(), ConversionType1FormatChoice.mmObject(), ConversionTypeFormat3Choice.mmObject(),
						ConversionTypeFormat4Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesConversion.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesPricing getConversionPrice() {
		return conversionPrice;
	}

	public SecuritiesConversion setConversionPrice(SecuritiesPricing conversionPrice) {
		this.conversionPrice = Objects.requireNonNull(conversionPrice);
		return this;
	}

	public ISODateTime getConversionDate() {
		return conversionDate;
	}

	public SecuritiesConversion setConversionDate(ISODateTime conversionDate) {
		this.conversionDate = Objects.requireNonNull(conversionDate);
		return this;
	}

	public SecuritiesQuantity getMinimumExercisableQuantity() {
		return minimumExercisableQuantity;
	}

	public SecuritiesConversion setMinimumExercisableQuantity(SecuritiesQuantity minimumExercisableQuantity) {
		this.minimumExercisableQuantity = Objects.requireNonNull(minimumExercisableQuantity);
		return this;
	}

	public SecuritiesQuantity getMinimumExercisableMultipleQuantity() {
		return minimumExercisableMultipleQuantity;
	}

	public SecuritiesConversion setMinimumExercisableMultipleQuantity(SecuritiesQuantity minimumExercisableMultipleQuantity) {
		this.minimumExercisableMultipleQuantity = Objects.requireNonNull(minimumExercisableMultipleQuantity);
		return this;
	}

	public SecuritiesQuantity getMaximumExercisableQuantity() {
		return maximumExercisableQuantity;
	}

	public SecuritiesConversion setMaximumExercisableQuantity(SecuritiesQuantity maximumExercisableQuantity) {
		this.maximumExercisableQuantity = Objects.requireNonNull(maximumExercisableQuantity);
		return this;
	}

	public ConversionTypeCode getConversionType() {
		return conversionType;
	}

	public SecuritiesConversion setConversionType(ConversionTypeCode conversionType) {
		this.conversionType = Objects.requireNonNull(conversionType);
		return this;
	}

	public DateTimePeriod getConversionPeriod() {
		return conversionPeriod;
	}

	public SecuritiesConversion setConversionPeriod(DateTimePeriod conversionPeriod) {
		this.conversionPeriod = Objects.requireNonNull(conversionPeriod);
		return this;
	}

	public SecuritiesQuantity getConversionRatioDenominator() {
		return conversionRatioDenominator;
	}

	public SecuritiesConversion setConversionRatioDenominator(SecuritiesQuantity conversionRatioDenominator) {
		this.conversionRatioDenominator = Objects.requireNonNull(conversionRatioDenominator);
		return this;
	}

	public SecuritiesQuantity getConversionRatioNumerator() {
		return conversionRatioNumerator;
	}

	public SecuritiesConversion setConversionRatioNumerator(SecuritiesQuantity conversionRatioNumerator) {
		this.conversionRatioNumerator = Objects.requireNonNull(conversionRatioNumerator);
		return this;
	}

	public List<UnderlyingRatio> getRatio() {
		return ratio == null ? ratio = new ArrayList<>() : ratio;
	}

	public SecuritiesConversion setRatio(List<UnderlyingRatio> ratio) {
		this.ratio = Objects.requireNonNull(ratio);
		return this;
	}

	public CurrencyExchange getConversionUnitCurrency() {
		return conversionUnitCurrency;
	}

	public SecuritiesConversion setConversionUnitCurrency(CurrencyExchange conversionUnitCurrency) {
		this.conversionUnitCurrency = Objects.requireNonNull(conversionUnitCurrency);
		return this;
	}

	public Optional<Option> getRelatedOption() {
		return relatedOption == null ? Optional.empty() : Optional.of(relatedOption);
	}

	public SecuritiesConversion setRelatedOption(Option relatedOption) {
		this.relatedOption = relatedOption;
		return this;
	}

	public BusinessDayConventionCode getBusinessDayConvention() {
		return businessDayConvention;
	}

	public SecuritiesConversion setBusinessDayConvention(BusinessDayConventionCode businessDayConvention) {
		this.businessDayConvention = Objects.requireNonNull(businessDayConvention);
		return this;
	}

	public ChoiceCode getConversionChoice() {
		return conversionChoice;
	}

	public SecuritiesConversion setConversionChoice(ChoiceCode conversionChoice) {
		this.conversionChoice = Objects.requireNonNull(conversionChoice);
		return this;
	}

	public BaseOneRate getConversionFixedExchangeRate() {
		return conversionFixedExchangeRate;
	}

	public SecuritiesConversion setConversionFixedExchangeRate(BaseOneRate conversionFixedExchangeRate) {
		this.conversionFixedExchangeRate = Objects.requireNonNull(conversionFixedExchangeRate);
		return this;
	}

	public CurrencyAndAmount getConversionMarginAmount() {
		return conversionMarginAmount;
	}

	public SecuritiesConversion setConversionMarginAmount(CurrencyAndAmount conversionMarginAmount) {
		this.conversionMarginAmount = Objects.requireNonNull(conversionMarginAmount);
		return this;
	}

	public CorporateActionOptionCode getConversionOption() {
		return conversionOption;
	}

	public SecuritiesConversion setConversionOption(CorporateActionOptionCode conversionOption) {
		this.conversionOption = Objects.requireNonNull(conversionOption);
		return this;
	}

	public CurrencyCode getConversionQuotedCurrency() {
		return conversionQuotedCurrency;
	}

	public SecuritiesConversion setConversionQuotedCurrency(CurrencyCode conversionQuotedCurrency) {
		this.conversionQuotedCurrency = Objects.requireNonNull(conversionQuotedCurrency);
		return this;
	}

	public FinancialCenterCode getFinancialCenter() {
		return financialCenter;
	}

	public SecuritiesConversion setFinancialCenter(FinancialCenterCode financialCenter) {
		this.financialCenter = Objects.requireNonNull(financialCenter);
		return this;
	}

	public Number getMinimumNoticeDays() {
		return minimumNoticeDays;
	}

	public SecuritiesConversion setMinimumNoticeDays(Number minimumNoticeDays) {
		this.minimumNoticeDays = Objects.requireNonNull(minimumNoticeDays);
		return this;
	}

	public NoticePeriodTypeCode getNoticePeriodType() {
		return noticePeriodType;
	}

	public SecuritiesConversion setNoticePeriodType(NoticePeriodTypeCode noticePeriodType) {
		this.noticePeriodType = Objects.requireNonNull(noticePeriodType);
		return this;
	}

	public YesNoIndicator getProtectionAgainstDilutionIndicator() {
		return protectionAgainstDilutionIndicator;
	}

	public SecuritiesConversion setProtectionAgainstDilutionIndicator(YesNoIndicator protectionAgainstDilutionIndicator) {
		this.protectionAgainstDilutionIndicator = Objects.requireNonNull(protectionAgainstDilutionIndicator);
		return this;
	}

	public YesNoIndicator getReverseConversionIndicator() {
		return reverseConversionIndicator;
	}

	public SecuritiesConversion setReverseConversionIndicator(YesNoIndicator reverseConversionIndicator) {
		this.reverseConversionIndicator = Objects.requireNonNull(reverseConversionIndicator);
		return this;
	}

	public Security getSecurityIdentification() {
		return securityIdentification;
	}

	public SecuritiesConversion setSecurityIdentification(Security securityIdentification) {
		this.securityIdentification = Objects.requireNonNull(securityIdentification);
		return this;
	}

	public PartyTypeCode getPartyType() {
		return partyType;
	}

	public SecuritiesConversion setPartyType(PartyTypeCode partyType) {
		this.partyType = Objects.requireNonNull(partyType);
		return this;
	}

	public BaseOneRate getContractSize() {
		return contractSize;
	}

	public SecuritiesConversion setContractSize(BaseOneRate contractSize) {
		this.contractSize = Objects.requireNonNull(contractSize);
		return this;
	}
}