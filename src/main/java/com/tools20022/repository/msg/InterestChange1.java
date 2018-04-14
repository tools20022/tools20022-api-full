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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.Frequency1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Index;
import com.tools20022.repository.entity.Spread;
import com.tools20022.repository.entity.VariableInterest;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InterestChange1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Variable interest payment of a security."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InterestChange1", propOrder = {"fixingDate", "reportingDate", "resetDate", "spreadRate", "variableRateChangeFrequency", "rateResetSource", "arriers", "indexRateBasis", "indexRateCurrency", "indexRateFrequency",
		"indexRateMultiplier"})
public class InterestChange1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FxgDt", required = true)
	protected ISODateTime fixingDate;
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
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmFixingDate
	 * VariableInterest.mmFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestChange1
	 * InterestChange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FxgDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the rate determination is made, also called determination date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestChange1, ISODateTime> mmFixingDate = new MMMessageAttribute<InterestChange1, ISODateTime>() {
		{
			businessElementTrace_lazy = () -> VariableInterest.mmFixingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestChange1.mmObject();
			isDerived = false;
			xmlTag = "FxgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixingDate";
			definition = "Date/time at which the rate determination is made, also called determination date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(InterestChange1 obj) {
			return obj.getFixingDate();
		}

		@Override
		public void setValue(InterestChange1 obj, ISODateTime value) {
			obj.setFixingDate(value);
		}
	};
	@XmlElement(name = "RptgDt", required = true)
	protected ISODateTime reportingDate;
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
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmReportingDate
	 * VariableInterest.mmReportingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestChange1
	 * InterestChange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date the new interest rate must be reported to the market."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestChange1, ISODateTime> mmReportingDate = new MMMessageAttribute<InterestChange1, ISODateTime>() {
		{
			businessElementTrace_lazy = () -> VariableInterest.mmReportingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestChange1.mmObject();
			isDerived = false;
			xmlTag = "RptgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingDate";
			definition = "Last date the new interest rate must be reported to the market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(InterestChange1 obj) {
			return obj.getReportingDate();
		}

		@Override
		public void setValue(InterestChange1 obj, ISODateTime value) {
			obj.setReportingDate(value);
		}
	};
	@XmlElement(name = "RstDt", required = true)
	protected ISODateTime resetDate;
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
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmResetDate
	 * VariableInterest.mmResetDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestChange1
	 * InterestChange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RstDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResetDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the interest rate of an interest bearing security will be calculated and reset, according to the terms of the issue."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestChange1, ISODateTime> mmResetDate = new MMMessageAttribute<InterestChange1, ISODateTime>() {
		{
			businessElementTrace_lazy = () -> VariableInterest.mmResetDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestChange1.mmObject();
			isDerived = false;
			xmlTag = "RstDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResetDate";
			definition = "Date/time at which the interest rate of an interest bearing security will be calculated and reset, according to the terms of the issue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(InterestChange1 obj) {
			return obj.getResetDate();
		}

		@Override
		public void setValue(InterestChange1 obj, ISODateTime value) {
			obj.setResetDate(value);
		}
	};
	@XmlElement(name = "SprdRate", required = true)
	protected PercentageRate spreadRate;
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
	 * {@linkplain com.tools20022.repository.entity.Spread#mmSpreadRate
	 * Spread.mmSpreadRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestChange1
	 * InterestChange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SprdRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpreadRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin over or under an index which determines the interest rate of an interest bearing security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestChange1, PercentageRate> mmSpreadRate = new MMMessageAttribute<InterestChange1, PercentageRate>() {
		{
			businessElementTrace_lazy = () -> Spread.mmSpreadRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestChange1.mmObject();
			isDerived = false;
			xmlTag = "SprdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpreadRate";
			definition = "Margin over or under an index which determines the interest rate of an interest bearing security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(InterestChange1 obj) {
			return obj.getSpreadRate();
		}

		@Override
		public void setValue(InterestChange1 obj, PercentageRate value) {
			obj.setSpreadRate(value);
		}
	};
	@XmlElement(name = "VarblRateChngFrqcy", required = true)
	protected Frequency1Code variableRateChangeFrequency;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateChangeFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the frequency of change to the variable rate of an interest bearing instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestChange1, Frequency1Code> mmVariableRateChangeFrequency = new MMMessageAttribute<InterestChange1, Frequency1Code>() {
		{
			businessElementTrace_lazy = () -> VariableInterest.mmVariableRateChangeFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestChange1.mmObject();
			isDerived = false;
			xmlTag = "VarblRateChngFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateChangeFrequency";
			definition = "Specifies the frequency of change to the variable rate of an interest bearing instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Frequency1Code.mmObject();
		}

		@Override
		public Frequency1Code getValue(InterestChange1 obj) {
			return obj.getVariableRateChangeFrequency();
		}

		@Override
		public void setValue(InterestChange1 obj, Frequency1Code value) {
			obj.setVariableRateChangeFrequency(value);
		}
	};
	@XmlElement(name = "RateRstSrc", required = true)
	protected Max35Text rateResetSource;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateResetSource"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the reference source for benchmark interest rates. The source can be the fixing agent or a system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestChange1, Max35Text> mmRateResetSource = new MMMessageAttribute<InterestChange1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> Index.mmReferenceSource;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestChange1.mmObject();
			isDerived = false;
			xmlTag = "RateRstSrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateResetSource";
			definition = "Identifies the reference source for benchmark interest rates. The source can be the fixing agent or a system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(InterestChange1 obj) {
			return obj.getRateResetSource();
		}

		@Override
		public void setValue(InterestChange1 obj, Max35Text value) {
			obj.setRateResetSource(value);
		}
	};
	@XmlElement(name = "Arrs", required = true)
	protected Max16Text arriers;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Arriers"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the rate reset will occur at the end of the payment period (True case)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestChange1, Max16Text> mmArriers = new MMMessageAttribute<InterestChange1, Max16Text>() {
		{
			businessElementTrace_lazy = () -> VariableInterest.mmArrears;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestChange1.mmObject();
			isDerived = false;
			xmlTag = "Arrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Arriers";
			definition = "Indicates that the rate reset will occur at the end of the payment period (True case).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		@Override
		public Max16Text getValue(InterestChange1 obj) {
			return obj.getArriers();
		}

		@Override
		public void setValue(InterestChange1 obj, Max16Text value) {
			obj.setArriers(value);
		}
	};
	@XmlElement(name = "IndxRateBsis", required = true)
	protected PercentageRate indexRateBasis;
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
	 * {@linkplain com.tools20022.repository.entity.Index#mmIndexRateBasis
	 * Index.mmIndexRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestChange1
	 * InterestChange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndxRateBsis"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexRateBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reference rate for fixed income instruments where the \nprice of the instrument is indexed to the price of an underlying benchmark."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestChange1, PercentageRate> mmIndexRateBasis = new MMMessageAttribute<InterestChange1, PercentageRate>() {
		{
			businessElementTrace_lazy = () -> Index.mmIndexRateBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestChange1.mmObject();
			isDerived = false;
			xmlTag = "IndxRateBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexRateBasis";
			definition = "Specifies the reference rate for fixed income instruments where the \nprice of the instrument is indexed to the price of an underlying benchmark.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(InterestChange1 obj) {
			return obj.getIndexRateBasis();
		}

		@Override
		public void setValue(InterestChange1 obj, PercentageRate value) {
			obj.setIndexRateBasis(value);
		}
	};
	@XmlElement(name = "IndxRateCcy", required = true)
	protected CurrencyCode indexRateCurrency;
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
	 * {@linkplain com.tools20022.repository.entity.Index#mmIndexRateCurrency
	 * Index.mmIndexRateCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestChange1
	 * InterestChange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndxRateCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexRateCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the currency of the reference rate for fixed income instruments where the price of the instrument is indexed to the price of an underlying benchmark."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestChange1, CurrencyCode> mmIndexRateCurrency = new MMMessageAttribute<InterestChange1, CurrencyCode>() {
		{
			businessElementTrace_lazy = () -> Index.mmIndexRateCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestChange1.mmObject();
			isDerived = false;
			xmlTag = "IndxRateCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexRateCurrency";
			definition = "Specifies the currency of the reference rate for fixed income instruments where the price of the instrument is indexed to the price of an underlying benchmark.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(InterestChange1 obj) {
			return obj.getIndexRateCurrency();
		}

		@Override
		public void setValue(InterestChange1 obj, CurrencyCode value) {
			obj.setIndexRateCurrency(value);
		}
	};
	@XmlElement(name = "IndxRateFrqcy", required = true)
	protected Frequency1Code indexRateFrequency;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexRateFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Frequency at which the variable rate changes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestChange1, Frequency1Code> mmIndexRateFrequency = new MMMessageAttribute<InterestChange1, Frequency1Code>() {
		{
			businessElementTrace_lazy = () -> Index.mmIndexRateFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestChange1.mmObject();
			isDerived = false;
			xmlTag = "IndxRateFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexRateFrequency";
			definition = "Frequency at which the variable rate changes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Frequency1Code.mmObject();
		}

		@Override
		public Frequency1Code getValue(InterestChange1 obj) {
			return obj.getIndexRateFrequency();
		}

		@Override
		public void setValue(InterestChange1 obj, Frequency1Code value) {
			obj.setIndexRateFrequency(value);
		}
	};
	@XmlElement(name = "IndxRateMltplr", required = true)
	protected DecimalNumber indexRateMultiplier;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexRateMultiplier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Multiplier for the variable rate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestChange1, DecimalNumber> mmIndexRateMultiplier = new MMMessageAttribute<InterestChange1, DecimalNumber>() {
		{
			businessElementTrace_lazy = () -> Index.mmIndexRateMultiplier;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestChange1.mmObject();
			isDerived = false;
			xmlTag = "IndxRateMltplr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexRateMultiplier";
			definition = "Multiplier for the variable rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(InterestChange1 obj) {
			return obj.getIndexRateMultiplier();
		}

		@Override
		public void setValue(InterestChange1 obj, DecimalNumber value) {
			obj.setIndexRateMultiplier(value);
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
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
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

	public InterestChange1 setFixingDate(ISODateTime fixingDate) {
		this.fixingDate = Objects.requireNonNull(fixingDate);
		return this;
	}

	public ISODateTime getReportingDate() {
		return reportingDate;
	}

	public InterestChange1 setReportingDate(ISODateTime reportingDate) {
		this.reportingDate = Objects.requireNonNull(reportingDate);
		return this;
	}

	public ISODateTime getResetDate() {
		return resetDate;
	}

	public InterestChange1 setResetDate(ISODateTime resetDate) {
		this.resetDate = Objects.requireNonNull(resetDate);
		return this;
	}

	public PercentageRate getSpreadRate() {
		return spreadRate;
	}

	public InterestChange1 setSpreadRate(PercentageRate spreadRate) {
		this.spreadRate = Objects.requireNonNull(spreadRate);
		return this;
	}

	public Frequency1Code getVariableRateChangeFrequency() {
		return variableRateChangeFrequency;
	}

	public InterestChange1 setVariableRateChangeFrequency(Frequency1Code variableRateChangeFrequency) {
		this.variableRateChangeFrequency = Objects.requireNonNull(variableRateChangeFrequency);
		return this;
	}

	public Max35Text getRateResetSource() {
		return rateResetSource;
	}

	public InterestChange1 setRateResetSource(Max35Text rateResetSource) {
		this.rateResetSource = Objects.requireNonNull(rateResetSource);
		return this;
	}

	public Max16Text getArriers() {
		return arriers;
	}

	public InterestChange1 setArriers(Max16Text arriers) {
		this.arriers = Objects.requireNonNull(arriers);
		return this;
	}

	public PercentageRate getIndexRateBasis() {
		return indexRateBasis;
	}

	public InterestChange1 setIndexRateBasis(PercentageRate indexRateBasis) {
		this.indexRateBasis = Objects.requireNonNull(indexRateBasis);
		return this;
	}

	public CurrencyCode getIndexRateCurrency() {
		return indexRateCurrency;
	}

	public InterestChange1 setIndexRateCurrency(CurrencyCode indexRateCurrency) {
		this.indexRateCurrency = Objects.requireNonNull(indexRateCurrency);
		return this;
	}

	public Frequency1Code getIndexRateFrequency() {
		return indexRateFrequency;
	}

	public InterestChange1 setIndexRateFrequency(Frequency1Code indexRateFrequency) {
		this.indexRateFrequency = Objects.requireNonNull(indexRateFrequency);
		return this;
	}

	public DecimalNumber getIndexRateMultiplier() {
		return indexRateMultiplier;
	}

	public InterestChange1 setIndexRateMultiplier(DecimalNumber indexRateMultiplier) {
		this.indexRateMultiplier = Objects.requireNonNull(indexRateMultiplier);
		return this;
	}
}