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
import com.tools20022.repository.codeset.DistributionPolicy1Code;
import com.tools20022.repository.codeset.DividendPolicy1Code;
import com.tools20022.repository.codeset.EUSavingsDirective1Code;
import com.tools20022.repository.codeset.EventFrequency5Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Dividend;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics;
import com.tools20022.repository.entity.Security;
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
 * Security that is a sub-set of an investment fund, and is governed by the same
 * investment fund policy, eg, dividend option or valuation currency.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#mmPhysicalBearerSecurities
 * FinancialInstrument20.mmPhysicalBearerSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#mmDematerialisedBearerSecurities
 * FinancialInstrument20.mmDematerialisedBearerSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#mmPhysicalRegisteredSecurities
 * FinancialInstrument20.mmPhysicalRegisteredSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#mmDematerialisedRegisteredSecurities
 * FinancialInstrument20.mmDematerialisedRegisteredSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#mmDistributionPolicy
 * FinancialInstrument20.mmDistributionPolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#mmDividendPolicy
 * FinancialInstrument20.mmDividendPolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#mmDividendFrequency
 * FinancialInstrument20.mmDividendFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#mmReinvestmentFrequency
 * FinancialInstrument20.mmReinvestmentFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#mmFrontEndLoad
 * FinancialInstrument20.mmFrontEndLoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#mmBackEndLoad
 * FinancialInstrument20.mmBackEndLoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#mmSwitchFee
 * FinancialInstrument20.mmSwitchFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#mmEUSavingsDirective
 * FinancialInstrument20.mmEUSavingsDirective}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
 * InvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument20
 * ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument20
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintISINIdentificationRule#forFinancialInstrument20
 * ConstraintISINIdentificationRule.forFinancialInstrument20}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrument20"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, eg, dividend option or valuation currency."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrument20", propOrder = {"physicalBearerSecurities", "dematerialisedBearerSecurities", "physicalRegisteredSecurities", "dematerialisedRegisteredSecurities", "distributionPolicy", "dividendPolicy",
		"dividendFrequency", "reinvestmentFrequency", "frontEndLoad", "backEndLoad", "switchFee", "eUSavingsDirective"})
