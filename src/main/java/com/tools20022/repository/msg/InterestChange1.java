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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.Frequency1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.VariableInterest;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

/**
 * Variable interest payment of a security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InterestChange1#mmFixingDate
 * InterestChange1.mmFixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestChange1#mmReportingDate
 * InterestChange1.mmReportingDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestChange1#mmResetDate
 * InterestChange1.mmResetDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestChange1#mmSpreadRate
 * InterestChange1.mmSpreadRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestChange1#mmVariableRateChangeFrequency
 * InterestChange1.mmVariableRateChangeFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestChange1#mmRateResetSource
 * InterestChange1.mmRateResetSource}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestChange1#mmArriers
 * InterestChange1.mmArriers}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestChange1#mmIndexRateBasis
 * InterestChange1.mmIndexRateBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestChange1#mmIndexRateCurrency
 * InterestChange1.mmIndexRateCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestChange1#mmIndexRateFrequency
 * InterestChange1.mmIndexRateFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestChange1#mmIndexRateMultiplier
 * InterestChange1.mmIndexRateMultiplier}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.VariableInterest
 * VariableInterest}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InterestChange1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Variable interest payment of a security."</li>
 * </ul>
 */
public class InterestChange1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime fixingDate;
	/**
	 * Date/time at which the rate determination is made, also called
	 * determination date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmFixingDate
	 * VariableInterest.mmFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestChange1
	 * InterestChange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FxgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the rate determination is made, also called determination date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFixingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmFixingDate;
			componentContext_lazy = () -> InterestChange1.mmObject();
			isDerived = false;
			xmlTag = "FxgDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixingDate";
			definition = "Date/time at which the rate determination is made, also called determination date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime reportingDate;
	/**
	 * Last date the new interest rate must be reported to the market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmReportingDate
	 * VariableInterest.mmReportingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestChange1
	 * InterestChange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date the new interest rate must be reported to the market."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmReportingDate;
			componentContext_lazy = () -> InterestChange1.mmObject();
			isDerived = false;
			xmlTag = "RptgDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingDate";
			definition = "Last date the new interest rate must be reported to the market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime resetDate;
	/**
	 * Date/time at which the interest rate of an interest bearing security will
	 * be calculated and reset, according to the terms of the issue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmResetDate
	 * VariableInterest.mmResetDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestChange1
	 * InterestChange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RstDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResetDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the interest rate of an interest bearing security will be calculated and reset, according to the terms of the issue."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResetDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmResetDate;
			componentContext_lazy = () -> InterestChange1.mmObject();
			isDerived = false;
			xmlTag = "RstDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResetDate";
			definition = "Date/time at which the interest rate of an interest bearing security will be calculated and reset, according to the terms of the issue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected PercentageRate spreadRate;
	/**
	 * Margin over or under an index which determines the interest rate of an
	 * interest bearing security.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.Spread#mmSpreadRate
	 * Spread.mmSpreadRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestChange1
	 * InterestChange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SprdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpreadRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin over or under an index which determines the interest rate of an interest bearing security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSpreadRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Spread.mmSpreadRate;
			componentContext_lazy = () -> InterestChange1.mmObject();
			isDerived = false;
			xmlTag = "SprdRate";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpreadRate";
			definition = "Margin over or under an index which determines the interest rate of an interest bearing security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected Frequency1Code variableRateChangeFrequency;
	/**
	 * Specifies the frequency of change to the variable rate of an interest
	 * bearing instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency1Code
	 * Frequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmVariableRateChangeFrequency
	 * VariableInterest.mmVariableRateChangeFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestChange1
	 * InterestChange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VarblRateChngFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateChangeFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the frequency of change to the variable rate of an interest bearing instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVariableRateChangeFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmVariableRateChangeFrequency;
			componentContext_lazy = () -> InterestChange1.mmObject();
			isDerived = false;
			xmlTag = "VarblRateChngFrqcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateChangeFrequency";
			definition = "Specifies the frequency of change to the variable rate of an interest bearing instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Frequency1Code.mmObject();
		}
	};
	protected Max35Text rateResetSource;
	/**
	 * Identifies the reference source for benchmark interest rates. The source
	 * can be the fixing agent or a system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Index#mmReferenceSource
	 * Index.mmReferenceSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestChange1
	 * InterestChange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateRstSrc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateResetSource"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the reference source for benchmark interest rates. The source can be the fixing agent or a system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRateResetSource = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Index.mmReferenceSource;
			componentContext_lazy = () -> InterestChange1.mmObject();
			isDerived = false;
			xmlTag = "RateRstSrc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateResetSource";
			definition = "Identifies the reference source for benchmark interest rates. The source can be the fixing agent or a system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max16Text arriers;
	/**
	 * Indicates that the rate reset will occur at the end of the payment period
	 * (True case)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmArrears
	 * VariableInterest.mmArrears}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestChange1
	 * InterestChange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Arrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Arriers"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the rate reset will occur at the end of the payment period (True case)"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmArriers = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.VariableInterest.mmArrears;
			componentContext_lazy = () -> InterestChange1.mmObject();
			isDerived = false;
			xmlTag = "Arrs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Arriers";
			definition = "Indicates that the rate reset will occur at the end of the payment period (True case)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	protected PercentageRate indexRateBasis;
	/**
	 * Specifies the reference rate for fixed income instruments where the price
	 * of the instrument is indexed to the price of an underlying benchmark.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.Index#mmIndexRateBasis
	 * Index.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestChange1
	 * InterestChange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndxRateBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexRateBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reference rate for fixed income instruments where the \nprice of the instrument is indexed to the price of an underlying benchmark."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIndexRateBasis = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Index.mmIndexRateBasis;
			componentContext_lazy = () -> InterestChange1.mmObject();
			isDerived = false;
			xmlTag = "IndxRateBsis";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexRateBasis";
			definition = "Specifies the reference rate for fixed income instruments where the \nprice of the instrument is indexed to the price of an underlying benchmark.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected CurrencyCode indexRateCurrency;
	/**
	 * Specifies the currency of the reference rate for fixed income instruments
	 * where the price of the instrument is indexed to the price of an
	 * underlying benchmark.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Index#mmIndexRateCurrency
	 * Index.mmIndexRateCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestChange1
	 * InterestChange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndxRateCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexRateCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the currency of the reference rate for fixed income instruments where the price of the instrument is indexed to the price of an underlying benchmark."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIndexRateCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Index.mmIndexRateCurrency;
			componentContext_lazy = () -> InterestChange1.mmObject();
			isDerived = false;
			xmlTag = "IndxRateCcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexRateCurrency";
			definition = "Specifies the currency of the reference rate for fixed income instruments where the price of the instrument is indexed to the price of an underlying benchmark.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected Frequency1Code indexRateFrequency;
	/**
	 * Frequency at which the variable rate changes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency1Code
	 * Frequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Index#mmIndexRateFrequency
	 * Index.mmIndexRateFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestChange1
	 * InterestChange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndxRateFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexRateFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Frequency at which the variable rate changes."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIndexRateFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Index.mmIndexRateFrequency;
			componentContext_lazy = () -> InterestChange1.mmObject();
			isDerived = false;
			xmlTag = "IndxRateFrqcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexRateFrequency";
			definition = "Frequency at which the variable rate changes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Frequency1Code.mmObject();
		}
	};
	protected DecimalNumber indexRateMultiplier;
	/**
	 * Multiplier for the variable rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Index#mmIndexRateMultiplier
	 * Index.mmIndexRateMultiplier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestChange1
	 * InterestChange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndxRateMltplr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexRateMultiplier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Multiplier for the variable rate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIndexRateMultiplier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Index.mmIndexRateMultiplier;
			componentContext_lazy = () -> InterestChange1.mmObject();
			isDerived = false;
			xmlTag = "IndxRateMltplr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexRateMultiplier";
			definition = "Multiplier for the variable rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestChange1.mmFixingDate, com.tools20022.repository.msg.InterestChange1.mmReportingDate, com.tools20022.repository.msg.InterestChange1.mmResetDate,
						com.tools20022.repository.msg.InterestChange1.mmSpreadRate, com.tools20022.repository.msg.InterestChange1.mmVariableRateChangeFrequency, com.tools20022.repository.msg.InterestChange1.mmRateResetSource,
						com.tools20022.repository.msg.InterestChange1.mmArriers, com.tools20022.repository.msg.InterestChange1.mmIndexRateBasis, com.tools20022.repository.msg.InterestChange1.mmIndexRateCurrency,
						com.tools20022.repository.msg.InterestChange1.mmIndexRateFrequency, com.tools20022.repository.msg.InterestChange1.mmIndexRateMultiplier);
				trace_lazy = () -> VariableInterest.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "InterestChange1";
				definition = "Variable interest payment of a security.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getFixingDate() {
		return fixingDate;
	}

	public void setFixingDate(ISODateTime fixingDate) {
		this.fixingDate = fixingDate;
	}

	public ISODateTime getReportingDate() {
		return reportingDate;
	}

	public void setReportingDate(ISODateTime reportingDate) {
		this.reportingDate = reportingDate;
	}

	public ISODateTime getResetDate() {
		return resetDate;
	}

	public void setResetDate(ISODateTime resetDate) {
		this.resetDate = resetDate;
	}

	public PercentageRate getSpreadRate() {
		return spreadRate;
	}

	public void setSpreadRate(PercentageRate spreadRate) {
		this.spreadRate = spreadRate;
	}

	public Frequency1Code getVariableRateChangeFrequency() {
		return variableRateChangeFrequency;
	}

	public void setVariableRateChangeFrequency(Frequency1Code variableRateChangeFrequency) {
		this.variableRateChangeFrequency = variableRateChangeFrequency;
	}

	public Max35Text getRateResetSource() {
		return rateResetSource;
	}

	public void setRateResetSource(Max35Text rateResetSource) {
		this.rateResetSource = rateResetSource;
	}

	public Max16Text getArriers() {
		return arriers;
	}

	public void setArriers(Max16Text arriers) {
		this.arriers = arriers;
	}

	public PercentageRate getIndexRateBasis() {
		return indexRateBasis;
	}

	public void setIndexRateBasis(PercentageRate indexRateBasis) {
		this.indexRateBasis = indexRateBasis;
	}

	public CurrencyCode getIndexRateCurrency() {
		return indexRateCurrency;
	}

	public void setIndexRateCurrency(CurrencyCode indexRateCurrency) {
		this.indexRateCurrency = indexRateCurrency;
	}

	public Frequency1Code getIndexRateFrequency() {
		return indexRateFrequency;
	}

	public void setIndexRateFrequency(Frequency1Code indexRateFrequency) {
		this.indexRateFrequency = indexRateFrequency;
	}

	public DecimalNumber getIndexRateMultiplier() {
		return indexRateMultiplier;
	}

	public void setIndexRateMultiplier(DecimalNumber indexRateMultiplier) {
		this.indexRateMultiplier = indexRateMultiplier;
	}
}