public class FinancialInstrument20 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PhysBrScties", required = true)
	protected YesNoIndicator physicalBearerSecurities;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmPhysicalBearerSecurities
	 * InvestmentFundClass.mmPhysicalBearerSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20
	 * FinancialInstrument20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysBrScties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalBearerSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicate whether or note it is possible to hold bearer units/shares in this class in certified form."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument20, YesNoIndicator> mmPhysicalBearerSecurities = new MMMessageAttribute<FinancialInstrument20, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmPhysicalBearerSecurities;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument20.mmObject();
			isDerived = false;
			xmlTag = "PhysBrScties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalBearerSecurities";
			definition = "Indicate whether or note it is possible to hold bearer units/shares in this class in certified form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(FinancialInstrument20 obj) {
			return obj.getPhysicalBearerSecurities();
		}

		@Override
		public void setValue(FinancialInstrument20 obj, YesNoIndicator value) {
			obj.setPhysicalBearerSecurities(value);
		}
	};
	@XmlElement(name = "DmtrlsdBrScties", required = true)
	protected YesNoIndicator dematerialisedBearerSecurities;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmDematerialisedBearerSecurities
	 * InvestmentFundClass.mmDematerialisedBearerSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20
	 * FinancialInstrument20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DmtrlsdBrScties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DematerialisedBearerSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicate whether or not it is possible to hold bearer units/shares in paperless form."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument20, YesNoIndicator> mmDematerialisedBearerSecurities = new MMMessageAttribute<FinancialInstrument20, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmDematerialisedBearerSecurities;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument20.mmObject();
			isDerived = false;
			xmlTag = "DmtrlsdBrScties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DematerialisedBearerSecurities";
			definition = "Indicate whether or not it is possible to hold bearer units/shares in paperless form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(FinancialInstrument20 obj) {
			return obj.getDematerialisedBearerSecurities();
		}

		@Override
		public void setValue(FinancialInstrument20 obj, YesNoIndicator value) {
			obj.setDematerialisedBearerSecurities(value);
		}
	};
	@XmlElement(name = "PhysRegdScties", required = true)
	protected YesNoIndicator physicalRegisteredSecurities;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmPhysicalRegisteredSecurities
	 * InvestmentFundClass.mmPhysicalRegisteredSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20
	 * FinancialInstrument20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysRegdScties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalRegisteredSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicate whether or not it is possible to hold registered units/shares in this class in paperless form."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument20, YesNoIndicator> mmPhysicalRegisteredSecurities = new MMMessageAttribute<FinancialInstrument20, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmPhysicalRegisteredSecurities;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument20.mmObject();
			isDerived = false;
			xmlTag = "PhysRegdScties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalRegisteredSecurities";
			definition = "Indicate whether or not it is possible to hold registered units/shares in this class in paperless form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(FinancialInstrument20 obj) {
			return obj.getPhysicalRegisteredSecurities();
		}

		@Override
		public void setValue(FinancialInstrument20 obj, YesNoIndicator value) {
			obj.setPhysicalRegisteredSecurities(value);
		}
	};
	@XmlElement(name = "DmtrlsdRegdScties", required = true)
	protected YesNoIndicator dematerialisedRegisteredSecurities;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmDematerialisedRegisteredSecurities
	 * InvestmentFundClass.mmDematerialisedRegisteredSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20
	 * FinancialInstrument20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DmtrlsdRegdScties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DematerialisedRegisteredSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicate whether or not it is possible to hold registered units/shares in this class in paperless form."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument20, YesNoIndicator> mmDematerialisedRegisteredSecurities = new MMMessageAttribute<FinancialInstrument20, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmDematerialisedRegisteredSecurities;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument20.mmObject();
			isDerived = false;
			xmlTag = "DmtrlsdRegdScties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DematerialisedRegisteredSecurities";
			definition = "Indicate whether or not it is possible to hold registered units/shares in this class in paperless form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(FinancialInstrument20 obj) {
			return obj.getDematerialisedRegisteredSecurities();
		}

		@Override
		public void setValue(FinancialInstrument20 obj, YesNoIndicator value) {
			obj.setDematerialisedRegisteredSecurities(value);
		}
	};
	@XmlElement(name = "DstrbtnPlcy", required = true)
	protected DistributionPolicy1Code distributionPolicy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionPolicy1Code
	 * DistributionPolicy1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmDistributionPolicy
	 * InvestmentFundClass.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20
	 * FinancialInstrument20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DstrbtnPlcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributionPolicy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Income policy relating to a class type, ie, if income is paid out or retained in the fund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument20, DistributionPolicy1Code> mmDistributionPolicy = new MMMessageAttribute<FinancialInstrument20, DistributionPolicy1Code>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmDistributionPolicy;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument20.mmObject();
			isDerived = false;
			xmlTag = "DstrbtnPlcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DistributionPolicy";
			definition = "Income policy relating to a class type, ie, if income is paid out or retained in the fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DistributionPolicy1Code.mmObject();
		}

		@Override
		public DistributionPolicy1Code getValue(FinancialInstrument20 obj) {
			return obj.getDistributionPolicy();
		}

		@Override
		public void setValue(FinancialInstrument20 obj, DistributionPolicy1Code value) {
			obj.setDistributionPolicy(value);
		}
	};
	@XmlElement(name = "DvddPlcy")
	protected DividendPolicy1Code dividendPolicy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DividendPolicy1Code
	 * DividendPolicy1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmDividendPolicy
	 * InvestmentFundClass.mmDividendPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20
	 * FinancialInstrument20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DvddPlcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPolicy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend policy of the fund, eg, cash, units."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument20, Optional<DividendPolicy1Code>> mmDividendPolicy = new MMMessageAttribute<FinancialInstrument20, Optional<DividendPolicy1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmDividendPolicy;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument20.mmObject();
			isDerived = false;
			xmlTag = "DvddPlcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPolicy";
			definition = "Dividend policy of the fund, eg, cash, units.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DividendPolicy1Code.mmObject();
		}

		@Override
		public Optional<DividendPolicy1Code> getValue(FinancialInstrument20 obj) {
			return obj.getDividendPolicy();
		}

		@Override
		public void setValue(FinancialInstrument20 obj, Optional<DividendPolicy1Code> value) {
			obj.setDividendPolicy(value.orElse(null));
		}
	};
	@XmlElement(name = "DvddFrqcy")
	protected EventFrequency5Code dividendFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency5Code
	 * EventFrequency5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmDividendFrequency
	 * Dividend.mmDividendFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20
	 * FinancialInstrument20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DvddFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Frequency with which the income is allocated to investors."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument20, Optional<EventFrequency5Code>> mmDividendFrequency = new MMMessageAttribute<FinancialInstrument20, Optional<EventFrequency5Code>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmDividendFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument20.mmObject();
			isDerived = false;
			xmlTag = "DvddFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendFrequency";
			definition = "Frequency with which the income is allocated to investors.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EventFrequency5Code.mmObject();
		}

		@Override
		public Optional<EventFrequency5Code> getValue(FinancialInstrument20 obj) {
			return obj.getDividendFrequency();
		}

		@Override
		public void setValue(FinancialInstrument20 obj, Optional<EventFrequency5Code> value) {
			obj.setDividendFrequency(value.orElse(null));
		}
	};
	@XmlElement(name = "RinvstmtFrqcy")
	protected EventFrequency5Code reinvestmentFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency5Code
	 * EventFrequency5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmReinvestmentFrequency
	 * InvestmentFundClassProcessingCharacteristics.mmReinvestmentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20
	 * FinancialInstrument20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RinvstmtFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Frequency with which the reinvestment takes place, This is the same or less than the dividend frequency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument20, Optional<EventFrequency5Code>> mmReinvestmentFrequency = new MMMessageAttribute<FinancialInstrument20, Optional<EventFrequency5Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmReinvestmentFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument20.mmObject();
			isDerived = false;
			xmlTag = "RinvstmtFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentFrequency";
			definition = "Frequency with which the reinvestment takes place, This is the same or less than the dividend frequency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EventFrequency5Code.mmObject();
		}

		@Override
		public Optional<EventFrequency5Code> getValue(FinancialInstrument20 obj) {
			return obj.getReinvestmentFrequency();
		}

		@Override
		public void setValue(FinancialInstrument20 obj, Optional<EventFrequency5Code> value) {
			obj.setReinvestmentFrequency(value.orElse(null));
		}
	};
	@XmlElement(name = "FrntEndLd", required = true)
	protected YesNoIndicator frontEndLoad;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmFrontEndLoadIndicator
	 * InvestmentFundClassProcessingCharacteristics.mmFrontEndLoadIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20
	 * FinancialInstrument20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrntEndLd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrontEndLoad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Front end charge on subscription orders for this class can be applied."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument20, YesNoIndicator> mmFrontEndLoad = new MMMessageAttribute<FinancialInstrument20, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmFrontEndLoadIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument20.mmObject();
			isDerived = false;
			xmlTag = "FrntEndLd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrontEndLoad";
			definition = "Front end charge on subscription orders for this class can be applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(FinancialInstrument20 obj) {
			return obj.getFrontEndLoad();
		}

		@Override
		public void setValue(FinancialInstrument20 obj, YesNoIndicator value) {
			obj.setFrontEndLoad(value);
		}
	};
	@XmlElement(name = "BckEndLd", required = true)
	protected YesNoIndicator backEndLoad;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmBackEndLoadIndicator
	 * InvestmentFundClassProcessingCharacteristics.mmBackEndLoadIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20
	 * FinancialInstrument20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BckEndLd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackEndLoad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exit charge (eg. CDSC) on redemption orders for this class can be applied."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument20, YesNoIndicator> mmBackEndLoad = new MMMessageAttribute<FinancialInstrument20, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmBackEndLoadIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument20.mmObject();
			isDerived = false;
			xmlTag = "BckEndLd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BackEndLoad";
			definition = "Exit charge (eg. CDSC) on redemption orders for this class can be applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(FinancialInstrument20 obj) {
			return obj.getBackEndLoad();
		}

		@Override
		public void setValue(FinancialInstrument20 obj, YesNoIndicator value) {
			obj.setBackEndLoad(value);
		}
	};
	@XmlElement(name = "SwtchFee", required = true)
	protected YesNoIndicator switchFee;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmSwitchingFeeIndicator
	 * InvestmentFundClassProcessingCharacteristics.mmSwitchingFeeIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20
	 * FinancialInstrument20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SwtchFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If a separate fee for switching between sub-funds of the same umbrella can be applied."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument20, YesNoIndicator> mmSwitchFee = new MMMessageAttribute<FinancialInstrument20, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmSwitchingFeeIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument20.mmObject();
			isDerived = false;
			xmlTag = "SwtchFee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchFee";
			definition = "If a separate fee for switching between sub-funds of the same umbrella can be applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(FinancialInstrument20 obj) {
			return obj.getSwitchFee();
		}

		@Override
		public void setValue(FinancialInstrument20 obj, YesNoIndicator value) {
			obj.setSwitchFee(value);
		}
	};
	@XmlElement(name = "EUSvgsDrctv", required = true)
	protected EUSavingsDirective1Code eUSavingsDirective;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EUSavingsDirective1Code
	 * EUSavingsDirective1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmEUSavingsDirective
	 * Security.mmEUSavingsDirective}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20
	 * FinancialInstrument20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EUSvgsDrctv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUSavingsDirective"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the investment fund class is subject to the European Union Saving Directive."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument20, EUSavingsDirective1Code> mmEUSavingsDirective = new MMMessageAttribute<FinancialInstrument20, EUSavingsDirective1Code>() {
		{
			businessElementTrace_lazy = () -> Security.mmEUSavingsDirective;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument20.mmObject();
			isDerived = false;
			xmlTag = "EUSvgsDrctv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUSavingsDirective";
			definition = "Indicates whether the investment fund class is subject to the European Union Saving Directive.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EUSavingsDirective1Code.mmObject();
		}

		@Override
		public EUSavingsDirective1Code getValue(FinancialInstrument20 obj) {
			return obj.getEUSavingsDirective();
		}

		@Override
		public void setValue(FinancialInstrument20 obj, EUSavingsDirective1Code value) {
			obj.setEUSavingsDirective(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument20.mmPhysicalBearerSecurities, com.tools20022.repository.msg.FinancialInstrument20.mmDematerialisedBearerSecurities,
						com.tools20022.repository.msg.FinancialInstrument20.mmPhysicalRegisteredSecurities, com.tools20022.repository.msg.FinancialInstrument20.mmDematerialisedRegisteredSecurities,
						com.tools20022.repository.msg.FinancialInstrument20.mmDistributionPolicy, com.tools20022.repository.msg.FinancialInstrument20.mmDividendPolicy,
						com.tools20022.repository.msg.FinancialInstrument20.mmDividendFrequency, com.tools20022.repository.msg.FinancialInstrument20.mmReinvestmentFrequency,
						com.tools20022.repository.msg.FinancialInstrument20.mmFrontEndLoad, com.tools20022.repository.msg.FinancialInstrument20.mmBackEndLoad, com.tools20022.repository.msg.FinancialInstrument20.mmSwitchFee,
						com.tools20022.repository.msg.FinancialInstrument20.mmEUSavingsDirective);
				trace_lazy = () -> InvestmentFundClass.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument20,
						com.tools20022.repository.constraints.ConstraintISINIdentificationRule.forFinancialInstrument20);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrument20";
				definition = "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, eg, dividend option or valuation currency.";
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getPhysicalBearerSecurities() {
		return physicalBearerSecurities;
	}

	public FinancialInstrument20 setPhysicalBearerSecurities(YesNoIndicator physicalBearerSecurities) {
		this.physicalBearerSecurities = Objects.requireNonNull(physicalBearerSecurities);
		return this;
	}

	public YesNoIndicator getDematerialisedBearerSecurities() {
		return dematerialisedBearerSecurities;
	}

	public FinancialInstrument20 setDematerialisedBearerSecurities(YesNoIndicator dematerialisedBearerSecurities) {
		this.dematerialisedBearerSecurities = Objects.requireNonNull(dematerialisedBearerSecurities);
		return this;
	}

	public YesNoIndicator getPhysicalRegisteredSecurities() {
		return physicalRegisteredSecurities;
	}

	public FinancialInstrument20 setPhysicalRegisteredSecurities(YesNoIndicator physicalRegisteredSecurities) {
		this.physicalRegisteredSecurities = Objects.requireNonNull(physicalRegisteredSecurities);
		return this;
	}

	public YesNoIndicator getDematerialisedRegisteredSecurities() {
		return dematerialisedRegisteredSecurities;
	}

	public FinancialInstrument20 setDematerialisedRegisteredSecurities(YesNoIndicator dematerialisedRegisteredSecurities) {
		this.dematerialisedRegisteredSecurities = Objects.requireNonNull(dematerialisedRegisteredSecurities);
		return this;
	}

	public DistributionPolicy1Code getDistributionPolicy() {
		return distributionPolicy;
	}

	public FinancialInstrument20 setDistributionPolicy(DistributionPolicy1Code distributionPolicy) {
		this.distributionPolicy = Objects.requireNonNull(distributionPolicy);
		return this;
	}

	public Optional<DividendPolicy1Code> getDividendPolicy() {
		return dividendPolicy == null ? Optional.empty() : Optional.of(dividendPolicy);
	}

	public FinancialInstrument20 setDividendPolicy(DividendPolicy1Code dividendPolicy) {
		this.dividendPolicy = dividendPolicy;
		return this;
	}

	public Optional<EventFrequency5Code> getDividendFrequency() {
		return dividendFrequency == null ? Optional.empty() : Optional.of(dividendFrequency);
	}

	public FinancialInstrument20 setDividendFrequency(EventFrequency5Code dividendFrequency) {
		this.dividendFrequency = dividendFrequency;
		return this;
	}

	public Optional<EventFrequency5Code> getReinvestmentFrequency() {
		return reinvestmentFrequency == null ? Optional.empty() : Optional.of(reinvestmentFrequency);
	}

	public FinancialInstrument20 setReinvestmentFrequency(EventFrequency5Code reinvestmentFrequency) {
		this.reinvestmentFrequency = reinvestmentFrequency;
		return this;
	}

	public YesNoIndicator getFrontEndLoad() {
		return frontEndLoad;
	}

	public FinancialInstrument20 setFrontEndLoad(YesNoIndicator frontEndLoad) {
		this.frontEndLoad = Objects.requireNonNull(frontEndLoad);
		return this;
	}

	public YesNoIndicator getBackEndLoad() {
		return backEndLoad;
	}

	public FinancialInstrument20 setBackEndLoad(YesNoIndicator backEndLoad) {
		this.backEndLoad = Objects.requireNonNull(backEndLoad);
		return this;
	}

	public YesNoIndicator getSwitchFee() {
		return switchFee;
	}

	public FinancialInstrument20 setSwitchFee(YesNoIndicator switchFee) {
		this.switchFee = Objects.requireNonNull(switchFee);
		return this;
	}

	public EUSavingsDirective1Code getEUSavingsDirective() {
		return eUSavingsDirective;
	}

	public FinancialInstrument20 setEUSavingsDirective(EUSavingsDirective1Code eUSavingsDirective) {
		this.eUSavingsDirective = Objects.requireNonNull(eUSavingsDirective);
		return this;
	}
}